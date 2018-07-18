package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import java.util.HashSet;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

public class UAT2FaultTreePlus extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2FaultTreePlus INSTANCE;
	private static final String schemaFile = "FaultTreePlusSchema.xsd";
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2FaultTreePlus instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2FaultTreePlus();
		}
		return INSTANCE;
	}

	/** Constructor for the singleton instance of this transformer. */
	private UAT2FaultTreePlus() {
		super(Arrays.asList(new Language[]{Language.UATS, Language.UATV}), Arrays.asList(new Language[]{Language.FAULT_TREE_PLUS}));
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, java.io.IOException
	{
		HashSet<IModel> models = new HashSet<IModel>();
		boolean haveStructure = false;
		ResourceSet rset = getResourceSet();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UATS || e.getValue() == Language.UATS) {
				models.add(createEmfModel(Language.UATS, Role.SOURCE, e.getKey(), rset));
				if (haveStructure) {
					throw new UnsupportedOperationException("Multiple structure inputs");
				}
				haveStructure = true;
			} else if (e.getValue() == Language.UATV) {
				models.add(createEmfModel(Language.UATV, Role.SOURCE, e.getKey(), rset));
			}
		}
		if (!haveStructure)
			throw new UnsupportedOperationException("No UAT structure model provided");
		if (outputs.size() > 1)
			throw new UnsupportedOperationException("More than one output requested");
		if (output != Language.FAULT_TREE_PLUS)
			throw new UnsupportedOperationException("UAT2FaultTreePlus cannot produce " + output + " outputs");
		String outputFile = outputs.get(output);
		models.add(createPlainXmlModel(Language.FAULT_TREE_PLUS, Role.TARGET, outputFile));
		return models;
	}

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		ret.put(Language.FAULT_TREE_PLUS, "transformations/UAT2FaultTreePlus.etl");
		return ret;
	}

	private static void insertSchema(String filename) throws Exception
	{
		java.io.LineNumberReader in = new java.io.LineNumberReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
		FileOutputStream out = new FileOutputStream(filename + ".tmp");
		InputStream schema = UAT2FaultTreePlus.class.getClassLoader().getResourceAsStream(schemaFile);
		String line;
		while ((line = in.readLine()) != null) {
			out.write(line.getBytes());
			out.write('\n');
			if (schema != null && line.equals("<XMLDataSet>")) {
				byte buf[] = new byte[4096];
				int len;
				while ( (len = schema.read(buf)) > 0)
					out.write(buf, 0, len);
				schema.close();
				schema = null;
			}
		}
		in.close();
		out.close();
		new File(filename + ".tmp").renameTo(new File(filename));
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		super.execute(inputs, outputs);
		String filename = outputs.get(Language.FAULT_TREE_PLUS);
		insertSchema(filename);
		
		return null;
	}
}