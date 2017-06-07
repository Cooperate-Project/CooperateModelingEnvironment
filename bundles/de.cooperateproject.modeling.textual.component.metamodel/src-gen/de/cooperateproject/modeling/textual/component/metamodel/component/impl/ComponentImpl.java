/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentableImpl;

import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation;
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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getInterfacerelation <em>Interfacerelation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends CommentableImpl<Component> implements de.cooperateproject.modeling.textual.component.metamodel.component.Component {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_EDEFAULT = null;

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
    public String getName() {
        return (String)eDynamicGet(ComponentPackage.COMPONENT__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ComponentPackage.COMPONENT__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(ComponentPackage.COMPONENT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(ComponentPackage.COMPONENT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
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
    public EList<PortRelation> getPort() {
        return (EList<PortRelation>)eDynamicGet(ComponentPackage.COMPONENT__PORT, ComponentPackage.Literals.COMPONENT__PORT, true, true);
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
            case ComponentPackage.COMPONENT__PORT:
                return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                return ((InternalEList<?>)getInterfacerelation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.COMPONENT__INTERFACE:
                return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.COMPONENT__NAME:
                return getName();
            case ComponentPackage.COMPONENT__ALIAS:
                return getAlias();
            case ComponentPackage.COMPONENT__COMPONENT:
                return getComponent();
            case ComponentPackage.COMPONENT__PORT:
                return getPort();
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                return getInterfacerelation();
            case ComponentPackage.COMPONENT__INTERFACE:
                return getInterface();
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
            case ComponentPackage.COMPONENT__NAME:
                setName((String)newValue);
                return;
            case ComponentPackage.COMPONENT__ALIAS:
                setAlias((String)newValue);
                return;
            case ComponentPackage.COMPONENT__COMPONENT:
                getComponent().clear();
                getComponent().addAll((Collection<? extends de.cooperateproject.modeling.textual.component.metamodel.component.Component>)newValue);
                return;
            case ComponentPackage.COMPONENT__PORT:
                getPort().clear();
                getPort().addAll((Collection<? extends PortRelation>)newValue);
                return;
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                getInterfacerelation().clear();
                getInterfacerelation().addAll((Collection<? extends InterfaceRelation>)newValue);
                return;
            case ComponentPackage.COMPONENT__INTERFACE:
                getInterface().clear();
                getInterface().addAll((Collection<? extends Interface>)newValue);
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
            case ComponentPackage.COMPONENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ComponentPackage.COMPONENT__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case ComponentPackage.COMPONENT__COMPONENT:
                getComponent().clear();
                return;
            case ComponentPackage.COMPONENT__PORT:
                getPort().clear();
                return;
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                getInterfacerelation().clear();
                return;
            case ComponentPackage.COMPONENT__INTERFACE:
                getInterface().clear();
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
            case ComponentPackage.COMPONENT__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ComponentPackage.COMPONENT__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case ComponentPackage.COMPONENT__COMPONENT:
                return !getComponent().isEmpty();
            case ComponentPackage.COMPONENT__PORT:
                return !getPort().isEmpty();
            case ComponentPackage.COMPONENT__INTERFACERELATION:
                return !getInterfacerelation().isEmpty();
            case ComponentPackage.COMPONENT__INTERFACE:
                return !getInterface().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.COMPONENT__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.COMPONENT__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ComponentPackage.COMPONENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return ComponentPackage.COMPONENT__ALIAS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ComponentImpl
