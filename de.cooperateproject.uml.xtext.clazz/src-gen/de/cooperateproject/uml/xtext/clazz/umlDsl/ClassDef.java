/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getClassDef()
 * @model
 * @generated
 */
public interface ClassDef extends Element
{
  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getClassDef_Classes()
   * @model containment="true"
   * @generated
   */
  EList<ClassName> getClasses();

} // ClassDef
