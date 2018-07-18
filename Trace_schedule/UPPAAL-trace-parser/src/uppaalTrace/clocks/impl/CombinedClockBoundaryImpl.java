/**
 */
package uppaalTrace.clocks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uppaalTrace.clocks.ClocksPackage;
import uppaalTrace.clocks.CombinedClockBoundary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Clock Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.clocks.impl.CombinedClockBoundaryImpl#getSubtrahend <em>Subtrahend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedClockBoundaryImpl extends AbstractClockBoundaryImpl implements CombinedClockBoundary {
	/**
	 * The default value of the '{@link #getSubtrahend() <em>Subtrahend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtrahend()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTRAHEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtrahend() <em>Subtrahend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtrahend()
	 * @generated
	 * @ordered
	 */
	protected String subtrahend = SUBTRAHEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedClockBoundaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClocksPackage.Literals.COMBINED_CLOCK_BOUNDARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtrahend() {
		return subtrahend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtrahend(String newSubtrahend) {
		String oldSubtrahend = subtrahend;
		subtrahend = newSubtrahend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClocksPackage.COMBINED_CLOCK_BOUNDARY__SUBTRAHEND, oldSubtrahend, subtrahend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClocksPackage.COMBINED_CLOCK_BOUNDARY__SUBTRAHEND:
				return getSubtrahend();
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
			case ClocksPackage.COMBINED_CLOCK_BOUNDARY__SUBTRAHEND:
				setSubtrahend((String)newValue);
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
			case ClocksPackage.COMBINED_CLOCK_BOUNDARY__SUBTRAHEND:
				setSubtrahend(SUBTRAHEND_EDEFAULT);
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
			case ClocksPackage.COMBINED_CLOCK_BOUNDARY__SUBTRAHEND:
				return SUBTRAHEND_EDEFAULT == null ? subtrahend != null : !SUBTRAHEND_EDEFAULT.equals(subtrahend);
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
		result.append(" (subtrahend: ");
		result.append(subtrahend);
		result.append(')');
		return result.toString();
	}

} //CombinedClockBoundaryImpl
