/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaTypeImpl#getValueClass <em>Value Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaTypeImpl extends TypeImpl implements JavaType {
	/**
	 * The cached value of the '{@link #getValueClass() <em>Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> valueClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UATMM_valuesPackage.Literals.JAVA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getValueClass() {
		return valueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueClass(Class<?> newValueClass) {
		Class<?> oldValueClass = valueClass;
		valueClass = newValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UATMM_valuesPackage.JAVA_TYPE__VALUE_CLASS, oldValueClass, valueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UATMM_valuesPackage.JAVA_TYPE__VALUE_CLASS:
				return getValueClass();
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
			case UATMM_valuesPackage.JAVA_TYPE__VALUE_CLASS:
				setValueClass((Class<?>)newValue);
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
			case UATMM_valuesPackage.JAVA_TYPE__VALUE_CLASS:
				setValueClass((Class<?>)null);
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
			case UATMM_valuesPackage.JAVA_TYPE__VALUE_CLASS:
				return valueClass != null;
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
		result.append(" (valueClass: ");
		result.append(valueClass);
		result.append(')');
		return result.toString();
	}

} //JavaTypeImpl
