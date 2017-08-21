/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.impl;

import de.cooperateproject.modeling.textual.cmp.cmp.Classifier;
import de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.cmp.cmp.RootPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl;

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
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.RootPackageImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.RootPackageImpl#getClassifiers <em>Classifiers</em>}</li>
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
        return CmpPackage.Literals.ROOT_PACKAGE;
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
    public EList<ClassifierRelation<?, ?>> getRelations() {
        return (EList<ClassifierRelation<?, ?>>)eDynamicGet(CmpPackage.ROOT_PACKAGE__RELATIONS, CmpPackage.Literals.ROOT_PACKAGE__RELATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Classifier<org.eclipse.uml2.uml.Classifier>> getClassifiers() {
        return (EList<Classifier<org.eclipse.uml2.uml.Classifier>>)eDynamicGet(CmpPackage.ROOT_PACKAGE__CLASSIFIERS, CmpPackage.Literals.ROOT_PACKAGE__CLASSIFIERS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CmpPackage.ROOT_PACKAGE__RELATIONS:
                return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
            case CmpPackage.ROOT_PACKAGE__CLASSIFIERS:
                return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
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
            case CmpPackage.ROOT_PACKAGE__RELATIONS:
                return getRelations();
            case CmpPackage.ROOT_PACKAGE__CLASSIFIERS:
                return getClassifiers();
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
            case CmpPackage.ROOT_PACKAGE__RELATIONS:
                getRelations().clear();
                getRelations().addAll((Collection<? extends ClassifierRelation<?, ?>>)newValue);
                return;
            case CmpPackage.ROOT_PACKAGE__CLASSIFIERS:
                getClassifiers().clear();
                getClassifiers().addAll((Collection<? extends Classifier<org.eclipse.uml2.uml.Classifier>>)newValue);
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
            case CmpPackage.ROOT_PACKAGE__RELATIONS:
                getRelations().clear();
                return;
            case CmpPackage.ROOT_PACKAGE__CLASSIFIERS:
                getClassifiers().clear();
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
            case CmpPackage.ROOT_PACKAGE__RELATIONS:
                return !getRelations().isEmpty();
            case CmpPackage.ROOT_PACKAGE__CLASSIFIERS:
                return !getClassifiers().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RootPackageImpl
