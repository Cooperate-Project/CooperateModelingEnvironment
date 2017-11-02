/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NameOptional;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Association#getMemberEnds <em>Member Ends</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociation()
 * @model abstract="true"
 * @generated
 */
public interface Association extends UMLReferencingElement<org.eclipse.uml2.uml.Association>, Connector, Commentable<org.eclipse.uml2.uml.Association>, NamedElement, NameOptional {
    /**
     * Returns the value of the '<em><b>Member Ends</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member Ends</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member Ends</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociation_MemberEnds()
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAssociation
     * @model opposite="association" containment="true"
     * @generated
     */
    EList<AssociationMemberEnd> getMemberEnds();

} // Association
