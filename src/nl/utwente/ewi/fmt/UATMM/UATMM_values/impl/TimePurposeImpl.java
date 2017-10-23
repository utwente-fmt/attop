/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TimePurposeImpl#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePurposeImpl extends PurposeImpl implements TimePurpose {
	/**
	 * The default value of the '{@link #getTimeType() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeType TIME_TYPE_EDEFAULT = TimeType.MINIMUM;

	/**
	 * The cached value of the '{@link #getTimeType() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected TimeType timeType = TIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_valuesPackage.Literals.TIME_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTimeType() {
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeType(TimeType newTimeType) {
		TimeType oldTimeType = timeType;
		timeType = newTimeType == null ? TIME_TYPE_EDEFAULT : newTimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_valuesPackage.TIME_PURPOSE__TIME_TYPE, oldTimeType, timeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_valuesPackage.TIME_PURPOSE__TIME_TYPE:
				return getTimeType();
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
			case UATMM_valuesPackage.TIME_PURPOSE__TIME_TYPE:
				setTimeType((TimeType)newValue);
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
			case UATMM_valuesPackage.TIME_PURPOSE__TIME_TYPE:
				setTimeType(TIME_TYPE_EDEFAULT);
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
			case UATMM_valuesPackage.TIME_PURPOSE__TIME_TYPE:
				return timeType != TIME_TYPE_EDEFAULT;
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
		result.append(" (timeType: ");
		result.append(timeType);
		result.append(')');
		return result.toString();
	}

} //TimePurposeImpl
