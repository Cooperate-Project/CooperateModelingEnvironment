/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends PackageBaseImpl<de.cooperateproject.modeling.textual.cls.cls.Package> implements de.cooperateproject.modeling.textual.cls.cls.Package {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public NotificationChain basicSetOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage, NotificationChain msgs) {
        return super.basicSetOwningPackage(newOwningPackage, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getClassifiers() {
        return (EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>>)eDynamicGet(ClsPackage.PACKAGE__CLASSIFIERS, ClsPackage.Literals.PACKAGE__CLASSIFIERS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Connector> getConnectors() {
        return (EList<Connector>)eDynamicGet(ClsPackage.PACKAGE__CONNECTORS, ClsPackage.Literals.PACKAGE__CONNECTORS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassifiers()).basicAdd(otherEnd, msgs);
            case ClsPackage.PACKAGE__CONNECTORS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
            case ClsPackage.PACKAGE__CONNECTORS:
                return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return getClassifiers();
            case ClsPackage.PACKAGE__CONNECTORS:
                return getConnectors();
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
            case ClsPackage.PACKAGE__CLASSIFIERS:
                getClassifiers().clear();
                getClassifiers().addAll((Collection<? extends Classifier<? extends org.eclipse.uml2.uml.Classifier>>)newValue);
                return;
            case ClsPackage.PACKAGE__CONNECTORS:
                getConnectors().clear();
                getConnectors().addAll((Collection<? extends Connector>)newValue);
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
            case ClsPackage.PACKAGE__CLASSIFIERS:
                getClassifiers().clear();
                return;
            case ClsPackage.PACKAGE__CONNECTORS:
                getConnectors().clear();
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
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return !getClassifiers().isEmpty();
            case ClsPackage.PACKAGE__CONNECTORS:
                return !getConnectors().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PackageImpl
