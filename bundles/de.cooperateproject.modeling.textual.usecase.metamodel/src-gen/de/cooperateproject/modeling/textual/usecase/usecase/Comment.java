/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Comment#getCommentedElement <em>Commented Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Comment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Comment> {
	/**
	 * Returns the value of the '<em><b>Commented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commented Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commented Element</em>' reference.
	 * @see #setCommentedElement(Commentable)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getComment_CommentedElement()
	 * @model
	 * @generated
	 */
	Commentable getCommentedElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Comment#getCommentedElement <em>Commented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commented Element</em>' reference.
	 * @see #getCommentedElement()
	 * @generated
	 */
	void setCommentedElement(Commentable value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getComment_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Comment
