/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getOuterPort <em>Outer Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl#getInnerPort <em>Inner Port</em>}</li>
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
    public Port getOuterPort() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__OUTER_PORT, ComponentPackage.Literals.PORT_RELATION__OUTER_PORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetOuterPort() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__OUTER_PORT, ComponentPackage.Literals.PORT_RELATION__OUTER_PORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOuterPort(Port newOuterPort) {
        eDynamicSet(ComponentPackage.CONNECTOR__OUTER_PORT, ComponentPackage.Literals.PORT_RELATION__OUTER_PORT, newOuterPort);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port getInnerPort() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__INNER_PORT, ComponentPackage.Literals.PORT_RELATION__INNER_PORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetInnerPort() {
        return (Port)eDynamicGet(ComponentPackage.CONNECTOR__INNER_PORT, ComponentPackage.Literals.PORT_RELATION__INNER_PORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInnerPort(Port newInnerPort) {
        eDynamicSet(ComponentPackage.CONNECTOR__INNER_PORT, ComponentPackage.Literals.PORT_RELATION__INNER_PORT, newInnerPort);
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
            case ComponentPackage.CONNECTOR__OUTER_PORT:
                if (resolve) return getOuterPort();
                return basicGetOuterPort();
            case ComponentPackage.CONNECTOR__INNER_PORT:
                if (resolve) return getInnerPort();
                return basicGetInnerPort();
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
            case ComponentPackage.CONNECTOR__OUTER_PORT:
                setOuterPort((Port)newValue);
                return;
            case ComponentPackage.CONNECTOR__INNER_PORT:
                setInnerPort((Port)newValue);
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
            case ComponentPackage.CONNECTOR__OUTER_PORT:
                setOuterPort((Port)null);
                return;
            case ComponentPackage.CONNECTOR__INNER_PORT:
                setInnerPort((Port)null);
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
            case ComponentPackage.CONNECTOR__OUTER_PORT:
                return basicGetOuterPort() != null;
            case ComponentPackage.CONNECTOR__INNER_PORT:
                return basicGetInnerPort() != null;
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
                case ComponentPackage.CONNECTOR__OUTER_PORT: return ComponentPackage.PORT_RELATION__OUTER_PORT;
                case ComponentPackage.CONNECTOR__INNER_PORT: return ComponentPackage.PORT_RELATION__INNER_PORT;
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
                case ComponentPackage.PORT_RELATION__OUTER_PORT: return ComponentPackage.CONNECTOR__OUTER_PORT;
                case ComponentPackage.PORT_RELATION__INNER_PORT: return ComponentPackage.CONNECTOR__INNER_PORT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ConnectorImpl
