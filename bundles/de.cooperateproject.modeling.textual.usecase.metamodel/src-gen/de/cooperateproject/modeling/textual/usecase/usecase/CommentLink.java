/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.CommentLink#getCommentedElement <em>Commented Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getCommentLink()
 * @model
 * @generated
 */
public interface CommentLink extends Relationship, Commentable {
    /**
     * Returns the value of the '<em><b>Commented Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Commented Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Commented Element</em>' reference.
     * @see #setCommentedElement(BehavioredClassifier)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getCommentLink_CommentedElement()
     * @model
     * @generated
     */
    BehavioredClassifier<?> getCommentedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.CommentLink#getCommentedElement <em>Commented Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Commented Element</em>' reference.
     * @see #getCommentedElement()
     * @generated
     */
    void setCommentedElement(BehavioredClassifier<?> value);

} // CommentLink
