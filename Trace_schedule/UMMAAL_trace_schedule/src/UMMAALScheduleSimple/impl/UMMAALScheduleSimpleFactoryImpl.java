/**
 */
package UMMAALScheduleSimple.impl;

import UMMAALScheduleSimple.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMMAALScheduleSimpleFactoryImpl extends EFactoryImpl implements UMMAALScheduleSimpleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMMAALScheduleSimpleFactory init() {
		try {
			UMMAALScheduleSimpleFactory theUMMAALScheduleSimpleFactory = (UMMAALScheduleSimpleFactory)EPackage.Registry.INSTANCE.getEFactory(UMMAALScheduleSimplePackage.eNS_URI);
			if (theUMMAALScheduleSimpleFactory != null) {
				return theUMMAALScheduleSimpleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMMAALScheduleSimpleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMMAALScheduleSimpleFactoryImpl() {
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
			case UMMAALScheduleSimplePackage.SIMPLE_EXECUTOR: return createSimpleExecutor();
			case UMMAALScheduleSimplePackage.SIMPLE_EXECUTABLE: return createSimpleExecutable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExecutor createSimpleExecutor() {
		SimpleExecutorImpl simpleExecutor = new SimpleExecutorImpl();
		return simpleExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExecutable createSimpleExecutable() {
		SimpleExecutableImpl simpleExecutable = new SimpleExecutableImpl();
		return simpleExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMMAALScheduleSimplePackage getUMMAALScheduleSimplePackage() {
		return (UMMAALScheduleSimplePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMMAALScheduleSimplePackage getPackage() {
		return UMMAALScheduleSimplePackage.eINSTANCE;
	}

} //UMMAALScheduleSimpleFactoryImpl
