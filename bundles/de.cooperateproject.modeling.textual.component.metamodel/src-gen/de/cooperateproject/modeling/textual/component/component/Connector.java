/**
 */
package de.cooperateproject.modeling.textual.component.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.component.Connector#getConnectorEnds <em>Connector Ends</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.component.ComponentPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends UMLReferencingElement<org.eclipse.uml2.uml.Connector>, AliasedElement {
    /**
     * Returns the value of the '<em><b>Connector Ends</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.component.ConnectorEnd}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connector Ends</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connector Ends</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.component.ComponentPackage#getConnector_ConnectorEnds()
     * @model containment="true"
     * @generated
     */
    EList<ConnectorEnd> getConnectorEnds();

} // Connector
