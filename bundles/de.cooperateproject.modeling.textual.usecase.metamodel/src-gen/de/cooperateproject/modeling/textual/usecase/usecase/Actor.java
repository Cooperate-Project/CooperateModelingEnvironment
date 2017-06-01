/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends BehavioredClassifier<org.eclipse.uml2.uml.Actor>, AliasedElement, VisibilityHavingElement {
    /**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #isSetAbstract()
     * @see #unsetAbstract()
     * @see #setAbstract(boolean)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActor_Abstract()
     * @model unsettable="true" transient="true"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isSetAbstract()
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    void unsetAbstract();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abstract</em>' attribute is set.
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    boolean isSetAbstract();

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
