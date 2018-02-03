/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;

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
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.GeneralizationImpl#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.GeneralizationImpl#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends UMLReferencingElementImpl<Generalization> implements de.cooperateproject.modeling.textual.component.cmp.Generalization {
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
        return CmpPackage.Literals.GENERALIZATION;
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
    @SuppressWarnings("unchecked")
    public Classifier<Interface> getLeftClassifier() {
        return (Classifier<Interface>)eDynamicGet(CmpPackage.GENERALIZATION__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<Interface> basicGetLeftClassifier() {
        return (Classifier<Interface>)eDynamicGet(CmpPackage.GENERALIZATION__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftClassifier(Classifier<Interface> newLeftClassifier) {
        eDynamicSet(CmpPackage.GENERALIZATION__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, newLeftClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<Interface> getRightClassifier() {
        return (Classifier<Interface>)eDynamicGet(CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<Interface> basicGetRightClassifier() {
        return (Classifier<Interface>)eDynamicGet(CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightClassifier(Classifier<Interface> newRightClassifier) {
        eDynamicSet(CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, newRightClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.GENERALIZATION__LEFT_CLASSIFIER:
                if (resolve) return getLeftClassifier();
                return basicGetLeftClassifier();
            case CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER:
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
            case CmpPackage.GENERALIZATION__LEFT_CLASSIFIER:
                setLeftClassifier((Classifier<Interface>)newValue);
                return;
            case CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER:
                setRightClassifier((Classifier<Interface>)newValue);
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
            case CmpPackage.GENERALIZATION__LEFT_CLASSIFIER:
                setLeftClassifier((Classifier<Interface>)null);
                return;
            case CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER:
                setRightClassifier((Classifier<Interface>)null);
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
            case CmpPackage.GENERALIZATION__LEFT_CLASSIFIER:
                return basicGetLeftClassifier() != null;
            case CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER:
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
        if (baseClass == ClassifierRelation.class) {
            switch (derivedFeatureID) {
                case CmpPackage.GENERALIZATION__LEFT_CLASSIFIER: return CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER;
                case CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER: return CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER;
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
        if (baseClass == ClassifierRelation.class) {
            switch (baseFeatureID) {
                case CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER: return CmpPackage.GENERALIZATION__LEFT_CLASSIFIER;
                case CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER: return CmpPackage.GENERALIZATION__RIGHT_CLASSIFIER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //GeneralizationImpl
