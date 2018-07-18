/**
 */
package uppaalTrace.transitions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uppaalTrace.transitions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionsFactoryImpl extends EFactoryImpl implements TransitionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionsFactory init() {
		try {
			TransitionsFactory theTransitionsFactory = (TransitionsFactory)EPackage.Registry.INSTANCE.getEFactory(TransitionsPackage.eNS_URI);
			if (theTransitionsFactory != null) {
				return theTransitionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransitionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionsFactoryImpl() {
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
			case TransitionsPackage.DELAY_TRANSITION: return createDelayTransition();
			case TransitionsPackage.EDGE_TRANSITION: return createEdgeTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayTransition createDelayTransition() {
		DelayTransitionImpl delayTransition = new DelayTransitionImpl();
		return delayTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeTransition createEdgeTransition() {
		EdgeTransitionImpl edgeTransition = new EdgeTransitionImpl();
		return edgeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionsPackage getTransitionsPackage() {
		return (TransitionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransitionsPackage getPackage() {
		return TransitionsPackage.eINSTANCE;
	}

} //TransitionsFactoryImpl
