/**
 */
package UMMAALSchedule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.Task#getName <em>Name</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getEndTime <em>End Time</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getExecutable <em>Executable</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getExecutor <em>Executor</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getNextInStartTime <em>Next In Start Time</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getPreviousInStartTime <em>Previous In Start Time</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getNextInEndTime <em>Next In End Time</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getPreviousInEndTime <em>Previous In End Time</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getNextInExecutor <em>Next In Executor</em>}</li>
 *   <li>{@link UMMAALSchedule.Task#getPreviousInExecutor <em>Previous In Executor</em>}</li>
 * </ul>
 *
 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' containment reference.
	 * @see #setStartTime(Time)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_StartTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getStartTime();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getStartTime <em>Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' containment reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Time value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' containment reference.
	 * @see #setEndTime(Time)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_EndTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getEndTime();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getEndTime <em>End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' containment reference.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Time value);

	/**
	 * Returns the value of the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' reference.
	 * @see #setExecutable(Executable)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_Executable()
	 * @model required="true"
	 * @generated
	 */
	Executable getExecutable();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getExecutable <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' reference.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(Executable value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see #setExecutor(Executor)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_Executor()
	 * @model required="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * Returns the value of the '<em><b>Next In Start Time</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UMMAALSchedule.Task#getPreviousInStartTime <em>Previous In Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next In Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next In Start Time</em>' reference.
	 * @see #setNextInStartTime(Task)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_NextInStartTime()
	 * @see UMMAALSchedule.Task#getPreviousInStartTime
	 * @model opposite="previousInStartTime"
	 * @generated
	 */
	Task getNextInStartTime();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getNextInStartTime <em>Next In Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next In Start Time</em>' reference.
	 * @see #getNextInStartTime()
	 * @generated
	 */
	void setNextInStartTime(Task value);

	/**
	 * Returns the value of the '<em><b>Previous In Start Time</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UMMAALSchedule.Task#getNextInStartTime <em>Next In Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous In Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous In Start Time</em>' reference.
	 * @see #setPreviousInStartTime(Task)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_PreviousInStartTime()
	 * @see UMMAALSchedule.Task#getNextInStartTime
	 * @model opposite="nextInStartTime"
	 * @generated
	 */
	Task getPreviousInStartTime();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getPreviousInStartTime <em>Previous In Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous In Start Time</em>' reference.
	 * @see #getPreviousInStartTime()
	 * @generated
	 */
	void setPreviousInStartTime(Task value);

	/**
	 * Returns the value of the '<em><b>Next In End Time</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UMMAALSchedule.Task#getPreviousInEndTime <em>Previous In End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next In End Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next In End Time</em>' reference.
	 * @see #setNextInEndTime(Task)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_NextInEndTime()
	 * @see UMMAALSchedule.Task#getPreviousInEndTime
	 * @model opposite="previousInEndTime"
	 * @generated
	 */
	Task getNextInEndTime();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getNextInEndTime <em>Next In End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next In End Time</em>' reference.
	 * @see #getNextInEndTime()
	 * @generated
	 */
	void setNextInEndTime(Task value);

	/**
	 * Returns the value of the '<em><b>Previous In End Time</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UMMAALSchedule.Task#getNextInEndTime <em>Next In End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous In End Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous In End Time</em>' reference.
	 * @see #setPreviousInEndTime(Task)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_PreviousInEndTime()
	 * @see UMMAALSchedule.Task#getNextInEndTime
	 * @model opposite="nextInEndTime"
	 * @generated
	 */
	Task getPreviousInEndTime();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getPreviousInEndTime <em>Previous In End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous In End Time</em>' reference.
	 * @see #getPreviousInEndTime()
	 * @generated
	 */
	void setPreviousInEndTime(Task value);

	/**
	 * Returns the value of the '<em><b>Next In Executor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UMMAALSchedule.Task#getPreviousInExecutor <em>Previous In Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next In Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next In Executor</em>' reference.
	 * @see #setNextInExecutor(Task)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_NextInExecutor()
	 * @see UMMAALSchedule.Task#getPreviousInExecutor
	 * @model opposite="previousInExecutor"
	 * @generated
	 */
	Task getNextInExecutor();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getNextInExecutor <em>Next In Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next In Executor</em>' reference.
	 * @see #getNextInExecutor()
	 * @generated
	 */
	void setNextInExecutor(Task value);

	/**
	 * Returns the value of the '<em><b>Previous In Executor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UMMAALSchedule.Task#getNextInExecutor <em>Next In Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous In Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous In Executor</em>' reference.
	 * @see #setPreviousInExecutor(Task)
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getTask_PreviousInExecutor()
	 * @see UMMAALSchedule.Task#getNextInExecutor
	 * @model opposite="nextInExecutor"
	 * @generated
	 */
	Task getPreviousInExecutor();

	/**
	 * Sets the value of the '{@link UMMAALSchedule.Task#getPreviousInExecutor <em>Previous In Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous In Executor</em>' reference.
	 * @see #getPreviousInExecutor()
	 * @generated
	 */
	void setPreviousInExecutor(Task value);

} // Task
