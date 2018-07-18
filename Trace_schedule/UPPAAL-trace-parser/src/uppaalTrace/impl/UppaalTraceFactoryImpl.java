/**
 */
package uppaalTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uppaalTrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UppaalTraceFactoryImpl extends EFactoryImpl implements UppaalTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UppaalTraceFactory init() {
		try {
			UppaalTraceFactory theUppaalTraceFactory = (UppaalTraceFactory)EPackage.Registry.INSTANCE.getEFactory(UppaalTracePackage.eNS_URI);
			if (theUppaalTraceFactory != null) {
				return theUppaalTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UppaalTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalTraceFactoryImpl() {
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
			case UppaalTracePackage.TEMPLATE_INSTANCE: return createTemplateInstance();
			case UppaalTracePackage.LOCATION_INSTANCE: return createLocationInstance();
			case UppaalTracePackage.VALUATION: return createValuation();
			case UppaalTracePackage.STATE: return createState();
			case UppaalTracePackage.TRACE: return createTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateInstance createTemplateInstance() {
		TemplateInstanceImpl templateInstance = new TemplateInstanceImpl();
		return templateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationInstance createLocationInstance() {
		LocationInstanceImpl locationInstance = new LocationInstanceImpl();
		return locationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valuation createValuation() {
		ValuationImpl valuation = new ValuationImpl();
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalTracePackage getUppaalTracePackage() {
		return (UppaalTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UppaalTracePackage getPackage() {
		return UppaalTracePackage.eINSTANCE;
	}

} //UppaalTraceFactoryImpl
