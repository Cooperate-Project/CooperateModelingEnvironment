/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getUsecases <em>Usecases</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends NamedElement, UMLReferencingElement<Classifier> {
    /**
     * Returns the value of the '<em><b>Usecases</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usecases</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usecases</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getSystem_Usecases()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getSystem
     * @model opposite="system" containment="true"
     * @generated
     */
    EList<UseCase> getUsecases();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getSystems <em>Systems</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(RootPackage)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getSystem_Package()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getSystems
     * @model opposite="systems" required="true" transient="false"
     * @generated
     */
    RootPackage getPackage();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(RootPackage value);

} // System
