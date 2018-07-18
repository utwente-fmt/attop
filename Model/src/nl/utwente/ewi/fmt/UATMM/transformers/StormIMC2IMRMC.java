package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay;

public class StormIMC2IMRMC implements ITransformer {
	private static final Comparator<Set<Integer>> integerSetComparator = new Comparator<Set<Integer>>() {
		public int compare(Set<Integer> s1, Set<Integer>s2)
		{
			if (s1.size() < s2.size())
				return -1;
			if (s1.size() > s2.size())
				return 1;
			if (s1 instanceof TreeSet && s2 instanceof TreeSet) {
				TreeSet<Integer> t1 = (TreeSet<Integer>)s1;
				TreeSet<Integer> t2 = (TreeSet<Integer>)s2;
				Integer lowest1 = t1.first();
				Integer lowest2 = t2.first();
				while (lowest1 != null) {
					if (lowest1 < lowest2)
						return -1;
					if (lowest1 > lowest2)
						return 1;
					lowest1 = t1.higher(lowest1);
					lowest2 = t2.higher(lowest2);
				}
				return 0;
			} else if (s1 instanceof SortedSet && s2 instanceof SortedSet) {
				Iterator<Integer> i1 = s1.iterator();
				Iterator<Integer> i2 = s2.iterator();
				while (i1.hasNext()) {
					Integer v1 = i1.next();
					Integer v2 = i2.next();
					if (v1 < v2)
						return -1;
					if (v1 > v2)
						return 1;
				}
				return 0;
			} else {
				return compare(new TreeSet<Integer>(s1), new TreeSet<Integer>(s2));
			}
		}
	};

	private static TreeSet<BoundedDelay> getDelays(String inputFile) throws IOException
	{
		TreeSet<BoundedDelay> ret = new TreeSet<BoundedDelay>(
				new Comparator<BoundedDelay>() {
					public int compare(BoundedDelay d1, BoundedDelay d2) {
						if (d1.getMinTime() < d2.getMinTime())
							return -1;
						if (d1.getMinTime() > d2.getMinTime())
							return 1;
						if (d1.getMaxTime() > d2.getMaxTime())
							return -1;
						if (d1.getMaxTime() < d2.getMaxTime())
							return 1;
						return 0;
					}
				});
		Resource r = EpsilonTransformer.createResourceForXml(inputFile, null);
		Iterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof BoundedDelay)
				ret.add((BoundedDelay)obj);
		}
		return ret;
	}
	
	private static String shortenProb(String p)
	{
		while (p.startsWith("0"))
			p = p.substring(1);
		if (p.indexOf('.') != -1) {
			int end = p.length();
			while (p.charAt(end - 1) == '0')
				end--;
			if (p.charAt(end - 1) == '.')
				end--;
			if (end != p.length())
				p = p.substring(0, end);
		}
		if (p.length() == 0)
			p = "0";
		return p;
	}
	
	private static BoundedDelay[] readIMC(String inputFile, String maintenanceInputFile, ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts, TreeSet<Integer> goals)
		throws IOException
	{
		BoundedDelay delays[];
		try (BufferedReader input = new BufferedReader(new FileReader(inputFile))) {
			TreeMap<String, Integer> actionNums = new TreeMap<>();
			actionNums.put("!", 0);
			String line = input.readLine();
			if (!line.equals("#INITIALS"))
				throw new IllegalArgumentException("Storm file invalid (no #INITIALS line)");
			line = input.readLine();
			if (!line.equals("s1"))
				throw new UnsupportedOperationException("Storm file not supported (Initial state different from s1)");
			line = input.readLine();
			if (!line.equals("#GOALS"))
				throw new UnsupportedOperationException("Storm file not supported (Expected '#GOALS' instead of '" + line + "')");
			while ((line = input.readLine()).charAt(0) == 's')
				goals.add(Integer.parseInt(line.substring(1)) - 1);
			if (!line.equals("#TRANSITIONS"))
				throw new UnsupportedOperationException("Storm file not supported (Expected '#TRANSITIONS' instead of '" + line + "')");
			HashMap<Integer, String> fromCurrentAction = null;
			while ((line = input.readLine()) != null) {
				if (line.charAt(0) == '*') {
					int targetState = Integer.parseInt(line.substring(3, line.lastIndexOf(' '))) - 1;
					String prob = shortenProb(line.substring(line.lastIndexOf(' ') + 1));
					fromCurrentAction.put(targetState, prob);
				} else {
					Integer newState = Integer.parseInt(line.substring(1, line.indexOf(' '))) - 1;
					String actionName = line.substring(line.indexOf(' ') + 1);
					Integer actionNum = actionNums.get(actionName);
					if (actionNum == null) {
						actionNum = actionNums.size();
						actionNums.put(actionName, actionNum);
					}
					HashMap<Integer, HashMap<Integer, String>> fromState = null;
					if (lts.size() > newState)
						fromState = lts.get(newState);
					if (fromState == null) {
						fromState = new HashMap<>();
						while (lts.size() <= newState)
							lts.add(null);
						lts.set(newState, fromState);
					}
					fromCurrentAction = fromState.get(actionNum);
					if (fromCurrentAction == null) {
						fromCurrentAction = new HashMap<>();
						fromState.put(actionNum, fromCurrentAction);
					}
				}
			}
			delays = new BoundedDelay[actionNums.size()];
		}
	
		TreeSet<BoundedDelay> delaySet;
		if (maintenanceInputFile != null)
			delaySet = getDelays(maintenanceInputFile);
		else
			delaySet = new TreeSet<>();
		int currentState = 0;
		for (BoundedDelay delay : delaySet) {
			HashMap<Integer, HashMap<Integer, String>> trans = lts.get(currentState);
			if (trans.size() != 1)
				throw new IllegalStateException("Initial transition sequence invalid at state " + currentState);
			Integer action = trans.keySet().iterator().next();
			delays[action] = delay;
			lts.set(currentState, null);
			if (trans.get(action).size() != 1)
				throw new IllegalStateException("Initial transition probabilistic at state " + currentState);
			currentState = trans.get(action).keySet().iterator().next();
		}
		if (currentState != 0)
			lts.set(0, lts.get(currentState));
		for (HashMap<Integer, HashMap<Integer, String>> tt : lts) {
			if (tt != null) {
				for (HashMap<Integer, String> t : tt.values()) {
					String p = t.remove(currentState);
					if (p != null)
						t.put(0, p);
				}
			}
		}
		return delays;
	}
	
	private static void removeTauActions(ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts, Integer tauAction)
	{
		HashMap<Integer, Integer> tauRemaps = new HashMap<>();
		for (int i = lts.size() - 1; i >= 0; i--) {
			HashMap<Integer, HashMap<Integer, String>> s = lts.get(i);
			if (s != null) {
				HashMap<Integer, String> tauTarget = s.get(tauAction);
				if (tauTarget == null)
					continue;
				if (s.size() != 1)
					throw new UnsupportedOperationException("Tau and non-tau action from state " + i);
				if (tauTarget.size() != 1)
					throw new UnsupportedOperationException("Probabilistic tau target.");
				lts.set(i, null);
				Integer target = tauTarget.keySet().iterator().next();
				Integer newTarget;
				while ((newTarget = tauRemaps.get(target)) != null)
					target = newTarget;
				tauRemaps.put(i, target);
				for (Map.Entry<Integer, Integer> e : tauRemaps.entrySet()) {
					if (e.getValue() == i)
						tauRemaps.put(e.getKey(), target);
				}
			}
		}
		Set<Integer> tauKeys = tauRemaps.keySet();
		for (HashMap<Integer, HashMap<Integer, String>> s : lts) {
			if (s == null)
				continue;
			for (HashMap<Integer, String> t : s.values()) {
				for (Integer i : tauKeys) {
					String p = t.remove(i);
					if (p != null)
						t.put(tauRemaps.get(i), p);
				}
			}
		}
	}
	
	/** Change the LTS from "State -> Action -> Target -> Prob" to "State -> Target -> Action -> Prob" */
	private static ArrayList<HashMap<Integer, HashMap<Integer, String>>> reformatLTS(ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts, TreeSet<Integer> goals)
	{
		Integer[] newNumbers = new Integer[lts.size()];
		Arrays.fill(newNumbers, null);
		int maxNum = 0;
		HashSet<Integer> frontier = new HashSet<>();
		frontier.add(0);
		while (!frontier.isEmpty()) {
			HashSet<Integer> newFrontier = new HashSet<>();
			for (Integer i : frontier) {
				newNumbers[i] = maxNum++;
				if (lts.get(i) == null)
					continue;
				for (HashMap<Integer, String> t : lts.get(i).values()) {
					for (Integer j : t.keySet())
						if (newNumbers[j] == null)
							newFrontier.add(j);
				}
			}
			frontier = newFrontier;
		}
		ArrayList<HashMap<Integer, HashMap<Integer, String>>> ret = new ArrayList<>();
		for (int i = 0; i < maxNum; i++)
			ret.add(null);
		for (int i = 0; i < newNumbers.length; i++) {
			if (newNumbers[i] == null)
				continue;
			HashMap<Integer, HashMap<Integer, String>> s = lts.get(i);
			if (s != null) {
				HashMap<Integer, HashMap<Integer, String>> newS = new HashMap<>();
				for (Map.Entry<Integer, HashMap<Integer, String>> e : s.entrySet()) {
					for (Map.Entry<Integer, String> ee : e.getValue().entrySet()) {
						Integer target = newNumbers[ee.getKey()];
						if (target == null)
							throw new RuntimeException("Unreachable state was reached.");
						HashMap<Integer, String> t = newS.get(target);
						if (t == null) {
							t = new HashMap<>();
							newS.put(target, t);
						}
						t.put(e.getKey(), ee.getValue());
					}
				}
				ret.set(newNumbers[i], newS);
			}
		}
		ret.trimToSize();
		TreeSet<Integer> newGoals = new TreeSet<Integer>();
		for (Integer g : goals) {
			if (newNumbers[g] != null)
				newGoals.add(newNumbers[g]);
		}
		goals.clear();
		goals.addAll(newGoals);
		return ret;
	}
	
	private static SortedMap<Double, Set<Integer>> getTimes(BoundedDelay delays[], int tauAction)
	{
		TreeMap<Double, Set<Integer>> ret = new TreeMap<>();
		if (delays.length <= 2)
			return ret;
		double times[] = new double[delays.length - 1];
		TreeSet<Integer> actions = new TreeSet<>();
		HashMap<Set<Integer>, Set<Integer>> actionSets = new HashMap<>();
		double time = 0;
		tauAction -= 1;
		do {
			double minTime = Double.POSITIVE_INFINITY;
			for (int i = 0; i < times.length; i++) {
				if (i == tauAction)
					continue;
				if (times[i] <= time)
					times[i] += delays[i + 1].getMinTime();
				if (times[i] < minTime) {
					minTime = times[i];
					actions.clear();
				}
				if (times[i] == minTime)
					actions.add(i + 1);
			}
			Set<Integer> saveActions;
			if (actions.size() == 1)
				saveActions = Collections.singleton(actions.first());
			else
				saveActions = new TreeSet<Integer>(actions);
			if (actionSets.containsKey(saveActions))
				saveActions = actionSets.get(saveActions);
			else
				actionSets.put(saveActions, saveActions);
			ret.put(minTime, saveActions);
			time = minTime;
		} while (actions.size() != delays.length - 2);
		return ret;
	}
	
	private static Map<Integer, Double> postDistribution(ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts, int state, Set<Integer> actions)
	{
		if (actions.isEmpty())
			return Collections.singletonMap(state, 1.0);
		TreeSet<Integer> rest = new TreeSet<Integer>(actions);
		TreeMap<Integer, Double> ret = null;
		for (Integer act : actions) {
			rest.remove(act);
			Map<Integer, Double> post = postDistribution(lts, state, rest);
			rest.add(act);
			TreeMap<Integer, Double> our = new TreeMap<Integer, Double>();
			for (Map.Entry<Integer, Double> e : post.entrySet()) {
				Map<Integer, HashMap<Integer, String>> outgoing = lts.get(e.getKey());
				for (Map.Entry<Integer, HashMap<Integer, String>> trans : outgoing.entrySet()) {
					String rate = trans.getValue().get(act);
					if (rate != null)
						our.put(trans.getKey(), Double.parseDouble(rate) * e.getValue());
				}
			}
			if (ret == null)
				ret = our;
			else if (!ret.equals(our))
				throw new UnsupportedOperationException("Ordering of simultaneous actions is important out of state " + state);
		}
		return ret;
	}

	private static void writeLines(int currentState, FileOutputStream traOut,
	                               ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts,
	                               SortedMap<Double, Set<Integer>> times)
			throws IOException
	{
		TreeMap<Set<Integer>, Map<Integer, Double>> composed = new TreeMap<>(integerSetComparator);
		Set<Integer> possiblyReachable = new TreeSet<>();
		for (Set<Integer> transitionSet : times.values()) {
			if (!composed.containsKey(transitionSet)) {
				Map<Integer, Double> c = postDistribution(lts, currentState, transitionSet);
				composed.put(transitionSet, c);
				possiblyReachable.addAll(c.keySet());
			}
		}
		Map<Integer, HashMap<Integer, String>> direct = lts.get(currentState);
		for (Map.Entry<Integer, HashMap<Integer, String>> t : direct.entrySet()) {
			if (t.getValue().containsKey(0))
				possiblyReachable.add(t.getKey());
		}

		byte[] prefix = (Integer.toString(currentState + 1) + ' ').getBytes();
		for (Integer target : possiblyReachable) {
			Map<Integer, String> directToTarget = direct.get(target);
			String lambda = "0";
			if (directToTarget != null && directToTarget.containsKey(0))
				lambda = directToTarget.get(0);
			byte[] lambdaB = (lambda + ' ').getBytes();
			traOut.write(prefix);
			traOut.write(Integer.toString(target + 1).getBytes());
			if (times.size() == 0) {
				traOut.write((byte)' ');
				traOut.write(lambdaB);
			}
			for (Set<Integer> transitionSet : times.values()) {
				traOut.write((byte)' ');
				traOut.write(lambdaB);
				Double prob = composed.get(transitionSet).get(target);
				if (prob == null)
					traOut.write((byte)'0');
				else
					traOut.write(shortenProb(prob.toString()).getBytes());
			}
			traOut.write((byte)'\n');
		}
	}

	private static void writeLts(FileOutputStream traOut, FileOutputStream labOut,
	                             ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts,
	                             Set<Integer> goals,
	                             BoundedDelay delays[], int tauAction)
			throws IOException
	{
		long nTransitions = 0;
		int currentState = 0;
		labOut.write("#DECLARATION\nfailed\n#END\n".getBytes());
		for (Integer i : goals) {
			labOut.write(Integer.toString(i + 1).getBytes());
			labOut.write(" failed\n".getBytes());
		}
	
		for (HashMap<Integer, HashMap<Integer, String>> t : lts) {
			if (t != null)
				nTransitions += t.size();
		}

		SortedMap<Double, Set<Integer>> times = getTimes(delays, tauAction);
		if (times.size() > 0) {
			traOut.write("TIMES".getBytes());
			for (Double t : times.keySet()) {
				traOut.write((byte) ' ');
				traOut.write(shortenProb(t.toString()).getBytes());
				traOut.write(" 1".getBytes());
			}
			traOut.write("\nMODES".getBytes());
			for (int i = times.size(); i > 0; i--)
				traOut.write(" ctmc dtmc".getBytes());
			traOut.write((byte)'\n');
		}
		traOut.write(String.format("STATES %d\nTRANSITIONS %d\n", lts.size(), nTransitions).getBytes());

		for (currentState = 0; currentState < lts.size(); currentState++) {
			if (lts.get(currentState) == null)
				continue;
			writeLines(currentState, traOut, lts, times);
		}
	}

	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws IOException {
		String inputFile = null, maintenanceInputFile = null;
		TreeSet<Integer> goals = new TreeSet<>();
		for (Map.Entry<String, Language> i : inputs.entrySet()) {
			if (i.getValue() == Language.STORM_IMC)
				inputFile = i.getKey();
			if (i.getValue() == Language.UATM)
				maintenanceInputFile = i.getKey();
		}
		if (inputFile == null)
			throw new IllegalArgumentException("Storm->IMRMC conversion called without Storm input");
		if (!outputs.containsKey(Language.IMRMC))
			throw new IllegalArgumentException("Storm->IMRMC conversion called without IMRMC output");

		/* lts: StateNum -> ActionLabel -> TargetState -> Probability */
		ArrayList<HashMap<Integer, HashMap<Integer, String>>> lts = new ArrayList<>();
		BoundedDelay delays[] = readIMC(inputFile, maintenanceInputFile, lts, goals);

		Integer tauAction = 0;
		for (int i = 1; i < delays.length; i++) {
			if (delays[i] == null) {
				if (tauAction != 0)
					throw new UnsupportedOperationException("Multiple tau-like actions");
				tauAction = i;
			}
		}
	
		if (tauAction == 0)
			throw new UnsupportedOperationException("No tau-like action");
		removeTauActions(lts, tauAction);
		ArrayList<HashMap<Integer, HashMap<Integer, String>>> newLTS = reformatLTS(lts, goals);
		try (
				FileOutputStream traOut = new FileOutputStream(outputs.get(Language.IMRMC) + ".tra");
				FileOutputStream labOut = new FileOutputStream(outputs.get(Language.IMRMC) + ".lab")
		) {
			writeLts(traOut, labOut, newLTS, goals, delays, tauAction);
		}
	
		return null;
	}

	@Override
	public Set<Language> getSourceLanguages() {
		return Collections.singleton(Language.STORM_IMC);
	}

	@Override
	public Set<Language> getTargetLanguages() {
		return Collections.singleton(Language.IMRMC);
	}

}
