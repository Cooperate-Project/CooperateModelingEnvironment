/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.impl;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram;
import de.cooperateproject.modeling.textual.cmp.cmp.RootPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentDiagramImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ComponentDiagramImpl#getRootpackage <em>Rootpackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDiagramImpl extends CDOObjectImpl implements ComponentDiagram {
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
    protected ComponentDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmpPackage.Literals.COMPONENT_DIAGRAM;
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
    public String getTitle() {
        return (String)eDynamicGet(CmpPackage.COMPONENT_DIAGRAM__TITLE, CmpPackage.Literals.COMPONENT_DIAGRAM__TITLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        eDynamicSet(CmpPackage.COMPONENT_DIAGRAM__TITLE, CmpPackage.Literals.COMPONENT_DIAGRAM__TITLE, newTitle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootPackage getRootpackage() {
        return (RootPackage)eDynamicGet(CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE, CmpPackage.Literals.COMPONENT_DIAGRAM__ROOTPACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootpackage(RootPackage newRootpackage, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newRootpackage, CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootpackage(RootPackage newRootpackage) {
        eDynamicSet(CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE, CmpPackage.Literals.COMPONENT_DIAGRAM__ROOTPACKAGE, newRootpackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE:
                return basicSetRootpackage(null, msgs);
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
            case CmpPackage.COMPONENT_DIAGRAM__TITLE:
                return getTitle();
            case CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE:
                return getRootpackage();
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
            case CmpPackage.COMPONENT_DIAGRAM__TITLE:
                setTitle((String)newValue);
                return;
            case CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE:
                setRootpackage((RootPackage)newValue);
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
            case CmpPackage.COMPONENT_DIAGRAM__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE:
                setRootpackage((RootPackage)null);
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
            case CmpPackage.COMPONENT_DIAGRAM__TITLE:
                return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
            case CmpPackage.COMPONENT_DIAGRAM__ROOTPACKAGE:
                return getRootpackage() != null;
        }
        return super.eIsSet(featureID);
    }

} //ComponentDiagramImpl
