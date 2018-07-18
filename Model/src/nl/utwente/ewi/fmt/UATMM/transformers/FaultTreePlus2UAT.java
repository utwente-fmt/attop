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

public class FaultTreePlus2UAT extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	public static final FaultTreePlus2UAT sINSTANCE;
	public static final FaultTreePlus2UAT vINSTANCE;
	
	static {
		sINSTANCE = new FaultTreePlus2UAT(Collections.singletonList(Language.FAULT_TREE_PLUS), Language.UATS);
		vINSTANCE = new FaultTreePlus2UAT(Arrays.asList(new Language[]{Language.FAULT_TREE_PLUS, Language.UATS}), Language.UATV);
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private FaultTreePlus2UAT(List<Language> source, Language target) {
		super(source, Collections.singletonList(target));
	}

	private FaultTreePlus2UAT(List<Language> source, List<Language> target) {
		super(source, target);
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
			if (e.getValue() == Language.FAULT_TREE_PLUS)
				models.add(createPlainXmlModel(e.getValue(), Role.SOURCE, e.getKey()));
			if (e.getValue() == Language.UATS)
				models.add(createEmfModel(e.getValue(),Role.SOURCE, e.getKey()));
		}

		models.add(createEmfModel(output, Role.TARGET, outputs.get(output)));
		return models;
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		if (outputs.size() == 1)
			return super.execute(inputs,  outputs);
		String structure_file = outputs.get(Language.UATS);
		sINSTANCE.execute(inputs, Collections.singletonMap(Language.UATS, structure_file));
		if (outputs.containsKey(Language.UATV)) {
			HashMap<String, Language> newInputs = new HashMap<String, Language>(inputs);
			newInputs.put(structure_file, Language.UATS);
			return vINSTANCE.execute(newInputs, Collections.singletonMap(Language.UATV, outputs.get(Language.UATV)));
		} else {
			return null;
		}
	}

	@Override
	public Map<Language, String> getTransformations() {
		Map<Language, String> ret = new HashMap<Language, String>();
		ret.put(Language.UATS, "transformations/FaultTreePlus2UATstructure.etl");
		ret.put(Language.UATV, "transformations/FaultTreePlus2UATvalues.etl");
		return ret;
	}
}
