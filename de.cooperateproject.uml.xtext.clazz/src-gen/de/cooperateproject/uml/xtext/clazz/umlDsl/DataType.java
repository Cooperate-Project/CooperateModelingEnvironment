/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.DataType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Element, Type
{
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
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.DataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DataType
