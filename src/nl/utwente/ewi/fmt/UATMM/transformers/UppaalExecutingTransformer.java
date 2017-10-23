package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class UppaalExecutingTransformer implements ITransformer
{
	private static final String[] POSSIBLE_UPPAAL_LOCATIONS = new String[] {
		"/home/enno/twente/Uppaal/uppaal64-4.1.19/bin-Linux/verifyta",
		"/home/ruijtersejj/uppaal64-4.1.19/bin-Linux/verifyta",
		"/local/schivos/Programmi/uppaal64-4.1.19/bin-Linux/verifyta",
		"./verifyta"
	};
	private static final String[] POSSIBLE_UPPAAL_CORA_LOCATIONS = new String[] {
			"/home/enno/twente/Uppaal/uppaal-cora-060910/bin-Linux/verifyta",
			"./verifyfa"
	};
	private static String UPPAAL_COMMAND;
	private static UppaalExecutingTransformer INSTANCE = new UppaalExecutingTransformer();
	
	private static void lookup_uppaal_path()
	{
		String good_command = "verifyta"; /* Worst-case fallback: rely on user's PATH */
		String[] options = POSSIBLE_UPPAAL_LOCATIONS;
		if (UAT2Uppaal.USE_CORA) {
			options = POSSIBLE_UPPAAL_CORA_LOCATIONS;
			System.err.println("Using UPPAAL CORA");
		}
		for (String s : options) {
			File f = new File(s);
			if (f.canExecute()) {
				good_command = s;
				break;
			}
		}
		UPPAAL_COMMAND = good_command;
	}

	public static UppaalExecutingTransformer instance()
	{
		return INSTANCE;
	}
	
	private static String[] readOptions(String filename) throws java.io.IOException
	{
		byte data[] = new byte[4096];
		FileInputStream in = new FileInputStream(filename);
		in.read(data);
		in.close();
		return new String(data).split("(\\s+|\0)");
	}

	@Override
	public Object execute(Map<String, Language> inputs,
			Map<Language, String> outputs) throws Exception
	{
		TreeSet<String> models = new TreeSet<String>();
		TreeSet<String> queries = new TreeSet<String>();
		lookup_uppaal_path();
		String options[] = new String[]{UPPAAL_COMMAND, null, null};
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UPPAAL_XML)
				models.add(e.getKey());
			else if (e.getValue() == Language.UPPAAL_TEXT_QUERY)
				queries.add(e.getKey());
			else if (e.getValue() == Language.UPPAAL_OPTIONS) {
				String newOptions[] = readOptions(e.getKey());
				String tmp[] = new String[options.length + newOptions.length];
				/* Last 2 entries of options array are reserved for model and query */
				System.arraycopy(options, 0, tmp, 0, options.length - 2);
				System.arraycopy(newOptions, 0, tmp, options.length - 2, newOptions.length);
				options = tmp;
			}
		}

		assert(!models.isEmpty() && !queries.isEmpty()); /* Should be enforced by transformation search */
		assert(outputs.get(Language.UPPAAL_TEXT_RESULT) != null);
		
		File outputFile = new File(outputs.get(Language.UPPAAL_TEXT_RESULT));
		if (!outputFile.createNewFile()) {
			//throw new UnsupportedOperationException("Uppaal result file already exists");
			outputFile.delete();
			outputFile.createNewFile();
		}
		FileOutputStream outStr = new FileOutputStream(outputFile, true);
		for (String model : models) {
			if (models.size() > 1)
				outStr.write(String.format("Model %s\n", model).getBytes());
			for (String query : queries) {
				if (queries.size() > 1)
					outStr.write(String.format("Query file %s\n", query).getBytes());
				outStr.flush();
				options[options.length - 2] = model;
				options[options.length - 1] = query;
				System.out.println("Running uppaal command: " + Arrays.deepToString(options));
				ProcessBuilder uppaalProcessBuilder = new ProcessBuilder(options);
				/* Redirect errors to console for users to see */
				uppaalProcessBuilder.redirectError(ProcessBuilder.Redirect.appendTo(outputFile)); //ProcessBuilder.Redirect.INHERIT);
				uppaalProcessBuilder.redirectOutput(ProcessBuilder.Redirect.appendTo(outputFile));
				Process uppaalProc = uppaalProcessBuilder.start();
				if (uppaalProc.waitFor() != 0) {
					outStr.close();
					throw new Exception("Uppaal process has terminated with error. See " + outputFile.getAbsolutePath() + " for details.");
				}
				System.out.println("Done.");
			}
		}
		outStr.close();

		return null;
	}

	@Override
	public Set<Language> getSourceLanguages()
	{
		return EnumSet.of(Language.UPPAAL_XML, Language.UPPAAL_TEXT_QUERY);
	}

	@Override
	public Set<Language> getTargetLanguages()
	{
		return EnumSet.of(Language.UPPAAL_TEXT_RESULT);
	}

}
