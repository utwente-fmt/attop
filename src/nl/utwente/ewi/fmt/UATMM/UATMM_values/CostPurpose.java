/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose#getCostType <em>Cost Type</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getCostPurpose()
 * @model
 * @generated
 */
public interface CostPurpose extends Purpose {
	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType
	 * @see #setCostType(CostType)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getCostPurpose_CostType()
	 * @model required="true"
	 * @generated
	 */
	CostType getCostType();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(CostType value);

} // CostPurpose
