/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combining Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getCombiningCondition()
 * @model
 * @generated
 */
public interface CombiningCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"OR"</code>.
	 * The literals are from the enumeration {@link nl.utwente.ewi.fmt.UATMM.Maintenance.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Operator
	 * @see #setOperator(Operator)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getCombiningCondition_Operator()
	 * @model default="OR" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link nl.utwente.ewi.fmt.UATMM.Maintenance.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getCombiningCondition_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getChildren();

} // CombiningCondition
