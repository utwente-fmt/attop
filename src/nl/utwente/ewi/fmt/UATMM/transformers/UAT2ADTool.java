package nl.utwente.ewi.fmt.UATMM.transformers;

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

/**
 * Transformer from the AT metamodel to the ADTool input format.
 * @author David Huistra
 */
public class UAT2ADTool extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2ADTool INSTANCE;
	private static UAT2ADTool BINARY_INSTANCE;
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2ADTool instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2ADTool();
		}
		return INSTANCE;
	}

	public static UAT2ADTool binaryInstance() {
		if (BINARY_INSTANCE == null) {
			BINARY_INSTANCE = new UAT2ADTool(true);
		}
		return BINARY_INSTANCE;
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private UAT2ADTool() {
		super(Arrays.asList(new Language[]{Language.UATS, Language.UATV}), Arrays.asList(new Language[]{Language.AD_TOOL}));
	}

	private UAT2ADTool(boolean _ign) {
		super(Arrays.asList(new Language[]{Language.UATS_BINARY, Language.UATV}), Arrays.asList(new Language[]{Language.AD_TOOL_BINARY}));
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
			if (e.getValue() == Language.UATS && inputs.containsValue(Language.UATS_BINARY)) {
				createEmfModel(Language.UATS, Role.SOURCE, e.getKey(), rset);
				continue;
			}
			if (e.getValue() == Language.UATS || e.getValue() == Language.UATS_BINARY) {
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
		if (output != Language.AD_TOOL && output != Language.AD_TOOL_BINARY)
			throw new UnsupportedOperationException("UAT2ADTool cannot produce " + output + " outputs");
		String outputFile = outputs.get(output);
		models.add(createPlainXmlModel(Language.AD_TOOL, Role.TARGET, outputFile));
		return models;
	}

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		ret.put(Language.AD_TOOL, "transformations/UAT2ADTool.etl");
		ret.put(Language.AD_TOOL_BINARY, "transformations/UAT2ADTool.etl");
		return ret;
	}
}
