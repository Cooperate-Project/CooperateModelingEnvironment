/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Commentable#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentable()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Commentable extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference.
	 * @see #setComment(Comment)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentable_Comment()
	 * @model
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Commentable#getComment <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

} // Commentable
