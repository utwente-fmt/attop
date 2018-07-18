/**
 */
package UMMAALSchedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMMAALSchedule.Root#getExecutors <em>Executors</em>}</li>
 *   <li>{@link UMMAALSchedule.Root#getExecutables <em>Executables</em>}</li>
 *   <li>{@link UMMAALSchedule.Root#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see UMMAALSchedule.UMMAALSchedulePackage#getRoot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingletonRoot'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SingletonRoot='self.oclType().allInstances()-&gt;size() = 1'"
 * @generated
 */
public interface Root extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Executors</b></em>' containment reference list.
	 * The list contents are of type {@link UMMAALSchedule.Executor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executors</em>' containment reference list.
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getRoot_Executors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Executor> getExecutors();

	/**
	 * Returns the value of the '<em><b>Executables</b></em>' containment reference list.
	 * The list contents are of type {@link UMMAALSchedule.Executable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executables</em>' containment reference list.
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getRoot_Executables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Executable> getExecutables();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link UMMAALSchedule.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see UMMAALSchedule.UMMAALSchedulePackage#getRoot_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Root
