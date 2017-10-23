package nl.utwente.ewi.fmt.UATMM.standalone;

import java.util.Collection;
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
		new IdentityTransformer(Language.UATS_BINARY, Language.UATS)
	};

	private static void usage()
	{
		System.err.println("Usage: ATTMain -i source-lang source-model [-i ...] -o target-language target-model [-o ...]");
		System.err.format("Current languages: %s\n", languageList());
		System.exit(1);
	}

	public static void main(String[] args) throws Exception {
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
		t = getTransformer(inputs.values(), outputs.keySet(), EnumSet.noneOf(Language.class));
		if (t == null) {
			System.err.println("Can't transform requested formats.");
			System.exit(1);
		}
		t = simplifyTransformer(t, inputs.values(), outputs.keySet());
		System.out.println("Found transformation:");
		System.out.println(t.toString());
		if (!t.validateInputs(inputs)) {
			System.err.println("Validation error in input models.");
			System.exit(1);
		}
		t.execute(inputs, outputs);
	}
	
	private static ITransformer simplifyTransformer(ITransformer t, Collection<Language> source, Set<Language> target)
	{
		HashSet<ITransformer> transformers = new HashSet<ITransformer>(t.flatten());
		HashSet<ITransformer> duplicates = new HashSet<ITransformer>();
		for (ITransformer cur : transformers) {
			for (ITransformer other : transformers) {
				if (cur == other)
					continue;
				if (cur.getSourceLanguages().containsAll(other.getSourceLanguages())
					&& other.getTargetLanguages().containsAll(cur.getTargetLanguages())) {
						duplicates.add(cur);
				}
			}
		}
		transformers.removeAll(duplicates);
		if (transformers.size() <= 1)
			return t;
		ITransformer ret = null;
		EnumSet<Language> currentInputs = EnumSet.copyOf(source);
		EnumSet<Language> currentOutputs = EnumSet.noneOf(Language.class);
		if (source.containsAll(target))
			return t;
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

	/**
	 * Returns a transformer from a given source to target language
	 * 
	 * @param sources
	 *            Source languages for transformation
	 * @param targets
	 *            Target languages for transformation
	 * @param futureTargets
	 *            Target languages that will be generated in later steps.
	 * @return a standalone transformation from source to target language, or
	 *         <code>null</code> if no such transformation can be defined
	 */
	private static ITransformer getTransformer(Collection<Language> source, Set<Language> target, Set <Language> futureTargets) {
		/* First we check the trivial case: If all targets are already in the inputs, we don't need any transformations. */
		if (source.containsAll(target))
			return new NullTransformer(target);
		if (futureTargets.containsAll(target)) {
			/* We've entered a cycle, so this is not a viable chain of transformers. */
			return null;
		}
	
		/* First try to find a direct transformation. */
		for (ITransformer t : transformers) {
			if (t.getTargetLanguages().containsAll(target) && source.containsAll(t.getSourceLanguages()))
				return t;
		}
		
		/* Try to find a transformer that can produce all of the targets */
		for (ITransformer t : transformers) {
			if (t.getTargetLanguages().containsAll(target)) {
				EnumSet<Language> newFuture = EnumSet.copyOf(futureTargets);
				newFuture.addAll(t.getTargetLanguages());
				ITransformer prefix = getTransformer(source, t.getSourceLanguages(), newFuture);
				if (prefix != null)
					return prefix.compose(t);
			}
		}
	
		/* Try to find some combination of transformers that can produce all of the targets */
		for (ITransformer t : transformers) {
			boolean canUse = false;
			if (futureTargets.containsAll(t.getTargetLanguages()))
				continue; /* No point to using this transformer */
			EnumSet<Language> remaining = EnumSet.copyOf(target);
			for (Language l : t.getTargetLanguages()) {
				if (remaining.remove(l))
					canUse = true;
			}
			if (canUse) { /* This transformer can produce at least some targets */
				EnumSet<Language> newFuture = EnumSet.copyOf(futureTargets);
				newFuture.addAll(t.getTargetLanguages());
				if (!source.containsAll(t.getSourceLanguages())) {
					ITransformer prefix = getTransformer(source, t.getSourceLanguages(), newFuture);
					if (prefix == null)
						continue;
					t = prefix.compose(t);
				}
				ITransformer rest = getTransformer(source, remaining, futureTargets);
				if (rest != null)
					return new ParallelTransformer(t, rest);
			}
		}
	
		/* No transformer exists for this combination. */
		return null;
	}

	static public String languageList() {
		return Language.getLanguageMap().keySet().toString();
	}
}