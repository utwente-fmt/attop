package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class UppaalTrace2Schedule extends EpsilonTransformer {

	/** The singleton instance of this transformer. */
	private static UppaalTrace2Schedule INSTANCE;

	/** Returns the singleton instance of this transformer. */
	public static UppaalTrace2Schedule instance() {
		if (INSTANCE == null) {
			INSTANCE = new UppaalTrace2Schedule();
		}
		return INSTANCE;
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private UppaalTrace2Schedule() {
		super(Arrays.asList(new Language[]{Language.UPPAAL, Language.UPPAAL_TRACE}), Arrays.asList(new Language[]{Language.SCHEDULE}));
	}
	
	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException {
		HashSet<IModel> models = new HashSet<IModel>();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UPPAAL) {
				models.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
			} else if (e.getValue() == Language.UPPAAL_TRACE) {
				models.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
			}
		}
		if (outputs.size() > 1)
			throw new UnsupportedOperationException("More than one output requested");
		if (output != Language.SCHEDULE)
			throw new UnsupportedOperationException("Trace2Schedule cannot produce " + output + " outputs");
		models.add(createEmfModel(Language.SCHEDULE, Role.TARGET, outputs.get(Language.SCHEDULE)));
		return models;
		
		/*
		ResourceSet rss = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		rss.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".xml", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		rss.getPackageRegistry().put(UppaalPackage.eNS_PREFIX, UppaalPackage.eINSTANCE);
		String inputUPPAALmodel = null;
		String traceModel = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UPPAAL) {
				if (inputUPPAALmodel != null)
					throw new UnsupportedOperationException("Multiple Uppaal reference models not supported");
				inputUPPAALmodel = e.getKey();
			}
			if (e.getValue() == Language.UPPAAL_TRACE) {
				if (traceModel != null) {
					throw new UnsupportedOperationException("Multiple Uppaal traces not supported");
				}
				traceModel = e.getKey();
			}
		}
		
		return null;*/
	}
	

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		ret.put(Language.SCHEDULE, "/local/schivos/git/AFTModel_complete/Trace_schedule/UMMAAL_trace_schedule/transformations/atTrace2ScheduleTransformation/atTrace2ScheduleTransformation.etl");
		return ret;
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	
}
