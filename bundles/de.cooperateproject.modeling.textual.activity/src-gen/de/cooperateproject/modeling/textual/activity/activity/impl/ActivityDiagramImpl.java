/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.Action;
import de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram;
import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Association;
import de.cooperateproject.modeling.textual.activity.activity.Condition;
import de.cooperateproject.modeling.textual.activity.activity.Fork;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl#getForks <em>Forks</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ActivityDiagramImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends CDOObjectImpl implements ActivityDiagram
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityDiagramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ActivityPackage.Literals.ACTIVITY_DIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected int eStaticFeatureCount()
  {
    return 0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Action> getActions()
  {
    return (EList<Action>)eDynamicGet(ActivityPackage.ACTIVITY_DIAGRAM__ACTIONS, ActivityPackage.Literals.ACTIVITY_DIAGRAM__ACTIONS, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Condition> getConditions()
  {
    return (EList<Condition>)eDynamicGet(ActivityPackage.ACTIVITY_DIAGRAM__CONDITIONS, ActivityPackage.Literals.ACTIVITY_DIAGRAM__CONDITIONS, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Fork> getForks()
  {
    return (EList<Fork>)eDynamicGet(ActivityPackage.ACTIVITY_DIAGRAM__FORKS, ActivityPackage.Literals.ACTIVITY_DIAGRAM__FORKS, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Association> getAssociations()
  {
    return (EList<Association>)eDynamicGet(ActivityPackage.ACTIVITY_DIAGRAM__ASSOCIATIONS, ActivityPackage.Literals.ACTIVITY_DIAGRAM__ASSOCIATIONS, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ActivityPackage.ACTIVITY_DIAGRAM__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case ActivityPackage.ACTIVITY_DIAGRAM__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
      case ActivityPackage.ACTIVITY_DIAGRAM__FORKS:
        return ((InternalEList<?>)getForks()).basicRemove(otherEnd, msgs);
      case ActivityPackage.ACTIVITY_DIAGRAM__ASSOCIATIONS:
        return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ActivityPackage.ACTIVITY_DIAGRAM__ACTIONS:
        return getActions();
      case ActivityPackage.ACTIVITY_DIAGRAM__CONDITIONS:
        return getConditions();
      case ActivityPackage.ACTIVITY_DIAGRAM__FORKS:
        return getForks();
      case ActivityPackage.ACTIVITY_DIAGRAM__ASSOCIATIONS:
        return getAssociations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ActivityPackage.ACTIVITY_DIAGRAM__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case ActivityPackage.ACTIVITY_DIAGRAM__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Condition>)newValue);
        return;
      case ActivityPackage.ACTIVITY_DIAGRAM__FORKS:
        getForks().clear();
        getForks().addAll((Collection<? extends Fork>)newValue);
        return;
      case ActivityPackage.ACTIVITY_DIAGRAM__ASSOCIATIONS:
        getAssociations().clear();
        getAssociations().addAll((Collection<? extends Association>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ActivityPackage.ACTIVITY_DIAGRAM__ACTIONS:
        getActions().clear();
        return;
      case ActivityPackage.ACTIVITY_DIAGRAM__CONDITIONS:
        getConditions().clear();
        return;
      case ActivityPackage.ACTIVITY_DIAGRAM__FORKS:
        getForks().clear();
        return;
      case ActivityPackage.ACTIVITY_DIAGRAM__ASSOCIATIONS:
        getAssociations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ActivityPackage.ACTIVITY_DIAGRAM__ACTIONS:
        return !getActions().isEmpty();
      case ActivityPackage.ACTIVITY_DIAGRAM__CONDITIONS:
        return !getConditions().isEmpty();
      case ActivityPackage.ACTIVITY_DIAGRAM__FORKS:
        return !getForks().isEmpty();
      case ActivityPackage.ACTIVITY_DIAGRAM__ASSOCIATIONS:
        return !getAssociations().isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActivityDiagramImpl
