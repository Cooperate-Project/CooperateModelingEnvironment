/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends AliasedElement, BehavioredClassifier<org.eclipse.uml2.uml.Actor> {
	/**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.usecase.usecase.Visibility}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Visibility
     * @see #setVisibility(Visibility)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActor_Visibility()
     * @model required="true"
     * @generated
     */
	Visibility getVisibility();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Visibility
     * @see #getVisibility()
     * @generated
     */
	void setVisibility(Visibility value);

	/**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #setAbstract(boolean)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActor_Abstract()
     * @model required="true"
     * @generated
     */
	boolean isAbstract();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isAbstract()
     * @generated
     */
	void setAbstract(boolean value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.usecase.usecase.ActorType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ActorType
     * @see #setType(ActorType)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActor_Type()
     * @model required="true"
     * @generated
     */
    ActorType getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ActorType
     * @see #getType()
     * @generated
     */
    void setType(ActorType value);

} // Actor
