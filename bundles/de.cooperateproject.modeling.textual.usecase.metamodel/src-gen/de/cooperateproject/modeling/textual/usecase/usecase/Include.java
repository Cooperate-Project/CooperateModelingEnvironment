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
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Include> {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(UseCase)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getInclude_Client()
	 * @model
	 * @generated
	 */
	UseCase getClient();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(UseCase value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(UseCase)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getInclude_Supplier()
	 * @model
	 * @generated
	 */
	UseCase getSupplier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(UseCase value);

} // Include
