/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Stereotype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getValues <em>Values</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getStereotypeApplication()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StereotypeApplication extends CDOObject {
    /**
     * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Element</em>' reference.
     * @see #setReferencedElement(EObject)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getStereotypeApplication_ReferencedElement()
     * @model
     * @generated
     */
    EObject getReferencedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getReferencedElement <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Element</em>' reference.
     * @see #getReferencedElement()
     * @generated
     */
    void setReferencedElement(EObject value);

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' reference.
     * @see #setStereotype(Stereotype)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getStereotypeApplication_Stereotype()
     * @model transient="true"
     * @generated
     */
    Stereotype getStereotype();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype <em>Stereotype</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' reference.
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(Stereotype value);

    /**
     * Returns the value of the '<em><b>Values</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TaggedValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getStereotypeApplication_Values()
     * @model containment="true" transient="true"
     * @generated
     */
    EList<TaggedValue> getValues();

} // StereotypeApplication
