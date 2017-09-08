/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.ecore.EObject;

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
     * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' attribute.
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #setStereotype(String)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getStereotypeApplication_Stereotype()
     * @model unsettable="true" transient="true"
     * @generated
     */
    String getStereotype();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(String value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(String)
     * @generated
     */
    void unsetStereotype();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype <em>Stereotype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stereotype</em>' attribute is set.
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(String)
     * @generated
     */
    boolean isSetStereotype();

} // StereotypeApplication
