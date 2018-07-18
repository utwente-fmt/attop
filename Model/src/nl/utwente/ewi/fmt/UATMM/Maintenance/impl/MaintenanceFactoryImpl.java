/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.impl;

import nl.utwente.ewi.fmt.UATMM.Maintenance.*;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Module;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenanceFactoryImpl extends EFactoryImpl implements MaintenanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaintenanceFactory init() {
		try {
			MaintenanceFactory theMaintenanceFactory = (MaintenanceFactory)EPackage.Registry.INSTANCE.getEFactory(MaintenancePackage.eNS_URI);
			if (theMaintenanceFactory != null) {
				return theMaintenanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaintenanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MaintenancePackage.MODULE: return createModule();
			case MaintenancePackage.COMBINING_CONDITION: return createCombiningCondition();
			case MaintenancePackage.NODE_CONDITION: return createNodeCondition();
			case MaintenancePackage.DELAY_CONDITION: return createDelayCondition();
			case MaintenancePackage.ACTIVATION_CONDITION: return createActivationCondition();
			case MaintenancePackage.MAINTENANCE_POLICY: return createMaintenancePolicy();
			case MaintenancePackage.REPAIR_EFFECT: return createRepairEffect();
			case MaintenancePackage.TRIGGER_EFFECT: return createTriggerEffect();
			case MaintenancePackage.EXPONENTIAL_DELAY: return createExponentialDelay();
			case MaintenancePackage.BOUNDED_DELAY: return createBoundedDelay();
			case MaintenancePackage.CUSTOM_MODULE: return createCustomModule();
			case MaintenancePackage.LINEAR_NODE_STATE: return createLinearNodeState();
			case MaintenancePackage.PHASE_TYPE_STATE: return createPhaseTypeState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MaintenancePackage.EFFECT_DISCIPLINE:
				return createEffectDisciplineFromString(eDataType, initialValue);
			case MaintenancePackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MaintenancePackage.EFFECT_DISCIPLINE:
				return convertEffectDisciplineToString(eDataType, instanceValue);
			case MaintenancePackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombiningCondition createCombiningCondition() {
		CombiningConditionImpl combiningCondition = new CombiningConditionImpl();
		return combiningCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCondition createNodeCondition() {
		NodeConditionImpl nodeCondition = new NodeConditionImpl();
		return nodeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayCondition createDelayCondition() {
		DelayConditionImpl delayCondition = new DelayConditionImpl();
		return delayCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationCondition createActivationCondition() {
		ActivationConditionImpl activationCondition = new ActivationConditionImpl();
		return activationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenancePolicy createMaintenancePolicy() {
		MaintenancePolicyImpl maintenancePolicy = new MaintenancePolicyImpl();
		return maintenancePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepairEffect createRepairEffect() {
		RepairEffectImpl repairEffect = new RepairEffectImpl();
		return repairEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEffect createTriggerEffect() {
		TriggerEffectImpl triggerEffect = new TriggerEffectImpl();
		return triggerEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialDelay createExponentialDelay() {
		ExponentialDelayImpl exponentialDelay = new ExponentialDelayImpl();
		return exponentialDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedDelay createBoundedDelay() {
		BoundedDelayImpl boundedDelay = new BoundedDelayImpl();
		return boundedDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomModule createCustomModule() {
		CustomModuleImpl customModule = new CustomModuleImpl();
		return customModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearNodeState createLinearNodeState() {
		LinearNodeStateImpl linearNodeState = new LinearNodeStateImpl();
		return linearNodeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTypeState createPhaseTypeState() {
		PhaseTypeStateImpl phaseTypeState = new PhaseTypeStateImpl();
		return phaseTypeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectDiscipline createEffectDisciplineFromString(EDataType eDataType, String initialValue) {
		EffectDiscipline result = EffectDiscipline.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffectDisciplineToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenancePackage getMaintenancePackage() {
		return (MaintenancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaintenancePackage getPackage() {
		return MaintenancePackage.eINSTANCE;
	}

} //MaintenanceFactoryImpl
