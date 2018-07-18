/**
 */
package uppaalTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uppaalTrace.clocks.AbstractClockBoundary;

import uppaalTrace.transitions.AbstractTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.State#getTransitionTo <em>Transition To</em>}</li>
 *   <li>{@link uppaalTrace.State#getLocations <em>Locations</em>}</li>
 *   <li>{@link uppaalTrace.State#getValuations <em>Valuations</em>}</li>
 *   <li>{@link uppaalTrace.State#getClocks <em>Clocks</em>}</li>
 *   <li>{@link uppaalTrace.State#getTransitionFrom <em>Transition From</em>}</li>
 *   <li>{@link uppaalTrace.State#getTemplates <em>Templates</em>}</li>
 *   <li>{@link uppaalTrace.State#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.UppaalTracePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uppaalTrace.transitions.AbstractTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition To</em>' reference.
	 * @see #setTransitionTo(AbstractTransition)
	 * @see uppaalTrace.UppaalTracePackage#getState_TransitionTo()
	 * @see uppaalTrace.transitions.AbstractTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	AbstractTransition getTransitionTo();

	/**
	 * Sets the value of the '{@link uppaalTrace.State#getTransitionTo <em>Transition To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition To</em>' reference.
	 * @see #getTransitionTo()
	 * @generated
	 */
	void setTransitionTo(AbstractTransition value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link uppaalTrace.LocationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see uppaalTrace.UppaalTracePackage#getState_Locations()
	 * @model
	 * @generated
	 */
	EList<LocationInstance> getLocations();

	/**
	 * Returns the value of the '<em><b>Valuations</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.Valuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuations</em>' containment reference list.
	 * @see uppaalTrace.UppaalTracePackage#getState_Valuations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valuation> getValuations();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.clocks.AbstractClockBoundary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see uppaalTrace.UppaalTracePackage#getState_Clocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractClockBoundary> getClocks();

	/**
	 * Returns the value of the '<em><b>Transition From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uppaalTrace.transitions.AbstractTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition From</em>' reference.
	 * @see #setTransitionFrom(AbstractTransition)
	 * @see uppaalTrace.UppaalTracePackage#getState_TransitionFrom()
	 * @see uppaalTrace.transitions.AbstractTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	AbstractTransition getTransitionFrom();

	/**
	 * Sets the value of the '{@link uppaalTrace.State#getTransitionFrom <em>Transition From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition From</em>' reference.
	 * @see #getTransitionFrom()
	 * @generated
	 */
	void setTransitionFrom(AbstractTransition value);

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference list.
	 * The list contents are of type {@link uppaalTrace.TemplateInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference list.
	 * @see uppaalTrace.UppaalTracePackage#getState_Templates()
	 * @model
	 * @generated
	 */
	EList<TemplateInstance> getTemplates();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see uppaalTrace.UppaalTracePackage#getState_Time()
	 * @model required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link uppaalTrace.State#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

} // State
