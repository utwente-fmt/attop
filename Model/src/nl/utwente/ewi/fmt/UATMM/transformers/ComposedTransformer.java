package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.File;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class ComposedTransformer implements ITransformer {
	public static boolean keepTemps = false;
	private final ITransformer first;
	private final ITransformer second;

	/** Constructs a transformed by chaining two existing transformers. */
	public ComposedTransformer(ITransformer first, ITransformer second) {
		EnumSet<Language> avails = EnumSet.copyOf(first.getTargetLanguages());
		avails.addAll(first.getSourceLanguages());
		assert avails.containsAll(second.getSourceLanguages());
		this.first = first;
		this.second = second;
	}
	
	public Set<Language> getOptionalSourceLanguages()
	{
		if (first.getOptionalSourceLanguages().isEmpty())
			return second.getOptionalSourceLanguages();
		else if (second.getOptionalSourceLanguages().isEmpty())
			return first.getOptionalSourceLanguages();
		EnumSet<Language> ret = EnumSet.noneOf(Language.class);
		ret.addAll(first.getOptionalSourceLanguages());
		ret.addAll(second.getOptionalSourceLanguages());
		return ret;
	}

	@Override
	public Set<Language> getSourceLanguages() {
		EnumSet<Language> ret = EnumSet.copyOf(second.getSourceLanguages());
		ret.removeAll(first.getTargetLanguages());
		ret.addAll(first.getSourceLanguages());
		return ret;
	}

	@Override
	public Set<Language> getTargetLanguages() {
		EnumSet<Language> ret = EnumSet.copyOf(second.getTargetLanguages());
		ret.addAll(first.getTargetLanguages());
		return ret;
	}
	
	public String toString() {
		return String.format("Seq{%s, %s}", first.toString(), second.toString());
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		EnumSet<Language> intermediates = EnumSet.copyOf(second.getSourceLanguages());
		intermediates.removeAll(first.getSourceLanguages());
		intermediates.removeAll(inputs.values());
		Set<Language> fromFirst = first.getTargetLanguages();
		intermediates.addAll(fromFirst);
		Map<Language, String> intermediateFiles = new HashMap<Language, String>();
		Map<String, Language> intermediateInputFiles = new HashMap<String, Language>();
		Map<Language, String> secondOutputs = new HashMap<Language, String>(outputs);
		/* Create temporary files */
		for (Language l : intermediates) {
			if (outputs.containsKey(l)) {
				intermediateFiles.put(l, outputs.get(l));
				intermediateInputFiles.put(outputs.get(l), l);
				secondOutputs.remove(l);
			} else {
				File f = null;
				if (keepTemps) {
					f = new File(l.getName() + ".xml");
					if (f.exists())
						f.delete();
					if (!f.createNewFile())
						f = null;
				}
				if (f == null) {
					f = File.createTempFile("IntermediateModel", ".xml");
					//f.deleteOnExit();
				}
				intermediateFiles.put(l, f.getPath());
				intermediateInputFiles.put(f.getPath(), l);
			}
		}
		intermediateInputFiles.putAll(inputs);

		first.execute(inputs, intermediateFiles);
		if (!second.validateInputs(intermediateInputFiles))
			throw new IllegalArgumentException("Validation error");
		return second.execute(intermediateInputFiles, secondOutputs);
	}
	
	public Set<ITransformer> flatten()
	{
		HashSet<ITransformer> ret = new HashSet<ITransformer>();
		ret.addAll(first.flatten());
		ret.addAll(second.flatten());
		return ret;
	}
}