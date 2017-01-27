/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getActor <em>Actor</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getLeftCardinality <em>Left Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getRightCardinality <em>Right Cardinality</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Association> {
	/**
     * Returns the value of the '<em><b>Actor</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Actor</em>' reference.
     * @see #setActor(Actor)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation_Actor()
     * @model
     * @generated
     */
	Actor getActor();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getActor <em>Actor</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actor</em>' reference.
     * @see #getActor()
     * @generated
     */
	void setActor(Actor value);

	/**
     * Returns the value of the '<em><b>Usecase</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usecase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Usecase</em>' reference.
     * @see #setUsecase(UseCase)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation_Usecase()
     * @model
     * @generated
     */
	UseCase getUsecase();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getUsecase <em>Usecase</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usecase</em>' reference.
     * @see #getUsecase()
     * @generated
     */
	void setUsecase(UseCase value);

	/**
     * Returns the value of the '<em><b>Left Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Left Cardinality</em>' containment reference.
     * @see #setLeftCardinality(Cardinality)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation_LeftCardinality()
     * @model containment="true"
     * @generated
     */
	Cardinality getLeftCardinality();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getLeftCardinality <em>Left Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left Cardinality</em>' containment reference.
     * @see #getLeftCardinality()
     * @generated
     */
	void setLeftCardinality(Cardinality value);

	/**
     * Returns the value of the '<em><b>Right Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Right Cardinality</em>' containment reference.
     * @see #setRightCardinality(Cardinality)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation_RightCardinality()
     * @model containment="true"
     * @generated
     */
	Cardinality getRightCardinality();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getRightCardinality <em>Right Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right Cardinality</em>' containment reference.
     * @see #getRightCardinality()
     * @generated
     */
	void setRightCardinality(Cardinality value);

} // Association
