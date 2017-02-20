/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends CDOObjectImpl implements Generalization {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GeneralizationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsecasePackage.Literals.GENERALIZATION;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Generalization getReferencedElement() {
        return (org.eclipse.uml2.uml.Generalization)eDynamicGet(UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Generalization basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Generalization)eDynamicGet(UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(org.eclipse.uml2.uml.Generalization newReferencedElement) {
        eDynamicSet(UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> getSpecific() {
        return (BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)eDynamicGet(UsecasePackage.GENERALIZATION__SPECIFIC, UsecasePackage.Literals.GENERALIZATION__SPECIFIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> basicGetSpecific() {
        return (BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)eDynamicGet(UsecasePackage.GENERALIZATION__SPECIFIC, UsecasePackage.Literals.GENERALIZATION__SPECIFIC, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecific(BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> newSpecific) {
        eDynamicSet(UsecasePackage.GENERALIZATION__SPECIFIC, UsecasePackage.Literals.GENERALIZATION__SPECIFIC, newSpecific);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> getGeneral() {
        return (BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)eDynamicGet(UsecasePackage.GENERALIZATION__GENERAL, UsecasePackage.Literals.GENERALIZATION__GENERAL, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> basicGetGeneral() {
        return (BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)eDynamicGet(UsecasePackage.GENERALIZATION__GENERAL, UsecasePackage.Literals.GENERALIZATION__GENERAL, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneral(BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier> newGeneral) {
        eDynamicSet(UsecasePackage.GENERALIZATION__GENERAL, UsecasePackage.Literals.GENERALIZATION__GENERAL, newGeneral);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case UsecasePackage.GENERALIZATION__SPECIFIC:
                if (resolve) return getSpecific();
                return basicGetSpecific();
            case UsecasePackage.GENERALIZATION__GENERAL:
                if (resolve) return getGeneral();
                return basicGetGeneral();
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
            case UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Generalization)newValue);
                return;
            case UsecasePackage.GENERALIZATION__SPECIFIC:
                setSpecific((BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)newValue);
                return;
            case UsecasePackage.GENERALIZATION__GENERAL:
                setGeneral((BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)newValue);
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
            case UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Generalization)null);
                return;
            case UsecasePackage.GENERALIZATION__SPECIFIC:
                setSpecific((BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)null);
                return;
            case UsecasePackage.GENERALIZATION__GENERAL:
                setGeneral((BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>)null);
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
            case UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case UsecasePackage.GENERALIZATION__SPECIFIC:
                return basicGetSpecific() != null;
            case UsecasePackage.GENERALIZATION__GENERAL:
                return basicGetGeneral() != null;
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
                case UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
                case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //GeneralizationImpl
