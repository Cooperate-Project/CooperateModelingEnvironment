/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getPackageImports <em>Package Imports</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ClassDiagram extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Package Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Imports</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_PackageImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageImport> getPackageImports();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Classifier}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier<?>> getClassifiers();

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
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // ClassDiagram
