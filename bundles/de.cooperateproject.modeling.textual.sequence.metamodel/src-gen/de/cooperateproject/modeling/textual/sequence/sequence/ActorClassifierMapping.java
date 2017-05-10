/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Classifier Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping#getActor <em>Actor</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping#getClassifierName <em>Classifier Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getActorClassifierMapping()
 * @model
 * @generated
 */
public interface ActorClassifierMapping extends UMLReferencingElement<Property> {
    /**
     * Returns the value of the '<em><b>Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' reference.
     * @see #setClassifier(Classifier)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getActorClassifierMapping_Classifier()
     * @model
     * @generated
     */
    Classifier getClassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping#getClassifier <em>Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' reference.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(Classifier value);

    /**
     * Returns the value of the '<em><b>Actor</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequence.Actor#getTypeMapping <em>Type Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actor</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actor</em>' container reference.
     * @see #setActor(Actor)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getActorClassifierMapping_Actor()
     * @see de.cooperateproject.modeling.textual.sequence.sequence.Actor#getTypeMapping
     * @model opposite="typeMapping" transient="false"
     * @generated
     */
    Actor getActor();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping#getActor <em>Actor</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actor</em>' container reference.
     * @see #getActor()
     * @generated
     */
    void setActor(Actor value);

    /**
     * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier Name</em>' attribute.
     * @see #setClassifierName(String)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getActorClassifierMapping_ClassifierName()
     * @model dataType="org.eclipse.uml2.types.String"
     * @generated
     */
    String getClassifierName();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping#getClassifierName <em>Classifier Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier Name</em>' attribute.
     * @see #getClassifierName()
     * @generated
     */
    void setClassifierName(String value);

} // ActorClassifierMapping
