package nl.utwente.ewi.fmt.UATMM;
import java.io.InputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Map;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.*;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.*;

public class GalileoParser {
	public class ParsedTree {
		public AttackTree structure;
		public Collection<Domain> value_domains;
	}
	private class Edge {
		Node source;
		Node target;
	}
	private HashMap<String, Node> nodes;
	private HashSet<Edge> edges; 
	private HashMap<String, Domain> domains;
	private HashSet<Attribute> attributes;
	private String toplevel;
	private double toplevel_costs[] = new double[2];
	private UATMM_structureFactory sFactory;
	private UATMM_valuesFactory vFactory;
	private Type realType;
	
	private KofN parseVotingType(String descr)
	{
		String parts[] = descr.split("of");
		KofN ret = sFactory.createKofN();
		int k = Integer.parseInt(parts[0]);
		ret.setThreshold(k);
		return ret;
	}
	
	private void parseBEattributes(Node node, String[] parts)
	{
		HashMap<String, String> attrs = new HashMap<String, String>();
		int phases = 1;
		for (int i = parts.length - 1; i > 0; i--) {
			String part = parts[i];
			if (i == parts.length - 1) {
				if (part.charAt(part.length() - 1) != ';')
					throw new IllegalArgumentException("Line does not end in ';'");
				part = part.substring(0, part.length() - 1);
			}
			String[] kv = part.split("=", 2);
			if (kv.length != 2) {
				System.err.format("Invalid BE attribute: %s\n", part);
				System.exit(1);
			}
			if (kv[0].equalsIgnoreCase("phases")) {
				phases = Integer.parseInt(kv[1]);
			} else {
				attrs.put(kv[0], kv[1]);
			}
		}
		if (attrs.containsKey("lambda")) {
			Domain dom;
			if (phases == 1) {
				dom = domains.get("lambda");
				if (dom == null) {
					dom = vFactory.createDomain();
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.EXPONENTIAL);
					dom.setPurpose(p);
					dom.setName("lambda");
					dom.setValueType(realType);
					domains.put(dom.getName(), dom);
				}
			} else {
				dom = domains.get("rates");
				if (dom == null) {
					dom = vFactory.createDomain();
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.HYPO_EXPONENTIAL);
					dom.setPurpose(p);
					dom.setName("rates");
					dom.setValueType(vFactory.createRealSequenceType());
					domains.put(dom.getName(), dom);
				}
			}
			Attribute attr = vFactory.createAttribute();
			dom.getAttributes().add(attr);
			attr.setNode(node);

			if (phases == 1) {
				RealValue  v = vFactory.createRealValue();
				v.setValue(Double.parseDouble(attrs.get("lambda")));
				attr.setValue(v);
			} else {
				RealSequenceValue v = vFactory.createRealSequenceValue();
				double l = Double.parseDouble(attrs.get("lambda"));
				while (phases-- > 0) {
					v.getSequence().add(Double.valueOf(l));
				}
				attr.setValue(v);
			}
			attributes.add(attr);
			attrs.remove("lambda");
		}
		
		for (Map.Entry<String, String> e : attrs.entrySet()) {
			Domain dom = domains.get(e.getKey());
			if (dom == null) {
				dom = vFactory.createDomain();
				if (e.getKey().equalsIgnoreCase("lambda")) {
				} else if (e.getKey().equalsIgnoreCase("mintime")) {
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.MINIMUM);
					dom.setPurpose(p);
				} else if (e.getKey().equalsIgnoreCase("maxtime")) {
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.MAXIMUM);
					dom.setPurpose(p);
				} else if (e.getKey().equalsIgnoreCase("prob")) {
					ProbabilityPurpose p = vFactory.createProbabilityPurpose();
					p.setProbType(ProbabilityType.COMPLETION);
					dom.setPurpose(p);
				} else if (e.getKey().equalsIgnoreCase("cost")) {
					CostPurpose p = vFactory.createCostPurpose();
					p.setCostType(CostType.ON_ACTIVATION);
					dom.setPurpose(p);;
				}
				dom.setName(e.getKey());
				dom.setValueType(realType);
				domains.put(e.getKey(), dom);
			}
			Attribute attr = vFactory.createAttribute();
			dom.getAttributes().add(attr);
			attr.setNode(node);
			RealValue v = vFactory.createRealValue();
			v.setValue(Double.parseDouble(e.getValue()));
			attr.setValue(v);
			attributes.add(attr);
		}
	}
	
	private boolean isBeTypeDescriptor(String[] parts)
	{
		for (int i = parts.length - 1; i > 0; i--) {
			String lc = parts[i].toLowerCase();
			if (lc.startsWith("phases="))
				continue;
			if (lc.startsWith("lambda="))
				continue;
			if (lc.startsWith("mintime="))
				continue;
			if (lc.startsWith("maxtime="))
				continue;
			if (lc.startsWith("dorm="))
				continue;
			if (lc.startsWith("cost="))
				continue;
			if (lc.startsWith("prob="))
				continue;
			return false;
		}
		return true;
	}
	
	private void parseChildren(Node parent, String[] children, int from)
	{
		System.err.println("Parsing" + Arrays.toString(children));
		int i;
		if (children[children.length - 1].trim().equals(";")) {
			children = Arrays.copyOf(children, children.length - 1);
			children[children.length - 1] = children[children.length - 1] + ";";
		}
		for (i = from; i < children.length; i++) {
			String child = children[i];
			Node childNode;
			Edge edge;
			if (i == children.length - 1) {
				if (child.charAt(child.length() - 1) != ';')
					throw new IllegalArgumentException("Line does not end in ';'");
				child = child.substring(0, child.length() - 1);
			}
			if (child.charAt(0) != '\"' || child.charAt(child.length() - 1) != '\"')
				throw new IllegalArgumentException("Children of gates need names delimited with double quotes: " + child);
			child = child.substring(1, child.length() - 1);
			childNode = nodes.get(child);
			if (childNode == null) {
				childNode = sFactory.createNode();
				childNode.setLabel(child);
				String id = child.replaceAll("_", "_-");
				id = id.replaceAll(" ", "__");
				childNode.setId(id);
				nodes.put(child, childNode);
			}
			edge = new Edge();
			edge.source = parent;
			edge.target = childNode;
			edges.add(edge);
			parent.getChildren().add(childNode);
		}
	}
	
	private static String[] splitLine(String input)
	{
		int loc = 0, max = input.length();
		ArrayList<String> ret = new ArrayList<String>();
		while (loc < max && Character.isWhitespace(input.charAt(loc)))
			loc++;
		while (loc < max) {
			int end = loc + 1;
			if (input.charAt(loc) != '"') {
				while (end < max && !Character.isWhitespace(input.charAt(end)))
					end++;
			} else {
				end = input.indexOf('"', loc + 1) + 1;
				if (end <= 0)
					end = input.length();
				while (end < max && !Character.isWhitespace(input.charAt(end)))
					end++;
			}
			ret.add(input.substring(loc, end));
			loc = end;
			while (loc < max && Character.isWhitespace(input.charAt(loc)))
				loc++;
		}
		return ret.toArray(new String[ret.size()]);
	}
	
	private void parseLine(Scanner input)
	{
		String line = input.nextLine();
		if (line.trim().length() == 0)
			return;
		String words[] = splitLine(line);
		if (words[0].equalsIgnoreCase("toplevel")) {
			if (toplevel != null)
				throw new IllegalArgumentException("Multiple toplevel declarations");
			if (words.length > 4)
				throw new IllegalArgumentException("Toplevel declaration has too many arguments");
			if (words[1].charAt(0) != '\"')
				throw new IllegalArgumentException("Toplevel declaration needs name");
			if (words[words.length - 1].charAt(words[words.length - 1].length() - 1) != ';')
				throw new IllegalArgumentException("Toplevel must end in semicolon.");
			words[words.length - 1] = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);
			toplevel = words[1].substring(1, words[1].length() - 1);
			if (words.length > 2)
				toplevel_costs[0] = Double.parseDouble(words[2]);
			if (words.length > 3)
				toplevel_costs[1] = Double.parseDouble(words[3]);
			return;
		}
		int firstChild = 2;
		if (words[0].charAt(0) == '\"' && words[0].charAt(words[0].length() - 1) == '\"') {
			String name = words[0].substring(1, words[0].length() - 1);
			Node newNode;
			newNode = nodes.get(name);
			if (newNode == null) {
				newNode = sFactory.createNode();
				newNode.setLabel(name);
				newNode.setId(name);
			}
			Connector type;
			switch (words[1].toLowerCase()) {
			case "and":
				type = sFactory.createAND();
				break;
			case "pand":
				type = sFactory.createPAND();
				break;
			case "sand":
				type = sFactory.createSAND();
				break;
			case "sor":
				type = sFactory.createSOR();
				break;
			case "or":
				type = sFactory.createOR();
				break;
			case "wsp": case "csp": //Warm and Cold spare gates
				type = sFactory.createSpare();
				break;
			case "rdep":
				type = sFactory.createRDEP();
				double factor = Double.parseDouble(words[2]);
				((RDEP)type).setFactor(factor);
				firstChild = 3;
				break;
			case "fdep":
				type = sFactory.createFDEP();
				break;
			default:
				if (words[1].toLowerCase().matches("\\d+of\\d+")) {
					type = parseVotingType(words[1]);
				} else if (isBeTypeDescriptor(words)) {
					newNode.setRole(RoleType.CONTRIBUTING);
					parseBEattributes(newNode, words);
					nodes.put(newNode.getId(), newNode);
					return;
				} else {
					throw new IllegalArgumentException("Unknown node type: " + words[1]);
				}
			}
			newNode.setConnector(type);
			newNode.setRole(RoleType.CONTRIBUTING);
			nodes.put(newNode.getId(), newNode);
			parseChildren(newNode, words, firstChild);
		}
	}
	
	private void fixLinks(AttackTree tree)
	{
		for (Edge e : edges) {
			e.target.getParents().add(e.source);
		}
	}
	
	private void attachTopCosts()
	{
		Node top = nodes.get(toplevel);
		if (toplevel_costs[0] != 0) {
			Domain dom = domains.get("cost");
			if (dom == null) {
				dom = vFactory.createDomain();
				CostPurpose p = vFactory.createCostPurpose();
				p.setCostType(CostType.ON_COMPLETION);
				dom.setPurpose(p);
				dom.setName("cost");
				dom.setValueType(realType);
				domains.put("cost", dom);
			}
			Attribute attr = vFactory.createAttribute();
			dom.getAttributes().add(attr);
			attr.setNode(top);
			RealValue v = vFactory.createRealValue();
			v.setValue(toplevel_costs[0]);
			attr.setValue(v);
			attributes.add(attr);
		}
		if (toplevel_costs[1] != 0) {
			Domain dom = domains.get("var_cost");
			if (dom == null) {
				dom = vFactory.createDomain();
				CostPurpose p = vFactory.createCostPurpose();
				p.setCostType(CostType.WHILE_COMPLETED);
				dom.setPurpose(p);
				dom.setName("var_cost");
				dom.setValueType(realType);
				domains.put("var_cost", dom);
			}
			Attribute attr = vFactory.createAttribute();
			dom.getAttributes().add(attr);
			attr.setNode(top);
			RealValue v = vFactory.createRealValue();
			v.setValue(toplevel_costs[1]);
			attr.setValue(v);
			attributes.add(attr);
		}
	}
	
	public ParsedTree parse (InputStream input)
	{
		Scanner scanner = new Scanner (input);
		sFactory = UATMM_structureFactory.eINSTANCE;
		vFactory = UATMM_valuesFactory.eINSTANCE;
		nodes = new HashMap<String, Node>();
		edges = new HashSet<Edge>(); 
		domains = new HashMap<String, Domain>();
		realType = vFactory.createRealType();
		this.attributes = new HashSet<Attribute>();
		while (scanner.hasNextLine())
			parseLine(scanner);
		attachTopCosts();
		Node top = nodes.get(toplevel);
		AttackTree tree = sFactory.createAttackTree();
		tree.setRoot(top);
		tree.getNodes().addAll(nodes.values());
		fixLinks(tree);
		ParsedTree ret = new ParsedTree();
		ret.structure = tree;
		ret.value_domains = domains.values();
		return ret;
	}
}
