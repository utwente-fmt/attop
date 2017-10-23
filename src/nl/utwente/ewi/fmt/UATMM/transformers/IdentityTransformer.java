package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.File;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class IdentityTransformer implements ITransformer
{
	private final Language input;
	private final Language output;

	public IdentityTransformer(Language input, Language output)
	{
		this.input = input;
		this.output = output;
	}

	@Override
	public Set<Language> getSourceLanguages() {
		return EnumSet.of(input);
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return EnumSet.of(output);
	}
	
	public String toString()
	{
		return String.format("ID(%s -> %s)", input, output);
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		boolean done = false;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == input && done)
				throw new IllegalArgumentException("IdentityTransformer asked for several same-languages inputs");
			if (e.getValue() != input)
				continue;
			File outputFile = new File(outputs.get(output)).getAbsoluteFile();
			File inputFile = new File(e.getKey()).getAbsoluteFile();
			if (outputFile.equals(inputFile))
				continue;
			java.io.OutputStream out = new java.io.FileOutputStream(outputFile);
			java.io.InputStream in = new java.io.FileInputStream(outputFile);
			NullTransformer.copyStream(in,  out);
			out.close();
			in.close();
		}
		return null;
	}
}