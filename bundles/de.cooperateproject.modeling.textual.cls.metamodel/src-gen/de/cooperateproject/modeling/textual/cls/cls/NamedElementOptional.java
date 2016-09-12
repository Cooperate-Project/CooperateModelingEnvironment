/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementOptional()
 * @model abstract="true"
 * @generated
 */
public interface NamedElementOptional<T extends NamedElement> extends UMLReferencingElement<T> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementOptional_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if (getReferencedElement() == null) {\r\n\treturn null;\r\n}\r\nreturn getReferencedElement().getName();'"
	 * @generated
	 */
	String getName();

} // NamedElementOptional
