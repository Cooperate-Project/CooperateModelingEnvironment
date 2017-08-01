/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.Port;
import de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getPortRelation <em>Port Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getInterfaceRelation <em>Interface Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getOwningComponent <em>Owning Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ClassifierImpl<Component> implements de.cooperateproject.modeling.textual.component.metamodel.component.Component {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<de.cooperateproject.modeling.textual.component.metamodel.component.Component> getComponent() {
        return (EList<de.cooperateproject.modeling.textual.component.metamodel.component.Component>)eDynamicGet(ComponentPackage.COMPONENT__COMPONENT, ComponentPackage.Literals.COMPONENT__COMPONENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<PortRelation> getPortRelation() {
        return (EList<PortRelation>)eDynamicGet(ComponentPackage.COMPONENT__PORT_RELATION, ComponentPackage.Literals.COMPONENT__PORT_RELATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<InterfaceRelation> getInterfaceRelation() {
        return (EList<InterfaceRelation>)eDynamicGet(ComponentPackage.COMPONENT__INTERFACE_RELATION, ComponentPackage.Literals.COMPONENT__INTERFACE_RELATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Port> getPort() {
        return (EList<Port>)eDynamicGet(ComponentPackage.COMPONENT__PORT, ComponentPackage.Literals.COMPONENT__PORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.component.metamodel.component.Component getOwningComponent() {
        return (de.cooperateproject.modeling.textual.component.metamodel.component.Component)eDynamicGet(ComponentPackage.COMPONENT__OWNING_COMPONENT, ComponentPackage.Literals.COMPONENT__OWNING_COMPONENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningComponent(de.cooperateproject.modeling.textual.component.metamodel.component.Component newOwningComponent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningComponent, ComponentPackage.COMPONENT__OWNING_COMPONENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningComponent(de.cooperateproject.modeling.textual.component.metamodel.component.Component newOwningComponent) {
        eDynamicSet(ComponentPackage.COMPONENT__OWNING_COMPONENT, ComponentPackage.Literals.COMPONENT__OWNING_COMPONENT, newOwningComponent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.COMPONENT__COMPONENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningComponent((de.cooperateproject.modeling.textual.component.metamodel.component.Component)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Interface> getNestedInterface() {
        return (EList<Interface>)eDynamicGet(ComponentPackage.COMPONENT__NESTED_INTERFACE, ComponentPackage.Literals.COMPONENT__NESTED_INTERFACE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.COMPONENT__COMPONENT:
                return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__PORT_RELATION:
                return ((InternalEList<?>)getPortRelation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__INTERFACE_RELATION:
                return ((InternalEList<?>)getInterfaceRelation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__NESTED_INTERFACE:
                return ((InternalEList<?>)getNestedInterface()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__PORT:
                return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                return basicSetOwningComponent(null, msgs);
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
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                return eInternalContainer().eInverseRemove(this, ComponentPackage.COMPONENT__COMPONENT, de.cooperateproject.modeling.textual.component.metamodel.component.Component.class, msgs);
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
            case ComponentPackage.COMPONENT__COMPONENT:
                return getComponent();
            case ComponentPackage.COMPONENT__PORT_RELATION:
                return getPortRelation();
            case ComponentPackage.COMPONENT__INTERFACE_RELATION:
                return getInterfaceRelation();
            case ComponentPackage.COMPONENT__NESTED_INTERFACE:
                return getNestedInterface();
            case ComponentPackage.COMPONENT__PORT:
                return getPort();
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                return getOwningComponent();
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
            case ComponentPackage.COMPONENT__COMPONENT:
                getComponent().clear();
                getComponent().addAll((Collection<? extends de.cooperateproject.modeling.textual.component.metamodel.component.Component>)newValue);
                return;
            case ComponentPackage.COMPONENT__PORT_RELATION:
                getPortRelation().clear();
                getPortRelation().addAll((Collection<? extends PortRelation>)newValue);
                return;
            case ComponentPackage.COMPONENT__INTERFACE_RELATION:
                getInterfaceRelation().clear();
                getInterfaceRelation().addAll((Collection<? extends InterfaceRelation>)newValue);
                return;
            case ComponentPackage.COMPONENT__NESTED_INTERFACE:
                getNestedInterface().clear();
                getNestedInterface().addAll((Collection<? extends Interface>)newValue);
                return;
            case ComponentPackage.COMPONENT__PORT:
                getPort().clear();
                getPort().addAll((Collection<? extends Port>)newValue);
                return;
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                setOwningComponent((de.cooperateproject.modeling.textual.component.metamodel.component.Component)newValue);
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
            case ComponentPackage.COMPONENT__COMPONENT:
                getComponent().clear();
                return;
            case ComponentPackage.COMPONENT__PORT_RELATION:
                getPortRelation().clear();
                return;
            case ComponentPackage.COMPONENT__INTERFACE_RELATION:
                getInterfaceRelation().clear();
                return;
            case ComponentPackage.COMPONENT__NESTED_INTERFACE:
                getNestedInterface().clear();
                return;
            case ComponentPackage.COMPONENT__PORT:
                getPort().clear();
                return;
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                setOwningComponent((de.cooperateproject.modeling.textual.component.metamodel.component.Component)null);
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
            case ComponentPackage.COMPONENT__COMPONENT:
                return !getComponent().isEmpty();
            case ComponentPackage.COMPONENT__PORT_RELATION:
                return !getPortRelation().isEmpty();
            case ComponentPackage.COMPONENT__INTERFACE_RELATION:
                return !getInterfaceRelation().isEmpty();
            case ComponentPackage.COMPONENT__NESTED_INTERFACE:
                return !getNestedInterface().isEmpty();
            case ComponentPackage.COMPONENT__PORT:
                return !getPort().isEmpty();
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                return getOwningComponent() != null;
        }
        return super.eIsSet(featureID);
    }

} //ComponentImpl
