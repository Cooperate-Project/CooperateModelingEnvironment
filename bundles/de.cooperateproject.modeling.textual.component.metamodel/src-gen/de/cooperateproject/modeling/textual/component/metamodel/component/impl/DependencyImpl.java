/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier;
import de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;

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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.DependencyImpl#getLeftclassifier <em>Leftclassifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.DependencyImpl#getRightclassifier <em>Rightclassifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends UMLReferencingElementImpl<Dependency> implements de.cooperateproject.modeling.textual.component.metamodel.component.Dependency {
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
        return ComponentPackage.Literals.DEPENDENCY;
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
    public Classifier getLeftclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.DEPENDENCY__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetLeftclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.DEPENDENCY__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftclassifier(Classifier newLeftclassifier) {
        eDynamicSet(ComponentPackage.DEPENDENCY__LEFTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__LEFTCLASSIFIER, newLeftclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getRightclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetRightclassifier() {
        return (Classifier)eDynamicGet(ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightclassifier(Classifier newRightclassifier) {
        eDynamicSet(ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER, ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHTCLASSIFIER, newRightclassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.DEPENDENCY__LEFTCLASSIFIER:
                if (resolve) return getLeftclassifier();
                return basicGetLeftclassifier();
            case ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER:
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
            case ComponentPackage.DEPENDENCY__LEFTCLASSIFIER:
                setLeftclassifier((Classifier)newValue);
                return;
            case ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER:
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
            case ComponentPackage.DEPENDENCY__LEFTCLASSIFIER:
                setLeftclassifier((Classifier)null);
                return;
            case ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER:
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
            case ComponentPackage.DEPENDENCY__LEFTCLASSIFIER:
                return basicGetLeftclassifier() != null;
            case ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER:
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
        if (baseClass == ClassifierRelation.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.DEPENDENCY__LEFTCLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER;
                case ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER: return ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER;
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
                case ComponentPackage.CLASSIFIER_RELATION__LEFTCLASSIFIER: return ComponentPackage.DEPENDENCY__LEFTCLASSIFIER;
                case ComponentPackage.CLASSIFIER_RELATION__RIGHTCLASSIFIER: return ComponentPackage.DEPENDENCY__RIGHTCLASSIFIER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //DependencyImpl
