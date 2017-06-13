/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Member;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl<T extends Feature> extends PropertyImpl<T> implements Member<T> {
    /**
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.MEMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> getOwner() {
        return (Classifier<?>)eDynamicGet(ClsPackage.MEMBER__OWNER, ClsPackage.Literals.MEMBER__OWNER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic() {
        return (Boolean)eDynamicGet(ClsPackage.MEMBER__STATIC, ClsPackage.Literals.MEMBER__STATIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic) {
        eDynamicSet(ClsPackage.MEMBER__STATIC, ClsPackage.Literals.MEMBER__STATIC, newStatic);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStatic() {
        eDynamicUnset(ClsPackage.MEMBER__STATIC, ClsPackage.Literals.MEMBER__STATIC);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStatic() {
        return eDynamicIsSet(ClsPackage.MEMBER__STATIC, ClsPackage.Literals.MEMBER__STATIC);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.MEMBER__OWNER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return eBasicSetContainer(otherEnd, ClsPackage.MEMBER__OWNER, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.MEMBER__OWNER:
                return eBasicSetContainer(null, ClsPackage.MEMBER__OWNER, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ClsPackage.MEMBER__OWNER:
                return eInternalContainer().eInverseRemove(this, ClsPackage.CLASSIFIER__MEMBERS, Classifier.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClsPackage.MEMBER__OWNER:
                return getOwner();
            case ClsPackage.MEMBER__STATIC:
                return isStatic();
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
            case ClsPackage.MEMBER__STATIC:
                setStatic((Boolean)newValue);
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
            case ClsPackage.MEMBER__STATIC:
                unsetStatic();
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
            case ClsPackage.MEMBER__OWNER:
                return getOwner() != null;
            case ClsPackage.MEMBER__STATIC:
                return isSetStatic();
        }
        return super.eIsSet(featureID);
    }

} //MemberImpl
