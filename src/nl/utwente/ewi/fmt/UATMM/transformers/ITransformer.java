package nl.utwente.ewi.fmt.UATMM.transformers;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/** Interface for a transformer between source and target models. */
public interface ITransformer {
	/**
	 * Transforms the source model in a given input file
	 * into a target model stored in a given output file.
	 * @param inputPath file name of the source model
	 * @param outputPath file name of the target model
	 * @return the target model
	 * @throws Exception if an error occurred during reading, transforming or writing
	 */
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception;
	
	/** The languages expected for the input models of this transformer. */
	public Set<Language> getSourceLanguages();
	
	/** The language produced by this transformer. */
	public Set<Language> getTargetLanguages();
	
	/** Check that the provided inputs are valid for the transformation */
	public default boolean validateInputs(Map<String, Language> inputs) throws Exception {
		return true;
	}

	/**
	 * Returns a composed transformer consisting of this transformer,
	 * chained with another transformer
	 * @param other the other transformer; the input language of other should
	 * coincide with the output language of this transformer
	 * @return the composed transformer
	 * @throws IllegalArgumentException if the input language of other
	 * does not coincide with this transformer's output language
	 */
	public default ITransformer compose(ITransformer other) {
		return new ComposedTransformer(this, other);
	}
	
	public default Set<ITransformer> flatten() {
		return Collections.singleton(this);
	}
}