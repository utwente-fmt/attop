/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getTimePurpose()
 * @model
 * @generated
 */
public interface TimePurpose extends Purpose {
	/**
	 * Returns the value of the '<em><b>Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Type</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType
	 * @see #setTimeType(TimeType)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getTimePurpose_TimeType()
	 * @model required="true"
	 * @generated
	 */
	TimeType getTimeType();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose#getTimeType <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Type</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType
	 * @see #getTimeType()
	 * @generated
	 */
	void setTimeType(TimeType value);

} // TimePurpose
