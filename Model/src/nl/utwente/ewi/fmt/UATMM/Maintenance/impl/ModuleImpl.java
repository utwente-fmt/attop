/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.impl;

import java.util.Collection;

import nl.utwente.ewi.fmt.UATMM.Maintenance.Condition;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Effect;
import nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Module;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl#getMaxEffectsInProgress <em>Max Effects In Progress</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl#getEffectDiscipline <em>Effect Discipline</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.impl.ModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> effects;

	/**
	 * The default value of the '{@link #getMaxEffectsInProgress() <em>Max Effects In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEffectsInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EFFECTS_IN_PROGRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxEffectsInProgress() <em>Max Effects In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEffectsInProgress()
	 * @generated
	 * @ordered
	 */
	protected int maxEffectsInProgress = MAX_EFFECTS_IN_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectDiscipline() <em>Effect Discipline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectDiscipline()
	 * @generated
	 * @ordered
	 */
	protected static final EffectDiscipline EFFECT_DISCIPLINE_EDEFAULT = EffectDiscipline.RANDOM;

	/**
	 * The cached value of the '{@link #getEffectDiscipline() <em>Effect Discipline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectDiscipline()
	 * @generated
	 * @ordered
	 */
	protected EffectDiscipline effectDiscipline = EFFECT_DISCIPLINE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancePackage.MODULE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.MODULE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancePackage.MODULE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MODULE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<Effect>(Effect.class, this, MaintenancePackage.MODULE__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxEffectsInProgress() {
		return maxEffectsInProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEffectsInProgress(int newMaxEffectsInProgress) {
		int oldMaxEffectsInProgress = maxEffectsInProgress;
		maxEffectsInProgress = newMaxEffectsInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MODULE__MAX_EFFECTS_IN_PROGRESS, oldMaxEffectsInProgress, maxEffectsInProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectDiscipline getEffectDiscipline() {
		return effectDiscipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectDiscipline(EffectDiscipline newEffectDiscipline) {
		EffectDiscipline oldEffectDiscipline = effectDiscipline;
		effectDiscipline = newEffectDiscipline == null ? EFFECT_DISCIPLINE_EDEFAULT : newEffectDiscipline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MODULE__EFFECT_DISCIPLINE, oldEffectDiscipline, effectDiscipline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancePackage.MODULE__CONDITION:
				return basicSetCondition(null, msgs);
			case MaintenancePackage.MODULE__EFFECTS:
				return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
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
			case MaintenancePackage.MODULE__CONDITION:
				return getCondition();
			case MaintenancePackage.MODULE__EFFECTS:
				return getEffects();
			case MaintenancePackage.MODULE__MAX_EFFECTS_IN_PROGRESS:
				return getMaxEffectsInProgress();
			case MaintenancePackage.MODULE__EFFECT_DISCIPLINE:
				return getEffectDiscipline();
			case MaintenancePackage.MODULE__NAME:
				return getName();
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
			case MaintenancePackage.MODULE__CONDITION:
				setCondition((Condition)newValue);
				return;
			case MaintenancePackage.MODULE__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends Effect>)newValue);
				return;
			case MaintenancePackage.MODULE__MAX_EFFECTS_IN_PROGRESS:
				setMaxEffectsInProgress((Integer)newValue);
				return;
			case MaintenancePackage.MODULE__EFFECT_DISCIPLINE:
				setEffectDiscipline((EffectDiscipline)newValue);
				return;
			case MaintenancePackage.MODULE__NAME:
				setName((String)newValue);
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
			case MaintenancePackage.MODULE__CONDITION:
				setCondition((Condition)null);
				return;
			case MaintenancePackage.MODULE__EFFECTS:
				getEffects().clear();
				return;
			case MaintenancePackage.MODULE__MAX_EFFECTS_IN_PROGRESS:
				setMaxEffectsInProgress(MAX_EFFECTS_IN_PROGRESS_EDEFAULT);
				return;
			case MaintenancePackage.MODULE__EFFECT_DISCIPLINE:
				setEffectDiscipline(EFFECT_DISCIPLINE_EDEFAULT);
				return;
			case MaintenancePackage.MODULE__NAME:
				setName(NAME_EDEFAULT);
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
			case MaintenancePackage.MODULE__CONDITION:
				return condition != null;
			case MaintenancePackage.MODULE__EFFECTS:
				return effects != null && !effects.isEmpty();
			case MaintenancePackage.MODULE__MAX_EFFECTS_IN_PROGRESS:
				return maxEffectsInProgress != MAX_EFFECTS_IN_PROGRESS_EDEFAULT;
			case MaintenancePackage.MODULE__EFFECT_DISCIPLINE:
				return effectDiscipline != EFFECT_DISCIPLINE_EDEFAULT;
			case MaintenancePackage.MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (maxEffectsInProgress: ");
		result.append(maxEffectsInProgress);
		result.append(", effectDiscipline: ");
		result.append(effectDiscipline);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
