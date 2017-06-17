/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl;
import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl#getInterface <em>Interface</em>}</li>
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
    @SuppressWarnings("unchecked")
    public EList<Component> getPort() {
        return (EList<Component>)eDynamicGet(ComponentPackage.PORT_RELATION__PORT, ComponentPackage.Literals.PORT_RELATION__PORT, true, true);
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.PORT_RELATION__PORT:
                return getPort();
            case ComponentPackage.PORT_RELATION__INTERFACE:
                if (resolve) return getInterface();
                return basicGetInterface();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ComponentPackage.PORT_RELATION__PORT:
                getPort().clear();
                getPort().addAll((Collection<? extends Component>)newValue);
                return;
            case ComponentPackage.PORT_RELATION__INTERFACE:
                setInterface((Interface)newValue);
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
            case ComponentPackage.PORT_RELATION__PORT:
                getPort().clear();
                return;
            case ComponentPackage.PORT_RELATION__INTERFACE:
                setInterface((Interface)null);
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
            case ComponentPackage.PORT_RELATION__PORT:
                return !getPort().isEmpty();
            case ComponentPackage.PORT_RELATION__INTERFACE:
                return basicGetInterface() != null;
        }
        return super.eIsSet(featureID);
    }

} //PortRelationImpl
