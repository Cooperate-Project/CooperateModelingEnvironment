/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.Fragment;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Index Point In Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl#getUniqueIdentifierOfReferencedElement <em>Unique Identifier Of Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl#getFragmentIndex <em>Fragment Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentIndexPointInTimeImpl extends PointInTimeImpl implements FragmentIndexPointInTime {
    /**
     * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected Fragment referencedElement;

    /**
     * The default value of the '{@link #getUniqueIdentifierOfReferencedElement() <em>Unique Identifier Of Referenced Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUniqueIdentifierOfReferencedElement()
     * @generated
     * @ordered
     */
    protected static final String UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUniqueIdentifierOfReferencedElement() <em>Unique Identifier Of Referenced Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUniqueIdentifierOfReferencedElement()
     * @generated
     * @ordered
     */
    protected String uniqueIdentifierOfReferencedElement = UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getFragmentIndex() <em>Fragment Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFragmentIndex()
     * @generated
     * @ordered
     */
    protected static final int FRAGMENT_INDEX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFragmentIndex() <em>Fragment Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFragmentIndex()
     * @generated
     * @ordered
     */
    protected int fragmentIndex = FRAGMENT_INDEX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FragmentIndexPointInTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.FRAGMENT_INDEX_POINT_IN_TIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fragment getReferencedElement() {
        if (referencedElement != null && ((EObject)referencedElement).eIsProxy()) {
            InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
            referencedElement = (Fragment)eResolveProxy(oldReferencedElement);
            if (referencedElement != oldReferencedElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
            }
        }
        return referencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fragment basicGetReferencedElement() {
        return referencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(Fragment newReferencedElement) {
        Fragment oldReferencedElement = referencedElement;
        referencedElement = newReferencedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUniqueIdentifierOfReferencedElement() {
        return uniqueIdentifierOfReferencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUniqueIdentifierOfReferencedElement(String newUniqueIdentifierOfReferencedElement) {
        String oldUniqueIdentifierOfReferencedElement = uniqueIdentifierOfReferencedElement;
        uniqueIdentifierOfReferencedElement = newUniqueIdentifierOfReferencedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT, oldUniqueIdentifierOfReferencedElement, uniqueIdentifierOfReferencedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFragmentIndex() {
        return fragmentIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFragmentIndex(int newFragmentIndex) {
        int oldFragmentIndex = fragmentIndex;
        fragmentIndex = newFragmentIndex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX, oldFragmentIndex, fragmentIndex));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTimeInternal() {
        /**
         * self.fragmentIndex
         */
        final /*@NonInvalid*/ int fragmentIndex = this.getFragmentIndex();
        return fragmentIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String calculateUniqueIdentifier() {
        return de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils.getUniqueIdentifierForSequenceElement(this.getReferencedElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                return getUniqueIdentifierOfReferencedElement();
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX:
                return getFragmentIndex();
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
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT:
                setReferencedElement((Fragment)newValue);
                return;
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                setUniqueIdentifierOfReferencedElement((String)newValue);
                return;
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX:
                setFragmentIndex((Integer)newValue);
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
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT:
                setReferencedElement((Fragment)null);
                return;
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                setUniqueIdentifierOfReferencedElement(UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT);
                return;
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX:
                setFragmentIndex(FRAGMENT_INDEX_EDEFAULT);
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
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT:
                return referencedElement != null;
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                return UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT == null ? uniqueIdentifierOfReferencedElement != null : !UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT.equals(uniqueIdentifierOfReferencedElement);
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX:
                return fragmentIndex != FRAGMENT_INDEX_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == SIElementWithTextualReference.class) {
            switch (derivedFeatureID) {
                case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT: return SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT;
                case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT: return SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == SIElementWithTextualReference.class) {
            switch (baseFeatureID) {
                case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT: return SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT;
                case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT: return SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == PointInTime.class) {
            switch (baseOperationID) {
                case SequenceIntermediatePackage.POINT_IN_TIME___GET_TIME_INTERNAL: return SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME___GET_TIME_INTERNAL;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == SIElementWithTextualReference.class) {
            switch (baseOperationID) {
                case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER: return SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME___CALCULATE_UNIQUE_IDENTIFIER;
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME___GET_TIME_INTERNAL:
                return getTimeInternal();
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME___CALCULATE_UNIQUE_IDENTIFIER:
                return calculateUniqueIdentifier();
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (uniqueIdentifierOfReferencedElement: ");
        result.append(uniqueIdentifierOfReferencedElement);
        result.append(", fragmentIndex: ");
        result.append(fragmentIndex);
        result.append(')');
        return result.toString();
    }

} //FragmentIndexPointInTimeImpl
