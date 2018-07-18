/**
 */
package UMMAALSchedule.impl;

import UMMAALSchedule.Executable;
import UMMAALSchedule.Executor;
import UMMAALSchedule.Root;
import UMMAALSchedule.Task;
import UMMAALSchedule.UMMAALSchedulePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.impl.RootImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.RootImpl#getExecutables <em>Executables</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.RootImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends IdentifiableImpl implements Root {
	/**
	 * The cached value of the '{@link #getExecutors() <em>Executors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutors()
	 * @generated
	 * @ordered
	 */
	protected EList<Executor> executors;

	/**
	 * The cached value of the '{@link #getExecutables() <em>Executables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutables()
	 * @generated
	 * @ordered
	 */
	protected EList<Executable> executables;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMMAALSchedulePackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Executor> getExecutors() {
		if (executors == null) {
			executors = new EObjectContainmentEList<Executor>(Executor.class, this, UMMAALSchedulePackage.ROOT__EXECUTORS);
		}
		return executors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Executable> getExecutables() {
		if (executables == null) {
			executables = new EObjectContainmentEList<Executable>(Executable.class, this, UMMAALSchedulePackage.ROOT__EXECUTABLES);
		}
		return executables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, UMMAALSchedulePackage.ROOT__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMMAALSchedulePackage.ROOT__EXECUTORS:
				return ((InternalEList<?>)getExecutors()).basicRemove(otherEnd, msgs);
			case UMMAALSchedulePackage.ROOT__EXECUTABLES:
				return ((InternalEList<?>)getExecutables()).basicRemove(otherEnd, msgs);
			case UMMAALSchedulePackage.ROOT__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case UMMAALSchedulePackage.ROOT__EXECUTORS:
				return getExecutors();
			case UMMAALSchedulePackage.ROOT__EXECUTABLES:
				return getExecutables();
			case UMMAALSchedulePackage.ROOT__TASKS:
				return getTasks();
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
			case UMMAALSchedulePackage.ROOT__EXECUTORS:
				getExecutors().clear();
				getExecutors().addAll((Collection<? extends Executor>)newValue);
				return;
			case UMMAALSchedulePackage.ROOT__EXECUTABLES:
				getExecutables().clear();
				getExecutables().addAll((Collection<? extends Executable>)newValue);
				return;
			case UMMAALSchedulePackage.ROOT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case UMMAALSchedulePackage.ROOT__EXECUTORS:
				getExecutors().clear();
				return;
			case UMMAALSchedulePackage.ROOT__EXECUTABLES:
				getExecutables().clear();
				return;
			case UMMAALSchedulePackage.ROOT__TASKS:
				getTasks().clear();
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
			case UMMAALSchedulePackage.ROOT__EXECUTORS:
				return executors != null && !executors.isEmpty();
			case UMMAALSchedulePackage.ROOT__EXECUTABLES:
				return executables != null && !executables.isEmpty();
			case UMMAALSchedulePackage.ROOT__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
