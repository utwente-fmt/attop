package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

public class ATA2UAT extends EpsilonTransformer {
	/** The singleton instances of this transformer. */
	public static final ATA2UAT sINSTANCE;
	public static final ATA2UAT vINSTANCE;
	
	static {
		sINSTANCE = new ATA2UAT(Collections.singletonList(Language.ATA), Language.UATS);
		vINSTANCE = new ATA2UAT(Arrays.asList(new Language[]{Language.ATA, Language.UATS}), Language.UATV);
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private ATA2UAT(List<Language> inputs, Language output) {
		super(inputs, Collections.singletonList(output));
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output) throws EolModelLoadingException, URISyntaxException, IOException
	{
		HashSet<IModel> models = new HashSet<IModel>();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.ATA)
				models.add(createPlainXmlModel(e.getValue(), Role.SOURCE, e.getKey()));
			if (e.getValue() == Language.UATS)
				models.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
		}
		models.add(createEmfModel(output, Role.TARGET, outputs.get(output)));
		return models;
	}

	@Override
	public Map<Language, String> getTransformations() {
		Map<Language, String> ret = new HashMap<Language, String>();
		ret.put(Language.UATS, "transformations/ATA2UATstructure.etl");
		ret.put(Language.UATV, "transformations/ATA2UATvalues(ADToolDomains).etl");
		return ret;
	}
}