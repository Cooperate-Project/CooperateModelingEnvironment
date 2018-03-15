/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActFactory;
import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.ActionNode;
import de.cooperateproject.modeling.textual.activity.act.ActivityDiagram;
import de.cooperateproject.modeling.textual.activity.act.ControlNode;
import de.cooperateproject.modeling.textual.activity.act.DecisionNode;
import de.cooperateproject.modeling.textual.activity.act.FinalNode;
import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.activity.act.FlowFinalNode;
import de.cooperateproject.modeling.textual.activity.act.InitialNode;
import de.cooperateproject.modeling.textual.activity.act.MergeNode;
import de.cooperateproject.modeling.textual.activity.act.Node;
import de.cooperateproject.modeling.textual.activity.act.RootPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActPackageImpl extends EPackageImpl implements ActPackage {
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
	private EClass rootPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

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
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActPackageImpl() {
		super(eNS_URI, ActFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActPackage init() {
		if (isInited) return (ActPackage)EPackage.Registry.INSTANCE.getEPackage(ActPackage.eNS_URI);

		// Obtain or create and register package
		ActPackageImpl theActPackage = (ActPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TextualCommonsPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActPackage.createPackageContents();

		// Initialize created meta-data
		theActPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActPackage.eNS_URI, theActPackage);
		return theActPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDiagram() {
		return activityDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDiagram_Title() {
		return (EAttribute)activityDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDiagram_RootPackage() {
		return (EReference)activityDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootPackage() {
		return rootPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootPackage_Nodes() {
		return (EReference)rootPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootPackage_Relations() {
		return (EReference)rootPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootPackage_ActivityName() {
		return (EAttribute)rootPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionNode() {
		return actionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionNode_Alias() {
		return (EAttribute)actionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_RelatedElements() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Condition() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActFactory getActFactory() {
		return (ActFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityDiagramEClass = createEClass(ACTIVITY_DIAGRAM);
		createEAttribute(activityDiagramEClass, ACTIVITY_DIAGRAM__TITLE);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__ROOT_PACKAGE);

		rootPackageEClass = createEClass(ROOT_PACKAGE);
		createEReference(rootPackageEClass, ROOT_PACKAGE__NODES);
		createEReference(rootPackageEClass, ROOT_PACKAGE__RELATIONS);
		createEAttribute(rootPackageEClass, ROOT_PACKAGE__ACTIVITY_NAME);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);

		controlNodeEClass = createEClass(CONTROL_NODE);

		actionNodeEClass = createEClass(ACTION_NODE);
		createEAttribute(actionNodeEClass, ACTION_NODE__ALIAS);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__RELATED_ELEMENTS);
		createEAttribute(flowEClass, FLOW__CONDITION);

		initialNodeEClass = createEClass(INITIAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);

		mergeNodeEClass = createEClass(MERGE_NODE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TextualCommonsPackage theTextualCommonsPackage = (TextualCommonsPackage)EPackage.Registry.INSTANCE.getEPackage(TextualCommonsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTextualCommonsPackage.getPackageBase());
		EGenericType g2 = createEGenericType(this.getRootPackage());
		g1.getETypeArguments().add(g2);
		rootPackageEClass.getEGenericSuperTypes().add(g1);
		controlNodeEClass.getESuperTypes().add(this.getNode());
		actionNodeEClass.getESuperTypes().add(this.getNode());
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getRelationship());
		g1.getETypeArguments().add(g2);
		flowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControlNode());
		initialNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getInitialNode());
		g1.getETypeArguments().add(g2);
		initialNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControlNode());
		finalNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getFinalNode());
		g1.getETypeArguments().add(g2);
		finalNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControlNode());
		flowFinalNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getFlowFinalNode());
		g1.getETypeArguments().add(g2);
		flowFinalNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControlNode());
		decisionNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getDecisionNode());
		g1.getETypeArguments().add(g2);
		decisionNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControlNode());
		mergeNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getMergeNode());
		g1.getETypeArguments().add(g2);
		mergeNodeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(activityDiagramEClass, ActivityDiagram.class, "ActivityDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityDiagram_Title(), theEcorePackage.getEString(), "title", null, 1, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_RootPackage(), this.getRootPackage(), null, "rootPackage", null, 1, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootPackageEClass, RootPackage.class, "RootPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootPackage_Nodes(), this.getNode(), null, "nodes", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootPackage_Relations(), this.getFlow(), null, "relations", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRootPackage_ActivityName(), ecorePackage.getEString(), "activityName", null, 0, 1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), theTypesPackage.getString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionNodeEClass, ActionNode.class, "ActionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionNode_Alias(), theTypesPackage.getString(), "alias", "", 0, 1, ActionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_RelatedElements(), this.getNode(), null, "relatedElements", null, 2, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Condition(), theTypesPackage.getString(), "condition", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ActPackageImpl
