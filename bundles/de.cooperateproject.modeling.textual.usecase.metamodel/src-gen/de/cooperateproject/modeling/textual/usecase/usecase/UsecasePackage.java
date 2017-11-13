/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

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
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecaseFactory
 * @model kind="package"
 * @generated
 */
public interface UsecasePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "usecase";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cooperateproject.de/modeling/textual/usecase/Usecase";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "usecase";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UsecasePackage eINSTANCE = de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseDiagramImpl <em>Use Case Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseDiagramImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getUseCaseDiagram()
     * @generated
     */
    int USE_CASE_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Root Package</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE_DIAGRAM__ROOT_PACKAGE = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE_DIAGRAM__TITLE = 1;

    /**
     * The number of structural features of the '<em>Use Case Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE_DIAGRAM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Use Case Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE_DIAGRAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier <em>Behaviored Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getBehavioredClassifier()
     * @generated
     */
    int BEHAVIORED_CLASSIFIER = 1;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORED_CLASSIFIER__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORED_CLASSIFIER__COMMENTS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Behaviored Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORED_CLASSIFIER_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORED_CLASSIFIER___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORED_CLASSIFIER___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Behaviored Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORED_CLASSIFIER_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl <em>Root Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getRootPackage()
     * @generated
     */
    int ROOT_PACKAGE = 2;

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
     * The feature id for the '<em><b>Actors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__ACTORS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Systems</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__SYSTEMS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__RELATIONSHIPS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE__DIAGRAM = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Root Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_PACKAGE_FEATURE_COUNT = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 4;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getActor()
     * @generated
     */
    int ACTOR = 3;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__REFERENCED_ELEMENT = BEHAVIORED_CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__COMMENTS = BEHAVIORED_CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__NAME = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ALIAS = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__VISIBILITY = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ABSTRACT = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__TYPE = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Actor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_FEATURE_COUNT = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR___GET_NEAREST_PACKAGE = BEHAVIORED_CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR___GET_UML_PARENT_NAMESPACE = BEHAVIORED_CLASSIFIER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Actor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_OPERATION_COUNT = BEHAVIORED_CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.SystemImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getSystem()
     * @generated
     */
    int SYSTEM = 4;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__COMMENTS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Usecases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__USECASES = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl <em>Use Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getUseCase()
     * @generated
     */
    int USE_CASE = 5;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__REFERENCED_ELEMENT = BEHAVIORED_CLASSIFIER__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__COMMENTS = BEHAVIORED_CLASSIFIER__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__NAME = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__ALIAS = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__VISIBILITY = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__ABSTRACT = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Extension Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__EXTENSION_POINTS = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>System</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE__SYSTEM = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Use Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE_FEATURE_COUNT = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE___GET_NEAREST_PACKAGE = BEHAVIORED_CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE___GET_UML_PARENT_NAMESPACE = BEHAVIORED_CLASSIFIER___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Use Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USE_CASE_OPERATION_COUNT = BEHAVIORED_CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getExtensionPoint()
     * @generated
     */
    int EXTENSION_POINT = 6;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Use Case</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT__USE_CASE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Extension Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Extension Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_POINT_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Relationship <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Relationship
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 7;

    /**
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = TextualCommonsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP___GET_NEAREST_PACKAGE = TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_OPERATION_COUNT = TextualCommonsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 8;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Actor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ACTOR = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Usecase</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__USECASE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Actor Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ACTOR_CARDINALITY = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Use Case Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__USE_CASE_CARDINALITY = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE;

    /**
     * The number of operations of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getGeneralization()
     * @generated
     */
    int GENERALIZATION = 9;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__REFERENCED_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Specific</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__SPECIFIC = RELATIONSHIP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>General</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__GENERAL = RELATIONSHIP_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION___GET_NEAREST_PACKAGE = RELATIONSHIP___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION___GET_UML_PARENT_NAMESPACE = RELATIONSHIP_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getInclude()
     * @generated
     */
    int INCLUDE = 10;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE__REFERENCED_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Addition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE__ADDITION = RELATIONSHIP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Including Case</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE__INCLUDING_CASE = RELATIONSHIP_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Include</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE___GET_NEAREST_PACKAGE = RELATIONSHIP___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE___GET_UML_PARENT_NAMESPACE = RELATIONSHIP_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Include</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl <em>Extend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getExtend()
     * @generated
     */
    int EXTEND = 11;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND__REFERENCED_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extension</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND__EXTENSION = RELATIONSHIP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Extended Case</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND__EXTENDED_CASE = RELATIONSHIP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Extension Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND__EXTENSION_LOCATION = RELATIONSHIP_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND__CONDITION = RELATIONSHIP_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Extend</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND___GET_NEAREST_PACKAGE = RELATIONSHIP___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND___GET_UML_PARENT_NAMESPACE = RELATIONSHIP_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Extend</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTEND_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.ActorType <em>Actor Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ActorType
     * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getActorType()
     * @generated
     */
    int ACTOR_TYPE = 12;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram <em>Use Case Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Use Case Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram
     * @generated
     */
    EClass getUseCaseDiagram();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getRootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Package</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getRootPackage()
     * @see #getUseCaseDiagram()
     * @generated
     */
    EReference getUseCaseDiagram_RootPackage();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getTitle()
     * @see #getUseCaseDiagram()
     * @generated
     */
    EAttribute getUseCaseDiagram_Title();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier <em>Behaviored Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behaviored Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier
     * @generated
     */
    EClass getBehavioredClassifier();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Package</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage
     * @generated
     */
    EClass getRootPackage();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getActors <em>Actors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Actors</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getActors()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Actors();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getSystems <em>Systems</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Systems</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getSystems()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Systems();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getRelationships <em>Relationships</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relationships</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getRelationships()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Relationships();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getDiagram()
     * @see #getRootPackage()
     * @generated
     */
    EReference getRootPackage_Diagram();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Actor</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Actor
     * @generated
     */
    EClass getActor();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Actor#isAbstract()
     * @see #getActor()
     * @generated
     */
    EAttribute getActor_Abstract();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Actor#getType()
     * @see #getActor()
     * @generated
     */
    EAttribute getActor_Type();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.System
     * @generated
     */
    EClass getSystem();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getUsecases <em>Usecases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Usecases</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.System#getUsecases()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Usecases();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.System#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.System#getPackage()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Package();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Use Case</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase
     * @generated
     */
    EClass getUseCase();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase#isAbstract()
     * @see #getUseCase()
     * @generated
     */
    EAttribute getUseCase_Abstract();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getExtensionPoints <em>Extension Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extension Points</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getExtensionPoints()
     * @see #getUseCase()
     * @generated
     */
    EReference getUseCase_ExtensionPoints();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>System</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase#getSystem()
     * @see #getUseCase()
     * @generated
     */
    EReference getUseCase_System();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint <em>Extension Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extension Point</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
     * @generated
     */
    EClass getExtensionPoint();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint#getUseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Use Case</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint#getUseCase()
     * @see #getExtensionPoint()
     * @generated
     */
    EReference getExtensionPoint_UseCase();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getActor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Actor</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Association#getActor()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Actor();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getUsecase <em>Usecase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Usecase</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Association#getUsecase()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Usecase();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getActorCardinality <em>Actor Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Actor Cardinality</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Association#getActorCardinality()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_ActorCardinality();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association#getUseCaseCardinality <em>Use Case Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Use Case Cardinality</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Association#getUseCaseCardinality()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_UseCaseCardinality();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generalization</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Generalization
     * @generated
     */
    EClass getGeneralization();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getSpecific <em>Specific</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Specific</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getSpecific()
     * @see #getGeneralization()
     * @generated
     */
    EReference getGeneralization_Specific();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getGeneral <em>General</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>General</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Generalization#getGeneral()
     * @see #getGeneralization()
     * @generated
     */
    EReference getGeneralization_General();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Include</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Include
     * @generated
     */
    EClass getInclude();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getAddition <em>Addition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Addition</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Include#getAddition()
     * @see #getInclude()
     * @generated
     */
    EReference getInclude_Addition();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include#getIncludingCase <em>Including Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Including Case</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Include#getIncludingCase()
     * @see #getInclude()
     * @generated
     */
    EReference getInclude_IncludingCase();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend <em>Extend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extend</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Extend
     * @generated
     */
    EClass getExtend();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Extension</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtension()
     * @see #getExtend()
     * @generated
     */
    EReference getExtend_Extension();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtendedCase <em>Extended Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Extended Case</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtendedCase()
     * @see #getExtend()
     * @generated
     */
    EReference getExtend_ExtendedCase();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtensionLocation <em>Extension Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Extension Location</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtensionLocation()
     * @see #getExtend()
     * @generated
     */
    EReference getExtend_ExtensionLocation();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Condition</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Extend#getCondition()
     * @see #getExtend()
     * @generated
     */
    EAttribute getExtend_Condition();

    /**
     * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.usecase.usecase.ActorType <em>Actor Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Actor Type</em>'.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ActorType
     * @generated
     */
    EEnum getActorType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UsecaseFactory getUsecaseFactory();

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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseDiagramImpl <em>Use Case Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseDiagramImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getUseCaseDiagram()
         * @generated
         */
        EClass USE_CASE_DIAGRAM = eINSTANCE.getUseCaseDiagram();

        /**
         * The meta object literal for the '<em><b>Root Package</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USE_CASE_DIAGRAM__ROOT_PACKAGE = eINSTANCE.getUseCaseDiagram_RootPackage();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USE_CASE_DIAGRAM__TITLE = eINSTANCE.getUseCaseDiagram_Title();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier <em>Behaviored Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getBehavioredClassifier()
         * @generated
         */
        EClass BEHAVIORED_CLASSIFIER = eINSTANCE.getBehavioredClassifier();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl <em>Root Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getRootPackage()
         * @generated
         */
        EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

        /**
         * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__ACTORS = eINSTANCE.getRootPackage_Actors();

        /**
         * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__SYSTEMS = eINSTANCE.getRootPackage_Systems();

        /**
         * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__RELATIONSHIPS = eINSTANCE.getRootPackage_Relationships();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROOT_PACKAGE__DIAGRAM = eINSTANCE.getRootPackage_Diagram();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl <em>Actor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getActor()
         * @generated
         */
        EClass ACTOR = eINSTANCE.getActor();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTOR__ABSTRACT = eINSTANCE.getActor_Abstract();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.SystemImpl <em>System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.SystemImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getSystem()
         * @generated
         */
        EClass SYSTEM = eINSTANCE.getSystem();

        /**
         * The meta object literal for the '<em><b>Usecases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__USECASES = eINSTANCE.getSystem_Usecases();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__PACKAGE = eINSTANCE.getSystem_Package();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl <em>Use Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getUseCase()
         * @generated
         */
        EClass USE_CASE = eINSTANCE.getUseCase();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USE_CASE__ABSTRACT = eINSTANCE.getUseCase_Abstract();

        /**
         * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USE_CASE__EXTENSION_POINTS = eINSTANCE.getUseCase_ExtensionPoints();

        /**
         * The meta object literal for the '<em><b>System</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USE_CASE__SYSTEM = eINSTANCE.getUseCase_System();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtensionPointImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getExtensionPoint()
         * @generated
         */
        EClass EXTENSION_POINT = eINSTANCE.getExtensionPoint();

        /**
         * The meta object literal for the '<em><b>Use Case</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_POINT__USE_CASE = eINSTANCE.getExtensionPoint_UseCase();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Relationship <em>Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.Relationship
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getRelationship()
         * @generated
         */
        EClass RELATIONSHIP = eINSTANCE.getRelationship();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl <em>Association</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getAssociation()
         * @generated
         */
        EClass ASSOCIATION = eINSTANCE.getAssociation();

        /**
         * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__ACTOR = eINSTANCE.getAssociation_Actor();

        /**
         * The meta object literal for the '<em><b>Usecase</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__USECASE = eINSTANCE.getAssociation_Usecase();

        /**
         * The meta object literal for the '<em><b>Actor Cardinality</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__ACTOR_CARDINALITY = eINSTANCE.getAssociation_ActorCardinality();

        /**
         * The meta object literal for the '<em><b>Use Case Cardinality</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__USE_CASE_CARDINALITY = eINSTANCE.getAssociation_UseCaseCardinality();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl <em>Generalization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.GeneralizationImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getGeneralization()
         * @generated
         */
        EClass GENERALIZATION = eINSTANCE.getGeneralization();

        /**
         * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

        /**
         * The meta object literal for the '<em><b>General</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl <em>Include</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getInclude()
         * @generated
         */
        EClass INCLUDE = eINSTANCE.getInclude();

        /**
         * The meta object literal for the '<em><b>Addition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INCLUDE__ADDITION = eINSTANCE.getInclude_Addition();

        /**
         * The meta object literal for the '<em><b>Including Case</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INCLUDE__INCLUDING_CASE = eINSTANCE.getInclude_IncludingCase();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl <em>Extend</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getExtend()
         * @generated
         */
        EClass EXTEND = eINSTANCE.getExtend();

        /**
         * The meta object literal for the '<em><b>Extension</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTEND__EXTENSION = eINSTANCE.getExtend_Extension();

        /**
         * The meta object literal for the '<em><b>Extended Case</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTEND__EXTENDED_CASE = eINSTANCE.getExtend_ExtendedCase();

        /**
         * The meta object literal for the '<em><b>Extension Location</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTEND__EXTENSION_LOCATION = eINSTANCE.getExtend_ExtensionLocation();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTEND__CONDITION = eINSTANCE.getExtend_Condition();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.usecase.usecase.ActorType <em>Actor Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.usecase.usecase.ActorType
         * @see de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecasePackageImpl#getActorType()
         * @generated
         */
        EEnum ACTOR_TYPE = eINSTANCE.getActorType();

    }

} //UsecasePackage
