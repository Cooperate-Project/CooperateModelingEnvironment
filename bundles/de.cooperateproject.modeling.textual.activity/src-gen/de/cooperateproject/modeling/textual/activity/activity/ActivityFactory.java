/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage
 * @generated
 */
public interface ActivityFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ActivityFactory eINSTANCE = de.cooperateproject.modeling.textual.activity.activity.impl.ActivityFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  ActivityDiagram createActivityDiagram();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  ActivityElement createActivityElement();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Condition End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition End</em>'.
   * @generated
   */
  ConditionEnd createConditionEnd();

  /**
   * Returns a new object of class '<em>Fork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fork</em>'.
   * @generated
   */
  Fork createFork();

  /**
   * Returns a new object of class '<em>Fork End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fork End</em>'.
   * @generated
   */
  ForkEnd createForkEnd();

  /**
   * Returns a new object of class '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Association</em>'.
   * @generated
   */
  Association createAssociation();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Def Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Reference</em>'.
   * @generated
   */
  DefReference createDefReference();

  /**
   * Returns a new object of class '<em>Def Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Ref</em>'.
   * @generated
   */
  DefRef createDefRef();

  /**
   * Returns a new object of class '<em>Start And End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start And End</em>'.
   * @generated
   */
  StartAndEnd createStartAndEnd();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ActivityPackage getActivityPackage();

} //ActivityFactory
