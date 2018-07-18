/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay#getMeanTime <em>Mean Time</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getExponentialDelay()
 * @model
 * @generated
 */
public interface ExponentialDelay extends Delay {
	/**
	 * Returns the value of the '<em><b>Mean Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Time</em>' attribute.
	 * @see #setMeanTime(double)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getExponentialDelay_MeanTime()
	 * @model required="true"
	 * @generated
	 */
	double getMeanTime();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay#getMeanTime <em>Mean Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Time</em>' attribute.
	 * @see #getMeanTime()
	 * @generated
	 */
	void setMeanTime(double value);

} // ExponentialDelay
