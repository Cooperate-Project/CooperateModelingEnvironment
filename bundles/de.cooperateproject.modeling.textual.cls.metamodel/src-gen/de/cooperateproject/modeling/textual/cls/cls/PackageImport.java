/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackageImport()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PackageImport extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(org.eclipse.uml2.uml.Package)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackageImport_Package()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.eclipse.uml2.uml.Package value);

} // PackageImport
