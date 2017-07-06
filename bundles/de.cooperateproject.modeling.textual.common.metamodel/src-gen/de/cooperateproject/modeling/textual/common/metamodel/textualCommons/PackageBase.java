/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackageImports <em>Package Imports</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageBase()
 * @model abstract="true"
 * @generated
 */
public interface PackageBase<PackageType extends PackageBase<?>> extends PackageableElement, UMLReferencingElement<org.eclipse.uml2.uml.Package>, NamedElement {
	/**
     * Returns the value of the '<em><b>Owning Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Package</em>' container reference.
     * @see #setOwningPackage(PackageBase)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageBase_OwningPackage()
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackages
     * @model opposite="packages"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/commons!PackageBase{PackageType}!owningPackage'"
     * @generated
     */
	PackageType getOwningPackage();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getOwningPackage <em>Owning Package</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Package</em>' container reference.
     * @see #getOwningPackage()
     * @generated
     */
	void setOwningPackage(PackageType value);

	/**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getOwningPackage <em>Owning Package</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageBase_Packages()
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getOwningPackage
     * @model opposite="owningPackage" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/commons!PackageBase{PackageType}!packages'"
     * @generated
     */
	EList<PackageType> getPackages();

	/**
     * Returns the value of the '<em><b>Package Imports</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportingPackage <em>Importing Package</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Package Imports</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getPackageBase_PackageImports()
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportingPackage
     * @model opposite="importingPackage" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/commons!PackageBase{PackageType}!packageImports'"
     * @generated
     */
	EList<PackageImport> getPackageImports();

} // PackageBase
