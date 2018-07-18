package parser;


import java.lang.reflect.Array;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.muml.uppaal.declarations.DataVariableDeclaration;
import org.muml.uppaal.templates.AbstractTemplate;
import org.muml.uppaal.templates.Edge;
import org.muml.uppaal.templates.Location;
import org.muml.uppaal.templates.RedefinedTemplate;
import org.muml.uppaal.templates.Template;
import org.muml.uppaal.templates.TemplatesPackage;
import org.muml.uppaal.templates.impl.TemplatesFactoryImpl;

import nl.utwente.ewi.fmt.uppaalSMC.NSTA;
import uppaalTrace.LocationInstance;
import uppaalTrace.State;
import uppaalTrace.TemplateInstance;
import uppaalTrace.Trace;
import uppaalTrace.UppaalTraceFactory;
import uppaalTrace.Valuation;
import uppaalTrace.clocks.AbstractClockBoundary;
import uppaalTrace.clocks.ClocksFactory;
import uppaalTrace.clocks.ClocksPackage;
import uppaalTrace.clocks.CombinedClockBoundary;
import uppaalTrace.clocks.InverseClockBoundary;
import uppaalTrace.clocks.SingleClockBoundary;
import uppaalTrace.clocks.impl.ClocksPackageImpl;
import uppaalTrace.impl.UppaalTracePackageImpl;
import uppaalTrace.transitions.AbstractTransition;
import uppaalTrace.transitions.DelayTransition;
import uppaalTrace.transitions.EdgeTransition;
import uppaalTrace.transitions.TransitionsFactory;
import uppaalTrace.transitions.TransitionsPackage;
import uppaalTrace.transitions.impl.TransitionsPackageImpl;
import uppaalTrace.value.ArrayValue;
import uppaalTrace.value.BoolValue;
import uppaalTrace.value.ChanValue;
import uppaalTrace.value.ClockValue;
import uppaalTrace.value.DataVariableDeclarationValuation;
import uppaalTrace.value.IntValue;
import uppaalTrace.value.RangeSpecificationValue;
import uppaalTrace.value.ScalarSpecificationValue;
import uppaalTrace.value.StructSpecificationValue;
import uppaalTrace.value.Value;
import uppaalTrace.value.ValueFactory;
import uppaalTrace.value.VoidValue;
import uppaalTrace.value.impl.ValuePackageImpl;


public class MetaFactory {

	private TransitionsFactory transitionsFactory;
	private UppaalTraceFactory factory;
	private ClocksFactory clocksFactory;
	private ValueFactory valuesFactory;


	public MetaFactory() {
		factory = (UppaalTraceFactory) UppaalTracePackageImpl.eINSTANCE.getEFactoryInstance();
		transitionsFactory = (TransitionsFactory) TransitionsPackageImpl.eINSTANCE.getEFactoryInstance();
		clocksFactory = (ClocksFactory) ClocksPackageImpl.eINSTANCE.getEFactoryInstance();
		valuesFactory = (ValueFactory) ValuePackageImpl.eINSTANCE.getEFactoryInstance();
	}
	
	public Trace createTrace(List<State> states, List<AbstractTransition> transitions, List<TemplateInstance> templates, NSTA nsta) {
		Trace res = this.factory.createTrace();

		res.setNSTA(nsta);
		
		State[] stateArray = MetaFactory.fromListToArray(states);
		UnmodifiableEList<State> eListStates = new EcoreEList.UnmodifiableEList<State>(
				(InternalEObject) res, 
				sFeature.STATE, 
				stateArray.length, 
				stateArray
			);
		res.eSet(sFeature.TRACE__STATES, eListStates);

		AbstractTransition[] transArray = MetaFactory.fromListToArray(transitions, new AbstractTransition[transitions.size()]);
		UnmodifiableEList<AbstractTransition> eListTrans = new EcoreEList.UnmodifiableEList<AbstractTransition>(
				(InternalEObject) res, 
				sFeature.Transitions.ABSTRACT_TRANSITION, 
				transArray.length, 
				transArray
			);
		res.eSet(sFeature.TRACE__TRANSITIONS, eListTrans);

		TemplateInstance[] templArray = MetaFactory.fromListToArray(templates, new TemplateInstance[templates.size()]);
		UnmodifiableEList<TemplateInstance> eListTempl = new EcoreEList.UnmodifiableEList<TemplateInstance>(
				(InternalEObject) res, 
				sFeature.TEMPLATE_INSTANCE, 
				templArray.length, 
				templArray
			);
		res.eSet(sFeature.TRACE__TEMPLATES, eListTempl);
		
		return res;
	}
	
	protected LocationInstance createLocationInstance(Location location, TemplateInstance parent) {
		LocationInstance res = factory.createLocationInstance();
		res.setLocation(location);
		res.setTemplate(parent);
		return res;
	}
	
	public TemplateInstance createNamedTemplateInstance(AbstractTemplate template, String name) {
		TemplateInstance res = this.createTemplateInstance(template);
		res.setName(name);
		return res;
	}
	
	/**
	 * clock RELATION value, OR clock - t(0) RELATION value
	 * @param clock
	 * @return
	 */
	public SingleClockBoundary createSingleClockBoundary(String clock) {
		SingleClockBoundary res = this.clocksFactory.createSingleClockBoundary();
		res.setTarget(clock);
		return res;
	}
	/**
	 * t(0) - clock RELATION value
	 * @param clock
	 * @return
	 */
	public InverseClockBoundary createInverseClockBoundary(String clock) {
		InverseClockBoundary res = this.clocksFactory.createInverseClockBoundary();
		res.setTarget(clock);
		return res;
	}
	/**
	 * minuend - substrahend RELATION value
	 * @param minuend
	 * @param substrahend
	 * @return
	 */
	public CombinedClockBoundary createCombinedClockBoundary(String minuend, String substrahend) {
		CombinedClockBoundary res = this.clocksFactory.createCombinedClockBoundary();
		res.setTarget(minuend);
		res.setSubtrahend(substrahend);
		return res;
	}
	
	public TemplateInstance createdNamedTemplateIntance(TemplateInstance template, String name) {
		TemplateInstance res = this.factory.createTemplateInstance();
		// copy locations into new EList
		EList<LocationInstance> locations = template.getLocations();
		LocationInstance[] copyLocations = new LocationInstance[locations.size()];
		for (int i = 0; i < locations.size(); i++) {
			copyLocations[i] =  this.createLocationInstance(locations.get(i).getLocation(), res);
		}
		UnmodifiableEList<LocationInstance> eList = new EcoreEList.UnmodifiableEList<LocationInstance>(
				(InternalEObject) res, 
				sFeature.LOCATION_INSTANCE, 
				copyLocations.length, 
				copyLocations
			);
		// set & return
		res.eSet(sFeature.TEMPLATE_INSTANCE__LOCATIONS, eList);
		res.setTemplate(template.getTemplate());
		String[] nameParts = name.split("\\.", 2);
		res.setName(nameParts[0]);
		return res;
	}
	
	public TemplateInstance createTemplateInstance(org.muml.uppaal.templates.AbstractTemplate template) {
		// create templateInstance
		Template locProvider = null;
		// list of locations -> list of locationInstances
		if (template instanceof Template) {
			locProvider = (Template)template;
		} else if(template instanceof RedefinedTemplate) {
			AbstractTemplate temp = template;
			while (temp instanceof RedefinedTemplate) {
				temp = ((RedefinedTemplate) temp).getReferredTemplate();
			}
			if (false == (temp instanceof Template)) {
				throw new RuntimeException("MetaFactory.java implementation is incomplete, please add handling of class " +temp.getClass());
			}
			locProvider = (Template)temp;
		} else {
			throw new RuntimeException("MetaFactory.java implementation is incomplete, please add handling of class " +template.getClass());
		}
		
		TemplateInstance res = factory.createTemplateInstance();
		EList<Location> locations = locProvider.getLocation();
		LocationInstance[] locationInstances = new LocationInstance[locations.size()];
		for (int i = 0; i < locations.size(); i++) {
			locationInstances[i] = this.createLocationInstance(locations.get(i), res);
		}
		// create EList
		UnmodifiableEList<LocationInstance> eList = new EcoreEList.UnmodifiableEList<LocationInstance>(
				(InternalEObject) res, 
				sFeature.LOCATION_INSTANCE, 
				locationInstances.length, 
				locationInstances
			);
		// add list to templateInstance
		res.setTemplate(locProvider);
		res.setName(template.getName());
		res.eSet(sFeature.TEMPLATE_INSTANCE__LOCATIONS, eList);
		return res;
	}

	public Valuation createValuation(String name, Value value, TemplateInstance tmpInstance){//TODO: , Variable varRef) {
		Valuation res = this.factory.createValuation();
		res.setName(name);
		res.setVariable(null); // reference
		res.setValue(value);
		res.setTemplate(tmpInstance);
		return res;
	}
	


	public BoolValue createBoolValue(boolean value) {
		BoolValue res = this.valuesFactory.createBoolValue();
		res.setValue(value);
		return res;
	}
	public IntValue createIntValue(int value) {
		IntValue res = this.valuesFactory.createIntValue();
		res.setValue(value);
		return res;
	}
	public ClockValue createClockValue(float value) {
		ClockValue res = this.valuesFactory.createClockValue();
		res.setValue(value);
		return res;
	}
	public ChanValue createCharValue() {
		return this.valuesFactory.createChanValue();
	}
	public VoidValue createVoidValue() {
		return this.valuesFactory.createVoidValue();
	}
	
	public ArrayValue createArrayValue(Value[] value) {
		ArrayValue res = this.valuesFactory.createArrayValue();
		UnmodifiableEList<Value> eList = new EcoreEList.UnmodifiableEList<Value>(
				(InternalEObject) res, 
				sFeature.Values.VALUE, 
				value.length, 
				value
		);
		res.eSet(sFeature.Values.ARRAY_VALUE__VALUE, eList);
		return res;
	}
	public ScalarSpecificationValue createScalarSpecificationValue(IntValue value) {
		ScalarSpecificationValue res = this.valuesFactory.createScalarSpecificationValue();
		res.setValue(value);
		return res;
	}

	public StructSpecificationValue createStructSpecificationValue(DataVariableDeclarationValuation[] value) {
		StructSpecificationValue res = this.valuesFactory.createStructSpecificationValue();
		UnmodifiableEList<DataVariableDeclarationValuation> eList = new EcoreEList.UnmodifiableEList<DataVariableDeclarationValuation>(
				(InternalEObject) res, 
				sFeature.Values.DATA_VARIABLE_DECLARATION_VALUATION, 
				value.length, 
				value
		);
		res.eSet(sFeature.Values.STRUCT_SPECIFICATION_VALUE__VALUE, eList);
		return res;
	}
	
	public DataVariableDeclarationValuation createDataVariableDeclarationValuation(DataVariableDeclaration dataVariableDeclaration, Valuation[] valuations) {
		DataVariableDeclarationValuation res = this.valuesFactory.createDataVariableDeclarationValuation();
		res.setDataVariableDeclaration(dataVariableDeclaration);
		UnmodifiableEList<Valuation> eList = new EcoreEList.UnmodifiableEList<Valuation>(
				(InternalEObject) res, 
				sFeature.VALUATION, 
				valuations.length, 
				valuations
		);
		res.eSet(sFeature.Values.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION, eList);
		return res;
	}

	public void addValuationToStructValue(StructSpecificationValue val, Valuation subValuation) {
		List<DataVariableDeclarationValuation> data = val.getValue();
		DataVariableDeclarationValuation[] array = MetaFactory.fromListToArray(data, new DataVariableDeclarationValuation[data.size() + 1]);
		Valuation[] items = new Valuation[1];
		items[0] = subValuation;
		array[array.length-1] = this.createDataVariableDeclarationValuation(null, items);//TODO: link datavariabledecleration!
		UnmodifiableEList<DataVariableDeclarationValuation> eList = new EcoreEList.UnmodifiableEList<DataVariableDeclarationValuation>(
				(InternalEObject) val, 
				sFeature.Values.DATA_VARIABLE_DECLARATION_VALUATION, 
				array.length, 
				array
		);
		val.eSet(sFeature.Values.STRUCT_SPECIFICATION_VALUE__VALUE, eList);
	}
	
	public void addItemToArrayValue(ArrayValue val, Value subValuation) {
		
		Value[] values = MetaFactory.fromListToArray(val.getValue(), new Value[val.getValue().size() + 1]);
		values[values.length - 1] = subValuation;
		UnmodifiableEList<Value> eList = new EcoreEList.UnmodifiableEList<Value>(
				(InternalEObject) val, 
				sFeature.Values.VALUE, 
				values.length, 
				values
		);
		val.eSet(sFeature.Values.ARRAY_VALUE__VALUE, eList);
	}

	public RangeSpecificationValue createRangeSpecificationValue(IntValue value) {
		RangeSpecificationValue res = this.valuesFactory.createRangeSpecificationValue();
		res.setValue(value);
		return res;
	}
	
	// main createState-method
	public State createState(TemplateInstance[] templates, LocationInstance[] locations, AbstractClockBoundary[] clocks, Valuation[] valuations, float time) {
		// create state and add time
		State res = factory.createState();
		res.setTime(time);
		// create EList of templates, locations and clocks
		UnmodifiableEList<LocationInstance> eListLoc = new EcoreEList.UnmodifiableEList<LocationInstance>(
				(InternalEObject) res, 
				sFeature.LOCATION_INSTANCE, 
				locations.length, 
				locations
			);

		UnmodifiableEList<TemplateInstance> eListTem = new EcoreEList.UnmodifiableEList<TemplateInstance>(
				(InternalEObject) res, 
				sFeature.TEMPLATE_INSTANCE, 
				templates.length, 
				templates
			);

		UnmodifiableEList<AbstractClockBoundary> eListClock = new EcoreEList.UnmodifiableEList<AbstractClockBoundary>(
				(InternalEObject) res, 
				sFeature.Clocks.ABSTRACT_CLOCK_BOUNDARY, 
				clocks.length, 
				clocks
			);

		UnmodifiableEList<Valuation> eListVars = new EcoreEList.UnmodifiableEList<Valuation>(
				(InternalEObject) res, 
				sFeature.VALUATION, 
				valuations.length, 
				valuations
			);
		// set EList as state property
		res.eSet(sFeature.STATE__TEMPLATES, eListTem);
		res.eSet(sFeature.STATE__LOCATIONS, eListLoc);
		res.eSet(sFeature.STATE__CLOCKS, eListClock);
		res.eSet(sFeature.STATE__VALUATIONS, eListVars);
		
		return res;
	}
	
	public DelayTransition createDelayTransition(State source, State target, float delay) {
		DelayTransition res = transitionsFactory.createDelayTransition();
		res.setSource(source);
		res.setTarget(target);
		res.setDelay(delay);
		return res;
	}
	
	public EdgeTransition createEdgeTransition(State source, State target, Edge[] edges) {
		EdgeTransition res = transitionsFactory.createEdgeTransition();
		res.setSource(source);
		res.setTarget(target);
		// create list of 'uppaal' edges
		UnmodifiableEList<Edge> eList = new EcoreEList.UnmodifiableEList<Edge>(
				(InternalEObject) res, 
				TemplatesFactoryImpl.eINSTANCE.eClass().getEStructuralFeature(TemplatesPackage.EDGE), 
				edges.length, 
				edges
			);
		res.eSet(sFeature.Transitions.EDGE_TRANSITION__EDGES, eList);
		return res;
	}
	
	// this method is required because Java is being bitchy, 
	// when casting Collection<T> to array using (T[]) col.toArray() the result is not of type (parentClass of T)[] 
	@SuppressWarnings("unchecked")
	public static <T extends Object> T[] fromListToArray(List<T> list) {
		if (list.size() == 0) {
			System.out.println("MetaFactory:fromListToArray needed to provide an empty array of generic type, if any ClassCastExceptions are found, this is probably the issue.");
			return (T[]) new Object[0];
		}
		T[] res = (T[]) Array.newInstance(list.get(0).getClass(), list.size());
		return fromListToArray(list, res);
	}
	
	protected static <T extends B, B> B[] fromListToArray(List<T> list, B[] array) {
		if (list.size() > array.length) {
			System.out.println("Array and list lengths do not match, returning null in MetaFactory:fromListToArray(List, Array)");
			return null;
		}
		
		for (int i = 0; i < list.size(); i++)
			array[i] = list.get(i);
		
		return array;
	}
	
	/** Short-hand used to avoid unnecessary long statements in the parent class */
	public static class sFeature {
		public final static EStructuralFeature STATE__TEMPLATES = UppaalTracePackageImpl.eINSTANCE.getState_Templates();
		public final static EStructuralFeature STATE__LOCATIONS = UppaalTracePackageImpl.eINSTANCE.getState_Locations();
		public final static EStructuralFeature STATE__CLOCKS    = UppaalTracePackageImpl.eINSTANCE.getState_Clocks();
		public final static EStructuralFeature STATE__VALUATIONS = UppaalTracePackageImpl.eINSTANCE.getState_Valuations();
		public final static EStructuralFeature TEMPLATE_INSTANCE = getEStructuralFeature(UppaalTracePackageImpl.eINSTANCE.getTemplateInstance());
		public final static EStructuralFeature TEMPLATE_INSTANCE__LOCATIONS = UppaalTracePackageImpl.eINSTANCE.getTemplateInstance_Locations();//getEStructuralFeature(UppaalTracePackageImpl.TEMPLATE_INSTANCE__LOCATIONS);
		public final static EStructuralFeature LOCATION_INSTANCE = getEStructuralFeature(UppaalTracePackageImpl.eINSTANCE.getLocationInstance());
		public final static EStructuralFeature STATE			  = getEStructuralFeature(UppaalTracePackageImpl.eINSTANCE.getState());
		public final static EStructuralFeature TRACE__STATES	  = UppaalTracePackageImpl.eINSTANCE.getTrace_States();
		public final static EStructuralFeature TRACE__TRANSITIONS = UppaalTracePackageImpl.eINSTANCE.getTrace_Transitions();
		public static final EStructuralFeature TRACE__TEMPLATES   = UppaalTracePackageImpl.eINSTANCE.getTrace_Templates();
		public final static EStructuralFeature VALUATION		  = getEStructuralFeature(UppaalTracePackageImpl.eINSTANCE.getValuation());
		
		protected static EStructuralFeature getEStructuralFeature(EClass eClass) {
			
			EList<EStructuralFeature> tmp = eClass.eClass().getEAllStructuralFeatures();
			for (EStructuralFeature esf : tmp) {
				Object o = eClass.eGet(esf);
				if (o instanceof Class ) {
					return esf;
				}
			}
			
			System.out.println("Cannot find EStructuralFeature for eClass: " + eClass.toString());
			return null;
		}
		
		public static class Transitions {
			
			public final static EStructuralFeature ABSTRACT_TRANSITION = getEStructuralFeature(TransitionsPackage.eINSTANCE.getAbstractTransition());
			public final static EStructuralFeature EDGE_TRANSITION__EDGES = TransitionsPackageImpl.eINSTANCE.getEdgeTransition_Edges();

		}
		
		public static class Clocks {
			
			public final static EStructuralFeature ABSTRACT_CLOCK_BOUNDARY = getEStructuralFeature(ClocksPackage.eINSTANCE.getAbstractClockBoundary());
		}
		
		public static class Values {
			public static final EStructuralFeature DATA_VARIABLE_DECLARATION_VALUATION__VALUATION = ValuePackageImpl.eINSTANCE.getDataVariableDeclarationValuation_Valuation();
			public static final EStructuralFeature STRUCT_SPECIFICATION_VALUE__VALUE = ValuePackageImpl.eINSTANCE.getScalarSpecificationValue_Value();
			public static final EStructuralFeature DATA_VARIABLE_DECLARATION_VALUATION = getEStructuralFeature(ValuePackageImpl.eINSTANCE.getDataVariableDeclarationValuation());
			public static final EStructuralFeature ARRAY_VALUE__VALUE = ValuePackageImpl.eINSTANCE.getArrayValue_Value();
			public final static EStructuralFeature VALUE = getEStructuralFeature(ValuePackageImpl.eINSTANCE.getValue());
			
		}
		
	}
	// string class selector:
	// EcoreFactoryImpl.eINSTANCE.eClass().getEStructuralFeature(EcorePackage.ESTRING)
}
