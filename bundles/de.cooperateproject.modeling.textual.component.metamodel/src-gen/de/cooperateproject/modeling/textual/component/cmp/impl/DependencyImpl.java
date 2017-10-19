/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.DependencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.DependencyImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.DependencyImpl#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.DependencyImpl#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends UMLReferencingElementImpl<Dependency> implements de.cooperateproject.modeling.textual.component.cmp.Dependency {
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
    protected DependencyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmpPackage.Literals.DEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Dependency newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(CmpPackage.DEPENDENCY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(CmpPackage.DEPENDENCY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        eDynamicUnset(CmpPackage.DEPENDENCY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(CmpPackage.DEPENDENCY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(CmpPackage.DEPENDENCY__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(CmpPackage.DEPENDENCY__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAlias() {
        eDynamicUnset(CmpPackage.DEPENDENCY__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlias() {
        return eDynamicIsSet(CmpPackage.DEPENDENCY__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<org.eclipse.uml2.uml.Classifier> getLeftClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(CmpPackage.DEPENDENCY__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<org.eclipse.uml2.uml.Classifier> basicGetLeftClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(CmpPackage.DEPENDENCY__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftClassifier(Classifier<org.eclipse.uml2.uml.Classifier> newLeftClassifier) {
        eDynamicSet(CmpPackage.DEPENDENCY__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, newLeftClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<org.eclipse.uml2.uml.Classifier> getRightClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<org.eclipse.uml2.uml.Classifier> basicGetRightClassifier() {
        return (Classifier<org.eclipse.uml2.uml.Classifier>)eDynamicGet(CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightClassifier(Classifier<org.eclipse.uml2.uml.Classifier> newRightClassifier) {
        eDynamicSet(CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, newRightClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.DEPENDENCY__NAME:
                return getName();
            case CmpPackage.DEPENDENCY__ALIAS:
                return getAlias();
            case CmpPackage.DEPENDENCY__LEFT_CLASSIFIER:
                if (resolve) return getLeftClassifier();
                return basicGetLeftClassifier();
            case CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER:
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
            case CmpPackage.DEPENDENCY__NAME:
                setName((String)newValue);
                return;
            case CmpPackage.DEPENDENCY__ALIAS:
                setAlias((String)newValue);
                return;
            case CmpPackage.DEPENDENCY__LEFT_CLASSIFIER:
                setLeftClassifier((Classifier<org.eclipse.uml2.uml.Classifier>)newValue);
                return;
            case CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER:
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
            case CmpPackage.DEPENDENCY__NAME:
                unsetName();
                return;
            case CmpPackage.DEPENDENCY__ALIAS:
                unsetAlias();
                return;
            case CmpPackage.DEPENDENCY__LEFT_CLASSIFIER:
                setLeftClassifier((Classifier<org.eclipse.uml2.uml.Classifier>)null);
                return;
            case CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER:
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
            case CmpPackage.DEPENDENCY__NAME:
                return isSetName();
            case CmpPackage.DEPENDENCY__ALIAS:
                return isSetAlias();
            case CmpPackage.DEPENDENCY__LEFT_CLASSIFIER:
                return basicGetLeftClassifier() != null;
            case CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER:
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
                case CmpPackage.DEPENDENCY__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case CmpPackage.DEPENDENCY__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (derivedFeatureID) {
                case CmpPackage.DEPENDENCY__LEFT_CLASSIFIER: return CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER;
                case CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER: return CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return CmpPackage.DEPENDENCY__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return CmpPackage.DEPENDENCY__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == ClassifierRelation.class) {
            switch (baseFeatureID) {
                case CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER: return CmpPackage.DEPENDENCY__LEFT_CLASSIFIER;
                case CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER: return CmpPackage.DEPENDENCY__RIGHT_CLASSIFIER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //DependencyImpl
