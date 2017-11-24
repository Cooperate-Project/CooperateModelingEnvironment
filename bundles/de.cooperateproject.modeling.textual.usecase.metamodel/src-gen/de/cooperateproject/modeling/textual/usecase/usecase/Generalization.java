/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getGeneral <em>General</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends UseCaseRelationship, ActorUsecaseRelationship, UMLReferencingElement<org.eclipse.uml2.uml.Generalization> {
    /**
     * Returns the value of the '<em><b>Specific</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specific</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specific</em>' reference.
     * @see #setSpecific(BehavioredClassifier)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getGeneralization_Specific()
     * @model required="true" transient="true"
     * @generated
     */
    BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> getSpecific();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getSpecific <em>Specific</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specific</em>' reference.
     * @see #getSpecific()
     * @generated
     */
    void setSpecific(BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> value);

    /**
     * Returns the value of the '<em><b>General</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General</em>' reference.
     * @see #setGeneral(BehavioredClassifier)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getGeneralization_General()
     * @model required="true" transient="true"
     * @generated
     */
    BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> getGeneral();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getGeneral <em>General</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General</em>' reference.
     * @see #getGeneral()
     * @generated
     */
    void setGeneral(BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> value);

} // Generalization
