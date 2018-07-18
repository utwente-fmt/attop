package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import nl.utwente.ewi.fmt.UATMM.standalone.Language;

public class UppaalPlotter implements ITransformer
{
	private static UppaalPlotter INSTANCE = new UppaalPlotter();
	
	public static UppaalPlotter instance()
	{
		return INSTANCE;
	}
	
	private void writeHistogramFile(double nRuns, String line, BufferedWriter out) throws Exception
	{
		double min, max, width, current;
		line = line.substring(line.indexOf('[') + 1);
		int end = line.indexOf(',');
		min = Double.parseDouble(line.substring(0, end));
		line = line.substring(end + 1);
		end = line.indexOf(']');
		max = Double.parseDouble(line.substring(0, end));
		line = line.substring(line.indexOf("steps=") + 6);
		end = line.indexOf(':');
		if (!line.substring(0, end).equals("inf"))
			width = Double.parseDouble(line.substring(0, end));
		else
			width = max - min;
		line = line.substring(end + 2);
		String[] values = line.split(" ");
		
		current = min;
		int sum = 0;
		for (String v : values) {
			sum += Integer.parseInt(v);
			out.write(String.format("%s: %s %d\n", Double.toString(current), Double.toString(sum / nRuns), sum));
			current += width;
		}
	}
	
	@Override
	public Object execute(Map<String, Language> inputs,
			Map<Language, String> outputs) throws Exception
	{
		String resultFile = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UPPAAL_TEXT_RESULT)
				resultFile = e.getKey();
		}

		String outputFile = outputs.get(Language.UPPAAL_PLOT_RESULT);

		/* The searcher should ensure correct arguments. */
		assert(resultFile != null);
		assert(outputFile != null);
	
		FileInputStream rawInput = new FileInputStream(resultFile);
		BufferedReader r = new BufferedReader(new InputStreamReader(rawInput));

		File tmpFile = File.createTempFile("gnuplot_temp", ".values");
		tmpFile.deleteOnExit();
		BufferedWriter tmpOut = Files.newBufferedWriter(tmpFile.toPath());
	
		String line;
		int nRuns = 1;
		boolean isExpectation = false;
		int formulae = 0;
		while ((line = r.readLine()) != null) {
			if (line.matches("^\\(\\d+ runs\\).*")) {
				nRuns = line.indexOf(' ');
				nRuns = Integer.parseInt(line.substring(1, nRuns));
			}
			if (line.matches("^\\(\\d+ runs\\) E\\(.*")) {
				isExpectation = true;
				String value = line.substring(line.lastIndexOf(' ') + 1);
				if (formulae == 0)
					tmpOut.write("0: 0\n");
				tmpOut.write(String.format("%d: %s\n", ++formulae, value));
				System.err.format("%d: %s\n", formulae, value);
			}
			if (!isExpectation && line.startsWith("Values in [")) {
				writeHistogramFile(nRuns, line, tmpOut);
			}
		}

		tmpOut.close();
		r.close();
		
		ProcessBuilder bld = new ProcessBuilder("gnuplot");
		bld.redirectOutput(new File(outputFile));
		bld.redirectInput(ProcessBuilder.Redirect.PIPE);
		Process plotter = bld.start();
		
		OutputStream plotCommands = plotter.getOutputStream();
		if (outputFile.endsWith(".png")) {
			plotCommands.write("set terminal png\n".getBytes());
		} else if (outputFile.endsWith(".svg")) {
			plotCommands.write("set terminal svg\n".getBytes());
		} else {
			plotCommands.write("set terminal pdf\n".getBytes());
		}
		plotCommands.write("set ylabel 'Value'\n".getBytes());
		plotCommands.write("set xlabel 'Time'\n".getBytes());
		plotCommands.write(String.format("plot '%s' using 1:2 with lines title '%d runs'\n", tmpFile.toString(), nRuns).getBytes());
		plotCommands.close();
		
		while (plotter != null) {
			try {
				plotter.waitFor();
				plotter = null;
			} catch (InterruptedException e) {
			}
		}

		tmpFile.delete();
		return null;
	}

	@Override
	public Set<Language> getSourceLanguages()
	{
		return Collections.singleton(Language.UPPAAL_TEXT_RESULT);
	}

	@Override
	public Set<Language> getTargetLanguages()
	{
		return Collections.singleton(Language.UPPAAL_PLOT_RESULT);
	}

}
