/**
 */
package UMMAALScheduleSimple.impl;

import UMMAALSchedule.UMMAALSchedulePackage;

import UMMAALSchedule.impl.UMMAALSchedulePackageImpl;

import UMMAALScheduleSimple.SimpleExecutable;
import UMMAALScheduleSimple.SimpleExecutor;
import UMMAALScheduleSimple.UMMAALScheduleSimpleFactory;
import UMMAALScheduleSimple.UMMAALScheduleSimplePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMMAALScheduleSimplePackageImpl extends EPackageImpl implements UMMAALScheduleSimplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleExecutableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UMMAALScheduleSimple.UMMAALScheduleSimplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMMAALScheduleSimplePackageImpl() {
		super(eNS_URI, UMMAALScheduleSimpleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UMMAALScheduleSimplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMMAALScheduleSimplePackage init() {
		if (isInited) return (UMMAALScheduleSimplePackage)EPackage.Registry.INSTANCE.getEPackage(UMMAALScheduleSimplePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUMMAALScheduleSimplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UMMAALScheduleSimplePackageImpl theUMMAALScheduleSimplePackage = registeredUMMAALScheduleSimplePackage instanceof UMMAALScheduleSimplePackageImpl ? (UMMAALScheduleSimplePackageImpl)registeredUMMAALScheduleSimplePackage : new UMMAALScheduleSimplePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UMMAALSchedulePackage.eNS_URI);
		UMMAALSchedulePackageImpl theUMMAALSchedulePackage = (UMMAALSchedulePackageImpl)(registeredPackage instanceof UMMAALSchedulePackageImpl ? registeredPackage : UMMAALSchedulePackage.eINSTANCE);

		// Create package meta-data objects
		theUMMAALScheduleSimplePackage.createPackageContents();
		theUMMAALSchedulePackage.createPackageContents();

		// Initialize created meta-data
		theUMMAALScheduleSimplePackage.initializePackageContents();
		theUMMAALSchedulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUMMAALScheduleSimplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMMAALScheduleSimplePackage.eNS_URI, theUMMAALScheduleSimplePackage);
		return theUMMAALScheduleSimplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleExecutor() {
		return simpleExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleExecutable() {
		return simpleExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMMAALScheduleSimpleFactory getUMMAALScheduleSimpleFactory() {
		return (UMMAALScheduleSimpleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simpleExecutorEClass = createEClass(SIMPLE_EXECUTOR);

		simpleExecutableEClass = createEClass(SIMPLE_EXECUTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMMAALSchedulePackage theUMMAALSchedulePackage = (UMMAALSchedulePackage)EPackage.Registry.INSTANCE.getEPackage(UMMAALSchedulePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleExecutorEClass.getESuperTypes().add(theUMMAALSchedulePackage.getExecutor());
		simpleExecutableEClass.getESuperTypes().add(theUMMAALSchedulePackage.getExecutable());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleExecutorEClass, SimpleExecutor.class, "SimpleExecutor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleExecutableEClass, SimpleExecutable.class, "SimpleExecutable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ummaalschedule", "http://nl.utwente.ewi.fmt/ummaalschedule#/"
		   });
	}

} //UMMAALScheduleSimplePackageImpl
