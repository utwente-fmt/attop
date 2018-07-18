/**
 */
package uppaalTrace.transitions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uppaalTrace.transitions.TransitionsPackage
 * @generated
 */
public interface TransitionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransitionsFactory eINSTANCE = uppaalTrace.transitions.impl.TransitionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Delay Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Transition</em>'.
	 * @generated
	 */
	DelayTransition createDelayTransition();

	/**
	 * Returns a new object of class '<em>Edge Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Transition</em>'.
	 * @generated
	 */
	EdgeTransition createEdgeTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransitionsPackage getTransitionsPackage();

} //TransitionsFactory
