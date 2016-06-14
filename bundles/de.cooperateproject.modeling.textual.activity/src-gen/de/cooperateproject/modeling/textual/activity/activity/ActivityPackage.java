/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityFactory
 * @model kind="package"
 * @generated
 */
public interface ActivityPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "activity";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cooperateproject.de/modeling/textual/activity/Activity";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "activity";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ActivityPackage eINSTANCE = de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getActivityDiagram()
   * @generated
   */
  int ACTIVITY_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM__ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM__CONDITIONS = 1;

  /**
   * The feature id for the '<em><b>Forks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM__FORKS = 2;

  /**
   * The feature id for the '<em><b>Associations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM__ASSOCIATIONS = 3;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActionImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getAction()
   * @generated
   */
  int ACTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__COMMENT = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 2;

  /**
   * The feature id for the '<em><b>Condition Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_START = 0;

  /**
   * The feature id for the '<em><b>Condition End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_END = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COMMENT = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl <em>Condition End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getConditionEnd()
   * @generated
   */
  int CONDITION_END = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END__NAME = 0;

  /**
   * The number of structural features of the '<em>Condition End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Condition End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl <em>Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getFork()
   * @generated
   */
  int FORK = 4;

  /**
   * The feature id for the '<em><b>Fork Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__FORK_START = 0;

  /**
   * The feature id for the '<em><b>Fork End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__FORK_END = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__COMMENT = 2;

  /**
   * The number of structural features of the '<em>Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl <em>Fork End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getForkEnd()
   * @generated
   */
  int FORK_END = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END__NAME = 0;

  /**
   * The number of structural features of the '<em>Fork End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Fork End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.NameImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getName_()
   * @generated
   */
  int NAME = 6;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__LONG_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = 1;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__COMMENT = 2;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ReferenceImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 8;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementReferenceImpl <em>Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementReferenceImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getActivityElementReference()
   * @generated
   */
  int ACTIVITY_ELEMENT_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_REFERENCE__TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.StartEndReferenceImpl <em>Start End Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.StartEndReferenceImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartEndReference()
   * @generated
   */
  int START_END_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_END_REFERENCE__TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start End Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_END_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Start End Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_END_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.CommentImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 11;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.StartEndEnum <em>Start End Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.StartEndEnum
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartEndEnum()
   * @generated
   */
  int START_END_ENUM = 12;


  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram
   * @generated
   */
  EClass getActivityDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getActions()
   * @see #getActivityDiagram()
   * @generated
   */
  EReference getActivityDiagram_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getConditions()
   * @see #getActivityDiagram()
   * @generated
   */
  EReference getActivityDiagram_Conditions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getForks <em>Forks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Forks</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getForks()
   * @see #getActivityDiagram()
   * @generated
   */
  EReference getActivityDiagram_Forks();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getAssociations <em>Associations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Associations</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getAssociations()
   * @see #getActivityDiagram()
   * @generated
   */
  EReference getActivityDiagram_Associations();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Action#getName()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Action#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Action#getComment()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Comment();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionStart <em>Condition Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Start</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionStart()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionStart();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionEnd <em>Condition End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Condition#getConditionEnd()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Condition#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Condition#getComment()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Comment();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ConditionEnd <em>Condition End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ConditionEnd
   * @generated
   */
  EClass getConditionEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.ConditionEnd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ConditionEnd#getName()
   * @see #getConditionEnd()
   * @generated
   */
  EReference getConditionEnd_Name();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Fork <em>Fork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Fork
   * @generated
   */
  EClass getFork();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkStart <em>Fork Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fork Start</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Fork#getForkStart()
   * @see #getFork()
   * @generated
   */
  EReference getFork_ForkStart();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getForkEnd <em>Fork End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fork End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Fork#getForkEnd()
   * @see #getFork()
   * @generated
   */
  EReference getFork_ForkEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Fork#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Fork#getComment()
   * @see #getFork()
   * @generated
   */
  EReference getFork_Comment();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ForkEnd <em>Fork End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ForkEnd
   * @generated
   */
  EClass getForkEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.ForkEnd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ForkEnd#getName()
   * @see #getForkEnd()
   * @generated
   */
  EReference getForkEnd_Name();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.Name#getLongName <em>Long Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Long Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Name#getLongName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_LongName();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Name#getName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Name();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Association#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Association#getLeft()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Association#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Association#getRight()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Right();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.Association#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Association#getComment()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Comment();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Reference</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference
   * @generated
   */
  EClass getActivityElementReference();

  /**
   * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference#getType()
   * @see #getActivityElementReference()
   * @generated
   */
  EReference getActivityElementReference_Type();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.StartEndReference <em>Start End Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start End Reference</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartEndReference
   * @generated
   */
  EClass getStartEndReference();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.StartEndReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartEndReference#getType()
   * @see #getStartEndReference()
   * @generated
   */
  EAttribute getStartEndReference_Type();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.Comment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Comment#getDescription()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Description();

  /**
   * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.activity.activity.StartEndEnum <em>Start End Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Start End Enum</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartEndEnum
   * @generated
   */
  EEnum getStartEndEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ActivityFactory getActivityFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getActivityDiagram()
     * @generated
     */
    EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_DIAGRAM__ACTIONS = eINSTANCE.getActivityDiagram_Actions();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_DIAGRAM__CONDITIONS = eINSTANCE.getActivityDiagram_Conditions();

    /**
     * The meta object literal for the '<em><b>Forks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_DIAGRAM__FORKS = eINSTANCE.getActivityDiagram_Forks();

    /**
     * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_DIAGRAM__ASSOCIATIONS = eINSTANCE.getActivityDiagram_Associations();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActionImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__COMMENT = eINSTANCE.getAction_Comment();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Condition Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_START = eINSTANCE.getCondition_ConditionStart();

    /**
     * The meta object literal for the '<em><b>Condition End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_END = eINSTANCE.getCondition_ConditionEnd();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__COMMENT = eINSTANCE.getCondition_Comment();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl <em>Condition End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getConditionEnd()
     * @generated
     */
    EClass CONDITION_END = eINSTANCE.getConditionEnd();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_END__NAME = eINSTANCE.getConditionEnd_Name();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl <em>Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getFork()
     * @generated
     */
    EClass FORK = eINSTANCE.getFork();

    /**
     * The meta object literal for the '<em><b>Fork Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK__FORK_START = eINSTANCE.getFork_ForkStart();

    /**
     * The meta object literal for the '<em><b>Fork End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK__FORK_END = eINSTANCE.getFork_ForkEnd();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK__COMMENT = eINSTANCE.getFork_Comment();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl <em>Fork End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getForkEnd()
     * @generated
     */
    EClass FORK_END = eINSTANCE.getForkEnd();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK_END__NAME = eINSTANCE.getForkEnd_Name();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.NameImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__LONG_NAME = eINSTANCE.getName_LongName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NAME = eINSTANCE.getName_Name();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__LEFT = eINSTANCE.getAssociation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__RIGHT = eINSTANCE.getAssociation_Right();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__COMMENT = eINSTANCE.getAssociation_Comment();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ReferenceImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementReferenceImpl <em>Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementReferenceImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getActivityElementReference()
     * @generated
     */
    EClass ACTIVITY_ELEMENT_REFERENCE = eINSTANCE.getActivityElementReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_ELEMENT_REFERENCE__TYPE = eINSTANCE.getActivityElementReference_Type();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.StartEndReferenceImpl <em>Start End Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.StartEndReferenceImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartEndReference()
     * @generated
     */
    EClass START_END_REFERENCE = eINSTANCE.getStartEndReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START_END_REFERENCE__TYPE = eINSTANCE.getStartEndReference_Type();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.CommentImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__DESCRIPTION = eINSTANCE.getComment_Description();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.StartEndEnum <em>Start End Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.StartEndEnum
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartEndEnum()
     * @generated
     */
    EEnum START_END_ENUM = eINSTANCE.getStartEndEnum();

  }

} //ActivityPackage
