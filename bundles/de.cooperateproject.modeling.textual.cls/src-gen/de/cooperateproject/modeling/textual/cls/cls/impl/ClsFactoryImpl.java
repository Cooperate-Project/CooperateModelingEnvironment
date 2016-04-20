/**
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDef;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClassElement;
import de.cooperateproject.modeling.textual.cls.cls.ClassName;
import de.cooperateproject.modeling.textual.cls.cls.ClassType;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Comment;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.ConnectorCardinalitiy;
import de.cooperateproject.modeling.textual.cls.cls.ConnectorLabel;
import de.cooperateproject.modeling.textual.cls.cls.DataType;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeEnum;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.Methode;
import de.cooperateproject.modeling.textual.cls.cls.Type;
import de.cooperateproject.modeling.textual.cls.cls.UmlDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ClsFactoryImpl extends EFactoryImpl implements ClsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ClsFactory init()
  {
    try
    {
      ClsFactory theClsFactory = (ClsFactory)EPackage.Registry.INSTANCE.getEFactory(ClsPackage.eNS_URI);
      if (theClsFactory != null)
      {
        return theClsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ClsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClsFactoryImpl()
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
      case ClsPackage.UML_DIAGRAM: return createUmlDiagram();
      case ClsPackage.CLASS_DIAGRAM: return createClassDiagram();
      case ClsPackage.CLASS_ELEMENT: return createClassElement();
      case ClsPackage.TYPE: return createType();
      case ClsPackage.CLASS_TYPE: return createClassType();
      case ClsPackage.DATA_TYPE: return createDataType();
      case ClsPackage.CLASS_DEF: return createClassDef();
      case ClsPackage.CLASS_NAME: return createClassName();
      case ClsPackage.CLASS: return createClass();
      case ClsPackage.MEMBER: return createMember();
      case ClsPackage.ATTRIBUTE: return createAttribute();
      case ClsPackage.METHODE: return createMethode();
      case ClsPackage.CONNECTOR: return createConnector();
      case ClsPackage.GENERALIZATION: return createGeneralization();
      case ClsPackage.IMPLEMENTATION: return createImplementation();
      case ClsPackage.COMMENT_LINK: return createCommentLink();
      case ClsPackage.ASSOCIATION: return createAssociation();
      case ClsPackage.ASSOCIATION_END: return createAssociationEnd();
      case ClsPackage.CONNECTOR_LABEL: return createConnectorLabel();
      case ClsPackage.CONNECTOR_CARDINALITIY: return createConnectorCardinalitiy();
      case ClsPackage.COMMENT: return createComment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ClsPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      case ClsPackage.DATA_TYPE_ENUM:
        return createDataTypeEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ClsPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      case ClsPackage.DATA_TYPE_ENUM:
        return convertDataTypeEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlDiagram createUmlDiagram()
  {
    UmlDiagramImpl umlDiagram = new UmlDiagramImpl();
    return umlDiagram;
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
  public ClassElement createClassElement()
  {
    ClassElementImpl classElement = new ClassElementImpl();
    return classElement;
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
  public ClassType createClassType()
  {
    ClassTypeImpl classType = new ClassTypeImpl();
    return classType;
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
  public de.cooperateproject.modeling.textual.cls.cls.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
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
  public Implementation createImplementation()
  {
    ImplementationImpl implementation = new ImplementationImpl();
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentLink createCommentLink()
  {
    CommentLinkImpl commentLink = new CommentLinkImpl();
    return commentLink;
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
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeEnum createDataTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    DataTypeEnum result = DataTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClsPackage getClsPackage()
  {
    return (ClsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ClsPackage getPackage()
  {
    return ClsPackage.eINSTANCE;
  }

} //ClsFactoryImpl
