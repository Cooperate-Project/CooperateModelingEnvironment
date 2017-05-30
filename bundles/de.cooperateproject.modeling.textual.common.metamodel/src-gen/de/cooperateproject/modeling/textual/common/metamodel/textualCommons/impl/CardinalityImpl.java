/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CardinalityImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CardinalityImpl#getUpperBound <em>Upper Bound</em>}</li>
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
        return TextualCommonsPackage.Literals.CARDINALITY;
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
        return (Integer)eDynamicGet(TextualCommonsPackage.CARDINALITY__LOWER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__LOWER_BOUND, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLowerBound(int newLowerBound) {
        eDynamicSet(TextualCommonsPackage.CARDINALITY__LOWER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__LOWER_BOUND, newLowerBound);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLowerBound() {
        eDynamicUnset(TextualCommonsPackage.CARDINALITY__LOWER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__LOWER_BOUND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLowerBound() {
        return eDynamicIsSet(TextualCommonsPackage.CARDINALITY__LOWER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__LOWER_BOUND);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getUpperBound() {
        return (Integer)eDynamicGet(TextualCommonsPackage.CARDINALITY__UPPER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__UPPER_BOUND, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUpperBound(int newUpperBound) {
        eDynamicSet(TextualCommonsPackage.CARDINALITY__UPPER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__UPPER_BOUND, newUpperBound);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUpperBound() {
        eDynamicUnset(TextualCommonsPackage.CARDINALITY__UPPER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__UPPER_BOUND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUpperBound() {
        return eDynamicIsSet(TextualCommonsPackage.CARDINALITY__UPPER_BOUND, TextualCommonsPackage.Literals.CARDINALITY__UPPER_BOUND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityElement getReferencedElement() {
        EObject container = eContainer();
        if (container instanceof UMLReferencingElement) {
            @SuppressWarnings("unchecked")
            UMLReferencingElement<Element> umlReferencingElement = (UMLReferencingElement<Element>) container;
            org.eclipse.uml2.uml.Element referencedElement = umlReferencingElement.getReferencedElement();
            if (referencedElement instanceof MultiplicityElement) {
                return (MultiplicityElement) referencedElement;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TextualCommonsPackage.CARDINALITY__LOWER_BOUND:
                return getLowerBound();
            case TextualCommonsPackage.CARDINALITY__UPPER_BOUND:
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
            case TextualCommonsPackage.CARDINALITY__LOWER_BOUND:
                setLowerBound((Integer)newValue);
                return;
            case TextualCommonsPackage.CARDINALITY__UPPER_BOUND:
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
            case TextualCommonsPackage.CARDINALITY__LOWER_BOUND:
                unsetLowerBound();
                return;
            case TextualCommonsPackage.CARDINALITY__UPPER_BOUND:
                unsetUpperBound();
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
            case TextualCommonsPackage.CARDINALITY__LOWER_BOUND:
                return isSetLowerBound();
            case TextualCommonsPackage.CARDINALITY__UPPER_BOUND:
                return isSetUpperBound();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case TextualCommonsPackage.CARDINALITY___GET_REFERENCED_ELEMENT:
                return getReferencedElement();
        }
        return super.eInvoke(operationID, arguments);
    }

} //CardinalityImpl
