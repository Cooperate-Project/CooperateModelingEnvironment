/**
 */
package de.cooperateproject.modeling.textual.activity.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getStart <em>Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getEnd <em>End</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork()
 * @model
 * @generated
 */
public interface Fork extends ActivityElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(ForkEnd)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork_Start()
	 * @model containment="true"
	 * @generated
	 */
	ForkEnd getStart();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ForkEnd value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(ForkEnd)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork_End()
	 * @model containment="true"
	 * @generated
	 */
	ForkEnd getEnd();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ForkEnd value);

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
