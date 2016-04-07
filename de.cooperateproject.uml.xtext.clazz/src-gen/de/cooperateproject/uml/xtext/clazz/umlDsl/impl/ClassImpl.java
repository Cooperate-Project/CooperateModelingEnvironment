/**
 */
package de.cooperateproject.uml.xtext.clazz.umlDsl.impl;

import de.cooperateproject.uml.xtext.clazz.umlDsl.ClassName;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Inheritance;
import de.cooperateproject.uml.xtext.clazz.umlDsl.Member;
import de.cooperateproject.uml.xtext.clazz.umlDsl.UmlDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.uml.xtext.clazz.umlDsl.impl.ClassImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ElementImpl implements de.cooperateproject.uml.xtext.clazz.umlDsl.Class
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ClassName type;

  /**
   * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritance()
   * @generated
   * @ordered
   */
  protected Inheritance inheritance;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return UmlDslPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassName getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ClassName)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlDslPackage.CLASS__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassName basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ClassName newType)
  {
    ClassName oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlDslPackage.CLASS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inheritance getInheritance()
  {
    return inheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs)
  {
    Inheritance oldInheritance = inheritance;
    inheritance = newInheritance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlDslPackage.CLASS__INHERITANCE, oldInheritance, newInheritance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInheritance(Inheritance newInheritance)
  {
    if (newInheritance != inheritance)
    {
      NotificationChain msgs = null;
      if (inheritance != null)
        msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlDslPackage.CLASS__INHERITANCE, null, msgs);
      if (newInheritance != null)
        msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlDslPackage.CLASS__INHERITANCE, null, msgs);
      msgs = basicSetInheritance(newInheritance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlDslPackage.CLASS__INHERITANCE, newInheritance, newInheritance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, UmlDslPackage.CLASS__MEMBERS);
    }
    return members;
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
      case UmlDslPackage.CLASS__INHERITANCE:
        return basicSetInheritance(null, msgs);
      case UmlDslPackage.CLASS__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case UmlDslPackage.CLASS__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case UmlDslPackage.CLASS__INHERITANCE:
        return getInheritance();
      case UmlDslPackage.CLASS__MEMBERS:
        return getMembers();
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
      case UmlDslPackage.CLASS__TYPE:
        setType((ClassName)newValue);
        return;
      case UmlDslPackage.CLASS__INHERITANCE:
        setInheritance((Inheritance)newValue);
        return;
      case UmlDslPackage.CLASS__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
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
      case UmlDslPackage.CLASS__TYPE:
        setType((ClassName)null);
        return;
      case UmlDslPackage.CLASS__INHERITANCE:
        setInheritance((Inheritance)null);
        return;
      case UmlDslPackage.CLASS__MEMBERS:
        getMembers().clear();
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
      case UmlDslPackage.CLASS__TYPE:
        return type != null;
      case UmlDslPackage.CLASS__INHERITANCE:
        return inheritance != null;
      case UmlDslPackage.CLASS__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
