/**
 */
package uppaalTrace;

import org.eclipse.emf.ecore.EObject;

import org.muml.uppaal.templates.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaalTrace.LocationInstance#getLocation <em>Location</em>}</li>
 *   <li>{@link uppaalTrace.LocationInstance#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see uppaalTrace.UppaalTracePackage#getLocationInstance()
 * @model
 * @generated
 */
public interface LocationInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see uppaalTrace.UppaalTracePackage#getLocationInstance_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link uppaalTrace.LocationInstance#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uppaalTrace.TemplateInstance#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateInstance)
	 * @see uppaalTrace.UppaalTracePackage#getLocationInstance_Template()
	 * @see uppaalTrace.TemplateInstance#getLocations
	 * @model opposite="locations" required="true" transient="false"
	 * @generated
	 */
	TemplateInstance getTemplate();

	/**
	 * Sets the value of the '{@link uppaalTrace.LocationInstance#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateInstance value);

} // LocationInstance
