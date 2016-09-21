/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImportImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImportImpl extends CDOObjectImpl implements PackageImport {
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
		return ClsPackage.Literals.PACKAGE_IMPORT;
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
	public org.eclipse.uml2.uml.PackageImport getReferencedElement() {
		return (org.eclipse.uml2.uml.PackageImport)eGet(ClsPackage.Literals.PACKAGE_IMPORT__REFERENCED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(org.eclipse.uml2.uml.PackageImport newReferencedElement) {
		eSet(ClsPackage.Literals.PACKAGE_IMPORT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.modeling.textual.cls.cls.Package getImportingNamespace() {
		return (de.cooperateproject.modeling.textual.cls.cls.Package)eGet(ClsPackage.Literals.PACKAGE_IMPORT__IMPORTING_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(de.cooperateproject.modeling.textual.cls.cls.Package newImportingNamespace) {
		eSet(ClsPackage.Literals.PACKAGE_IMPORT__IMPORTING_NAMESPACE, newImportingNamespace);
	}

} //PackageImportImpl
