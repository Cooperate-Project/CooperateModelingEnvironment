/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionStart <em>Condition Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionEnd <em>Condition End</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getCondition()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Condition extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Condition Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Start</em>' containment reference.
	 * @see #setConditionStart(ConditionEnd)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getCondition_ConditionStart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionEnd getConditionStart();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionStart <em>Condition Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Start</em>' containment reference.
	 * @see #getConditionStart()
	 * @generated
	 */
	void setConditionStart(ConditionEnd value);

	/**
	 * Returns the value of the '<em><b>Condition End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition End</em>' containment reference.
	 * @see #setConditionEnd(ConditionEnd)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getCondition_ConditionEnd()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionEnd getConditionEnd();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionEnd <em>Condition End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition End</em>' containment reference.
	 * @see #getConditionEnd()
	 * @generated
	 */
	void setConditionEnd(ConditionEnd value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Comment)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getCondition_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

} // Condition
