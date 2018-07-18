/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage
 * @generated
 */
public interface MaintenanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenanceFactory eINSTANCE = nl.utwente.ewi.fmt.UATMM.Maintenance.impl.MaintenanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Combining Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combining Condition</em>'.
	 * @generated
	 */
	CombiningCondition createCombiningCondition();

	/**
	 * Returns a new object of class '<em>Node Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Condition</em>'.
	 * @generated
	 */
	NodeCondition createNodeCondition();

	/**
	 * Returns a new object of class '<em>Delay Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Condition</em>'.
	 * @generated
	 */
	DelayCondition createDelayCondition();

	/**
	 * Returns a new object of class '<em>Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Condition</em>'.
	 * @generated
	 */
	ActivationCondition createActivationCondition();

	/**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
	MaintenancePolicy createMaintenancePolicy();

	/**
	 * Returns a new object of class '<em>Repair Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repair Effect</em>'.
	 * @generated
	 */
	RepairEffect createRepairEffect();

	/**
	 * Returns a new object of class '<em>Trigger Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Effect</em>'.
	 * @generated
	 */
	TriggerEffect createTriggerEffect();

	/**
	 * Returns a new object of class '<em>Exponential Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Delay</em>'.
	 * @generated
	 */
	ExponentialDelay createExponentialDelay();

	/**
	 * Returns a new object of class '<em>Bounded Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Delay</em>'.
	 * @generated
	 */
	BoundedDelay createBoundedDelay();

	/**
	 * Returns a new object of class '<em>Custom Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Module</em>'.
	 * @generated
	 */
	CustomModule createCustomModule();

	/**
	 * Returns a new object of class '<em>Linear Node State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Node State</em>'.
	 * @generated
	 */
	LinearNodeState createLinearNodeState();

	/**
	 * Returns a new object of class '<em>Phase Type State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Type State</em>'.
	 * @generated
	 */
	PhaseTypeState createPhaseTypeState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaintenancePackage getMaintenancePackage();

} //MaintenanceFactory
