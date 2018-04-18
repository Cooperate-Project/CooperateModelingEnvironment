/**
 */
package de.cooperateproject.modeling.textual.component.component.impl;

import de.cooperateproject.modeling.textual.component.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.component.ComponentPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.component.impl.ClassifierRelationImpl#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.component.impl.ClassifierRelationImpl#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierRelationImpl<LeftUMLType extends Classifier, RightUMLType extends Classifier> extends CDOObjectImpl implements ClassifierRelation<LeftUMLType, RightUMLType> {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.CLASSIFIER_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType> getLeftClassifier() {
        return (de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType> basicGetLeftClassifier() {
        return (de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftClassifier(de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType> newLeftClassifier) {
        eDynamicSet(ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, newLeftClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType> getRightClassifier() {
        return (de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType> basicGetRightClassifier() {
        return (de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightClassifier(de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType> newRightClassifier) {
        eDynamicSet(ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, newRightClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                if (resolve) return getLeftClassifier();
                return basicGetLeftClassifier();
            case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
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
            case ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                setLeftClassifier((de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType>)newValue);
                return;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                setRightClassifier((de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType>)newValue);
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
            case ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                setLeftClassifier((de.cooperateproject.modeling.textual.component.component.Classifier<LeftUMLType>)null);
                return;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                setRightClassifier((de.cooperateproject.modeling.textual.component.component.Classifier<RightUMLType>)null);
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
            case ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                return basicGetLeftClassifier() != null;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                return basicGetRightClassifier() != null;
        }
        return super.eIsSet(featureID);
    }

} //ClassifierRelationImpl
