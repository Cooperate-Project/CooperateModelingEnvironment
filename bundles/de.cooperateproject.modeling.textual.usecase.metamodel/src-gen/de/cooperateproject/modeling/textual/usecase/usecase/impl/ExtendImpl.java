/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendImpl extends RelationshipImpl implements Extend {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.EXTEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Extend getReferencedElement() {
		return (org.eclipse.uml2.uml.Extend)eDynamicGet(UsecasePackage.EXTEND__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Extend basicGetReferencedElement() {
		return (org.eclipse.uml2.uml.Extend)eDynamicGet(UsecasePackage.EXTEND__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(org.eclipse.uml2.uml.Extend newReferencedElement) {
		eDynamicSet(UsecasePackage.EXTEND__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getClient() {
		return (UseCase)eDynamicGet(UsecasePackage.EXTEND__CLIENT, UsecasePackage.Literals.EXTEND__CLIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetClient() {
		return (UseCase)eDynamicGet(UsecasePackage.EXTEND__CLIENT, UsecasePackage.Literals.EXTEND__CLIENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(UseCase newClient) {
		eDynamicSet(UsecasePackage.EXTEND__CLIENT, UsecasePackage.Literals.EXTEND__CLIENT, newClient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getSupplier() {
		return (UseCase)eDynamicGet(UsecasePackage.EXTEND__SUPPLIER, UsecasePackage.Literals.EXTEND__SUPPLIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetSupplier() {
		return (UseCase)eDynamicGet(UsecasePackage.EXTEND__SUPPLIER, UsecasePackage.Literals.EXTEND__SUPPLIER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(UseCase newSupplier) {
		eDynamicSet(UsecasePackage.EXTEND__SUPPLIER, UsecasePackage.Literals.EXTEND__SUPPLIER, newSupplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionPoint() {
		return (ExtensionPoint)eDynamicGet(UsecasePackage.EXTEND__EXTENSION_POINT, UsecasePackage.Literals.EXTEND__EXTENSION_POINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint basicGetExtensionPoint() {
		return (ExtensionPoint)eDynamicGet(UsecasePackage.EXTEND__EXTENSION_POINT, UsecasePackage.Literals.EXTEND__EXTENSION_POINT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPoint(ExtensionPoint newExtensionPoint) {
		eDynamicSet(UsecasePackage.EXTEND__EXTENSION_POINT, UsecasePackage.Literals.EXTEND__EXTENSION_POINT, newExtensionPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return (String)eDynamicGet(UsecasePackage.EXTEND__CONDITION, UsecasePackage.Literals.EXTEND__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		eDynamicSet(UsecasePackage.EXTEND__CONDITION, UsecasePackage.Literals.EXTEND__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case UsecasePackage.EXTEND__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case UsecasePackage.EXTEND__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case UsecasePackage.EXTEND__EXTENSION_POINT:
				if (resolve) return getExtensionPoint();
				return basicGetExtensionPoint();
			case UsecasePackage.EXTEND__CONDITION:
				return getCondition();
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
			case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Extend)newValue);
				return;
			case UsecasePackage.EXTEND__CLIENT:
				setClient((UseCase)newValue);
				return;
			case UsecasePackage.EXTEND__SUPPLIER:
				setSupplier((UseCase)newValue);
				return;
			case UsecasePackage.EXTEND__EXTENSION_POINT:
				setExtensionPoint((ExtensionPoint)newValue);
				return;
			case UsecasePackage.EXTEND__CONDITION:
				setCondition((String)newValue);
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
			case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Extend)null);
				return;
			case UsecasePackage.EXTEND__CLIENT:
				setClient((UseCase)null);
				return;
			case UsecasePackage.EXTEND__SUPPLIER:
				setSupplier((UseCase)null);
				return;
			case UsecasePackage.EXTEND__EXTENSION_POINT:
				setExtensionPoint((ExtensionPoint)null);
				return;
			case UsecasePackage.EXTEND__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
				return basicGetReferencedElement() != null;
			case UsecasePackage.EXTEND__CLIENT:
				return basicGetClient() != null;
			case UsecasePackage.EXTEND__SUPPLIER:
				return basicGetSupplier() != null;
			case UsecasePackage.EXTEND__EXTENSION_POINT:
				return basicGetExtensionPoint() != null;
			case UsecasePackage.EXTEND__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
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
				case UsecasePackage.EXTEND__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.EXTEND__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExtendImpl
