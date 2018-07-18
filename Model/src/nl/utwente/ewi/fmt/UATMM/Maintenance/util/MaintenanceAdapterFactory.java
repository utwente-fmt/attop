/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.util;

import nl.utwente.ewi.fmt.UATMM.Maintenance.*;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Module;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage
 * @generated
 */
public class MaintenanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaintenancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MaintenancePackage.eINSTANCE;
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
	protected MaintenanceSwitch<Adapter> modelSwitch =
		new MaintenanceSwitch<Adapter>() {
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseCombiningCondition(CombiningCondition object) {
				return createCombiningConditionAdapter();
			}
			@Override
			public Adapter caseNodeCondition(NodeCondition object) {
				return createNodeConditionAdapter();
			}
			@Override
			public Adapter caseDelayCondition(DelayCondition object) {
				return createDelayConditionAdapter();
			}
			@Override
			public Adapter caseActivationCondition(ActivationCondition object) {
				return createActivationConditionAdapter();
			}
			@Override
			public Adapter caseMaintenancePolicy(MaintenancePolicy object) {
				return createMaintenancePolicyAdapter();
			}
			@Override
			public Adapter caseRepairEffect(RepairEffect object) {
				return createRepairEffectAdapter();
			}
			@Override
			public Adapter caseTriggerEffect(TriggerEffect object) {
				return createTriggerEffectAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseExponentialDelay(ExponentialDelay object) {
				return createExponentialDelayAdapter();
			}
			@Override
			public Adapter caseBoundedDelay(BoundedDelay object) {
				return createBoundedDelayAdapter();
			}
			@Override
			public Adapter caseCustomModule(CustomModule object) {
				return createCustomModuleAdapter();
			}
			@Override
			public Adapter caseNodeState(NodeState object) {
				return createNodeStateAdapter();
			}
			@Override
			public Adapter caseLinearNodeState(LinearNodeState object) {
				return createLinearNodeStateAdapter();
			}
			@Override
			public Adapter casePhaseTypeState(PhaseTypeState object) {
				return createPhaseTypeStateAdapter();
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
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition <em>Combining Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CombiningCondition
	 * @generated
	 */
	public Adapter createCombiningConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition <em>Node Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeCondition
	 * @generated
	 */
	public Adapter createNodeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition <em>Delay Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.DelayCondition
	 * @generated
	 */
	public Adapter createDelayConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.ActivationCondition
	 * @generated
	 */
	public Adapter createActivationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePolicy
	 * @generated
	 */
	public Adapter createMaintenancePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect <em>Repair Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.RepairEffect
	 * @generated
	 */
	public Adapter createRepairEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect <em>Trigger Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.TriggerEffect
	 * @generated
	 */
	public Adapter createTriggerEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay <em>Exponential Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.ExponentialDelay
	 * @generated
	 */
	public Adapter createExponentialDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay <em>Bounded Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.BoundedDelay
	 * @generated
	 */
	public Adapter createBoundedDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule <em>Custom Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.CustomModule
	 * @generated
	 */
	public Adapter createCustomModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState <em>Node State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.NodeState
	 * @generated
	 */
	public Adapter createNodeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState <em>Linear Node State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.LinearNodeState
	 * @generated
	 */
	public Adapter createLinearNodeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState <em>Phase Type State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.PhaseTypeState
	 * @generated
	 */
	public Adapter createPhaseTypeStateAdapter() {
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

} //MaintenanceAdapterFactory
