/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Aliased</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAliasExpression <em>Alias Expression</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementAliased()
 * @model abstract="true"
 * @generated
 */
public interface NamedElementAliased<T extends NamedElement> extends de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> {
	/**
	 * Returns the value of the '<em><b>Alias Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Expression</em>' reference.
	 * @see #setAliasExpression(StringExpression)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementAliased_AliasExpression()
	 * @model
	 * @generated
	 */
	StringExpression getAliasExpression();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAliasExpression <em>Alias Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Expression</em>' reference.
	 * @see #getAliasExpression()
	 * @generated
	 */
	void setAliasExpression(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementAliased_Alias()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if (getAliasExpression() == null) {\r\n\treturn null;\r\n}\r\nreturn getAliasExpression().getName();'"
	 * @generated
	 */
	String getAlias();

} // NamedElementAliased
