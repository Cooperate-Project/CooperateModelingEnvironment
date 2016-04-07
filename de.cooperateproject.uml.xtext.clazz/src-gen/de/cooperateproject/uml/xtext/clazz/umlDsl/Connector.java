/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Element
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
   * @see #setLeft(AssociationEnd)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnector_Left()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getLeft();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(AssociationEnd value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AssociationEnd)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnector_Right()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getRight();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AssociationEnd value);

} // Connector
