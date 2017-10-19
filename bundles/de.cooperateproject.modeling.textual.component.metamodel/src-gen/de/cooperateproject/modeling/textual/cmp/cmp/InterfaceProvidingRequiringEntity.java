/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.InterfaceProvidingRequiringEntity#getInterfaceRelation <em>Interface Relation</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getInterfaceProvidingRequiringEntity()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface InterfaceProvidingRequiringEntity extends CDOObject {
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
     * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage#getInterfaceProvidingRequiringEntity_InterfaceRelation()
     * @model containment="true"
     * @generated
     */
    EList<InterfaceRelation> getInterfaceRelation();

} // InterfaceProvidingRequiringEntity
