/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage
 * @generated
 */
public interface UATMM_valuesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UATMM_valuesFactory eINSTANCE = nl.utwente.ewi.fmt.UATMM.UATMM_values.impl.UATMM_valuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Cost Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost Purpose</em>'.
	 * @generated
	 */
	CostPurpose createCostPurpose();

	/**
	 * Returns a new object of class '<em>Time Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Purpose</em>'.
	 * @generated
	 */
	TimePurpose createTimePurpose();

	/**
	 * Returns a new object of class '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Type</em>'.
	 * @generated
	 */
	RealType createRealType();

	/**
	 * Returns a new object of class '<em>Java Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Type</em>'.
	 * @generated
	 */
	JavaType createJavaType();

	/**
	 * Returns a new object of class '<em>Real Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Value</em>'.
	 * @generated
	 */
	RealValue createRealValue();

	/**
	 * Returns a new object of class '<em>Java Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Object Value</em>'.
	 * @generated
	 */
	JavaObjectValue createJavaObjectValue();

	/**
	 * Returns a new object of class '<em>Probability Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probability Purpose</em>'.
	 * @generated
	 */
	ProbabilityPurpose createProbabilityPurpose();

	/**
	 * Returns a new object of class '<em>Real Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Sequence Type</em>'.
	 * @generated
	 */
	RealSequenceType createRealSequenceType();

	/**
	 * Returns a new object of class '<em>Real Sequence Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Sequence Value</em>'.
	 * @generated
	 */
	RealSequenceValue createRealSequenceValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UATMM_valuesPackage getUATMM_valuesPackage();

} //UATMM_valuesFactory
