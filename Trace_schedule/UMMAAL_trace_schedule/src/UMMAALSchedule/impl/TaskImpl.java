/**
 */
package UMMAALSchedule.impl;

import UMMAALSchedule.Executable;
import UMMAALSchedule.Executor;
import UMMAALSchedule.Task;
import UMMAALSchedule.Time;
import UMMAALSchedule.UMMAALSchedulePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getNextInStartTime <em>Next In Start Time</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getPreviousInStartTime <em>Previous In Start Time</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getNextInEndTime <em>Next In End Time</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getPreviousInEndTime <em>Previous In End Time</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getNextInExecutor <em>Next In Executor</em>}</li>
 *   <li>{@link UMMAALSchedule.impl.TaskImpl#getPreviousInExecutor <em>Previous In Executor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends IdentifiableImpl implements Task {
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
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Time startTime;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Time endTime;

	/**
	 * The cached value of the '{@link #getExecutable() <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected Executable executable;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The cached value of the '{@link #getNextInStartTime() <em>Next In Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInStartTime()
	 * @generated
	 * @ordered
	 */
	protected Task nextInStartTime;

	/**
	 * The cached value of the '{@link #getPreviousInStartTime() <em>Previous In Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousInStartTime()
	 * @generated
	 * @ordered
	 */
	protected Task previousInStartTime;

	/**
	 * The cached value of the '{@link #getNextInEndTime() <em>Next In End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInEndTime()
	 * @generated
	 * @ordered
	 */
	protected Task nextInEndTime;

	/**
	 * The cached value of the '{@link #getPreviousInEndTime() <em>Previous In End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousInEndTime()
	 * @generated
	 * @ordered
	 */
	protected Task previousInEndTime;

	/**
	 * The cached value of the '{@link #getNextInExecutor() <em>Next In Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInExecutor()
	 * @generated
	 * @ordered
	 */
	protected Task nextInExecutor;

	/**
	 * The cached value of the '{@link #getPreviousInExecutor() <em>Previous In Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousInExecutor()
	 * @generated
	 * @ordered
	 */
	protected Task previousInExecutor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMMAALSchedulePackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTime(Time newStartTime, NotificationChain msgs) {
		Time oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__START_TIME, oldStartTime, newStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Time newStartTime) {
		if (newStartTime != startTime) {
			NotificationChain msgs = null;
			if (startTime != null)
				msgs = ((InternalEObject)startTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMMAALSchedulePackage.TASK__START_TIME, null, msgs);
			if (newStartTime != null)
				msgs = ((InternalEObject)newStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMMAALSchedulePackage.TASK__START_TIME, null, msgs);
			msgs = basicSetStartTime(newStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__START_TIME, newStartTime, newStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndTime(Time newEndTime, NotificationChain msgs) {
		Time oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__END_TIME, oldEndTime, newEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Time newEndTime) {
		if (newEndTime != endTime) {
			NotificationChain msgs = null;
			if (endTime != null)
				msgs = ((InternalEObject)endTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMMAALSchedulePackage.TASK__END_TIME, null, msgs);
			if (newEndTime != null)
				msgs = ((InternalEObject)newEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMMAALSchedulePackage.TASK__END_TIME, null, msgs);
			msgs = basicSetEndTime(newEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__END_TIME, newEndTime, newEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executable getExecutable() {
		if (executable != null && executable.eIsProxy()) {
			InternalEObject oldExecutable = (InternalEObject)executable;
			executable = (Executable)eResolveProxy(oldExecutable);
			if (executable != oldExecutable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__EXECUTABLE, oldExecutable, executable));
			}
		}
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executable basicGetExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(Executable newExecutable) {
		Executable oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__EXECUTABLE, oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject)executor;
			executor = (Executor)eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__EXECUTOR, oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__EXECUTOR, oldExecutor, executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getNextInStartTime() {
		if (nextInStartTime != null && nextInStartTime.eIsProxy()) {
			InternalEObject oldNextInStartTime = (InternalEObject)nextInStartTime;
			nextInStartTime = (Task)eResolveProxy(oldNextInStartTime);
			if (nextInStartTime != oldNextInStartTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME, oldNextInStartTime, nextInStartTime));
			}
		}
		return nextInStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNextInStartTime() {
		return nextInStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextInStartTime(Task newNextInStartTime, NotificationChain msgs) {
		Task oldNextInStartTime = nextInStartTime;
		nextInStartTime = newNextInStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME, oldNextInStartTime, newNextInStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextInStartTime(Task newNextInStartTime) {
		if (newNextInStartTime != nextInStartTime) {
			NotificationChain msgs = null;
			if (nextInStartTime != null)
				msgs = ((InternalEObject)nextInStartTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME, Task.class, msgs);
			if (newNextInStartTime != null)
				msgs = ((InternalEObject)newNextInStartTime).eInverseAdd(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME, Task.class, msgs);
			msgs = basicSetNextInStartTime(newNextInStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME, newNextInStartTime, newNextInStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPreviousInStartTime() {
		if (previousInStartTime != null && previousInStartTime.eIsProxy()) {
			InternalEObject oldPreviousInStartTime = (InternalEObject)previousInStartTime;
			previousInStartTime = (Task)eResolveProxy(oldPreviousInStartTime);
			if (previousInStartTime != oldPreviousInStartTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME, oldPreviousInStartTime, previousInStartTime));
			}
		}
		return previousInStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPreviousInStartTime() {
		return previousInStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousInStartTime(Task newPreviousInStartTime, NotificationChain msgs) {
		Task oldPreviousInStartTime = previousInStartTime;
		previousInStartTime = newPreviousInStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME, oldPreviousInStartTime, newPreviousInStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousInStartTime(Task newPreviousInStartTime) {
		if (newPreviousInStartTime != previousInStartTime) {
			NotificationChain msgs = null;
			if (previousInStartTime != null)
				msgs = ((InternalEObject)previousInStartTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME, Task.class, msgs);
			if (newPreviousInStartTime != null)
				msgs = ((InternalEObject)newPreviousInStartTime).eInverseAdd(this, UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME, Task.class, msgs);
			msgs = basicSetPreviousInStartTime(newPreviousInStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME, newPreviousInStartTime, newPreviousInStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getNextInEndTime() {
		if (nextInEndTime != null && nextInEndTime.eIsProxy()) {
			InternalEObject oldNextInEndTime = (InternalEObject)nextInEndTime;
			nextInEndTime = (Task)eResolveProxy(oldNextInEndTime);
			if (nextInEndTime != oldNextInEndTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME, oldNextInEndTime, nextInEndTime));
			}
		}
		return nextInEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNextInEndTime() {
		return nextInEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextInEndTime(Task newNextInEndTime, NotificationChain msgs) {
		Task oldNextInEndTime = nextInEndTime;
		nextInEndTime = newNextInEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME, oldNextInEndTime, newNextInEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextInEndTime(Task newNextInEndTime) {
		if (newNextInEndTime != nextInEndTime) {
			NotificationChain msgs = null;
			if (nextInEndTime != null)
				msgs = ((InternalEObject)nextInEndTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME, Task.class, msgs);
			if (newNextInEndTime != null)
				msgs = ((InternalEObject)newNextInEndTime).eInverseAdd(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME, Task.class, msgs);
			msgs = basicSetNextInEndTime(newNextInEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME, newNextInEndTime, newNextInEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPreviousInEndTime() {
		if (previousInEndTime != null && previousInEndTime.eIsProxy()) {
			InternalEObject oldPreviousInEndTime = (InternalEObject)previousInEndTime;
			previousInEndTime = (Task)eResolveProxy(oldPreviousInEndTime);
			if (previousInEndTime != oldPreviousInEndTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME, oldPreviousInEndTime, previousInEndTime));
			}
		}
		return previousInEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPreviousInEndTime() {
		return previousInEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousInEndTime(Task newPreviousInEndTime, NotificationChain msgs) {
		Task oldPreviousInEndTime = previousInEndTime;
		previousInEndTime = newPreviousInEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME, oldPreviousInEndTime, newPreviousInEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousInEndTime(Task newPreviousInEndTime) {
		if (newPreviousInEndTime != previousInEndTime) {
			NotificationChain msgs = null;
			if (previousInEndTime != null)
				msgs = ((InternalEObject)previousInEndTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME, Task.class, msgs);
			if (newPreviousInEndTime != null)
				msgs = ((InternalEObject)newPreviousInEndTime).eInverseAdd(this, UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME, Task.class, msgs);
			msgs = basicSetPreviousInEndTime(newPreviousInEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME, newPreviousInEndTime, newPreviousInEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getNextInExecutor() {
		if (nextInExecutor != null && nextInExecutor.eIsProxy()) {
			InternalEObject oldNextInExecutor = (InternalEObject)nextInExecutor;
			nextInExecutor = (Task)eResolveProxy(oldNextInExecutor);
			if (nextInExecutor != oldNextInExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR, oldNextInExecutor, nextInExecutor));
			}
		}
		return nextInExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNextInExecutor() {
		return nextInExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextInExecutor(Task newNextInExecutor, NotificationChain msgs) {
		Task oldNextInExecutor = nextInExecutor;
		nextInExecutor = newNextInExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR, oldNextInExecutor, newNextInExecutor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextInExecutor(Task newNextInExecutor) {
		if (newNextInExecutor != nextInExecutor) {
			NotificationChain msgs = null;
			if (nextInExecutor != null)
				msgs = ((InternalEObject)nextInExecutor).eInverseRemove(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR, Task.class, msgs);
			if (newNextInExecutor != null)
				msgs = ((InternalEObject)newNextInExecutor).eInverseAdd(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR, Task.class, msgs);
			msgs = basicSetNextInExecutor(newNextInExecutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR, newNextInExecutor, newNextInExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPreviousInExecutor() {
		if (previousInExecutor != null && previousInExecutor.eIsProxy()) {
			InternalEObject oldPreviousInExecutor = (InternalEObject)previousInExecutor;
			previousInExecutor = (Task)eResolveProxy(oldPreviousInExecutor);
			if (previousInExecutor != oldPreviousInExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR, oldPreviousInExecutor, previousInExecutor));
			}
		}
		return previousInExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPreviousInExecutor() {
		return previousInExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousInExecutor(Task newPreviousInExecutor, NotificationChain msgs) {
		Task oldPreviousInExecutor = previousInExecutor;
		previousInExecutor = newPreviousInExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR, oldPreviousInExecutor, newPreviousInExecutor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousInExecutor(Task newPreviousInExecutor) {
		if (newPreviousInExecutor != previousInExecutor) {
			NotificationChain msgs = null;
			if (previousInExecutor != null)
				msgs = ((InternalEObject)previousInExecutor).eInverseRemove(this, UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR, Task.class, msgs);
			if (newPreviousInExecutor != null)
				msgs = ((InternalEObject)newPreviousInExecutor).eInverseAdd(this, UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR, Task.class, msgs);
			msgs = basicSetPreviousInExecutor(newPreviousInExecutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR, newPreviousInExecutor, newPreviousInExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME:
				if (nextInStartTime != null)
					msgs = ((InternalEObject)nextInStartTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME, Task.class, msgs);
				return basicSetNextInStartTime((Task)otherEnd, msgs);
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME:
				if (previousInStartTime != null)
					msgs = ((InternalEObject)previousInStartTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME, Task.class, msgs);
				return basicSetPreviousInStartTime((Task)otherEnd, msgs);
			case UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME:
				if (nextInEndTime != null)
					msgs = ((InternalEObject)nextInEndTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME, Task.class, msgs);
				return basicSetNextInEndTime((Task)otherEnd, msgs);
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME:
				if (previousInEndTime != null)
					msgs = ((InternalEObject)previousInEndTime).eInverseRemove(this, UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME, Task.class, msgs);
				return basicSetPreviousInEndTime((Task)otherEnd, msgs);
			case UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR:
				if (nextInExecutor != null)
					msgs = ((InternalEObject)nextInExecutor).eInverseRemove(this, UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR, Task.class, msgs);
				return basicSetNextInExecutor((Task)otherEnd, msgs);
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR:
				if (previousInExecutor != null)
					msgs = ((InternalEObject)previousInExecutor).eInverseRemove(this, UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR, Task.class, msgs);
				return basicSetPreviousInExecutor((Task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMMAALSchedulePackage.TASK__START_TIME:
				return basicSetStartTime(null, msgs);
			case UMMAALSchedulePackage.TASK__END_TIME:
				return basicSetEndTime(null, msgs);
			case UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME:
				return basicSetNextInStartTime(null, msgs);
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME:
				return basicSetPreviousInStartTime(null, msgs);
			case UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME:
				return basicSetNextInEndTime(null, msgs);
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME:
				return basicSetPreviousInEndTime(null, msgs);
			case UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR:
				return basicSetNextInExecutor(null, msgs);
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR:
				return basicSetPreviousInExecutor(null, msgs);
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
			case UMMAALSchedulePackage.TASK__NAME:
				return getName();
			case UMMAALSchedulePackage.TASK__START_TIME:
				return getStartTime();
			case UMMAALSchedulePackage.TASK__END_TIME:
				return getEndTime();
			case UMMAALSchedulePackage.TASK__EXECUTABLE:
				if (resolve) return getExecutable();
				return basicGetExecutable();
			case UMMAALSchedulePackage.TASK__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
			case UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME:
				if (resolve) return getNextInStartTime();
				return basicGetNextInStartTime();
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME:
				if (resolve) return getPreviousInStartTime();
				return basicGetPreviousInStartTime();
			case UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME:
				if (resolve) return getNextInEndTime();
				return basicGetNextInEndTime();
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME:
				if (resolve) return getPreviousInEndTime();
				return basicGetPreviousInEndTime();
			case UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR:
				if (resolve) return getNextInExecutor();
				return basicGetNextInExecutor();
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR:
				if (resolve) return getPreviousInExecutor();
				return basicGetPreviousInExecutor();
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
			case UMMAALSchedulePackage.TASK__NAME:
				setName((String)newValue);
				return;
			case UMMAALSchedulePackage.TASK__START_TIME:
				setStartTime((Time)newValue);
				return;
			case UMMAALSchedulePackage.TASK__END_TIME:
				setEndTime((Time)newValue);
				return;
			case UMMAALSchedulePackage.TASK__EXECUTABLE:
				setExecutable((Executable)newValue);
				return;
			case UMMAALSchedulePackage.TASK__EXECUTOR:
				setExecutor((Executor)newValue);
				return;
			case UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME:
				setNextInStartTime((Task)newValue);
				return;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME:
				setPreviousInStartTime((Task)newValue);
				return;
			case UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME:
				setNextInEndTime((Task)newValue);
				return;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME:
				setPreviousInEndTime((Task)newValue);
				return;
			case UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR:
				setNextInExecutor((Task)newValue);
				return;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR:
				setPreviousInExecutor((Task)newValue);
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
			case UMMAALSchedulePackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UMMAALSchedulePackage.TASK__START_TIME:
				setStartTime((Time)null);
				return;
			case UMMAALSchedulePackage.TASK__END_TIME:
				setEndTime((Time)null);
				return;
			case UMMAALSchedulePackage.TASK__EXECUTABLE:
				setExecutable((Executable)null);
				return;
			case UMMAALSchedulePackage.TASK__EXECUTOR:
				setExecutor((Executor)null);
				return;
			case UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME:
				setNextInStartTime((Task)null);
				return;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME:
				setPreviousInStartTime((Task)null);
				return;
			case UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME:
				setNextInEndTime((Task)null);
				return;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME:
				setPreviousInEndTime((Task)null);
				return;
			case UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR:
				setNextInExecutor((Task)null);
				return;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR:
				setPreviousInExecutor((Task)null);
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
			case UMMAALSchedulePackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UMMAALSchedulePackage.TASK__START_TIME:
				return startTime != null;
			case UMMAALSchedulePackage.TASK__END_TIME:
				return endTime != null;
			case UMMAALSchedulePackage.TASK__EXECUTABLE:
				return executable != null;
			case UMMAALSchedulePackage.TASK__EXECUTOR:
				return executor != null;
			case UMMAALSchedulePackage.TASK__NEXT_IN_START_TIME:
				return nextInStartTime != null;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_START_TIME:
				return previousInStartTime != null;
			case UMMAALSchedulePackage.TASK__NEXT_IN_END_TIME:
				return nextInEndTime != null;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_END_TIME:
				return previousInEndTime != null;
			case UMMAALSchedulePackage.TASK__NEXT_IN_EXECUTOR:
				return nextInExecutor != null;
			case UMMAALSchedulePackage.TASK__PREVIOUS_IN_EXECUTOR:
				return previousInExecutor != null;
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

} //TaskImpl
