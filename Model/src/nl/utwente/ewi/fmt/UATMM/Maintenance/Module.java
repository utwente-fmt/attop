/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getCondition <em>Condition</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffects <em>Effects</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getMaxEffectsInProgress <em>Max Effects In Progress</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffectDiscipline <em>Effect Discipline</em>}</li>
 *   <li>{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getModule_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link nl.utwente.ewi.fmt.UATMM.Maintenance.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getModule_Effects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Effect> getEffects();

	/**
	 * Returns the value of the '<em><b>Max Effects In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Effects In Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Effects In Progress</em>' attribute.
	 * @see #setMaxEffectsInProgress(int)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getModule_MaxEffectsInProgress()
	 * @model required="true"
	 * @generated
	 */
	int getMaxEffectsInProgress();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getMaxEffectsInProgress <em>Max Effects In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Effects In Progress</em>' attribute.
	 * @see #getMaxEffectsInProgress()
	 * @generated
	 */
	void setMaxEffectsInProgress(int value);

	/**
	 * Returns the value of the '<em><b>Effect Discipline</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Discipline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Discipline</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline
	 * @see #setEffectDiscipline(EffectDiscipline)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getModule_EffectDiscipline()
	 * @model required="true"
	 * @generated
	 */
	EffectDiscipline getEffectDiscipline();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getEffectDiscipline <em>Effect Discipline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Discipline</em>' attribute.
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.EffectDiscipline
	 * @see #getEffectDiscipline()
	 * @generated
	 */
	void setEffectDiscipline(EffectDiscipline value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.utwente.ewi.fmt.UATMM.Maintenance.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Module
