/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance.util;

import nl.utwente.ewi.fmt.UATMM.Maintenance.*;
import nl.utwente.ewi.fmt.UATMM.Maintenance.Module;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage
 * @generated
 */
public class MaintenanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaintenancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceSwitch() {
		if (modelPackage == null) {
			modelPackage = MaintenancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MaintenancePackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.EFFECT: {
				Effect effect = (Effect)theEObject;
				T result = caseEffect(effect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.COMBINING_CONDITION: {
				CombiningCondition combiningCondition = (CombiningCondition)theEObject;
				T result = caseCombiningCondition(combiningCondition);
				if (result == null) result = caseCondition(combiningCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.NODE_CONDITION: {
				NodeCondition nodeCondition = (NodeCondition)theEObject;
				T result = caseNodeCondition(nodeCondition);
				if (result == null) result = caseCondition(nodeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.DELAY_CONDITION: {
				DelayCondition delayCondition = (DelayCondition)theEObject;
				T result = caseDelayCondition(delayCondition);
				if (result == null) result = caseCondition(delayCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.ACTIVATION_CONDITION: {
				ActivationCondition activationCondition = (ActivationCondition)theEObject;
				T result = caseActivationCondition(activationCondition);
				if (result == null) result = caseCondition(activationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.MAINTENANCE_POLICY: {
				MaintenancePolicy maintenancePolicy = (MaintenancePolicy)theEObject;
				T result = caseMaintenancePolicy(maintenancePolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.REPAIR_EFFECT: {
				RepairEffect repairEffect = (RepairEffect)theEObject;
				T result = caseRepairEffect(repairEffect);
				if (result == null) result = caseEffect(repairEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.TRIGGER_EFFECT: {
				TriggerEffect triggerEffect = (TriggerEffect)theEObject;
				T result = caseTriggerEffect(triggerEffect);
				if (result == null) result = caseEffect(triggerEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.EXPONENTIAL_DELAY: {
				ExponentialDelay exponentialDelay = (ExponentialDelay)theEObject;
				T result = caseExponentialDelay(exponentialDelay);
				if (result == null) result = caseDelay(exponentialDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.BOUNDED_DELAY: {
				BoundedDelay boundedDelay = (BoundedDelay)theEObject;
				T result = caseBoundedDelay(boundedDelay);
				if (result == null) result = caseDelay(boundedDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.CUSTOM_MODULE: {
				CustomModule customModule = (CustomModule)theEObject;
				T result = caseCustomModule(customModule);
				if (result == null) result = caseModule(customModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.NODE_STATE: {
				NodeState nodeState = (NodeState)theEObject;
				T result = caseNodeState(nodeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.LINEAR_NODE_STATE: {
				LinearNodeState linearNodeState = (LinearNodeState)theEObject;
				T result = caseLinearNodeState(linearNodeState);
				if (result == null) result = caseNodeState(linearNodeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaintenancePackage.PHASE_TYPE_STATE: {
				PhaseTypeState phaseTypeState = (PhaseTypeState)theEObject;
				T result = casePhaseTypeState(phaseTypeState);
				if (result == null) result = caseNodeState(phaseTypeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffect(Effect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combining Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combining Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombiningCondition(CombiningCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeCondition(NodeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayCondition(DelayCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationCondition(ActivationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenancePolicy(MaintenancePolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repair Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repair Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepairEffect(RepairEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEffect(TriggerEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponential Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponential Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentialDelay(ExponentialDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedDelay(BoundedDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomModule(CustomModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeState(NodeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Node State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Node State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearNodeState(LinearNodeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Type State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Type State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseTypeState(PhaseTypeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MaintenanceSwitch
