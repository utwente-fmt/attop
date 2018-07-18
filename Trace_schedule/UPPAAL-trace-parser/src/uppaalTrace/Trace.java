/**
 */
package uppaalTrace;

import nl.utwente.ewi.fmt.uppaalSMC.NSTA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uppaalTrace.transitions.AbstractTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.Trace#getStates <em>States</em>}</li>
 *   <li>{@link uppaalTrace.Trace#getNSTA <em>NSTA</em>}</li>
 *   <li>{@link uppaalTrace.Trace#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link uppaalTrace.Trace#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.UppaalTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see uppaalTrace.UppaalTracePackage#getTrace_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>NSTA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NSTA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NSTA</em>' reference.
	 * @see #setNSTA(NSTA)
	 * @see uppaalTrace.UppaalTracePackage#getTrace_NSTA()
	 * @model required="true"
	 * @generated
	 */
	NSTA getNSTA();

	/**
	 * Sets the value of the '{@link uppaalTrace.Trace#getNSTA <em>NSTA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NSTA</em>' reference.
	 * @see #getNSTA()
	 * @generated
	 */
	void setNSTA(NSTA value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.transitions.AbstractTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see uppaalTrace.UppaalTracePackage#getTrace_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.TemplateInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see uppaalTrace.UppaalTracePackage#getTrace_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateInstance> getTemplates();

} // Trace
