/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Timed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SITimedElementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SITimedElementImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SITimedElementImpl extends MinimalEObjectImpl.Container implements SITimedElement {
    /**
     * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected PointInTime start;

    /**
     * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinish()
     * @generated
     * @ordered
     */
    protected PointInTime finish;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SITimedElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_TIMED_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PointInTime getStart() {
        if (start != null && start.eIsProxy()) {
            InternalEObject oldStart = (InternalEObject)start;
            start = (PointInTime)eResolveProxy(oldStart);
            if (start != oldStart) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_TIMED_ELEMENT__START, oldStart, start));
            }
        }
        return start;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PointInTime basicGetStart() {
        return start;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStart(PointInTime newStart) {
        PointInTime oldStart = start;
        start = newStart;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_TIMED_ELEMENT__START, oldStart, start));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PointInTime getFinish() {
        if (finish != null && finish.eIsProxy()) {
            InternalEObject oldFinish = (InternalEObject)finish;
            finish = (PointInTime)eResolveProxy(oldFinish);
            if (finish != oldFinish) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH, oldFinish, finish));
            }
        }
        return finish;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PointInTime basicGetFinish() {
        return finish;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFinish(PointInTime newFinish) {
        PointInTime oldFinish = finish;
        finish = newFinish;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH, oldFinish, finish));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__START:
                if (resolve) return getStart();
                return basicGetStart();
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH:
                if (resolve) return getFinish();
                return basicGetFinish();
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
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__START:
                setStart((PointInTime)newValue);
                return;
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH:
                setFinish((PointInTime)newValue);
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
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__START:
                setStart((PointInTime)null);
                return;
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH:
                setFinish((PointInTime)null);
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
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__START:
                return start != null;
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH:
                return finish != null;
        }
        return super.eIsSet(featureID);
    }

} //SITimedElementImpl
