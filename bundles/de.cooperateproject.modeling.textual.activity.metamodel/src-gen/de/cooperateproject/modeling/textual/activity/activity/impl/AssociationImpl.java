/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Association;
import de.cooperateproject.modeling.textual.activity.activity.Comment;
import de.cooperateproject.modeling.textual.activity.activity.Reference;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.AssociationImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends CDOObjectImpl implements Association {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ASSOCIATION;
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
	public Reference getLeft() {
		return (Reference)eDynamicGet(ActivityPackage.ASSOCIATION__LEFT, ActivityPackage.Literals.ASSOCIATION__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Reference newLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeft, ActivityPackage.ASSOCIATION__LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Reference newLeft) {
		eDynamicSet(ActivityPackage.ASSOCIATION__LEFT, ActivityPackage.Literals.ASSOCIATION__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRight() {
		return (Reference)eDynamicGet(ActivityPackage.ASSOCIATION__RIGHT, ActivityPackage.Literals.ASSOCIATION__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Reference newRight, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRight, ActivityPackage.ASSOCIATION__RIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Reference newRight) {
		eDynamicSet(ActivityPackage.ASSOCIATION__RIGHT, ActivityPackage.Literals.ASSOCIATION__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		return (Comment)eDynamicGet(ActivityPackage.ASSOCIATION__COMMENT, ActivityPackage.Literals.ASSOCIATION__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComment, ActivityPackage.ASSOCIATION__COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment) {
		eDynamicSet(ActivityPackage.ASSOCIATION__COMMENT, ActivityPackage.Literals.ASSOCIATION__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ASSOCIATION__LEFT:
				return basicSetLeft(null, msgs);
			case ActivityPackage.ASSOCIATION__RIGHT:
				return basicSetRight(null, msgs);
			case ActivityPackage.ASSOCIATION__COMMENT:
				return basicSetComment(null, msgs);
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
			case ActivityPackage.ASSOCIATION__LEFT:
				return getLeft();
			case ActivityPackage.ASSOCIATION__RIGHT:
				return getRight();
			case ActivityPackage.ASSOCIATION__COMMENT:
				return getComment();
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
			case ActivityPackage.ASSOCIATION__LEFT:
				setLeft((Reference)newValue);
				return;
			case ActivityPackage.ASSOCIATION__RIGHT:
				setRight((Reference)newValue);
				return;
			case ActivityPackage.ASSOCIATION__COMMENT:
				setComment((Comment)newValue);
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
			case ActivityPackage.ASSOCIATION__LEFT:
				setLeft((Reference)null);
				return;
			case ActivityPackage.ASSOCIATION__RIGHT:
				setRight((Reference)null);
				return;
			case ActivityPackage.ASSOCIATION__COMMENT:
				setComment((Comment)null);
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
			case ActivityPackage.ASSOCIATION__LEFT:
				return getLeft() != null;
			case ActivityPackage.ASSOCIATION__RIGHT:
				return getRight() != null;
			case ActivityPackage.ASSOCIATION__COMMENT:
				return getComment() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
