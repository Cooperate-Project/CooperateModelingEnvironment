/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.uml.PackageImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageImportImpl#getImportingPackage <em>Importing Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImportImpl extends UMLReferencingElementImpl<PackageImport> implements de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport {
	/**
	 * The default value of the '{@link #getImportedPackage() <em>Imported Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_PACKAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualCommonsPackage.Literals.PACKAGE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setReferencedElement(PackageImport newReferencedElement) {
		super.setReferencedElement(newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportedPackage() {
		return (String)eDynamicGet(TextualCommonsPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage(String newImportedPackage) {
		eDynamicSet(TextualCommonsPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE, newImportedPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageBase<?> getImportingPackage() {
		return (PackageBase<?>)eDynamicGet(TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTING_PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportingPackage(PackageBase<?> newImportingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportingPackage, TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingPackage(PackageBase<?> newImportingPackage) {
		eDynamicSet(TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTING_PACKAGE, newImportingPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportingPackage((PackageBase<?>)otherEnd, msgs);
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
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				return basicSetImportingPackage(null, msgs);
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
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS, PackageBase.class, msgs);
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
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return getImportedPackage();
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				return getImportingPackage();
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
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((String)newValue);
				return;
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				setImportingPackage((PackageBase<?>)newValue);
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
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage(IMPORTED_PACKAGE_EDEFAULT);
				return;
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				setImportingPackage((PackageBase<?>)null);
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
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return IMPORTED_PACKAGE_EDEFAULT == null ? getImportedPackage() != null : !IMPORTED_PACKAGE_EDEFAULT.equals(getImportedPackage());
			case TextualCommonsPackage.PACKAGE_IMPORT__IMPORTING_PACKAGE:
				return getImportingPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageImportImpl
