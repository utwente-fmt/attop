/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probability Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ProbabilityPurposeImpl#getProbType <em>Prob Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilityPurposeImpl extends PurposeImpl implements ProbabilityPurpose {
	/**
	 * The default value of the '{@link #getProbType() <em>Prob Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbType()
	 * @generated
	 * @ordered
	 */
	protected static final ProbabilityType PROB_TYPE_EDEFAULT = ProbabilityType.COMPLETION;

	/**
	 * The cached value of the '{@link #getProbType() <em>Prob Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbType()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityType probType = PROB_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityPurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_valuesPackage.Literals.PROBABILITY_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityType getProbType() {
		return probType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbType(ProbabilityType newProbType) {
		ProbabilityType oldProbType = probType;
		probType = newProbType == null ? PROB_TYPE_EDEFAULT : newProbType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_valuesPackage.PROBABILITY_PURPOSE__PROB_TYPE, oldProbType, probType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_valuesPackage.PROBABILITY_PURPOSE__PROB_TYPE:
				return getProbType();
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
			case UATMM_valuesPackage.PROBABILITY_PURPOSE__PROB_TYPE:
				setProbType((ProbabilityType)newValue);
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
			case UATMM_valuesPackage.PROBABILITY_PURPOSE__PROB_TYPE:
				setProbType(PROB_TYPE_EDEFAULT);
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
			case UATMM_valuesPackage.PROBABILITY_PURPOSE__PROB_TYPE:
				return probType != PROB_TYPE_EDEFAULT;
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
		result.append(" (probType: ");
		result.append(probType);
		result.append(')');
		return result.toString();
	}

} //ProbabilityPurposeImpl
