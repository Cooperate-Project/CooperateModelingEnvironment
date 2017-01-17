/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Generalization> {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(BehavioredClassifier)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getGeneralization_Client()
	 * @model
	 * @generated
	 */
	BehavioredClassifier getClient();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(BehavioredClassifier)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getGeneralization_Supplier()
	 * @model
	 * @generated
	 */
	BehavioredClassifier getSupplier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(BehavioredClassifier value);

} // Generalization
