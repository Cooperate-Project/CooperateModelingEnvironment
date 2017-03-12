/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportingPackage <em>Importing Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport extends UMLReferencingElement<org.eclipse.uml2.uml.PackageImport> {
	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Package</em>' attribute.
	 * @see #setImportedPackage(String)
	 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageImport_ImportedPackage()
	 * @model required="true"
	 * @generated
	 */
	String getImportedPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportedPackage <em>Imported Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package</em>' attribute.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(String value);

	/**
	 * Returns the value of the '<em><b>Importing Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackageImports <em>Package Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Package</em>' container reference.
	 * @see #setImportingPackage(PackageBase)
	 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageImport_ImportingPackage()
	 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackageImports
	 * @model opposite="packageImports" required="true" transient="false"
	 * @generated
	 */
	PackageBase<?> getImportingPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportingPackage <em>Importing Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Package</em>' container reference.
	 * @see #getImportingPackage()
	 * @generated
	 */
	void setImportingPackage(PackageBase<?> value);

} // PackageImport
