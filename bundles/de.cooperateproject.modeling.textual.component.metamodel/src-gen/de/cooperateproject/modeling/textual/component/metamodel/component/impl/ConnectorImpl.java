/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.Port;
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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#isStatic <em>Static</em>}</li>
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
    public void unsetName() {
        eDynamicUnset(ComponentPackage.CONNECTOR__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(ComponentPackage.CONNECTOR__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
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
    public void unsetAlias() {
        eDynamicUnset(ComponentPackage.CONNECTOR__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlias() {
        return eDynamicIsSet(ComponentPackage.CONNECTOR__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
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
    public Port getLeftport() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetLeftport() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftport(Port newLeftport) {
        eDynamicSet(ComponentPackage.CONNECTOR__LEFTPORT, ComponentPackage.Literals.PORT_RELATION__LEFTPORT, newLeftport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port getRightport() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetRightport() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightport(Port newRightport) {
        eDynamicSet(ComponentPackage.CONNECTOR__RIGHTPORT, ComponentPackage.Literals.PORT_RELATION__RIGHTPORT, newRightport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic() {
        return (Boolean)eDynamicGet(ComponentPackage.CONNECTOR__STATIC, ComponentPackage.Literals.PORT_RELATION__STATIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic) {
        eDynamicSet(ComponentPackage.CONNECTOR__STATIC, ComponentPackage.Literals.PORT_RELATION__STATIC, newStatic);
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
            case ComponentPackage.CONNECTOR__STATIC:
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
                setLeftport((Port)newValue);
                return;
            case ComponentPackage.CONNECTOR__RIGHTPORT:
                setRightport((Port)newValue);
                return;
            case ComponentPackage.CONNECTOR__STATIC:
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
            case ComponentPackage.CONNECTOR__NAME:
                unsetName();
                return;
            case ComponentPackage.CONNECTOR__ALIAS:
                unsetAlias();
                return;
            case ComponentPackage.CONNECTOR__INTERFACE:
                setInterface((Interface)null);
                return;
            case ComponentPackage.CONNECTOR__LEFTPORT:
                setLeftport((Port)null);
                return;
            case ComponentPackage.CONNECTOR__RIGHTPORT:
                setRightport((Port)null);
                return;
            case ComponentPackage.CONNECTOR__STATIC:
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
            case ComponentPackage.CONNECTOR__NAME:
                return isSetName();
            case ComponentPackage.CONNECTOR__ALIAS:
                return isSetAlias();
            case ComponentPackage.CONNECTOR__INTERFACE:
                return basicGetInterface() != null;
            case ComponentPackage.CONNECTOR__LEFTPORT:
                return basicGetLeftport() != null;
            case ComponentPackage.CONNECTOR__RIGHTPORT:
                return basicGetRightport() != null;
            case ComponentPackage.CONNECTOR__STATIC:
                return isStatic() != STATIC_EDEFAULT;
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
                case ComponentPackage.CONNECTOR__STATIC: return ComponentPackage.PORT_RELATION__STATIC;
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
                case ComponentPackage.PORT_RELATION__STATIC: return ComponentPackage.CONNECTOR__STATIC;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ConnectorImpl
