/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getRealValue()
 * @model
 * @generated
 */
public interface RealValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getRealValue_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // RealValue
