package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.EnumSet;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.muml.uppaal.UppaalPackage;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import parser.Main;

public class UppaalTextOutput2Trace implements ITransformer {

	/** The singleton instance of this transformer. */
	private static UppaalTextOutput2Trace INSTANCE;

	/** Returns the singleton instance of this transformer. */
	public static UppaalTextOutput2Trace instance() {
		if (INSTANCE == null) {
			INSTANCE = new UppaalTextOutput2Trace();
		}
		return INSTANCE;
	}
	
	@Override
	public EnumSet<Language> getSourceLanguages()
	{
		return EnumSet.of(Language.UPPAAL, Language.UPPAAL_TEXT_RESULT);
	}
	
	@Override
	public EnumSet<Language> getTargetLanguages()
	{
		return EnumSet.of(Language.UPPAAL_TRACE);
	}
	
	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception
	{
		ResourceSet rss = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		rss.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".xml", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		rss.getPackageRegistry().put(UppaalPackage.eNS_PREFIX, UppaalPackage.eINSTANCE);
		String inputUPPAALmodel = null;
		String verifytaTextResult = null;
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UPPAAL) {
				if (inputUPPAALmodel != null)
					throw new UnsupportedOperationException("Multiple Uppaal reference models not supported");
				inputUPPAALmodel = e.getKey();
			}
			if (e.getValue() == Language.UPPAAL_TEXT_RESULT) {
				if (verifytaTextResult != null) {
					throw new UnsupportedOperationException("Multiple Uppaal traces not supported");
				}
				verifytaTextResult = e.getKey();
			}
		}
		/*Resource res = rss.createResource(inputUPPAALmodel);
		if (res == null)
			throw new java.io.FileNotFoundException(inputUPPAALmodel + " not loaded");
		res = new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl().createResource(inputUPPAALmodel);
		res.load(Collections.EMPTY_MAP);
		if (res.getErrors().size() > 0)
			System.err.println("Error: " + res.getErrors().get(0));
		Object o = res.getContents().get(0);
		CharSequence xml;
		if (o instanceof NSTA) {
			NSTA nta = (NSTA)o;
			//xml = new Serialization().main(nta);
		} else {
			System.err.println(o.getClass());
			throw new IllegalArgumentException("Input model is not in proper Uppaal metamodel format");
		}*/
//		FileOutputStream out = new FileOutputStream(outputs.get(Language.UPPAAL_XML));
//		out.write(xml.toString().getBytes());
//		out.close();
		removeFirstPartFromFile(verifytaTextResult, "Showing example trace"); //As both stdout and stderr come to the same textual output file, we need to skip the first part until the actual trace starts. Of course, it would be better to just read the stderr, which only contains the trace.
		new Main(verifytaTextResult, inputUPPAALmodel, outputs.get(Language.UPPAAL_TRACE));
		
		return null;
	}
	
	private void removeFirstPartFromFile(String file, String lastLineToRemove) {
        try {
            File inFile = new File(file);

            if (!inFile.isFile()) {
                System.err.println(inFile.getAbsolutePath() + " is not an existing file");
                return;
            }

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            //Keep reading the input file until the last line to remove is found
            while ((line = br.readLine()) != null) {
            	if (line.trim().contains(lastLineToRemove)) {
                	break;
                }
            }
            //Copy the rest of the file as it is
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
            pw.flush();
            pw.close();
            br.close();

            //Delete the original file
            if (!inFile.delete()) {
                System.err.println("Could not delete file " + inFile);
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile)) {
            	System.err.println("Could not rename file " + tempFile + " to " + inFile);
            }

        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
