/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Sequence Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealSequenceValue#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getRealSequenceValue()
 * @model
 * @generated
 */
public interface RealSequenceValue extends Value {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute list.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getRealSequenceValue_Sequence()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<Double> getSequence();

} // RealSequenceValue
