/**
 */
package de.cooperateproject.modeling.textual.component.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.component.Interface#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.component.ComponentPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Classifier<org.eclipse.uml2.uml.Interface> {
    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.component.Member}<code>&lt;? extends org.eclipse.uml2.uml.Feature&gt;</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.component.ComponentPackage#getInterface_Members()
     * @model containment="true"
     * @generated
     */
    EList<Member<? extends Feature>> getMembers();

} // Interface
