/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends EObject
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
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage#getAssociationEnd_Type()
   * @model
   * @generated
   */
  ClassName getType();

  /**
   * Sets the value of the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ClassName value);

} // AssociationEnd
