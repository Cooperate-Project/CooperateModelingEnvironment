/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Condition;
import de.cooperateproject.modeling.textual.activity.activity.ConditionEnd;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl#getConditionStart <em>Condition Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl#getConditionEnd <em>Condition End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends ActivityElementImpl implements Condition
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return ActivityPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionEnd getConditionStart()
  {
    return (ConditionEnd)eDynamicGet(ActivityPackage.CONDITION__CONDITION_START, ActivityPackage.Literals.CONDITION__CONDITION_START, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionStart(ConditionEnd newConditionStart, NotificationChain msgs)
  {
    msgs = eDynamicInverseAdd((InternalEObject)newConditionStart, ActivityPackage.CONDITION__CONDITION_START, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionStart(ConditionEnd newConditionStart)
  {
    eDynamicSet(ActivityPackage.CONDITION__CONDITION_START, ActivityPackage.Literals.CONDITION__CONDITION_START, newConditionStart);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionEnd getConditionEnd()
  {
    return (ConditionEnd)eDynamicGet(ActivityPackage.CONDITION__CONDITION_END, ActivityPackage.Literals.CONDITION__CONDITION_END, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionEnd(ConditionEnd newConditionEnd, NotificationChain msgs)
  {
    msgs = eDynamicInverseAdd((InternalEObject)newConditionEnd, ActivityPackage.CONDITION__CONDITION_END, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionEnd(ConditionEnd newConditionEnd)
  {
    eDynamicSet(ActivityPackage.CONDITION__CONDITION_END, ActivityPackage.Literals.CONDITION__CONDITION_END, newConditionEnd);
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
      case ActivityPackage.CONDITION__CONDITION_START:
        return basicSetConditionStart(null, msgs);
      case ActivityPackage.CONDITION__CONDITION_END:
        return basicSetConditionEnd(null, msgs);
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
      case ActivityPackage.CONDITION__CONDITION_START:
        return getConditionStart();
      case ActivityPackage.CONDITION__CONDITION_END:
        return getConditionEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ActivityPackage.CONDITION__CONDITION_START:
        setConditionStart((ConditionEnd)newValue);
        return;
      case ActivityPackage.CONDITION__CONDITION_END:
        setConditionEnd((ConditionEnd)newValue);
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
      case ActivityPackage.CONDITION__CONDITION_START:
        setConditionStart((ConditionEnd)null);
        return;
      case ActivityPackage.CONDITION__CONDITION_END:
        setConditionEnd((ConditionEnd)null);
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
      case ActivityPackage.CONDITION__CONDITION_START:
        return getConditionStart() != null;
      case ActivityPackage.CONDITION__CONDITION_END:
        return getConditionEnd() != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
