/**
 */
package UMMAALScheduleSimple;

import UMMAALSchedule.UMMAALSchedulePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see UMMAALScheduleSimple.UMMAALScheduleSimpleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ummaalschedule='http://nl.utwente.ewi.fmt/ummaalschedule#/'"
 * @generated
 */
public interface UMMAALScheduleSimplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UMMAALScheduleSimple";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fmt.ewi.utwente.nl/ummaalschedulesimple";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ummaalschedulesimple";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMMAALScheduleSimplePackage eINSTANCE = UMMAALScheduleSimple.impl.UMMAALScheduleSimplePackageImpl.init();

	/**
	 * The meta object id for the '{@link UMMAALScheduleSimple.impl.SimpleExecutorImpl <em>Simple Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALScheduleSimple.impl.SimpleExecutorImpl
	 * @see UMMAALScheduleSimple.impl.UMMAALScheduleSimplePackageImpl#getSimpleExecutor()
	 * @generated
	 */
	int SIMPLE_EXECUTOR = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTOR__UUID = UMMAALSchedulePackage.EXECUTOR__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTOR__NAME = UMMAALSchedulePackage.EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTOR__EXTERNAL_REFERENCE = UMMAALSchedulePackage.EXECUTOR__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Simple Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTOR_FEATURE_COUNT = UMMAALSchedulePackage.EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UMMAALScheduleSimple.impl.SimpleExecutableImpl <em>Simple Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UMMAALScheduleSimple.impl.SimpleExecutableImpl
	 * @see UMMAALScheduleSimple.impl.UMMAALScheduleSimplePackageImpl#getSimpleExecutable()
	 * @generated
	 */
	int SIMPLE_EXECUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTABLE__UUID = UMMAALSchedulePackage.EXECUTABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTABLE__NAME = UMMAALSchedulePackage.EXECUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTABLE__EXTERNAL_REFERENCE = UMMAALSchedulePackage.EXECUTABLE__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Simple Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXECUTABLE_FEATURE_COUNT = UMMAALSchedulePackage.EXECUTABLE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link UMMAALScheduleSimple.SimpleExecutor <em>Simple Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Executor</em>'.
	 * @see UMMAALScheduleSimple.SimpleExecutor
	 * @generated
	 */
	EClass getSimpleExecutor();

	/**
	 * Returns the meta object for class '{@link UMMAALScheduleSimple.SimpleExecutable <em>Simple Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Executable</em>'.
	 * @see UMMAALScheduleSimple.SimpleExecutable
	 * @generated
	 */
	EClass getSimpleExecutable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMMAALScheduleSimpleFactory getUMMAALScheduleSimpleFactory();

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
		 * The meta object literal for the '{@link UMMAALScheduleSimple.impl.SimpleExecutorImpl <em>Simple Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALScheduleSimple.impl.SimpleExecutorImpl
		 * @see UMMAALScheduleSimple.impl.UMMAALScheduleSimplePackageImpl#getSimpleExecutor()
		 * @generated
		 */
		EClass SIMPLE_EXECUTOR = eINSTANCE.getSimpleExecutor();

		/**
		 * The meta object literal for the '{@link UMMAALScheduleSimple.impl.SimpleExecutableImpl <em>Simple Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UMMAALScheduleSimple.impl.SimpleExecutableImpl
		 * @see UMMAALScheduleSimple.impl.UMMAALScheduleSimplePackageImpl#getSimpleExecutable()
		 * @generated
		 */
		EClass SIMPLE_EXECUTABLE = eINSTANCE.getSimpleExecutable();

	}

} //UMMAALScheduleSimplePackage
