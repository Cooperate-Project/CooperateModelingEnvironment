/**
 */
package de.cooperateproject.modeling.textual.activity.activity.util;

import de.cooperateproject.modeling.textual.activity.activity.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage
 * @generated
 */
public class ActivityAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ActivityPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ActivityPackage.eINSTANCE;
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
  protected ActivitySwitch<Adapter> modelSwitch =
    new ActivitySwitch<Adapter>()
    {
      @Override
      public Adapter caseActivityDiagram(ActivityDiagram object)
      {
        return createActivityDiagramAdapter();
      }
      @Override
      public Adapter caseActivityElement(ActivityElement object)
      {
        return createActivityElementAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionEnd(ConditionEnd object)
      {
        return createConditionEndAdapter();
      }
      @Override
      public Adapter caseFork(Fork object)
      {
        return createForkAdapter();
      }
      @Override
      public Adapter caseForkEnd(ForkEnd object)
      {
        return createForkEndAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseDefReference(DefReference object)
      {
        return createDefReferenceAdapter();
      }
      @Override
      public Adapter caseDefRef(DefRef object)
      {
        return createDefRefAdapter();
      }
      @Override
      public Adapter caseStartAndEnd(StartAndEnd object)
      {
        return createStartAndEndAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
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
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram
   * @generated
   */
  public Adapter createActivityDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.ActivityElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityElement
   * @generated
   */
  public Adapter createActivityElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.ConditionEnd <em>Condition End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.ConditionEnd
   * @generated
   */
  public Adapter createConditionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.Fork <em>Fork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.Fork
   * @generated
   */
  public Adapter createForkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.ForkEnd <em>Fork End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.ForkEnd
   * @generated
   */
  public Adapter createForkEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.DefReference <em>Def Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefReference
   * @generated
   */
  public Adapter createDefReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.DefRef <em>Def Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.DefRef
   * @generated
   */
  public Adapter createDefRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.StartAndEnd <em>Start And End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.StartAndEnd
   * @generated
   */
  public Adapter createStartAndEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.activity.activity.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cooperateproject.modeling.textual.activity.activity.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
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

} //ActivityAdapterFactory
