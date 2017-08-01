/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl;
import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier;
import de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ClassifierRelationImpl#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ClassifierRelationImpl#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierRelationImpl<LeftUMLType extends org.eclipse.uml2.uml.Classifier, RightUMLType extends org.eclipse.uml2.uml.Classifier> extends AliasedElementImpl implements ClassifierRelation<LeftUMLType, RightUMLType> {
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
    @SuppressWarnings("unchecked")
    public Classifier<LeftUMLType> getLeftClassifier() {
        return (Classifier<LeftUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<LeftUMLType> basicGetLeftClassifier() {
        return (Classifier<LeftUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftClassifier(Classifier<LeftUMLType> newLeftClassifier) {
        eDynamicSet(ComponentPackage.CLASSIFIER_RELATION__LEFT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, newLeftClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<RightUMLType> getRightClassifier() {
        return (Classifier<RightUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<RightUMLType> basicGetRightClassifier() {
        return (Classifier<RightUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightClassifier(Classifier<RightUMLType> newRightClassifier) {
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
                setLeftClassifier((Classifier<LeftUMLType>)newValue);
                return;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                setRightClassifier((Classifier<RightUMLType>)newValue);
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
                setLeftClassifier((Classifier<LeftUMLType>)null);
                return;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHT_CLASSIFIER:
                setRightClassifier((Classifier<RightUMLType>)null);
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
