/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl;

import java.util.Collection;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weighted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.WeightedImpl#getTreshold <em>Treshold</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.WeightedImpl#getWeights <em>Weights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightedImpl extends ConnectorImpl implements Weighted {
	/**
	 * The default value of the '{@link #getTreshold() <em>Treshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreshold()
	 * @generated
	 * @ordered
	 */
	protected static final float TRESHOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTreshold() <em>Treshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreshold()
	 * @generated
	 * @ordered
	 */
	protected float treshold = TRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWeights() <em>Weights</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeights()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> weights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_structurePackage.Literals.WEIGHTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTreshold() {
		return treshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreshold(float newTreshold) {
		float oldTreshold = treshold;
		treshold = newTreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_structurePackage.WEIGHTED__TRESHOLD, oldTreshold, treshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getWeights() {
		if (weights == null) {
			weights = new EDataTypeUniqueEList<Float>(Float.class, this, UATMM_structurePackage.WEIGHTED__WEIGHTS);
		}
		return weights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_structurePackage.WEIGHTED__TRESHOLD:
				return getTreshold();
			case UATMM_structurePackage.WEIGHTED__WEIGHTS:
				return getWeights();
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
			case UATMM_structurePackage.WEIGHTED__TRESHOLD:
				setTreshold((Float)newValue);
				return;
			case UATMM_structurePackage.WEIGHTED__WEIGHTS:
				getWeights().clear();
				getWeights().addAll((Collection<? extends Float>)newValue);
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
			case UATMM_structurePackage.WEIGHTED__TRESHOLD:
				setTreshold(TRESHOLD_EDEFAULT);
				return;
			case UATMM_structurePackage.WEIGHTED__WEIGHTS:
				getWeights().clear();
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
			case UATMM_structurePackage.WEIGHTED__TRESHOLD:
				return treshold != TRESHOLD_EDEFAULT;
			case UATMM_structurePackage.WEIGHTED__WEIGHTS:
				return weights != null && !weights.isEmpty();
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
		result.append(" (Treshold: ");
		result.append(treshold);
		result.append(", Weights: ");
		result.append(weights);
		result.append(')');
		return result.toString();
	}

} //WeightedImpl
