package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.EmptyModel;
import org.eclipse.epsilon.eol.models.IModel;

public class UAT2NuSMV extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2NuSMV INSTANCE;
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2NuSMV instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2NuSMV();
		}
		return INSTANCE;
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private UAT2NuSMV() {
		super(Arrays.asList(new Language[]{Language.UATS, Language.UATV}), Arrays.asList(new Language[]{Language.NUSMV, Language.NUSMV_PROBS}));
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}
	
	@Override
	public Set<Language> getOptionalSourceLanguages()
	{
		return Collections.singleton(Language.UATM);
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException {
		// EGL transformation does not have output model, only generated output
		boolean haveUATM = false;
		HashSet<IModel> out = new HashSet<IModel>();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UATS || e.getValue() == Language.UATV)
				out.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
			if (e.getValue() == Language.UATM) {
				out.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
				haveUATM = true;
			}
		}
		if (!haveUATM) {
			IModel e = new EmptyModel();
			e.setName(Language.UATM.getName());
			out.add(e);
		}
		return out;
	}

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		ret.put(Language.NUSMV, "transformations/UAT2NuSMV.egl");
		ret.put(Language.NUSMV_PROBS, "transformations/UAT2NuSMV_values.egl");
		return ret;
	}

	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		String outputPath = outputs.get(Language.NUSMV);
		if (outputPath != null) {
			Map<Language, String> tmpOut = Collections.singletonMap(Language.NUSMV, outputs.get(Language.NUSMV));
			Object result = super.execute(inputs, tmpOut);
			try (FileOutputStream output = new FileOutputStream(outputPath)) {
				output.write(result.toString().getBytes());
			}
		}
		
		outputPath = outputs.get(Language.NUSMV_PROBS);
		if (outputPath != null) {
			Map<Language, String> tmpOut = Collections.singletonMap(Language.NUSMV_PROBS, outputs.get(Language.NUSMV_PROBS));
			Object result = super.execute(inputs, tmpOut);
			try (FileOutputStream output = new FileOutputStream(outputPath)) {
				output.write(result.toString().getBytes());
			}
		}
		return null;
	}
}