/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose#getProbType <em>Prob Type</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getProbabilityPurpose()
 * @model
 * @generated
 */
public interface ProbabilityPurpose extends Purpose {
	/**
	 * Returns the value of the '<em><b>Prob Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob Type</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType
	 * @see #setProbType(ProbabilityType)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getProbabilityPurpose_ProbType()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityType getProbType();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose#getProbType <em>Prob Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob Type</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType
	 * @see #getProbType()
	 * @generated
	 */
	void setProbType(ProbabilityType value);

} // ProbabilityPurpose
