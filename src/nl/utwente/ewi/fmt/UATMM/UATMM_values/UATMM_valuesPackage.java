/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesFactory
 * @model kind="package"
 * @generated
 */
public interface UATMM_valuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UATMM_values";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore:UATMM_values";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nl.utwente.ewi.fmt.UATMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UATMM_valuesPackage eINSTANCE = nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.AttributeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NODE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.DomainImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.PurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.PurposeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getPurpose()
	 * @generated
	 */
	int PURPOSE = 4;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.CostPurposeImpl <em>Cost Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.CostPurposeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getCostPurpose()
	 * @generated
	 */
	int COST_PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PURPOSE__COST_TYPE = PURPOSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cost Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PURPOSE_FEATURE_COUNT = PURPOSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cost Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PURPOSE_OPERATION_COUNT = PURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TimePurposeImpl <em>Time Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TimePurposeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getTimePurpose()
	 * @generated
	 */
	int TIME_PURPOSE = 3;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PURPOSE__TIME_TYPE = PURPOSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PURPOSE_FEATURE_COUNT = PURPOSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PURPOSE_OPERATION_COUNT = PURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TypeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealTypeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaTypeImpl <em>Java Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaTypeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getJavaType()
	 * @generated
	 */
	int JAVA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE__VALUE_CLASS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ValueImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealValueImpl <em>Real Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealValueImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getRealValue()
	 * @generated
	 */
	int REAL_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaObjectValueImpl <em>Java Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaObjectValueImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getJavaObjectValue()
	 * @generated
	 */
	int JAVA_OBJECT_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJECT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJECT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJECT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ProbabilityPurposeImpl <em>Probability Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ProbabilityPurposeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getProbabilityPurpose()
	 * @generated
	 */
	int PROBABILITY_PURPOSE = 11;

	/**
	 * The feature id for the '<em><b>Prob Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_PURPOSE__PROB_TYPE = PURPOSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probability Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_PURPOSE_FEATURE_COUNT = PURPOSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Probability Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_PURPOSE_OPERATION_COUNT = PURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType <em>Cost Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getCostType()
	 * @generated
	 */
	int COST_TYPE = 12;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType <em>Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 13;


	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType <em>Probability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getProbabilityType()
	 * @generated
	 */
	int PROBABILITY_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute#getNode()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Node();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purpose</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getPurpose()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getAttributes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Attributes();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain#getValueType()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ValueType();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose <em>Cost Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Purpose</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose
	 * @generated
	 */
	EClass getCostPurpose();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose#getCostType()
	 * @see #getCostPurpose()
	 * @generated
	 */
	EAttribute getCostPurpose_CostType();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose <em>Time Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Purpose</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose
	 * @generated
	 */
	EClass getTimePurpose();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose#getTimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose#getTimeType()
	 * @see #getTimePurpose()
	 * @generated
	 */
	EAttribute getTimePurpose_TimeType();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Purpose
	 * @generated
	 */
	EClass getPurpose();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType
	 * @generated
	 */
	EClass getJavaType();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType#getValueClass <em>Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Class</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType#getValueClass()
	 * @see #getJavaType()
	 * @generated
	 */
	EAttribute getJavaType_ValueClass();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue
	 * @generated
	 */
	EClass getRealValue();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue#getValue()
	 * @see #getRealValue()
	 * @generated
	 */
	EAttribute getRealValue_Value();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue <em>Java Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Object Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue
	 * @generated
	 */
	EClass getJavaObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue#getValue()
	 * @see #getJavaObjectValue()
	 * @generated
	 */
	EAttribute getJavaObjectValue_Value();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose <em>Probability Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Purpose</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose
	 * @generated
	 */
	EClass getProbabilityPurpose();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose#getProbType <em>Prob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose#getProbType()
	 * @see #getProbabilityPurpose()
	 * @generated
	 */
	EAttribute getProbabilityPurpose_ProbType();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cost Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType
	 * @generated
	 */
	EEnum getCostType();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType
	 * @generated
	 */
	EEnum getTimeType();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType <em>Probability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Probability Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType
	 * @generated
	 */
	EEnum getProbabilityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UATMM_valuesFactory getUATMM_valuesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.AttributeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__NODE = eINSTANCE.getAttribute_Node();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.DomainImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PURPOSE = eINSTANCE.getDomain_Purpose();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ATTRIBUTES = eINSTANCE.getDomain_Attributes();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__VALUE_TYPE = eINSTANCE.getDomain_ValueType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.CostPurposeImpl <em>Cost Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.CostPurposeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getCostPurpose()
		 * @generated
		 */
		EClass COST_PURPOSE = eINSTANCE.getCostPurpose();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PURPOSE__COST_TYPE = eINSTANCE.getCostPurpose_CostType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TimePurposeImpl <em>Time Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TimePurposeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getTimePurpose()
		 * @generated
		 */
		EClass TIME_PURPOSE = eINSTANCE.getTimePurpose();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PURPOSE__TIME_TYPE = eINSTANCE.getTimePurpose_TimeType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.PurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.PurposeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getPurpose()
		 * @generated
		 */
		EClass PURPOSE = eINSTANCE.getPurpose();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.TypeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealTypeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaTypeImpl <em>Java Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaTypeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getJavaType()
		 * @generated
		 */
		EClass JAVA_TYPE = eINSTANCE.getJavaType();

		/**
		 * The meta object literal for the '<em><b>Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TYPE__VALUE_CLASS = eINSTANCE.getJavaType_ValueClass();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ValueImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealValueImpl <em>Real Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.RealValueImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getRealValue()
		 * @generated
		 */
		EClass REAL_VALUE = eINSTANCE.getRealValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_VALUE__VALUE = eINSTANCE.getRealValue_Value();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaObjectValueImpl <em>Java Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.JavaObjectValueImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getJavaObjectValue()
		 * @generated
		 */
		EClass JAVA_OBJECT_VALUE = eINSTANCE.getJavaObjectValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_OBJECT_VALUE__VALUE = eINSTANCE.getJavaObjectValue_Value();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ProbabilityPurposeImpl <em>Probability Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.ProbabilityPurposeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getProbabilityPurpose()
		 * @generated
		 */
		EClass PROBABILITY_PURPOSE = eINSTANCE.getProbabilityPurpose();

		/**
		 * The meta object literal for the '<em><b>Prob Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILITY_PURPOSE__PROB_TYPE = eINSTANCE.getProbabilityPurpose_ProbType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType <em>Cost Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostType
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getCostType()
		 * @generated
		 */
		EEnum COST_TYPE = eINSTANCE.getCostType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType <em>Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimeType
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getTimeType()
		 * @generated
		 */
		EEnum TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType <em>Probability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityType
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesPackageImpl#getProbabilityType()
		 * @generated
		 */
		EEnum PROBABILITY_TYPE = eINSTANCE.getProbabilityType();

	}

} //UATMM_valuesPackage
