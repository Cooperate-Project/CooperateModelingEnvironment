/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends CDOObjectImpl implements Classifier {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.DEFAULT;

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
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(ClsPackage.CLASSIFIER__VISIBILITY, ClsPackage.Literals.CLASSIFIER__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(ClsPackage.CLASSIFIER__VISIBILITY, ClsPackage.Literals.CLASSIFIER__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ClsPackage.CLASSIFIER__NAME, ClsPackage.Literals.CLASSIFIER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ClsPackage.CLASSIFIER__NAME, ClsPackage.Literals.CLASSIFIER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return (String)eDynamicGet(ClsPackage.CLASSIFIER__LONG_NAME, ClsPackage.Literals.CLASSIFIER__LONG_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		eDynamicSet(ClsPackage.CLASSIFIER__LONG_NAME, ClsPackage.Literals.CLASSIFIER__LONG_NAME, newLongName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member> getMembers() {
		return (EList<Member>)eDynamicGet(ClsPackage.CLASSIFIER__MEMBERS, ClsPackage.Literals.CLASSIFIER__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClsPackage.CLASSIFIER__MEMBERS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClsPackage.CLASSIFIER__VISIBILITY:
				return getVisibility();
			case ClsPackage.CLASSIFIER__NAME:
				return getName();
			case ClsPackage.CLASSIFIER__LONG_NAME:
				return getLongName();
			case ClsPackage.CLASSIFIER__MEMBERS:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClsPackage.CLASSIFIER__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case ClsPackage.CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case ClsPackage.CLASSIFIER__LONG_NAME:
				setLongName((String)newValue);
				return;
			case ClsPackage.CLASSIFIER__MEMBERS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClsPackage.CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ClsPackage.CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClsPackage.CLASSIFIER__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
				return;
			case ClsPackage.CLASSIFIER__MEMBERS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClsPackage.CLASSIFIER__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case ClsPackage.CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ClsPackage.CLASSIFIER__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? getLongName() != null : !LONG_NAME_EDEFAULT.equals(getLongName());
			case ClsPackage.CLASSIFIER__MEMBERS:
				return !getMembers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassifierImpl
