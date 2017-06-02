/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Having Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getVisibilityHavingElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface VisibilityHavingElement extends CDOObject {
    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.uml2.uml.VisibilityKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see org.eclipse.uml2.uml.VisibilityKind
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #setVisibility(VisibilityKind)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getVisibilityHavingElement_Visibility()
     * @model unsettable="true" transient="true"
     * @generated
     */
    VisibilityKind getVisibility();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see org.eclipse.uml2.uml.VisibilityKind
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(VisibilityKind value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityKind)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityKind)
     * @generated
     */
    boolean isSetVisibility();

} // VisibilityHavingElement
