/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl.util;

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
import de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage
 * @generated
 */
public class UmlDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UmlDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UmlDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UmlDslPackage.CLASS_DIAGRAM:
      {
        ClassDiagram classDiagram = (ClassDiagram)theEObject;
        T result = caseClassDiagram(classDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseElement(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.CLASS_DEF:
      {
        ClassDef classDef = (ClassDef)theEObject;
        T result = caseClassDef(classDef);
        if (result == null) result = caseElement(classDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.CLASS_NAME:
      {
        ClassName className = (ClassName)theEObject;
        T result = caseClassName(className);
        if (result == null) result = caseType(className);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseClassName(name);
        if (result == null) result = caseType(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.CLASS:
      {
        de.cooperateproject.uml.xtext.clazz.umlDsl.Class class_ = (de.cooperateproject.uml.xtext.clazz.umlDsl.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.INHERITANCE:
      {
        Inheritance inheritance = (Inheritance)theEObject;
        T result = caseInheritance(inheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseMember(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.METHODE:
      {
        Methode methode = (Methode)theEObject;
        T result = caseMethode(methode);
        if (result == null) result = caseMember(methode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.CONNECTOR:
      {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = caseElement(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.GENERALIZATION:
      {
        Generalization generalization = (Generalization)theEObject;
        T result = caseGeneralization(generalization);
        if (result == null) result = caseConnector(generalization);
        if (result == null) result = caseElement(generalization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.ASSOCIATION:
      {
        Association association = (Association)theEObject;
        T result = caseAssociation(association);
        if (result == null) result = caseConnector(association);
        if (result == null) result = caseElement(association);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.ASSOCIATION_END:
      {
        AssociationEnd associationEnd = (AssociationEnd)theEObject;
        T result = caseAssociationEnd(associationEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.CONNECTOR_LABEL:
      {
        ConnectorLabel connectorLabel = (ConnectorLabel)theEObject;
        T result = caseConnectorLabel(connectorLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlDslPackage.CONNECTOR_CARDINALITIY:
      {
        ConnectorCardinalitiy connectorCardinalitiy = (ConnectorCardinalitiy)theEObject;
        T result = caseConnectorCardinalitiy(connectorCardinalitiy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDiagram(ClassDiagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDef(ClassDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassName(ClassName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(de.cooperateproject.uml.xtext.clazz.umlDsl.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInheritance(Inheritance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Methode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethode(Methode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralization(Generalization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociation(Association object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociationEnd(AssociationEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectorLabel(ConnectorLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector Cardinalitiy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector Cardinalitiy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectorCardinalitiy(ConnectorCardinalitiy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UmlDslSwitch
