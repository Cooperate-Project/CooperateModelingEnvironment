/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsFactory
 * @model kind="package"
 * @generated
 */
public interface ClsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cls";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cooperateproject.de/modeling/textual/cls/Cls";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cls";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ClsPackage eINSTANCE = de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClassDiagram()
     * @generated
     */
    int CLASS_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM__TITLE = 0;

    /**
     * The feature id for the '<em><b>Root Package</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM__ROOT_PACKAGE = 1;

    /**
     * The number of structural features of the '<em>Class Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>Get All Transitive Connectors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CONNECTORS = 0;

    /**
     * The operation id for the '<em>Get All Transitive Packages</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM___GET_ALL_TRANSITIVE_PACKAGES = 1;

    /**
     * The operation id for the '<em>Get All Transitive Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CLASSIFIERS = 2;

    /**
     * The number of operations of the '<em>Class Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DIAGRAM_OPERATION_COUNT = 3;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPackage()
     * @generated
     */
    int PACKAGE = 1;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__REFERENCED_ELEMENT = TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NAME = TextualCommonsPackage.PACKAGE_BASE__NAME;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__OWNING_PACKAGE = TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__PACKAGES = TextualCommonsPackage.PACKAGE_BASE__PACKAGES;

    /**
     * The feature id for the '<em><b>Package Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__PACKAGE_IMPORTS = TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS;

    /**
     * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__CLASSIFIERS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__CONNECTORS = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_FEATURE_COUNT = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_NEAREST_PACKAGE = TextualCommonsPackage.PACKAGE_BASE___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_OPERATION_COUNT = TextualCommonsPackage.PACKAGE_BASE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClassifier()
     * @generated
     */
    int CLASSIFIER = 2;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__ALIAS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__VISIBILITY = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__MEMBERS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__OWNING_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClass_()
     * @generated
     */
    int CLASS = 3;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

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
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__MEMBERS = CLASSIFIER__MEMBERS;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__OWNING_PACKAGE = CLASSIFIER__OWNING_PACKAGE;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__ABSTRACT = CLASSIFIER_FEATURE_COUNT + 0;

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
     * The number of operations of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.InterfaceImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 4;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__REFERENCED_ELEMENT = CLASSIFIER__REFERENCED_ELEMENT;

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
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__VISIBILITY = CLASSIFIER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__MEMBERS = CLASSIFIER__MEMBERS;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__OWNING_PACKAGE = CLASSIFIER__OWNING_PACKAGE;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_NEAREST_PACKAGE = CLASSIFIER___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 5;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMember()
     * @generated
     */
    int MEMBER = 6;

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
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__OWNER = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.AttributeImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 7;

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
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__OWNER = MEMBER__OWNER;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.MethodImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMethod()
     * @generated
     */
    int METHOD = 8;

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
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__OWNER = MEMBER__OWNER;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ParameterImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 9;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.Connector <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.Connector
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getConnector()
     * @generated
     */
    int CONNECTOR = 10;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__OWNING_PACKAGE = TextualCommonsPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_FEATURE_COUNT = TextualCommonsPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_OPERATION_COUNT = TextualCommonsPackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl <em>Typed Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getTypedConnector()
     * @generated
     */
    int TYPED_CONNECTOR = 11;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_CONNECTOR__OWNING_PACKAGE = CONNECTOR__OWNING_PACKAGE;

    /**
     * The feature id for the '<em><b>Left</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_CONNECTOR__LEFT = CONNECTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Right</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_CONNECTOR__RIGHT = CONNECTOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Typed Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Typed Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getGeneralization()
     * @generated
     */
    int GENERALIZATION = 12;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__OWNING_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Left</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__LEFT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Right</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION__RIGHT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Generalization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

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
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl <em>Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getImplementation()
     * @generated
     */
    int IMPLEMENTATION = 13;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION__OWNING_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Left</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION__LEFT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Right</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION__RIGHT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Implementation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Implementation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl <em>Comment Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCommentLink()
     * @generated
     */
    int COMMENT_LINK = 14;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_LINK__OWNING_PACKAGE = CONNECTOR__OWNING_PACKAGE;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_LINK__COMMENTS = CONNECTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Commented Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_LINK__COMMENTED_ELEMENT = CONNECTOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Comment Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_LINK_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Comment Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_LINK_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 15;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__OWNING_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__COMMENTS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Member Ends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__MEMBER_ENDS = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

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
     * The number of operations of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl <em>Association Member End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociationMemberEnd()
     * @generated
     */
    int ASSOCIATION_MEMBER_END = 16;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__REFERENCED_ELEMENT = TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__NAME = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__CARDINALITY = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__TYPE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Navigable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__NAVIGABLE = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Association</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__ASSOCIATION = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END__AGGREGATION_KIND = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Association Member End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END_FEATURE_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END___GET_NEAREST_PACKAGE = TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Association Member End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_MEMBER_END_OPERATION_COUNT = TextualCommonsPackage.UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl <em>Xtext Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getXtextAssociation()
     * @generated
     */
    int XTEXT_ASSOCIATION = 17;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__REFERENCED_ELEMENT = ASSOCIATION__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__OWNING_PACKAGE = ASSOCIATION__OWNING_PACKAGE;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__COMMENTS = ASSOCIATION__COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__NAME = ASSOCIATION__NAME;

    /**
     * The feature id for the '<em><b>Member Ends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__MEMBER_ENDS = ASSOCIATION__MEMBER_ENDS;

    /**
     * The feature id for the '<em><b>Member End Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__MEMBER_END_TYPES = ASSOCIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Member End Names</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__MEMBER_END_NAMES = ASSOCIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Member End Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES = ASSOCIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Member End Navigabilities</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES = ASSOCIATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Two Side Bidirectionality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY = ASSOCIATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Two Side Aggregation Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND = ASSOCIATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Xtext Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION___GET_NEAREST_PACKAGE = ASSOCIATION___GET_NEAREST_PACKAGE;

    /**
     * The operation id for the '<em>Collect Member End Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION___COLLECT_MEMBER_END_TYPES = ASSOCIATION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Xtext Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationMemberEndReferencedTypeImpl <em>Xtext Association Member End Referenced Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationMemberEndReferencedTypeImpl
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getXtextAssociationMemberEndReferencedType()
     * @generated
     */
    int XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE = 18;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE = 0;

    /**
     * The number of structural features of the '<em>Xtext Association Member End Referenced Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Xtext Association Member End Referenced Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind <em>Aggregation Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
     * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAggregationKind()
     * @generated
     */
    int AGGREGATION_KIND = 19;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram <em>Class Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
     * @generated
     */
    EClass getClassDiagram();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getTitle()
     * @see #getClassDiagram()
     * @generated
     */
    EAttribute getClassDiagram_Title();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getRootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Package</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getRootPackage()
     * @see #getClassDiagram()
     * @generated
     */
    EReference getClassDiagram_RootPackage();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getAllTransitiveConnectors() <em>Get All Transitive Connectors</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Transitive Connectors</em>' operation.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getAllTransitiveConnectors()
     * @generated
     */
    EOperation getClassDiagram__GetAllTransitiveConnectors();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getAllTransitivePackages() <em>Get All Transitive Packages</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Transitive Packages</em>' operation.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getAllTransitivePackages()
     * @generated
     */
    EOperation getClassDiagram__GetAllTransitivePackages();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getAllTransitiveClassifiers() <em>Get All Transitive Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Transitive Classifiers</em>' operation.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getAllTransitiveClassifiers()
     * @generated
     */
    EOperation getClassDiagram__GetAllTransitiveClassifiers();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Package
     * @generated
     */
    EClass getPackage();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getClassifiers <em>Classifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classifiers</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Package#getClassifiers()
     * @see #getPackage()
     * @generated
     */
    EReference getPackage_Classifiers();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getConnectors <em>Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connectors</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Package#getConnectors()
     * @see #getPackage()
     * @generated
     */
    EReference getPackage_Connectors();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier
     * @generated
     */
    EClass getClassifier();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier#getVisibility()
     * @see #getClassifier()
     * @generated
     */
    EAttribute getClassifier_Visibility();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers()
     * @see #getClassifier()
     * @generated
     */
    EReference getClassifier_Members();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getOwningPackage <em>Owning Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owning Package</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier#getOwningPackage()
     * @see #getClassifier()
     * @generated
     */
    EReference getClassifier_OwningPackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Class
     * @generated
     */
    EClass getClass_();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Class#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Class#isAbstract()
     * @see #getClass_()
     * @generated
     */
    EAttribute getClass_Abstract();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Property#getVisibility()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Visibility();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Property#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Property#isStatic()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Static();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Property#getType()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Type();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.Member#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Member#getOwner()
     * @see #getMember()
     * @generated
     */
    EReference getMember_Owner();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Method
     * @generated
     */
    EClass getMethod();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Method#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Method#isAbstract()
     * @see #getMethod()
     * @generated
     */
    EAttribute getMethod_Abstract();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Method#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Method#getParameters()
     * @see #getMethod()
     * @generated
     */
    EReference getMethod_Parameters();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.Parameter#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Parameter#getOwner()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Owner();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Connector
     * @generated
     */
    EClass getConnector();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.Connector#getOwningPackage <em>Owning Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owning Package</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Connector#getOwningPackage()
     * @see #getConnector()
     * @generated
     */
    EReference getConnector_OwningPackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector <em>Typed Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Typed Connector</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector
     * @generated
     */
    EClass getTypedConnector();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getLeft <em>Left</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Left</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getLeft()
     * @see #getTypedConnector()
     * @generated
     */
    EReference getTypedConnector_Left();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getRight <em>Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Right</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getRight()
     * @see #getTypedConnector()
     * @generated
     */
    EReference getTypedConnector_Right();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generalization</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Generalization
     * @generated
     */
    EClass getGeneralization();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Implementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Implementation
     * @generated
     */
    EClass getImplementation();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink <em>Comment Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment Link</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.CommentLink
     * @generated
     */
    EClass getCommentLink();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getCommentedElement <em>Commented Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Commented Element</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.CommentLink#getCommentedElement()
     * @see #getCommentLink()
     * @generated
     */
    EReference getCommentLink_CommentedElement();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getMemberEnds <em>Member Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member Ends</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.Association#getMemberEnds()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_MemberEnds();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd <em>Association Member End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association Member End</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
     * @generated
     */
    EClass getAssociationMemberEnd();

    /**
     * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getCardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cardinality</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getCardinality()
     * @see #getAssociationMemberEnd()
     * @generated
     */
    EReference getAssociationMemberEnd_Cardinality();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getType()
     * @see #getAssociationMemberEnd()
     * @generated
     */
    EReference getAssociationMemberEnd_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#isNavigable <em>Navigable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Navigable</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#isNavigable()
     * @see #getAssociationMemberEnd()
     * @generated
     */
    EAttribute getAssociationMemberEnd_Navigable();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Association</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAssociation()
     * @see #getAssociationMemberEnd()
     * @generated
     */
    EReference getAssociationMemberEnd_Association();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAggregationKind <em>Aggregation Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Aggregation Kind</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAggregationKind()
     * @see #getAssociationMemberEnd()
     * @generated
     */
    EAttribute getAssociationMemberEnd_AggregationKind();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation <em>Xtext Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Xtext Association</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
     * @generated
     */
    EClass getXtextAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndTypes <em>Member End Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member End Types</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndTypes()
     * @see #getXtextAssociation()
     * @generated
     */
    EReference getXtextAssociation_MemberEndTypes();

    /**
     * Returns the meta object for the attribute list '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndNames <em>Member End Names</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Member End Names</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndNames()
     * @see #getXtextAssociation()
     * @generated
     */
    EAttribute getXtextAssociation_MemberEndNames();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndCardinalities <em>Member End Cardinalities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member End Cardinalities</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndCardinalities()
     * @see #getXtextAssociation()
     * @generated
     */
    EReference getXtextAssociation_MemberEndCardinalities();

    /**
     * Returns the meta object for the attribute list '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndNavigabilities <em>Member End Navigabilities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Member End Navigabilities</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndNavigabilities()
     * @see #getXtextAssociation()
     * @generated
     */
    EAttribute getXtextAssociation_MemberEndNavigabilities();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#isTwoSideBidirectionality <em>Two Side Bidirectionality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Two Side Bidirectionality</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#isTwoSideBidirectionality()
     * @see #getXtextAssociation()
     * @generated
     */
    EAttribute getXtextAssociation_TwoSideBidirectionality();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getTwoSideAggregationKind <em>Two Side Aggregation Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Two Side Aggregation Kind</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getTwoSideAggregationKind()
     * @see #getXtextAssociation()
     * @generated
     */
    EAttribute getXtextAssociation_TwoSideAggregationKind();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#collectMemberEndTypes() <em>Collect Member End Types</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Collect Member End Types</em>' operation.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#collectMemberEndTypes()
     * @generated
     */
    EOperation getXtextAssociation__CollectMemberEndTypes();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType <em>Xtext Association Member End Referenced Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Xtext Association Member End Referenced Type</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType
     * @generated
     */
    EClass getXtextAssociationMemberEndReferencedType();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType#getType()
     * @see #getXtextAssociationMemberEndReferencedType()
     * @generated
     */
    EReference getXtextAssociationMemberEndReferencedType_Type();

    /**
     * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind <em>Aggregation Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Aggregation Kind</em>'.
     * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
     * @generated
     */
    EEnum getAggregationKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ClsFactory getClsFactory();

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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClassDiagram()
         * @generated
         */
        EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLASS_DIAGRAM__TITLE = eINSTANCE.getClassDiagram_Title();

        /**
         * The meta object literal for the '<em><b>Root Package</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASS_DIAGRAM__ROOT_PACKAGE = eINSTANCE.getClassDiagram_RootPackage();

        /**
         * The meta object literal for the '<em><b>Get All Transitive Connectors</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CONNECTORS = eINSTANCE.getClassDiagram__GetAllTransitiveConnectors();

        /**
         * The meta object literal for the '<em><b>Get All Transitive Packages</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASS_DIAGRAM___GET_ALL_TRANSITIVE_PACKAGES = eINSTANCE.getClassDiagram__GetAllTransitivePackages();

        /**
         * The meta object literal for the '<em><b>Get All Transitive Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CLASSIFIERS = eINSTANCE.getClassDiagram__GetAllTransitiveClassifiers();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl <em>Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPackage()
         * @generated
         */
        EClass PACKAGE = eINSTANCE.getPackage();

        /**
         * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE__CLASSIFIERS = eINSTANCE.getPackage_Classifiers();

        /**
         * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE__CONNECTORS = eINSTANCE.getPackage_Connectors();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl <em>Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClassifier()
         * @generated
         */
        EClass CLASSIFIER = eINSTANCE.getClassifier();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLASSIFIER__VISIBILITY = eINSTANCE.getClassifier_Visibility();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER__MEMBERS = eINSTANCE.getClassifier_Members();

        /**
         * The meta object literal for the '<em><b>Owning Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER__OWNING_PACKAGE = eINSTANCE.getClassifier_OwningPackage();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassImpl <em>Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClass_()
         * @generated
         */
        EClass CLASS = eINSTANCE.getClass_();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.InterfaceImpl <em>Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.InterfaceImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getInterface()
         * @generated
         */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getProperty()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEMBER__OWNER = eINSTANCE.getMember_Owner();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.AttributeImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MethodImpl <em>Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.MethodImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMethod()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ParameterImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getParameter()
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
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.Connector <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.Connector
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getConnector()
         * @generated
         */
        EClass CONNECTOR = eINSTANCE.getConnector();

        /**
         * The meta object literal for the '<em><b>Owning Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR__OWNING_PACKAGE = eINSTANCE.getConnector_OwningPackage();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl <em>Typed Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getTypedConnector()
         * @generated
         */
        EClass TYPED_CONNECTOR = eINSTANCE.getTypedConnector();

        /**
         * The meta object literal for the '<em><b>Left</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPED_CONNECTOR__LEFT = eINSTANCE.getTypedConnector_Left();

        /**
         * The meta object literal for the '<em><b>Right</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPED_CONNECTOR__RIGHT = eINSTANCE.getTypedConnector_Right();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl <em>Generalization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getGeneralization()
         * @generated
         */
        EClass GENERALIZATION = eINSTANCE.getGeneralization();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl <em>Implementation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getImplementation()
         * @generated
         */
        EClass IMPLEMENTATION = eINSTANCE.getImplementation();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl <em>Comment Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCommentLink()
         * @generated
         */
        EClass COMMENT_LINK = eINSTANCE.getCommentLink();

        /**
         * The meta object literal for the '<em><b>Commented Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMENT_LINK__COMMENTED_ELEMENT = eINSTANCE.getCommentLink_CommentedElement();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl <em>Association</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociation()
         * @generated
         */
        EClass ASSOCIATION = eINSTANCE.getAssociation();

        /**
         * The meta object literal for the '<em><b>Member Ends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__MEMBER_ENDS = eINSTANCE.getAssociation_MemberEnds();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl <em>Association Member End</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociationMemberEnd()
         * @generated
         */
        EClass ASSOCIATION_MEMBER_END = eINSTANCE.getAssociationMemberEnd();

        /**
         * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION_MEMBER_END__CARDINALITY = eINSTANCE.getAssociationMemberEnd_Cardinality();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION_MEMBER_END__TYPE = eINSTANCE.getAssociationMemberEnd_Type();

        /**
         * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION_MEMBER_END__NAVIGABLE = eINSTANCE.getAssociationMemberEnd_Navigable();

        /**
         * The meta object literal for the '<em><b>Association</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION_MEMBER_END__ASSOCIATION = eINSTANCE.getAssociationMemberEnd_Association();

        /**
         * The meta object literal for the '<em><b>Aggregation Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION_MEMBER_END__AGGREGATION_KIND = eINSTANCE.getAssociationMemberEnd_AggregationKind();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl <em>Xtext Association</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getXtextAssociation()
         * @generated
         */
        EClass XTEXT_ASSOCIATION = eINSTANCE.getXtextAssociation();

        /**
         * The meta object literal for the '<em><b>Member End Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XTEXT_ASSOCIATION__MEMBER_END_TYPES = eINSTANCE.getXtextAssociation_MemberEndTypes();

        /**
         * The meta object literal for the '<em><b>Member End Names</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XTEXT_ASSOCIATION__MEMBER_END_NAMES = eINSTANCE.getXtextAssociation_MemberEndNames();

        /**
         * The meta object literal for the '<em><b>Member End Cardinalities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES = eINSTANCE.getXtextAssociation_MemberEndCardinalities();

        /**
         * The meta object literal for the '<em><b>Member End Navigabilities</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES = eINSTANCE.getXtextAssociation_MemberEndNavigabilities();

        /**
         * The meta object literal for the '<em><b>Two Side Bidirectionality</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY = eINSTANCE.getXtextAssociation_TwoSideBidirectionality();

        /**
         * The meta object literal for the '<em><b>Two Side Aggregation Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND = eINSTANCE.getXtextAssociation_TwoSideAggregationKind();

        /**
         * The meta object literal for the '<em><b>Collect Member End Types</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation XTEXT_ASSOCIATION___COLLECT_MEMBER_END_TYPES = eINSTANCE.getXtextAssociation__CollectMemberEndTypes();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationMemberEndReferencedTypeImpl <em>Xtext Association Member End Referenced Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationMemberEndReferencedTypeImpl
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getXtextAssociationMemberEndReferencedType()
         * @generated
         */
        EClass XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE = eINSTANCE.getXtextAssociationMemberEndReferencedType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE = eINSTANCE.getXtextAssociationMemberEndReferencedType_Type();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind <em>Aggregation Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
         * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAggregationKind()
         * @generated
         */
        EEnum AGGREGATION_KIND = eINSTANCE.getAggregationKind();

    }

} //ClsPackage
