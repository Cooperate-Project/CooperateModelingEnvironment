/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.Port;
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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortRelationImpl extends AliasedElementImpl implements PortRelation {
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
    public Port getLeftport() {
        return (Port)eDynamicGet(ComponentPackage.PORT_RELATION__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetLeftport() {
        return (Port)eDynamicGet(ComponentPackage.PORT_RELATION__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftport(Port newLeftport) {
        eDynamicSet(ComponentPackage.PORT_RELATION__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, newLeftport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port getRightport() {
        return (Port)eDynamicGet(ComponentPackage.PORT_RELATION__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetRightport() {
        return (Port)eDynamicGet(ComponentPackage.PORT_RELATION__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightport(Port newRightport) {
        eDynamicSet(ComponentPackage.PORT_RELATION__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, newRightport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic() {
        return (Boolean)eDynamicGet(ComponentPackage.PORT_RELATION__STATIC, ComponentPackage.Literals.PORT_RELATION__STATIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic) {
        eDynamicSet(ComponentPackage.PORT_RELATION__STATIC, ComponentPackage.Literals.PORT_RELATION__STATIC, newStatic);
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
            case ComponentPackage.PORT_RELATION__STATIC:
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
            case ComponentPackage.PORT_RELATION__INTERFACE:
                setInterface((Interface)newValue);
                return;
            case ComponentPackage.PORT_RELATION__LEFTPORT:
                setLeftport((Port)newValue);
                return;
            case ComponentPackage.PORT_RELATION__RIGHTPORT:
                setRightport((Port)newValue);
                return;
            case ComponentPackage.PORT_RELATION__STATIC:
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
            case ComponentPackage.PORT_RELATION__INTERFACE:
                setInterface((Interface)null);
                return;
            case ComponentPackage.PORT_RELATION__LEFTPORT:
                setLeftport((Port)null);
                return;
            case ComponentPackage.PORT_RELATION__RIGHTPORT:
                setRightport((Port)null);
                return;
            case ComponentPackage.PORT_RELATION__STATIC:
                setStatic(STATIC_EDEFAULT);
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
            case ComponentPackage.PORT_RELATION__STATIC:
                return isStatic() != STATIC_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //PortRelationImpl
