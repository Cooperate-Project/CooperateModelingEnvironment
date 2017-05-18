/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.uml.ExtensionPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionPointImpl extends UMLReferencingElementImpl<ExtensionPoint> implements de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint {
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
    protected ExtensionPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsecasePackage.Literals.EXTENSION_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(ExtensionPoint newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(UsecasePackage.EXTENSION_POINT__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(UsecasePackage.EXTENSION_POINT__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(UsecasePackage.EXTENSION_POINT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(UsecasePackage.EXTENSION_POINT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getUseCase() {
        return (UseCase)eDynamicGet(UsecasePackage.EXTENSION_POINT__USE_CASE, UsecasePackage.Literals.EXTENSION_POINT__USE_CASE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUseCase(UseCase newUseCase, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newUseCase, UsecasePackage.EXTENSION_POINT__USE_CASE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseCase(UseCase newUseCase) {
        eDynamicSet(UsecasePackage.EXTENSION_POINT__USE_CASE, UsecasePackage.Literals.EXTENSION_POINT__USE_CASE, newUseCase);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetUseCase((UseCase)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                return basicSetUseCase(null, msgs);
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
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                return eInternalContainer().eInverseRemove(this, UsecasePackage.USE_CASE__EXTENSION_POINTS, UseCase.class, msgs);
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
            case UsecasePackage.EXTENSION_POINT__NAME:
                return getName();
            case UsecasePackage.EXTENSION_POINT__ALIAS:
                return getAlias();
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                return getUseCase();
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
            case UsecasePackage.EXTENSION_POINT__NAME:
                setName((String)newValue);
                return;
            case UsecasePackage.EXTENSION_POINT__ALIAS:
                setAlias((String)newValue);
                return;
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                setUseCase((UseCase)newValue);
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
            case UsecasePackage.EXTENSION_POINT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UsecasePackage.EXTENSION_POINT__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                setUseCase((UseCase)null);
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
            case UsecasePackage.EXTENSION_POINT__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case UsecasePackage.EXTENSION_POINT__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case UsecasePackage.EXTENSION_POINT__USE_CASE:
                return getUseCase() != null;
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
                case UsecasePackage.EXTENSION_POINT__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.EXTENSION_POINT__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return UsecasePackage.EXTENSION_POINT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return UsecasePackage.EXTENSION_POINT__ALIAS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ExtensionPointImpl
