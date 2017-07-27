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

import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl#getLeftclassifier <em>Leftclassifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl#getRightclassifier <em>Rightclassifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends UMLReferencingElementImpl<Generalization> implements de.cooperateproject.modeling.textual.component.metamodel.component.Generalization {
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
    protected GeneralizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.GENERALIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Generalization newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ComponentPackage.GENERALIZATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ComponentPackage.GENERALIZATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        eDynamicUnset(ComponentPackage.GENERALIZATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(ComponentPackage.GENERALIZATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(ComponentPackage.GENERALIZATION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(ComponentPackage.GENERALIZATION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAlias() {
        eDynamicUnset(ComponentPackage.GENERALIZATION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlias() {
        return eDynamicIsSet(ComponentPackage.GENERALIZATION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<Interface> getLeftclassifier() {
        return (Classifier<Interface>)eDynamicGet(ComponentPackage.GENERALIZATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<Interface> basicGetLeftclassifier() {
        return (Classifier<Interface>)eDynamicGet(ComponentPackage.GENERALIZATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftclassifier(Classifier<Interface> newLeftclassifier) {
        eDynamicSet(ComponentPackage.GENERALIZATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, newLeftclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<Interface> getRightclassifier() {
        return (Classifier<Interface>)eDynamicGet(ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<Interface> basicGetRightclassifier() {
        return (Classifier<Interface>)eDynamicGet(ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightclassifier(Classifier<Interface> newRightclassifier) {
        eDynamicSet(ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, newRightclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.GENERALIZATION__NAME:
                return getName();
            case ComponentPackage.GENERALIZATION__ALIAS:
                return getAlias();
            case ComponentPackage.GENERALIZATION__LEFTCLASSIFIER:
                if (resolve) return getLeftclassifier();
                return basicGetLeftclassifier();
            case ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER:
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
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ComponentPackage.GENERALIZATION__NAME:
                setName((String)newValue);
                return;
            case ComponentPackage.GENERALIZATION__ALIAS:
                setAlias((String)newValue);
                return;
            case ComponentPackage.GENERALIZATION__LEFTCLASSIFIER:
                setLeftclassifier((Classifier<Interface>)newValue);
                return;
            case ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER:
                setRightclassifier((Classifier<Interface>)newValue);
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
            case ComponentPackage.GENERALIZATION__NAME:
                unsetName();
                return;
            case ComponentPackage.GENERALIZATION__ALIAS:
                unsetAlias();
                return;
            case ComponentPackage.GENERALIZATION__LEFTCLASSIFIER:
                setLeftclassifier((Classifier<Interface>)null);
                return;
            case ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER:
                setRightclassifier((Classifier<Interface>)null);
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
            case ComponentPackage.GENERALIZATION__NAME:
                return isSetName();
            case ComponentPackage.GENERALIZATION__ALIAS:
                return isSetAlias();
            case ComponentPackage.GENERALIZATION__LEFTCLASSIFIER:
                return basicGetLeftclassifier() != null;
            case ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER:
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
                case ComponentPackage.GENERALIZATION__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.GENERALIZATION__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.GENERALIZATION__LEFTCLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER;
                case ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ComponentPackage.GENERALIZATION__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return ComponentPackage.GENERALIZATION__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (baseFeatureID) {
                case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER: return ComponentPackage.GENERALIZATION__LEFTCLASSIFIER;
                case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER: return ComponentPackage.GENERALIZATION__RIGHTCLASSIFIER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //GeneralizationImpl
