/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Cardinality;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.CardinalityImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.CardinalityImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityImpl extends CDOObjectImpl implements Cardinality {
	/**
     * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLowerBound()
     * @generated
     * @ordered
     */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CardinalityImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsecasePackage.Literals.CARDINALITY;
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
	public int getLowerBound() {
        return (Integer)eDynamicGet(UsecasePackage.CARDINALITY__LOWER_BOUND, UsecasePackage.Literals.CARDINALITY__LOWER_BOUND, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLowerBound(int newLowerBound) {
        eDynamicSet(UsecasePackage.CARDINALITY__LOWER_BOUND, UsecasePackage.Literals.CARDINALITY__LOWER_BOUND, newLowerBound);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getUpperBound() {
        return (Integer)eDynamicGet(UsecasePackage.CARDINALITY__UPPER_BOUND, UsecasePackage.Literals.CARDINALITY__UPPER_BOUND, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUpperBound(int newUpperBound) {
        eDynamicSet(UsecasePackage.CARDINALITY__UPPER_BOUND, UsecasePackage.Literals.CARDINALITY__UPPER_BOUND, newUpperBound);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.CARDINALITY__LOWER_BOUND:
                return getLowerBound();
            case UsecasePackage.CARDINALITY__UPPER_BOUND:
                return getUpperBound();
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
            case UsecasePackage.CARDINALITY__LOWER_BOUND:
                setLowerBound((Integer)newValue);
                return;
            case UsecasePackage.CARDINALITY__UPPER_BOUND:
                setUpperBound((Integer)newValue);
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
            case UsecasePackage.CARDINALITY__LOWER_BOUND:
                setLowerBound(LOWER_BOUND_EDEFAULT);
                return;
            case UsecasePackage.CARDINALITY__UPPER_BOUND:
                setUpperBound(UPPER_BOUND_EDEFAULT);
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
            case UsecasePackage.CARDINALITY__LOWER_BOUND:
                return getLowerBound() != LOWER_BOUND_EDEFAULT;
            case UsecasePackage.CARDINALITY__UPPER_BOUND:
                return getUpperBound() != UPPER_BOUND_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //CardinalityImpl
