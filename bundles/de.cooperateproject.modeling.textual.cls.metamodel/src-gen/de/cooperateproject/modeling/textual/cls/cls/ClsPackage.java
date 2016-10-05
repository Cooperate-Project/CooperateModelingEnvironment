/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel rootExtendsClass='org.eclipse.emf.internal.cdo.CDOObjectImpl' rootExtendsInterface='org.eclipse.emf.cdo.CDOObject' providerRootExtendsClass='org.eclipse.emf.cdo.edit.CDOItemProviderAdapter' modelName='cls' modelDirectory='/de.cooperateproject.modeling.textual.cls.metamodel/src-gen' featureDelegation='Dynamic' basePackage='de.cooperateproject.modeling.textual.cls'"
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
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImportImpl <em>Package Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.PackageImportImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPackageImport()
	 * @generated
	 */
	int PACKAGE_IMPORT = 3;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.TypeReferenceImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 4;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.DataTypeReferenceImpl <em>Data Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.DataTypeReferenceImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getDataTypeReference()
	 * @generated
	 */
	int DATA_TYPE_REFERENCE = 5;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.UMLTypeReferenceImpl <em>UML Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.UMLTypeReferenceImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getUMLTypeReference()
	 * @generated
	 */
	int UML_TYPE_REFERENCE = 6;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.UMLReferencingElementImpl <em>UML Referencing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.UMLReferencingElementImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getUMLReferencingElement()
	 * @generated
	 */
	int UML_REFERENCING_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>UML Referencing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REFERENCING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UML Referencing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REFERENCING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementOptionalImpl <em>Named Element Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementOptionalImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getNamedElementOptional()
	 * @generated
	 */
	int NAMED_ELEMENT_OPTIONAL = 8;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPTIONAL__REFERENCED_ELEMENT = UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPTIONAL__NAME = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPTIONAL_OPERATION_COUNT = UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFERENCED_ELEMENT = NAMED_ELEMENT_OPTIONAL__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = NAMED_ELEMENT_OPTIONAL__NAME;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPTIONAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPTIONAL_OPERATION_COUNT + 1;

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
	int PACKAGE__REFERENCED_ELEMENT = NAMED_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Package Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_NEAREST_PACKAGE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.PackageableElement <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.PackageableElement
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 2;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementAliasedImpl <em>Named Element Aliased</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementAliasedImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getNamedElementAliased()
	 * @generated
	 */
	int NAMED_ELEMENT_ALIASED = 10;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 11;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClassImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 12;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.InterfaceImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 13;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 15;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.AttributeImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 16;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.MethodImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 17;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ParameterImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.Connector <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.Connector
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 19;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl <em>Typed Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getTypedConnector()
	 * @generated
	 */
	int TYPED_CONNECTOR = 20;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 21;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 22;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 23;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl <em>Comment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCommentLink()
	 * @generated
	 */
	int COMMENT_LINK = 24;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl <em>Association Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociationProperties()
	 * @generated
	 */
	int ASSOCIATION_PROPERTIES = 25;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.CardinalityImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 26;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentableImpl <em>Commentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.CommentableImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCommentable()
	 * @generated
	 */
	int COMMENTABLE = 27;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl <em>Multi Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMultiAssociation()
	 * @generated
	 */
	int MULTI_ASSOCIATION = 28;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl <em>Member End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMemberEnd()
	 * @generated
	 */
	int MEMBER_END = 29;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ElementImpl
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 30;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_NEAREST_PACKAGE = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__REFERENCED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__IMPORTING_NAMESPACE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT___GET_NEAREST_PACKAGE = PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_REFERENCE__TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_REFERENCE___GET_NEAREST_PACKAGE = TYPE_REFERENCE___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Data Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TYPE_REFERENCE__TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TYPE_REFERENCE___GET_NEAREST_PACKAGE = TYPE_REFERENCE___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>UML Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED__REFERENCED_ELEMENT = NAMED_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED__ALIAS_EXPRESSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED__ALIAS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element Aliased</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Named Element Aliased</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ALIASED_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__REFERENCED_ELEMENT = NAMED_ELEMENT_ALIASED__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_ELEMENT_ALIASED__NAME;

	/**
	 * The feature id for the '<em><b>Alias Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ALIAS_EXPRESSION = NAMED_ELEMENT_ALIASED__ALIAS_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ALIAS = NAMED_ELEMENT_ALIASED__ALIAS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__VISIBILITY = NAMED_ELEMENT_ALIASED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__MEMBERS = NAMED_ELEMENT_ALIASED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_ALIASED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_ALIASED___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_NEAREST_PACKAGE = NAMED_ELEMENT_ALIASED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = NAMED_ELEMENT_ALIASED_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Alias Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ALIAS_EXPRESSION = CLASSIFIER__ALIAS_EXPRESSION;

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
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = CLASSIFIER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

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
	 * The feature id for the '<em><b>Alias Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ALIAS_EXPRESSION = CLASSIFIER__ALIAS_EXPRESSION;

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
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = CLASSIFIER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

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
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REFERENCED_ELEMENT = NAMED_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STATIC = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FINAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_NEAREST_PACKAGE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FINAL = PROPERTY__FINAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
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
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = PROPERTY___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

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
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FINAL = MEMBER__FINAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
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
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = MEMBER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

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
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FINAL = MEMBER__FINAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
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
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = MEMBER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

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
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FINAL = PROPERTY__FINAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
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
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = PROPERTY___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

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
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_NEAREST_PACKAGE = PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONNECTOR__LEFT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
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
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONNECTOR___GET_NEAREST_PACKAGE = CONNECTOR___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Typed Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REFERENCED_ELEMENT = NAMED_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LEFT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RIGHT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__AGGREGATION_KIND = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BIDIRECTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_NEAREST_PACKAGE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Commented Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_COMMENTED_ELEMENT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__LEFT = TYPED_CONNECTOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RIGHT = TYPED_CONNECTOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__REFERENCED_ELEMENT = TYPED_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = TYPED_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_NEAREST_PACKAGE = TYPED_CONNECTOR___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = TYPED_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__LEFT = TYPED_CONNECTOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__RIGHT = TYPED_CONNECTOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__REFERENCED_ELEMENT = TYPED_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = TYPED_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION___GET_NEAREST_PACKAGE = TYPED_CONNECTOR___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = TYPED_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__COMMENT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__LEFT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK___GET_NEAREST_PACKAGE = CONNECTOR___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Has Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK___HAS_COMMENT__DIAGNOSTICCHAIN_MAP = CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Commented Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK___GET_COMMENTED_ELEMENT = CONNECTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cardinality Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES__CARDINALITY_LEFT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES__PROPERTY_LEFT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES__PROPERTY_RIGHT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES__ASSOCIATION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Association Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PROPERTIES_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER_BOUND = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER_BOUND = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE__COMMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Commentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Commented Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE___GET_COMMENTED_ELEMENT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION__REFERENCED_ELEMENT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION__NAME = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION__CONNECTOR_ENDS = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION___GET_NEAREST_PACKAGE = CONNECTOR___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Has Referenced Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ASSOCIATION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END__REFERENCED_ELEMENT = NAMED_ELEMENT_OPTIONAL__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END__NAME = NAMED_ELEMENT_OPTIONAL__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END__CARDINALITY = NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END__TYPE = NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END__ASSOCIATION = NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END__NAVIGABLE = NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Member End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END_FEATURE_COUNT = NAMED_ELEMENT_OPTIONAL_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END___GET_NEAREST_PACKAGE = NAMED_ELEMENT_OPTIONAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Member End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_END_OPERATION_COUNT = NAMED_ELEMENT_OPTIONAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.Visibility
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 31;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.PrimitiveType
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 32;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind <em>Aggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
	 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAggregationKind()
	 * @generated
	 */
	int AGGREGATION_KIND = 33;


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
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getPackageImports <em>Package Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Imports</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Package#getPackageImports()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackageImports();

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
	 * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getOwningPackage <em>Owning Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Package</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Package#getOwningPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwningPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Import</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.PackageImport
	 * @generated
	 */
	EClass getPackageImport();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.PackageImport#getReferencedElement()
	 * @see #getPackageImport()
	 * @generated
	 */
	EReference getPackageImport_ReferencedElement();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Namespace</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.PackageImport#getImportingNamespace()
	 * @see #getPackageImport()
	 * @generated
	 */
	EReference getPackageImport_ImportingNamespace();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.DataTypeReference <em>Data Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Reference</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.DataTypeReference
	 * @generated
	 */
	EClass getDataTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.DataTypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.DataTypeReference#getType()
	 * @see #getDataTypeReference()
	 * @generated
	 */
	EAttribute getDataTypeReference_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference <em>UML Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Type Reference</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference
	 * @generated
	 */
	EClass getUMLTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference#getType()
	 * @see #getUMLTypeReference()
	 * @generated
	 */
	EReference getUMLTypeReference_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement <em>UML Referencing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Referencing Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement
	 * @generated
	 */
	EClass getUMLReferencingElement();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement#getReferencedElement()
	 * @see #getUMLReferencingElement()
	 * @generated
	 */
	EReference getUMLReferencingElement_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional <em>Named Element Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Optional</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional
	 * @generated
	 */
	EClass getNamedElementOptional();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional#getName()
	 * @see #getNamedElementOptional()
	 * @generated
	 */
	EAttribute getNamedElementOptional_Name();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElement#hasReferencedElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Referenced Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Referenced Element</em>' operation.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElement#hasReferencedElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNamedElement__HasReferencedElement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased <em>Named Element Aliased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Aliased</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased
	 * @generated
	 */
	EClass getNamedElementAliased();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAliasExpression <em>Alias Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alias Expression</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAliasExpression()
	 * @see #getNamedElementAliased()
	 * @generated
	 */
	EReference getNamedElementAliased_AliasExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased#getAlias()
	 * @see #getNamedElementAliased()
	 * @generated
	 */
	EAttribute getNamedElementAliased_Alias();

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
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Property#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Property#isFinal()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Final();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
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
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector <em>Typed Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Connector</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector
	 * @generated
	 */
	EClass getTypedConnector();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getLeft()
	 * @see #getTypedConnector()
	 * @generated
	 */
	EReference getTypedConnector_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getRight()
	 * @see #getTypedConnector()
	 * @generated
	 */
	EReference getTypedConnector_Right();

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
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Association#getProperties()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Properties();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getAggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Kind</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Association#getAggregationKind()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AggregationKind();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Association#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Association#isBidirectional()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Bidirectional();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getCommentedElement() <em>Get Commented Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Commented Element</em>' operation.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Association#getCommentedElement()
	 * @generated
	 */
	EOperation getAssociation__GetCommentedElement();

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
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.Generalization#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Generalization#getReferencedElement()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_ReferencedElement();

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
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.Implementation#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Implementation#getReferencedElement()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_ReferencedElement();

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
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.CommentLink#getLeft()
	 * @see #getCommentLink()
	 * @generated
	 */
	EReference getCommentLink_Left();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#hasComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Comment</em>' operation.
	 * @see de.cooperateproject.modeling.textual.cls.cls.CommentLink#hasComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCommentLink__HasComment__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink#getCommentedElement() <em>Get Commented Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Commented Element</em>' operation.
	 * @see de.cooperateproject.modeling.textual.cls.cls.CommentLink#getCommentedElement()
	 * @generated
	 */
	EOperation getCommentLink__GetCommentedElement();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties <em>Association Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Properties</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AssociationProperties
	 * @generated
	 */
	EClass getAssociationProperties();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityLeft <em>Cardinality Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality Left</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityLeft()
	 * @see #getAssociationProperties()
	 * @generated
	 */
	EReference getAssociationProperties_CardinalityLeft();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityRight <em>Cardinality Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality Right</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityRight()
	 * @see #getAssociationProperties()
	 * @generated
	 */
	EReference getAssociationProperties_CardinalityRight();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyLeft <em>Property Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Left</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyLeft()
	 * @see #getAssociationProperties()
	 * @generated
	 */
	EReference getAssociationProperties_PropertyLeft();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyRight <em>Property Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Right</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyRight()
	 * @see #getAssociationProperties()
	 * @generated
	 */
	EReference getAssociationProperties_PropertyRight();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Association</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getAssociation()
	 * @see #getAssociationProperties()
	 * @generated
	 */
	EReference getAssociationProperties_Association();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Cardinality#getLowerBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Cardinality#getUpperBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentable</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Commentable
	 * @generated
	 */
	EClass getCommentable();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.cls.cls.Commentable#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comment</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Commentable#getComment()
	 * @see #getCommentable()
	 * @generated
	 */
	EReference getCommentable_Comment();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.Commentable#getCommentedElement() <em>Get Commented Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Commented Element</em>' operation.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Commentable#getCommentedElement()
	 * @generated
	 */
	EOperation getCommentable__GetCommentedElement();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.MultiAssociation <em>Multi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Association</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MultiAssociation
	 * @generated
	 */
	EClass getMultiAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.cls.cls.MultiAssociation#getConnectorEnds <em>Connector Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Ends</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MultiAssociation#getConnectorEnds()
	 * @see #getMultiAssociation()
	 * @generated
	 */
	EReference getMultiAssociation_ConnectorEnds();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member End</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MemberEnd
	 * @generated
	 */
	EClass getMemberEnd();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getCardinality()
	 * @see #getMemberEnd()
	 * @generated
	 */
	EReference getMemberEnd_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getType()
	 * @see #getMemberEnd()
	 * @generated
	 */
	EReference getMemberEnd_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Association</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getAssociation()
	 * @see #getMemberEnd()
	 * @generated
	 */
	EReference getMemberEnd_Association();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#isNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.MemberEnd#isNavigable()
	 * @see #getMemberEnd()
	 * @generated
	 */
	EAttribute getMemberEnd_Navigable();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.cls.cls.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.cls.cls.Element#getNearestPackage() <em>Get Nearest Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nearest Package</em>' operation.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Element#getNearestPackage()
	 * @generated
	 */
	EOperation getElement__GetNearestPackage();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.cls.cls.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.modeling.textual.cls.cls.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see de.cooperateproject.modeling.textual.cls.cls.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

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
		 * The meta object literal for the '<em><b>Package Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGE_IMPORTS = eINSTANCE.getPackage_PackageImports();

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
		 * The meta object literal for the '<em><b>Owning Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNING_PACKAGE = eINSTANCE.getPackage_OwningPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.PackageableElement <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.PackageableElement
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImportImpl <em>Package Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.PackageImportImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPackageImport()
		 * @generated
		 */
		EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__REFERENCED_ELEMENT = eINSTANCE.getPackageImport_ReferencedElement();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getPackageImport_ImportingNamespace();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.TypeReferenceImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.DataTypeReferenceImpl <em>Data Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.DataTypeReferenceImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getDataTypeReference()
		 * @generated
		 */
		EClass DATA_TYPE_REFERENCE = eINSTANCE.getDataTypeReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_REFERENCE__TYPE = eINSTANCE.getDataTypeReference_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.UMLTypeReferenceImpl <em>UML Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.UMLTypeReferenceImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getUMLTypeReference()
		 * @generated
		 */
		EClass UML_TYPE_REFERENCE = eINSTANCE.getUMLTypeReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_TYPE_REFERENCE__TYPE = eINSTANCE.getUMLTypeReference_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.UMLReferencingElementImpl <em>UML Referencing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.UMLReferencingElementImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getUMLReferencingElement()
		 * @generated
		 */
		EClass UML_REFERENCING_ELEMENT = eINSTANCE.getUMLReferencingElement();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT = eINSTANCE.getUMLReferencingElement_ReferencedElement();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementOptionalImpl <em>Named Element Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementOptionalImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getNamedElementOptional()
		 * @generated
		 */
		EClass NAMED_ELEMENT_OPTIONAL = eINSTANCE.getNamedElementOptional();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT_OPTIONAL__NAME = eINSTANCE.getNamedElementOptional_Name();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Has Referenced Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNamedElement__HasReferencedElement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementAliasedImpl <em>Named Element Aliased</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementAliasedImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getNamedElementAliased()
		 * @generated
		 */
		EClass NAMED_ELEMENT_ALIASED = eINSTANCE.getNamedElementAliased();

		/**
		 * The meta object literal for the '<em><b>Alias Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_ALIASED__ALIAS_EXPRESSION = eINSTANCE.getNamedElementAliased_AliasExpression();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT_ALIASED__ALIAS = eINSTANCE.getNamedElementAliased_Alias();

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
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__FINAL = eINSTANCE.getProperty_Final();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl <em>Typed Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getTypedConnector()
		 * @generated
		 */
		EClass TYPED_CONNECTOR = eINSTANCE.getTypedConnector();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_CONNECTOR__LEFT = eINSTANCE.getTypedConnector_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_CONNECTOR__RIGHT = eINSTANCE.getTypedConnector_Right();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PROPERTIES = eINSTANCE.getAssociation_Properties();

		/**
		 * The meta object literal for the '<em><b>Aggregation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__AGGREGATION_KIND = eINSTANCE.getAssociation_AggregationKind();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getAssociation_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Get Commented Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION___GET_COMMENTED_ELEMENT = eINSTANCE.getAssociation__GetCommentedElement();

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
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__REFERENCED_ELEMENT = eINSTANCE.getGeneralization_ReferencedElement();

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
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__REFERENCED_ELEMENT = eINSTANCE.getImplementation_ReferencedElement();

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
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT_LINK__LEFT = eINSTANCE.getCommentLink_Left();

		/**
		 * The meta object literal for the '<em><b>Has Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT_LINK___HAS_COMMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCommentLink__HasComment__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get Commented Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT_LINK___GET_COMMENTED_ELEMENT = eINSTANCE.getCommentLink__GetCommentedElement();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl <em>Association Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getAssociationProperties()
		 * @generated
		 */
		EClass ASSOCIATION_PROPERTIES = eINSTANCE.getAssociationProperties();

		/**
		 * The meta object literal for the '<em><b>Cardinality Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PROPERTIES__CARDINALITY_LEFT = eINSTANCE.getAssociationProperties_CardinalityLeft();

		/**
		 * The meta object literal for the '<em><b>Cardinality Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT = eINSTANCE.getAssociationProperties_CardinalityRight();

		/**
		 * The meta object literal for the '<em><b>Property Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PROPERTIES__PROPERTY_LEFT = eINSTANCE.getAssociationProperties_PropertyLeft();

		/**
		 * The meta object literal for the '<em><b>Property Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PROPERTIES__PROPERTY_RIGHT = eINSTANCE.getAssociationProperties_PropertyRight();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PROPERTIES__ASSOCIATION = eINSTANCE.getAssociationProperties_Association();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.CardinalityImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentableImpl <em>Commentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.CommentableImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getCommentable()
		 * @generated
		 */
		EClass COMMENTABLE = eINSTANCE.getCommentable();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTABLE__COMMENT = eINSTANCE.getCommentable_Comment();

		/**
		 * The meta object literal for the '<em><b>Get Commented Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENTABLE___GET_COMMENTED_ELEMENT = eINSTANCE.getCommentable__GetCommentedElement();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl <em>Multi Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMultiAssociation()
		 * @generated
		 */
		EClass MULTI_ASSOCIATION = eINSTANCE.getMultiAssociation();

		/**
		 * The meta object literal for the '<em><b>Connector Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_ASSOCIATION__CONNECTOR_ENDS = eINSTANCE.getMultiAssociation_ConnectorEnds();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl <em>Member End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getMemberEnd()
		 * @generated
		 */
		EClass MEMBER_END = eINSTANCE.getMemberEnd();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_END__CARDINALITY = eINSTANCE.getMemberEnd_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_END__TYPE = eINSTANCE.getMemberEnd_Type();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_END__ASSOCIATION = eINSTANCE.getMemberEnd_Association();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_END__NAVIGABLE = eINSTANCE.getMemberEnd_Navigable();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ElementImpl
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Get Nearest Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_NEAREST_PACKAGE = eINSTANCE.getElement__GetNearestPackage();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.Visibility
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.cls.cls.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.cls.cls.PrimitiveType
		 * @see de.cooperateproject.modeling.textual.cls.cls.impl.ClsPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

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
