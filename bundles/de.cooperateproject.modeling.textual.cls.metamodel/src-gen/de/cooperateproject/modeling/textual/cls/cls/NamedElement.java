/**
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement<T extends org.eclipse.uml2.uml.NamedElement> extends UMLReferencingElement<T> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElement_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return getReferencedElement().getName();'"
	 * @generated
	 */
	String getName();

} // NamedElement
