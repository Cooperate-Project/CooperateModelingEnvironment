/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

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
 * @see de.cooperateproject.modeling.textual.activity.act.ActFactory
 * @model kind="package"
 * @generated
 */
public interface ActPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "act";

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
	String eNS_PREFIX = "act";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActPackage eINSTANCE = de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Root Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ROOT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITY_NAME = 2;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl <em>Root Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getRootPackage()
	 * @generated
	 */
	int ROOT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__REFERENCED_ELEMENT = TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__NAME = TextualCommonsPackage.PACKAGE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__OWNING_PACKAGE = TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__PACKAGES = TextualCommonsPackage.PACKAGE_BASE__PACKAGES;

	/**
	 * The feature id for the '<em><b>Package Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__PACKAGE_IMPORTS = TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__NODES = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__RELATIONS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE_FEATURE_COUNT = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE___GET_NEAREST_PACKAGE = TextualCommonsPackage.PACKAGE_BASE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.PACKAGE_BASE___GET_UML_PARENT_NAMESPACE;

	/**
	 * The number of operations of the '<em>Root Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE_OPERATION_COUNT = TextualCommonsPackage.PACKAGE_BASE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.NodeImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ControlNodeImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActivityNodeImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ALIAS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 5;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__RELATED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.NodeType
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getTitle()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Title();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getRootPackage <em>Root Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Package</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getRootPackage()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_RootPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getActivityName <em>Activity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Name</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getActivityName()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_ActivityName();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.RootPackage <em>Root Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Package</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.RootPackage
	 * @generated
	 */
	EClass getRootPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.act.RootPackage#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.RootPackage#getNodes()
	 * @see #getRootPackage()
	 * @generated
	 */
	EReference getRootPackage_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.activity.act.RootPackage#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.RootPackage#getRelations()
	 * @see #getRootPackage()
	 * @generated
	 */
	EReference getRootPackage_Relations();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.act.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.act.ControlNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ControlNode#getType()
	 * @see #getControlNode()
	 * @generated
	 */
	EAttribute getControlNode_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.act.ActivityNode#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityNode#getAlias()
	 * @see #getActivityNode()
	 * @generated
	 */
	EAttribute getActivityNode_Alias();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference list '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getRelatedElements <em>Related Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Elements</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.Flow#getRelatedElements()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_RelatedElements();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.activity.act.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActFactory getActFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__TITLE = eINSTANCE.getActivityDiagram_Title();

		/**
		 * The meta object literal for the '<em><b>Root Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ROOT_PACKAGE = eINSTANCE.getActivityDiagram_RootPackage();

		/**
		 * The meta object literal for the '<em><b>Activity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__ACTIVITY_NAME = eINSTANCE.getActivityDiagram_ActivityName();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl <em>Root Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getRootPackage()
		 * @generated
		 */
		EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_PACKAGE__NODES = eINSTANCE.getRootPackage_Nodes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_PACKAGE__RELATIONS = eINSTANCE.getRootPackage_Relations();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.NodeImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ControlNodeImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_NODE__TYPE = eINSTANCE.getControlNode_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActivityNodeImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE__ALIAS = eINSTANCE.getActivityNode_Alias();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Related Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__RELATED_ELEMENTS = eINSTANCE.getFlow_RelatedElements();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.NodeType
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

	}

} //ActPackage
