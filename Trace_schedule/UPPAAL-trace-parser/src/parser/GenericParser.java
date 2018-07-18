package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.declarations.system.InstantiationList;
import org.muml.uppaal.templates.AbstractTemplate;
import org.muml.uppaal.templates.Edge;
import parser.antlr4.UPPAALTraceBaseVisitor;
import parser.antlr4.UPPAALTraceParser.ClockContext;
import parser.antlr4.UPPAALTraceParser.ClockLHSObjectContext;
import parser.antlr4.UPPAALTraceParser.ClockLHSObjectMinusObjectContext;
import parser.antlr4.UPPAALTraceParser.ClockLHSObjectMinusZeroContext;
import parser.antlr4.UPPAALTraceParser.ClockLHSZeroMinusObjectContext;
import parser.antlr4.UPPAALTraceParser.ClocksContext;
import parser.antlr4.UPPAALTraceParser.FuncAssignmentContext;
import parser.antlr4.UPPAALTraceParser.StateContext;
import parser.antlr4.UPPAALTraceParser.SyncExprContext;
import parser.antlr4.UPPAALTraceParser.SynchronizationContext;
import parser.antlr4.UPPAALTraceParser.SystemStateContext;
import parser.antlr4.UPPAALTraceParser.SystemStatesContext;
import parser.antlr4.UPPAALTraceParser.TraceContext;
import parser.antlr4.UPPAALTraceParser.TransitionAssignmentsContext;
import parser.antlr4.UPPAALTraceParser.TransitionDelayContext;
import parser.antlr4.UPPAALTraceParser.TransitionDetailsContext;
import parser.antlr4.UPPAALTraceParser.TransitionGuardContext;
import parser.antlr4.UPPAALTraceParser.TransitionStateContext;
import parser.antlr4.UPPAALTraceParser.ValueContext;
import parser.antlr4.UPPAALTraceParser.VariableContext;
import parser.antlr4.UPPAALTraceParser.VariablesContext;
import nl.utwente.ewi.fmt.uppaalSMC.NSTA;
import uppaalTrace.LocationInstance;
import uppaalTrace.State;
import uppaalTrace.TemplateInstance;
import uppaalTrace.Trace;
import uppaalTrace.Valuation;
import uppaalTrace.clocks.AbstractClockBoundary;
import uppaalTrace.clocks.CombinedClockBoundary;
import uppaalTrace.clocks.InverseClockBoundary;
import uppaalTrace.clocks.Relation;
import uppaalTrace.clocks.SingleClockBoundary;
import uppaalTrace.transitions.AbstractTransition;
import uppaalTrace.transitions.DelayTransition;
import uppaalTrace.transitions.EdgeTransition;
import uppaalTrace.value.ArrayValue;
import uppaalTrace.value.DataVariableDeclarationValuation;
import uppaalTrace.value.StructSpecificationValue;
import uppaalTrace.value.Value;

/** A note from the author:
 * 
 *  This class and a lot of others in the package traceModel contain methods annotated 
 *  with ANTLR grammar rules that specify the specifics handled in that method.
 *  When in doubt, it might prove useful to verify the specific rule with the 
 *  grammar(UPPAALTrace.g4). Grammar rules might change during development, and updating 
 *  method specifications accordingly might be forgotten.
 * 
 * @author Jacco Brandt<j.h.brandt@student.utwente.nl>
 *
 */
public class GenericParser extends UPPAALTraceBaseVisitor<Object> {
	
	private final ArrayList<State> states = new ArrayList<State>();
	private final ArrayList<AbstractTransition> transitions = new ArrayList<AbstractTransition>(); 
	//private State visitingState = null;
	
	// a property that should be deduced on as many ways as possible
	// currently only based on DelayTransactions
	// the value of this variable is applied to all states on their construction, and accumulates during parsing.
	private float globalTime = 0;
	//private NTA uppaal;
	private MetaFactory metaFactory;
	private ArrayList<Valuation> valuations; 
	private List<TemplateInstance> sampleTemplates = new ArrayList<TemplateInstance>();
	private List<TemplateInstance> usedTemplates = new ArrayList<TemplateInstance>();
	private NSTA uppaal;
	
	public GenericParser(NSTA uppaal) {
		this.uppaal = uppaal;
		this.metaFactory = new MetaFactory();
		// load templates+locations from uppaal model
		EList<InstantiationList> instList = this.uppaal.getSystemDeclarations().getSystem().getInstantiationList();
		
		// generate sample-templates from this load
		for (int i = 0; i < instList.size(); i++) {
			EList<AbstractTemplate> temp = instList.get(i).getTemplate();
			for (int j = 0; j < temp.size(); j++) {
				this.sampleTemplates.add(this.metaFactory.createTemplateInstance(temp.get(j)));
			}
		}
	}
	public Trace buildTrace() {
		return this.metaFactory.createTrace(this.states, this.transitions, this.usedTemplates, uppaal);
	}
	
	// use this method when the parsing has been cut into different batches
	public void setGlobalTime(float globalTime) {
		this.globalTime = globalTime;
	}
	// use this method when the parsing has been cut into different batches
	public float getGlobaltime() {
		return this.globalTime;
	}
	
	// visit all states in trace
	public Void visitTrace(TraceContext ctx) {
		
		StateContext statectx;
		
		if (ctx.firstState() != null) {
			
			statectx = ctx.firstState().state();
			
			State newState = (State)this.visit(statectx);
			this.states.add(newState);
			
		}
		
		for (int i = 0; i < ctx.gotoState().size(); i++) {

			// visit state
			statectx = ctx.gotoState(i).state();
			this.states.add((State)this.visit(statectx));
			
			// add transition
			AbstractTransition newTrans = (AbstractTransition) this.visit(ctx.gotoState(i).transition());
			this.transitions .add(newTrans);
			
			// time delay? Adjust global time
			if (newTrans instanceof DelayTransition) {
				this.globalTime += ((DelayTransition) newTrans).getDelay();
				this.states.get(this.states.size()-1).setTime(this.globalTime);
			}
			
			this.states.get(this.states.size()-1).setTransitionFrom(newTrans);
			this.states.get(this.states.size()-2).setTransitionTo(newTrans);
			
			
		}
		
		return null;
	}
	/**----------------------------------TRANSITIONS-------------------------------**/
	// (stateA -> stateB \(guard; sync?; assignments\)) *
	@SuppressWarnings({"unchecked","unused"}) // my bad
	public EdgeTransition visitTransitionState(TransitionStateContext ctx) {
		
		List<Edge> edgeList = new ArrayList<Edge>();
		
		List<TransitionDetailsContext> transitionDetails = ctx.transitionDetails();
		for (int i = 0; i < transitionDetails.size(); i++) {
			// generate new sub transition and apply to list

			// states & guard
			String stateA = (String) this.visit(transitionDetails.get(i).systemState(0));
			String stateB = (String) this.visit(transitionDetails.get(i).systemState(1));
			String guard  = (String) this.visit(transitionDetails.get(i).transitionGuard());
			
			// sync optional
			List<Pair<String, Boolean>> syncs = null;
			if (transitionDetails.get(i).synchronization() != null)
				syncs = (List<Pair<String, Boolean>>) this.visit(transitionDetails.get(i).synchronization());
			
			// assignments
			Map<String, String> assignments = (Map<String, String>) visit(transitionDetails.get(i).transitionAssignments());
			String templateName = stateA.split("\\.")[0];
			String locationFrom = stateA.split("\\.", 2)[1];
			String locationTo = stateB.split("\\.", 2)[1];
			int j;
			// Find Edge and add to 'edgeList'
			thisIsBadPractice:/* Sorry, i wish we had depth-based breaks. :( */ for (j = 0; j < this.usedTemplates.size(); j++) {
				if (this.usedTemplates.get(j).getName().equals(templateName)) {
					List<ArrayList<Edge>> stepEdges = new ArrayList<ArrayList<Edge>>();
					List<Edge> possibleEdges = this.usedTemplates.get(j).getTemplate().getEdge();
					for (int edgeIterator = 0; edgeIterator < possibleEdges.size(); edgeIterator++) {
						// target/destination name matching?
						if (possibleEdges.get(edgeIterator).getSource().getName().equals(locationFrom) && 
								possibleEdges.get(edgeIterator).getTarget().getName().equals(locationTo)) {
							// this is an edge with the specified target and source attributes, 
							// if it is not unique it might prove usefull to check additional parameters, 
							// such as guard, assignment and synchronization effects.
							// however, for this prototype, we will assume it is unique
							// TODO: verify answer checking other parameters
							edgeList.add(possibleEdges.get(edgeIterator));
							break thisIsBadPractice;
						}
						// multiple edges in single transition
						else if (possibleEdges.get(edgeIterator).getSource().getName().equals(locationFrom)) {
							ArrayList<Edge> l = new ArrayList<Edge>();
							l.add(possibleEdges.get(edgeIterator));
							stepEdges.add(l);
						}
						else {
							List<ArrayList<Edge>> addToStepEdges = new ArrayList<ArrayList<Edge>>();
							for (int stepEdgesIterator = 0; stepEdgesIterator < stepEdges.size(); stepEdgesIterator++) {
								ArrayList<Edge> tList = (ArrayList<Edge>) stepEdges.get(stepEdgesIterator);
								if (tList.get(tList.size()-1).getTarget().getName().equals(possibleEdges.get(edgeIterator).getSource().getName())) {
									ArrayList<Edge> copy = new ArrayList<Edge>(tList);
									copy.add(possibleEdges.get(edgeIterator));
									addToStepEdges.add(copy);
									if (copy.get(copy.size()-1).getTarget().getName().equals(locationTo)) {
										edgeList.addAll(copy);
										break thisIsBadPractice;
									}
								}
							}
							for (int addI = 0; addI < addToStepEdges.size(); addI++) {
								stepEdges.add(addToStepEdges.get(addI));
							}
						}
					}
				}
			}
			// means that we did not find the correct template and/or matching edges
			if (j == this.usedTemplates.size()) {
				throw new RuntimeException("Could not find matching edge, please provide the correct model.");
			}
		}
		return this.metaFactory.createEdgeTransition(this.states.get(this.states.size()-2), this.states.get(this.states.size()-1), MetaFactory.fromListToArray(edgeList, new Edge[edgeList.size()]));
	}

	// time (+REAL)
	public DelayTransition visitTransitionDelay(TransitionDelayContext ctx) {
		float delayTime = Float.parseFloat(ctx.REAL().getText());
		return this.metaFactory.createDelayTransition(this.states.get(this.states.size()-2), this.states.get(this.states.size()-1), delayTime);
	}
	
	// transitionGuard: expr;
	public String visitTransitionGuard(TransitionGuardContext ctx) {
		// might be extended to include expression parsing, 
		// this is thought to be unnescessary at this moment
		return ctx.expr().getText();   
	}
	
	@SuppressWarnings("unchecked")
	public List<Pair<String, Boolean>> visitSynchronization(SynchronizationContext ctx) {
		// 0 or 1 as synchronisation means no synchronisation
		if (ctx.value() != null)
			return null;
		// get syncs
		// Pair<Name, Bool> Bool == true -> outgoing synchronization; Bool == false -> ingoing synchronization
		return (List<Pair<String, Boolean>>) visit(ctx.syncExpr());
	}
	
	@SuppressWarnings("unchecked")
	// Pair<Name, Bool> Bool == true -> outgoing synchronization; Bool == false -> ingoing synchronization
	public List<Pair<String, Boolean>> visitSyncExpr(SyncExprContext ctx) {
		
		// sub expressions
		// syncExpr = syncExpr AND syncExpr
		if (ctx.syncExpr().size() == 2) {
			List<Pair<String, Boolean>> sub0 = (List<Pair<String, Boolean>>) visit(ctx.syncExpr(0));
			List<Pair<String, Boolean>> sub1 = (List<Pair<String, Boolean>>) visit(ctx.syncExpr(1));
			List<Pair<String, Boolean>> res  = new ArrayList<Pair<String, Boolean>>(sub0.size() + sub1.size());
			res.addAll(sub0);
			res.addAll(sub1);
			return res;
		}
		
		// one synchronization
		// syncExpr = OBJECTREF EXCL? | OBJECTREF QM
		List<Pair<String, Boolean>> res = new ArrayList<Pair<String, Boolean>>(1);
		res.add(new Pair<String, Boolean>(ctx.OBJECTREF().getText(), (Boolean) (ctx.QM() == null)));
		return res;
	}
	
	public Map<String, String> visitTransitionAssignments(TransitionAssignmentsContext ctx) {
		HashMap<String, String> assignments = new HashMap<String, String>();
		if (ctx.assignments() != null) {
			for(int i = 0; i < ctx.assignments().assignment().size(); i++) {
				String value = null;
				if (ctx.assignments().assignment(i).value() != null) {
					value = (String) visit(ctx.assignments().assignment(i).value());
				}
				else if (ctx.assignments().assignment(i).expr() != null) {
					value = ctx.assignments().assignment(i).expr().getText();
				} else {
					System.out.println("Could not determine value of assignment: " + ctx.assignments().assignment(i).OBJECTREF().getText() + " - in method GenericParser:visitTransitionsAssignment");
				}
				assignments.put(ctx.assignments().assignment(i).OBJECTREF().getText(), value);
			
			}
			for(int i = 0; i < ctx.assignments().funcAssignment().size(); i++) {
				assignments.put((String) visit(ctx.assignments().funcAssignment(i)), null);
			}
		}
		if (ctx.variables() != null) {
			for(int i = 0; i < ctx.variables().variable().size(); i++) {
				assignments.put(ctx.variables().variable(i).OBJECTREF().getText(), (String) visit(ctx.variables().variable(i).value()));
			}
		}
		return assignments;
	}
	
	/**----------------------------------STATES-------------------------------------**/
	// (systemStates; variables; clocks)
	@SuppressWarnings("unchecked")
	public State visitState(StateContext ctx) {
		
		String[] states = (String[]) visit(ctx.systemStates());
		Valuation[] valuations = MetaFactory.fromListToArray((List<Valuation>)visit(ctx.variables()));
		TemplateInstance[] stateTemplates = new TemplateInstance[states.length];
		LocationInstance[] stateLocations = new LocationInstance[states.length];
		

		// match all locations (& create new instances of template, if necessary)
		for (int i = 0; i < states.length; i++) {
			String[] stateParts = states[i].split("\\.", 2);
			// do we know this template?
			for (int j = 0; j < this.usedTemplates.size(); j++) {
				if (this.usedTemplates.get(j).getName().equals(stateParts[0])) {
					stateTemplates[i] = this.usedTemplates.get(j);
				}
			}
			
			// nope, we don't. Can we learn?
			if (stateTemplates[i] == null) {
				String lookforName = stateParts[0];
				if (lookforName.contains("(")) {//parameterized template? (door(1).location)
					lookforName = lookforName.split("\\(")[0];
				}
				for (int j = 0; j < this.sampleTemplates.size(); j++) {
					if (this.sampleTemplates.get(j).getName().equals(lookforName)) { // Yes, we can!
						stateTemplates[i] = this.metaFactory.createdNamedTemplateIntance(this.sampleTemplates.get(j), states[i]);
						this.usedTemplates.add(stateTemplates[i]);
					}
				}
			}
			// no we can't! :(
			if (stateTemplates[i] == null)
				throw new RuntimeException("Cannot find a template matching location: " + states[i] + ", please provide the model corresponding to your output");

			// find matching location
			for (int j = 0; j < stateTemplates[i].getLocations().size(); j++) {
				if (stateTemplates[i].getLocations().get(j).getLocation().getName().equals(stateParts[1])) { // found a matching location
					stateLocations[i] = stateTemplates[i].getLocations().get(j);
				}
			}
			// couldn't find it
			if (stateLocations[i] == null)
				throw new RuntimeException("Cannot find a location matching: " + states[i] + ", please provide the correct model");
				
		}

		// visit and save clocks
		AbstractClockBoundary[] clocks = (AbstractClockBoundary[])visit(ctx.clocks());
		return this.metaFactory.createState(stateTemplates, stateLocations, clocks, valuations, this.globalTime);
	}
	
	/**----------------------------------VARIABLES----------------------------------**/
	// get all variable values in hashmap 
	public List<Valuation> visitVariables(VariablesContext ctx) {
		this.valuations = new ArrayList<Valuation>();
		
		// loop over variables and assign value
		int length = ctx.variable().size();
		for (int i = 0; i < length; i++) {
			Valuation val = (Valuation) this.visit(ctx.variable(i));
			if (val == null) {
				System.out.println("invalid ANTLR-visit method implementation for " + ctx.variable(i).getText());
			} else if (this.valuations.contains(val) == false) {// no duplicates(array/structs)
				this.valuations.add(val);
			}
		}
		
		return this.valuations;
	}
	// variable => OBJECTREF EQ value
	public Valuation visitVariable(VariableContext ctx) {
		String object = ctx.OBJECTREF().getText();
		Value resVal  = null;
		Valuation val = null;
		ValueContext value = ctx.value(); // value => BOOL | REAL
		TemplateInstance tmpInstance = null;
		
		// template or global?
		if (object.contains(".")) {
			String[] seperated = object.split("\\.",2);
			for (int i = 0; i < this.usedTemplates.size() && tmpInstance == null; i++) {
				// first dot is a template?
				if (this.usedTemplates.get(i).getName().equals(seperated[0])) {
					tmpInstance = this.usedTemplates.get(i);
				}
			}
			
			// remove template name
			object = seperated[1];
		}
		
		// struct?
		if (object.contains(".")) {
			String[] seperated = object.split("\\.",2);
			for (int i = 0; i < this.valuations.size(); i++) {
				// already has parent of this struct?
				if (this.valuations.get(i).getName().equals(seperated[0]) && 
						this.valuations.get(i).getTemplate() != null &&
						this.valuations.get(i).getTemplate().equals(tmpInstance)) {
					val = this.valuations.get(i);
				}
			}
			if (val == null) {
				Value structValue = this.metaFactory.createStructSpecificationValue(new DataVariableDeclarationValuation[0]);
				val = this.metaFactory.createValuation(seperated[0], structValue, tmpInstance);
			}
			object = seperated[1];
		}
		
		// array?
		if (object.contains("[") && object.indexOf("]") > object.indexOf("[")) {
			// verifyta and libutap always output variables in ascending order. No need to double-check that here!
			String[] seperated = object.split("\\[",2);
			for (int i = 0; i < this.valuations.size(); i++) {
				// already has parent of this struct?
				if (this.valuations.get(i).getName().equals(seperated[0]) && 
						(
								(
										this.valuations.get(i).getTemplate() != null && 
										this.valuations.get(i).getTemplate().equals(tmpInstance)
								) || (
									this.valuations.get(i).getTemplate() == null && tmpInstance == null	
								)
						)) {
					val = this.valuations.get(i);
				}
			}
			if (val == null) {
				Value arrayValue = this.metaFactory.createArrayValue(new Value[0]);
				val = this.metaFactory.createValuation(seperated[0], arrayValue, tmpInstance);
			}
		}
		
		if (value.BOOL() != null ){
			resVal = this.metaFactory.createBoolValue(value.BOOL().getText().toLowerCase().equals("true"));
		}
		else if (value.REAL() != null) {
			if (value.REAL().getText().contains(".")) { // clockvalue
				resVal = this.metaFactory.createClockValue(Float.parseFloat(value.getText()));
			} else {
				resVal = this.metaFactory.createIntValue(Integer.parseInt(value.getText()));
			}
		} else {
			throw new RuntimeException("Variable with unknown value, please add to GenericParser.java:visitVariable."); 
		}
		
		// either struct or array
		if (val != null) {
			Valuation subValuation = this.metaFactory.createValuation(object, resVal, tmpInstance);
			
			// struct
			if (val.getValue() instanceof StructSpecificationValue) {
				this.metaFactory.addValuationToStructValue((StructSpecificationValue) val.getValue(), subValuation);
			// array
			} else {
				this.metaFactory.addItemToArrayValue((ArrayValue) val.getValue(), resVal);
			}
			return val;
		}
		
		return this.metaFactory.createValuation(object, resVal, tmpInstance);
	}
	
	/**----------------------------------CLOCKS -----------------------------------**/
	// clocks => clock*?
	public AbstractClockBoundary[] visitClocks(ClocksContext ctx) {
		int length = ctx.clock().size();
		AbstractClockBoundary[] res = new AbstractClockBoundary[length];
		for (int i = 0; i < length; i++) {
			// visitClock(ClockContext) appends itself to the currently visiting state,
			// so there is no need to handle result values
			res[i] = (AbstractClockBoundary) visit(ctx.clock(i));
		}

		return res;
	}
	
	// clock => (clockLHS; relation; REAL)
	public AbstractClockBoundary visitClock(ClockContext ctx) {
	
		AbstractClockBoundary clock = (AbstractClockBoundary) visit(ctx.clockLHS());
		
		// defer relation and value
		String rel = ctx.relation().getText();
		Relation relation = null;
		switch(rel) {
		case "=": 
			// this should not occur, but got it covered anyways
			System.out.println("Something could be wrong with the output, clock relation '=' has been detected. Should be '=='. Continuing...");
		case "==":
			relation = Relation.EQ;
			break;
		case "!=":
			relation = Relation.NE;
			break;
		case "<":
			relation = Relation.LT;
			break;
		case "<=": // in all seen examples, this is the only actually relation witnessed
			relation = Relation.LE;
			break;
		case ">":
			relation = Relation.GT;
			break;
		case ">=":
			relation = Relation.GE;
			break;
		default: // its not ok
			throw new RuntimeException("Unregistered operant: " + ctx.relation().getText() + ", please add to grammar rule 'relation' and apply in traceModel.Clock.Relation.");
		}
		
		float value = Float.valueOf(ctx.REAL().getText());
		
		clock.setRelation(relation);
		clock.setValue(value);
		
		return clock;
	}
	
	// visitClockLHS(ClockLHSContext ctx) is implemented through the following 4 methods
	// ClockLHS => T(0) - OBJECTREF
	public InverseClockBoundary visitClockLHSZeroMinusObject(ClockLHSZeroMinusObjectContext ctx) {
		String clock = ctx.OBJECTREF().getText(); 
		//TODO: Find me ctx.OBJECTREF().getText();, and change String reference to Uppaal model reference 
		return this.metaFactory.createInverseClockBoundary(clock);
	}
	// ClockLHS => OBJECTREF - T(0)
	public SingleClockBoundary visitClockLHSObjectMinusZero(ClockLHSObjectMinusZeroContext ctx) {
		String clock = ctx.OBJECTREF().getText(); 
		//TODO: Find me ctx.OBJECTREF().getText(); as definition, and change String reference to Uppaal model reference 
		return this.metaFactory.createSingleClockBoundary(clock);
	}
	// ClockLHS => OBJECTREF
	public SingleClockBoundary visitClockLHSObject(ClockLHSObjectContext ctx) {
		String clock = ctx.OBJECTREF().getText(); 
		//TODO: Find me ctx.OBJECTREF().getText();, and change String reference to Uppaal model reference 
		return this.metaFactory.createSingleClockBoundary(clock);
	}
	 
	// ClockLHS => OBJECTREF - OBJECTREF
	public CombinedClockBoundary visitClockLHSObjectMinusObject(ClockLHSObjectMinusObjectContext ctx) {
		String minuend = ctx.OBJECTREF(0).getText(); 
		//TODO: Find me  ctx.OBJECTREF(0).getText();, and change String reference to Uppaal model reference 
		String substrahend = ctx.OBJECTREF(1).getText(); 
		//TODO: Find me  ctx.OBJECTREF(1).getText();, and change String reference to Uppaal model reference 
		return this.metaFactory.createCombinedClockBoundary(minuend, substrahend);
	}
	/**----------------------------------RULES TO STRINGS------------------------------**/
	
	public String visitFuncAssignment(FuncAssignmentContext ctx) {
		return ctx.getText();
	}
	
	// multiple system states to string array
	public String[] visitSystemStates(SystemStatesContext ctx) {
		int length = ctx.systemState().size();
		String[] states = new String[length ];
		for (int i = 0; i < length; i++)
			states[i] = (String) visit(ctx.systemState(i));
		
		return states;
	}
	
	// single system state to string
	public String visitSystemState(SystemStateContext ctx) {
		return ctx.OBJECTREF().getText();
	}
	
	// value => BOOL|REAL; to string
	public String visitValue(ValueContext ctx) {
		if (ctx.BOOL() != null)
			return ctx.BOOL().getText();
		return ctx.REAL().getText();
	}
	
}
