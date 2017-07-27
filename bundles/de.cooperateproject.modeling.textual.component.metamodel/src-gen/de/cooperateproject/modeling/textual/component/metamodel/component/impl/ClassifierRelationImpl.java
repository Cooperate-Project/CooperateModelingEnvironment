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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ClassifierRelationImpl#getLeftclassifier <em>Leftclassifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ClassifierRelationImpl#getRightclassifier <em>Rightclassifier</em>}</li>
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
    public Classifier<LeftUMLType> getLeftclassifier() {
        return (Classifier<LeftUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<LeftUMLType> basicGetLeftclassifier() {
        return (Classifier<LeftUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftclassifier(Classifier<LeftUMLType> newLeftclassifier) {
        eDynamicSet(ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, newLeftclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<RightUMLType> getRightclassifier() {
        return (Classifier<RightUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<RightUMLType> basicGetRightclassifier() {
        return (Classifier<RightUMLType>)eDynamicGet(ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightclassifier(Classifier<RightUMLType> newRightclassifier) {
        eDynamicSet(ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, newRightclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER:
                if (resolve) return getLeftclassifier();
                return basicGetLeftclassifier();
            case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER:
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
            case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER:
                setLeftclassifier((Classifier<LeftUMLType>)newValue);
                return;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER:
                setRightclassifier((Classifier<RightUMLType>)newValue);
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
            case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER:
                setLeftclassifier((Classifier<LeftUMLType>)null);
                return;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER:
                setRightclassifier((Classifier<RightUMLType>)null);
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
            case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER:
                return basicGetLeftclassifier() != null;
            case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER:
                return basicGetRightclassifier() != null;
        }
        return super.eIsSet(featureID);
    }

} //ClassifierRelationImpl
