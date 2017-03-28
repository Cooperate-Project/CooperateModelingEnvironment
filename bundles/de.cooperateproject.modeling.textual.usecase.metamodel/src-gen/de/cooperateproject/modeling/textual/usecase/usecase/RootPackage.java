/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

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
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getActors <em>Actors</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getSystems <em>Systems</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getRootPackage()
 * @model
 * @generated
 */
public interface RootPackage extends NamedElement, UMLReferencingElement<org.eclipse.uml2.uml.Package> {
    /**
     * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.usecase.usecase.Actor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actors</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getRootPackage_Actors()
     * @model containment="true"
     * @generated
     */
    EList<Actor> getActors();

    /**
     * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.usecase.usecase.System}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Systems</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getRootPackage_Systems()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.System#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<de.cooperateproject.modeling.textual.usecase.usecase.System> getSystems();

    /**
     * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.usecase.usecase.Relationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationships</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getRootPackage_Relationships()
     * @model containment="true"
     * @generated
     */
    EList<Relationship> getRelationships();

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getRootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' container reference.
     * @see #setDiagram(UseCaseDiagram)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getRootPackage_Diagram()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getRootPackage
     * @model opposite="rootPackage" required="true" transient="false"
     * @generated
     */
    UseCaseDiagram getDiagram();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getDiagram <em>Diagram</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' container reference.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(UseCaseDiagram value);

} // RootPackage
