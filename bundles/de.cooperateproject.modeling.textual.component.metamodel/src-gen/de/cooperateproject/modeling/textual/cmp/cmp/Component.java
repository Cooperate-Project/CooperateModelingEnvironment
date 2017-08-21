/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getComponent <em>Component</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getPortRelation <em>Port Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getInterfaceRelation <em>Interface Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getOwningComponent <em>Owning Component</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Classifier<org.eclipse.uml2.uml.Component> {
    /**
     * Returns the value of the '<em><b>Component</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cmp.cmp.Component}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getOwningComponent <em>Owning Component</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent_Component()
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getOwningComponent
     * @model opposite="owningComponent" containment="true"
     * @generated
     */
    EList<Component> getComponent();

    /**
     * Returns the value of the '<em><b>Port Relation</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cmp.cmp.PortRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Relation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Relation</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent_PortRelation()
     * @model containment="true"
     * @generated
     */
    EList<PortRelation> getPortRelation();

    /**
     * Returns the value of the '<em><b>Interface Relation</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Relation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Relation</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent_InterfaceRelation()
     * @model containment="true"
     * @generated
     */
    EList<InterfaceRelation> getInterfaceRelation();

    /**
     * Returns the value of the '<em><b>Nested Interface</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cmp.cmp.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nested Interface</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nested Interface</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent_NestedInterface()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getNestedInterface();

    /**
     * Returns the value of the '<em><b>Port</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cmp.cmp.Port}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent_Port()
     * @model containment="true"
     * @generated
     */
    EList<Port> getPort();

    /**
     * Returns the value of the '<em><b>Owning Component</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Component</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Component</em>' container reference.
     * @see #setOwningComponent(Component)
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getComponent_OwningComponent()
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component#getComponent
     * @model opposite="component" transient="false"
     * @generated
     */
    Component getOwningComponent();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component#getOwningComponent <em>Owning Component</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Component</em>' container reference.
     * @see #getOwningComponent()
     * @generated
     */
    void setOwningComponent(Component value);

} // Component
