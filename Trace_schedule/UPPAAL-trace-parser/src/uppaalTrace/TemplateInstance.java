/**
 */
package uppaalTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.muml.uppaal.templates.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.TemplateInstance#getTemplate <em>Template</em>}</li>
 *   <li>{@link uppaalTrace.TemplateInstance#getLocations <em>Locations</em>}</li>
 *   <li>{@link uppaalTrace.TemplateInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.UppaalTracePackage#getTemplateInstance()
 * @model
 * @generated
 */
public interface TemplateInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Template)
	 * @see uppaalTrace.UppaalTracePackage#getTemplateInstance_Template()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link uppaalTrace.TemplateInstance#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link uppaalTrace.LocationInstance}.
	 * It is bidirectional and its opposite is '{@link uppaalTrace.LocationInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see uppaalTrace.UppaalTracePackage#getTemplateInstance_Locations()
	 * @see uppaalTrace.LocationInstance#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<LocationInstance> getLocations();

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
	 * @see uppaalTrace.UppaalTracePackage#getTemplateInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uppaalTrace.TemplateInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TemplateInstance
