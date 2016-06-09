/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElement#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityElement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ActivityElement extends CDOObject
{
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
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityElement_Comment()
   * @model containment="true"
   * @generated
   */
  Comment getComment();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElement#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(Comment value);

} // ActivityElement
