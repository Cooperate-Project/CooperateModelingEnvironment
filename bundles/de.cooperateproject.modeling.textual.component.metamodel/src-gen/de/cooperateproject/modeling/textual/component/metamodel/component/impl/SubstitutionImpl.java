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

import org.eclipse.uml2.uml.Substitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstitutionImpl extends UMLReferencingElementImpl<Substitution> implements de.cooperateproject.modeling.textual.component.metamodel.component.Substitution {
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
    protected SubstitutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.SUBSTITUTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Substitution newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ComponentPackage.SUBSTITUTION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ComponentPackage.SUBSTITUTION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        eDynamicUnset(ComponentPackage.SUBSTITUTION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(ComponentPackage.SUBSTITUTION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(ComponentPackage.SUBSTITUTION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(ComponentPackage.SUBSTITUTION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAlias() {
        eDynamicUnset(ComponentPackage.SUBSTITUTION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlias() {
        return eDynamicIsSet(ComponentPackage.SUBSTITUTION__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<org.eclipse.uml2.uml.Classifier> getLeftClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<org.eclipse.uml2.uml.Classifier> basicGetLeftClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftClassifier(Classifier<org.eclipse.uml2.uml.Classifier> newLeftClassifier) {
        eDynamicSet(ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, newLeftClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<org.eclipse.uml2.uml.Classifier> getRightClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<org.eclipse.uml2.uml.Classifier> basicGetRightClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightClassifier(Classifier<org.eclipse.uml2.uml.Classifier> newRightClassifier) {
        eDynamicSet(ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, newRightClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.SUBSTITUTION__NAME:
                return getName();
            case ComponentPackage.SUBSTITUTION__ALIAS:
                return getAlias();
            case ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER:
                if (resolve) return getLeftClassifier();
                return basicGetLeftClassifier();
            case ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER:
                if (resolve) return getRightClassifier();
                return basicGetRightClassifier();
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
            case ComponentPackage.SUBSTITUTION__NAME:
                setName((String)newValue);
                return;
            case ComponentPackage.SUBSTITUTION__ALIAS:
                setAlias((String)newValue);
                return;
            case ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER:
                setLeftClassifier((Classifier<org.eclipse.uml2.uml.Classifier>)newValue);
                return;
            case ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER:
                setRightClassifier((Classifier<org.eclipse.uml2.uml.Classifier>)newValue);
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
            case ComponentPackage.SUBSTITUTION__NAME:
                unsetName();
                return;
            case ComponentPackage.SUBSTITUTION__ALIAS:
                unsetAlias();
                return;
            case ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER:
                setLeftClassifier((Classifier<org.eclipse.uml2.uml.Classifier>)null);
                return;
            case ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER:
                setRightClassifier((Classifier<org.eclipse.uml2.uml.Classifier>)null);
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
            case ComponentPackage.SUBSTITUTION__NAME:
                return isSetName();
            case ComponentPackage.SUBSTITUTION__ALIAS:
                return isSetAlias();
            case ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER:
                return basicGetLeftClassifier() != null;
            case ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER:
                return basicGetRightClassifier() != null;
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
                case ComponentPackage.SUBSTITUTION__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.SUBSTITUTION__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER;
                case ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ComponentPackage.SUBSTITUTION__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return ComponentPackage.SUBSTITUTION__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (baseFeatureID) {
                case ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER: return ComponentPackage.SUBSTITUTION__LEFT_CLASSIFIER;
                case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER: return ComponentPackage.SUBSTITUTION__RIGHT_CLASSIFIER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //SubstitutionImpl
