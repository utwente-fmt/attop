/**
 */
package UMMAALSchedule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exact Time Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.ExactTimeDouble#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see UMMAALSchedule.UMMAALSchedulePackage#getExactTimeDouble()
 * @model
 * @generated
 */
public interface ExactTimeDouble extends Time {
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
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getExactTimeDouble_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.ExactTimeDouble#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ExactTimeDouble
