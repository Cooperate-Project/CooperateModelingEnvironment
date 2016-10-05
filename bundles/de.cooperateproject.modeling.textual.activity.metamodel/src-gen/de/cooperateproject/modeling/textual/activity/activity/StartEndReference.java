/**
 */
package de.cooperateproject.modeling.textual.activity.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start End Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.StartEndReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getStartEndReference()
 * @model
 * @generated
 */
public interface StartEndReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.activity.activity.StartEndEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.activity.activity.StartEndEnum
	 * @see #setType(StartEndEnum)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getStartEndReference_Type()
	 * @model unique="false"
	 * @generated
	 */
	StartEndEnum getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.StartEndReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.activity.activity.StartEndEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(StartEndEnum value);

} // StartEndReference
