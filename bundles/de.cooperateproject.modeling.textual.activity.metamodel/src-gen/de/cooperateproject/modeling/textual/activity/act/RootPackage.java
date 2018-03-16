/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.RootPackage#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.RootPackage#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.RootPackage#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getRootPackage()
 * @model
 * @generated
 */
public interface RootPackage extends PackageBase<RootPackage>, Container {

	/**
	 * Returns the value of the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Name</em>' attribute.
	 * @see #setActivityName(String)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getRootPackage_ActivityName()
	 * @model
	 * @generated
	 */
	String getActivityName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.RootPackage#getActivityName <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Name</em>' attribute.
	 * @see #getActivityName()
	 * @generated
	 */
	void setActivityName(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.act.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getRootPackage_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getRelations();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.act.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getRootPackage_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getChildren();
} // RootPackage
