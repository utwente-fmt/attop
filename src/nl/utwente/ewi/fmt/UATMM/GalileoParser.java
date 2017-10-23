package nl.utwente.ewi.fmt.UATMM;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
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
		for (int i = 1; i < parts.length; i++) {
			String s = parts[i];
			if (i == parts.length - 1) {
				if (s.charAt(s.length() - 1) != ';') {
					System.err.println("Warning: BE description does not end in semicolon");
				} else {
					s = s.substring(0, s.length() - 1);
				}
			}
			String[] kv = s.split("=", 2);
			if (kv.length != 2) {
				System.err.format("Invalid BE attribute: %s\n", s);
				System.exit(1);
			}
			Domain dom = domains.get(kv[0]);
			if (dom == null) {
				dom = vFactory.createDomain();
				if (kv[0].equalsIgnoreCase("lambda")) {
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.EXPONENTIAL);
					dom.setPurpose(p);
				} else if (kv[0].equalsIgnoreCase("mintime")) {
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.MINIMUM);
					dom.setPurpose(p);
				} else if (kv[0].equalsIgnoreCase("maxtime")) {
					TimePurpose p = vFactory.createTimePurpose();
					p.setTimeType(TimeType.MAXIMUM);
					dom.setPurpose(p);
				} else if (kv[0].equalsIgnoreCase("prob")) {
					ProbabilityPurpose p = vFactory.createProbabilityPurpose();
					p.setProbType(ProbabilityType.COMPLETION);
					dom.setPurpose(p);
				} else if (kv[0].equalsIgnoreCase("cost")) {
					CostPurpose p = vFactory.createCostPurpose();
					p.setCostType(CostType.ON_ACTIVATION);
					dom.setPurpose(p);;
				}
				dom.setName(kv[0]);
				dom.setValueType(realType);
				domains.put(kv[0], dom);
			}
			Attribute attr = vFactory.createAttribute();
			dom.getAttributes().add(attr);
			attr.setNode(node);
			RealValue v = vFactory.createRealValue();
			v.setValue(Double.parseDouble(kv[1]));
			attr.setValue(v);
			attributes.add(attr);
		}
	}
	
	private boolean isBeTypeDescriptor(String[] parts)
	{
		for (int i = parts.length - 1; i > 0; i--) {
			String lc = parts[i].toLowerCase();
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
	
	private void parseChildren(Node parent, String[] children)
	{
		System.err.println("Parsing" + Arrays.toString(children));
		int i;
		if (children[children.length - 1].trim().equals(";")) {
			children = Arrays.copyOf(children, children.length - 1);
			children[children.length - 1] = children[children.length - 1] + ";";
		}
		for (i = 2; i < children.length; i++) {
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
				childNode.setId(child);
				nodes.put(child, childNode);
			}
			edge = new Edge();
			edge.source = parent;
			edge.target = childNode;
			edges.add(edge);
			parent.getChildren().add(childNode);
		}
	}

	private void parseLine(Scanner input)
	{
		String line = input.nextLine();
		if (line.trim().length() == 0)
			return;
		String words[] = line.trim().split("\\s+");
		if (words[0].equalsIgnoreCase("toplevel")) {
			if (toplevel != null)
				throw new IllegalArgumentException("Multiple toplevel declarations");
			if (words.length > 2)
				throw new IllegalArgumentException("Toplevel declaration has too many arguments");
			if (words[1].charAt(0) != '\"' || !words[1].endsWith("\";"))
				throw new IllegalArgumentException("Toplevel declaration needs name");
			toplevel = words[1].substring(1, words[1].length() - 2);
			return;
		}
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
			parseChildren(newNode, words);
		}
	}
	
	private void fixLinks(AttackTree tree)
	{
		for (Edge e : edges) {
			e.target.getParents().add(e.source);
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