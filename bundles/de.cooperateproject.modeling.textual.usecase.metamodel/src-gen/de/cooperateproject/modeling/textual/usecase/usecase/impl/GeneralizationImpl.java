/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends RelationshipImpl implements Generalization {
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
	public BehavioredClassifier getClient() {
        return (BehavioredClassifier)eDynamicGet(UsecasePackage.GENERALIZATION__CLIENT, UsecasePackage.Literals.GENERALIZATION__CLIENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehavioredClassifier basicGetClient() {
        return (BehavioredClassifier)eDynamicGet(UsecasePackage.GENERALIZATION__CLIENT, UsecasePackage.Literals.GENERALIZATION__CLIENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClient(BehavioredClassifier newClient) {
        eDynamicSet(UsecasePackage.GENERALIZATION__CLIENT, UsecasePackage.Literals.GENERALIZATION__CLIENT, newClient);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehavioredClassifier getSupplier() {
        return (BehavioredClassifier)eDynamicGet(UsecasePackage.GENERALIZATION__SUPPLIER, UsecasePackage.Literals.GENERALIZATION__SUPPLIER, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehavioredClassifier basicGetSupplier() {
        return (BehavioredClassifier)eDynamicGet(UsecasePackage.GENERALIZATION__SUPPLIER, UsecasePackage.Literals.GENERALIZATION__SUPPLIER, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSupplier(BehavioredClassifier newSupplier) {
        eDynamicSet(UsecasePackage.GENERALIZATION__SUPPLIER, UsecasePackage.Literals.GENERALIZATION__SUPPLIER, newSupplier);
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
            case UsecasePackage.GENERALIZATION__CLIENT:
                if (resolve) return getClient();
                return basicGetClient();
            case UsecasePackage.GENERALIZATION__SUPPLIER:
                if (resolve) return getSupplier();
                return basicGetSupplier();
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
            case UsecasePackage.GENERALIZATION__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Generalization)newValue);
                return;
            case UsecasePackage.GENERALIZATION__CLIENT:
                setClient((BehavioredClassifier)newValue);
                return;
            case UsecasePackage.GENERALIZATION__SUPPLIER:
                setSupplier((BehavioredClassifier)newValue);
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
            case UsecasePackage.GENERALIZATION__CLIENT:
                setClient((BehavioredClassifier)null);
                return;
            case UsecasePackage.GENERALIZATION__SUPPLIER:
                setSupplier((BehavioredClassifier)null);
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
            case UsecasePackage.GENERALIZATION__CLIENT:
                return basicGetClient() != null;
            case UsecasePackage.GENERALIZATION__SUPPLIER:
                return basicGetSupplier() != null;
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
