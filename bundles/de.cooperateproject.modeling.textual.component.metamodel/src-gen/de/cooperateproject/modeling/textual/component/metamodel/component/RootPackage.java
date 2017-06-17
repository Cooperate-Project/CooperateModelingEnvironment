/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getRootPackage()
 * @model
 * @generated
 */
public interface RootPackage extends PackageBase<RootPackage> {
    /**
     * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relation</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getRootPackage_Relation()
     * @model containment="true"
     * @generated
     */
    EList<ClassifierRelation> getRelation();

    /**
     * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.metamodel.component.Classifier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getRootPackage_Classifier()
     * @model containment="true"
     * @generated
     */
    EList<Classifier> getClassifier();

} // RootPackage
