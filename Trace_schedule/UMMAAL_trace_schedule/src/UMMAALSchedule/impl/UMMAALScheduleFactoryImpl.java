/**
 */
package UMMAALSchedule.impl;

import UMMAALSchedule.*;

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
public class UMMAALScheduleFactoryImpl extends EFactoryImpl implements UMMAALScheduleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMMAALScheduleFactory init() {
		try {
			UMMAALScheduleFactory theUMMAALScheduleFactory = (UMMAALScheduleFactory)EPackage.Registry.INSTANCE.getEFactory(UMMAALSchedulePackage.eNS_URI);
			if (theUMMAALScheduleFactory != null) {
				return theUMMAALScheduleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMMAALScheduleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMMAALScheduleFactoryImpl() {
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
			case UMMAALSchedulePackage.IDENTIFIABLE: return createIdentifiable();
			case UMMAALSchedulePackage.ROOT: return createRoot();
			case UMMAALSchedulePackage.TASK: return createTask();
			case UMMAALSchedulePackage.EXACT_TIME_INT: return createExactTimeInt();
			case UMMAALSchedulePackage.EXACT_TIME_DOUBLE: return createExactTimeDouble();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable createIdentifiable() {
		IdentifiableImpl identifiable = new IdentifiableImpl();
		return identifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactTimeInt createExactTimeInt() {
		ExactTimeIntImpl exactTimeInt = new ExactTimeIntImpl();
		return exactTimeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactTimeDouble createExactTimeDouble() {
		ExactTimeDoubleImpl exactTimeDouble = new ExactTimeDoubleImpl();
		return exactTimeDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMMAALSchedulePackage getUMMAALSchedulePackage() {
		return (UMMAALSchedulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMMAALSchedulePackage getPackage() {
		return UMMAALSchedulePackage.eINSTANCE;
	}

} //UMMAALScheduleFactoryImpl
