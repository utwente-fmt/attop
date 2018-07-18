/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getTriggerEffect()
 * @model
 * @generated
 */
public interface TriggerEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivationCondition)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getTriggerEffect_Target()
	 * @model required="true"
	 * @generated
	 */
	ActivationCondition getTarget();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivationCondition value);

} // TriggerEffect
