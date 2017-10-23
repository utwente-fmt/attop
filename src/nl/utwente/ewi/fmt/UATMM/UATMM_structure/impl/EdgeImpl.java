/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl#getEdgeKind <em>Edge Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The default value of the '{@link #getEdgeKind() <em>Edge Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeKind()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeKind EDGE_KIND_EDEFAULT = EdgeKind.DEPENCENCY;

	/**
	 * The cached value of the '{@link #getEdgeKind() <em>Edge Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeKind()
	 * @generated
	 * @ordered
	 */
	protected EdgeKind edgeKind = EDGE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_structurePackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Node)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UATMM_structurePackage.EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Node newTarget) {
		Node oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_structurePackage.EDGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Node)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UATMM_structurePackage.EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Node newSource) {
		Node oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_structurePackage.EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeKind getEdgeKind() {
		return edgeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeKind(EdgeKind newEdgeKind) {
		EdgeKind oldEdgeKind = edgeKind;
		edgeKind = newEdgeKind == null ? EDGE_KIND_EDEFAULT : newEdgeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_structurePackage.EDGE__EDGE_KIND, oldEdgeKind, edgeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_structurePackage.EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UATMM_structurePackage.EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UATMM_structurePackage.EDGE__EDGE_KIND:
				return getEdgeKind();
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
			case UATMM_structurePackage.EDGE__TARGET:
				setTarget((Node)newValue);
				return;
			case UATMM_structurePackage.EDGE__SOURCE:
				setSource((Node)newValue);
				return;
			case UATMM_structurePackage.EDGE__EDGE_KIND:
				setEdgeKind((EdgeKind)newValue);
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
			case UATMM_structurePackage.EDGE__TARGET:
				setTarget((Node)null);
				return;
			case UATMM_structurePackage.EDGE__SOURCE:
				setSource((Node)null);
				return;
			case UATMM_structurePackage.EDGE__EDGE_KIND:
				setEdgeKind(EDGE_KIND_EDEFAULT);
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
			case UATMM_structurePackage.EDGE__TARGET:
				return target != null;
			case UATMM_structurePackage.EDGE__SOURCE:
				return source != null;
			case UATMM_structurePackage.EDGE__EDGE_KIND:
				return edgeKind != EDGE_KIND_EDEFAULT;
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
		result.append(" (edgeKind: ");
		result.append(edgeKind);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
