/**
 */
package uppaalTrace.value;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uppaalTrace.value.ValuePackage
 * @generated
 */
public interface ValueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValueFactory eINSTANCE = uppaalTrace.value.impl.ValueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Chan Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chan Value</em>'.
	 * @generated
	 */
	ChanValue createChanValue();

	/**
	 * Returns a new object of class '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Value</em>'.
	 * @generated
	 */
	BoolValue createBoolValue();

	/**
	 * Returns a new object of class '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Value</em>'.
	 * @generated
	 */
	IntValue createIntValue();

	/**
	 * Returns a new object of class '<em>Clock Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Value</em>'.
	 * @generated
	 */
	ClockValue createClockValue();

	/**
	 * Returns a new object of class '<em>Void Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Value</em>'.
	 * @generated
	 */
	VoidValue createVoidValue();

	/**
	 * Returns a new object of class '<em>Scalar Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Specification Value</em>'.
	 * @generated
	 */
	ScalarSpecificationValue createScalarSpecificationValue();

	/**
	 * Returns a new object of class '<em>Struct Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Specification Value</em>'.
	 * @generated
	 */
	StructSpecificationValue createStructSpecificationValue();

	/**
	 * Returns a new object of class '<em>Range Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Specification Value</em>'.
	 * @generated
	 */
	RangeSpecificationValue createRangeSpecificationValue();

	/**
	 * Returns a new object of class '<em>Data Variable Declaration Valuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Variable Declaration Valuation</em>'.
	 * @generated
	 */
	DataVariableDeclarationValuation createDataVariableDeclarationValuation();

	/**
	 * Returns a new object of class '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Value</em>'.
	 * @generated
	 */
	ArrayValue createArrayValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValuePackage getValuePackage();

} //ValueFactory
