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
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkStart <em>Fork Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkEnd <em>Fork End</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getFork()
 * @model
 * @generated
 */
public interface Fork extends ActivityElement
{
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
   * @model containment="true"
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
   * @model containment="true"
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

} // Fork
