/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl.impl;

import de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorCardinalitiy;
import de.cooperateproject.uml.xtext.clazz.umlDsl.ConnectorLabel;
import de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Cardinalitiy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl#getMiddle <em>Middle</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ConnectorCardinalitiyImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorCardinalitiyImpl extends MinimalEObjectImpl.Container implements ConnectorCardinalitiy
{
  /**
   * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected static final String LEFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected String left = LEFT_EDEFAULT;

  /**
   * The default value of the '{@link #getMiddle() <em>Middle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddle()
   * @generated
   * @ordered
   */
  protected static final String MIDDLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiddle() <em>Middle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddle()
   * @generated
   * @ordered
   */
  protected String middle = MIDDLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ConnectorLabel right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectorCardinalitiyImpl()
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
    return UmlDslPackage.Literals.CONNECTOR_CARDINALITIY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(String newLeft)
  {
    String oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlDslPackage.CONNECTOR_CARDINALITIY__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiddle()
  {
    return middle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiddle(String newMiddle)
  {
    String oldMiddle = middle;
    middle = newMiddle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlDslPackage.CONNECTOR_CARDINALITIY__MIDDLE, oldMiddle, middle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectorLabel getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ConnectorLabel newRight, NotificationChain msgs)
  {
    ConnectorLabel oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ConnectorLabel newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT, newRight, newRight));
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
      case UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT:
        return basicSetRight(null, msgs);
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
      case UmlDslPackage.CONNECTOR_CARDINALITIY__LEFT:
        return getLeft();
      case UmlDslPackage.CONNECTOR_CARDINALITIY__MIDDLE:
        return getMiddle();
      case UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT:
        return getRight();
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
      case UmlDslPackage.CONNECTOR_CARDINALITIY__LEFT:
        setLeft((String)newValue);
        return;
      case UmlDslPackage.CONNECTOR_CARDINALITIY__MIDDLE:
        setMiddle((String)newValue);
        return;
      case UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT:
        setRight((ConnectorLabel)newValue);
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
      case UmlDslPackage.CONNECTOR_CARDINALITIY__LEFT:
        setLeft(LEFT_EDEFAULT);
        return;
      case UmlDslPackage.CONNECTOR_CARDINALITIY__MIDDLE:
        setMiddle(MIDDLE_EDEFAULT);
        return;
      case UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT:
        setRight((ConnectorLabel)null);
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
      case UmlDslPackage.CONNECTOR_CARDINALITIY__LEFT:
        return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
      case UmlDslPackage.CONNECTOR_CARDINALITIY__MIDDLE:
        return MIDDLE_EDEFAULT == null ? middle != null : !MIDDLE_EDEFAULT.equals(middle);
      case UmlDslPackage.CONNECTOR_CARDINALITIY__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (left: ");
    result.append(left);
    result.append(", middle: ");
    result.append(middle);
    result.append(')');
    return result.toString();
  }

} //ConnectorCardinalitiyImpl
