/**
 */
package uppaalTrace.clocks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Clock Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.clocks.AbstractClockBoundary#getValue <em>Value</em>}</li>
 *   <li>{@link uppaalTrace.clocks.AbstractClockBoundary#getRelation <em>Relation</em>}</li>
 *   <li>{@link uppaalTrace.clocks.AbstractClockBoundary#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.clocks.ClocksPackage#getAbstractClockBoundary()
 * @model abstract="true"
 * @generated
 */
public interface AbstractClockBoundary extends EObject {
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
	 * @see uppaalTrace.clocks.ClocksPackage#getAbstractClockBoundary_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link uppaalTrace.clocks.AbstractClockBoundary#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' attribute.
	 * The default value is <code>"LE"</code>.
	 * The literals are from the enumeration {@link uppaalTrace.clocks.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' attribute.
	 * @see uppaalTrace.clocks.Relation
	 * @see #setRelation(Relation)
	 * @see uppaalTrace.clocks.ClocksPackage#getAbstractClockBoundary_Relation()
	 * @model default="LE" required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link uppaalTrace.clocks.AbstractClockBoundary#getRelation <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' attribute.
	 * @see uppaalTrace.clocks.Relation
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see uppaalTrace.clocks.ClocksPackage#getAbstractClockBoundary_Target()
	 * @model default="" required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link uppaalTrace.clocks.AbstractClockBoundary#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // AbstractClockBoundary
