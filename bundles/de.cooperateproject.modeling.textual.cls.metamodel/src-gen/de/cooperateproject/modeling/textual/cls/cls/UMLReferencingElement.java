/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getUMLReferencingElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface UMLReferencingElement<T extends NamedElement> extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(NamedElement)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getUMLReferencingElement_ReferencedElement()
	 * @model
	 * @generated
	 */
	T getReferencedElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(T value);

} // UMLReferencingElement
