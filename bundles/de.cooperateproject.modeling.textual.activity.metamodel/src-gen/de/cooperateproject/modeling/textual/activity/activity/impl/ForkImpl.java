/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Comment;
import de.cooperateproject.modeling.textual.activity.activity.Fork;
import de.cooperateproject.modeling.textual.activity.activity.ForkEnd;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkImpl extends CDOObjectImpl implements Fork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.FORK;
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
	public ForkEnd getForkStart() {
		return (ForkEnd)eDynamicGet(ActivityPackage.FORK__FORK_START, ActivityPackage.Literals.FORK__FORK_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForkStart(ForkEnd newForkStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newForkStart, ActivityPackage.FORK__FORK_START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForkStart(ForkEnd newForkStart) {
		eDynamicSet(ActivityPackage.FORK__FORK_START, ActivityPackage.Literals.FORK__FORK_START, newForkStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkEnd getForkEnd() {
		return (ForkEnd)eDynamicGet(ActivityPackage.FORK__FORK_END, ActivityPackage.Literals.FORK__FORK_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForkEnd(ForkEnd newForkEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newForkEnd, ActivityPackage.FORK__FORK_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForkEnd(ForkEnd newForkEnd) {
		eDynamicSet(ActivityPackage.FORK__FORK_END, ActivityPackage.Literals.FORK__FORK_END, newForkEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		return (Comment)eDynamicGet(ActivityPackage.FORK__COMMENT, ActivityPackage.Literals.FORK__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComment, ActivityPackage.FORK__COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment) {
		eDynamicSet(ActivityPackage.FORK__COMMENT, ActivityPackage.Literals.FORK__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.FORK__FORK_START:
				return basicSetForkStart(null, msgs);
			case ActivityPackage.FORK__FORK_END:
				return basicSetForkEnd(null, msgs);
			case ActivityPackage.FORK__COMMENT:
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
			case ActivityPackage.FORK__FORK_START:
				return getForkStart();
			case ActivityPackage.FORK__FORK_END:
				return getForkEnd();
			case ActivityPackage.FORK__COMMENT:
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
			case ActivityPackage.FORK__FORK_START:
				setForkStart((ForkEnd)newValue);
				return;
			case ActivityPackage.FORK__FORK_END:
				setForkEnd((ForkEnd)newValue);
				return;
			case ActivityPackage.FORK__COMMENT:
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
			case ActivityPackage.FORK__FORK_START:
				setForkStart((ForkEnd)null);
				return;
			case ActivityPackage.FORK__FORK_END:
				setForkEnd((ForkEnd)null);
				return;
			case ActivityPackage.FORK__COMMENT:
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
			case ActivityPackage.FORK__FORK_START:
				return getForkStart() != null;
			case ActivityPackage.FORK__FORK_END:
				return getForkEnd() != null;
			case ActivityPackage.FORK__COMMENT:
				return getComment() != null;
		}
		return super.eIsSet(featureID);
	}

} //ForkImpl
