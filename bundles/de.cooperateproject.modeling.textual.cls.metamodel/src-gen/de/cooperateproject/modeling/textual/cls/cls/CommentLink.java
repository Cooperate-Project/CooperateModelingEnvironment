/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

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
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getCommentedElement <em>Commented Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentLink()
 * @model
 * @generated
 */
public interface CommentLink extends Connector, Commentable {

    /**
     * Returns the value of the '<em><b>Commented Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Commented Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Commented Element</em>' reference.
     * @see #setCommentedElement(Classifier)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentLink_CommentedElement()
     * @model required="true"
     * @generated
     */
    Classifier<?> getCommentedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getCommentedElement <em>Commented Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Commented Element</em>' reference.
     * @see #getCommentedElement()
     * @generated
     */
    void setCommentedElement(Classifier<?> value);
} // CommentLink
