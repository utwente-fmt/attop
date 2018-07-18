/**
 */
package uppaalTrace.clocks;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Clock Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.clocks.CombinedClockBoundary#getSubtrahend <em>Subtrahend</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.clocks.ClocksPackage#getCombinedClockBoundary()
 * @model
 * @generated
 */
public interface CombinedClockBoundary extends AbstractClockBoundary {
	/**
	 * Returns the value of the '<em><b>Subtrahend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtrahend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtrahend</em>' attribute.
	 * @see #setSubtrahend(String)
	 * @see uppaalTrace.clocks.ClocksPackage#getCombinedClockBoundary_Subtrahend()
	 * @model required="true"
	 * @generated
	 */
	String getSubtrahend();

	/**
	 * Sets the value of the '{@link uppaalTrace.clocks.CombinedClockBoundary#getSubtrahend <em>Subtrahend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtrahend</em>' attribute.
	 * @see #getSubtrahend()
	 * @generated
	 */
	void setSubtrahend(String value);

} // CombinedClockBoundary
