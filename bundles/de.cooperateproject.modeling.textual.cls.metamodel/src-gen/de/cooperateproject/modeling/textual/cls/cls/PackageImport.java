/**
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(org.eclipse.uml2.uml.PackageImport)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackageImport_ReferencedElement()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.PackageImport getReferencedElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(org.eclipse.uml2.uml.PackageImport value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getPackageImports <em>Package Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(de.cooperateproject.modeling.textual.cls.cls.Package)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackageImport_ImportingNamespace()
	 * @see de.cooperateproject.modeling.textual.cls.cls.Package#getPackageImports
	 * @model opposite="packageImports" required="true" transient="false"
	 * @generated
	 */
	de.cooperateproject.modeling.textual.cls.cls.Package getImportingNamespace();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(de.cooperateproject.modeling.textual.cls.cls.Package value);

} // PackageImport
