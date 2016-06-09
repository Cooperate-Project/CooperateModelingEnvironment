/**
 */
package de.cooperateproject.modeling.textual.activity.activity.impl;

import de.cooperateproject.modeling.textual.activity.activity.ActivityPackage;
import de.cooperateproject.modeling.textual.activity.activity.ConditionEnd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.impl.ConditionEndImpl#getLongName <em>Long Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionEndImpl extends DefRefImpl implements ConditionEnd {
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
	protected ConditionEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.CONDITION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ActivityPackage.CONDITION_END__NAME, ActivityPackage.Literals.CONDITION_END__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ActivityPackage.CONDITION_END__NAME, ActivityPackage.Literals.CONDITION_END__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return (String)eDynamicGet(ActivityPackage.CONDITION_END__LONG_NAME, ActivityPackage.Literals.CONDITION_END__LONG_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		eDynamicSet(ActivityPackage.CONDITION_END__LONG_NAME, ActivityPackage.Literals.CONDITION_END__LONG_NAME, newLongName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.CONDITION_END__NAME:
				return getName();
			case ActivityPackage.CONDITION_END__LONG_NAME:
				return getLongName();
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
			case ActivityPackage.CONDITION_END__NAME:
				setName((String)newValue);
				return;
			case ActivityPackage.CONDITION_END__LONG_NAME:
				setLongName((String)newValue);
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
			case ActivityPackage.CONDITION_END__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityPackage.CONDITION_END__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
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
			case ActivityPackage.CONDITION_END__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ActivityPackage.CONDITION_END__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? getLongName() != null : !LONG_NAME_EDEFAULT.equals(getLongName());
		}
		return super.eIsSet(featureID);
	}

} //ConditionEndImpl
