/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getCommentable()
 * @model abstract="true"
 * @generated
 */
public interface Commentable<CommentableUMLType extends Element> extends UMLReferencingElement<CommentableUMLType> {
	/**
     * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment#getCommentedElement <em>Commented Element</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Comments</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getCommentable_Comments()
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment#getCommentedElement
     * @model opposite="commentedElement" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/commons!Commentable{CommentableUMLType}!comments'"
     * @generated
     */
	EList<Comment> getComments();

} // Commentable
