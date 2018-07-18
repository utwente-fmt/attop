/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage
 * @generated
 */
public interface UATMM_structureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UATMM_structureFactory eINSTANCE = nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attack Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Tree</em>'.
	 * @generated
	 */
	AttackTree createAttackTree();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND</em>'.
	 * @generated
	 */
	AND createAND();

	/**
	 * Returns a new object of class '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR</em>'.
	 * @generated
	 */
	OR createOR();

	/**
	 * Returns a new object of class '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XOR</em>'.
	 * @generated
	 */
	XOR createXOR();

	/**
	 * Returns a new object of class '<em>Tree Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Meta Data</em>'.
	 * @generated
	 */
	TreeMetaData createTreeMetaData();

	/**
	 * Returns a new object of class '<em>PAND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PAND</em>'.
	 * @generated
	 */
	PAND createPAND();

	/**
	 * Returns a new object of class '<em>TAND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAND</em>'.
	 * @generated
	 */
	TAND createTAND();

	/**
	 * Returns a new object of class '<em>Kof N</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kof N</em>'.
	 * @generated
	 */
	KofN createKofN();

	/**
	 * Returns a new object of class '<em>Weighted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weighted</em>'.
	 * @generated
	 */
	Weighted createWeighted();

	/**
	 * Returns a new object of class '<em>SAND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAND</em>'.
	 * @generated
	 */
	SAND createSAND();

	/**
	 * Returns a new object of class '<em>SOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SOR</em>'.
	 * @generated
	 */
	SOR createSOR();

	/**
	 * Returns a new object of class '<em>FDEP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FDEP</em>'.
	 * @generated
	 */
	FDEP createFDEP();

	/**
	 * Returns a new object of class '<em>Spare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spare</em>'.
	 * @generated
	 */
	Spare createSpare();

	/**
	 * Returns a new object of class '<em>RDEP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDEP</em>'.
	 * @generated
	 */
	RDEP createRDEP();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UATMM_structurePackage getUATMM_structurePackage();

} //UATMM_structureFactory
