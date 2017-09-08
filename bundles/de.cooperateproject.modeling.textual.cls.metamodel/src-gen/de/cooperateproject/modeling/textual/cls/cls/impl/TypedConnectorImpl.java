/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.ElementImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getAppliedStereotypes <em>Applied Stereotypes</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedConnectorImpl<T extends DirectedRelationship> extends ElementImpl implements TypedConnector<T> {
    /**
     * The cached setting delegate for the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate REFERENCED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT).getSettingDelegate();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypedConnectorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.TYPED_CONNECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage() {
        return (de.cooperateproject.modeling.textual.cls.cls.Package)eDynamicGet(ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningPackage, ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage) {
        eDynamicSet(ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, newOwningPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public T getReferencedElement() {
        return (T)eDynamicGet(ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public T basicGetReferencedElement() {
        return (T)eDynamicGet(ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(T newReferencedElement) {
        eDynamicSet(ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<StereotypeApplication> getAppliedStereotypes() {
        return (EList<StereotypeApplication>)eDynamicGet(ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> getLeft() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.TYPED_CONNECTOR__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> basicGetLeft() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.TYPED_CONNECTOR__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeft(Classifier<? extends org.eclipse.uml2.uml.Classifier> newLeft) {
        eDynamicSet(ClsPackage.TYPED_CONNECTOR__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, newLeft);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> getRight() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.TYPED_CONNECTOR__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> basicGetRight() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.TYPED_CONNECTOR__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRight(Classifier<? extends org.eclipse.uml2.uml.Classifier> newRight) {
        eDynamicSet(ClsPackage.TYPED_CONNECTOR__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, newRight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)otherEnd, msgs);
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
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                return basicSetOwningPackage(null, msgs);
            case ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES:
                return ((InternalEList<?>)getAppliedStereotypes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                return eInternalContainer().eInverseRemove(this, ClsPackage.PACKAGE__CONNECTORS, de.cooperateproject.modeling.textual.cls.cls.Package.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                return getOwningPackage();
            case ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES:
                return getAppliedStereotypes();
            case ClsPackage.TYPED_CONNECTOR__LEFT:
                if (resolve) return getLeft();
                return basicGetLeft();
            case ClsPackage.TYPED_CONNECTOR__RIGHT:
                if (resolve) return getRight();
                return basicGetRight();
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
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)newValue);
                return;
            case ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT:
                setReferencedElement((T)newValue);
                return;
            case ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES:
                getAppliedStereotypes().clear();
                getAppliedStereotypes().addAll((Collection<? extends StereotypeApplication>)newValue);
                return;
            case ClsPackage.TYPED_CONNECTOR__LEFT:
                setLeft((Classifier<? extends org.eclipse.uml2.uml.Classifier>)newValue);
                return;
            case ClsPackage.TYPED_CONNECTOR__RIGHT:
                setRight((Classifier<? extends org.eclipse.uml2.uml.Classifier>)newValue);
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
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)null);
                return;
            case ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT:
                setReferencedElement((T)null);
                return;
            case ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES:
                getAppliedStereotypes().clear();
                return;
            case ClsPackage.TYPED_CONNECTOR__LEFT:
                setLeft((Classifier<? extends org.eclipse.uml2.uml.Classifier>)null);
                return;
            case ClsPackage.TYPED_CONNECTOR__RIGHT:
                setRight((Classifier<? extends org.eclipse.uml2.uml.Classifier>)null);
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
            case ClsPackage.TYPED_CONNECTOR__OWNING_PACKAGE:
                return getOwningPackage() != null;
            case ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
            case ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES:
                return !getAppliedStereotypes().isEmpty();
            case ClsPackage.TYPED_CONNECTOR__LEFT:
                return basicGetLeft() != null;
            case ClsPackage.TYPED_CONNECTOR__RIGHT:
                return basicGetRight() != null;
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
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                case ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;
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
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return ClsPackage.TYPED_CONNECTOR__REFERENCED_ELEMENT;
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES: return ClsPackage.TYPED_CONNECTOR__APPLIED_STEREOTYPES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //TypedConnectorImpl
