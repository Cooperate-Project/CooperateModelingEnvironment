/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;

import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.InterfaceRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationImpl extends UMLReferencingElementImpl<InterfaceRealization> implements Implementation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImplementationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.IMPLEMENTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(InterfaceRealization newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage() {
        return (de.cooperateproject.modeling.textual.cls.cls.Package)eDynamicGet(ClsPackage.IMPLEMENTATION__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningPackage, ClsPackage.IMPLEMENTATION__OWNING_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage) {
        eDynamicSet(ClsPackage.IMPLEMENTATION__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, newOwningPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> getLeft() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.IMPLEMENTATION__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> basicGetLeft() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.IMPLEMENTATION__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeft(Classifier<? extends org.eclipse.uml2.uml.Classifier> newLeft) {
        eDynamicSet(ClsPackage.IMPLEMENTATION__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, newLeft);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> getRight() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.IMPLEMENTATION__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<? extends org.eclipse.uml2.uml.Classifier> basicGetRight() {
        return (Classifier<? extends org.eclipse.uml2.uml.Classifier>)eDynamicGet(ClsPackage.IMPLEMENTATION__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRight(Classifier<? extends org.eclipse.uml2.uml.Classifier> newRight) {
        eDynamicSet(ClsPackage.IMPLEMENTATION__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, newRight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
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
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
                return basicSetOwningPackage(null, msgs);
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
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
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
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
                return getOwningPackage();
            case ClsPackage.IMPLEMENTATION__LEFT:
                if (resolve) return getLeft();
                return basicGetLeft();
            case ClsPackage.IMPLEMENTATION__RIGHT:
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
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)newValue);
                return;
            case ClsPackage.IMPLEMENTATION__LEFT:
                setLeft((Classifier<? extends org.eclipse.uml2.uml.Classifier>)newValue);
                return;
            case ClsPackage.IMPLEMENTATION__RIGHT:
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
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)null);
                return;
            case ClsPackage.IMPLEMENTATION__LEFT:
                setLeft((Classifier<? extends org.eclipse.uml2.uml.Classifier>)null);
                return;
            case ClsPackage.IMPLEMENTATION__RIGHT:
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
            case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE:
                return getOwningPackage() != null;
            case ClsPackage.IMPLEMENTATION__LEFT:
                return basicGetLeft() != null;
            case ClsPackage.IMPLEMENTATION__RIGHT:
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
        if (baseClass == PackageableElement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Connector.class) {
            switch (derivedFeatureID) {
                case ClsPackage.IMPLEMENTATION__OWNING_PACKAGE: return ClsPackage.CONNECTOR__OWNING_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == TypedConnector.class) {
            switch (derivedFeatureID) {
                case ClsPackage.IMPLEMENTATION__LEFT: return ClsPackage.TYPED_CONNECTOR__LEFT;
                case ClsPackage.IMPLEMENTATION__RIGHT: return ClsPackage.TYPED_CONNECTOR__RIGHT;
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
        if (baseClass == PackageableElement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Connector.class) {
            switch (baseFeatureID) {
                case ClsPackage.CONNECTOR__OWNING_PACKAGE: return ClsPackage.IMPLEMENTATION__OWNING_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == TypedConnector.class) {
            switch (baseFeatureID) {
                case ClsPackage.TYPED_CONNECTOR__LEFT: return ClsPackage.IMPLEMENTATION__LEFT;
                case ClsPackage.TYPED_CONNECTOR__RIGHT: return ClsPackage.IMPLEMENTATION__RIGHT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ImplementationImpl
