/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UATMM_valuesFactoryImpl extends EFactoryImpl implements UATMM_valuesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UATMM_valuesFactory init() {
		try {
			UATMM_valuesFactory theUATMM_valuesFactory = (UATMM_valuesFactory)EPackage.Registry.INSTANCE.getEFactory(UATMM_valuesPackage.eNS_URI);
			if (theUATMM_valuesFactory != null) {
				return theUATMM_valuesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UATMM_valuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_valuesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UATMM_valuesPackage.ATTRIBUTE: return createAttribute();
			case UATMM_valuesPackage.DOMAIN: return createDomain();
			case UATMM_valuesPackage.COST_PURPOSE: return createCostPurpose();
			case UATMM_valuesPackage.TIME_PURPOSE: return createTimePurpose();
			case UATMM_valuesPackage.REAL_TYPE: return createRealType();
			case UATMM_valuesPackage.JAVA_TYPE: return createJavaType();
			case UATMM_valuesPackage.REAL_VALUE: return createRealValue();
			case UATMM_valuesPackage.JAVA_OBJECT_VALUE: return createJavaObjectValue();
			case UATMM_valuesPackage.PROBABILITY_PURPOSE: return createProbabilityPurpose();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UATMM_valuesPackage.COST_TYPE:
				return createCostTypeFromString(eDataType, initialValue);
			case UATMM_valuesPackage.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case UATMM_valuesPackage.PROBABILITY_TYPE:
				return createProbabilityTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UATMM_valuesPackage.COST_TYPE:
				return convertCostTypeToString(eDataType, instanceValue);
			case UATMM_valuesPackage.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case UATMM_valuesPackage.PROBABILITY_TYPE:
				return convertProbabilityTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPurpose createCostPurpose() {
		CostPurposeImpl costPurpose = new CostPurposeImpl();
		return costPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePurpose createTimePurpose() {
		TimePurposeImpl timePurpose = new TimePurposeImpl();
		return timePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaType createJavaType() {
		JavaTypeImpl javaType = new JavaTypeImpl();
		return javaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValue createRealValue() {
		RealValueImpl realValue = new RealValueImpl();
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaObjectValue createJavaObjectValue() {
		JavaObjectValueImpl javaObjectValue = new JavaObjectValueImpl();
		return javaObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityPurpose createProbabilityPurpose() {
		ProbabilityPurposeImpl probabilityPurpose = new ProbabilityPurposeImpl();
		return probabilityPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType createCostTypeFromString(EDataType eDataType, String initialValue) {
		CostType result = CostType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCostTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeTypeFromString(EDataType eDataType, String initialValue) {
		TimeType result = TimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityType createProbabilityTypeFromString(EDataType eDataType, String initialValue) {
		ProbabilityType result = ProbabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_valuesPackage getUATMM_valuesPackage() {
		return (UATMM_valuesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UATMM_valuesPackage getPackage() {
		return UATMM_valuesPackage.eINSTANCE;
	}

} //UATMM_valuesFactoryImpl
