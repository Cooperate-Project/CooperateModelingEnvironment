/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkStart <em>Fork Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkEnd <em>Fork End</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Fork extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Fork Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork Start</em>' containment reference.
	 * @see #setForkStart(ForkEnd)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork_ForkStart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ForkEnd getForkStart();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkStart <em>Fork Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork Start</em>' containment reference.
	 * @see #getForkStart()
	 * @generated
	 */
	void setForkStart(ForkEnd value);

	/**
	 * Returns the value of the '<em><b>Fork End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork End</em>' containment reference.
	 * @see #setForkEnd(ForkEnd)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork_ForkEnd()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ForkEnd getForkEnd();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkEnd <em>Fork End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork End</em>' containment reference.
	 * @see #getForkEnd()
	 * @generated
	 */
	void setForkEnd(ForkEnd value);

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
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

} // Fork
