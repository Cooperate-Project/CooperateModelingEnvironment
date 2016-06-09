/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.DefRef#getLongName <em>Long Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.DefRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getDefRef()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DefRef extends CDOObject
{
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
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getDefRef_LongName()
   * @model
   * @generated
   */
  String getLongName();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.DefRef#getLongName <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' attribute.
   * @see #getLongName()
   * @generated
   */
  void setLongName(String value);

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
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getDefRef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.activity.DefRef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DefRef
