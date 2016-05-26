/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

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
public interface CommentLink extends Connector {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ClassifierAssociationEnd)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCommentLink_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassifierAssociationEnd getLeft();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ClassifierAssociationEnd value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%de.cooperateproject.modeling.textual.cls.cls.Comment%> _comment = this.getComment();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_comment, null);\nif (_equals)\n{\n\t<%java.util.ArrayList%><<%java.lang.Object%>> _newArrayList = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%java.lang.Object%>>newArrayList(this, context);\n\t<%java.lang.Object%>[] _array = _newArrayList.toArray();\n\t<%org.eclipse.emf.common.util.BasicDiagnostic%> _basicDiagnostic = new <%org.eclipse.emf.common.util.BasicDiagnostic%>(<%org.eclipse.emf.common.util.BasicDiagnostic%>.ERROR, \"hasComment\", 1, \"A comment link must have a comment.\", _array);\n\tdiagnostics.add(_basicDiagnostic);\n\treturn false;\n}\ndiagnostics.add(<%org.eclipse.emf.common.util.BasicDiagnostic%>.OK_INSTANCE);\nreturn true;'"
	 * @generated
	 */
	boolean hasComment(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CommentLink
