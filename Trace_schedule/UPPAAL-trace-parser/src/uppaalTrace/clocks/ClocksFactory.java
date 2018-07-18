/**
 */
package uppaalTrace.clocks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uppaalTrace.clocks.ClocksPackage
 * @generated
 */
public interface ClocksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClocksFactory eINSTANCE = uppaalTrace.clocks.impl.ClocksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Clock Boundary</em>'.
	 * @generated
	 */
	SingleClockBoundary createSingleClockBoundary();

	/**
	 * Returns a new object of class '<em>Inverse Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse Clock Boundary</em>'.
	 * @generated
	 */
	InverseClockBoundary createInverseClockBoundary();

	/**
	 * Returns a new object of class '<em>Combined Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Clock Boundary</em>'.
	 * @generated
	 */
	CombinedClockBoundary createCombinedClockBoundary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClocksPackage getClocksPackage();

} //ClocksFactory
