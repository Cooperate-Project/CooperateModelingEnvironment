/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getOuterPort <em>Outer Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInnerPort <em>Inner Port</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation()
 * @model abstract="true"
 * @generated
 */
public interface PortRelation extends AliasedElement {
    /**
     * Returns the value of the '<em><b>Outer Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outer Port</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outer Port</em>' reference.
     * @see #setOuterPort(Port)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_OuterPort()
     * @model required="true"
     * @generated
     */
    Port getOuterPort();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getOuterPort <em>Outer Port</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outer Port</em>' reference.
     * @see #getOuterPort()
     * @generated
     */
    void setOuterPort(Port value);

    /**
     * Returns the value of the '<em><b>Inner Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Port</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner Port</em>' reference.
     * @see #setInnerPort(Port)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_InnerPort()
     * @model required="true"
     * @generated
     */
    Port getInnerPort();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInnerPort <em>Inner Port</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner Port</em>' reference.
     * @see #getInnerPort()
     * @generated
     */
    void setInnerPort(Port value);

} // PortRelation
