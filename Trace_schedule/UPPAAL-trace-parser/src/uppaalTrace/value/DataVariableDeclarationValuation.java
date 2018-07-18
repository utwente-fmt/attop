/**
 */
package uppaalTrace.value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.muml.uppaal.declarations.DataVariableDeclaration;

import uppaalTrace.Valuation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Variable Declaration Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.value.DataVariableDeclarationValuation#getDataVariableDeclaration <em>Data Variable Declaration</em>}</li>
 *   <li>{@link uppaalTrace.value.DataVariableDeclarationValuation#getValuation <em>Valuation</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.value.ValuePackage#getDataVariableDeclarationValuation()
 * @model
 * @generated
 */
public interface DataVariableDeclarationValuation extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Variable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Variable Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Variable Declaration</em>' reference.
	 * @see #setDataVariableDeclaration(DataVariableDeclaration)
	 * @see uppaalTrace.value.ValuePackage#getDataVariableDeclarationValuation_DataVariableDeclaration()
	 * @model
	 * @generated
	 */
	DataVariableDeclaration getDataVariableDeclaration();

	/**
	 * Sets the value of the '{@link uppaalTrace.value.DataVariableDeclarationValuation#getDataVariableDeclaration <em>Data Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Variable Declaration</em>' reference.
	 * @see #getDataVariableDeclaration()
	 * @generated
	 */
	void setDataVariableDeclaration(DataVariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Valuation</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.Valuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuation</em>' containment reference list.
	 * @see uppaalTrace.value.ValuePackage#getDataVariableDeclarationValuation_Valuation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valuation> getValuation();

} // DataVariableDeclarationValuation
