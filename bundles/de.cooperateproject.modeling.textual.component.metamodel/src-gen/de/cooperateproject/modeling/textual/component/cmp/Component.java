/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;

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
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Component#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Component#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Component#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Component#getPackagedElements <em>Packaged Elements</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Classifier<org.eclipse.uml2.uml.Component>, InterfaceProvidingRequiringEntity {
    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.cmp.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getComponent_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Port</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.cmp.Port}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getComponent_Port()
     * @model containment="true"
     * @generated
     */
    EList<Port> getPort();

    /**
     * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.cmp.Connector}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectors</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getComponent_Connectors()
     * @model containment="true"
     * @generated
     */
    EList<Connector> getConnectors();

    /**
     * Returns the value of the '<em><b>Packaged Elements</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packaged Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packaged Elements</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getComponent_PackagedElements()
     * @model containment="true"
     * @generated
     */
    EList<PackageableElement> getPackagedElements();

} // Component
