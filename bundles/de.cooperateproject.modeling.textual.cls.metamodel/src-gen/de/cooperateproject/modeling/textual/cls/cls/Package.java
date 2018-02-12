/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageBase<Package>, PackageableElement, Commentable<org.eclipse.uml2.uml.Package> {
    /**
     * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Classifier}<code>&lt;? extends org.eclipse.uml2.uml.Classifier&gt;</code>.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getOwningPackage <em>Owning Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifiers</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_Classifiers()
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier#getOwningPackage
     * @model opposite="owningPackage" containment="true"
     * @generated
     */
    EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getClassifiers();

    /**
     * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Connector}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Connector#getOwningPackage <em>Owning Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectors</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_Connectors()
     * @see de.cooperateproject.modeling.textual.cls.cls.Connector#getOwningPackage
     * @model opposite="owningPackage" containment="true"
     * @generated
     */
    EList<Connector> getConnectors();

} // Package
