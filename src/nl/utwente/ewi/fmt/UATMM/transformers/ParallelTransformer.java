package nl.utwente.ewi.fmt.UATMM.transformers;

import java.util.EnumSet;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class ParallelTransformer implements ITransformer {
	private final Set<ITransformer> transformers;
	private final Set<Language> sources;
	private final Set<Language> targets;

	/** Constructs a transformer by performing multiple transformations in parallel */
	public ParallelTransformer() {
		transformers = new HashSet<ITransformer>();
		sources = EnumSet.noneOf(Language.class);
		targets = EnumSet.noneOf(Language.class);
	}

	public ParallelTransformer(ITransformer t1, ITransformer t2) {
		this();
		addTransformer(t1);
		addTransformer(t2);
	}

	@Override
	public Set<Language> getSourceLanguages() {
		return EnumSet.copyOf(sources);
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return EnumSet.copyOf(targets);
	}
	
	public String toString()
	{
		boolean first = true;
		StringBuilder b = new StringBuilder();
		b.append("Par{");
		for (ITransformer t : transformers) {
			if (!first)
				b.append(", ");
			b.append(t.toString());
			first = false;
		}
		return b.append('}').toString();
	}
	
	public void addTransformer(ITransformer t)
	{
		if (t instanceof ParallelTransformer) {
			ParallelTransformer pt = (ParallelTransformer) t;
			transformers.addAll(pt.transformers);
			sources.addAll(pt.sources);
			targets.addAll(pt.targets);
		} else {
			transformers.add(t);
			sources.addAll(t.getSourceLanguages());
			targets.addAll(t.getTargetLanguages());
		}
	}
	
	public boolean validateInputs(Map<String, Language> inputs) throws Exception
	{
		for (ITransformer t : transformers) {
			if (!t.validateInputs(inputs))
				return false;
		}
		return true;
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		EnumMap<Language, String> remainingOutputs = new EnumMap<Language, String>(outputs);
		EnumMap<Language, String> singleOutputs = new EnumMap<Language, String>(Language.class);
		for (ITransformer t : transformers) {
			singleOutputs.clear();
			for (Language l : t.getTargetLanguages()) {
				String file = remainingOutputs.remove(l);
				if (file != null)
					singleOutputs.put(l, file);
			}
			if (!singleOutputs.isEmpty())
				t.execute(inputs, singleOutputs);
		}
		if (!remainingOutputs.isEmpty())
			throw new UnsupportedOperationException("Parallel transformation cannot produce all required outputs");
		return null;
	}
	
	public Set<ITransformer> flatten()
	{
		HashSet<ITransformer> ret = new HashSet<ITransformer>();
		for (ITransformer t : transformers) {
			ret.addAll(t.flatten());
		}
		return ret;
	}
}