/**
 */
package uppaalTrace.clocks.impl;

import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import nl.utwente.ewi.fmt.uppaalSMC.impl.UppaalSMCPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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

import uppaalTrace.clocks.AbstractClockBoundary;
import uppaalTrace.clocks.ClocksFactory;
import uppaalTrace.clocks.ClocksPackage;
import uppaalTrace.clocks.CombinedClockBoundary;
import uppaalTrace.clocks.InverseClockBoundary;
import uppaalTrace.clocks.Relation;
import uppaalTrace.clocks.SingleClockBoundary;

import uppaalTrace.impl.UppaalTracePackageImpl;

import uppaalTrace.transitions.TransitionsPackage;

import uppaalTrace.transitions.impl.TransitionsPackageImpl;

import uppaalTrace.value.ValuePackage;

import uppaalTrace.value.impl.ValuePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClocksPackageImpl extends EPackageImpl implements ClocksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationEEnum = null;

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
	 * @see uppaalTrace.clocks.ClocksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClocksPackageImpl() {
		super(eNS_URI, ClocksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClocksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClocksPackage init() {
		if (isInited) return (ClocksPackage)EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI);

		// Obtain or create and register package
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClocksPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UppaalTracePackageImpl theUppaalTracePackage = (UppaalTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI) instanceof UppaalTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI) : UppaalTracePackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);
		TransitionsPackageImpl theTransitionsPackage = (TransitionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) instanceof TransitionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) : TransitionsPackage.eINSTANCE);
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
		theClocksPackage.createPackageContents();
		theUppaalTracePackage.createPackageContents();
		theValuePackage.createPackageContents();
		theTransitionsPackage.createPackageContents();
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
		theClocksPackage.initializePackageContents();
		theUppaalTracePackage.initializePackageContents();
		theValuePackage.initializePackageContents();
		theTransitionsPackage.initializePackageContents();
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
		theClocksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClocksPackage.eNS_URI, theClocksPackage);
		return theClocksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClockBoundary() {
		return abstractClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClockBoundary_Value() {
		return (EAttribute)abstractClockBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClockBoundary_Relation() {
		return (EAttribute)abstractClockBoundaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClockBoundary_Target() {
		return (EAttribute)abstractClockBoundaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleClockBoundary() {
		return singleClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseClockBoundary() {
		return inverseClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedClockBoundary() {
		return combinedClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedClockBoundary_Subtrahend() {
		return (EAttribute)combinedClockBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelation() {
		return relationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClocksFactory getClocksFactory() {
		return (ClocksFactory)getEFactoryInstance();
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
		abstractClockBoundaryEClass = createEClass(ABSTRACT_CLOCK_BOUNDARY);
		createEAttribute(abstractClockBoundaryEClass, ABSTRACT_CLOCK_BOUNDARY__VALUE);
		createEAttribute(abstractClockBoundaryEClass, ABSTRACT_CLOCK_BOUNDARY__RELATION);
		createEAttribute(abstractClockBoundaryEClass, ABSTRACT_CLOCK_BOUNDARY__TARGET);

		singleClockBoundaryEClass = createEClass(SINGLE_CLOCK_BOUNDARY);

		inverseClockBoundaryEClass = createEClass(INVERSE_CLOCK_BOUNDARY);

		combinedClockBoundaryEClass = createEClass(COMBINED_CLOCK_BOUNDARY);
		createEAttribute(combinedClockBoundaryEClass, COMBINED_CLOCK_BOUNDARY__SUBTRAHEND);

		// Create enums
		relationEEnum = createEEnum(RELATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		singleClockBoundaryEClass.getESuperTypes().add(this.getAbstractClockBoundary());
		inverseClockBoundaryEClass.getESuperTypes().add(this.getAbstractClockBoundary());
		combinedClockBoundaryEClass.getESuperTypes().add(this.getAbstractClockBoundary());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractClockBoundaryEClass, AbstractClockBoundary.class, "AbstractClockBoundary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractClockBoundary_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, AbstractClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractClockBoundary_Relation(), this.getRelation(), "relation", "LE", 1, 1, AbstractClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractClockBoundary_Target(), ecorePackage.getEString(), "target", "", 1, 1, AbstractClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleClockBoundaryEClass, SingleClockBoundary.class, "SingleClockBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverseClockBoundaryEClass, InverseClockBoundary.class, "InverseClockBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combinedClockBoundaryEClass, CombinedClockBoundary.class, "CombinedClockBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinedClockBoundary_Subtrahend(), ecorePackage.getEString(), "subtrahend", null, 1, 1, CombinedClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationEEnum, Relation.class, "Relation");
		addEEnumLiteral(relationEEnum, Relation.EQ);
		addEEnumLiteral(relationEEnum, Relation.NE);
		addEEnumLiteral(relationEEnum, Relation.LT);
		addEEnumLiteral(relationEEnum, Relation.LE);
		addEEnumLiteral(relationEEnum, Relation.GT);
		addEEnumLiteral(relationEEnum, Relation.GE);
	}

} //ClocksPackageImpl
