/**
 */
package uppaalTrace.value.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uppaalTrace.value.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueFactoryImpl extends EFactoryImpl implements ValueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueFactory init() {
		try {
			ValueFactory theValueFactory = (ValueFactory)EPackage.Registry.INSTANCE.getEFactory(ValuePackage.eNS_URI);
			if (theValueFactory != null) {
				return theValueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFactoryImpl() {
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
			case ValuePackage.CHAN_VALUE: return createChanValue();
			case ValuePackage.BOOL_VALUE: return createBoolValue();
			case ValuePackage.INT_VALUE: return createIntValue();
			case ValuePackage.CLOCK_VALUE: return createClockValue();
			case ValuePackage.VOID_VALUE: return createVoidValue();
			case ValuePackage.SCALAR_SPECIFICATION_VALUE: return createScalarSpecificationValue();
			case ValuePackage.STRUCT_SPECIFICATION_VALUE: return createStructSpecificationValue();
			case ValuePackage.RANGE_SPECIFICATION_VALUE: return createRangeSpecificationValue();
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION: return createDataVariableDeclarationValuation();
			case ValuePackage.ARRAY_VALUE: return createArrayValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChanValue createChanValue() {
		ChanValueImpl chanValue = new ChanValueImpl();
		return chanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolValue createBoolValue() {
		BoolValueImpl boolValue = new BoolValueImpl();
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntValue createIntValue() {
		IntValueImpl intValue = new IntValueImpl();
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockValue createClockValue() {
		ClockValueImpl clockValue = new ClockValueImpl();
		return clockValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidValue createVoidValue() {
		VoidValueImpl voidValue = new VoidValueImpl();
		return voidValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarSpecificationValue createScalarSpecificationValue() {
		ScalarSpecificationValueImpl scalarSpecificationValue = new ScalarSpecificationValueImpl();
		return scalarSpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructSpecificationValue createStructSpecificationValue() {
		StructSpecificationValueImpl structSpecificationValue = new StructSpecificationValueImpl();
		return structSpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSpecificationValue createRangeSpecificationValue() {
		RangeSpecificationValueImpl rangeSpecificationValue = new RangeSpecificationValueImpl();
		return rangeSpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariableDeclarationValuation createDataVariableDeclarationValuation() {
		DataVariableDeclarationValuationImpl dataVariableDeclarationValuation = new DataVariableDeclarationValuationImpl();
		return dataVariableDeclarationValuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePackage getValuePackage() {
		return (ValuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValuePackage getPackage() {
		return ValuePackage.eINSTANCE;
	}

} //ValueFactoryImpl
