/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.impl;

import de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierRelationImpl#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.ClassifierRelationImpl#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierRelationImpl<LeftUMLType extends Classifier, RightUMLType extends Classifier> extends AliasedElementImpl implements ClassifierRelation<LeftUMLType, RightUMLType> {
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
        return CmpPackage.Literals.CLASSIFIER_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType> getLeftClassifier() {
        return (de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType>)eDynamicGet(CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType> basicGetLeftClassifier() {
        return (de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType>)eDynamicGet(CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftClassifier(de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType> newLeftClassifier) {
        eDynamicSet(CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, newLeftClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType> getRightClassifier() {
        return (de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType>)eDynamicGet(CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType> basicGetRightClassifier() {
        return (de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType>)eDynamicGet(CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightClassifier(de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType> newRightClassifier) {
        eDynamicSet(CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, newRightClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                if (resolve) return getLeftClassifier();
                return basicGetLeftClassifier();
            case CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
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
            case CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                setLeftClassifier((de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType>)newValue);
                return;
            case CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                setRightClassifier((de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType>)newValue);
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
            case CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                setLeftClassifier((de.cooperateproject.modeling.textual.cmp.cmp.Classifier<LeftUMLType>)null);
                return;
            case CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                setRightClassifier((de.cooperateproject.modeling.textual.cmp.cmp.Classifier<RightUMLType>)null);
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
            case CmpPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER:
                return basicGetLeftClassifier() != null;
            case CmpPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                return basicGetRightClassifier() != null;
        }
        return super.eIsSet(featureID);
    }

} //ClassifierRelationImpl
