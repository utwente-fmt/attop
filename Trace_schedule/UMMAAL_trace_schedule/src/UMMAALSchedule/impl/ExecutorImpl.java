/**
 */
package UMMAALSchedule.impl;

import UMMAALSchedule.Executor;
import UMMAALSchedule.UMMAALSchedulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.impl.ExecutorImpl#getName <em>Name</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.ExecutorImpl#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutorImpl extends IdentifiableImpl implements Executor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected EObject externalReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMMAALSchedulePackage.Literals.EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.EXECUTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getExternalReference() {
		if (externalReference != null && externalReference.eIsProxy()) {
			InternalEObject oldExternalReference = (InternalEObject)externalReference;
			externalReference = eResolveProxy(oldExternalReference);
			if (externalReference != oldExternalReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE, oldExternalReference, externalReference));
			}
		}
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetExternalReference() {
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalReference(EObject newExternalReference) {
		EObject oldExternalReference = externalReference;
		externalReference = newExternalReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE, oldExternalReference, externalReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMMAALSchedulePackage.EXECUTOR__NAME:
				return getName();
			case UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE:
				if (resolve) return getExternalReference();
				return basicGetExternalReference();
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
			case UMMAALSchedulePackage.EXECUTOR__NAME:
				setName((String)newValue);
				return;
			case UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE:
				setExternalReference((EObject)newValue);
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
			case UMMAALSchedulePackage.EXECUTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE:
				setExternalReference((EObject)null);
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
			case UMMAALSchedulePackage.EXECUTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE:
				return externalReference != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExecutorImpl
