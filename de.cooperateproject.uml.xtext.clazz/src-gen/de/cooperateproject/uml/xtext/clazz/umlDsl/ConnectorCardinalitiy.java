/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Cardinalitiy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getMiddle <em>Middle</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnectorCardinalitiy()
 * @model
 * @generated
 */
public interface ConnectorCardinalitiy extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(String)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnectorCardinalitiy_Left()
   * @model
   * @generated
   */
  String getLeft();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #getLeft()
   * @generated
   */
  void setLeft(String value);

  /**
   * Returns the value of the '<em><b>Middle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Middle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Middle</em>' attribute.
   * @see #setMiddle(String)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnectorCardinalitiy_Middle()
   * @model
   * @generated
   */
  String getMiddle();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getMiddle <em>Middle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Middle</em>' attribute.
   * @see #getMiddle()
   * @generated
   */
  void setMiddle(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ConnectorLabel)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getConnectorCardinalitiy_Right()
   * @model containment="true"
   * @generated
   */
  ConnectorLabel getRight();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ConnectorLabel value);

} // ConnectorCardinalitiy
