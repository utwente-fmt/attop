/**
 */
package uppaalTrace.value.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uppaalTrace.value.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uppaalTrace.value.ValuePackage
 * @generated
 */
public class ValueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValuePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSwitch<Adapter> modelSwitch =
		new ValueSwitch<Adapter>() {
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseBuiltInTypeValue(BuiltInTypeValue object) {
				return createBuiltInTypeValueAdapter();
			}
			@Override
			public Adapter caseChanValue(ChanValue object) {
				return createChanValueAdapter();
			}
			@Override
			public Adapter caseBoolValue(BoolValue object) {
				return createBoolValueAdapter();
			}
			@Override
			public Adapter caseIntValue(IntValue object) {
				return createIntValueAdapter();
			}
			@Override
			public Adapter caseClockValue(ClockValue object) {
				return createClockValueAdapter();
			}
			@Override
			public Adapter caseVoidValue(VoidValue object) {
				return createVoidValueAdapter();
			}
			@Override
			public Adapter caseTypeSpecificationValue(TypeSpecificationValue object) {
				return createTypeSpecificationValueAdapter();
			}
			@Override
			public Adapter caseScalarSpecificationValue(ScalarSpecificationValue object) {
				return createScalarSpecificationValueAdapter();
			}
			@Override
			public Adapter caseStructSpecificationValue(StructSpecificationValue object) {
				return createStructSpecificationValueAdapter();
			}
			@Override
			public Adapter caseRangeSpecificationValue(RangeSpecificationValue object) {
				return createRangeSpecificationValueAdapter();
			}
			@Override
			public Adapter caseDataVariableDeclarationValuation(DataVariableDeclarationValuation object) {
				return createDataVariableDeclarationValuationAdapter();
			}
			@Override
			public Adapter caseArrayValue(ArrayValue object) {
				return createArrayValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.BuiltInTypeValue <em>Built In Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.BuiltInTypeValue
	 * @generated
	 */
	public Adapter createBuiltInTypeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.ChanValue <em>Chan Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.ChanValue
	 * @generated
	 */
	public Adapter createChanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.BoolValue
	 * @generated
	 */
	public Adapter createBoolValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.IntValue
	 * @generated
	 */
	public Adapter createIntValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.ClockValue <em>Clock Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.ClockValue
	 * @generated
	 */
	public Adapter createClockValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.VoidValue <em>Void Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.VoidValue
	 * @generated
	 */
	public Adapter createVoidValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.TypeSpecificationValue <em>Type Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.TypeSpecificationValue
	 * @generated
	 */
	public Adapter createTypeSpecificationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.ScalarSpecificationValue <em>Scalar Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.ScalarSpecificationValue
	 * @generated
	 */
	public Adapter createScalarSpecificationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.StructSpecificationValue <em>Struct Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.StructSpecificationValue
	 * @generated
	 */
	public Adapter createStructSpecificationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.RangeSpecificationValue <em>Range Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.RangeSpecificationValue
	 * @generated
	 */
	public Adapter createRangeSpecificationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.DataVariableDeclarationValuation <em>Data Variable Declaration Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.DataVariableDeclarationValuation
	 * @generated
	 */
	public Adapter createDataVariableDeclarationValuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uppaalTrace.value.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uppaalTrace.value.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ValueAdapterFactory
