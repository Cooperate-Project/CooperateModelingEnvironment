/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl.impl;

import de.cooperateproject.uml.xtext.clazz.umlDsl.Association;
import de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Attribute;
import de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef;
import de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram;
import de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Connector;
import de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy;
import de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel;
import de.cooperateproject.uml.xtext.clazz.umlDsl.DataType;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Element;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Generalization;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Member;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Methode;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Name;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Type;
import de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslFactory;
import de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlDslFactoryImpl extends EFactoryImpl implements UmlDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UmlDslFactory init()
  {
    try
    {
      UmlDslFactory theUmlDslFactory = (UmlDslFactory)EPackage.Registry.INSTANCE.getEFactory(UmlDslPackage.eNS_URI);
      if (theUmlDslFactory != null)
      {
        return theUmlDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UmlDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UmlDslPackage.CLASS_DIAGRAM: return createClassDiagram();
      case UmlDslPackage.ELEMENT: return createElement();
      case UmlDslPackage.DATA_TYPE: return createDataType();
      case UmlDslPackage.TYPE: return createType();
      case UmlDslPackage.CLASS_DEF: return createClassDef();
      case UmlDslPackage.CLASS_NAME: return createClassName();
      case UmlDslPackage.NAME: return createName();
      case UmlDslPackage.CLASS: return createClass();
      case UmlDslPackage.INHERITANCE: return createInheritance();
      case UmlDslPackage.MEMBER: return createMember();
      case UmlDslPackage.ATTRIBUTE: return createAttribute();
      case UmlDslPackage.METHODE: return createMethode();
      case UmlDslPackage.CONNECTOR: return createConnector();
      case UmlDslPackage.GENERALIZATION: return createGeneralization();
      case UmlDslPackage.ASSOCIATION: return createAssociation();
      case UmlDslPackage.ASSOCIATION_END: return createAssociationEnd();
      case UmlDslPackage.CONNECTOR_LABEL: return createConnectorLabel();
      case UmlDslPackage.CONNECTOR_CARDINALITIY: return createConnectorCardinalitiy();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDiagram createClassDiagram()
  {
    ClassDiagramImpl classDiagram = new ClassDiagramImpl();
    return classDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDef createClassDef()
  {
    ClassDefImpl classDef = new ClassDefImpl();
    return classDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassName createClassName()
  {
    ClassNameImpl className = new ClassNameImpl();
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cooperateproject.uml.xtext.clazz.umlDsl.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inheritance createInheritance()
  {
    InheritanceImpl inheritance = new InheritanceImpl();
    return inheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methode createMethode()
  {
    MethodeImpl methode = new MethodeImpl();
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generalization createGeneralization()
  {
    GeneralizationImpl generalization = new GeneralizationImpl();
    return generalization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssociationEnd createAssociationEnd()
  {
    AssociationEndImpl associationEnd = new AssociationEndImpl();
    return associationEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectorLabel createConnectorLabel()
  {
    ConnectorLabelImpl connectorLabel = new ConnectorLabelImpl();
    return connectorLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectorCardinalitiy createConnectorCardinalitiy()
  {
    ConnectorCardinalitiyImpl connectorCardinalitiy = new ConnectorCardinalitiyImpl();
    return connectorCardinalitiy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlDslPackage getUmlDslPackage()
  {
    return (UmlDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UmlDslPackage getPackage()
  {
    return UmlDslPackage.eINSTANCE;
  }

} //UmlDslFactoryImpl
