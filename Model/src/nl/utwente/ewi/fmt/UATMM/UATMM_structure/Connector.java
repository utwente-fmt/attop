/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Connector#getGate <em>Gate</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' container reference.
	 * @see #setGate(Node)
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage#getConnector_Gate()
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getConnector
	 * @model opposite="connector" required="true" transient="false"
	 * @generated
	 */
	Node getGate();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Connector#getGate <em>Gate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' container reference.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(Node value);
} // Connector
