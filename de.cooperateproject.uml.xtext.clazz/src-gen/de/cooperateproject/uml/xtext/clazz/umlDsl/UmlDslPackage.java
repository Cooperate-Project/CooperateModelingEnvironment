/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslFactory
 * @model kind="package"
 * @generated
 */
public interface UmlDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "umlDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cooperateproject.de/uml/xtext/clazz/UmlDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "umlDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlDslPackage eINSTANCE = de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDiagramImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClassDiagram()
   * @generated
   */
  int CLASS_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DIAGRAM__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Class Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DIAGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ElementImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.DataTypeImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.TypeImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDefImpl <em>Class Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDefImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClassDef()
   * @generated
   */
  int CLASS_DEF = 4;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEF__CLASSES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassNameImpl <em>Class Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassNameImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClassName()
   * @generated
   */
  int CLASS_NAME = 5;

  /**
   * The number of structural features of the '<em>Class Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_NAME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.NameImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getName_()
   * @generated
   */
  int NAME = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = CLASS_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Longname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__LONGNAME = CLASS_NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = CLASS_NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TYPE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INHERITANCE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MEMBERS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.InheritanceImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getInheritance()
   * @generated
   */
  int INHERITANCE = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MemberImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AttributeImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = MEMBER__NAME;

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
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MethodeImpl <em>Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MethodeImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getMethode()
   * @generated
   */
  int METHODE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__TYPE = MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__ATTRIBUTES = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__LEFT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__RIGHT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.GeneralizationImpl <em>Generalization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.GeneralizationImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getGeneralization()
   * @generated
   */
  int GENERALIZATION = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__LEFT = CONNECTOR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__RIGHT = CONNECTOR__RIGHT;

  /**
   * The number of structural features of the '<em>Generalization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__LEFT = CONNECTOR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__RIGHT = CONNECTOR__RIGHT;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__CARDINALITY = CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationEndImpl <em>Association End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationEndImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getAssociationEnd()
   * @generated
   */
  int ASSOCIATION_END = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_END__TYPE = 0;

  /**
   * The number of structural features of the '<em>Association End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_END_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorLabelImpl <em>Connector Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorLabelImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getConnectorLabel()
   * @generated
   */
  int CONNECTOR_LABEL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_LABEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Connector Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl <em>Connector Cardinalitiy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getConnectorCardinalitiy()
   * @generated
   */
  int CONNECTOR_CARDINALITIY = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_CARDINALITIY__LEFT = 0;

  /**
   * The feature id for the '<em><b>Middle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_CARDINALITIY__MIDDLE = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_CARDINALITIY__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Connector Cardinalitiy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_CARDINALITIY_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram <em>Class Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Diagram</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram
   * @generated
   */
  EClass getClassDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram#getElements()
   * @see #getClassDiagram()
   * @generated
   */
  EReference getClassDiagram_Elements();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Def</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef
   * @generated
   */
  EClass getClassDef();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef#getClasses()
   * @see #getClassDef()
   * @generated
   */
  EReference getClassDef_Classes();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Name</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName
   * @generated
   */
  EClass getClassName();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Name#getName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Name#getLongname <em>Longname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longname</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Name#getLongname()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Longname();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getType()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getInheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inheritance</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getInheritance()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Inheritance();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Class#getMembers()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Members();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance
   * @generated
   */
  EClass getInheritance();

  /**
   * Returns the meta object for the reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance#getType()
   * @see #getInheritance()
   * @generated
   */
  EReference getInheritance_Type();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for the reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methode</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Methode
   * @generated
   */
  EClass getMethode();

  /**
   * Returns the meta object for the containment reference list '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Methode#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Methode#getAttributes()
   * @see #getMethode()
   * @generated
   */
  EReference getMethode_Attributes();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getLeft()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Connector#getRight()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Right();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Generalization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalization</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Generalization
   * @generated
   */
  EClass getGeneralization();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Association#getCardinality()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Cardinality();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd <em>Association End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association End</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd
   * @generated
   */
  EClass getAssociationEnd();

  /**
   * Returns the meta object for the reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd#getType()
   * @see #getAssociationEnd()
   * @generated
   */
  EReference getAssociationEnd_Type();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel <em>Connector Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector Label</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel
   * @generated
   */
  EClass getConnectorLabel();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel#getName()
   * @see #getConnectorLabel()
   * @generated
   */
  EAttribute getConnectorLabel_Name();

  /**
   * Returns the meta object for class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy <em>Connector Cardinalitiy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector Cardinalitiy</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy
   * @generated
   */
  EClass getConnectorCardinalitiy();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getLeft()
   * @see #getConnectorCardinalitiy()
   * @generated
   */
  EAttribute getConnectorCardinalitiy_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getMiddle <em>Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Middle</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getMiddle()
   * @see #getConnectorCardinalitiy()
   * @generated
   */
  EAttribute getConnectorCardinalitiy_Middle();

  /**
   * Returns the meta object for the containment reference '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy#getRight()
   * @see #getConnectorCardinalitiy()
   * @generated
   */
  EReference getConnectorCardinalitiy_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UmlDslFactory getUmlDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDiagramImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClassDiagram()
     * @generated
     */
    EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DIAGRAM__ELEMENTS = eINSTANCE.getClassDiagram_Elements();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ElementImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.DataTypeImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.TypeImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDefImpl <em>Class Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassDefImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClassDef()
     * @generated
     */
    EClass CLASS_DEF = eINSTANCE.getClassDef();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DEF__CLASSES = eINSTANCE.getClassDef_Classes();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassNameImpl <em>Class Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassNameImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClassName()
     * @generated
     */
    EClass CLASS_NAME = eINSTANCE.getClassName();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.NameImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NAME = eINSTANCE.getName_Name();

    /**
     * The meta object literal for the '<em><b>Longname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__LONGNAME = eINSTANCE.getName_Longname();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__TYPE = eINSTANCE.getClass_Type();

    /**
     * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__INHERITANCE = eINSTANCE.getClass_Inheritance();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__MEMBERS = eINSTANCE.getClass_Members();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.InheritanceImpl <em>Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.InheritanceImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getInheritance()
     * @generated
     */
    EClass INHERITANCE = eINSTANCE.getInheritance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INHERITANCE__TYPE = eINSTANCE.getInheritance_Type();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MemberImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AttributeImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MethodeImpl <em>Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.MethodeImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getMethode()
     * @generated
     */
    EClass METHODE = eINSTANCE.getMethode();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODE__ATTRIBUTES = eINSTANCE.getMethode_Attributes();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__LEFT = eINSTANCE.getConnector_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__RIGHT = eINSTANCE.getConnector_Right();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.GeneralizationImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getGeneralization()
     * @generated
     */
    EClass GENERALIZATION = eINSTANCE.getGeneralization();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__CARDINALITY = eINSTANCE.getAssociation_Cardinality();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationEndImpl <em>Association End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.AssociationEndImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getAssociationEnd()
     * @generated
     */
    EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION_END__TYPE = eINSTANCE.getAssociationEnd_Type();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorLabelImpl <em>Connector Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorLabelImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getConnectorLabel()
     * @generated
     */
    EClass CONNECTOR_LABEL = eINSTANCE.getConnectorLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_LABEL__NAME = eINSTANCE.getConnectorLabel_Name();

    /**
     * The meta object literal for the '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl <em>Connector Cardinalitiy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl
     * @see de.cooperateproject.uml.xtext.clazz.umlDsl.impl.UmlDslPackageImpl#getConnectorCardinalitiy()
     * @generated
     */
    EClass CONNECTOR_CARDINALITIY = eINSTANCE.getConnectorCardinalitiy();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_CARDINALITIY__LEFT = eINSTANCE.getConnectorCardinalitiy_Left();

    /**
     * The meta object literal for the '<em><b>Middle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_CARDINALITIY__MIDDLE = eINSTANCE.getConnectorCardinalitiy_Middle();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR_CARDINALITIY__RIGHT = eINSTANCE.getConnectorCardinalitiy_Right();

  }

} //UmlDslPackage
