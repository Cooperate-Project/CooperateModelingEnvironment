/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xtext Association Member End Referenced Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationMemberEndReferencedTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextAssociationMemberEndReferencedTypeImpl extends CDOObjectImpl implements XtextAssociationMemberEndReferencedType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XtextAssociationMemberEndReferencedTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> getType() {
        return (Classifier<?>)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> basicGetType() {
        return (Classifier<?>)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Classifier<?> newType) {
        eDynamicSet(ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE:
                if (resolve) return getType();
                return basicGetType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE:
                setType((Classifier<?>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE:
                setType((Classifier<?>)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE:
                return basicGetType() != null;
        }
        return super.eIsSet(featureID);
    }

} //XtextAssociationMemberEndReferencedTypeImpl
