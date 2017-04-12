/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers <em>Members</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getOwningPackage <em>Owning Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier<T extends org.eclipse.uml2.uml.Classifier> extends UMLReferencingElement<org.eclipse.uml2.uml.Classifier>, AliasedElement, PackageableElement, Commentable {
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
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassifier_Visibility()
     * @model unique="false"
     * @generated
     */
    Visibility getVisibility();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(Visibility value);

    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Member}&lt;? extends org.eclipse.uml2.uml.NamedElement>.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Member#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassifier_Members()
     * @see de.cooperateproject.modeling.textual.cls.cls.Member#getOwner
     * @model opposite="owner" containment="true"
     * @generated
     */
    EList<Member<? extends NamedElement>> getMembers();

    /**
     * Returns the value of the '<em><b>Owning Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getClassifiers <em>Classifiers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Package</em>' container reference.
     * @see #setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassifier_OwningPackage()
     * @see de.cooperateproject.modeling.textual.cls.cls.Package#getClassifiers
     * @model opposite="classifiers" required="true" transient="false"
     * @generated
     */
    de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getOwningPackage <em>Owning Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Package</em>' container reference.
     * @see #getOwningPackage()
     * @generated
     */
    void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package value);

} // Classifier
