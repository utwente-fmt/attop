/**
 */
package UMMAALSchedule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.Executable#getName <em>Name</em>}</li>
 *   <li>{@link UMMAALSchedule.Executable#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 *
 * @see UMMAALSchedule.UMMAALSchedulePackage#getExecutable()
 * @model abstract="true"
 * @generated
 */
public interface Executable extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getExecutable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Executable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' reference.
	 * @see #setExternalReference(EObject)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getExecutable_ExternalReference()
	 * @model
	 * @generated
	 */
	EObject getExternalReference();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Executable#getExternalReference <em>External Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' reference.
	 * @see #getExternalReference()
	 * @generated
	 */
	void setExternalReference(EObject value);

} // Executable
