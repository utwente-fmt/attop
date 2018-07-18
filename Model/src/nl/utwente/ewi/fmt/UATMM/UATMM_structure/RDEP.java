/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDEP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.RDEP#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getRDEP()
 * @model
 * @generated
 */
public interface RDEP extends Connector {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getRDEP_Factor()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.RDEP#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

} // RDEP
