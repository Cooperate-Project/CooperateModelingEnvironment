/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ElementRelation#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getElementRelation()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ElementRelation extends CDOObject {
    /**
     * Returns the value of the '<em><b>Component</b></em>' reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.Component}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getElementRelation_Component()
     * @model lower="2" upper="2"
     * @generated
     */
    EList<Component> getComponent();

} // ElementRelation
