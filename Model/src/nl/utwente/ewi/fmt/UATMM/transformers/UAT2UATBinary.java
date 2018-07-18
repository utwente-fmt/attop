package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

/**
 * Transformer from the AT metamodel to the ADTool input format.
 * @author David Huistra
 */
public class UAT2UATBinary extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2UATBinary INSTANCE;
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2UATBinary instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2UATBinary();
		}
		return INSTANCE;
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private UAT2UATBinary() {
		super(Arrays.asList(new Language[]{Language.UATS}), Arrays.asList(new Language[]{Language.UATS_BINARY}));
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EolModule();
	}

	@Override
	public Set<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException {
		// EOL transformation only alters the input model, does not create output model
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() != Language.UATS)
				continue;
			return Collections.singleton(createEmfModel(e.getValue(), Role.BOTH, new File(e.getKey()).toURI().getPath()));
		}
		return null;
	}

	@Override
	public Map<Language, String> getTransformations() {
		return Collections.singletonMap(Language.UATS_BINARY, "transformations/UAT2Binary.eol");
	}

	/*
	 * As EOL only modifies the input path, we copy the (temporary) input path file to the output file
	 */
	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		Object result = super.execute(inputs, outputs);
		Map.Entry<String, Language> e = null;
		for (Map.Entry<String, Language> c : inputs.entrySet()) {
			if (c.getValue() != Language.UATS)
				continue;
			e = c;
			break;
		}
		
		Path inputPathPath = Paths.get(new File(e.getKey()).toURI());
		String content = new String(Files.readAllBytes(inputPathPath));
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(outputs.get(Language.UATS_BINARY)), "utf-8"))) {
			writer.write(content);
		}
		return result;
	}
}
