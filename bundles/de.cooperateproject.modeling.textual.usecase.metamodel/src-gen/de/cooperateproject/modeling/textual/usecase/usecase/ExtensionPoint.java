/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtensionPoint()
 * @model
 * @generated
 */
public interface ExtensionPoint extends UMLReferencingElement<org.eclipse.uml2.uml.ExtensionPoint>, AliasedElement {
    /**
     * Returns the value of the '<em><b>Use Case</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getExtensionPoints <em>Extension Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Case</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Case</em>' container reference.
     * @see #setUseCase(UseCase)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtensionPoint_UseCase()
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getExtensionPoints
     * @model opposite="extensionPoints" required="true" transient="false"
     * @generated
     */
    UseCase getUseCase();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint#getUseCase <em>Use Case</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Case</em>' container reference.
     * @see #getUseCase()
     * @generated
     */
    void setUseCase(UseCase value);

} // ExtensionPoint
