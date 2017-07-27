/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.Interface#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Classifier<org.eclipse.uml2.uml.Interface> {
    /**
     * Returns the value of the '<em><b>Member</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.Member}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getInterface_Member()
     * @model containment="true"
     * @generated
     */
    EList<Member> getMember();

} // Interface
