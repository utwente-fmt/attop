package nl.utwente.ewi.fmt.UATMM.transformers;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import nl.utwente.ewi.fmt.UATMM.UATM_parser;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResourceImpl;


public class Maintenance2UAT implements ITransformer
{
	/** The singleton instance of this transformer. */
	private static Maintenance2UAT INSTANCE;

	/** Returns the singleton instance of this transformer. */
	public static Maintenance2UAT instance() {
		if (INSTANCE == null) {
			INSTANCE = new Maintenance2UAT();
		}
		return INSTANCE;
	}
	
	public TreeSet<Language> getSourceLanguages()
	{
		TreeSet<Language> out = new TreeSet<Language>();
		out.add(Language.AFT_MAINTENANCE);
		out.add(Language.UATS);
		return out;
	}
	
	public Set<Language> getTargetLanguages()
	{
		return Collections.singleton(Language.UATM);
	}
	
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		AttackTree tree = null;
		ResourceSet rss = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		rss.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".xml", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		rss.getPackageRegistry().put(UATMM_structurePackage.eNS_PREFIX, UATMM_structurePackage.eINSTANCE);
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue().equals(Language.UATS)) {
				Resource res = rss.getResource(URI.createFileURI(e.getKey()), true);
				Object o = res.getContents().get(0);
				if (!(o instanceof AttackTree)) {
					System.err.println("Attack tree structure input does not contain an attack tree.");
					return null;
				}
				tree = (AttackTree)o;
			}
		}
		UATM_parser parser = new UATM_parser(tree);
		String inputFile = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue().equals(Language.AFT_MAINTENANCE))
				inputFile = e.getKey();
		}
		if (inputFile == null)
			throw new IllegalArgumentException("No maintenance file input to UATM transformer");
		System.out.format("Parsing %s (Maintenance)\n", inputFile);
		MaintenancePolicy ret = parser.parse(new java.io.FileInputStream(inputFile));

		String outputFile = outputs.get(Language.UATM);
		if (outputFile == null) {
			for (Map.Entry<String, Language> e : inputs.entrySet()) {
				if (e.getValue() == Language.UATM) {
					outputFile = e.getKey();
					break;
				}
			}
		}
		Ecore2XMLResourceImpl res = new Ecore2XMLResourceImpl(URI.createFileURI(outputFile));
		res.getContents().add(ret);
		res.save(new java.util.HashMap<String, Object>());

		return ret;
	}
	
	@Override
	public String toString()
	{
		return "MaintenanceParser";
	}
}