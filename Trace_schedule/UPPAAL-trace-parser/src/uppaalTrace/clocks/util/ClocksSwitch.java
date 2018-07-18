/**
 */
package uppaalTrace.clocks.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uppaalTrace.clocks.*;

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
 * @see uppaalTrace.clocks.ClocksPackage
 * @generated
 */
public class ClocksSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClocksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClocksSwitch() {
		if (modelPackage == null) {
			modelPackage = ClocksPackage.eINSTANCE;
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
			case ClocksPackage.ABSTRACT_CLOCK_BOUNDARY: {
				AbstractClockBoundary abstractClockBoundary = (AbstractClockBoundary)theEObject;
				T result = caseAbstractClockBoundary(abstractClockBoundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClocksPackage.SINGLE_CLOCK_BOUNDARY: {
				SingleClockBoundary singleClockBoundary = (SingleClockBoundary)theEObject;
				T result = caseSingleClockBoundary(singleClockBoundary);
				if (result == null) result = caseAbstractClockBoundary(singleClockBoundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClocksPackage.INVERSE_CLOCK_BOUNDARY: {
				InverseClockBoundary inverseClockBoundary = (InverseClockBoundary)theEObject;
				T result = caseInverseClockBoundary(inverseClockBoundary);
				if (result == null) result = caseAbstractClockBoundary(inverseClockBoundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClocksPackage.COMBINED_CLOCK_BOUNDARY: {
				CombinedClockBoundary combinedClockBoundary = (CombinedClockBoundary)theEObject;
				T result = caseCombinedClockBoundary(combinedClockBoundary);
				if (result == null) result = caseAbstractClockBoundary(combinedClockBoundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Clock Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClockBoundary(AbstractClockBoundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Clock Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleClockBoundary(SingleClockBoundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Clock Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseClockBoundary(InverseClockBoundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Clock Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Clock Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedClockBoundary(CombinedClockBoundary object) {
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

} //ClocksSwitch
