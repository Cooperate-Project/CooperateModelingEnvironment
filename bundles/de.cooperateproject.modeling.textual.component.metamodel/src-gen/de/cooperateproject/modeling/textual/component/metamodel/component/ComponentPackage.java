/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "component";

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
    String eNS_PREFIX = "component";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ComponentPackage eINSTANCE = de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentDiagramImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getComponentDiagram()
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
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_DIAGRAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RootPackageImpl <em>Root Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.RootPackageImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getRootPackage()
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
     * The feature id for the '<em><b>Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__RELATION = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elementcontent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__ELEMENTCONTENT = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 1;

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
     * The number of operations of the '<em>Root Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE_OPERATION_COUNT = TextualCommonsPackage.PACKAGE_BASE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementRelationImpl <em>Element Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementRelationImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getElementRelation()
     * @generated
     */
    int ELEMENT_RELATION = 2;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_RELATION__COMPONENT = 0;

    /**
     * The number of structural features of the '<em>Element Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_RELATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Element Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_RELATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl <em>Port Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getPortRelation()
     * @generated
     */
    int PORT_RELATION = 3;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION__PORT = 0;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION__INTERFACE = 1;

    /**
     * The number of structural features of the '<em>Port Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Port Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_RELATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getConnector()
     * @generated
     */
    int CONNECTOR = 4;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__PORT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__INTERFACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getGeneralization()
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
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__COMPONENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.AbstractionImpl <em>Abstraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.AbstractionImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getAbstraction()
     * @generated
     */
    int ABSTRACTION = 6;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION__COMPONENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstraction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Abstraction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACTION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl <em>Manifestation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getManifestation()
     * @generated
     */
    int MANIFESTATION = 7;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION__COMPONENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Manifestation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Manifestation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFESTATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl <em>Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getSubstitution()
     * @generated
     */
    int SUBSTITUTION = 8;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION__COMPONENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Substitution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Substitution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTITUTION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.DependencyImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getDependency()
     * @generated
     */
    int DEPENDENCY = 9;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__COMPONENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementContentImpl <em>Element Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementContentImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getElementContent()
     * @generated
     */
    int ELEMENT_CONTENT = 10;

    /**
     * The number of structural features of the '<em>Element Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_CONTENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Element Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_CONTENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.PropertyImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 11;

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
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 12;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__REFERENCED_ELEMENT = TextualCommonsPackage.COMMENTABLE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__COMMENTS = TextualCommonsPackage.COMMENTABLE__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ALIAS = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__COMPONENT = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PORT = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Interfacerelation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__INTERFACERELATION = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__INTERFACE = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT___GET_NEAREST_PACKAGE = TextualCommonsPackage.COMMENTABLE___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = TextualCommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 13;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__REFERENCED_ELEMENT = TextualCommonsPackage.COMMENTABLE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__COMMENTS = TextualCommonsPackage.COMMENTABLE__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__NAME = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ALIAS = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Member</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__MEMBER = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = TextualCommonsPackage.COMMENTABLE_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_NEAREST_PACKAGE = TextualCommonsPackage.COMMENTABLE___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_OPERATION_COUNT = TextualCommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.MemberImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getMember()
     * @generated
     */
    int MEMBER = 17;

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
     * The number of operations of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.MethodImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getMethod()
     * @generated
     */
    int METHOD = 14;

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
     * The number of operations of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ParameterImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 15;

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
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.AttributeImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 16;

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
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceRelationImpl <em>Interface Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceRelationImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getInterfaceRelation()
     * @generated
     */
    int INTERFACE_RELATION = 18;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION__INTERFACE = 0;

    /**
     * The number of structural features of the '<em>Interface Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Interface Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_RELATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ProvideImpl <em>Provide</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ProvideImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getProvide()
     * @generated
     */
    int PROVIDE = 19;

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
    int PROVIDE___GET_NEAREST_PACKAGE = INTERFACE_RELATION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Provide</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_OPERATION_COUNT = INTERFACE_RELATION_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RequireImpl <em>Require</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.RequireImpl
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getRequire()
     * @generated
     */
    int REQUIRE = 20;

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
    int REQUIRE___GET_NEAREST_PACKAGE = INTERFACE_RELATION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Require</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRE_OPERATION_COUNT = INTERFACE_RELATION_OPERATION_COUNT + 1;

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram
     * @generated
     */
    EClass getComponentDiagram();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getTitle()
     * @see #getComponentDiagram()
     * @generated
     */
    EAttribute getComponentDiagram_Title();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getRootpackage <em>Rootpackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rootpackage</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getRootpackage()
     * @see #getComponentDiagram()
     * @generated
     */
    EReference getComponentDiagram_Rootpackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Package</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage
     * @generated
     */
    EClass getRootPackage();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage#getRelation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage#getRelation()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Relation();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage#getElementcontent <em>Elementcontent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elementcontent</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage#getElementcontent()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Elementcontent();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ElementRelation <em>Element Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ElementRelation
     * @generated
     */
    EClass getElementRelation();

    /**
     * Returns the meta object for the reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ElementRelation#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Component</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ElementRelation#getComponent()
     * @see #getElementRelation()
     * @generated
     */
    EReference getElementRelation_Component();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation <em>Port Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation
     * @generated
     */
    EClass getPortRelation();

    /**
     * Returns the meta object for the reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Port</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getPort()
     * @see #getPortRelation()
     * @generated
     */
    EReference getPortRelation_Port();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInterface()
     * @see #getPortRelation()
     * @generated
     */
    EReference getPortRelation_Interface();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Connector
     * @generated
     */
    EClass getConnector();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generalization</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Generalization
     * @generated
     */
    EClass getGeneralization();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Abstraction <em>Abstraction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstraction</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Abstraction
     * @generated
     */
    EClass getAbstraction();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Manifestation <em>Manifestation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manifestation</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Manifestation
     * @generated
     */
    EClass getManifestation();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Substitution <em>Substitution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Substitution</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Substitution
     * @generated
     */
    EClass getSubstitution();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Dependency
     * @generated
     */
    EClass getDependency();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ElementContent <em>Element Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Content</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ElementContent
     * @generated
     */
    EClass getElementContent();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Property#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Property#getVisibility()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Visibility();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Property#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Property#isStatic()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Static();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Property#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Property#getType()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Type();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Component</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Component#getComponent()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Component();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Port</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Component#getPort()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Port();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getInterfacerelation <em>Interfacerelation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interfacerelation</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Component#getInterfacerelation()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Interfacerelation();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Component#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Component#getInterface()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Interface();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Interface#getMember <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Interface#getMember()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Member();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Method
     * @generated
     */
    EClass getMethod();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Method#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Method#isAbstract()
     * @see #getMethod()
     * @generated
     */
    EAttribute getMethod_Abstract();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Method#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Method#getParameters()
     * @see #getMethod()
     * @generated
     */
    EReference getMethod_Parameters();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Parameter#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Parameter#getOwner()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Owner();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation <em>Interface Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Relation</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation
     * @generated
     */
    EClass getInterfaceRelation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation#getInterface()
     * @see #getInterfaceRelation()
     * @generated
     */
    EReference getInterfaceRelation_Interface();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Provide <em>Provide</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provide</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Provide
     * @generated
     */
    EClass getProvide();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.component.metamodel.component.Require <em>Require</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Require</em>'.
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.Require
     * @generated
     */
    EClass getRequire();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ComponentFactory getComponentFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentDiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentDiagramImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getComponentDiagram()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RootPackageImpl <em>Root Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.RootPackageImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getRootPackage()
         * @generated
         */
        EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

        /**
         * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__RELATION = eINSTANCE.getRootPackage_Relation();

        /**
         * The meta object literal for the '<em><b>Elementcontent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__ELEMENTCONTENT = eINSTANCE.getRootPackage_Elementcontent();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementRelationImpl <em>Element Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementRelationImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getElementRelation()
         * @generated
         */
        EClass ELEMENT_RELATION = eINSTANCE.getElementRelation();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_RELATION__COMPONENT = eINSTANCE.getElementRelation_Component();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl <em>Port Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.PortRelationImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getPortRelation()
         * @generated
         */
        EClass PORT_RELATION = eINSTANCE.getPortRelation();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT_RELATION__PORT = eINSTANCE.getPortRelation_Port();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT_RELATION__INTERFACE = eINSTANCE.getPortRelation_Interface();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ConnectorImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getConnector()
         * @generated
         */
        EClass CONNECTOR = eINSTANCE.getConnector();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl <em>Generalization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.GeneralizationImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getGeneralization()
         * @generated
         */
        EClass GENERALIZATION = eINSTANCE.getGeneralization();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.AbstractionImpl <em>Abstraction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.AbstractionImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getAbstraction()
         * @generated
         */
        EClass ABSTRACTION = eINSTANCE.getAbstraction();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl <em>Manifestation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ManifestationImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getManifestation()
         * @generated
         */
        EClass MANIFESTATION = eINSTANCE.getManifestation();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl <em>Substitution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.SubstitutionImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getSubstitution()
         * @generated
         */
        EClass SUBSTITUTION = eINSTANCE.getSubstitution();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.DependencyImpl <em>Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.DependencyImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getDependency()
         * @generated
         */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementContentImpl <em>Element Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ElementContentImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getElementContent()
         * @generated
         */
        EClass ELEMENT_CONTENT = eINSTANCE.getElementContent();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.PropertyImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VISIBILITY = eINSTANCE.getProperty_Visibility();

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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__COMPONENT = eINSTANCE.getComponent_Component();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

        /**
         * The meta object literal for the '<em><b>Interfacerelation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__INTERFACERELATION = eINSTANCE.getComponent_Interfacerelation();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__INTERFACE = eINSTANCE.getComponent_Interface();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceImpl <em>Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getInterface()
         * @generated
         */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
         * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__MEMBER = eINSTANCE.getInterface_Member();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.MethodImpl <em>Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.MethodImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getMethod()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ParameterImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getParameter()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.AttributeImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.MemberImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceRelationImpl <em>Interface Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.InterfaceRelationImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getInterfaceRelation()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.ProvideImpl <em>Provide</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ProvideImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getProvide()
         * @generated
         */
        EClass PROVIDE = eINSTANCE.getProvide();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RequireImpl <em>Require</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.RequireImpl
         * @see de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentPackageImpl#getRequire()
         * @generated
         */
        EClass REQUIRE = eINSTANCE.getRequire();

    }

} // ComponentPackage
