/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getRootPackage <em>Root Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivityDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ActivityDiagram extends CDOObject {
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
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivityDiagram_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Root Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Package</em>' reference.
	 * @see #setRootPackage(RootPackage)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivityDiagram_RootPackage()
	 * @model required="true"
	 * @generated
	 */
	RootPackage getRootPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getRootPackage <em>Root Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Package</em>' reference.
	 * @see #getRootPackage()
	 * @generated
	 */
	void setRootPackage(RootPackage value);

} // ActivityDiagram
