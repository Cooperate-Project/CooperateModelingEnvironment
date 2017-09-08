/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getAppliedStereotypes <em>Applied Stereotypes</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getUMLReferencingElement()
 * @model abstract="true"
 * @generated
 */
public interface UMLReferencingElement<UMLType extends Element> extends de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element {
	/**
     * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Element</em>' reference.
     * @see #setReferencedElement(Element)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getUMLReferencingElement_ReferencedElement()
     * @model
     * @generated
     */
	UMLType getReferencedElement();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Element</em>' reference.
     * @see #getReferencedElement()
     * @generated
     */
	void setReferencedElement(UMLType value);

    /**
     * Returns the value of the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applied Stereotypes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applied Stereotypes</em>' containment reference list.
     * @see #isSetAppliedStereotypes()
     * @see #unsetAppliedStereotypes()
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getUMLReferencingElement_AppliedStereotypes()
     * @model containment="true" unsettable="true" transient="true"
     * @generated
     */
    EList<StereotypeApplication> getAppliedStereotypes();

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getAppliedStereotypes <em>Applied Stereotypes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppliedStereotypes()
     * @see #getAppliedStereotypes()
     * @generated
     */
    void unsetAppliedStereotypes();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getAppliedStereotypes <em>Applied Stereotypes</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Applied Stereotypes</em>' containment reference list is set.
     * @see #unsetAppliedStereotypes()
     * @see #getAppliedStereotypes()
     * @generated
     */
    boolean isSetAppliedStereotypes();

} // UMLReferencingElement
