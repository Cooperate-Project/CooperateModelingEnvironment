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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage
 * @generated
 */
public class UmlDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UmlDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UmlDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UmlDslSwitch<Adapter> modelSwitch =
    new UmlDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseClassDiagram(ClassDiagram object)
      {
        return createClassDiagramAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseClassDef(ClassDef object)
      {
        return createClassDefAdapter();
      }
      @Override
      public Adapter caseClassName(ClassName object)
      {
        return createClassNameAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseClass(de.cooperateproject.uml.xtext.clazz.umlDsl.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseInheritance(Inheritance object)
      {
        return createInheritanceAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseMethode(Methode object)
      {
        return createMethodeAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseGeneralization(Generalization object)
      {
        return createGeneralizationAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseAssociationEnd(AssociationEnd object)
      {
        return createAssociationEndAdapter();
      }
      @Override
      public Adapter caseConnectorLabel(ConnectorLabel object)
      {
        return createConnectorLabelAdapter();
      }
      @Override
      public Adapter caseConnectorCardinalitiy(ConnectorCardinalitiy object)
      {
        return createConnectorCardinalitiyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram <em>Class Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram
   * @generated
   */
  public Adapter createClassDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef
   * @generated
   */
  public Adapter createClassDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName
   * @generated
   */
  public Adapter createClassNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance
   * @generated
   */
  public Adapter createInheritanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Methode
   * @generated
   */
  public Adapter createMethodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Generalization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Generalization
   * @generated
   */
  public Adapter createGeneralizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd <em>Association End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.AssociationEnd
   * @generated
   */
  public Adapter createAssociationEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel <em>Connector Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel
   * @generated
   */
  public Adapter createConnectorLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy <em>Connector Cardinalitiy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy
   * @generated
   */
  public Adapter createConnectorCardinalitiyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UmlDslAdapterFactory
