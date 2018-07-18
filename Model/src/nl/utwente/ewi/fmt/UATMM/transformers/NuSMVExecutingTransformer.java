package nl.utwente.ewi.fmt.UATMM.transformers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import java.io.IOException;

public class NuSMVExecutingTransformer implements ITransformer
{
	private static final String paths[] = new String[] {
		"/home/enno/Trento/sigref++/Model2IMC/bin/",
		"/home/enno/Trento/sigref++/tools/"
	};
	private static final String NuSMV_PROG="NuSMV_linux64";
	private static final String MODEL2IMC_PROG="model2imc-linux64";

	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		String smvFile = null;
		String probFile = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.NUSMV)
				smvFile = e.getKey();
			if (e.getValue() == Language.NUSMV_PROBS)
				probFile = e.getKey();
		}
		if (smvFile == null || probFile == null)
			throw new IllegalArgumentException("NuSMV execution requires SMV and rates file.");

		File labelFile = File.createTempFile("AFT_NuSMV", ".lab");
		if (!ComposedTransformer.keepTemps)
			labelFile.deleteOnExit();
		try (FileOutputStream labOut = new FileOutputStream(labelFile)) {
			labOut.write("failed : toplevel.failed;\n".getBytes());
		}
		File xmlFile = File.createTempFile("AFT_NuSMV", ".xml");
		if (!ComposedTransformer.keepTemps)
			xmlFile.deleteOnExit();
		File cleanXmlFile = File.createTempFile("AFT_NuSMV_clean", ".xml");
		if (!ComposedTransformer.keepTemps)
			cleanXmlFile.deleteOnExit();

		long startTime = System.nanoTime();
		makeXML(smvFile, probFile, labelFile, xmlFile);
		long xmlTime = System.nanoTime();
		System.out.format("Generation time: %f sec.\n", (double)(xmlTime - startTime) / 1e9);
		cleanupXML(xmlFile, cleanXmlFile);
		startTime = System.nanoTime();
		minimize(cleanXmlFile, false);
		long minTime = System.nanoTime();
		System.out.format("Numeric minimization time: %f sec.\n", (double)(minTime - startTime) / 1e9);
		File tmp = new File("model2imc_0.ma");
		System.err.println("Renaming to " + outputs.get(Language.STORM_IMC));
		if (!tmp.renameTo(new File(outputs.get(Language.STORM_IMC)))) {
			try (FileInputStream in = new FileInputStream(tmp)) {
				try (FileOutputStream out = new FileOutputStream(outputs.get(Language.STORM_IMC))) {
					byte[] buf = new byte[4096];
					int bytes;
					while ((bytes = in.read(buf)) > 0)
						out.write(buf, 0, bytes);
					tmp.delete();
				}
			}
		}
		return null;
	}
	
	private static int makeXML(String smv, String probs, File lab, File outFile) throws IOException
	{
		String prog = NuSMV_PROG;
		for (String p : paths) {
			File possible = new File(p);
			possible = new File(possible, NuSMV_PROG);
			if (possible.exists())
				prog = possible.getCanonicalPath();
		}
		ProcessBuilder bld = new ProcessBuilder(new String[]{prog, "-int", "-dynamic"});
		bld.redirectInput(ProcessBuilder.Redirect.PIPE);
		bld.redirectError(ProcessBuilder.Redirect.INHERIT);
		Process p = bld.start();
		OutputStream cmds = p.getOutputStream();
		cmds.write(("set input_file \"" + smv + "\"\n").getBytes());
		cmds.write("set on_failure_script_quits\n".getBytes());
		cmds.write("go\n".getBytes());
		cmds.write(("compass_gen_sigref -b -i " + probs + " -a " + lab.getPath() + " -o " + outFile.getPath() + "\n").getBytes());
		cmds.write("quit -x\n".getBytes());
		cmds.close();
		int retCode;
		while (true) {
			try {
				retCode = p.waitFor();
				break;
			} catch (InterruptedException e) {
			}
		}
		if (retCode != 0) {
			System.err.println("Conversion to XML failed with error code " + retCode);
			return -1;
		}
		return 0;
	}
	
	private static int minimize(File xmlFile, boolean makeDot) throws IOException
	{
		File recordsFile = File.createTempFile("symbred", ".rec", new File("."));
		recordsFile.deleteOnExit();
		File resultsFile = File.createTempFile("symbred", ".res", new File("."));
		resultsFile.deleteOnExit();
		FileOutputStream out = new FileOutputStream(recordsFile);
		out.write("#TYPE\n".getBytes());
		out.write("SMV\n".getBytes());
		out.write("#MODEL\n".getBytes());
		out.write(xmlFile.getCanonicalPath().getBytes());
		out.write(":\n#BASEFOLDER\n".getBytes());
		out.write(xmlFile.getCanonicalFile().getParent().getBytes());
		out.write("\n#INTERMEDIATE\n".getBytes());
		out.write("#LABEL_MAP\n".getBytes());
		out.write("toplevel.failed:failed\n".getBytes());
		out.write("#PROPERTY_MAP\n".getBytes());
		out.write("((PU, 0.0 5.0), (tt) (toplevel.failed)):0\n".getBytes());
		out.write("#RECORDS\n".getBytes());
		out.close();
		
		File r = new File("property_checking_conversion_result.txt");
		if (r.exists())
			r.delete();

		String prog = MODEL2IMC_PROG;
		for (String p : paths) {
			File possible = new File(p);
			possible = new File(possible, MODEL2IMC_PROG);
			if (possible.exists()) {
				prog = possible.getCanonicalPath();
				break;
			}
		}
		String[] args = new String[] {prog, "-p", "0", "-r", recordsFile.toString(), "--results-file", resultsFile.toString(), null};
		if (!makeDot)
			args[args.length - 1] = "-timca";
		else
			args[args.length - 1] = "-tdot";
		ProcessBuilder bld = new ProcessBuilder(args);
		bld.redirectError(ProcessBuilder.Redirect.INHERIT);
		bld.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		Process p = bld.start();
		int retCode;
		while (true) {
			try {
				retCode = p.waitFor();
				break;
			} catch (InterruptedException e) {
			}
		}
		if (retCode != 0) {
			System.err.println("Conversion to failed with error code " + retCode);
			return -1;
		}
		recordsFile.delete();
		resultsFile.delete();
		return 0;
	}
	
	private static void cleanupXML(File in, File out) throws IOException
	{
		FileInputStream input = new FileInputStream(in);
		BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(input));
		FileOutputStream output = new FileOutputStream(out);
		
		String line;
		while ((line = reader.readLine()) != null)
			output.write(line.trim().getBytes());
		reader.close();
		output.close();
	}

	@Override
	public Set<Language> getSourceLanguages() {
		EnumSet<Language> ret = EnumSet.of(Language.NUSMV);
		ret.add(Language.NUSMV_PROBS);
		return ret;
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return Collections.singleton(Language.STORM_IMC);
	}
	
	public String toString() {
		return "NuSMV_Exec";
	}
}
