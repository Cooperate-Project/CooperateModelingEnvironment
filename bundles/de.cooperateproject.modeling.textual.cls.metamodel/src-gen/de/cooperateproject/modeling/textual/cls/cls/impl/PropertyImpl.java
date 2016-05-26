/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.cls.TypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyImpl extends CDOObjectImpl implements Property {
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
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.PROPERTY;
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
		return (Visibility)eDynamicGet(ClsPackage.PROPERTY__VISIBILITY, ClsPackage.Literals.PROPERTY__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(ClsPackage.PROPERTY__VISIBILITY, ClsPackage.Literals.PROPERTY__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ClsPackage.PROPERTY__NAME, ClsPackage.Literals.PROPERTY__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ClsPackage.PROPERTY__NAME, ClsPackage.Literals.PROPERTY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (Boolean)eDynamicGet(ClsPackage.PROPERTY__STATIC, ClsPackage.Literals.PROPERTY__STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		eDynamicSet(ClsPackage.PROPERTY__STATIC, ClsPackage.Literals.PROPERTY__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return (Boolean)eDynamicGet(ClsPackage.PROPERTY__FINAL, ClsPackage.Literals.PROPERTY__FINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		eDynamicSet(ClsPackage.PROPERTY__FINAL, ClsPackage.Literals.PROPERTY__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		return (TypeReference)eDynamicGet(ClsPackage.PROPERTY__TYPE, ClsPackage.Literals.PROPERTY__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, ClsPackage.PROPERTY__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		eDynamicSet(ClsPackage.PROPERTY__TYPE, ClsPackage.Literals.PROPERTY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClsPackage.PROPERTY__TYPE:
				return basicSetType(null, msgs);
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
			case ClsPackage.PROPERTY__VISIBILITY:
				return getVisibility();
			case ClsPackage.PROPERTY__NAME:
				return getName();
			case ClsPackage.PROPERTY__STATIC:
				return isStatic();
			case ClsPackage.PROPERTY__FINAL:
				return isFinal();
			case ClsPackage.PROPERTY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClsPackage.PROPERTY__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case ClsPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ClsPackage.PROPERTY__STATIC:
				setStatic((Boolean)newValue);
				return;
			case ClsPackage.PROPERTY__FINAL:
				setFinal((Boolean)newValue);
				return;
			case ClsPackage.PROPERTY__TYPE:
				setType((TypeReference)newValue);
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
			case ClsPackage.PROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ClsPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClsPackage.PROPERTY__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case ClsPackage.PROPERTY__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case ClsPackage.PROPERTY__TYPE:
				setType((TypeReference)null);
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
			case ClsPackage.PROPERTY__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case ClsPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ClsPackage.PROPERTY__STATIC:
				return isStatic() != STATIC_EDEFAULT;
			case ClsPackage.PROPERTY__FINAL:
				return isFinal() != FINAL_EDEFAULT;
			case ClsPackage.PROPERTY__TYPE:
				return getType() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyImpl
