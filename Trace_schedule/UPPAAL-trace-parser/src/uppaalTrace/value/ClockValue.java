/**
 */
package uppaalTrace.value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.value.ClockValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.value.ValuePackage#getClockValue()
 * @model
 * @generated
 */
public interface ClockValue extends BuiltInTypeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see uppaalTrace.value.ValuePackage#getClockValue_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link uppaalTrace.value.ClockValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // ClockValue
