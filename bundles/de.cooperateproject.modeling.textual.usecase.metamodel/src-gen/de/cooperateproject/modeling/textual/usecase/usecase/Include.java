/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Include> {
	/**
     * Returns the value of the '<em><b>Addition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Addition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Addition</em>' reference.
     * @see #setAddition(UseCase)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getInclude_Addition()
     * @model required="true"
     * @generated
     */
    UseCase getAddition();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getAddition <em>Addition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Addition</em>' reference.
     * @see #getAddition()
     * @generated
     */
    void setAddition(UseCase value);

    /**
     * Returns the value of the '<em><b>Including Case</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Including Case</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Including Case</em>' reference.
     * @see #setIncludingCase(UseCase)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getInclude_IncludingCase()
     * @model required="true"
     * @generated
     */
    UseCase getIncludingCase();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getIncludingCase <em>Including Case</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Including Case</em>' reference.
     * @see #getIncludingCase()
     * @generated
     */
    void setIncludingCase(UseCase value);

} // Include
