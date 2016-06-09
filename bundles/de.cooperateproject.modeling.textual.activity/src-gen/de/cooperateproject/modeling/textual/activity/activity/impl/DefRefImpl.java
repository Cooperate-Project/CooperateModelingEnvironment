/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.DefRef;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.DefRefImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.DefRefImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefRefImpl extends CDOObjectImpl implements DefRef
{
  /**
   * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected static final String LONG_NAME_EDEFAULT = null;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefRefImpl()
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
    return ActivityPackage.Literals.DEF_REF;
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
  public String getLongName()
  {
    return (String)eDynamicGet(ActivityPackage.DEF_REF__LONG_NAME, ActivityPackage.Literals.DEF_REF__LONG_NAME, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongName(String newLongName)
  {
    eDynamicSet(ActivityPackage.DEF_REF__LONG_NAME, ActivityPackage.Literals.DEF_REF__LONG_NAME, newLongName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return (String)eDynamicGet(ActivityPackage.DEF_REF__NAME, ActivityPackage.Literals.DEF_REF__NAME, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    eDynamicSet(ActivityPackage.DEF_REF__NAME, ActivityPackage.Literals.DEF_REF__NAME, newName);
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
      case ActivityPackage.DEF_REF__LONG_NAME:
        return getLongName();
      case ActivityPackage.DEF_REF__NAME:
        return getName();
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
      case ActivityPackage.DEF_REF__LONG_NAME:
        setLongName((String)newValue);
        return;
      case ActivityPackage.DEF_REF__NAME:
        setName((String)newValue);
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
      case ActivityPackage.DEF_REF__LONG_NAME:
        setLongName(LONG_NAME_EDEFAULT);
        return;
      case ActivityPackage.DEF_REF__NAME:
        setName(NAME_EDEFAULT);
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
      case ActivityPackage.DEF_REF__LONG_NAME:
        return LONG_NAME_EDEFAULT == null ? getLongName() != null : !LONG_NAME_EDEFAULT.equals(getLongName());
      case ActivityPackage.DEF_REF__NAME:
        return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
    }
    return super.eIsSet(featureID);
  }

} //DefRefImpl
