/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.Actor;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SILifelineImpl extends SIElementWithTextualReferenceImpl<Actor> implements SILifeline {
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
    protected SILifelineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_LIFELINE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Actor newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_LIFELINE__START, oldStart, start));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_LIFELINE__START, oldStart, start));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_LIFELINE__FINISH, oldFinish, finish));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_LIFELINE__FINISH, oldFinish, finish));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIDiagram getDiagram() {
        if (eContainerFeatureID() != SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM) return null;
        return (SIDiagram)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram(SIDiagram newDiagram, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDiagram, SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(SIDiagram newDiagram) {
        if (newDiagram != eInternalContainer() || (eContainerFeatureID() != SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM && newDiagram != null)) {
            if (EcoreUtil.isAncestor(this, newDiagram))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDiagram != null)
                msgs = ((InternalEObject)newDiagram).eInverseAdd(this, SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES, SIDiagram.class, msgs);
            msgs = basicSetDiagram(newDiagram, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM, newDiagram, newDiagram));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDiagram((SIDiagram)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                return basicSetDiagram(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                return eInternalContainer().eInverseRemove(this, SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES, SIDiagram.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_LIFELINE__START:
                if (resolve) return getStart();
                return basicGetStart();
            case SequenceIntermediatePackage.SI_LIFELINE__FINISH:
                if (resolve) return getFinish();
                return basicGetFinish();
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                return getDiagram();
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
            case SequenceIntermediatePackage.SI_LIFELINE__START:
                setStart((PointInTime)newValue);
                return;
            case SequenceIntermediatePackage.SI_LIFELINE__FINISH:
                setFinish((PointInTime)newValue);
                return;
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                setDiagram((SIDiagram)newValue);
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
            case SequenceIntermediatePackage.SI_LIFELINE__START:
                setStart((PointInTime)null);
                return;
            case SequenceIntermediatePackage.SI_LIFELINE__FINISH:
                setFinish((PointInTime)null);
                return;
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                setDiagram((SIDiagram)null);
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
            case SequenceIntermediatePackage.SI_LIFELINE__START:
                return start != null;
            case SequenceIntermediatePackage.SI_LIFELINE__FINISH:
                return finish != null;
            case SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM:
                return getDiagram() != null;
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
        if (baseClass == SITimedElement.class) {
            switch (derivedFeatureID) {
                case SequenceIntermediatePackage.SI_LIFELINE__START: return SequenceIntermediatePackage.SI_TIMED_ELEMENT__START;
                case SequenceIntermediatePackage.SI_LIFELINE__FINISH: return SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH;
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
        if (baseClass == SITimedElement.class) {
            switch (baseFeatureID) {
                case SequenceIntermediatePackage.SI_TIMED_ELEMENT__START: return SequenceIntermediatePackage.SI_LIFELINE__START;
                case SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH: return SequenceIntermediatePackage.SI_LIFELINE__FINISH;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //SILifelineImpl
