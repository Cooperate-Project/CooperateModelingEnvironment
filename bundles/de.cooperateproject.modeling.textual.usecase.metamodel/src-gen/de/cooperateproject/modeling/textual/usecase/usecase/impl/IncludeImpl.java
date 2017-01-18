/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends RelationshipImpl implements Include {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Include getReferencedElement() {
		return (org.eclipse.uml2.uml.Include)eDynamicGet(UsecasePackage.INCLUDE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Include basicGetReferencedElement() {
		return (org.eclipse.uml2.uml.Include)eDynamicGet(UsecasePackage.INCLUDE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(org.eclipse.uml2.uml.Include newReferencedElement) {
		eDynamicSet(UsecasePackage.INCLUDE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getClient() {
		return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__CLIENT, UsecasePackage.Literals.INCLUDE__CLIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetClient() {
		return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__CLIENT, UsecasePackage.Literals.INCLUDE__CLIENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(UseCase newClient) {
		eDynamicSet(UsecasePackage.INCLUDE__CLIENT, UsecasePackage.Literals.INCLUDE__CLIENT, newClient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getSupplier() {
		return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__SUPPLIER, UsecasePackage.Literals.INCLUDE__SUPPLIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetSupplier() {
		return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__SUPPLIER, UsecasePackage.Literals.INCLUDE__SUPPLIER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(UseCase newSupplier) {
		eDynamicSet(UsecasePackage.INCLUDE__SUPPLIER, UsecasePackage.Literals.INCLUDE__SUPPLIER, newSupplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case UsecasePackage.INCLUDE__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case UsecasePackage.INCLUDE__SUPPLIER:
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
			case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Include)newValue);
				return;
			case UsecasePackage.INCLUDE__CLIENT:
				setClient((UseCase)newValue);
				return;
			case UsecasePackage.INCLUDE__SUPPLIER:
				setSupplier((UseCase)newValue);
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
			case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Include)null);
				return;
			case UsecasePackage.INCLUDE__CLIENT:
				setClient((UseCase)null);
				return;
			case UsecasePackage.INCLUDE__SUPPLIER:
				setSupplier((UseCase)null);
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
			case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
				return basicGetReferencedElement() != null;
			case UsecasePackage.INCLUDE__CLIENT:
				return basicGetClient() != null;
			case UsecasePackage.INCLUDE__SUPPLIER:
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
				case UsecasePackage.INCLUDE__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.INCLUDE__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IncludeImpl
