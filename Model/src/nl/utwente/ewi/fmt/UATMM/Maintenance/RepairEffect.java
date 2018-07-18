/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repair Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getDelay <em>Delay</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNode <em>Node</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNewState <em>New State</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getRepairEffect()
 * @model
 * @generated
 */
public interface RepairEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>New State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New State</em>' containment reference.
	 * @see #setNewState(NodeState)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getRepairEffect_NewState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeState getNewState();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNewState <em>New State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New State</em>' containment reference.
	 * @see #getNewState()
	 * @generated
	 */
	void setNewState(NodeState value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(Delay)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getRepairEffect_Delay()
	 * @model containment="true"
	 * @generated
	 */
	Delay getDelay();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Delay value);

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
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getRepairEffect_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // RepairEffect
