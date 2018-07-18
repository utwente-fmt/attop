/**
 */
package UMMAALSchedule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UMMAALSchedule.UMMAALScheduleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UMMAALSchedulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UMMAALSchedule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fmt.ewi.utwente.nl/ummaalschedule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ummaalschedule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMMAALSchedulePackage eINSTANCE = UMMAALSchedule.impl.UMMAALSchedulePackageImpl.init();

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.IdentifiableImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__UUID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.RootImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__EXECUTORS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__EXECUTABLES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TASKS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.ExecutorImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__EXTERNAL_REFERENCE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.ExecutableImpl <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.ExecutableImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__EXTERNAL_REFERENCE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.TimeImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__UUID = IDENTIFIABLE__UUID;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.TaskImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TIME = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__END_TIME = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXECUTABLE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXECUTOR = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next In Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NEXT_IN_START_TIME = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Previous In Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_IN_START_TIME = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Next In End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NEXT_IN_END_TIME = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Previous In End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_IN_END_TIME = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Next In Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NEXT_IN_EXECUTOR = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Previous In Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_IN_EXECUTOR = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.ExactTimeIntImpl <em>Exact Time Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.ExactTimeIntImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExactTimeInt()
	 * @generated
	 */
	int EXACT_TIME_INT = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_TIME_INT__UUID = TIME__UUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_TIME_INT__VALUE = TIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exact Time Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_TIME_INT_FEATURE_COUNT = TIME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UMMAALSchedule.impl.ExactTimeDoubleImpl <em>Exact Time Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALSchedule.impl.ExactTimeDoubleImpl
	 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExactTimeDouble()
	 * @generated
	 */
	int EXACT_TIME_DOUBLE = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_TIME_DOUBLE__UUID = TIME__UUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_TIME_DOUBLE__VALUE = TIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exact Time Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_TIME_DOUBLE_FEATURE_COUNT = TIME_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see UMMAALSchedule.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link UMMAALSchedule.Identifiable#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see UMMAALSchedule.Identifiable#getUuid()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Uuid();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see UMMAALSchedule.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link UMMAALSchedule.Root#getExecutors <em>Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executors</em>'.
	 * @see UMMAALSchedule.Root#getExecutors()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Executors();

	/**
	 * Returns the meta object for the containment reference list '{@link UMMAALSchedule.Root#getExecutables <em>Executables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executables</em>'.
	 * @see UMMAALSchedule.Root#getExecutables()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Executables();

	/**
	 * Returns the meta object for the containment reference list '{@link UMMAALSchedule.Root#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see UMMAALSchedule.Root#getTasks()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Tasks();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see UMMAALSchedule.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the attribute '{@link UMMAALSchedule.Executor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UMMAALSchedule.Executor#getName()
	 * @see #getExecutor()
	 * @generated
	 */
	EAttribute getExecutor_Name();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Executor#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Reference</em>'.
	 * @see UMMAALSchedule.Executor#getExternalReference()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_ExternalReference();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see UMMAALSchedule.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for the attribute '{@link UMMAALSchedule.Executable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UMMAALSchedule.Executable#getName()
	 * @see #getExecutable()
	 * @generated
	 */
	EAttribute getExecutable_Name();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Executable#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Reference</em>'.
	 * @see UMMAALSchedule.Executable#getExternalReference()
	 * @see #getExecutable()
	 * @generated
	 */
	EReference getExecutable_ExternalReference();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see UMMAALSchedule.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see UMMAALSchedule.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link UMMAALSchedule.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UMMAALSchedule.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the containment reference '{@link UMMAALSchedule.Task#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Time</em>'.
	 * @see UMMAALSchedule.Task#getStartTime()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_StartTime();

	/**
	 * Returns the meta object for the containment reference '{@link UMMAALSchedule.Task#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Time</em>'.
	 * @see UMMAALSchedule.Task#getEndTime()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_EndTime();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executable</em>'.
	 * @see UMMAALSchedule.Task#getExecutable()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Executable();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see UMMAALSchedule.Task#getExecutor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Executor();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getNextInStartTime <em>Next In Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next In Start Time</em>'.
	 * @see UMMAALSchedule.Task#getNextInStartTime()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_NextInStartTime();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getPreviousInStartTime <em>Previous In Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous In Start Time</em>'.
	 * @see UMMAALSchedule.Task#getPreviousInStartTime()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreviousInStartTime();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getNextInEndTime <em>Next In End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next In End Time</em>'.
	 * @see UMMAALSchedule.Task#getNextInEndTime()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_NextInEndTime();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getPreviousInEndTime <em>Previous In End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous In End Time</em>'.
	 * @see UMMAALSchedule.Task#getPreviousInEndTime()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreviousInEndTime();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getNextInExecutor <em>Next In Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next In Executor</em>'.
	 * @see UMMAALSchedule.Task#getNextInExecutor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_NextInExecutor();

	/**
	 * Returns the meta object for the reference '{@link UMMAALSchedule.Task#getPreviousInExecutor <em>Previous In Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous In Executor</em>'.
	 * @see UMMAALSchedule.Task#getPreviousInExecutor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreviousInExecutor();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.ExactTimeInt <em>Exact Time Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Time Int</em>'.
	 * @see UMMAALSchedule.ExactTimeInt
	 * @generated
	 */
	EClass getExactTimeInt();

	/**
	 * Returns the meta object for the attribute '{@link UMMAALSchedule.ExactTimeInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see UMMAALSchedule.ExactTimeInt#getValue()
	 * @see #getExactTimeInt()
	 * @generated
	 */
	EAttribute getExactTimeInt_Value();

	/**
	 * Returns the meta object for class '{@link UMMAALSchedule.ExactTimeDouble <em>Exact Time Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Time Double</em>'.
	 * @see UMMAALSchedule.ExactTimeDouble
	 * @generated
	 */
	EClass getExactTimeDouble();

	/**
	 * Returns the meta object for the attribute '{@link UMMAALSchedule.ExactTimeDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see UMMAALSchedule.ExactTimeDouble#getValue()
	 * @see #getExactTimeDouble()
	 * @generated
	 */
	EAttribute getExactTimeDouble_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMMAALScheduleFactory getUMMAALScheduleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.IdentifiableImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__UUID = eINSTANCE.getIdentifiable_Uuid();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.RootImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__EXECUTORS = eINSTANCE.getRoot_Executors();

		/**
		 * The meta object literal for the '<em><b>Executables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__EXECUTABLES = eINSTANCE.getRoot_Executables();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TASKS = eINSTANCE.getRoot_Tasks();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.ExecutorImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR__NAME = eINSTANCE.getExecutor_Name();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__EXTERNAL_REFERENCE = eINSTANCE.getExecutor_ExternalReference();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.ExecutableImpl <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.ExecutableImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE__NAME = eINSTANCE.getExecutable_Name();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE__EXTERNAL_REFERENCE = eINSTANCE.getExecutable_ExternalReference();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.TimeImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.TaskImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__START_TIME = eINSTANCE.getTask_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__END_TIME = eINSTANCE.getTask_EndTime();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__EXECUTABLE = eINSTANCE.getTask_Executable();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__EXECUTOR = eINSTANCE.getTask_Executor();

		/**
		 * The meta object literal for the '<em><b>Next In Start Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__NEXT_IN_START_TIME = eINSTANCE.getTask_NextInStartTime();

		/**
		 * The meta object literal for the '<em><b>Previous In Start Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREVIOUS_IN_START_TIME = eINSTANCE.getTask_PreviousInStartTime();

		/**
		 * The meta object literal for the '<em><b>Next In End Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__NEXT_IN_END_TIME = eINSTANCE.getTask_NextInEndTime();

		/**
		 * The meta object literal for the '<em><b>Previous In End Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREVIOUS_IN_END_TIME = eINSTANCE.getTask_PreviousInEndTime();

		/**
		 * The meta object literal for the '<em><b>Next In Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__NEXT_IN_EXECUTOR = eINSTANCE.getTask_NextInExecutor();

		/**
		 * The meta object literal for the '<em><b>Previous In Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREVIOUS_IN_EXECUTOR = eINSTANCE.getTask_PreviousInExecutor();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.ExactTimeIntImpl <em>Exact Time Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.ExactTimeIntImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExactTimeInt()
		 * @generated
		 */
		EClass EXACT_TIME_INT = eINSTANCE.getExactTimeInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXACT_TIME_INT__VALUE = eINSTANCE.getExactTimeInt_Value();

		/**
		 * The meta object literal for the '{@link UMMAALSchedule.impl.ExactTimeDoubleImpl <em>Exact Time Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALSchedule.impl.ExactTimeDoubleImpl
		 * @see UMMAALSchedule.impl.UMMAALSchedulePackageImpl#getExactTimeDouble()
		 * @generated
		 */
		EClass EXACT_TIME_DOUBLE = eINSTANCE.getExactTimeDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXACT_TIME_DOUBLE__VALUE = eINSTANCE.getExactTimeDouble_Value();

	}

} //UMMAALSchedulePackage
