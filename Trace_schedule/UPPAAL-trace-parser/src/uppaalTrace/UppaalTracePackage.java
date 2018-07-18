/**
 */
package uppaalTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uppaalTrace.UppaalTraceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' uppaal='http://www.muml.org/uppaal/1.0.0#/' uppaalSMC='http://fmt.ewi.utwente.nl/FMT/AFTModel/uppaalSMC#/'"
 * @generated
 */
public interface UppaalTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uppaalTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fmt.ewi.utwente.nl/FMT/AFTModel/uppaalTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uppaalTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UppaalTracePackage eINSTANCE = uppaalTrace.impl.UppaalTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link uppaalTrace.impl.TemplateInstanceImpl <em>Template Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.impl.TemplateInstanceImpl
	 * @see uppaalTrace.impl.UppaalTracePackageImpl#getTemplateInstance()
	 * @generated
	 */
	int TEMPLATE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Template Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uppaalTrace.impl.LocationInstanceImpl <em>Location Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.impl.LocationInstanceImpl
	 * @see uppaalTrace.impl.UppaalTracePackageImpl#getLocationInstance()
	 * @generated
	 */
	int LOCATION_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE__TEMPLATE = 1;

	/**
	 * The number of structural features of the '<em>Location Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uppaalTrace.impl.ValuationImpl <em>Valuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.impl.ValuationImpl
	 * @see uppaalTrace.impl.UppaalTracePackageImpl#getValuation()
	 * @generated
	 */
	int VALUATION = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__TEMPLATE = 4;

	/**
	 * The number of structural features of the '<em>Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link uppaalTrace.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.impl.StateImpl
	 * @see uppaalTrace.impl.UppaalTracePackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Transition To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_TO = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Valuations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VALUATIONS = 2;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CLOCKS = 3;

	/**
	 * The feature id for the '<em><b>Transition From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_FROM = 4;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TEMPLATES = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TIME = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link uppaalTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.impl.TraceImpl
	 * @see uppaalTrace.impl.UppaalTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES = 0;

	/**
	 * The feature id for the '<em><b>NSTA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NSTA = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TEMPLATES = 3;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link uppaalTrace.TemplateInstance <em>Template Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Instance</em>'.
	 * @see uppaalTrace.TemplateInstance
	 * @generated
	 */
	EClass getTemplateInstance();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.TemplateInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see uppaalTrace.TemplateInstance#getTemplate()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EReference getTemplateInstance_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link uppaalTrace.TemplateInstance#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see uppaalTrace.TemplateInstance#getLocations()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EReference getTemplateInstance_Locations();

	/**
	 * Returns the meta object for the attribute '{@link uppaalTrace.TemplateInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uppaalTrace.TemplateInstance#getName()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EAttribute getTemplateInstance_Name();

	/**
	 * Returns the meta object for class '{@link uppaalTrace.LocationInstance <em>Location Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Instance</em>'.
	 * @see uppaalTrace.LocationInstance
	 * @generated
	 */
	EClass getLocationInstance();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.LocationInstance#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see uppaalTrace.LocationInstance#getLocation()
	 * @see #getLocationInstance()
	 * @generated
	 */
	EReference getLocationInstance_Location();

	/**
	 * Returns the meta object for the container reference '{@link uppaalTrace.LocationInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see uppaalTrace.LocationInstance#getTemplate()
	 * @see #getLocationInstance()
	 * @generated
	 */
	EReference getLocationInstance_Template();

	/**
	 * Returns the meta object for class '{@link uppaalTrace.Valuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuation</em>'.
	 * @see uppaalTrace.Valuation
	 * @generated
	 */
	EClass getValuation();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.Valuation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see uppaalTrace.Valuation#getVariable()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Variable();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.Valuation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uppaalTrace.Valuation#getType()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Type();

	/**
	 * Returns the meta object for the attribute '{@link uppaalTrace.Valuation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uppaalTrace.Valuation#getName()
	 * @see #getValuation()
	 * @generated
	 */
	EAttribute getValuation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uppaalTrace.Valuation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see uppaalTrace.Valuation#getValue()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Value();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.Valuation#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see uppaalTrace.Valuation#getTemplate()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Template();

	/**
	 * Returns the meta object for class '{@link uppaalTrace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see uppaalTrace.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.State#getTransitionTo <em>Transition To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition To</em>'.
	 * @see uppaalTrace.State#getTransitionTo()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_TransitionTo();

	/**
	 * Returns the meta object for the reference list '{@link uppaalTrace.State#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see uppaalTrace.State#getLocations()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link uppaalTrace.State#getValuations <em>Valuations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valuations</em>'.
	 * @see uppaalTrace.State#getValuations()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Valuations();

	/**
	 * Returns the meta object for the containment reference list '{@link uppaalTrace.State#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see uppaalTrace.State#getClocks()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Clocks();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.State#getTransitionFrom <em>Transition From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition From</em>'.
	 * @see uppaalTrace.State#getTransitionFrom()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_TransitionFrom();

	/**
	 * Returns the meta object for the reference list '{@link uppaalTrace.State#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Templates</em>'.
	 * @see uppaalTrace.State#getTemplates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Templates();

	/**
	 * Returns the meta object for the attribute '{@link uppaalTrace.State#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see uppaalTrace.State#getTime()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Time();

	/**
	 * Returns the meta object for class '{@link uppaalTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see uppaalTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link uppaalTrace.Trace#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see uppaalTrace.Trace#getStates()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_States();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.Trace#getNSTA <em>NSTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>NSTA</em>'.
	 * @see uppaalTrace.Trace#getNSTA()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_NSTA();

	/**
	 * Returns the meta object for the containment reference list '{@link uppaalTrace.Trace#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see uppaalTrace.Trace#getTransitions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link uppaalTrace.Trace#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see uppaalTrace.Trace#getTemplates()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Templates();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UppaalTraceFactory getUppaalTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uppaalTrace.impl.TemplateInstanceImpl <em>Template Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.impl.TemplateInstanceImpl
		 * @see uppaalTrace.impl.UppaalTracePackageImpl#getTemplateInstance()
		 * @generated
		 */
		EClass TEMPLATE_INSTANCE = eINSTANCE.getTemplateInstance();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_INSTANCE__TEMPLATE = eINSTANCE.getTemplateInstance_Template();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_INSTANCE__LOCATIONS = eINSTANCE.getTemplateInstance_Locations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_INSTANCE__NAME = eINSTANCE.getTemplateInstance_Name();

		/**
		 * The meta object literal for the '{@link uppaalTrace.impl.LocationInstanceImpl <em>Location Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.impl.LocationInstanceImpl
		 * @see uppaalTrace.impl.UppaalTracePackageImpl#getLocationInstance()
		 * @generated
		 */
		EClass LOCATION_INSTANCE = eINSTANCE.getLocationInstance();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_INSTANCE__LOCATION = eINSTANCE.getLocationInstance_Location();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_INSTANCE__TEMPLATE = eINSTANCE.getLocationInstance_Template();

		/**
		 * The meta object literal for the '{@link uppaalTrace.impl.ValuationImpl <em>Valuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.impl.ValuationImpl
		 * @see uppaalTrace.impl.UppaalTracePackageImpl#getValuation()
		 * @generated
		 */
		EClass VALUATION = eINSTANCE.getValuation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__VARIABLE = eINSTANCE.getValuation_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__TYPE = eINSTANCE.getValuation_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUATION__NAME = eINSTANCE.getValuation_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__VALUE = eINSTANCE.getValuation_Value();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__TEMPLATE = eINSTANCE.getValuation_Template();

		/**
		 * The meta object literal for the '{@link uppaalTrace.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.impl.StateImpl
		 * @see uppaalTrace.impl.UppaalTracePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Transition To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_TO = eINSTANCE.getState_TransitionTo();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LOCATIONS = eINSTANCE.getState_Locations();

		/**
		 * The meta object literal for the '<em><b>Valuations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VALUATIONS = eINSTANCE.getState_Valuations();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CLOCKS = eINSTANCE.getState_Clocks();

		/**
		 * The meta object literal for the '<em><b>Transition From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_FROM = eINSTANCE.getState_TransitionFrom();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TEMPLATES = eINSTANCE.getState_Templates();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TIME = eINSTANCE.getState_Time();

		/**
		 * The meta object literal for the '{@link uppaalTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.impl.TraceImpl
		 * @see uppaalTrace.impl.UppaalTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES = eINSTANCE.getTrace_States();

		/**
		 * The meta object literal for the '<em><b>NSTA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__NSTA = eINSTANCE.getTrace_NSTA();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRANSITIONS = eINSTANCE.getTrace_Transitions();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TEMPLATES = eINSTANCE.getTrace_Templates();

	}

} //UppaalTracePackage
