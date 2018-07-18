package nl.utwente.ewi.fmt.UATMM.transformers;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class WithOptionalTransformer implements ITransformer
{
	private final ITransformer base;
	private final EnumSet<Language> inputs;

	/** Construct a transformer that executes the transformation of base, requiring
	 * the specified optional sources.
	 * @param base The transformer to execute.
	 * @param optionals The set of optional languages to require.
	 */
	public WithOptionalTransformer(ITransformer base, Set<Language> optionals)
	{
		this.base = base;
		inputs = EnumSet.copyOf(optionals);
		inputs.addAll(base.getSourceLanguages());
	}

	@Override
	public Set<Language> getSourceLanguages() {
		return inputs;
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return base.getTargetLanguages();
	}
	
	public boolean validateInputs(Map<String, Language> inputs) throws Exception
	{
		return base.validateInputs(inputs);
	}
	
	public String toString()
	{
		EnumSet<Language> options = EnumSet.copyOf(inputs);
		options.removeAll(base.getSourceLanguages());
		return String.format("%s with optional inputs %s", base.toString(), options);
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		return base.execute(inputs, outputs);
	}
}