/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getRootPackage <em>Root Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ClassDiagram extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Root Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Package</em>' containment reference.
	 * @see #setRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_RootPackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	de.cooperateproject.modeling.textual.cls.cls.Package getRootPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getRootPackage <em>Root Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Package</em>' containment reference.
	 * @see #getRootPackage()
	 * @generated
	 */
	void setRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package value);

} // ClassDiagram
