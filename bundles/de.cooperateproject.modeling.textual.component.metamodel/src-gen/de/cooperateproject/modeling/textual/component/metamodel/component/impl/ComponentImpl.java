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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getPortrelation <em>Portrelation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getInterfacerelation <em>Interfacerelation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getInterface <em>Interface</em>}</li>
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
    public EList<PortRelation> getPortrelation() {
        return (EList<PortRelation>)eDynamicGet(ComponentPackage.COMPONENT__PORTRELATION, ComponentPackage.Literals.COMPONENT__PORTRELATION, true, true);
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
    public EList<InterfaceRelation> getInterfacerelation() {
        return (EList<InterfaceRelation>)eDynamicGet(ComponentPackage.COMPONENT__INTERFACERELATION, ComponentPackage.Literals.COMPONENT__INTERFACERELATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Interface> getInterface() {
        return (EList<Interface>)eDynamicGet(ComponentPackage.COMPONENT__INTERFACE, ComponentPackage.Literals.COMPONENT__INTERFACE, true, true);
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
            case ComponentPackage.COMPONENT__PORTRELATION:
                return ((InternalEList<?>)getPortrelation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                return ((InternalEList<?>)getInterfacerelation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__INTERFACE:
                return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.COMPONENT__PORTRELATION:
                return getPortrelation();
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                return getInterfacerelation();
            case ComponentPackage.COMPONENT__INTERFACE:
                return getInterface();
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
            case ComponentPackage.COMPONENT__PORTRELATION:
                getPortrelation().clear();
                getPortrelation().addAll((Collection<? extends PortRelation>)newValue);
                return;
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                getInterfacerelation().clear();
                getInterfacerelation().addAll((Collection<? extends InterfaceRelation>)newValue);
                return;
            case ComponentPackage.COMPONENT__INTERFACE:
                getInterface().clear();
                getInterface().addAll((Collection<? extends Interface>)newValue);
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
            case ComponentPackage.COMPONENT__PORTRELATION:
                getPortrelation().clear();
                return;
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                getInterfacerelation().clear();
                return;
            case ComponentPackage.COMPONENT__INTERFACE:
                getInterface().clear();
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
            case ComponentPackage.COMPONENT__PORTRELATION:
                return !getPortrelation().isEmpty();
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                return !getInterfacerelation().isEmpty();
            case ComponentPackage.COMPONENT__INTERFACE:
                return !getInterface().isEmpty();
            case ComponentPackage.COMPONENT__PORT:
                return !getPort().isEmpty();
            case ComponentPackage.COMPONENT__OWNING_COMPONENT:
                return getOwningComponent() != null;
        }
        return super.eIsSet(featureID);
    }

} //ComponentImpl
