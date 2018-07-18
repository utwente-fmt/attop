/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenanceFactory
 * @model kind="package"
 * @generated
 */
public interface MaintenancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Maintenance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uuid:1e590a30-ec20-11e5-9a8e-082e5f80574e";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nl.utwente.ewi.fmt.UATMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenancePackage eINSTANCE = nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EFFECTS = 1;

	/**
	 * The feature id for the '<em><b>Max Effects In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAX_EFFECTS_IN_PROGRESS = 2;

	/**
	 * The feature id for the '<em><b>Effect Discipline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EFFECT_DISCIPLINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ConditionImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.EffectImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 2;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CombiningConditionImpl <em>Combining Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CombiningConditionImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getCombiningCondition()
	 * @generated
	 */
	int COMBINING_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINING_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINING_CONDITION__CHILDREN = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combining Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINING_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combining Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINING_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl <em>Node Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getNodeCondition()
	 * @generated
	 */
	int NODE_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Or Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONDITION__OR_GREATER = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONDITION__NODE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONDITION__STATE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayConditionImpl <em>Delay Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayConditionImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getDelayCondition()
	 * @generated
	 */
	int DELAY_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONDITION__IS_PERIODIC = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONDITION__DELAY = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delay Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delay Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ActivationConditionImpl <em>Activation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ActivationConditionImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getActivationCondition()
	 * @generated
	 */
	int ACTIVATION_CONDITION = 6;

	/**
	 * The number of structural features of the '<em>Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePolicyImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getMaintenancePolicy()
	 * @generated
	 */
	int MAINTENANCE_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_POLICY__MODULES = 0;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl <em>Repair Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getRepairEffect()
	 * @generated
	 */
	int REPAIR_EFFECT = 8;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFECT__DELAY = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFECT__NODE = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFECT__NEW_STATE = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repair Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repair Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.TriggerEffectImpl <em>Trigger Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.TriggerEffectImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getTriggerEffect()
	 * @generated
	 */
	int TRIGGER_EFFECT = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 10;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ExponentialDelayImpl <em>Exponential Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ExponentialDelayImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getExponentialDelay()
	 * @generated
	 */
	int EXPONENTIAL_DELAY = 11;

	/**
	 * The feature id for the '<em><b>Mean Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_DELAY__MEAN_TIME = DELAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_DELAY_FEATURE_COUNT = DELAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exponential Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_DELAY_OPERATION_COUNT = DELAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.BoundedDelayImpl <em>Bounded Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.BoundedDelayImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getBoundedDelay()
	 * @generated
	 */
	int BOUNDED_DELAY = 12;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_DELAY__MIN_TIME = DELAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_DELAY__MAX_TIME = DELAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_DELAY_FEATURE_COUNT = DELAY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_DELAY_OPERATION_COUNT = DELAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CustomModuleImpl <em>Custom Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CustomModuleImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getCustomModule()
	 * @generated
	 */
	int CUSTOM_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE__CONDITION = MODULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE__EFFECTS = MODULE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Max Effects In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE__MAX_EFFECTS_IN_PROGRESS = MODULE__MAX_EFFECTS_IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Effect Discipline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE__EFFECT_DISCIPLINE = MODULE__EFFECT_DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE__MODEL = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeStateImpl <em>Node State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeStateImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getNodeState()
	 * @generated
	 */
	int NODE_STATE = 14;

	/**
	 * The number of structural features of the '<em>Node State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.LinearNodeStateImpl <em>Linear Node State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.LinearNodeStateImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getLinearNodeState()
	 * @generated
	 */
	int LINEAR_NODE_STATE = 15;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NODE_STATE__FRACTION = NODE_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NODE_STATE__RELATIVE = NODE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Node State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NODE_STATE_FEATURE_COUNT = NODE_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linear Node State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_NODE_STATE_OPERATION_COUNT = NODE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.PhaseTypeStateImpl <em>Phase Type State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.PhaseTypeStateImpl
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getPhaseTypeState()
	 * @generated
	 */
	int PHASE_TYPE_STATE = 16;

	/**
	 * The feature id for the '<em><b>State Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE_STATE__STATE_NUMBER = NODE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phase Type State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE_STATE_FEATURE_COUNT = NODE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phase Type State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE_STATE_OPERATION_COUNT = NODE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline <em>Effect Discipline</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getEffectDiscipline()
	 * @generated
	 */
	int EFFECT_DISCIPLINE = 17;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Operator
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 18;


	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getCondition()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffects()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Effects();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getMaxEffectsInProgress <em>Max Effects In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Effects In Progress</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getMaxEffectsInProgress()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_MaxEffectsInProgress();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffectDiscipline <em>Effect Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Discipline</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffectDiscipline()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_EffectDiscipline();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition <em>Combining Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combining Condition</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition
	 * @generated
	 */
	EClass getCombiningCondition();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getOperator()
	 * @see #getCombiningCondition()
	 * @generated
	 */
	EAttribute getCombiningCondition_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getChildren()
	 * @see #getCombiningCondition()
	 * @generated
	 */
	EReference getCombiningCondition_Children();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition <em>Node Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Condition</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition
	 * @generated
	 */
	EClass getNodeCondition();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getState()
	 * @see #getNodeCondition()
	 * @generated
	 */
	EReference getNodeCondition_State();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#isOrGreater <em>Or Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Or Greater</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#isOrGreater()
	 * @see #getNodeCondition()
	 * @generated
	 */
	EAttribute getNodeCondition_OrGreater();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getNode()
	 * @see #getNodeCondition()
	 * @generated
	 */
	EReference getNodeCondition_Node();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition <em>Delay Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Condition</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition
	 * @generated
	 */
	EClass getDelayCondition();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#isIsPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#isIsPeriodic()
	 * @see #getDelayCondition()
	 * @generated
	 */
	EAttribute getDelayCondition_IsPeriodic();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#getDelay()
	 * @see #getDelayCondition()
	 * @generated
	 */
	EReference getDelayCondition_Delay();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Condition</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.ActivationCondition
	 * @generated
	 */
	EClass getActivationCondition();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy
	 * @generated
	 */
	EClass getMaintenancePolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy#getModules()
	 * @see #getMaintenancePolicy()
	 * @generated
	 */
	EReference getMaintenancePolicy_Modules();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect <em>Repair Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repair Effect</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect
	 * @generated
	 */
	EClass getRepairEffect();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNewState <em>New State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New State</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNewState()
	 * @see #getRepairEffect()
	 * @generated
	 */
	EReference getRepairEffect_NewState();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getDelay()
	 * @see #getRepairEffect()
	 * @generated
	 */
	EReference getRepairEffect_Delay();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNode()
	 * @see #getRepairEffect()
	 * @generated
	 */
	EReference getRepairEffect_Node();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect <em>Trigger Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Effect</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect
	 * @generated
	 */
	EClass getTriggerEffect();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect#getTarget()
	 * @see #getTriggerEffect()
	 * @generated
	 */
	EReference getTriggerEffect_Target();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay <em>Exponential Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Delay</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay
	 * @generated
	 */
	EClass getExponentialDelay();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay#getMeanTime <em>Mean Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Time</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay#getMeanTime()
	 * @see #getExponentialDelay()
	 * @generated
	 */
	EAttribute getExponentialDelay_MeanTime();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay <em>Bounded Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Delay</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay
	 * @generated
	 */
	EClass getBoundedDelay();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMinTime()
	 * @see #getBoundedDelay()
	 * @generated
	 */
	EAttribute getBoundedDelay_MinTime();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMaxTime()
	 * @see #getBoundedDelay()
	 * @generated
	 */
	EAttribute getBoundedDelay_MaxTime();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule <em>Custom Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Module</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule
	 * @generated
	 */
	EClass getCustomModule();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule#getModel()
	 * @see #getCustomModule()
	 * @generated
	 */
	EAttribute getCustomModule_Model();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState <em>Node State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node State</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState
	 * @generated
	 */
	EClass getNodeState();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState <em>Linear Node State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Node State</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState
	 * @generated
	 */
	EClass getLinearNodeState();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#getFraction()
	 * @see #getLinearNodeState()
	 * @generated
	 */
	EAttribute getLinearNodeState_Fraction();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#isRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#isRelative()
	 * @see #getLinearNodeState()
	 * @generated
	 */
	EAttribute getLinearNodeState_Relative();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState <em>Phase Type State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Type State</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState
	 * @generated
	 */
	EClass getPhaseTypeState();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState#getStateNumber <em>State Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Number</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState#getStateNumber()
	 * @see #getPhaseTypeState()
	 * @generated
	 */
	EAttribute getPhaseTypeState_StateNumber();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline <em>Effect Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect Discipline</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline
	 * @generated
	 */
	EEnum getEffectDiscipline();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaintenanceFactory getMaintenanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONDITION = eINSTANCE.getModule_Condition();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EFFECTS = eINSTANCE.getModule_Effects();

		/**
		 * The meta object literal for the '<em><b>Max Effects In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MAX_EFFECTS_IN_PROGRESS = eINSTANCE.getModule_MaxEffectsInProgress();

		/**
		 * The meta object literal for the '<em><b>Effect Discipline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__EFFECT_DISCIPLINE = eINSTANCE.getModule_EffectDiscipline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ConditionImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.EffectImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CombiningConditionImpl <em>Combining Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CombiningConditionImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getCombiningCondition()
		 * @generated
		 */
		EClass COMBINING_CONDITION = eINSTANCE.getCombiningCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINING_CONDITION__OPERATOR = eINSTANCE.getCombiningCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINING_CONDITION__CHILDREN = eINSTANCE.getCombiningCondition_Children();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl <em>Node Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getNodeCondition()
		 * @generated
		 */
		EClass NODE_CONDITION = eINSTANCE.getNodeCondition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONDITION__STATE = eINSTANCE.getNodeCondition_State();

		/**
		 * The meta object literal for the '<em><b>Or Greater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONDITION__OR_GREATER = eINSTANCE.getNodeCondition_OrGreater();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONDITION__NODE = eINSTANCE.getNodeCondition_Node();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayConditionImpl <em>Delay Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayConditionImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getDelayCondition()
		 * @generated
		 */
		EClass DELAY_CONDITION = eINSTANCE.getDelayCondition();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_CONDITION__IS_PERIODIC = eINSTANCE.getDelayCondition_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONDITION__DELAY = eINSTANCE.getDelayCondition_Delay();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ActivationConditionImpl <em>Activation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ActivationConditionImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getActivationCondition()
		 * @generated
		 */
		EClass ACTIVATION_CONDITION = eINSTANCE.getActivationCondition();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePolicyImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getMaintenancePolicy()
		 * @generated
		 */
		EClass MAINTENANCE_POLICY = eINSTANCE.getMaintenancePolicy();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_POLICY__MODULES = eINSTANCE.getMaintenancePolicy_Modules();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl <em>Repair Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getRepairEffect()
		 * @generated
		 */
		EClass REPAIR_EFFECT = eINSTANCE.getRepairEffect();

		/**
		 * The meta object literal for the '<em><b>New State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPAIR_EFFECT__NEW_STATE = eINSTANCE.getRepairEffect_NewState();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPAIR_EFFECT__DELAY = eINSTANCE.getRepairEffect_Delay();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPAIR_EFFECT__NODE = eINSTANCE.getRepairEffect_Node();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.TriggerEffectImpl <em>Trigger Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.TriggerEffectImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getTriggerEffect()
		 * @generated
		 */
		EClass TRIGGER_EFFECT = eINSTANCE.getTriggerEffect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_EFFECT__TARGET = eINSTANCE.getTriggerEffect_Target();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.DelayImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ExponentialDelayImpl <em>Exponential Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ExponentialDelayImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getExponentialDelay()
		 * @generated
		 */
		EClass EXPONENTIAL_DELAY = eINSTANCE.getExponentialDelay();

		/**
		 * The meta object literal for the '<em><b>Mean Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_DELAY__MEAN_TIME = eINSTANCE.getExponentialDelay_MeanTime();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.BoundedDelayImpl <em>Bounded Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.BoundedDelayImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getBoundedDelay()
		 * @generated
		 */
		EClass BOUNDED_DELAY = eINSTANCE.getBoundedDelay();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_DELAY__MIN_TIME = eINSTANCE.getBoundedDelay_MinTime();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_DELAY__MAX_TIME = eINSTANCE.getBoundedDelay_MaxTime();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CustomModuleImpl <em>Custom Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.CustomModuleImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getCustomModule()
		 * @generated
		 */
		EClass CUSTOM_MODULE = eINSTANCE.getCustomModule();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_MODULE__MODEL = eINSTANCE.getCustomModule_Model();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeStateImpl <em>Node State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeStateImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getNodeState()
		 * @generated
		 */
		EClass NODE_STATE = eINSTANCE.getNodeState();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.LinearNodeStateImpl <em>Linear Node State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.LinearNodeStateImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getLinearNodeState()
		 * @generated
		 */
		EClass LINEAR_NODE_STATE = eINSTANCE.getLinearNodeState();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_NODE_STATE__FRACTION = eINSTANCE.getLinearNodeState_Fraction();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_NODE_STATE__RELATIVE = eINSTANCE.getLinearNodeState_Relative();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.PhaseTypeStateImpl <em>Phase Type State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.PhaseTypeStateImpl
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getPhaseTypeState()
		 * @generated
		 */
		EClass PHASE_TYPE_STATE = eINSTANCE.getPhaseTypeState();

		/**
		 * The meta object literal for the '<em><b>State Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE_STATE__STATE_NUMBER = eINSTANCE.getPhaseTypeState_StateNumber();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline <em>Effect Discipline</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getEffectDiscipline()
		 * @generated
		 */
		EEnum EFFECT_DISCIPLINE = eINSTANCE.getEffectDiscipline();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Operator
		 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenancePackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //MaintenancePackage
