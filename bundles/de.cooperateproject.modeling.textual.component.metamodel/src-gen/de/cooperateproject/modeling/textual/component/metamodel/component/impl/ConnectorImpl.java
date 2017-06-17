/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getLeftport <em>Leftport</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getRightport <em>Rightport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends UMLReferencingElementImpl<Connector> implements de.cooperateproject.modeling.textual.component.metamodel.component.Connector {
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
    protected ConnectorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.CONNECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Connector newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ComponentPackage.CONNECTOR__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ComponentPackage.CONNECTOR__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(ComponentPackage.CONNECTOR__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(ComponentPackage.CONNECTOR__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface getInterface() {
        return (Interface)eDynamicGet(ComponentPackage.CONNECTOR__INTERFACE, ComponentPackage.Literals.PORT_RELATION__INTERFACE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface basicGetInterface() {
        return (Interface)eDynamicGet(ComponentPackage.CONNECTOR__INTERFACE, ComponentPackage.Literals.PORT_RELATION__INTERFACE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterface(Interface newInterface) {
        eDynamicSet(ComponentPackage.CONNECTOR__INTERFACE, ComponentPackage.Literals.PORT_RELATION__INTERFACE, newInterface);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getLeftport() {
        return (Component)eDynamicGet(ComponentPackage.CONNECTOR__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetLeftport() {
        return (Component)eDynamicGet(ComponentPackage.CONNECTOR__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftport(Component newLeftport) {
        eDynamicSet(ComponentPackage.CONNECTOR__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, newLeftport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getRightport() {
        return (Component)eDynamicGet(ComponentPackage.CONNECTOR__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetRightport() {
        return (Component)eDynamicGet(ComponentPackage.CONNECTOR__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightport(Component newRightport) {
        eDynamicSet(ComponentPackage.CONNECTOR__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, newRightport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.CONNECTOR__NAME:
                return getName();
            case ComponentPackage.CONNECTOR__ALIAS:
                return getAlias();
            case ComponentPackage.CONNECTOR__INTERFACE:
                if (resolve) return getInterface();
                return basicGetInterface();
            case ComponentPackage.CONNECTOR__LEFTPORT:
                if (resolve) return getLeftport();
                return basicGetLeftport();
            case ComponentPackage.CONNECTOR__RIGHTPORT:
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
            case ComponentPackage.CONNECTOR__NAME:
                setName((String)newValue);
                return;
            case ComponentPackage.CONNECTOR__ALIAS:
                setAlias((String)newValue);
                return;
            case ComponentPackage.CONNECTOR__INTERFACE:
                setInterface((Interface)newValue);
                return;
            case ComponentPackage.CONNECTOR__LEFTPORT:
                setLeftport((Component)newValue);
                return;
            case ComponentPackage.CONNECTOR__RIGHTPORT:
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
            case ComponentPackage.CONNECTOR__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ComponentPackage.CONNECTOR__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case ComponentPackage.CONNECTOR__INTERFACE:
                setInterface((Interface)null);
                return;
            case ComponentPackage.CONNECTOR__LEFTPORT:
                setLeftport((Component)null);
                return;
            case ComponentPackage.CONNECTOR__RIGHTPORT:
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
            case ComponentPackage.CONNECTOR__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ComponentPackage.CONNECTOR__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case ComponentPackage.CONNECTOR__INTERFACE:
                return basicGetInterface() != null;
            case ComponentPackage.CONNECTOR__LEFTPORT:
                return basicGetLeftport() != null;
            case ComponentPackage.CONNECTOR__RIGHTPORT:
                return basicGetRightport() != null;
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
                case ComponentPackage.CONNECTOR__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.CONNECTOR__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == PortRelation.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.CONNECTOR__INTERFACE: return ComponentPackage.PORT_RELATION__INTERFACE;
                case ComponentPackage.CONNECTOR__LEFTPORT: return ComponentPackage.PORT_RELATION__LEFTPORT;
                case ComponentPackage.CONNECTOR__RIGHTPORT: return ComponentPackage.PORT_RELATION__RIGHTPORT;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ComponentPackage.CONNECTOR__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return ComponentPackage.CONNECTOR__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == PortRelation.class) {
            switch (baseFeatureID) {
                case ComponentPackage.PORT_RELATION__INTERFACE: return ComponentPackage.CONNECTOR__INTERFACE;
                case ComponentPackage.PORT_RELATION__LEFTPORT: return ComponentPackage.CONNECTOR__LEFTPORT;
                case ComponentPackage.PORT_RELATION__RIGHTPORT: return ComponentPackage.CONNECTOR__RIGHTPORT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ConnectorImpl
