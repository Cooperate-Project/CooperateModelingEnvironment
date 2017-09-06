/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIRegionImpl extends SIElementWithTextualReferenceImpl<OrderedFragmentContainer> implements SIRegion {
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
     * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutions()
     * @generated
     * @ordered
     */
    protected EList<SIExecution> executions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SIRegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_REGION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(OrderedFragmentContainer newReferencedElement) {
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_REGION__START, oldStart, start));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_REGION__START, oldStart, start));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_REGION__FINISH, oldFinish, finish));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_REGION__FINISH, oldFinish, finish));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SIExecution> getExecutions() {
        if (executions == null) {
            executions = new EObjectContainmentWithInverseEList<SIExecution>(SIExecution.class, this, SequenceIntermediatePackage.SI_REGION__EXECUTIONS, SequenceIntermediatePackage.SI_EXECUTION__CONTAINER);
        }
        return executions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIDiagram getDiagram() {
        if (eContainerFeatureID() != SequenceIntermediatePackage.SI_REGION__DIAGRAM) return null;
        return (SIDiagram)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram(SIDiagram newDiagram, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDiagram, SequenceIntermediatePackage.SI_REGION__DIAGRAM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(SIDiagram newDiagram) {
        if (newDiagram != eInternalContainer() || (eContainerFeatureID() != SequenceIntermediatePackage.SI_REGION__DIAGRAM && newDiagram != null)) {
            if (EcoreUtil.isAncestor(this, newDiagram))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDiagram != null)
                msgs = ((InternalEObject)newDiagram).eInverseAdd(this, SequenceIntermediatePackage.SI_DIAGRAM__REGIONS, SIDiagram.class, msgs);
            msgs = basicSetDiagram(newDiagram, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_REGION__DIAGRAM, newDiagram, newDiagram));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_REGION__EXECUTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutions()).basicAdd(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
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
            case SequenceIntermediatePackage.SI_REGION__EXECUTIONS:
                return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
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
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
                return eInternalContainer().eInverseRemove(this, SequenceIntermediatePackage.SI_DIAGRAM__REGIONS, SIDiagram.class, msgs);
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
            case SequenceIntermediatePackage.SI_REGION__START:
                if (resolve) return getStart();
                return basicGetStart();
            case SequenceIntermediatePackage.SI_REGION__FINISH:
                if (resolve) return getFinish();
                return basicGetFinish();
            case SequenceIntermediatePackage.SI_REGION__EXECUTIONS:
                return getExecutions();
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
                return getDiagram();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_REGION__START:
                setStart((PointInTime)newValue);
                return;
            case SequenceIntermediatePackage.SI_REGION__FINISH:
                setFinish((PointInTime)newValue);
                return;
            case SequenceIntermediatePackage.SI_REGION__EXECUTIONS:
                getExecutions().clear();
                getExecutions().addAll((Collection<? extends SIExecution>)newValue);
                return;
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
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
            case SequenceIntermediatePackage.SI_REGION__START:
                setStart((PointInTime)null);
                return;
            case SequenceIntermediatePackage.SI_REGION__FINISH:
                setFinish((PointInTime)null);
                return;
            case SequenceIntermediatePackage.SI_REGION__EXECUTIONS:
                getExecutions().clear();
                return;
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
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
            case SequenceIntermediatePackage.SI_REGION__START:
                return start != null;
            case SequenceIntermediatePackage.SI_REGION__FINISH:
                return finish != null;
            case SequenceIntermediatePackage.SI_REGION__EXECUTIONS:
                return executions != null && !executions.isEmpty();
            case SequenceIntermediatePackage.SI_REGION__DIAGRAM:
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
                case SequenceIntermediatePackage.SI_REGION__START: return SequenceIntermediatePackage.SI_TIMED_ELEMENT__START;
                case SequenceIntermediatePackage.SI_REGION__FINISH: return SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH;
                default: return -1;
            }
        }
        if (baseClass == SIExecutionContainer.class) {
            switch (derivedFeatureID) {
                case SequenceIntermediatePackage.SI_REGION__EXECUTIONS: return SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS;
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
                case SequenceIntermediatePackage.SI_TIMED_ELEMENT__START: return SequenceIntermediatePackage.SI_REGION__START;
                case SequenceIntermediatePackage.SI_TIMED_ELEMENT__FINISH: return SequenceIntermediatePackage.SI_REGION__FINISH;
                default: return -1;
            }
        }
        if (baseClass == SIExecutionContainer.class) {
            switch (baseFeatureID) {
                case SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS: return SequenceIntermediatePackage.SI_REGION__EXECUTIONS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //SIRegionImpl
