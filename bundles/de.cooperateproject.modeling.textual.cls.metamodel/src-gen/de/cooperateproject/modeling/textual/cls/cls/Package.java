/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getPackageImports <em>Package Imports</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Package#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement<org.eclipse.uml2.uml.Package>, PackageableElement {
	/**
	 * Returns the value of the '<em><b>Package Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.PackageImport}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Imports</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_PackageImports()
	 * @see de.cooperateproject.modeling.textual.cls.cls.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true"
	 * @generated
	 */
	EList<PackageImport> getPackageImports();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Classifier}&lt;? extends org.eclipse.uml2.uml.Classifier>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getClassifiers();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Owning Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Package</em>' container reference.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_OwningPackage()
	 * @see de.cooperateproject.modeling.textual.cls.cls.Package#getPackages
	 * @model opposite="packages" changeable="false" derived="true"
	 * @generated
	 */
	Package getOwningPackage();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Package}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getOwningPackage <em>Owning Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getPackage_Packages()
	 * @see de.cooperateproject.modeling.textual.cls.cls.Package#getOwningPackage
	 * @model opposite="owningPackage" containment="true"
	 * @generated
	 */
	EList<Package> getPackages();

} // Package
