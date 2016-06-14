/**
 */
package de.cooperateproject.modeling.textual.activity.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityElementReference()
 * @model
 * @generated
 */
public interface ActivityElementReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Name)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityElementReference_Type()
	 * @model
	 * @generated
	 */
	Name getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Name value);

} // ActivityElementReference
