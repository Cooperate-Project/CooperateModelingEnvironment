/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClassifierAssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedConnectorImpl extends ConnectorImpl implements TypedConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.TYPED_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierAssociationEnd getLeft() {
		return (ClassifierAssociationEnd)eDynamicGet(ClsPackage.TYPED_CONNECTOR__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ClassifierAssociationEnd newLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeft, ClsPackage.TYPED_CONNECTOR__LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(ClassifierAssociationEnd newLeft) {
		eDynamicSet(ClsPackage.TYPED_CONNECTOR__LEFT, ClsPackage.Literals.TYPED_CONNECTOR__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierAssociationEnd getRight() {
		return (ClassifierAssociationEnd)eDynamicGet(ClsPackage.TYPED_CONNECTOR__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(ClassifierAssociationEnd newRight, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRight, ClsPackage.TYPED_CONNECTOR__RIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(ClassifierAssociationEnd newRight) {
		eDynamicSet(ClsPackage.TYPED_CONNECTOR__RIGHT, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClsPackage.TYPED_CONNECTOR__LEFT:
				return basicSetLeft(null, msgs);
			case ClsPackage.TYPED_CONNECTOR__RIGHT:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClsPackage.TYPED_CONNECTOR__LEFT:
				return getLeft();
			case ClsPackage.TYPED_CONNECTOR__RIGHT:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClsPackage.TYPED_CONNECTOR__LEFT:
				setLeft((ClassifierAssociationEnd)newValue);
				return;
			case ClsPackage.TYPED_CONNECTOR__RIGHT:
				setRight((ClassifierAssociationEnd)newValue);
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
			case ClsPackage.TYPED_CONNECTOR__LEFT:
				setLeft((ClassifierAssociationEnd)null);
				return;
			case ClsPackage.TYPED_CONNECTOR__RIGHT:
				setRight((ClassifierAssociationEnd)null);
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
			case ClsPackage.TYPED_CONNECTOR__LEFT:
				return getLeft() != null;
			case ClsPackage.TYPED_CONNECTOR__RIGHT:
				return getRight() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypedConnectorImpl
