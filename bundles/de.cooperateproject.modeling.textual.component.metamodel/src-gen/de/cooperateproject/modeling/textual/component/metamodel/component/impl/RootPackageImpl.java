/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl;

import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier;
import de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RootPackageImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RootPackageImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootPackageImpl extends PackageBaseImpl<RootPackage> implements RootPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RootPackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.ROOT_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public NotificationChain basicSetOwningPackage(RootPackage newOwningPackage, NotificationChain msgs) {
        return super.basicSetOwningPackage(newOwningPackage, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ClassifierRelation<?, ?>> getRelation() {
        return (EList<ClassifierRelation<?, ?>>)eDynamicGet(ComponentPackage.ROOT_PACKAGE__RELATION, ComponentPackage.Literals.ROOT_PACKAGE__RELATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Classifier<org.eclipse.uml2.uml.Classifier>> getClassifier() {
        return (EList<Classifier<org.eclipse.uml2.uml.Classifier>>)eDynamicGet(ComponentPackage.ROOT_PACKAGE__CLASSIFIER, ComponentPackage.Literals.ROOT_PACKAGE__CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.ROOT_PACKAGE__RELATION:
                return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.ROOT_PACKAGE__CLASSIFIER:
                return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.ROOT_PACKAGE__RELATION:
                return getRelation();
            case ComponentPackage.ROOT_PACKAGE__CLASSIFIER:
                return getClassifier();
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
            case ComponentPackage.ROOT_PACKAGE__RELATION:
                getRelation().clear();
                getRelation().addAll((Collection<? extends ClassifierRelation<?, ?>>)newValue);
                return;
            case ComponentPackage.ROOT_PACKAGE__CLASSIFIER:
                getClassifier().clear();
                getClassifier().addAll((Collection<? extends Classifier<org.eclipse.uml2.uml.Classifier>>)newValue);
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
            case ComponentPackage.ROOT_PACKAGE__RELATION:
                getRelation().clear();
                return;
            case ComponentPackage.ROOT_PACKAGE__CLASSIFIER:
                getClassifier().clear();
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
            case ComponentPackage.ROOT_PACKAGE__RELATION:
                return !getRelation().isEmpty();
            case ComponentPackage.ROOT_PACKAGE__CLASSIFIER:
                return !getClassifier().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RootPackageImpl
