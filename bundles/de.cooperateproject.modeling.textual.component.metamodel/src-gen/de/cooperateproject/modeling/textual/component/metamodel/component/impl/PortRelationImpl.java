/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl;

import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl#getLeftport <em>Leftport</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl#getRightport <em>Rightport</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortRelationImpl extends AliasedElementImpl implements PortRelation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PortRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.PORT_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface getInterface() {
        return (Interface)eDynamicGet(ComponentPackage.PORT_RELATION__INTERFACE, ComponentPackage.Literals.PORT_RELATION__INTERFACE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface basicGetInterface() {
        return (Interface)eDynamicGet(ComponentPackage.PORT_RELATION__INTERFACE, ComponentPackage.Literals.PORT_RELATION__INTERFACE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterface(Interface newInterface) {
        eDynamicSet(ComponentPackage.PORT_RELATION__INTERFACE, ComponentPackage.Literals.PORT_RELATION__INTERFACE, newInterface);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getLeftport() {
        return (Component)eDynamicGet(ComponentPackage.PORT_RELATION__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetLeftport() {
        return (Component)eDynamicGet(ComponentPackage.PORT_RELATION__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftport(Component newLeftport) {
        eDynamicSet(ComponentPackage.PORT_RELATION__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, newLeftport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getRightport() {
        return (Component)eDynamicGet(ComponentPackage.PORT_RELATION__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetRightport() {
        return (Component)eDynamicGet(ComponentPackage.PORT_RELATION__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightport(Component newRightport) {
        eDynamicSet(ComponentPackage.PORT_RELATION__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, newRightport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.PORT_RELATION__INTERFACE:
                if (resolve) return getInterface();
                return basicGetInterface();
            case ComponentPackage.PORT_RELATION__LEFTPORT:
                if (resolve) return getLeftport();
                return basicGetLeftport();
            case ComponentPackage.PORT_RELATION__RIGHTPORT:
                if (resolve) return getRightport();
                return basicGetRightport();
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
            case ComponentPackage.PORT_RELATION__INTERFACE:
                setInterface((Interface)newValue);
                return;
            case ComponentPackage.PORT_RELATION__LEFTPORT:
                setLeftport((Component)newValue);
                return;
            case ComponentPackage.PORT_RELATION__RIGHTPORT:
                setRightport((Component)newValue);
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
            case ComponentPackage.PORT_RELATION__INTERFACE:
                setInterface((Interface)null);
                return;
            case ComponentPackage.PORT_RELATION__LEFTPORT:
                setLeftport((Component)null);
                return;
            case ComponentPackage.PORT_RELATION__RIGHTPORT:
                setRightport((Component)null);
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
            case ComponentPackage.PORT_RELATION__INTERFACE:
                return basicGetInterface() != null;
            case ComponentPackage.PORT_RELATION__LEFTPORT:
                return basicGetLeftport() != null;
            case ComponentPackage.PORT_RELATION__RIGHTPORT:
                return basicGetRightport() != null;
        }
        return super.eIsSet(featureID);
    }

} //PortRelationImpl
