/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Property#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property<T extends NamedElement> extends UMLReferencingElement<T>, Element, de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement, VisibilityHavingElement {
    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #isSetStatic()
     * @see #unsetStatic()
     * @see #setStatic(boolean)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getProperty_Static()
     * @model unique="false" unsettable="true" transient="true"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Property#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isSetStatic()
     * @see #unsetStatic()
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Property#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatic()
     * @see #isStatic()
     * @see #setStatic(boolean)
     * @generated
     */
    void unsetStatic();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Property#isStatic <em>Static</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static</em>' attribute is set.
     * @see #unsetStatic()
     * @see #isStatic()
     * @see #setStatic(boolean)
     * @generated
     */
    boolean isSetStatic();

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(Classifier)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getProperty_Type()
     * @model unsettable="true" transient="true"
     * @generated
     */
    Classifier getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Property#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(Classifier value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Property#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(Classifier)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Property#getType <em>Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' reference is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(Classifier)
     * @generated
     */
    boolean isSetType();

} // Property
