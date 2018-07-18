/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#isOrGreater <em>Or Greater</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getNode <em>Node</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getState <em>State</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getNodeCondition()
 * @model
 * @generated
 */
public interface NodeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(NodeState)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getNodeCondition_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeState getState();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(NodeState value);

	/**
	 * Returns the value of the '<em><b>Or Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Greater</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Greater</em>' attribute.
	 * @see #setOrGreater(boolean)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getNodeCondition_OrGreater()
	 * @model required="true"
	 * @generated
	 */
	boolean isOrGreater();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#isOrGreater <em>Or Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Greater</em>' attribute.
	 * @see #isOrGreater()
	 * @generated
	 */
	void setOrGreater(boolean value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getNodeCondition_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // NodeCondition
