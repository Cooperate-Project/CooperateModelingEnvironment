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
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DIAGRAM_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getActivityElement()
   * @generated
   */
  int ACTIVITY_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT__COMMENT = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActionImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__COMMENT = ACTIVITY_ELEMENT__COMMENT;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__LONG_NAME = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OPERATION_COUNT = ACTIVITY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COMMENT = ACTIVITY_ELEMENT__COMMENT;

  /**
   * The feature id for the '<em><b>Condition Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_START = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_END = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATION_COUNT = ACTIVITY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.DefRefImpl <em>Def Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.DefRefImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getDefRef()
   * @generated
   */
  int DEF_REF = 10;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REF__LONG_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REF__NAME = 1;

  /**
   * The number of structural features of the '<em>Def Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REF_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Def Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REF_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl <em>Condition End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getConditionEnd()
   * @generated
   */
  int CONDITION_END = 4;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END__LONG_NAME = DEF_REF__LONG_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END__NAME = DEF_REF__NAME;

  /**
   * The number of structural features of the '<em>Condition End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END_FEATURE_COUNT = DEF_REF_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Condition End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_END_OPERATION_COUNT = DEF_REF_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl <em>Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getFork()
   * @generated
   */
  int FORK = 5;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__COMMENT = ACTIVITY_ELEMENT__COMMENT;

  /**
   * The feature id for the '<em><b>Fork Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__FORK_START = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fork End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__FORK_END = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_OPERATION_COUNT = ACTIVITY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl <em>Fork End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getForkEnd()
   * @generated
   */
  int FORK_END = 6;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END__LONG_NAME = DEF_REF__LONG_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END__NAME = DEF_REF__NAME;

  /**
   * The number of structural features of the '<em>Fork End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END_FEATURE_COUNT = DEF_REF_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Fork End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_END_OPERATION_COUNT = DEF_REF_OPERATION_COUNT + 0;

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
   * The feature id for the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__COMMENT = ACTIVITY_ELEMENT__COMMENT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__LEFT = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__RIGHT = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OPERATION_COUNT = ACTIVITY_ELEMENT_OPERATION_COUNT + 0;

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
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.DefReferenceImpl <em>Def Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.DefReferenceImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getDefReference()
   * @generated
   */
  int DEF_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REFERENCE__TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Def Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.StartAndEndImpl <em>Start And End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.StartAndEndImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartAndEnd()
   * @generated
   */
  int START_AND_END = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_AND_END__TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start And End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_AND_END_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Start And End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_AND_END_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.CommentImpl
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 12;

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
   * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.activity.StartAndEndEnum <em>Start And End Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.modeling.textual.activity.activity.StartAndEndEnum
   * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartAndEndEnum()
   * @generated
   */
  int START_AND_END_ENUM = 13;


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
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getElements()
   * @see #getActivityDiagram()
   * @generated
   */
  EReference getActivityDiagram_Elements();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityElement
   * @generated
   */
  EClass getActivityElement();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityElement#getComment()
   * @see #getActivityElement()
   * @generated
   */
  EReference getActivityElement_Comment();

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
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ConditionEnd <em>Condition End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ConditionEnd
   * @generated
   */
  EClass getConditionEnd();

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
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.ForkEnd <em>Fork End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.ForkEnd
   * @generated
   */
  EClass getForkEnd();

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
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.DefReference <em>Def Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Reference</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefReference
   * @generated
   */
  EClass getDefReference();

  /**
   * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.activity.activity.DefReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefReference#getType()
   * @see #getDefReference()
   * @generated
   */
  EReference getDefReference_Type();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.DefRef <em>Def Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Ref</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefRef
   * @generated
   */
  EClass getDefRef();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.DefRef#getLongName <em>Long Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Long Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefRef#getLongName()
   * @see #getDefRef()
   * @generated
   */
  EAttribute getDefRef_LongName();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.DefRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefRef#getName()
   * @see #getDefRef()
   * @generated
   */
  EAttribute getDefRef_Name();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.activity.StartAndEnd <em>Start And End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start And End</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartAndEnd
   * @generated
   */
  EClass getStartAndEnd();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.activity.StartAndEnd#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartAndEnd#getType()
   * @see #getStartAndEnd()
   * @generated
   */
  EAttribute getStartAndEnd_Type();

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
   * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.activity.activity.StartAndEndEnum <em>Start And End Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Start And End Enum</em>'.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartAndEndEnum
   * @generated
   */
  EEnum getStartAndEndEnum();

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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_DIAGRAM__ELEMENTS = eINSTANCE.getActivityDiagram_Elements();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityElementImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getActivityElement()
     * @generated
     */
    EClass ACTIVITY_ELEMENT = eINSTANCE.getActivityElement();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_ELEMENT__COMMENT = eINSTANCE.getActivityElement_Comment();

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
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl <em>Condition End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getConditionEnd()
     * @generated
     */
    EClass CONDITION_END = eINSTANCE.getConditionEnd();

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
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl <em>Fork End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ForkEndImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getForkEnd()
     * @generated
     */
    EClass FORK_END = eINSTANCE.getForkEnd();

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
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ReferenceImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.DefReferenceImpl <em>Def Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.DefReferenceImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getDefReference()
     * @generated
     */
    EClass DEF_REFERENCE = eINSTANCE.getDefReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_REFERENCE__TYPE = eINSTANCE.getDefReference_Type();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.DefRefImpl <em>Def Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.DefRefImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getDefRef()
     * @generated
     */
    EClass DEF_REF = eINSTANCE.getDefRef();

    /**
     * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_REF__LONG_NAME = eINSTANCE.getDefRef_LongName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_REF__NAME = eINSTANCE.getDefRef_Name();

    /**
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.impl.StartAndEndImpl <em>Start And End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.StartAndEndImpl
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartAndEnd()
     * @generated
     */
    EClass START_AND_END = eINSTANCE.getStartAndEnd();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START_AND_END__TYPE = eINSTANCE.getStartAndEnd_Type();

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
     * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.activity.StartAndEndEnum <em>Start And End Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.activity.activity.StartAndEndEnum
     * @see de.cooperateproject.modeling.textual.activity.activity.impl.ActivityPackageImpl#getStartAndEndEnum()
     * @generated
     */
    EEnum START_AND_END_ENUM = eINSTANCE.getStartAndEndEnum();

  }

} //ActivityPackage
