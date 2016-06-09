/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Fork;
import de.cooperateproject.modeling.textual.activity.activity.ForkEnd;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl#getForkStart <em>Fork Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl#getForkEnd <em>Fork End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkImpl extends ActivityElementImpl implements Fork
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForkImpl()
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
    return ActivityPackage.Literals.FORK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForkEnd getForkStart()
  {
    return (ForkEnd)eDynamicGet(ActivityPackage.FORK__FORK_START, ActivityPackage.Literals.FORK__FORK_START, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForkStart(ForkEnd newForkStart, NotificationChain msgs)
  {
    msgs = eDynamicInverseAdd((InternalEObject)newForkStart, ActivityPackage.FORK__FORK_START, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForkStart(ForkEnd newForkStart)
  {
    eDynamicSet(ActivityPackage.FORK__FORK_START, ActivityPackage.Literals.FORK__FORK_START, newForkStart);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForkEnd getForkEnd()
  {
    return (ForkEnd)eDynamicGet(ActivityPackage.FORK__FORK_END, ActivityPackage.Literals.FORK__FORK_END, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForkEnd(ForkEnd newForkEnd, NotificationChain msgs)
  {
    msgs = eDynamicInverseAdd((InternalEObject)newForkEnd, ActivityPackage.FORK__FORK_END, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForkEnd(ForkEnd newForkEnd)
  {
    eDynamicSet(ActivityPackage.FORK__FORK_END, ActivityPackage.Literals.FORK__FORK_END, newForkEnd);
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
      case ActivityPackage.FORK__FORK_START:
        return basicSetForkStart(null, msgs);
      case ActivityPackage.FORK__FORK_END:
        return basicSetForkEnd(null, msgs);
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
      case ActivityPackage.FORK__FORK_START:
        return getForkStart();
      case ActivityPackage.FORK__FORK_END:
        return getForkEnd();
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
      case ActivityPackage.FORK__FORK_START:
        setForkStart((ForkEnd)newValue);
        return;
      case ActivityPackage.FORK__FORK_END:
        setForkEnd((ForkEnd)newValue);
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
      case ActivityPackage.FORK__FORK_START:
        setForkStart((ForkEnd)null);
        return;
      case ActivityPackage.FORK__FORK_END:
        setForkEnd((ForkEnd)null);
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
      case ActivityPackage.FORK__FORK_START:
        return getForkStart() != null;
      case ActivityPackage.FORK__FORK_END:
        return getForkEnd() != null;
    }
    return super.eIsSet(featureID);
  }

} //ForkImpl
