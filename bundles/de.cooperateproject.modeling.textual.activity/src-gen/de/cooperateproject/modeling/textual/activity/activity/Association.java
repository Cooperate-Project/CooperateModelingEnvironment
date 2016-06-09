/**
 */
package de.cooperateproject.modeling.textual.activity.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Association#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.Association#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends ActivityElement
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Reference)
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAssociation_Left()
   * @model containment="true"
   * @generated
   */
  Reference getLeft();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Association#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Reference value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Reference)
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getAssociation_Right()
   * @model containment="true"
   * @generated
   */
  Reference getRight();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.Association#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Reference value);

} // Association
