/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import java.util.Collection;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.RealSequenceValue;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Sequence Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealSequenceValueImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealSequenceValueImpl extends ValueImpl implements RealSequenceValue {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealSequenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_valuesPackage.Literals.REAL_SEQUENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSequence() {
		if (sequence == null) {
			sequence = new EDataTypeEList<Double>(Double.class, this, UATMM_valuesPackage.REAL_SEQUENCE_VALUE__SEQUENCE);
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_valuesPackage.REAL_SEQUENCE_VALUE__SEQUENCE:
				return getSequence();
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
			case UATMM_valuesPackage.REAL_SEQUENCE_VALUE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends Double>)newValue);
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
			case UATMM_valuesPackage.REAL_SEQUENCE_VALUE__SEQUENCE:
				getSequence().clear();
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
			case UATMM_valuesPackage.REAL_SEQUENCE_VALUE__SEQUENCE:
				return sequence != null && !sequence.isEmpty();
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
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(')');
		return result.toString();
	}

} //RealSequenceValueImpl
