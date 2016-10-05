/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getActions <em>Actions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getForks <em>Forks</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ActivityDiagram extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.activity.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.activity.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.activity.Fork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram_Forks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fork> getForks();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.activity.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

} // ActivityDiagram
