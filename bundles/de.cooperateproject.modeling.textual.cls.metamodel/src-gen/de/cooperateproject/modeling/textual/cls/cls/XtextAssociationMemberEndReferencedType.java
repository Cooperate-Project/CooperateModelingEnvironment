/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Association Member End Referenced Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociationMemberEndReferencedType()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface XtextAssociationMemberEndReferencedType extends CDOObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Classifier)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociationMemberEndReferencedType_Type()
     * @model required="true"
     * @generated
     */
    Classifier<?> getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Classifier<?> value);

} // XtextAssociationMemberEndReferencedType
