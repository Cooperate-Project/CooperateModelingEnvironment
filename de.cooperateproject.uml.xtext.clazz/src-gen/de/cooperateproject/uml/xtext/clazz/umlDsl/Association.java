/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Connector
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(ConnectorCardinalitiy)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getAssociation_Cardinality()
   * @model containment="true"
   * @generated
   */
  ConnectorCardinalitiy getCardinality();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(ConnectorCardinalitiy value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(String)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getAssociation_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

} // Association
