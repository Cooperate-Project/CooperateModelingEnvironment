/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation()
 * @model abstract="true"
 * @generated
 */
public interface PortRelation extends AliasedElement {
    /**
     * Returns the value of the '<em><b>Port</b></em>' reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.Component}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_Port()
     * @model lower="2" upper="2"
     * @generated
     */
    EList<Component> getPort();

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
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_Interface()
     * @model required="true"
     * @generated
     */
    Interface getInterface();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInterface <em>Interface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' reference.
     * @see #getInterface()
     * @generated
     */
    void setInterface(Interface value);

} // PortRelation
