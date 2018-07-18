/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.Purpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.RealSequenceType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.RealSequenceValue;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.RealType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.Type;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesFactory;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UATMM_valuesPackageImpl extends EPackageImpl implements UATMM_valuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTypeEClass = null;

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
	private EClass realValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaObjectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realSequenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum costTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum probabilityTypeEEnum = null;

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
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UATMM_valuesPackageImpl() {
		super(eNS_URI, UATMM_valuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UATMM_valuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UATMM_valuesPackage init() {
		if (isInited) return (UATMM_valuesPackage)EPackage.Registry.INSTANCE.getEPackage(UATMM_valuesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUATMM_valuesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UATMM_valuesPackageImpl theUATMM_valuesPackage = registeredUATMM_valuesPackage instanceof UATMM_valuesPackageImpl ? (UATMM_valuesPackageImpl)registeredUATMM_valuesPackage : new UATMM_valuesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UATMM_structurePackage.eNS_URI);
		UATMM_structurePackageImpl theUATMM_structurePackage = (UATMM_structurePackageImpl)(registeredPackage instanceof UATMM_structurePackageImpl ? registeredPackage : UATMM_structurePackage.eINSTANCE);

		// Create package meta-data objects
		theUATMM_valuesPackage.createPackageContents();
		theUATMM_structurePackage.createPackageContents();

		// Initialize created meta-data
		theUATMM_valuesPackage.initializePackageContents();
		theUATMM_structurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUATMM_valuesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UATMM_valuesPackage.eNS_URI, theUATMM_valuesPackage);
		return theUATMM_valuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Value() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Node() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Purpose() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Attributes() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ValueType() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostPurpose() {
		return costPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostPurpose_CostType() {
		return (EAttribute)costPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePurpose() {
		return timePurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePurpose_TimeType() {
		return (EAttribute)timePurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurpose() {
		return purposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaType() {
		return javaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaType_ValueClass() {
		return (EAttribute)javaTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getRealValue() {
		return realValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealValue_Value() {
		return (EAttribute)realValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaObjectValue() {
		return javaObjectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaObjectValue_Value() {
		return (EAttribute)javaObjectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilityPurpose() {
		return probabilityPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbabilityPurpose_ProbType() {
		return (EAttribute)probabilityPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealSequenceType() {
		return realSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealSequenceValue() {
		return realSequenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealSequenceValue_Sequence() {
		return (EAttribute)realSequenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCostType() {
		return costTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeType() {
		return timeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProbabilityType() {
		return probabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_valuesFactory getUATMM_valuesFactory() {
		return (UATMM_valuesFactory)getEFactoryInstance();
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
		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__VALUE);
		createEReference(attributeEClass, ATTRIBUTE__NODE);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEReference(domainEClass, DOMAIN__PURPOSE);
		createEReference(domainEClass, DOMAIN__ATTRIBUTES);
		createEReference(domainEClass, DOMAIN__VALUE_TYPE);

		costPurposeEClass = createEClass(COST_PURPOSE);
		createEAttribute(costPurposeEClass, COST_PURPOSE__COST_TYPE);

		timePurposeEClass = createEClass(TIME_PURPOSE);
		createEAttribute(timePurposeEClass, TIME_PURPOSE__TIME_TYPE);

		purposeEClass = createEClass(PURPOSE);

		typeEClass = createEClass(TYPE);

		realTypeEClass = createEClass(REAL_TYPE);

		javaTypeEClass = createEClass(JAVA_TYPE);
		createEAttribute(javaTypeEClass, JAVA_TYPE__VALUE_CLASS);

		valueEClass = createEClass(VALUE);

		realValueEClass = createEClass(REAL_VALUE);
		createEAttribute(realValueEClass, REAL_VALUE__VALUE);

		javaObjectValueEClass = createEClass(JAVA_OBJECT_VALUE);
		createEAttribute(javaObjectValueEClass, JAVA_OBJECT_VALUE__VALUE);

		probabilityPurposeEClass = createEClass(PROBABILITY_PURPOSE);
		createEAttribute(probabilityPurposeEClass, PROBABILITY_PURPOSE__PROB_TYPE);

		realSequenceTypeEClass = createEClass(REAL_SEQUENCE_TYPE);

		realSequenceValueEClass = createEClass(REAL_SEQUENCE_VALUE);
		createEAttribute(realSequenceValueEClass, REAL_SEQUENCE_VALUE__SEQUENCE);

		// Create enums
		costTypeEEnum = createEEnum(COST_TYPE);
		timeTypeEEnum = createEEnum(TIME_TYPE);
		probabilityTypeEEnum = createEEnum(PROBABILITY_TYPE);
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
		UATMM_structurePackage theUATMM_structurePackage = (UATMM_structurePackage)EPackage.Registry.INSTANCE.getEPackage(UATMM_structurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		costPurposeEClass.getESuperTypes().add(this.getPurpose());
		timePurposeEClass.getESuperTypes().add(this.getPurpose());
		realTypeEClass.getESuperTypes().add(this.getType());
		javaTypeEClass.getESuperTypes().add(this.getType());
		realValueEClass.getESuperTypes().add(this.getValue());
		javaObjectValueEClass.getESuperTypes().add(this.getValue());
		probabilityPurposeEClass.getESuperTypes().add(this.getPurpose());
		realSequenceTypeEClass.getESuperTypes().add(this.getType());
		realSequenceValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Value(), this.getValue(), null, "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Node(), theUATMM_structurePackage.getNode(), null, "node", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Purpose(), this.getPurpose(), null, "purpose", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDomain_ValueType(), this.getType(), null, "valueType", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(costPurposeEClass, CostPurpose.class, "CostPurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCostPurpose_CostType(), this.getCostType(), "costType", null, 1, 1, CostPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePurposeEClass, TimePurpose.class, "TimePurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePurpose_TimeType(), this.getTimeType(), "timeType", null, 1, 1, TimePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(purposeEClass, Purpose.class, "Purpose", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaTypeEClass, JavaType.class, "JavaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getJavaType_ValueClass(), g1, "valueClass", null, 1, 1, JavaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realValueEClass, RealValue.class, "RealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, RealValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaObjectValueEClass, JavaObjectValue.class, "JavaObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaObjectValue_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, JavaObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilityPurposeEClass, ProbabilityPurpose.class, "ProbabilityPurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilityPurpose_ProbType(), this.getProbabilityType(), "probType", null, 1, 1, ProbabilityPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realSequenceTypeEClass, RealSequenceType.class, "RealSequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realSequenceValueEClass, RealSequenceValue.class, "RealSequenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealSequenceValue_Sequence(), ecorePackage.getEDouble(), "sequence", null, 1, -1, RealSequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(costTypeEEnum, CostType.class, "CostType");
		addEEnumLiteral(costTypeEEnum, CostType.ON_ACTIVATION);
		addEEnumLiteral(costTypeEEnum, CostType.ON_COMPLETION);
		addEEnumLiteral(costTypeEEnum, CostType.ON_ABORT);
		addEEnumLiteral(costTypeEEnum, CostType.WHILE_ACTIVE);
		addEEnumLiteral(costTypeEEnum, CostType.WHILE_COMPLETED);

		initEEnum(timeTypeEEnum, TimeType.class, "TimeType");
		addEEnumLiteral(timeTypeEEnum, TimeType.MINIMUM);
		addEEnumLiteral(timeTypeEEnum, TimeType.MAXIMUM);
		addEEnumLiteral(timeTypeEEnum, TimeType.EXPONENTIAL);
		addEEnumLiteral(timeTypeEEnum, TimeType.HYPO_EXPONENTIAL);

		initEEnum(probabilityTypeEEnum, ProbabilityType.class, "ProbabilityType");
		addEEnumLiteral(probabilityTypeEEnum, ProbabilityType.COMPLETION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Documentation
		createDocumentationAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "Documentation";
		addAnnotation
		  (probabilityTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Probability of emitting a completion signal after the time (if any is specified) has elapsed. If no completion signal is sent, an abort signal is emitted."
		   });
	}

} //UATMM_valuesPackageImpl
