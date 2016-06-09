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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ForkImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkImpl extends ActivityElementImpl implements Fork {
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
	public ForkEnd getStart() {
		return (ForkEnd)eDynamicGet(ActivityPackage.FORK__START, ActivityPackage.Literals.FORK__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(ForkEnd newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, ActivityPackage.FORK__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ForkEnd newStart) {
		eDynamicSet(ActivityPackage.FORK__START, ActivityPackage.Literals.FORK__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkEnd getEnd() {
		return (ForkEnd)eDynamicGet(ActivityPackage.FORK__END, ActivityPackage.Literals.FORK__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(ForkEnd newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, ActivityPackage.FORK__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(ForkEnd newEnd) {
		eDynamicSet(ActivityPackage.FORK__END, ActivityPackage.Literals.FORK__END, newEnd);
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
			case ActivityPackage.FORK__START:
				return basicSetStart(null, msgs);
			case ActivityPackage.FORK__END:
				return basicSetEnd(null, msgs);
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
			case ActivityPackage.FORK__START:
				return getStart();
			case ActivityPackage.FORK__END:
				return getEnd();
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
			case ActivityPackage.FORK__START:
				setStart((ForkEnd)newValue);
				return;
			case ActivityPackage.FORK__END:
				setEnd((ForkEnd)newValue);
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
			case ActivityPackage.FORK__START:
				setStart((ForkEnd)null);
				return;
			case ActivityPackage.FORK__END:
				setEnd((ForkEnd)null);
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
			case ActivityPackage.FORK__START:
				return getStart() != null;
			case ActivityPackage.FORK__END:
				return getEnd() != null;
			case ActivityPackage.FORK__COMMENT:
				return getComment() != null;
		}
		return super.eIsSet(featureID);
	}

} //ForkImpl
