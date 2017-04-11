/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends BehavioredClassifier<org.eclipse.uml2.uml.UseCase>, AliasedElement {
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
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCase_Visibility()
     * @model
     * @generated
     */
    Visibility getVisibility();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(Visibility value);

    /**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #setAbstract(boolean)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCase_Abstract()
     * @model
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

    /**
     * Returns the value of the '<em><b>Extension Points</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint#getUseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension Points</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCase_ExtensionPoints()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint#getUseCase
     * @model opposite="useCase" containment="true"
     * @generated
     */
    EList<ExtensionPoint> getExtensionPoints();

    /**
     * Returns the value of the '<em><b>System</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getUsecases <em>Usecases</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System</em>' container reference.
     * @see #setSystem(de.cooperateproject.modeling.textual.usecase.usecase.System)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCase_System()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.System#getUsecases
     * @model opposite="usecases" required="true" transient="false"
     * @generated
     */
    de.cooperateproject.modeling.textual.usecase.usecase.System getSystem();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getSystem <em>System</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' container reference.
     * @see #getSystem()
     * @generated
     */
    void setSystem(de.cooperateproject.modeling.textual.usecase.usecase.System value);

} // UseCase
