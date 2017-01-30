/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aliased Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.AliasedElement#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAliasedElement()
 * @model
 * @generated
 */
public interface AliasedElement extends NamedElement {
	/**
     * Returns the value of the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' attribute.
     * @see #setAlias(String)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAliasedElement_Alias()
     * @model
     * @generated
     */
	String getAlias();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.AliasedElement#getAlias <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' attribute.
     * @see #getAlias()
     * @generated
     */
	void setAlias(String value);

} // AliasedElement
