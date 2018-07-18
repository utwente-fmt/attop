/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl;

import java.util.Collection;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackTreeImpl extends MinimalEObjectImpl.Container implements AttackTree {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Node root;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeMetaData> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_structurePackage.Literals.ATTACK_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Node)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UATMM_structurePackage.ATTACK_TREE__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Node newRoot) {
		Node oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_structurePackage.ATTACK_TREE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, UATMM_structurePackage.ATTACK_TREE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, UATMM_structurePackage.ATTACK_TREE__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeMetaData> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<TreeMetaData>(TreeMetaData.class, this, UATMM_structurePackage.ATTACK_TREE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UATMM_structurePackage.ATTACK_TREE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case UATMM_structurePackage.ATTACK_TREE__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case UATMM_structurePackage.ATTACK_TREE__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case UATMM_structurePackage.ATTACK_TREE__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case UATMM_structurePackage.ATTACK_TREE__NODES:
				return getNodes();
			case UATMM_structurePackage.ATTACK_TREE__EDGES:
				return getEdges();
			case UATMM_structurePackage.ATTACK_TREE__METADATA:
				return getMetadata();
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
			case UATMM_structurePackage.ATTACK_TREE__ROOT:
				setRoot((Node)newValue);
				return;
			case UATMM_structurePackage.ATTACK_TREE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case UATMM_structurePackage.ATTACK_TREE__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case UATMM_structurePackage.ATTACK_TREE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends TreeMetaData>)newValue);
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
			case UATMM_structurePackage.ATTACK_TREE__ROOT:
				setRoot((Node)null);
				return;
			case UATMM_structurePackage.ATTACK_TREE__NODES:
				getNodes().clear();
				return;
			case UATMM_structurePackage.ATTACK_TREE__EDGES:
				getEdges().clear();
				return;
			case UATMM_structurePackage.ATTACK_TREE__METADATA:
				getMetadata().clear();
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
			case UATMM_structurePackage.ATTACK_TREE__ROOT:
				return root != null;
			case UATMM_structurePackage.ATTACK_TREE__NODES:
				return nodes != null && !nodes.isEmpty();
			case UATMM_structurePackage.ATTACK_TREE__EDGES:
				return edges != null && !edges.isEmpty();
			case UATMM_structurePackage.ATTACK_TREE__METADATA:
				return metadata != null && !metadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttackTreeImpl
