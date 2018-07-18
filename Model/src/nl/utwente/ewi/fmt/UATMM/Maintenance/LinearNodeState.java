/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Node State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#getFraction <em>Fraction</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#isRelative <em>Relative</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getLinearNodeState()
 * @model
 * @generated
 */
public interface LinearNodeState extends NodeState {
	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' attribute.
	 * @see #setFraction(double)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getLinearNodeState_Fraction()
	 * @model required="true"
	 * @generated
	 */
	double getFraction();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#getFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' attribute.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(double value);

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' attribute.
	 * @see #setRelative(boolean)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getLinearNodeState_Relative()
	 * @model required="true"
	 * @generated
	 */
	boolean isRelative();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState#isRelative <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative</em>' attribute.
	 * @see #isRelative()
	 * @generated
	 */
	void setRelative(boolean value);

} // LinearNodeState
