/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getInterfaceRelation()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceRelation extends AliasedElement {
    /**
     * Returns the value of the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' reference.
     * @see #setInterface(Interface)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getInterfaceRelation_Interface()
     * @model required="true"
     * @generated
     */
    Interface getInterface();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation#getInterface <em>Interface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' reference.
     * @see #getInterface()
     * @generated
     */
    void setInterface(Interface value);

} // InterfaceRelation
