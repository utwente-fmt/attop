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
 * Transformer from the AT metamodel to the ATE input format.
 */
public class UAT2ATE extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2ATE INSTANCE;
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2ATE instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2ATE();
		}
		return INSTANCE;
	}

	/** Constructor for the singleton instance of this transformer. */
	private UAT2ATE() {
		super(Arrays.asList(new Language[]{Language.UATS_BINARY, Language.UATV}), Arrays.asList(new Language[]{Language.ATE}));
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
		if (output != Language.ATE)
			throw new UnsupportedOperationException("UAT2ATE cannot produce " + output + " outputs");
		String outputFile = outputs.get(output);
		models.add(createPlainXmlModel(Language.ATE, Role.TARGET, outputFile));
		return models;
	}

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		ret.put(Language.ATE, "transformations/UAT2ATE.etl");
		return ret;
	}
}
