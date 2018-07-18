package nl.utwente.ewi.fmt.UATMM.standalone;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import nl.utwente.ewi.fmt.UATMM.transformers.*;

public class ATTMain {
	private static final ITransformer[] transformers = new ITransformer[] {
		UAT2Uppaal.instance(),
		Uppaal2XML.instance(),
		ADTool2UAT.sINSTANCE,
		ADTool2UAT.vINSTANCE,
		ATA2UAT.sINSTANCE,
		ATA2UAT.vINSTANCE,
		Galileo2UAT.instance(),
		Maintenance2UAT.instance(),
		FaultTreePlus2UAT.sINSTANCE,
		FaultTreePlus2UAT.vINSTANCE,
		UAT2ADTool.instance(),
		UAT2ADTool.binaryInstance(),
		UAT2ATCalc.instance(),
		UAT2ATE.instance(),
		UAT2FaultTreePlus.instance(),
		UAT2UATBinary.instance(),
		UAT2Galileo.instance(),
		UppaalExecutingTransformer.instance(),
		UppaalTextOutput2Trace.instance(),
		UppaalTrace2Schedule.instance(),
		new IdentityTransformer(Language.UATS_BINARY, Language.UATS)
	};

	private static void usage()
	{
		System.err.println("Usage: ATTMain -i source-lang source-model [-i ...] -o target-language target-model [-o ...]");
		System.err.format("Current languages: %s\n", languageList());
		System.exit(1);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("ATTMain arguments: " + Arrays.deepToString(args));
		if (args.length < 6)
			usage();
		HashMap<String, Language> inputs = new HashMap<String, Language>();
		HashMap<Language, String> outputs = new HashMap<Language, String>();
		
		for (int i = 0; i < args.length; i += 3) {
			if (args[i].equals("--keep-temporary-files")) {
				ComposedTransformer.keepTemps = true;
				i -= 2;
				continue;
			}
			if (args.length < i + 3)
				usage();

			Language l = Language.getLanguage(args[i + 1]);
			if (l == null) {
				System.err.format("'%s' is not a recognised language\n", args[i + 1]);
				usage();
			}
			String path;
			path = args[i + 2];
			if (args[i].equals("-i")) {
				 inputs.put(path, l);
			} else if (args[i].equals("-o")) {
				outputs.put(l, path);
			} else {
				System.err.format("Unknown I/O type: %s\n", args[i]);
				usage();
			}
		}
		if (inputs.size() == 0 || outputs.size() == 0)
			usage();

		ITransformer t;
		int length[] = new int[1];
		t = getTransformer(inputs.values(), outputs.keySet(), EnumSet.noneOf(Language.class), length);
		if (t == null) {
			System.err.println("Can't transform requested formats.");
			System.exit(1);
		}
		t = simplifyTransformer(t, inputs.values(), outputs.keySet());
		System.out.println("Final transformation:");
		System.out.println(t.toString());
		if (!t.validateInputs(inputs)) {
			System.err.println("Validation error in input models.");
			System.exit(1);
		}
		t.execute(inputs, outputs);
	}
	
	private static ITransformer simplifyTransformer(ITransformer t, Collection<Language> source, Set<Language> target)
	{
		if (source.containsAll(target))
			return new NullTransformer(target);

		System.out.println("Initial transformation:");
		System.out.println(t);
		HashSet<ITransformer> transformers = new HashSet<ITransformer>();
		Set<ITransformer> newTransformers = t.flatten();
		/* Start by removing duplicates and finding any optional transformations that can be done */
		while (!newTransformers.isEmpty()) {
			HashSet<ITransformer> toAdd = new HashSet<ITransformer>();
			for (ITransformer cur : newTransformers) {
				boolean isDup = false;
				HashSet<ITransformer> toRemove = new HashSet<ITransformer>();
				for (ITransformer other : transformers) {
					if (other.getTargetLanguages().containsAll(cur.getTargetLanguages()))
						isDup = true;
					else if (cur.getTargetLanguages().containsAll(other.getTargetLanguages()))
						toRemove.add(other);
				}
				transformers.removeAll(toRemove);
				if (isDup)
					continue;
				ITransformer withOpt = withOptionals(source, cur);
				if (withOpt == cur) {
					transformers.add(cur);
				} else {
					toAdd.addAll(withOpt.flatten());
				}
			}
			newTransformers = toAdd;
		}
		ITransformer ret = null;
		EnumSet<Language> currentInputs = EnumSet.copyOf(source);
		EnumSet<Language> currentOutputs = EnumSet.noneOf(Language.class);

		while (!currentInputs.containsAll(target)) {
			ITransformer currentRound = null;
			for (ITransformer cur : transformers) {
				if (currentOutputs.containsAll(cur.getTargetLanguages()))
					continue; /* Pointless transformer */
				if (currentInputs.containsAll(cur.getSourceLanguages())) {
					if (currentRound == null)
						currentRound = cur;
					else if (currentRound instanceof ParallelTransformer)
						((ParallelTransformer)currentRound).addTransformer(cur);
					else
						currentRound = new ParallelTransformer(currentRound, cur);
				}
			}
			if (currentRound == null)
				return t;
			transformers.removeAll(currentRound.flatten());
			if (ret == null)
				ret = currentRound;
			else
				ret = ret.compose(currentRound);
			currentInputs.addAll(ret.getTargetLanguages());
		}
		return ret;
	}

	/** Finds or constructs a transformer that takes the sources, constructs as many of
	 * the optional inputs of t as possible, and executes t on the original sources with the
	 * optional outputs.
	 * @param sources The available source languages.
	 * @param t The transformer for which to construct the optionals.
	 * @return A transformer that performs t with as many optional sources as possible.
	 */
	private static ITransformer withOptionals(Collection<Language> sources, ITransformer t)
	{
		EnumMap<Language, ITransformer> possible = new EnumMap<Language, ITransformer>(Language.class);
		for (Language l : t.getOptionalSourceLanguages()) {
			int[] length = new int[1];
			ITransformer prefix = getTransformer(sources, Collections.singleton(l), EnumSet.noneOf(Language.class), length);
			if (prefix != null)
				possible.put(l, prefix);
		}
		if (possible.isEmpty())
			return t;
		ParallelTransformer prefix = new ParallelTransformer();
		for (ITransformer pt : possible.values())
			prefix.addTransformer(pt);
		WithOptionalTransformer ot = new WithOptionalTransformer(t, possible.keySet());
		return prefix.compose(ot);
	}
	/**
	 * Returns a transformer from a given source to target language
	 * 
	 * @param sources
	 *            Source languages for transformation
	 * @param targets
	 *            Target languages for transformation
	 * @param futureTargets
	 *            Target languages that will be generated in later steps.
	 * @param length
	 *            If the function returns non-null, the number of transformers used in the output.
	 * @return a standalone transformation from source to target language, or
	 *         <code>null</code> if no such transformation can be defined
	 */
	private static ITransformer getTransformer(Collection<Language> source, Set<Language> target, Set <Language> futureTargets, int[] length) {
		/* First we check the trivial case: If all targets are already in the inputs, we don't need any transformations. */
		if (source.containsAll(target)) {
			length[0] = 0;
			return new NullTransformer(target);
		}
		
		/* First try to find a direct transformation. */
		for (ITransformer t : transformers) {
			if (t.getTargetLanguages().containsAll(target) && source.containsAll(t.getSourceLanguages())) {
				length[0] = 1;
				return t;
			}
		}
	
		/* Do a depth first search to find the shortest sequence of transformers */
		ITransformer best = null;
		int bestLength = Integer.MAX_VALUE;

		for (ITransformer t : transformers) {
			boolean canUse = false;
			if (futureTargets.containsAll(t.getTargetLanguages()))
				continue; /* No point to using this transformer */

			/* See if this transformer produces at least some targets */
			EnumSet<Language> remaining = EnumSet.copyOf(target);
			for (Language l : t.getTargetLanguages()) {
				if (remaining.remove(l))
					canUse = true;
			}

			if (canUse) {
				/* Construct a transformer producing the required sources and remaining targets */
				EnumSet<Language> newFuture = EnumSet.copyOf(futureTargets);
				EnumSet<Language> newTargets = EnumSet.copyOf(remaining);
				newTargets.addAll(t.getSourceLanguages());
				newTargets.removeAll(source);
				newFuture.addAll(t.getTargetLanguages());
				if (!source.containsAll(t.getSourceLanguages())) {
					ITransformer prefix = getTransformer(source, newTargets, newFuture, length);
					if (prefix == null)
						continue;
					if (length[0] < bestLength) {
						bestLength = length[0];
						best = prefix.compose(t);
					}
				}
			}
		}
	
		length[0] = bestLength + 1;
		return best;
	}

	static public String languageList() {
		return Language.getLanguageMap().keySet().toString();
	}
	
	/** Returns the languages meeting certain criteria:
	 * - If neither includeInputs nor includeOutputs is set, all languages are returned.
	 * - Otherwise, only languages are returned for which transformations exist taking them as input/output
	 *   (depending on the arguments).
	 *
	 * @param includeInputs
	 * @param includeOutputs
	 * @return
	 */
	public static Set<Language> getLanguages(boolean includeInputs, boolean includeOutputs)
	{
		HashSet<Language> ret = new HashSet<Language>();
		if (!includeInputs && !includeOutputs) {
			Language[] languages = Language.values();
			for (int i = languages.length - 1; i >= 0; i--)
				ret.add(languages[i]);
		}
		if (includeInputs) {
			for (ITransformer t : transformers) {
				ret.addAll(t.getSourceLanguages());
				ret.addAll(t.getOptionalSourceLanguages());
			}
		}
		if (includeOutputs) {
			for (ITransformer t : transformers) {
				ret.addAll(t.getTargetLanguages());
			}
		}
		return ret;
	}
}