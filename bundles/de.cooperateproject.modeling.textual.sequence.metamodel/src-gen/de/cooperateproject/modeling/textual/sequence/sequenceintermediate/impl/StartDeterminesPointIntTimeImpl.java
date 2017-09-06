/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Determines Point Int Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.StartDeterminesPointIntTimeImpl#getTimedElement <em>Timed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartDeterminesPointIntTimeImpl extends PointInTimeImpl implements StartDeterminesPointIntTime {
    /**
     * The cached value of the '{@link #getTimedElement() <em>Timed Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimedElement()
     * @generated
     * @ordered
     */
    protected SITimedElement timedElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StartDeterminesPointIntTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.START_DETERMINES_POINT_INT_TIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SITimedElement getTimedElement() {
        if (timedElement != null && timedElement.eIsProxy()) {
            InternalEObject oldTimedElement = (InternalEObject)timedElement;
            timedElement = (SITimedElement)eResolveProxy(oldTimedElement);
            if (timedElement != oldTimedElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT, oldTimedElement, timedElement));
            }
        }
        return timedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SITimedElement basicGetTimedElement() {
        return timedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimedElement(SITimedElement newTimedElement) {
        SITimedElement oldTimedElement = timedElement;
        timedElement = newTimedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT, oldTimedElement, timedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTimeInternal() {
        /**
         * self.timedElement.start.time
         */
        final /*@NonInvalid*/ SITimedElement timedElement = this.getTimedElement();
        final /*@NonInvalid*/ PointInTime start = timedElement.getStart();
        final /*@NonInvalid*/ int time = start.getTime();
        return time;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT:
                if (resolve) return getTimedElement();
                return basicGetTimedElement();
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
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT:
                setTimedElement((SITimedElement)newValue);
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
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT:
                setTimedElement((SITimedElement)null);
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
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT:
                return timedElement != null;
        }
        return super.eIsSet(featureID);
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
                case SequenceIntermediatePackage.POINT_IN_TIME___GET_TIME_INTERNAL: return SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME___GET_TIME_INTERNAL;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME___GET_TIME_INTERNAL:
                return getTimeInternal();
        }
        return super.eInvoke(operationID, arguments);
    }

} //StartDeterminesPointIntTimeImpl
