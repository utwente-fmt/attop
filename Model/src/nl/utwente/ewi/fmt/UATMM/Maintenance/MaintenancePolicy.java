/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getMaintenancePolicy()
 * @model
 * @generated
 */
public interface MaintenancePolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getMaintenancePolicy_Modules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Module> getModules();

} // MaintenancePolicy
