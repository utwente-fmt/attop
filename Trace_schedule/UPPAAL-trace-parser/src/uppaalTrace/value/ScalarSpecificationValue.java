/**
 */
package uppaalTrace.value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.value.ScalarSpecificationValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.value.ValuePackage#getScalarSpecificationValue()
 * @model
 * @generated
 */
public interface ScalarSpecificationValue extends TypeSpecificationValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(IntValue)
	 * @see uppaalTrace.value.ValuePackage#getScalarSpecificationValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntValue getValue();

	/**
	 * Sets the value of the '{@link uppaalTrace.value.ScalarSpecificationValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IntValue value);

} // ScalarSpecificationValue
