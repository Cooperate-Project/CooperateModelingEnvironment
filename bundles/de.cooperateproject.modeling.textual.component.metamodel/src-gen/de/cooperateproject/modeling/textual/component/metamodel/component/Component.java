/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;

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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getComponent <em>Component</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getInterfacerelation <em>Interfacerelation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Commentable<org.eclipse.uml2.uml.Component>, AliasedElement, ElementContent {
    /**
     * Returns the value of the '<em><b>Component</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.Component}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponent_Component()
     * @model containment="true"
     * @generated
     */
    EList<Component> getComponent();

    /**
     * Returns the value of the '<em><b>Port</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponent_Port()
     * @model containment="true"
     * @generated
     */
    EList<PortRelation> getPort();

    /**
     * Returns the value of the '<em><b>Interfacerelation</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interfacerelation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interfacerelation</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponent_Interfacerelation()
     * @model containment="true"
     * @generated
     */
    EList<InterfaceRelation> getInterfacerelation();

    /**
     * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponent_Interface()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getInterface();

} // Component
