/**
 */
package uppaalTrace.value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.value.RangeSpecificationValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.value.ValuePackage#getRangeSpecificationValue()
 * @model
 * @generated
 */
public interface RangeSpecificationValue extends TypeSpecificationValue {
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
	 * @see uppaalTrace.value.ValuePackage#getRangeSpecificationValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	IntValue getValue();

	/**
	 * Sets the value of the '{@link uppaalTrace.value.RangeSpecificationValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IntValue value);

} // RangeSpecificationValue
