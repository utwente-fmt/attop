/**
 */
package uppaalTrace.value.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.uppaal.declarations.DataVariableDeclaration;

import uppaalTrace.Valuation;

import uppaalTrace.value.DataVariableDeclarationValuation;
import uppaalTrace.value.ValuePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Variable Declaration Valuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.value.impl.DataVariableDeclarationValuationImpl#getDataVariableDeclaration <em>Data Variable Declaration</em>}</li>
 *   <li>{@link uppaalTrace.value.impl.DataVariableDeclarationValuationImpl#getValuation <em>Valuation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVariableDeclarationValuationImpl extends EObjectImpl implements DataVariableDeclarationValuation {
	/**
	 * The cached value of the '{@link #getDataVariableDeclaration() <em>Data Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected DataVariableDeclaration dataVariableDeclaration;

	/**
	 * The cached value of the '{@link #getValuation() <em>Valuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuation()
	 * @generated
	 * @ordered
	 */
	protected EList<Valuation> valuation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVariableDeclarationValuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.DATA_VARIABLE_DECLARATION_VALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariableDeclaration getDataVariableDeclaration() {
		if (dataVariableDeclaration != null && dataVariableDeclaration.eIsProxy()) {
			InternalEObject oldDataVariableDeclaration = (InternalEObject)dataVariableDeclaration;
			dataVariableDeclaration = (DataVariableDeclaration)eResolveProxy(oldDataVariableDeclaration);
			if (dataVariableDeclaration != oldDataVariableDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION, oldDataVariableDeclaration, dataVariableDeclaration));
			}
		}
		return dataVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariableDeclaration basicGetDataVariableDeclaration() {
		return dataVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataVariableDeclaration(DataVariableDeclaration newDataVariableDeclaration) {
		DataVariableDeclaration oldDataVariableDeclaration = dataVariableDeclaration;
		dataVariableDeclaration = newDataVariableDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION, oldDataVariableDeclaration, dataVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valuation> getValuation() {
		if (valuation == null) {
			valuation = new EObjectContainmentEList<Valuation>(Valuation.class, this, ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION);
		}
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				return ((InternalEList<?>)getValuation()).basicRemove(otherEnd, msgs);
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
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				if (resolve) return getDataVariableDeclaration();
				return basicGetDataVariableDeclaration();
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				return getValuation();
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
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				setDataVariableDeclaration((DataVariableDeclaration)newValue);
				return;
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				getValuation().clear();
				getValuation().addAll((Collection<? extends Valuation>)newValue);
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
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				setDataVariableDeclaration((DataVariableDeclaration)null);
				return;
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				getValuation().clear();
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
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				return dataVariableDeclaration != null;
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				return valuation != null && !valuation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataVariableDeclarationValuationImpl
