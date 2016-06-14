/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.Action;
import de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram;
import de.cooperateproject.modeling.textual.activity.activity.ActivityElementReference;
import de.cooperateproject.modeling.textual.activity.activity.ActivityFactory;
import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Association;
import de.cooperateproject.modeling.textual.activity.activity.Comment;
import de.cooperateproject.modeling.textual.activity.activity.Condition;
import de.cooperateproject.modeling.textual.activity.activity.ConditionEnd;
import de.cooperateproject.modeling.textual.activity.activity.Fork;
import de.cooperateproject.modeling.textual.activity.activity.ForkEnd;
import de.cooperateproject.modeling.textual.activity.activity.Name;
import de.cooperateproject.modeling.textual.activity.activity.Reference;
import de.cooperateproject.modeling.textual.activity.activity.StartEndEnum;
import de.cooperateproject.modeling.textual.activity.activity.StartEndReference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityPackageImpl extends EPackageImpl implements ActivityPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityDiagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forkEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityElementReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startEndReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum startEndEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ActivityPackageImpl()
  {
    super(eNS_URI, ActivityFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ActivityPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ActivityPackage init()
  {
    if (isInited) return (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);

    // Obtain or create and register package
    ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivityPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theActivityPackage.createPackageContents();

    // Initialize created meta-data
    theActivityPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theActivityPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ActivityPackage.eNS_URI, theActivityPackage);
    return theActivityPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityDiagram()
  {
    return activityDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityDiagram_Actions()
  {
    return (EReference)activityDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityDiagram_Conditions()
  {
    return (EReference)activityDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityDiagram_Forks()
  {
    return (EReference)activityDiagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityDiagram_Associations()
  {
    return (EReference)activityDiagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Name()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Comment()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_ConditionStart()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_ConditionEnd()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Comment()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionEnd()
  {
    return conditionEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionEnd_Name()
  {
    return (EReference)conditionEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFork()
  {
    return forkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFork_ForkStart()
  {
    return (EReference)forkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFork_ForkEnd()
  {
    return (EReference)forkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFork_Comment()
  {
    return (EReference)forkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForkEnd()
  {
    return forkEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForkEnd_Name()
  {
    return (EReference)forkEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_LongName()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_Name()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociation()
  {
    return associationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_Left()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_Right()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_Comment()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityElementReference()
  {
    return activityElementReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityElementReference_Type()
  {
    return (EReference)activityElementReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartEndReference()
  {
    return startEndReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStartEndReference_Type()
  {
    return (EAttribute)startEndReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Description()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStartEndEnum()
  {
    return startEndEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityFactory getActivityFactory()
  {
    return (ActivityFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    activityDiagramEClass = createEClass(ACTIVITY_DIAGRAM);
    createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__ACTIONS);
    createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__CONDITIONS);
    createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__FORKS);
    createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__ASSOCIATIONS);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__COMMENT);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__CONDITION_START);
    createEReference(conditionEClass, CONDITION__CONDITION_END);
    createEReference(conditionEClass, CONDITION__COMMENT);

    conditionEndEClass = createEClass(CONDITION_END);
    createEReference(conditionEndEClass, CONDITION_END__NAME);

    forkEClass = createEClass(FORK);
    createEReference(forkEClass, FORK__FORK_START);
    createEReference(forkEClass, FORK__FORK_END);
    createEReference(forkEClass, FORK__COMMENT);

    forkEndEClass = createEClass(FORK_END);
    createEReference(forkEndEClass, FORK_END__NAME);

    nameEClass = createEClass(NAME);
    createEAttribute(nameEClass, NAME__LONG_NAME);
    createEAttribute(nameEClass, NAME__NAME);

    associationEClass = createEClass(ASSOCIATION);
    createEReference(associationEClass, ASSOCIATION__LEFT);
    createEReference(associationEClass, ASSOCIATION__RIGHT);
    createEReference(associationEClass, ASSOCIATION__COMMENT);

    referenceEClass = createEClass(REFERENCE);

    activityElementReferenceEClass = createEClass(ACTIVITY_ELEMENT_REFERENCE);
    createEReference(activityElementReferenceEClass, ACTIVITY_ELEMENT_REFERENCE__TYPE);

    startEndReferenceEClass = createEClass(START_END_REFERENCE);
    createEAttribute(startEndReferenceEClass, START_END_REFERENCE__TYPE);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__DESCRIPTION);

    // Create enums
    startEndEnumEEnum = createEEnum(START_END_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    activityElementReferenceEClass.getESuperTypes().add(this.getReference());
    startEndReferenceEClass.getESuperTypes().add(this.getReference());

    // Initialize classes, features, and operations; add parameters
    initEClass(activityDiagramEClass, ActivityDiagram.class, "ActivityDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityDiagram_Actions(), this.getAction(), null, "actions", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityDiagram_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityDiagram_Forks(), this.getFork(), null, "forks", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityDiagram_Associations(), this.getAssociation(), null, "associations", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_Name(), this.getName_(), null, "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Comment(), this.getComment(), null, "comment", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_ConditionStart(), this.getConditionEnd(), null, "conditionStart", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_ConditionEnd(), this.getConditionEnd(), null, "conditionEnd", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Comment(), this.getComment(), null, "comment", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEndEClass, ConditionEnd.class, "ConditionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionEnd_Name(), this.getName_(), null, "name", null, 0, 1, ConditionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFork_ForkStart(), this.getForkEnd(), null, "forkStart", null, 0, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFork_ForkEnd(), this.getForkEnd(), null, "forkEnd", null, 0, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFork_Comment(), this.getComment(), null, "comment", null, 0, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forkEndEClass, ForkEnd.class, "ForkEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForkEnd_Name(), this.getName_(), null, "name", null, 0, 1, ForkEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getName_LongName(), theEcorePackage.getEString(), "longName", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getName_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssociation_Left(), this.getReference(), null, "left", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssociation_Right(), this.getReference(), null, "right", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssociation_Comment(), this.getComment(), null, "comment", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityElementReferenceEClass, ActivityElementReference.class, "ActivityElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityElementReference_Type(), this.getName_(), null, "type", null, 0, 1, ActivityElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startEndReferenceEClass, StartEndReference.class, "StartEndReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStartEndReference_Type(), this.getStartEndEnum(), "type", null, 0, 1, StartEndReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(startEndEnumEEnum, StartEndEnum.class, "StartEndEnum");
    addEEnumLiteral(startEndEnumEEnum, StartEndEnum.START);
    addEEnumLiteral(startEndEnumEEnum, StartEndEnum.END);

    // Create resource
    createResource(eNS_URI);
  }

} //ActivityPackageImpl
