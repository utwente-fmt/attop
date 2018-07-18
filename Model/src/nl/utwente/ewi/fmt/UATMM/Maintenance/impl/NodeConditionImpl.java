/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.impl;

import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage;
import nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition;

import nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl#isOrGreater <em>Or Greater</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.NodeConditionImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeConditionImpl extends ConditionImpl implements NodeCondition {
	/**
	 * The default value of the '{@link #isOrGreater() <em>Or Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrGreater()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OR_GREATER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrGreater() <em>Or Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrGreater()
	 * @generated
	 * @ordered
	 */
	protected boolean orGreater = OR_GREATER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected NodeState state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.NODE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(NodeState newState, NotificationChain msgs) {
		NodeState oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancePackage.NODE_CONDITION__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(NodeState newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.NODE_CONDITION__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.NODE_CONDITION__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.NODE_CONDITION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancePackage.NODE_CONDITION__STATE:
				return basicSetState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrGreater() {
		return orGreater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrGreater(boolean newOrGreater) {
		boolean oldOrGreater = orGreater;
		orGreater = newOrGreater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.NODE_CONDITION__OR_GREATER, oldOrGreater, orGreater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (Node)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaintenancePackage.NODE_CONDITION__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.NODE_CONDITION__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.NODE_CONDITION__OR_GREATER:
				return isOrGreater();
			case MaintenancePackage.NODE_CONDITION__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case MaintenancePackage.NODE_CONDITION__STATE:
				return getState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancePackage.NODE_CONDITION__OR_GREATER:
				setOrGreater((Boolean)newValue);
				return;
			case MaintenancePackage.NODE_CONDITION__NODE:
				setNode((Node)newValue);
				return;
			case MaintenancePackage.NODE_CONDITION__STATE:
				setState((NodeState)newValue);
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
			case MaintenancePackage.NODE_CONDITION__OR_GREATER:
				setOrGreater(OR_GREATER_EDEFAULT);
				return;
			case MaintenancePackage.NODE_CONDITION__NODE:
				setNode((Node)null);
				return;
			case MaintenancePackage.NODE_CONDITION__STATE:
				setState((NodeState)null);
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
			case MaintenancePackage.NODE_CONDITION__OR_GREATER:
				return orGreater != OR_GREATER_EDEFAULT;
			case MaintenancePackage.NODE_CONDITION__NODE:
				return node != null;
			case MaintenancePackage.NODE_CONDITION__STATE:
				return state != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (orGreater: ");
		result.append(orGreater);
		result.append(')');
		return result.toString();
	}

} //NodeConditionImpl
