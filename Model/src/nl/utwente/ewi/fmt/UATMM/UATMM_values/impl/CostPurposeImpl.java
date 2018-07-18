/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.CostPurposeImpl#getCostType <em>Cost Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostPurposeImpl extends PurposeImpl implements CostPurpose {
	/**
	 * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected static final CostType COST_TYPE_EDEFAULT = CostType.ON_ACTIVATION;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected CostType costType = COST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostPurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_valuesPackage.Literals.COST_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType getCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostType(CostType newCostType) {
		CostType oldCostType = costType;
		costType = newCostType == null ? COST_TYPE_EDEFAULT : newCostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_valuesPackage.COST_PURPOSE__COST_TYPE, oldCostType, costType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_valuesPackage.COST_PURPOSE__COST_TYPE:
				return getCostType();
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
			case UATMM_valuesPackage.COST_PURPOSE__COST_TYPE:
				setCostType((CostType)newValue);
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
			case UATMM_valuesPackage.COST_PURPOSE__COST_TYPE:
				setCostType(COST_TYPE_EDEFAULT);
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
			case UATMM_valuesPackage.COST_PURPOSE__COST_TYPE:
				return costType != COST_TYPE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (costType: ");
		result.append(costType);
		result.append(')');
		return result.toString();
	}

} //CostPurposeImpl
