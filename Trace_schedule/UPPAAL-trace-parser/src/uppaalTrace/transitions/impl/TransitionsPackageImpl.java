/**
 */
package uppaalTrace.transitions.impl;

import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.uppaal.UppaalPackage;

import org.muml.uppaal.core.CorePackage;

import org.muml.uppaal.core.impl.CorePackageImpl;

import org.muml.uppaal.declarations.DeclarationsPackage;

import org.muml.uppaal.declarations.global.GlobalPackage;

import org.muml.uppaal.declarations.global.impl.GlobalPackageImpl;

import org.muml.uppaal.declarations.impl.DeclarationsPackageImpl;

import org.muml.uppaal.declarations.system.SystemPackage;

import org.muml.uppaal.declarations.system.impl.SystemPackageImpl;

import org.muml.uppaal.expressions.ExpressionsPackage;

import org.muml.uppaal.expressions.impl.ExpressionsPackageImpl;

import org.muml.uppaal.impl.UppaalPackageImpl;

import org.muml.uppaal.statements.StatementsPackage;

import org.muml.uppaal.statements.impl.StatementsPackageImpl;

import org.muml.uppaal.templates.TemplatesPackage;

import org.muml.uppaal.templates.impl.TemplatesPackageImpl;

import org.muml.uppaal.types.TypesPackage;

import org.muml.uppaal.types.impl.TypesPackageImpl;

import org.muml.uppaal.visuals.VisualsPackage;

import org.muml.uppaal.visuals.impl.VisualsPackageImpl;

import uppaalTrace.UppaalTracePackage;

import uppaalTrace.clocks.ClocksPackage;

import uppaalTrace.clocks.impl.ClocksPackageImpl;

import uppaalTrace.impl.UppaalTracePackageImpl;

import uppaalTrace.transitions.AbstractTransition;
import uppaalTrace.transitions.DelayTransition;
import uppaalTrace.transitions.EdgeTransition;
import uppaalTrace.transitions.TransitionsFactory;
import uppaalTrace.transitions.TransitionsPackage;

import uppaalTrace.value.ValuePackage;

import uppaalTrace.value.impl.ValuePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionsPackageImpl extends EPackageImpl implements TransitionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeTransitionEClass = null;

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
	 * @see uppaalTrace.transitions.TransitionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransitionsPackageImpl() {
		super(eNS_URI, TransitionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransitionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransitionsPackage init() {
		if (isInited) return (TransitionsPackage)EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI);

		// Obtain or create and register package
		TransitionsPackageImpl theTransitionsPackage = (TransitionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransitionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransitionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UppaalTracePackageImpl theUppaalTracePackage = (UppaalTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI) instanceof UppaalTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI) : UppaalTracePackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) : ClocksPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		GlobalPackageImpl theGlobalPackage = (GlobalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI) instanceof GlobalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI) : GlobalPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		UppaalSMCPackageImpl theUppaalSMCPackage = (UppaalSMCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalSMCPackage.eNS_URI) instanceof UppaalSMCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalSMCPackage.eNS_URI) : UppaalSMCPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		VisualsPackageImpl theVisualsPackage = (VisualsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) instanceof VisualsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) : VisualsPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		UppaalPackageImpl theUppaalPackage = (UppaalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI) instanceof UppaalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalPackage.eNS_URI) : UppaalPackage.eINSTANCE);
		CorePackageImpl theCorePackage_1 = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage_1 = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage_1 = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		GlobalPackageImpl theGlobalPackage_1 = (GlobalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI) instanceof GlobalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GlobalPackage.eNS_URI) : GlobalPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage_1 = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage_1 = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage_1 = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage_1 = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		VisualsPackageImpl theVisualsPackage_1 = (VisualsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) instanceof VisualsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualsPackage.eNS_URI) : VisualsPackage.eINSTANCE);

		// Create package meta-data objects
		theTransitionsPackage.createPackageContents();
		theUppaalTracePackage.createPackageContents();
		theValuePackage.createPackageContents();
		theClocksPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		theGlobalPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theUppaalSMCPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theVisualsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theUppaalPackage.createPackageContents();
		theCorePackage_1.createPackageContents();
		theTypesPackage_1.createPackageContents();
		theDeclarationsPackage_1.createPackageContents();
		theGlobalPackage_1.createPackageContents();
		theSystemPackage_1.createPackageContents();
		theTemplatesPackage_1.createPackageContents();
		theStatementsPackage_1.createPackageContents();
		theExpressionsPackage_1.createPackageContents();
		theVisualsPackage_1.createPackageContents();

		// Initialize created meta-data
		theTransitionsPackage.initializePackageContents();
		theUppaalTracePackage.initializePackageContents();
		theValuePackage.initializePackageContents();
		theClocksPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		theGlobalPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theUppaalSMCPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theVisualsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theUppaalPackage.initializePackageContents();
		theCorePackage_1.initializePackageContents();
		theTypesPackage_1.initializePackageContents();
		theDeclarationsPackage_1.initializePackageContents();
		theGlobalPackage_1.initializePackageContents();
		theSystemPackage_1.initializePackageContents();
		theTemplatesPackage_1.initializePackageContents();
		theStatementsPackage_1.initializePackageContents();
		theExpressionsPackage_1.initializePackageContents();
		theVisualsPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransitionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransitionsPackage.eNS_URI, theTransitionsPackage);
		return theTransitionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransition() {
		return abstractTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTransition_Source() {
		return (EReference)abstractTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTransition_Target() {
		return (EReference)abstractTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayTransition() {
		return delayTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayTransition_Delay() {
		return (EAttribute)delayTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeTransition() {
		return edgeTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeTransition_Edges() {
		return (EReference)edgeTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionsFactory getTransitionsFactory() {
		return (TransitionsFactory)getEFactoryInstance();
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
		abstractTransitionEClass = createEClass(ABSTRACT_TRANSITION);
		createEReference(abstractTransitionEClass, ABSTRACT_TRANSITION__SOURCE);
		createEReference(abstractTransitionEClass, ABSTRACT_TRANSITION__TARGET);

		delayTransitionEClass = createEClass(DELAY_TRANSITION);
		createEAttribute(delayTransitionEClass, DELAY_TRANSITION__DELAY);

		edgeTransitionEClass = createEClass(EDGE_TRANSITION);
		createEReference(edgeTransitionEClass, EDGE_TRANSITION__EDGES);
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
		UppaalTracePackage theUppaalTracePackage = (UppaalTracePackage)EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI);
		TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		delayTransitionEClass.getESuperTypes().add(this.getAbstractTransition());
		edgeTransitionEClass.getESuperTypes().add(this.getAbstractTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTransitionEClass, AbstractTransition.class, "AbstractTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTransition_Source(), theUppaalTracePackage.getState(), theUppaalTracePackage.getState_TransitionTo(), "source", null, 1, 1, AbstractTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTransition_Target(), theUppaalTracePackage.getState(), theUppaalTracePackage.getState_TransitionFrom(), "target", null, 1, 1, AbstractTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayTransitionEClass, DelayTransition.class, "DelayTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayTransition_Delay(), ecorePackage.getEFloat(), "delay", null, 1, 1, DelayTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeTransitionEClass, EdgeTransition.class, "EdgeTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeTransition_Edges(), theTemplatesPackage.getEdge(), null, "edges", null, 0, -1, EdgeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TransitionsPackageImpl
