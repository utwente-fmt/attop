package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

public class UAT2Uppaal extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2Uppaal INSTANCE;
	public static boolean USE_CORA = false;
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2Uppaal instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2Uppaal();
		}
		return INSTANCE;
	}

	/** Constructor for the singleton instance of this transformer. */
	private UAT2Uppaal() {
		super(Arrays.asList(new Language[]{Language.UATS, Language.UATV}), Arrays.asList(new Language[]{Language.UPPAAL}));
	}
	
	@Override
	public Set<Language> getOptionalSourceLanguages()
	{
		return Collections.singleton(Language.UATM);
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException
	{
		HashSet<IModel> models = new HashSet<IModel>();
		boolean haveStructure = false, haveMaintenance = false;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UATS || e.getValue() == Language.UATS_BINARY) {
				models.add(createEmfModel(Language.UATS, Role.SOURCE, e.getKey()));
				if (haveStructure) {
					throw new UnsupportedOperationException("Multiple structure inputs");
				}
				haveStructure = true;
			} else if (e.getValue() == Language.UATV) {
				models.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
			} else if (e.getValue() == Language.UATM) {
				models.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
				haveMaintenance = true;
			}
		}
		if (!haveMaintenance) {
			/* Construct an empty model as a blank maintenance policy */
			ResourceImpl res = new ResourceImpl();
			InMemoryEmfModel m = new InMemoryEmfModel(Language.UATM.getName(), res);
			models.add(m);
		}
		if (!haveStructure)
			throw new UnsupportedOperationException("No UAT structure model provided");
		if (outputs.size() > 1)
			throw new UnsupportedOperationException("More than one output requested");
		if (output != Language.UPPAAL)
			throw new UnsupportedOperationException("UAT2Uppaal cannot produce " + output + " outputs");
		models.add(createEmfModel(Language.UPPAAL, Role.TARGET, outputs.get(Language.UPPAAL)));
		return models;
	}

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		ret.put(Language.UPPAAL, "transformations/FullModel/UATMM2Uppaal.etl");
		return ret;
	}
}
