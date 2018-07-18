/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#isIsPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getDelayCondition()
 * @model
 * @generated
 */
public interface DelayCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Periodic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Periodic</em>' attribute.
	 * @see #setIsPeriodic(boolean)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getDelayCondition_IsPeriodic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPeriodic();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#isIsPeriodic <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Periodic</em>' attribute.
	 * @see #isIsPeriodic()
	 * @generated
	 */
	void setIsPeriodic(boolean value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(Delay)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getDelayCondition_Delay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Delay getDelay();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Delay value);

} // DelayCondition
