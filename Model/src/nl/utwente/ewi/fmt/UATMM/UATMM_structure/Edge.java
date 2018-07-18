/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getEdgeKind <em>Edge Kind</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Edge Kind</b></em>' attribute.
	 * The default value is <code>"DEPENDENCY"</code>.
	 * The literals are from the enumeration {@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Kind</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind
	 * @see #setEdgeKind(EdgeKind)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getEdge_EdgeKind()
	 * @model default="DEPENDENCY" required="true"
	 * @generated
	 */
	EdgeKind getEdgeKind();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getEdgeKind <em>Edge Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Kind</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind
	 * @see #getEdgeKind()
	 * @generated
	 */
	void setEdgeKind(EdgeKind value);

} // Edge
