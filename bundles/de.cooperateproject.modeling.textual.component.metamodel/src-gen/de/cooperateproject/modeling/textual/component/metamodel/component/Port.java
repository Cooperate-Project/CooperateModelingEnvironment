/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.Port#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {

    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
     * @see #setVisibility(Visibility)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPort_Visibility()
     * @model unique="false"
     * @generated
     */
    Visibility getVisibility();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Port#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(Visibility value);
} // Port
