package nl.utwente.ewi.fmt.UATMM;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.BufferUnderflowException;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.*;
import nl.utwente.ewi.fmt.UATMM.Maintenance.*;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Module;

public class UATM_parser {
	private AttackTree tree;
	private MaintenanceFactory factory;
	
	public UATM_parser(AttackTree tree)
	{
		this.tree = tree;
		factory = MaintenanceFactory.eINSTANCE;
	}
	
	/* Read a sequence of codepoints with the following properties:
	 * - Any initial whitespace is skipped.
	 * - If the first non-whitespace character is a double quote ("), the
	 *   sequence is read until a second double quote is encountered.
	 *   The quote marks are not part of the returned string.
	 * - Otherwise, the sequence is read until the first whitespace character
	 *   is encountered, this character is not part of the returned string.
	 * - If EOF occurs inside a quoted string, or before the first non-whitespace
	 *   character, an EOFException is raised.
	 */
	private static String readQuotableString(IntBuffer buf) throws IOException
	{
		int cp;
		StringBuilder ret = new StringBuilder();
		try {
			while (Character.isWhitespace(cp = buf.get()))
				;
		} catch (BufferUnderflowException e) {
			throw new EOFException();
		}
		if (cp != '"') {
			while (!Character.isWhitespace(cp)) {
				ret.appendCodePoint(cp);
				try {
					cp = buf.get();
				} catch (BufferUnderflowException e) {
					cp = ' ';
				}
			}
		} else {
			try {
				while ((cp = buf.get()) != '"')
					ret.appendCodePoint(cp);
			} catch (BufferUnderflowException e) {
				throw new EOFException("End of file inside quoted string");
			}
		}
		return ret.toString();
	}
	
	private static IntBuffer codePointStream(Reader in) throws IOException
	{
		StringBuilder entireFile = new StringBuilder();
		char chars[] = new char[4096];
		int n;
		do {
			n = in.read(chars);
			if (n >= 0)
				entireFile.append(chars, 0, n);
		} while (n > 0);
		return IntBuffer.wrap(entireFile.codePoints().toArray());
	}
	
	private Condition readInspections(IntBuffer contents, Condition ret) throws BufferUnderflowException
	{
		int cp;
		while (contents.get() != '{')
			;
		while (Character.isWhitespace(cp = contents.get()))
			;
		while (cp != '}') {
			StringBuilder bld = new StringBuilder();
			NodeCondition cond = factory.createNodeCondition();
			if (cp == '"') {
				cp = contents.get();
				while (cp != '"') {
					bld.appendCodePoint(cp);
					cp = contents.get();
				}
			} else {
				while (cp != '(' && !Character.isWhitespace(cp)) {
					bld.appendCodePoint(cp);
					cp = contents.get();
				}
			}
			while (Character.isWhitespace(cp = contents.get()))
				;
			if (cp != '(') {
				if (Character.isWhitespace(cp))
					throw new IllegalArgumentException("Expected '(' after name in Inspection definition");
			}
			String name = bld.toString();
			for (Node n : tree.getNodes()) {
				if (n.getId().equals(name))
					cond.setNode(n);
			}
			bld.setLength(0);
			while (cp != ')') {
				bld.appendCodePoint(cp);
				cp = contents.get();
			}
			LinearNodeState newState = factory.createLinearNodeState();
			String value = bld.toString();
			double state;
			if (value.contains("/")) {
				String[] parts = value.split("/");
				state = Integer.parseInt(parts[0]);
				state /= Integer.parseInt(parts[1]);
			} else {
				state = Double.parseDouble(value);
			}
			newState.setFraction(state);
			cond.setState(newState);
			cond.setOrGreater(true);
			if (ret == null) {
				ret = cond;
			} else if (ret instanceof CombiningCondition) {
				((CombiningCondition) ret).getChildren().add(cond);
			} else {
				CombiningCondition tmp = factory.createCombiningCondition();
				tmp.getChildren().add(ret);
				tmp.getChildren().add(cond);
				ret = tmp;
			}
			while (Character.isWhitespace(cp = contents.get()))
				;
		}
		return ret;
	}
	
	private Collection<RepairEffect> readRepairActions(IntBuffer contents) throws BufferUnderflowException
	{
		int cp;
		ArrayList<RepairEffect> ret = new ArrayList<RepairEffect>();
		while (contents.get() != '{')
			;
		while (Character.isWhitespace(cp = contents.get()))
			;
		while (cp != '}') {
			StringBuilder bld = new StringBuilder();
			RepairEffect repair = factory.createRepairEffect();
			if (cp == '"') {
				cp = contents.get();
				while (cp != '"') {
					bld.appendCodePoint(cp);
					cp = contents.get();
				}
			} else {
				while (cp != '(' && !Character.isWhitespace(cp)) {
					bld.appendCodePoint(cp);
					cp = contents.get();
				}
			}
			while (Character.isWhitespace(cp = contents.get()))
				;
			if (cp != '(') {
				if (Character.isWhitespace(cp))
					throw new IllegalArgumentException("Expected '(' after name in Inspection definition");
			}
			String name = bld.toString();
			for (Node n : tree.getNodes()) {
				if (n.getId().equals(name))
					repair.setNode(n);
			}
			bld.setLength(0);
			while (cp != ')') {
				bld.appendCodePoint(cp);
				cp = contents.get();
			}
			LinearNodeState newState = factory.createLinearNodeState();
			newState.setFraction(Double.parseDouble(bld.toString()));
			repair.setNewState(newState);
			ret.add(repair);
			while (Character.isWhitespace(cp = contents.get()))
				;
		}
		return ret;
	}

	private Collection<TriggerEffect> readTriggerActions(IntBuffer contents, MaintenancePolicy policy) throws BufferUnderflowException
	{
		int cp;
		ArrayList<TriggerEffect> triggers = new ArrayList<TriggerEffect>();
		while (contents.get() != '{')
			;
		while (Character.isWhitespace(cp = contents.get()))
			;
		while (cp != '}') {
			StringBuilder bld = new StringBuilder();
			TriggerEffect trigger = factory.createTriggerEffect();
			if (cp == '"') {
				cp = contents.get();
				while (cp != '"') {
					bld.appendCodePoint(cp);
					cp = contents.get();
				}
			} else {
				while (!Character.isWhitespace(cp) && cp != '}') {
					bld.appendCodePoint(cp);
					cp = contents.get();
				}
			}
			String name = bld.toString();
			for (Module m : policy.getModules()) {
				if (m.getName().equals(name)) {
					ActivationCondition cond = factory.createActivationCondition();
					trigger.setTarget(cond);
					triggers.add(trigger);
					Condition cur = m.getCondition();
					if (cur == null) {
						m.setCondition(cond);
					} else {
						CombiningCondition comb = factory.createCombiningCondition();
						comb.getChildren().add(cur);
						comb.getChildren().add(cond);
						m.setCondition(comb);
					}
				}
			}
			while (cp != '}' && Character.isWhitespace(cp = contents.get()))
				;
		}
		return triggers;
	}
	
	private Module parseModule(IntBuffer contents, MaintenancePolicy policy) throws IOException
	{
		Module ret = factory.createModule();
		try {
			ret.setName(readQuotableString(contents));
		} catch (EOFException e) {
			return null;
		}
		double timer = Double.parseDouble(readQuotableString(contents));
		ret.setCondition(readInspections(contents, ret.getCondition()));
		if (timer > 0) {
			DelayCondition cond = factory.createDelayCondition();
			cond.setIsPeriodic(true);
			BoundedDelay delay = factory.createBoundedDelay();
			delay.setMinTime(timer);
			delay.setMaxTime(timer);
			cond.setDelay(delay);
			if (ret.getCondition() != null) {
				CombiningCondition c = factory.createCombiningCondition();
				c.getChildren().add(cond);
				c.getChildren().add(ret.getCondition());
				c.setOperator(Operator.AND);
				ret.setCondition(c);
			} else {
				ret.setCondition(cond);
			}
		}
		ret.getEffects().addAll(readRepairActions(contents));
		ret.getEffects().addAll(readTriggerActions(contents, policy));
		return ret;
	}
	
	public MaintenancePolicy parse (InputStream input) throws IOException
	{
		MaintenancePolicy ret = factory.createMaintenancePolicy();
		IntBuffer fileContents = codePointStream(new InputStreamReader(input));
		input.close();
		Module mod;
		do {
			mod = parseModule(fileContents, ret);
			if (mod != null)
				ret.getModules().add(mod);
		} while (mod != null);
		return ret;
	}
}