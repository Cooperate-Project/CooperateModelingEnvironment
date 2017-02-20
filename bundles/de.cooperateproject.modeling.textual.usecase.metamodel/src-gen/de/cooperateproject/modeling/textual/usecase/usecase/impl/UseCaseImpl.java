/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Commentable;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.usecase.usecase.Visibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends AliasedElementImpl implements UseCase {
	/**
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.UNDEFINED;

	/**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected UseCaseImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsecasePackage.Literals.USE_CASE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.UseCase getReferencedElement() {
        return (org.eclipse.uml2.uml.UseCase)eDynamicGet(UsecasePackage.USE_CASE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.UseCase basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.UseCase)eDynamicGet(UsecasePackage.USE_CASE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(org.eclipse.uml2.uml.UseCase newReferencedElement) {
        eDynamicSet(UsecasePackage.USE_CASE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Visibility getVisibility() {
        return (Visibility)eDynamicGet(UsecasePackage.USE_CASE__VISIBILITY, UsecasePackage.Literals.USE_CASE__VISIBILITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVisibility(Visibility newVisibility) {
        eDynamicSet(UsecasePackage.USE_CASE__VISIBILITY, UsecasePackage.Literals.USE_CASE__VISIBILITY, newVisibility);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isAbstract() {
        return (Boolean)eDynamicGet(UsecasePackage.USE_CASE__ABSTRACT, UsecasePackage.Literals.USE_CASE__ABSTRACT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAbstract(boolean newAbstract) {
        eDynamicSet(UsecasePackage.USE_CASE__ABSTRACT, UsecasePackage.Literals.USE_CASE__ABSTRACT, newAbstract);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<ExtensionPoint> getExtensionPoints() {
        return (EList<ExtensionPoint>)eDynamicGet(UsecasePackage.USE_CASE__EXTENSION_POINTS, UsecasePackage.Literals.USE_CASE__EXTENSION_POINTS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.modeling.textual.usecase.usecase.System getSystem() {
        return (de.cooperateproject.modeling.textual.usecase.usecase.System)eDynamicGet(UsecasePackage.USE_CASE__SYSTEM, UsecasePackage.Literals.USE_CASE__SYSTEM, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSystem(de.cooperateproject.modeling.textual.usecase.usecase.System newSystem, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSystem, UsecasePackage.USE_CASE__SYSTEM, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSystem(de.cooperateproject.modeling.textual.usecase.usecase.System newSystem) {
        eDynamicSet(UsecasePackage.USE_CASE__SYSTEM, UsecasePackage.Literals.USE_CASE__SYSTEM, newSystem);
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
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionPoints()).basicAdd(otherEnd, msgs);
            case UsecasePackage.USE_CASE__SYSTEM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSystem((de.cooperateproject.modeling.textual.usecase.usecase.System)otherEnd, msgs);
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
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
            case UsecasePackage.USE_CASE__SYSTEM:
                return basicSetSystem(null, msgs);
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
            case UsecasePackage.USE_CASE__SYSTEM:
                return eInternalContainer().eInverseRemove(this, UsecasePackage.SYSTEM__USECASES, de.cooperateproject.modeling.textual.usecase.usecase.System.class, msgs);
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
            case UsecasePackage.USE_CASE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case UsecasePackage.USE_CASE__VISIBILITY:
                return getVisibility();
            case UsecasePackage.USE_CASE__ABSTRACT:
                return isAbstract();
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return getExtensionPoints();
            case UsecasePackage.USE_CASE__SYSTEM:
                return getSystem();
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
            case UsecasePackage.USE_CASE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.UseCase)newValue);
                return;
            case UsecasePackage.USE_CASE__VISIBILITY:
                setVisibility((Visibility)newValue);
                return;
            case UsecasePackage.USE_CASE__ABSTRACT:
                setAbstract((Boolean)newValue);
                return;
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                getExtensionPoints().clear();
                getExtensionPoints().addAll((Collection<? extends ExtensionPoint>)newValue);
                return;
            case UsecasePackage.USE_CASE__SYSTEM:
                setSystem((de.cooperateproject.modeling.textual.usecase.usecase.System)newValue);
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
            case UsecasePackage.USE_CASE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.UseCase)null);
                return;
            case UsecasePackage.USE_CASE__VISIBILITY:
                setVisibility(VISIBILITY_EDEFAULT);
                return;
            case UsecasePackage.USE_CASE__ABSTRACT:
                setAbstract(ABSTRACT_EDEFAULT);
                return;
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                getExtensionPoints().clear();
                return;
            case UsecasePackage.USE_CASE__SYSTEM:
                setSystem((de.cooperateproject.modeling.textual.usecase.usecase.System)null);
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
            case UsecasePackage.USE_CASE__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case UsecasePackage.USE_CASE__VISIBILITY:
                return getVisibility() != VISIBILITY_EDEFAULT;
            case UsecasePackage.USE_CASE__ABSTRACT:
                return isAbstract() != ABSTRACT_EDEFAULT;
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return !getExtensionPoints().isEmpty();
            case UsecasePackage.USE_CASE__SYSTEM:
                return getSystem() != null;
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
        if (baseClass == Commentable.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.USE_CASE__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == BehavioredClassifier.class) {
            switch (derivedFeatureID) {
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
        if (baseClass == Commentable.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.USE_CASE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == BehavioredClassifier.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //UseCaseImpl
