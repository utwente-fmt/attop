/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.impl;

import nl.utwente.ewi.fmt.UATMM.Maintenance.ActivationCondition;
import nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay;
import nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Condition;
import nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Delay;
import nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Effect;
import nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline;
import nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay;
import nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenanceFactory;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Module;
import nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition;
import nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Operator;
import nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState;
import nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect;
import nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenancePackageImpl extends EPackageImpl implements MaintenancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combiningConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenancePolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repairEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearNodeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTypeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectDisciplineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaintenancePackageImpl() {
		super(eNS_URI, MaintenanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MaintenancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaintenancePackage init() {
		if (isInited) return (MaintenancePackage)EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI);

		// Obtain or create and register package
		MaintenancePackageImpl theMaintenancePackage = (MaintenancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MaintenancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MaintenancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UATMM_structurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMaintenancePackage.createPackageContents();

		// Initialize created meta-data
		theMaintenancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaintenancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaintenancePackage.eNS_URI, theMaintenancePackage);
		return theMaintenancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Condition() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Effects() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_MaxEffectsInProgress() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_EffectDiscipline() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombiningCondition() {
		return combiningConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombiningCondition_Operator() {
		return (EAttribute)combiningConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombiningCondition_Children() {
		return (EReference)combiningConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeCondition() {
		return nodeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeCondition_State() {
		return (EReference)nodeConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeCondition_OrGreater() {
		return (EAttribute)nodeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeCondition_Node() {
		return (EReference)nodeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayCondition() {
		return delayConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayCondition_IsPeriodic() {
		return (EAttribute)delayConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayCondition_Delay() {
		return (EReference)delayConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationCondition() {
		return activationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenancePolicy() {
		return maintenancePolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenancePolicy_Modules() {
		return (EReference)maintenancePolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepairEffect() {
		return repairEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepairEffect_NewState() {
		return (EReference)repairEffectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepairEffect_Delay() {
		return (EReference)repairEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepairEffect_Node() {
		return (EReference)repairEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEffect() {
		return triggerEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerEffect_Target() {
		return (EReference)triggerEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialDelay() {
		return exponentialDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialDelay_MeanTime() {
		return (EAttribute)exponentialDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedDelay() {
		return boundedDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedDelay_MinTime() {
		return (EAttribute)boundedDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedDelay_MaxTime() {
		return (EAttribute)boundedDelayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomModule() {
		return customModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomModule_Model() {
		return (EAttribute)customModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeState() {
		return nodeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearNodeState() {
		return linearNodeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearNodeState_Fraction() {
		return (EAttribute)linearNodeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearNodeState_Relative() {
		return (EAttribute)linearNodeStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseTypeState() {
		return phaseTypeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTypeState_StateNumber() {
		return (EAttribute)phaseTypeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEffectDiscipline() {
		return effectDisciplineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceFactory getMaintenanceFactory() {
		return (MaintenanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__CONDITION);
		createEReference(moduleEClass, MODULE__EFFECTS);
		createEAttribute(moduleEClass, MODULE__MAX_EFFECTS_IN_PROGRESS);
		createEAttribute(moduleEClass, MODULE__EFFECT_DISCIPLINE);
		createEAttribute(moduleEClass, MODULE__NAME);

		conditionEClass = createEClass(CONDITION);

		effectEClass = createEClass(EFFECT);

		combiningConditionEClass = createEClass(COMBINING_CONDITION);
		createEAttribute(combiningConditionEClass, COMBINING_CONDITION__OPERATOR);
		createEReference(combiningConditionEClass, COMBINING_CONDITION__CHILDREN);

		nodeConditionEClass = createEClass(NODE_CONDITION);
		createEAttribute(nodeConditionEClass, NODE_CONDITION__OR_GREATER);
		createEReference(nodeConditionEClass, NODE_CONDITION__NODE);
		createEReference(nodeConditionEClass, NODE_CONDITION__STATE);

		delayConditionEClass = createEClass(DELAY_CONDITION);
		createEAttribute(delayConditionEClass, DELAY_CONDITION__IS_PERIODIC);
		createEReference(delayConditionEClass, DELAY_CONDITION__DELAY);

		activationConditionEClass = createEClass(ACTIVATION_CONDITION);

		maintenancePolicyEClass = createEClass(MAINTENANCE_POLICY);
		createEReference(maintenancePolicyEClass, MAINTENANCE_POLICY__MODULES);

		repairEffectEClass = createEClass(REPAIR_EFFECT);
		createEReference(repairEffectEClass, REPAIR_EFFECT__DELAY);
		createEReference(repairEffectEClass, REPAIR_EFFECT__NODE);
		createEReference(repairEffectEClass, REPAIR_EFFECT__NEW_STATE);

		triggerEffectEClass = createEClass(TRIGGER_EFFECT);
		createEReference(triggerEffectEClass, TRIGGER_EFFECT__TARGET);

		delayEClass = createEClass(DELAY);

		exponentialDelayEClass = createEClass(EXPONENTIAL_DELAY);
		createEAttribute(exponentialDelayEClass, EXPONENTIAL_DELAY__MEAN_TIME);

		boundedDelayEClass = createEClass(BOUNDED_DELAY);
		createEAttribute(boundedDelayEClass, BOUNDED_DELAY__MIN_TIME);
		createEAttribute(boundedDelayEClass, BOUNDED_DELAY__MAX_TIME);

		customModuleEClass = createEClass(CUSTOM_MODULE);
		createEAttribute(customModuleEClass, CUSTOM_MODULE__MODEL);

		nodeStateEClass = createEClass(NODE_STATE);

		linearNodeStateEClass = createEClass(LINEAR_NODE_STATE);
		createEAttribute(linearNodeStateEClass, LINEAR_NODE_STATE__FRACTION);
		createEAttribute(linearNodeStateEClass, LINEAR_NODE_STATE__RELATIVE);

		phaseTypeStateEClass = createEClass(PHASE_TYPE_STATE);
		createEAttribute(phaseTypeStateEClass, PHASE_TYPE_STATE__STATE_NUMBER);

		// Create enums
		effectDisciplineEEnum = createEEnum(EFFECT_DISCIPLINE);
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UATMM_structurePackage theUATMM_structurePackage = (UATMM_structurePackage)EPackage.Registry.INSTANCE.getEPackage(UATMM_structurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		combiningConditionEClass.getESuperTypes().add(this.getCondition());
		nodeConditionEClass.getESuperTypes().add(this.getCondition());
		delayConditionEClass.getESuperTypes().add(this.getCondition());
		activationConditionEClass.getESuperTypes().add(this.getCondition());
		repairEffectEClass.getESuperTypes().add(this.getEffect());
		triggerEffectEClass.getESuperTypes().add(this.getEffect());
		exponentialDelayEClass.getESuperTypes().add(this.getDelay());
		boundedDelayEClass.getESuperTypes().add(this.getDelay());
		customModuleEClass.getESuperTypes().add(this.getModule());
		linearNodeStateEClass.getESuperTypes().add(this.getNodeState());
		phaseTypeStateEClass.getESuperTypes().add(this.getNodeState());

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Condition(), this.getCondition(), null, "condition", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Effects(), this.getEffect(), null, "effects", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_MaxEffectsInProgress(), ecorePackage.getEInt(), "maxEffectsInProgress", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_EffectDiscipline(), this.getEffectDiscipline(), "effectDiscipline", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(effectEClass, Effect.class, "Effect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combiningConditionEClass, CombiningCondition.class, "CombiningCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombiningCondition_Operator(), this.getOperator(), "operator", "OR", 1, 1, CombiningCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombiningCondition_Children(), this.getCondition(), null, "children", null, 1, -1, CombiningCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeConditionEClass, NodeCondition.class, "NodeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeCondition_OrGreater(), ecorePackage.getEBoolean(), "orGreater", null, 1, 1, NodeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeCondition_Node(), theUATMM_structurePackage.getNode(), null, "node", null, 1, 1, NodeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeCondition_State(), this.getNodeState(), null, "state", null, 1, 1, NodeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayConditionEClass, DelayCondition.class, "DelayCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayCondition_IsPeriodic(), ecorePackage.getEBoolean(), "isPeriodic", null, 1, 1, DelayCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayCondition_Delay(), this.getDelay(), null, "delay", null, 1, 1, DelayCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationConditionEClass, ActivationCondition.class, "ActivationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintenancePolicyEClass, MaintenancePolicy.class, "MaintenancePolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaintenancePolicy_Modules(), this.getModule(), null, "modules", null, 0, -1, MaintenancePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(repairEffectEClass, RepairEffect.class, "RepairEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepairEffect_Delay(), this.getDelay(), null, "delay", null, 0, 1, RepairEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepairEffect_Node(), theUATMM_structurePackage.getNode(), null, "node", null, 1, 1, RepairEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepairEffect_NewState(), this.getNodeState(), null, "newState", null, 1, 1, RepairEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEffectEClass, TriggerEffect.class, "TriggerEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerEffect_Target(), this.getActivationCondition(), null, "target", null, 1, 1, TriggerEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exponentialDelayEClass, ExponentialDelay.class, "ExponentialDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialDelay_MeanTime(), ecorePackage.getEDouble(), "meanTime", null, 1, 1, ExponentialDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedDelayEClass, BoundedDelay.class, "BoundedDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedDelay_MinTime(), ecorePackage.getEDouble(), "minTime", null, 1, 1, BoundedDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedDelay_MaxTime(), ecorePackage.getEDouble(), "maxTime", null, 1, 1, BoundedDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customModuleEClass, CustomModule.class, "CustomModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomModule_Model(), ecorePackage.getEJavaObject(), "model", null, 1, 1, CustomModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeStateEClass, NodeState.class, "NodeState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearNodeStateEClass, LinearNodeState.class, "LinearNodeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearNodeState_Fraction(), ecorePackage.getEDouble(), "fraction", null, 1, 1, LinearNodeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearNodeState_Relative(), ecorePackage.getEBoolean(), "relative", null, 1, 1, LinearNodeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseTypeStateEClass, PhaseTypeState.class, "PhaseTypeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhaseTypeState_StateNumber(), ecorePackage.getEInt(), "stateNumber", null, 1, 1, PhaseTypeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(effectDisciplineEEnum, EffectDiscipline.class, "EffectDiscipline");
		addEEnumLiteral(effectDisciplineEEnum, EffectDiscipline.RANDOM);
		addEEnumLiteral(effectDisciplineEEnum, EffectDiscipline.IN_ORDER);
		addEEnumLiteral(effectDisciplineEEnum, EffectDiscipline.NONDETERMINISTIC);
		addEEnumLiteral(effectDisciplineEEnum, EffectDiscipline.CUSTOM);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.AND);
		addEEnumLiteral(operatorEEnum, Operator.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //MaintenancePackageImpl
