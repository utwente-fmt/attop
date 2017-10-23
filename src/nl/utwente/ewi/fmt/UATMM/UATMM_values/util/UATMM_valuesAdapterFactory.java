/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values.util;

import nl.utwente.ewi.fmt.UATMM.UATMM_values.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage
 * @generated
 */
public class UATMM_valuesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UATMM_valuesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_valuesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UATMM_valuesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UATMM_valuesSwitch<Adapter> modelSwitch =
		new UATMM_valuesSwitch<Adapter>() {
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseCostPurpose(CostPurpose object) {
				return createCostPurposeAdapter();
			}
			@Override
			public Adapter caseTimePurpose(TimePurpose object) {
				return createTimePurposeAdapter();
			}
			@Override
			public Adapter casePurpose(Purpose object) {
				return createPurposeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseJavaType(JavaType object) {
				return createJavaTypeAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseRealValue(RealValue object) {
				return createRealValueAdapter();
			}
			@Override
			public Adapter caseJavaObjectValue(JavaObjectValue object) {
				return createJavaObjectValueAdapter();
			}
			@Override
			public Adapter caseProbabilityPurpose(ProbabilityPurpose object) {
				return createProbabilityPurposeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose <em>Cost Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.CostPurpose
	 * @generated
	 */
	public Adapter createCostPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose <em>Time Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.TimePurpose
	 * @generated
	 */
	public Adapter createTimePurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Purpose
	 * @generated
	 */
	public Adapter createPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaType
	 * @generated
	 */
	public Adapter createJavaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.RealValue
	 * @generated
	 */
	public Adapter createRealValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue <em>Java Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.JavaObjectValue
	 * @generated
	 */
	public Adapter createJavaObjectValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose <em>Probability Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.ProbabilityPurpose
	 * @generated
	 */
	public Adapter createProbabilityPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UATMM_valuesAdapterFactory
