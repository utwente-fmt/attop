/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getBoundedDelay()
 * @model
 * @generated
 */
public interface BoundedDelay extends Delay {
	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(double)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getBoundedDelay_MinTime()
	 * @model required="true"
	 * @generated
	 */
	double getMinTime();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(double)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getBoundedDelay_MaxTime()
	 * @model required="true"
	 * @generated
	 */
	double getMaxTime();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(double value);

} // BoundedDelay
