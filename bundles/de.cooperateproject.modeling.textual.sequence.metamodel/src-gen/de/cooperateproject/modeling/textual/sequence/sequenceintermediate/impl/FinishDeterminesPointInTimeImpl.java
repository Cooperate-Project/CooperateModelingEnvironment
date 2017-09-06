/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finish Determines Point In Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FinishDeterminesPointInTimeImpl#getTimedElement <em>Timed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinishDeterminesPointInTimeImpl extends PointInTimeImpl implements FinishDeterminesPointInTime {
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
    protected FinishDeterminesPointInTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.FINISH_DETERMINES_POINT_IN_TIME;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT, oldTimedElement, timedElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT, oldTimedElement, timedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTimeInternal() {
        /**
         * self.timedElement.finish.time
         */
        final /*@NonInvalid*/ SITimedElement timedElement = this.getTimedElement();
        final /*@NonInvalid*/ PointInTime finish = timedElement.getFinish();
        final /*@NonInvalid*/ int time = finish.getTime();
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
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT:
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
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT:
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
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT:
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
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT:
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
                case SequenceIntermediatePackage.POINT_IN_TIME___GET_TIME_INTERNAL: return SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME___GET_TIME_INTERNAL;
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
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME___GET_TIME_INTERNAL:
                return getTimeInternal();
        }
        return super.eInvoke(operationID, arguments);
    }

} //FinishDeterminesPointInTimeImpl
