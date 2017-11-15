/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

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
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getActorCardinality <em>Actor Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getUseCaseCardinality <em>Use Case Cardinality</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends UMLReferencingElement<org.eclipse.uml2.uml.Association>, UseCaseRelationship, ActorUsecaseRelationship {
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
     * @model transient="true"
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
     * @model transient="true"
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
     * Returns the value of the '<em><b>Actor Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actor Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actor Cardinality</em>' containment reference.
     * @see #setActorCardinality(Cardinality)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation_ActorCardinality()
     * @model containment="true"
     * @generated
     */
    Cardinality getActorCardinality();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getActorCardinality <em>Actor Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actor Cardinality</em>' containment reference.
     * @see #getActorCardinality()
     * @generated
     */
    void setActorCardinality(Cardinality value);

    /**
     * Returns the value of the '<em><b>Use Case Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Case Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Case Cardinality</em>' containment reference.
     * @see #setUseCaseCardinality(Cardinality)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getAssociation_UseCaseCardinality()
     * @model containment="true"
     * @generated
     */
    Cardinality getUseCaseCardinality();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getUseCaseCardinality <em>Use Case Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Case Cardinality</em>' containment reference.
     * @see #getUseCaseCardinality()
     * @generated
     */
    void setUseCaseCardinality(Cardinality value);

} // Association
