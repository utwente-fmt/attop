/**
 */
package uppaalTrace.impl;

import java.util.Collection;

import nl.utwente.ewi.fmt.uppaalSMC.NSTA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uppaalTrace.State;
import uppaalTrace.TemplateInstance;
import uppaalTrace.Trace;
import uppaalTrace.UppaalTracePackage;

import uppaalTrace.transitions.AbstractTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.impl.TraceImpl#getStates <em>States</em>}</li>
 *   <li>{@link uppaalTrace.impl.TraceImpl#getNSTA <em>NSTA</em>}</li>
 *   <li>{@link uppaalTrace.impl.TraceImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link uppaalTrace.impl.TraceImpl#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends EObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getNSTA() <em>NSTA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSTA()
	 * @generated
	 * @ordered
	 */
	protected NSTA nsta;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTransition> transitions;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateInstance> templates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaalTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, UppaalTracePackage.TRACE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSTA getNSTA() {
		if (nsta != null && nsta.eIsProxy()) {
			InternalEObject oldNSTA = (InternalEObject)nsta;
			nsta = (NSTA)eResolveProxy(oldNSTA);
			if (nsta != oldNSTA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UppaalTracePackage.TRACE__NSTA, oldNSTA, nsta));
			}
		}
		return nsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSTA basicGetNSTA() {
		return nsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSTA(NSTA newNSTA) {
		NSTA oldNSTA = nsta;
		nsta = newNSTA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalTracePackage.TRACE__NSTA, oldNSTA, nsta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<AbstractTransition>(AbstractTransition.class, this, UppaalTracePackage.TRACE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateInstance> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<TemplateInstance>(TemplateInstance.class, this, UppaalTracePackage.TRACE__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalTracePackage.TRACE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case UppaalTracePackage.TRACE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case UppaalTracePackage.TRACE__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaalTracePackage.TRACE__STATES:
				return getStates();
			case UppaalTracePackage.TRACE__NSTA:
				if (resolve) return getNSTA();
				return basicGetNSTA();
			case UppaalTracePackage.TRACE__TRANSITIONS:
				return getTransitions();
			case UppaalTracePackage.TRACE__TEMPLATES:
				return getTemplates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UppaalTracePackage.TRACE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case UppaalTracePackage.TRACE__NSTA:
				setNSTA((NSTA)newValue);
				return;
			case UppaalTracePackage.TRACE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends AbstractTransition>)newValue);
				return;
			case UppaalTracePackage.TRACE__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends TemplateInstance>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UppaalTracePackage.TRACE__STATES:
				getStates().clear();
				return;
			case UppaalTracePackage.TRACE__NSTA:
				setNSTA((NSTA)null);
				return;
			case UppaalTracePackage.TRACE__TRANSITIONS:
				getTransitions().clear();
				return;
			case UppaalTracePackage.TRACE__TEMPLATES:
				getTemplates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UppaalTracePackage.TRACE__STATES:
				return states != null && !states.isEmpty();
			case UppaalTracePackage.TRACE__NSTA:
				return nsta != null;
			case UppaalTracePackage.TRACE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case UppaalTracePackage.TRACE__TEMPLATES:
				return templates != null && !templates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
