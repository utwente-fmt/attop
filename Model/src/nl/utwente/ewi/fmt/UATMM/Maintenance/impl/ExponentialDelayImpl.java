/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.impl;

import nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ExponentialDelayImpl#getMeanTime <em>Mean Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialDelayImpl extends DelayImpl implements ExponentialDelay {
	/**
	 * The default value of the '{@link #getMeanTime() <em>Mean Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanTime() <em>Mean Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanTime()
	 * @generated
	 * @ordered
	 */
	protected double meanTime = MEAN_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialDelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.EXPONENTIAL_DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanTime() {
		return meanTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanTime(double newMeanTime) {
		double oldMeanTime = meanTime;
		meanTime = newMeanTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.EXPONENTIAL_DELAY__MEAN_TIME, oldMeanTime, meanTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.EXPONENTIAL_DELAY__MEAN_TIME:
				return getMeanTime();
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
			case MaintenancePackage.EXPONENTIAL_DELAY__MEAN_TIME:
				setMeanTime((Double)newValue);
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
			case MaintenancePackage.EXPONENTIAL_DELAY__MEAN_TIME:
				setMeanTime(MEAN_TIME_EDEFAULT);
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
			case MaintenancePackage.EXPONENTIAL_DELAY__MEAN_TIME:
				return meanTime != MEAN_TIME_EDEFAULT;
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
		result.append(" (meanTime: ");
		result.append(meanTime);
		result.append(')');
		return result.toString();
	}

} //ExponentialDelayImpl
