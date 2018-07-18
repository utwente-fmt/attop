package nl.utwente.ewi.fmt.UATMM.transformers;
import java.util.Map;
import java.util.TreeSet;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import nl.utwente.ewi.fmt.UATMM.GalileoParser;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResourceImpl;


public class Galileo2UAT implements ITransformer
{
	/** The singleton instance of this transformer. */
	private static Galileo2UAT INSTANCE;

	/** Returns the singleton instance of this transformer. */
	public static Galileo2UAT instance() {
		if (INSTANCE == null) {
			INSTANCE = new Galileo2UAT();
		}
		return INSTANCE;
	}
	
	public TreeSet<Language> getSourceLanguages()
	{
		TreeSet<Language> out = new TreeSet<Language>();
		out.add(Language.GALILEO);
		return out;
	}
	
	public TreeSet<Language> getTargetLanguages()
	{
		TreeSet<Language> out = new TreeSet<Language>();
		out.add(Language.UATS);
		out.add(Language.UATV);
		return out;
	}
	
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		GalileoParser parser = new GalileoParser();
		GalileoParser.ParsedTree ret;
		String inputFile = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue().equals(Language.GALILEO))
				inputFile = e.getKey();
		}
		if (inputFile == null)
			throw new IllegalArgumentException("No galileo file input to Galileo transformer");
		System.out.format("Parsing %s (Galileo)\n", inputFile);
		ret = parser.parse(new java.io.FileInputStream(inputFile));

		String valueFile = outputs.get(Language.UATV), structureFile = outputs.get(Language.UATS);
		if (structureFile == null) {
			for (Map.Entry<String, Language> e : inputs.entrySet()) {
				if (e.getValue() == Language.UATS || e.getValue() == Language.UATS_BINARY) {
					structureFile = e.getKey();
					break;
				}
			}
		}
		if (outputs.containsKey(Language.UATS) || outputs.containsKey(Language.UATS_BINARY)) {
			Ecore2XMLResourceImpl res = new Ecore2XMLResourceImpl(URI.createFileURI(structureFile));
			res.getContents().add(ret.structure);
			res.save(new java.util.HashMap<String, Object>());
		}

		if (outputs.containsKey(Language.UATV)) {
			Ecore2XMLResourceImpl res = new Ecore2XMLResourceImpl(URI.createFileURI(valueFile));
			res.getContents().addAll(ret.value_domains);
			for (Domain d : ret.value_domains) {
				if (d.getPurpose() != null)
					res.getContents().add(d.getPurpose());
				if (d.getValueType() != null)
					res.getContents().add(d.getValueType());
			}
			res.save(new java.util.HashMap<String, Object>());
		}
		return null;
	}
	
	@Override
	public String toString()
	{
		return "GalileoParser";
	}
}