package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class NullTransformer implements ITransformer
{
	private final EnumSet<Language> languages;
	/** Constructs a transformed by chaining two existing transformers. */
	public NullTransformer(Set<Language> outputs)
	{
		languages = EnumSet.copyOf(outputs);
	}

	@Override
	public Set<Language> getSourceLanguages() {
		return EnumSet.copyOf(languages);
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return EnumSet.copyOf(languages);
	}
	
	public String toString()
	{
		return String.format("Null(%s)", languages);
	}
	
	public static void copyStream(InputStream i, OutputStream o) throws IOException
	{
		byte buffer[] = new byte[4096];
		int count;
		while ((count = i.read(buffer)) >= 0)
			o.write(buffer, 0, count);
	}

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		EnumSet<Language> remaining = EnumSet.copyOf(outputs.keySet());
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (!outputs.containsKey(e.getValue()))
				continue;
			if (!remaining.remove(e.getValue()))
				throw new IllegalArgumentException("NullTransformer asked for several same-languages inputs of type " + e.getValue());
			File outputFile = new File(outputs.get(e.getValue())).getAbsoluteFile();
			File inputFile = new File(e.getKey()).getAbsoluteFile();
			if (outputFile.equals(inputFile))
				continue;
			OutputStream out = new java.io.FileOutputStream(outputFile);
			InputStream in = new java.io.FileInputStream(outputFile);
			copyStream(in, out);
			out.close();
			in.close();
		}
		return null;
	}
	
	public Set<ITransformer> flatten()
	{
		return Collections.emptySet();
	}
}
