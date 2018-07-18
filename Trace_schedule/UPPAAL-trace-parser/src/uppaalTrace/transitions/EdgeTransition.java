/**
 */
package uppaalTrace.transitions;

import org.eclipse.emf.common.util.EList;

import org.muml.uppaal.templates.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.transitions.EdgeTransition#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.transitions.TransitionsPackage#getEdgeTransition()
 * @model
 * @generated
 */
public interface EdgeTransition extends AbstractTransition {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link org.muml.uppaal.templates.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see uppaalTrace.transitions.TransitionsPackage#getEdgeTransition_Edges()
	 * @model
	 * @generated
	 */
	EList<Edge> getEdges();

} // EdgeTransition
