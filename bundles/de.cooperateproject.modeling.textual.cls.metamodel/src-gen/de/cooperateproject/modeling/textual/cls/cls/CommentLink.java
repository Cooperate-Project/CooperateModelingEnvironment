/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasComment'"
 * @generated
 */
public interface CommentLink extends Connector, Commentable {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(UMLTypeReference)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentLink_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UMLTypeReference getLeft();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(UMLTypeReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getComment() == null) {\r\n\t<%org.eclipse.emf.common.util.BasicDiagnostic%> basicDiagnostic = new <%org.eclipse.emf.common.util.BasicDiagnostic%>(<%org.eclipse.emf.common.util.BasicDiagnostic%>.ERROR, \"hasComment\", 1, \"A comment link must have a comment.\", new Object[]{this});\r\n\tdiagnostics.add(basicDiagnostic);\r\n\treturn false;\r\n}\r\ndiagnostics.add(<%org.eclipse.emf.common.util.BasicDiagnostic%>.OK_INSTANCE);\r\nreturn true;'"
	 * @generated
	 */
	boolean hasComment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getLeft() instanceof <%de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference%>) {\r\n\treturn ((<%de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference%>)getLeft()).getType();\r\n}\r\nthrow new IllegalStateException(\"Internal error in determining commented UML element.\");'"
	 * @generated
	 */
	@Override
	Type getCommentedElement();

} // CommentLink
