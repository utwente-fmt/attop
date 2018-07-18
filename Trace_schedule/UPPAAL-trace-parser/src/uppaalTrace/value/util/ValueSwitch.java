/**
 */
package uppaalTrace.value.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uppaalTrace.value.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uppaalTrace.value.ValuePackage
 * @generated
 */
public class ValueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSwitch() {
		if (modelPackage == null) {
			modelPackage = ValuePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ValuePackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.BUILT_IN_TYPE_VALUE: {
				BuiltInTypeValue builtInTypeValue = (BuiltInTypeValue)theEObject;
				T result = caseBuiltInTypeValue(builtInTypeValue);
				if (result == null) result = caseValue(builtInTypeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.CHAN_VALUE: {
				ChanValue chanValue = (ChanValue)theEObject;
				T result = caseChanValue(chanValue);
				if (result == null) result = caseBuiltInTypeValue(chanValue);
				if (result == null) result = caseValue(chanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.BOOL_VALUE: {
				BoolValue boolValue = (BoolValue)theEObject;
				T result = caseBoolValue(boolValue);
				if (result == null) result = caseBuiltInTypeValue(boolValue);
				if (result == null) result = caseValue(boolValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.INT_VALUE: {
				IntValue intValue = (IntValue)theEObject;
				T result = caseIntValue(intValue);
				if (result == null) result = caseBuiltInTypeValue(intValue);
				if (result == null) result = caseValue(intValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.CLOCK_VALUE: {
				ClockValue clockValue = (ClockValue)theEObject;
				T result = caseClockValue(clockValue);
				if (result == null) result = caseBuiltInTypeValue(clockValue);
				if (result == null) result = caseValue(clockValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.VOID_VALUE: {
				VoidValue voidValue = (VoidValue)theEObject;
				T result = caseVoidValue(voidValue);
				if (result == null) result = caseBuiltInTypeValue(voidValue);
				if (result == null) result = caseValue(voidValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.TYPE_SPECIFICATION_VALUE: {
				TypeSpecificationValue typeSpecificationValue = (TypeSpecificationValue)theEObject;
				T result = caseTypeSpecificationValue(typeSpecificationValue);
				if (result == null) result = caseValue(typeSpecificationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.SCALAR_SPECIFICATION_VALUE: {
				ScalarSpecificationValue scalarSpecificationValue = (ScalarSpecificationValue)theEObject;
				T result = caseScalarSpecificationValue(scalarSpecificationValue);
				if (result == null) result = caseTypeSpecificationValue(scalarSpecificationValue);
				if (result == null) result = caseValue(scalarSpecificationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.STRUCT_SPECIFICATION_VALUE: {
				StructSpecificationValue structSpecificationValue = (StructSpecificationValue)theEObject;
				T result = caseStructSpecificationValue(structSpecificationValue);
				if (result == null) result = caseTypeSpecificationValue(structSpecificationValue);
				if (result == null) result = caseValue(structSpecificationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.RANGE_SPECIFICATION_VALUE: {
				RangeSpecificationValue rangeSpecificationValue = (RangeSpecificationValue)theEObject;
				T result = caseRangeSpecificationValue(rangeSpecificationValue);
				if (result == null) result = caseTypeSpecificationValue(rangeSpecificationValue);
				if (result == null) result = caseValue(rangeSpecificationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION: {
				DataVariableDeclarationValuation dataVariableDeclarationValuation = (DataVariableDeclarationValuation)theEObject;
				T result = caseDataVariableDeclarationValuation(dataVariableDeclarationValuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.ARRAY_VALUE: {
				ArrayValue arrayValue = (ArrayValue)theEObject;
				T result = caseArrayValue(arrayValue);
				if (result == null) result = caseValue(arrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Type Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Type Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInTypeValue(BuiltInTypeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chan Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chan Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChanValue(ChanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolValue(BoolValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntValue(IntValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockValue(ClockValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidValue(VoidValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Specification Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpecificationValue(TypeSpecificationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Specification Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarSpecificationValue(ScalarSpecificationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Specification Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructSpecificationValue(StructSpecificationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Specification Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSpecificationValue(RangeSpecificationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Variable Declaration Valuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Variable Declaration Valuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVariableDeclarationValuation(DataVariableDeclarationValuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ValueSwitch
