/**
 */
package uppaalTrace.value.impl;

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

import uppaalTrace.transitions.TransitionsPackage;

import uppaalTrace.transitions.impl.TransitionsPackageImpl;

import uppaalTrace.value.ArrayValue;
import uppaalTrace.value.BoolValue;
import uppaalTrace.value.BuiltInTypeValue;
import uppaalTrace.value.ChanValue;
import uppaalTrace.value.ClockValue;
import uppaalTrace.value.DataVariableDeclarationValuation;
import uppaalTrace.value.IntValue;
import uppaalTrace.value.RangeSpecificationValue;
import uppaalTrace.value.ScalarSpecificationValue;
import uppaalTrace.value.StructSpecificationValue;
import uppaalTrace.value.TypeSpecificationValue;
import uppaalTrace.value.Value;
import uppaalTrace.value.ValueFactory;
import uppaalTrace.value.ValuePackage;
import uppaalTrace.value.VoidValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuePackageImpl extends EPackageImpl implements ValuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInTypeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVariableDeclarationValuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

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
	 * @see uppaalTrace.value.ValuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuePackageImpl() {
		super(eNS_URI, ValueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuePackage init() {
		if (isInited) return (ValuePackage)EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);

		// Obtain or create and register package
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UppaalTracePackageImpl theUppaalTracePackage = (UppaalTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI) instanceof UppaalTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI) : UppaalTracePackage.eINSTANCE);
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) : ClocksPackage.eINSTANCE);
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
		theValuePackage.createPackageContents();
		theUppaalTracePackage.createPackageContents();
		theClocksPackage.createPackageContents();
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
		theValuePackage.initializePackageContents();
		theUppaalTracePackage.initializePackageContents();
		theClocksPackage.initializePackageContents();
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
		theValuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuePackage.eNS_URI, theValuePackage);
		return theValuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInTypeValue() {
		return builtInTypeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChanValue() {
		return chanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolValue() {
		return boolValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolValue_Value() {
		return (EAttribute)boolValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntValue() {
		return intValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntValue_Value() {
		return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockValue() {
		return clockValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockValue_Value() {
		return (EAttribute)clockValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidValue() {
		return voidValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSpecificationValue() {
		return typeSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarSpecificationValue() {
		return scalarSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalarSpecificationValue_Value() {
		return (EReference)scalarSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructSpecificationValue() {
		return structSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructSpecificationValue_Value() {
		return (EReference)structSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeSpecificationValue() {
		return rangeSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeSpecificationValue_Value() {
		return (EReference)rangeSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataVariableDeclarationValuation() {
		return dataVariableDeclarationValuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataVariableDeclarationValuation_DataVariableDeclaration() {
		return (EReference)dataVariableDeclarationValuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataVariableDeclarationValuation_Valuation() {
		return (EReference)dataVariableDeclarationValuationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Value() {
		return (EReference)arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFactory getValueFactory() {
		return (ValueFactory)getEFactoryInstance();
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
		valueEClass = createEClass(VALUE);

		builtInTypeValueEClass = createEClass(BUILT_IN_TYPE_VALUE);

		chanValueEClass = createEClass(CHAN_VALUE);

		boolValueEClass = createEClass(BOOL_VALUE);
		createEAttribute(boolValueEClass, BOOL_VALUE__VALUE);

		intValueEClass = createEClass(INT_VALUE);
		createEAttribute(intValueEClass, INT_VALUE__VALUE);

		clockValueEClass = createEClass(CLOCK_VALUE);
		createEAttribute(clockValueEClass, CLOCK_VALUE__VALUE);

		voidValueEClass = createEClass(VOID_VALUE);

		typeSpecificationValueEClass = createEClass(TYPE_SPECIFICATION_VALUE);

		scalarSpecificationValueEClass = createEClass(SCALAR_SPECIFICATION_VALUE);
		createEReference(scalarSpecificationValueEClass, SCALAR_SPECIFICATION_VALUE__VALUE);

		structSpecificationValueEClass = createEClass(STRUCT_SPECIFICATION_VALUE);
		createEReference(structSpecificationValueEClass, STRUCT_SPECIFICATION_VALUE__VALUE);

		rangeSpecificationValueEClass = createEClass(RANGE_SPECIFICATION_VALUE);
		createEReference(rangeSpecificationValueEClass, RANGE_SPECIFICATION_VALUE__VALUE);

		dataVariableDeclarationValuationEClass = createEClass(DATA_VARIABLE_DECLARATION_VALUATION);
		createEReference(dataVariableDeclarationValuationEClass, DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION);
		createEReference(dataVariableDeclarationValuationEClass, DATA_VARIABLE_DECLARATION_VALUATION__VALUATION);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__VALUE);
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
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		UppaalTracePackage theUppaalTracePackage = (UppaalTracePackage)EPackage.Registry.INSTANCE.getEPackage(UppaalTracePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		builtInTypeValueEClass.getESuperTypes().add(this.getValue());
		chanValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		boolValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		intValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		clockValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		voidValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		typeSpecificationValueEClass.getESuperTypes().add(this.getValue());
		scalarSpecificationValueEClass.getESuperTypes().add(this.getTypeSpecificationValue());
		structSpecificationValueEClass.getESuperTypes().add(this.getTypeSpecificationValue());
		rangeSpecificationValueEClass.getESuperTypes().add(this.getTypeSpecificationValue());
		arrayValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes and features; add operations and parameters
		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInTypeValueEClass, BuiltInTypeValue.class, "BuiltInTypeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chanValueEClass, ChanValue.class, "ChanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolValueEClass, BoolValue.class, "BoolValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockValueEClass, ClockValue.class, "ClockValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockValue_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, ClockValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidValueEClass, VoidValue.class, "VoidValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeSpecificationValueEClass, TypeSpecificationValue.class, "TypeSpecificationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalarSpecificationValueEClass, ScalarSpecificationValue.class, "ScalarSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalarSpecificationValue_Value(), this.getIntValue(), null, "value", null, 1, 1, ScalarSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structSpecificationValueEClass, StructSpecificationValue.class, "StructSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructSpecificationValue_Value(), this.getDataVariableDeclarationValuation(), null, "value", null, 0, -1, StructSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeSpecificationValueEClass, RangeSpecificationValue.class, "RangeSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeSpecificationValue_Value(), this.getIntValue(), null, "value", null, 0, 1, RangeSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVariableDeclarationValuationEClass, DataVariableDeclarationValuation.class, "DataVariableDeclarationValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataVariableDeclarationValuation_DataVariableDeclaration(), theDeclarationsPackage.getDataVariableDeclaration(), null, "dataVariableDeclaration", null, 0, 1, DataVariableDeclarationValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataVariableDeclarationValuation_Valuation(), theUppaalTracePackage.getValuation(), null, "valuation", null, 0, -1, DataVariableDeclarationValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Value(), this.getValue(), null, "value", null, 0, -1, ArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ValuePackageImpl
