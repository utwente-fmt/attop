package nl.utwente.ewi.fmt.UATMM.transformers;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.regex.Pattern;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import nl.utwente.ewi.fmt.uppaalSMC.NSTA;
import nl.utwente.ewi.fmt.uppaalSMC.Serialization;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class Uppaal2XML implements ITransformer
{
	/** The singleton instance of this transformer. */
	private static Uppaal2XML INSTANCE;

	/** Returns the singleton instance of this transformer. */
	public static Uppaal2XML instance() {
		if (INSTANCE == null) {
			INSTANCE = new Uppaal2XML();
		}
		return INSTANCE;
	}
	
	public EnumSet<Language> getSourceLanguages()
	{
		return EnumSet.of(Language.UPPAAL);
	}
	
	public EnumSet<Language> getTargetLanguages()
	{
		return EnumSet.of(Language.UPPAAL_XML);
	}
	
	private static void convertToCora(String filename) throws java.io.IOException
	{
		java.io.LineNumberReader in = new java.io.LineNumberReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
		FileOutputStream out = new FileOutputStream(filename + ".tmp");
		String line;
		while ((line = in.readLine()) != null) {
			if (!Pattern.matches("int cost;", line)) {
				out.write(line.getBytes());
				out.write('\n');
			}
		}
		in.close();
		out.close();
		new File(filename + ".tmp").renameTo(new File(filename));
	}
	
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		ResourceSet rss = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		rss.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".xml", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		rss.getPackageRegistry().put(UppaalSMCPackage.eNS_PREFIX, UppaalSMCPackage.eINSTANCE);
		URI input = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UPPAAL) {
				if (input != null)
					throw new UnsupportedOperationException("Multiple Uppaal inputs for XML output not supported");
				input = URI.createFileURI(e.getKey());
			}
		}
		Resource res = rss.createResource(input);
		if (res == null)
			throw new java.io.FileNotFoundException(input + " not loaded");
		res = new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl().createResource(input);
		res.load(Collections.EMPTY_MAP);
		if (res.getErrors().size() > 0)
			System.err.println("Error: " + res.getErrors().get(0));
		Object o = res.getContents().get(0);
		CharSequence xml;
		if (o instanceof NSTA) {
			NSTA nta = (NSTA)o;
			Serialization s = new Serialization();
			xml = s.main(nta);
		} else {
			System.err.println(o.getClass());
			throw new IllegalArgumentException("Input model is not in proper Uppaal metamodel format");
		}
		FileOutputStream out = new FileOutputStream(outputs.get(Language.UPPAAL_XML));
		out.write(xml.toString().getBytes());
		out.close();

		/* Hack to make SMC work */
		if (UAT2Uppaal.USE_CORA)
			convertToCora(outputs.get(Language.UPPAAL_XML));
		return xml;
	}
	
	@Override
	public String toString()
	{
		return "Uppaal2XML";
	}
}