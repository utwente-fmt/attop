/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.impl;

import nl.utwente.ewi.fmt.UATMM.Maintenance.Delay;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage;
import nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState;
import nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repair Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl#getNode <em>Node</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.RepairEffectImpl#getNewState <em>New State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepairEffectImpl extends EffectImpl implements RepairEffect {
	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Delay delay;

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
	 * The cached value of the '{@link #getNewState() <em>New State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected NodeState newState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepairEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.REPAIR_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeState getNewState() {
		return newState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewState(NodeState newNewState, NotificationChain msgs) {
		NodeState oldNewState = newState;
		newState = newNewState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR_EFFECT__NEW_STATE, oldNewState, newNewState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewState(NodeState newNewState) {
		if (newNewState != newState) {
			NotificationChain msgs = null;
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.REPAIR_EFFECT__NEW_STATE, null, msgs);
			if (newNewState != null)
				msgs = ((InternalEObject)newNewState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.REPAIR_EFFECT__NEW_STATE, null, msgs);
			msgs = basicSetNewState(newNewState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR_EFFECT__NEW_STATE, newNewState, newNewState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(Delay newDelay, NotificationChain msgs) {
		Delay oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR_EFFECT__DELAY, oldDelay, newDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Delay newDelay) {
		if (newDelay != delay) {
			NotificationChain msgs = null;
			if (delay != null)
				msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.REPAIR_EFFECT__DELAY, null, msgs);
			if (newDelay != null)
				msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.REPAIR_EFFECT__DELAY, null, msgs);
			msgs = basicSetDelay(newDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR_EFFECT__DELAY, newDelay, newDelay));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaintenancePackage.REPAIR_EFFECT__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR_EFFECT__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancePackage.REPAIR_EFFECT__DELAY:
				return basicSetDelay(null, msgs);
			case MaintenancePackage.REPAIR_EFFECT__NEW_STATE:
				return basicSetNewState(null, msgs);
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
			case MaintenancePackage.REPAIR_EFFECT__DELAY:
				return getDelay();
			case MaintenancePackage.REPAIR_EFFECT__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case MaintenancePackage.REPAIR_EFFECT__NEW_STATE:
				return getNewState();
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
			case MaintenancePackage.REPAIR_EFFECT__DELAY:
				setDelay((Delay)newValue);
				return;
			case MaintenancePackage.REPAIR_EFFECT__NODE:
				setNode((Node)newValue);
				return;
			case MaintenancePackage.REPAIR_EFFECT__NEW_STATE:
				setNewState((NodeState)newValue);
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
			case MaintenancePackage.REPAIR_EFFECT__DELAY:
				setDelay((Delay)null);
				return;
			case MaintenancePackage.REPAIR_EFFECT__NODE:
				setNode((Node)null);
				return;
			case MaintenancePackage.REPAIR_EFFECT__NEW_STATE:
				setNewState((NodeState)null);
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
			case MaintenancePackage.REPAIR_EFFECT__DELAY:
				return delay != null;
			case MaintenancePackage.REPAIR_EFFECT__NODE:
				return node != null;
			case MaintenancePackage.REPAIR_EFFECT__NEW_STATE:
				return newState != null;
		}
		return super.eIsSet(featureID);
	}

} //RepairEffectImpl
