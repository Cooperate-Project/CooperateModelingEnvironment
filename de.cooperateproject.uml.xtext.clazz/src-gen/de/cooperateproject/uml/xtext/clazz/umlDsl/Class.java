/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Element
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ClassName)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getClass_Type()
   * @model
   * @generated
   */
  ClassName getType();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ClassName value);

  /**
   * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance</em>' containment reference.
   * @see #setInheritance(Inheritance)
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getClass_Inheritance()
   * @model containment="true"
   * @generated
   */
  Inheritance getInheritance();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getInheritance <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inheritance</em>' containment reference.
   * @see #getInheritance()
   * @generated
   */
  void setInheritance(Inheritance value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link de.cooperateproject.uml.xtext.clazz.umlDsl.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getClass_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Class
