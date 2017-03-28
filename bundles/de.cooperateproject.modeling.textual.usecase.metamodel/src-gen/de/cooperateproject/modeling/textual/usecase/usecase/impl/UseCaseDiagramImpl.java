/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseDiagramImpl#getRootPackage <em>Root Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseDiagramImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseDiagramImpl extends CDOObjectImpl implements UseCaseDiagram {
    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UseCaseDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsecasePackage.Literals.USE_CASE_DIAGRAM;
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
    public RootPackage getRootPackage() {
        return (RootPackage)eDynamicGet(UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE, UsecasePackage.Literals.USE_CASE_DIAGRAM__ROOT_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootPackage(RootPackage newRootPackage, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newRootPackage, UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootPackage(RootPackage newRootPackage) {
        eDynamicSet(UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE, UsecasePackage.Literals.USE_CASE_DIAGRAM__ROOT_PACKAGE, newRootPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return (String)eDynamicGet(UsecasePackage.USE_CASE_DIAGRAM__TITLE, UsecasePackage.Literals.USE_CASE_DIAGRAM__TITLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        eDynamicSet(UsecasePackage.USE_CASE_DIAGRAM__TITLE, UsecasePackage.Literals.USE_CASE_DIAGRAM__TITLE, newTitle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE:
                RootPackage rootPackage = getRootPackage();
                if (rootPackage != null)
                    msgs = ((InternalEObject)rootPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE, null, msgs);
                return basicSetRootPackage((RootPackage)otherEnd, msgs);
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
            case UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE:
                return basicSetRootPackage(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE:
                return getRootPackage();
            case UsecasePackage.USE_CASE_DIAGRAM__TITLE:
                return getTitle();
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
            case UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE:
                setRootPackage((RootPackage)newValue);
                return;
            case UsecasePackage.USE_CASE_DIAGRAM__TITLE:
                setTitle((String)newValue);
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
            case UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE:
                setRootPackage((RootPackage)null);
                return;
            case UsecasePackage.USE_CASE_DIAGRAM__TITLE:
                setTitle(TITLE_EDEFAULT);
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
            case UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE:
                return getRootPackage() != null;
            case UsecasePackage.USE_CASE_DIAGRAM__TITLE:
                return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
        }
        return super.eIsSet(featureID);
    }

} //UseCaseDiagramImpl
