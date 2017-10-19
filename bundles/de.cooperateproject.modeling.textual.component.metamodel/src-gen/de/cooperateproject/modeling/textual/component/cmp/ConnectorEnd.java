/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getPart <em>Part</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends UMLReferencingElement<org.eclipse.uml2.uml.ConnectorEnd> {
    /**
     * Returns the value of the '<em><b>Part</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Part</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Part</em>' reference.
     * @see #setPart(Attribute)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getConnectorEnd_Part()
     * @model transient="true"
     * @generated
     */
    Attribute getPart();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getPart <em>Part</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Part</em>' reference.
     * @see #getPart()
     * @generated
     */
    void setPart(Attribute value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' reference.
     * @see #setRole(Port)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getConnectorEnd_Role()
     * @model transient="true"
     * @generated
     */
    Port<Classifier> getRole();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getRole <em>Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' reference.
     * @see #getRole()
     * @generated
     */
    void setRole(Port<Classifier> value);

} // ConnectorEnd
