/**
 */
package uppaalTrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uppaalTrace.UppaalTracePackage
 * @generated
 */
public interface UppaalTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UppaalTraceFactory eINSTANCE = uppaalTrace.impl.UppaalTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Template Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Instance</em>'.
	 * @generated
	 */
	TemplateInstance createTemplateInstance();

	/**
	 * Returns a new object of class '<em>Location Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Instance</em>'.
	 * @generated
	 */
	LocationInstance createLocationInstance();

	/**
	 * Returns a new object of class '<em>Valuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valuation</em>'.
	 * @generated
	 */
	Valuation createValuation();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UppaalTracePackage getUppaalTracePackage();

} //UppaalTraceFactory
