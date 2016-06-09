/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.Comment;
import de.cooperateproject.modeling.textual.activity.activity.Condition;
import de.cooperateproject.modeling.textual.activity.activity.ConditionEnd;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends ActivityElementImpl implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEnd getStart() {
		return (ConditionEnd)eDynamicGet(ActivityPackage.CONDITION__START, ActivityPackage.Literals.CONDITION__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(ConditionEnd newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, ActivityPackage.CONDITION__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ConditionEnd newStart) {
		eDynamicSet(ActivityPackage.CONDITION__START, ActivityPackage.Literals.CONDITION__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEnd getEnd() {
		return (ConditionEnd)eDynamicGet(ActivityPackage.CONDITION__END, ActivityPackage.Literals.CONDITION__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(ConditionEnd newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, ActivityPackage.CONDITION__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(ConditionEnd newEnd) {
		eDynamicSet(ActivityPackage.CONDITION__END, ActivityPackage.Literals.CONDITION__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		return (Comment)eDynamicGet(ActivityPackage.CONDITION__COMMENT, ActivityPackage.Literals.CONDITION__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComment, ActivityPackage.CONDITION__COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment) {
		eDynamicSet(ActivityPackage.CONDITION__COMMENT, ActivityPackage.Literals.CONDITION__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.CONDITION__START:
				return basicSetStart(null, msgs);
			case ActivityPackage.CONDITION__END:
				return basicSetEnd(null, msgs);
			case ActivityPackage.CONDITION__COMMENT:
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
			case ActivityPackage.CONDITION__START:
				return getStart();
			case ActivityPackage.CONDITION__END:
				return getEnd();
			case ActivityPackage.CONDITION__COMMENT:
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
			case ActivityPackage.CONDITION__START:
				setStart((ConditionEnd)newValue);
				return;
			case ActivityPackage.CONDITION__END:
				setEnd((ConditionEnd)newValue);
				return;
			case ActivityPackage.CONDITION__COMMENT:
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
			case ActivityPackage.CONDITION__START:
				setStart((ConditionEnd)null);
				return;
			case ActivityPackage.CONDITION__END:
				setEnd((ConditionEnd)null);
				return;
			case ActivityPackage.CONDITION__COMMENT:
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
			case ActivityPackage.CONDITION__START:
				return getStart() != null;
			case ActivityPackage.CONDITION__END:
				return getEnd() != null;
			case ActivityPackage.CONDITION__COMMENT:
				return getComment() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
