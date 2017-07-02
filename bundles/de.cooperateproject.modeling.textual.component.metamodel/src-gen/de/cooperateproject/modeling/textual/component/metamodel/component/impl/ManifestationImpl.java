/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier;
import de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Manifestation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl#getLeftclassifier <em>Leftclassifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl#getRightclassifier <em>Rightclassifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestationImpl extends UMLReferencingElementImpl<Manifestation> implements de.cooperateproject.modeling.textual.component.metamodel.component.Manifestation {
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
    protected ManifestationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.MANIFESTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Manifestation newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ComponentPackage.MANIFESTATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ComponentPackage.MANIFESTATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(ComponentPackage.MANIFESTATION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(ComponentPackage.MANIFESTATION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getLeftclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.MANIFESTATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetLeftclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.MANIFESTATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftclassifier(Classifier newLeftclassifier) {
        eDynamicSet(ComponentPackage.MANIFESTATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, newLeftclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getRightclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetRightclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightclassifier(Classifier newRightclassifier) {
        eDynamicSet(ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, newRightclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.MANIFESTATION__NAME:
                return getName();
            case ComponentPackage.MANIFESTATION__ALIAS:
                return getAlias();
            case ComponentPackage.MANIFESTATION__LEFTCLASSIFIER:
                if (resolve) return getLeftclassifier();
                return basicGetLeftclassifier();
            case ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER:
                if (resolve) return getRightclassifier();
                return basicGetRightclassifier();
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
            case ComponentPackage.MANIFESTATION__NAME:
                setName((String)newValue);
                return;
            case ComponentPackage.MANIFESTATION__ALIAS:
                setAlias((String)newValue);
                return;
            case ComponentPackage.MANIFESTATION__LEFTCLASSIFIER:
                setLeftclassifier((Classifier)newValue);
                return;
            case ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER:
                setRightclassifier((Classifier)newValue);
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
            case ComponentPackage.MANIFESTATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ComponentPackage.MANIFESTATION__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case ComponentPackage.MANIFESTATION__LEFTCLASSIFIER:
                setLeftclassifier((Classifier)null);
                return;
            case ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER:
                setRightclassifier((Classifier)null);
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
            case ComponentPackage.MANIFESTATION__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ComponentPackage.MANIFESTATION__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case ComponentPackage.MANIFESTATION__LEFTCLASSIFIER:
                return basicGetLeftclassifier() != null;
            case ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER:
                return basicGetRightclassifier() != null;
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
                case ComponentPackage.MANIFESTATION__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.MANIFESTATION__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.MANIFESTATION__LEFTCLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER;
                case ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ComponentPackage.MANIFESTATION__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return ComponentPackage.MANIFESTATION__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (baseFeatureID) {
                case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER: return ComponentPackage.MANIFESTATION__LEFTCLASSIFIER;
                case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER: return ComponentPackage.MANIFESTATION__RIGHTCLASSIFIER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ManifestationImpl
