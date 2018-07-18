package nl.utwente.ewi.fmt.UATMM.transformers;

import static nl.utwente.ewi.fmt.UATMM.transformers.EpsilonTransformer.Role.BOTH;
import static nl.utwente.ewi.fmt.UATMM.transformers.EpsilonTransformer.Role.SOURCE;
import static nl.utwente.ewi.fmt.UATMM.transformers.EpsilonTransformer.Role.TARGET;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;

/**
 * Generic abstract class that specifies the abstract meta-info required for
 * running a transformation with java.
 */
public abstract class EpsilonTransformer implements ITransformer {
	/** The source language of this transformer. */
	private final Set<Language> sourceLanguages;
	/** The target language of this transformer. */
	private final Set<Language> targetLanguages;

	/**
	 * Constructs a transformer from a given source language to a given target
	 * language.
	 */
	public EpsilonTransformer(Collection<Language> sourceLanguages, Collection<Language> targetLanguages) {
		this.sourceLanguages = new TreeSet<Language>(sourceLanguages);
		this.targetLanguages = new TreeSet<Language>(targetLanguages);
	}

	public EpsilonTransformer(Language sourceLanguage, Language targetLanguage) {
		this.sourceLanguages = new TreeSet<Language>();
		sourceLanguages.add(sourceLanguage);
		this.targetLanguages = new TreeSet<Language>();
		targetLanguages.add(targetLanguage);
	}
	
	static {
		XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", fact);
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("text/xml", fact);
	}

	@Override
	public Set<Language> getSourceLanguages() {
		return new TreeSet<Language>(sourceLanguages);
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return new TreeSet<Language>(targetLanguages);
	}
	
	public String toString()
	{
		return String.format("Epsilon{%s -> %s}", sourceLanguages, targetLanguages);
	}

	public boolean validateInputs(Map<String, Language> inputs) throws Exception
	{
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue().validator != null) {
				EvlModule module = new EvlModule();
				module.parse(toFileURI(e.getValue().validator));
				if (module.getParseProblems().size() > 0) {
					System.err.format("Parse errors occured while validating %s\n", e.getValue());
					for (ParseProblem problem : module.getParseProblems()) {
						System.err.println(problem.toString());
					}
					return false;
				}
				IModel model = createEmfModel(e.getValue(), Role.SOURCE, e.getKey());

				module.getContext().getModelRepository().addModel(model);
				module.execute();
				for (Object o : module.getContext().getUnsatisfiedConstraints()) {
					System.err.format("Validation error in %s (%s):\n", e.getKey(), e.getValue());
					System.err.println(o);
				}
				if (!module.getContext().getUnsatisfiedConstraints().isEmpty())
					return false;
			}
		}
		return true;
	}

	public abstract IEolExecutableModule createModule();

	/** Returns the filename of the transformation definition. */
	public abstract Map<Language, String> getTransformations();

	/**
	 * Converts the file names of the source and target models into IModels.
	 * 
	 * @param inputPath
	 *            file name of the source model
	 * @param outputPath
	 *            file name of the target model
	 * @throws EolModelLoadingException
	 *             if one of the models could not be loaded
	 * @throws URISyntaxException
	 *             if one of the file names is not a valid URI
	 * @throws FileNotFoundException
	 *             if one of the files did not exist
	 */
	public abstract Set<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException;

	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		Object ret = null;
		for (Map.Entry<Language, String> output : outputs.entrySet()) {
			IEolExecutableModule module = createModule();
			module.parse(toFileURI(getTransformations().get(output.getKey())));
		
			if (module.getParseProblems().size() > 0) {
				System.err.println("Parse errors occured...");
				for (ParseProblem problem : module.getParseProblems()) {
					System.err.println(problem.toString());
				}
				return null;
			}
			for (IModel model : getModels(inputs, outputs, output.getKey())) {
				module.getContext().getModelRepository().addModel(model);
			}
			ret = module.execute();
			module.getContext().getModelRepository().dispose();
		}
		return ret;
	}
	
	/** Returns the language corresponding to a given role. */
	protected Set<Language> getLanguages(Role role) {
		return role == SOURCE ? getSourceLanguages() : getTargetLanguages();
	}
	
	protected static ResourceSetImpl getResourceSet()
	{
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		return resourceSet;
	}
	
	protected static Resource createResourceForXml(String model, ResourceSet rs) throws java.io.IOException
	{
		if (rs == null)
			rs = getResourceSet();
		org.eclipse.emf.common.util.URI uri;
		if(model.startsWith("archive:")){
			// Edit by Bas Klein Essink
			// The content of the else clause was here before I got here,
			// I assume it is a workaround for something I am not aware of,
			// so I am leaving it in for non archive URIs,
			// but toFileURI(model) breaks archive URIs.
			uri = org.eclipse.emf.common.util.URI.createURI(model);
		}else{
			try {
				uri = org.eclipse.emf.common.util.URI.createURI(toFileURI(model).toString());
			} catch (URISyntaxException e) {
				throw new RuntimeException(e);
			}
		}
		Resource res = rs.createResource(uri, "text/xml");
		if (res == null) {
			System.err.println("No resource for model: " + model);
		}
		res.load(Collections.emptyMap());
		try {
			EcoreUtil.resolveAll(rs);
		} catch (Exception ex) {
			System.err.println("Problem with resolving names for " + res + " with " + rs);
		}
		return res;
	}
	
	protected static InMemoryEmfModel loadInMemoryEmfModel(Language language, Role role, String model, ResourceSet set)
		throws java.io.IOException
	{
		Resource res = createResourceForXml(model, set);
		return new InMemoryEmfModel(language.getName(), res);
	}

	protected static EmfModel createEmfModel(Language language, Role role, String model)
			throws FileNotFoundException, EolModelLoadingException,
			URISyntaxException, java.io.IOException {
		return createEmfModel(language, role, model, null);
	}

	protected static EmfModel createEmfModel(Language language, Role role, String model, ResourceSet set)
			throws FileNotFoundException, EolModelLoadingException,
			URISyntaxException, java.io.IOException {
		assert language.getLocation() != null : String.format(
				"Can't create EMF model for language %s", language);
		if (language.pkg != null && role == SOURCE)
			return loadInMemoryEmfModel(language, role, model, set);
		StringProperties props = new StringProperties();
		props.put(EmfModel.PROPERTY_NAME, language.getName());
		if (language.pkg != null) {
			props.put(EmfModel.PROPERTY_METAMODEL_URI, language.pkg.getNsURI());
		} else {
			props.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, toFileURI(language.getLocation()));
		}
		props.put(EmfModel.PROPERTY_MODEL_URI, model);
		props.put(EmfModel.PROPERTY_READONLOAD, "" + (role == SOURCE || role == BOTH));
		props.put(EmfModel.PROPERTY_STOREONDISPOSAL, "" + (role == TARGET || role == BOTH));

		EmfModel result = new EmfModel();
		result.load(props, (String)null);
		return result;
	}

	protected PlainXmlModel createPlainXmlModel(Language lang, Role role, String model)
			throws FileNotFoundException, EolModelLoadingException,
			URISyntaxException {
		StringProperties props = new StringProperties();
		props.put(PlainXmlModel.PROPERTY_NAME, lang.getName());
		props.put(PlainXmlModel.PROPERTY_URI, model);
		props.put(PlainXmlModel.PROPERTY_READONLOAD, "" + (role == SOURCE));
		props.put(PlainXmlModel.PROPERTY_STOREONDISPOSAL, "" + (role == TARGET));

		PlainXmlModel result = new PlainXmlModel();
		result.load(props, (String)null);
		return result;
	}

	/**
	 * Converts a file name into a file URI string, replacing any references to
	 * "bin" directories in the path to "sub".
	 */
	protected static URI toFileURI(String fileName) throws FileNotFoundException,
			URISyntaxException {
		URI fileURI = null;
		try {
			URL fileURL = Language.class.getResource('/' + fileName);
			if (fileURL != null)
				fileURI = fileURL.toURI();
		} catch (Exception e) {
			System.err.format("Error getting resource for file %s\n", fileName);
			throw e;
		}
		if (fileURI == null) {
			File f = new File("data/" + fileName);
			if (f.exists()) {
				fileURI = f.toURI();
			} else {
				System.out.println(f.toString() + " does not exist. Trying " + fileName);
				fileURI = URI.create("file:" + new File(fileName).getAbsolutePath());
			}
		}
		return fileURI;
	}

	/** Role of a model or language in a transformation. */
	protected enum Role {
		SOURCE, TARGET, BOTH;
	}
}