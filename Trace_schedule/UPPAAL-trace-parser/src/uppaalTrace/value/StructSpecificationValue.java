/**
 */
package uppaalTrace.value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.value.StructSpecificationValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.value.ValuePackage#getStructSpecificationValue()
 * @model
 * @generated
 */
public interface StructSpecificationValue extends TypeSpecificationValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.value.DataVariableDeclarationValuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see uppaalTrace.value.ValuePackage#getStructSpecificationValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataVariableDeclarationValuation> getValue();

} // StructSpecificationValue
