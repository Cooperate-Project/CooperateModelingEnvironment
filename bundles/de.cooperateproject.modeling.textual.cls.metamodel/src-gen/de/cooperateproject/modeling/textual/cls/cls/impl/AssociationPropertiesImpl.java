/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Comment;
import de.cooperateproject.modeling.textual.cls.cls.ReadingDirection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getCardinalityLeft <em>Cardinality Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getCardinalityRight <em>Cardinality Right</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getReadingDirection <em>Reading Direction</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationPropertiesImpl extends CDOObjectImpl implements AssociationProperties {
	/**
	 * The default value of the '{@link #getReadingDirection() <em>Reading Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ReadingDirection READING_DIRECTION_EDEFAULT = ReadingDirection.LEFT;

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
	protected AssociationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.ASSOCIATION_PROPERTIES;
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
	public Cardinality getCardinalityLeft() {
		return (Cardinality)eDynamicGet(ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityLeft(Cardinality newCardinalityLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCardinalityLeft, ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityLeft(Cardinality newCardinalityLeft) {
		eDynamicSet(ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, newCardinalityLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinalityRight() {
		return (Cardinality)eDynamicGet(ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityRight(Cardinality newCardinalityRight, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCardinalityRight, ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityRight(Cardinality newCardinalityRight) {
		eDynamicSet(ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, newCardinalityRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingDirection getReadingDirection() {
		return (ReadingDirection)eDynamicGet(ClsPackage.ASSOCIATION_PROPERTIES__READING_DIRECTION, ClsPackage.Literals.ASSOCIATION_PROPERTIES__READING_DIRECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingDirection(ReadingDirection newReadingDirection) {
		eDynamicSet(ClsPackage.ASSOCIATION_PROPERTIES__READING_DIRECTION, ClsPackage.Literals.ASSOCIATION_PROPERTIES__READING_DIRECTION, newReadingDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ClsPackage.ASSOCIATION_PROPERTIES__NAME, ClsPackage.Literals.ASSOCIATION_PROPERTIES__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ClsPackage.ASSOCIATION_PROPERTIES__NAME, ClsPackage.Literals.ASSOCIATION_PROPERTIES__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getNote() {
		return (Comment)eDynamicGet(ClsPackage.ASSOCIATION_PROPERTIES__NOTE, ClsPackage.Literals.ASSOCIATION_PROPERTIES__NOTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(Comment newNote, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNote, ClsPackage.ASSOCIATION_PROPERTIES__NOTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Comment newNote) {
		eDynamicSet(ClsPackage.ASSOCIATION_PROPERTIES__NOTE, ClsPackage.Literals.ASSOCIATION_PROPERTIES__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT:
				return basicSetCardinalityLeft(null, msgs);
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT:
				return basicSetCardinalityRight(null, msgs);
			case ClsPackage.ASSOCIATION_PROPERTIES__NOTE:
				return basicSetNote(null, msgs);
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
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT:
				return getCardinalityLeft();
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT:
				return getCardinalityRight();
			case ClsPackage.ASSOCIATION_PROPERTIES__READING_DIRECTION:
				return getReadingDirection();
			case ClsPackage.ASSOCIATION_PROPERTIES__NAME:
				return getName();
			case ClsPackage.ASSOCIATION_PROPERTIES__NOTE:
				return getNote();
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
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT:
				setCardinalityLeft((Cardinality)newValue);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT:
				setCardinalityRight((Cardinality)newValue);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__READING_DIRECTION:
				setReadingDirection((ReadingDirection)newValue);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__NAME:
				setName((String)newValue);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__NOTE:
				setNote((Comment)newValue);
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
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT:
				setCardinalityLeft((Cardinality)null);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT:
				setCardinalityRight((Cardinality)null);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__READING_DIRECTION:
				setReadingDirection(READING_DIRECTION_EDEFAULT);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClsPackage.ASSOCIATION_PROPERTIES__NOTE:
				setNote((Comment)null);
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
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT:
				return getCardinalityLeft() != null;
			case ClsPackage.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT:
				return getCardinalityRight() != null;
			case ClsPackage.ASSOCIATION_PROPERTIES__READING_DIRECTION:
				return getReadingDirection() != READING_DIRECTION_EDEFAULT;
			case ClsPackage.ASSOCIATION_PROPERTIES__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ClsPackage.ASSOCIATION_PROPERTIES__NOTE:
				return getNote() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationPropertiesImpl
