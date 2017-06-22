/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Extend> {
    /**
     * Returns the value of the '<em><b>Extension</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' reference.
     * @see #setExtension(UseCase)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_Extension()
     * @model required="true" transient="true"
     * @generated
     */
    UseCase getExtension();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtension <em>Extension</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' reference.
     * @see #getExtension()
     * @generated
     */
    void setExtension(UseCase value);

    /**
     * Returns the value of the '<em><b>Extended Case</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extended Case</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extended Case</em>' reference.
     * @see #setExtendedCase(UseCase)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_ExtendedCase()
     * @model required="true" transient="true"
     * @generated
     */
    UseCase getExtendedCase();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtendedCase <em>Extended Case</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extended Case</em>' reference.
     * @see #getExtendedCase()
     * @generated
     */
    void setExtendedCase(UseCase value);

    /**
     * Returns the value of the '<em><b>Extension Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension Location</em>' reference.
     * @see #setExtensionLocation(ExtensionPoint)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_ExtensionLocation()
     * @model required="true" transient="true"
     * @generated
     */
    ExtensionPoint getExtensionLocation();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtensionLocation <em>Extension Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension Location</em>' reference.
     * @see #getExtensionLocation()
     * @generated
     */
    void setExtensionLocation(ExtensionPoint value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' attribute.
     * @see #setCondition(String)
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_Condition()
     * @model transient="true"
     * @generated
     */
    String getCondition();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getCondition <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' attribute.
     * @see #getCondition()
     * @generated
     */
    void setCondition(String value);

} // Extend
