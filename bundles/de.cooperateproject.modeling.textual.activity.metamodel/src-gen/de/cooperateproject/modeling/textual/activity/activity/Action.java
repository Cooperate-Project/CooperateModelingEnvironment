/**
 */
package de.cooperateproject.modeling.textual.activity.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Action#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Action#getLongName <em>Long Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Action#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends ActivityElement, DefRef {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAction_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #setLongName(String)
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAction_LongName()
	 * @model unique="false"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Action#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

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
	 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAction_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Action#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

} // Action
