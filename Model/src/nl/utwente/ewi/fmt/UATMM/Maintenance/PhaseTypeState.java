/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Type State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState#getStateNumber <em>State Number</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getPhaseTypeState()
 * @model
 * @generated
 */
public interface PhaseTypeState extends NodeState {
	/**
	 * Returns the value of the '<em><b>State Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Number</em>' attribute.
	 * @see #setStateNumber(int)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getPhaseTypeState_StateNumber()
	 * @model required="true"
	 * @generated
	 */
	int getStateNumber();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState#getStateNumber <em>State Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Number</em>' attribute.
	 * @see #getStateNumber()
	 * @generated
	 */
	void setStateNumber(int value);

} // PhaseTypeState
