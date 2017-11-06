/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

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
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.RootPackage#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.RootPackage#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getRootPackage()
 * @model
 * @generated
 */
public interface RootPackage extends PackageBase<RootPackage> {
    /**
     * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation}<code>&lt;?, ?&gt;</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relations</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getRootPackage_Relations()
     * @model containment="true"
     * @generated
     */
    EList<ClassifierRelation<?, ?>> getRelations();

    /**
     * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.component.cmp.Classifier}<code>&lt;org.eclipse.uml2.uml.Classifier&gt;</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifiers</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getRootPackage_Classifiers()
     * @model containment="true"
     * @generated
     */
    EList<Classifier<org.eclipse.uml2.uml.Classifier>> getClassifiers();

} // RootPackage
