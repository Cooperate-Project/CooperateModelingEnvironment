/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpFactory
 * @model kind="package"
 * @generated
 */
public interface CmpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cmp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cooperateproject.de/modeling/textual/component/Component";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cmp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CmpPackage eINSTANCE = de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ComponentDiagramImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getComponentDiagram()
     * @generated
     */
    int COMPONENT_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM__TITLE = 0;

    /**
     * The feature id for the '<em><b>Rootpackage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM__ROOTPACKAGE = 1;

    /**
     * The number of structural features of the '<em>Component Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Component Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.RootPackageImpl <em>Root Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.RootPackageImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getRootPackage()
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
     * The feature id for the '<em><b>Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__RELATIONS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__CLASSIFIERS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 1;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierRelationImpl <em>Classifier Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierRelationImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getClassifierRelation()
     * @generated
     */
    int CLASSIFIER_RELATION = 2;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION__LEFT_CLASSIFIER = 0;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION__RIGHT_CLASSIFIER = 1;

    /**
     * The number of structural features of the '<em>Classifier Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Classifier Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_RELATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getConnector()
     * @generated
     */
    int CONNECTOR = 3;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connector Ends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__CONNECTOR_ENDS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorEndImpl <em>Connector End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorEndImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getConnectorEnd()
     * @generated
     */
    int CONNECTOR_END = 4;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Part</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END__PART = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END__ROLE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Connector End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Connector End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_END_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.GeneralizationImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getGeneralization()
     * @generated
     */
    int GENERALIZATION = 5;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__LEFT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__RIGHT_CLASSIFIER = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getClassifier()
     * @generated
     */
    int CLASSIFIER = 6;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__REFERENCED_ELEMENT = TextualCommonsPackage.COMMENTABLE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__COMMENTS = TextualCommonsPackage.COMMENTABLE__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__NAME = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__ALIAS = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_FEATURE_COUNT = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_NEAREST_PACKAGE = TextualCommonsPackage.COMMENTABLE___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.COMMENTABLE___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_OPERATION_COUNT = TextualCommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 7;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VISIBILITY = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__STATIC = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__TYPE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 8;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__COMMENTS = CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ALIAS = CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Interface Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__INTERFACE_RELATION = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ATTRIBUTES = CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PORT = CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__CONNECTORS = CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Packaged Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PACKAGED_ELEMENTS = CLASSIFIER_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT___GET_NEAREST_PACKAGE = CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT___GET_UML_PARENT_NAMESPACE = CLASSIFIER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ClassImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getClass_()
     * @generated
     */
    int CLASS = 9;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__COMMENTS = CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__ALIAS = CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Interface Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__INTERFACE_RELATION = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_NEAREST_PACKAGE = CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_UML_PARENT_NAMESPACE = CLASSIFIER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getInterfaceProvidingRequiringEntity()
     * @generated
     */
    int INTERFACE_PROVIDING_REQUIRING_ENTITY = 10;

    /**
     * The feature id for the '<em><b>Interface Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_RELATION = 0;

    /**
     * The number of structural features of the '<em>Interface Providing Requiring Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Interface Providing Requiring Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 11;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__COMMENTS = CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ALIAS = CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__MEMBERS = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_NEAREST_PACKAGE = CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_UML_PARENT_NAMESPACE = CLASSIFIER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.MemberImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getMember()
     * @generated
     */
    int MEMBER = 15;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__REFERENCED_ELEMENT = PROPERTY__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__VISIBILITY = PROPERTY__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__STATIC = PROPERTY__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__TYPE = PROPERTY__TYPE;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_NEAREST_PACKAGE = PROPERTY___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_UML_PARENT_NAMESPACE = PROPERTY___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.MethodImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getMethod()
     * @generated
     */
    int METHOD = 12;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__REFERENCED_ELEMENT = MEMBER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__VISIBILITY = MEMBER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__STATIC = MEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__TYPE = MEMBER__TYPE;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__ABSTRACT = MEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_NEAREST_PACKAGE = MEMBER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_UML_PARENT_NAMESPACE = MEMBER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ParameterImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 13;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__REFERENCED_ELEMENT = PROPERTY__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__VISIBILITY = PROPERTY__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__STATIC = PROPERTY__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE = PROPERTY__TYPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__OWNER = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_NEAREST_PACKAGE = PROPERTY___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_UML_PARENT_NAMESPACE = PROPERTY___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.AttributeImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 14;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REFERENCED_ELEMENT = MEMBER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VISIBILITY = MEMBER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__STATIC = MEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = MEMBER__TYPE;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE___GET_NEAREST_PACKAGE = MEMBER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE___GET_UML_PARENT_NAMESPACE = MEMBER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceRelationImpl <em>Interface Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceRelationImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getInterfaceRelation()
     * @generated
     */
    int INTERFACE_RELATION = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__NAME = TextualCommonsPackage.ALIASED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__ALIAS = TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__INTERFACE = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interface Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION_FEATURE_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.ALIASED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Interface Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION_OPERATION_COUNT = TextualCommonsPackage.ALIASED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ProvideImpl <em>Provide</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.ProvideImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getProvide()
     * @generated
     */
    int PROVIDE = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__NAME = INTERFACE_RELATION__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__ALIAS = INTERFACE_RELATION__ALIAS;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__INTERFACE = INTERFACE_RELATION__INTERFACE;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE__REFERENCED_ELEMENT = INTERFACE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Provide</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_FEATURE_COUNT = INTERFACE_RELATION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE___GET_NEAREST_PACKAGE = INTERFACE_RELATION___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE___GET_UML_PARENT_NAMESPACE = INTERFACE_RELATION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Provide</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_OPERATION_COUNT = INTERFACE_RELATION_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.RequireImpl <em>Require</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.RequireImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getRequire()
     * @generated
     */
    int REQUIRE = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__NAME = INTERFACE_RELATION__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__ALIAS = INTERFACE_RELATION__ALIAS;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__INTERFACE = INTERFACE_RELATION__INTERFACE;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE__REFERENCED_ELEMENT = INTERFACE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Require</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE_FEATURE_COUNT = INTERFACE_RELATION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE___GET_NEAREST_PACKAGE = INTERFACE_RELATION___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE___GET_UML_PARENT_NAMESPACE = INTERFACE_RELATION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Require</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE_OPERATION_COUNT = INTERFACE_RELATION_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl
     * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getPort()
     * @generated
     */
    int PORT = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__NAME = TextualCommonsPackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__VISIBILITY = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__REFERENCED_ELEMENT = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Realized Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__REALIZED_CLASSIFIER = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Conjugated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__CONJUGATED = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_FEATURE_COUNT = TextualCommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT___GET_NEAREST_PACKAGE = TextualCommonsPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_OPERATION_COUNT = TextualCommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram <em>Component Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram
     * @generated
     */
    EClass getComponentDiagram();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram#getTitle()
     * @see #getComponentDiagram()
     * @generated
     */
    EAttribute getComponentDiagram_Title();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram#getRootpackage <em>Rootpackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rootpackage</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram#getRootpackage()
     * @see #getComponentDiagram()
     * @generated
     */
    EReference getComponentDiagram_Rootpackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.RootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Package</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.RootPackage
     * @generated
     */
    EClass getRootPackage();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.RootPackage#getRelations <em>Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relations</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.RootPackage#getRelations()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Relations();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.RootPackage#getClassifiers <em>Classifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classifiers</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.RootPackage#getClassifiers()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Classifiers();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation <em>Classifier Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation
     * @generated
     */
    EClass getClassifierRelation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation#getLeftClassifier <em>Left Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Left Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation#getLeftClassifier()
     * @see #getClassifierRelation()
     * @generated
     */
    EReference getClassifierRelation_LeftClassifier();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation#getRightClassifier <em>Right Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Right Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation#getRightClassifier()
     * @see #getClassifierRelation()
     * @generated
     */
    EReference getClassifierRelation_RightClassifier();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Connector
     * @generated
     */
    EClass getConnector();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Connector#getConnectorEnds <em>Connector Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connector Ends</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Connector#getConnectorEnds()
     * @see #getConnector()
     * @generated
     */
    EReference getConnector_ConnectorEnds();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd <em>Connector End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector End</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd
     * @generated
     */
    EClass getConnectorEnd();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getPart <em>Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Part</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getPart()
     * @see #getConnectorEnd()
     * @generated
     */
    EReference getConnectorEnd_Part();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd#getRole()
     * @see #getConnectorEnd()
     * @generated
     */
    EReference getConnectorEnd_Role();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generalization</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Generalization
     * @generated
     */
    EClass getGeneralization();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Classifier
     * @generated
     */
    EClass getClassifier();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.cmp.Property#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Property#isStatic()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Static();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.Property#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Property#getType()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Type();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Component#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Component#getAttributes()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Attributes();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Component#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Port</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Component#getPort()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Port();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Component#getConnectors <em>Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connectors</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Component#getConnectors()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Connectors();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Component#getPackagedElements <em>Packaged Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Elements</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Component#getPackagedElements()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_PackagedElements();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Class
     * @generated
     */
    EClass getClass_();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Providing Requiring Entity</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity
     * @generated
     */
    EClass getInterfaceProvidingRequiringEntity();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity#getInterfaceRelation <em>Interface Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interface Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity#getInterfaceRelation()
     * @see #getInterfaceProvidingRequiringEntity()
     * @generated
     */
    EReference getInterfaceProvidingRequiringEntity_InterfaceRelation();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Interface#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Interface#getMembers()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Members();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Method
     * @generated
     */
    EClass getMethod();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.cmp.Method#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Method#isAbstract()
     * @see #getMethod()
     * @generated
     */
    EAttribute getMethod_Abstract();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.cmp.Method#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Method#getParameters()
     * @see #getMethod()
     * @generated
     */
    EReference getMethod_Parameters();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.component.cmp.Parameter#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Parameter#getOwner()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Owner();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation <em>Interface Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation
     * @generated
     */
    EClass getInterfaceRelation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation#getInterface()
     * @see #getInterfaceRelation()
     * @generated
     */
    EReference getInterfaceRelation_Interface();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Provide <em>Provide</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provide</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Provide
     * @generated
     */
    EClass getProvide();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Require <em>Require</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Require</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Require
     * @generated
     */
    EClass getRequire();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.cmp.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Port
     * @generated
     */
    EClass getPort();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.cmp.Port#getRealizedClassifier <em>Realized Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Realized Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Port#getRealizedClassifier()
     * @see #getPort()
     * @generated
     */
    EReference getPort_RealizedClassifier();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.cmp.Port#isConjugated <em>Conjugated</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conjugated</em>'.
     * @see de.cooperateproject.modeling.textual.component.cmp.Port#isConjugated()
     * @see #getPort()
     * @generated
     */
    EAttribute getPort_Conjugated();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CmpFactory getCmpFactory();

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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ComponentDiagramImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getComponentDiagram()
         * @generated
         */
        EClass COMPONENT_DIAGRAM = eINSTANCE.getComponentDiagram();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPONENT_DIAGRAM__TITLE = eINSTANCE.getComponentDiagram_Title();

        /**
         * The meta object literal for the '<em><b>Rootpackage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_DIAGRAM__ROOTPACKAGE = eINSTANCE.getComponentDiagram_Rootpackage();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.RootPackageImpl <em>Root Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.RootPackageImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getRootPackage()
         * @generated
         */
        EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

        /**
         * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__RELATIONS = eINSTANCE.getRootPackage_Relations();

        /**
         * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__CLASSIFIERS = eINSTANCE.getRootPackage_Classifiers();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierRelationImpl <em>Classifier Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierRelationImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getClassifierRelation()
         * @generated
         */
        EClass CLASSIFIER_RELATION = eINSTANCE.getClassifierRelation();

        /**
         * The meta object literal for the '<em><b>Left Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER_RELATION__LEFT_CLASSIFIER = eINSTANCE.getClassifierRelation_LeftClassifier();

        /**
         * The meta object literal for the '<em><b>Right Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER_RELATION__RIGHT_CLASSIFIER = eINSTANCE.getClassifierRelation_RightClassifier();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorImpl <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getConnector()
         * @generated
         */
        EClass CONNECTOR = eINSTANCE.getConnector();

        /**
         * The meta object literal for the '<em><b>Connector Ends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR__CONNECTOR_ENDS = eINSTANCE.getConnector_ConnectorEnds();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorEndImpl <em>Connector End</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorEndImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getConnectorEnd()
         * @generated
         */
        EClass CONNECTOR_END = eINSTANCE.getConnectorEnd();

        /**
         * The meta object literal for the '<em><b>Part</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_END__PART = eINSTANCE.getConnectorEnd_Part();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_END__ROLE = eINSTANCE.getConnectorEnd_Role();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.GeneralizationImpl <em>Generalization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.GeneralizationImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getGeneralization()
         * @generated
         */
        EClass GENERALIZATION = eINSTANCE.getGeneralization();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierImpl <em>Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ClassifierImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getClassifier()
         * @generated
         */
        EClass CLASSIFIER = eINSTANCE.getClassifier();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__STATIC = eINSTANCE.getProperty_Static();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__ATTRIBUTES = eINSTANCE.getComponent_Attributes();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

        /**
         * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__CONNECTORS = eINSTANCE.getComponent_Connectors();

        /**
         * The meta object literal for the '<em><b>Packaged Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PACKAGED_ELEMENTS = eINSTANCE.getComponent_PackagedElements();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ClassImpl <em>Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ClassImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getClass_()
         * @generated
         */
        EClass CLASS = eINSTANCE.getClass_();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getInterfaceProvidingRequiringEntity()
         * @generated
         */
        EClass INTERFACE_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getInterfaceProvidingRequiringEntity();

        /**
         * The meta object literal for the '<em><b>Interface Relation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_RELATION = eINSTANCE.getInterfaceProvidingRequiringEntity_InterfaceRelation();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceImpl <em>Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getInterface()
         * @generated
         */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__MEMBERS = eINSTANCE.getInterface_Members();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.MethodImpl <em>Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.MethodImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getMethod()
         * @generated
         */
        EClass METHOD = eINSTANCE.getMethod();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ParameterImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__OWNER = eINSTANCE.getParameter_Owner();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.AttributeImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.MemberImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceRelationImpl <em>Interface Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.InterfaceRelationImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getInterfaceRelation()
         * @generated
         */
        EClass INTERFACE_RELATION = eINSTANCE.getInterfaceRelation();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_RELATION__INTERFACE = eINSTANCE.getInterfaceRelation_Interface();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.ProvideImpl <em>Provide</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.ProvideImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getProvide()
         * @generated
         */
        EClass PROVIDE = eINSTANCE.getProvide();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.RequireImpl <em>Require</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.RequireImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getRequire()
         * @generated
         */
        EClass REQUIRE = eINSTANCE.getRequire();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl
         * @see de.cooperateproject.modeling.textual.component.cmp.impl.CmpPackageImpl#getPort()
         * @generated
         */
        EClass PORT = eINSTANCE.getPort();

        /**
         * The meta object literal for the '<em><b>Realized Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__REALIZED_CLASSIFIER = eINSTANCE.getPort_RealizedClassifier();

        /**
         * The meta object literal for the '<em><b>Conjugated</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PORT__CONJUGATED = eINSTANCE.getPort_Conjugated();

    }

} //CmpPackage
