/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getSyncReply <em>Sync Reply</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getCallstack <em>Callstack</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl#getExecutionCause <em>Execution Cause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIExecutionImpl extends SITimedElementImpl implements SIExecution {
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
     * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessages()
     * @generated
     * @ordered
     */
    protected EList<SIMessage> messages;

    /**
     * The cached value of the '{@link #getSyncReply() <em>Sync Reply</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSyncReply()
     * @generated
     * @ordered
     */
    protected SIMessage syncReply;

    /**
     * The cached value of the '{@link #getCallstack() <em>Callstack</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallstack()
     * @generated
     * @ordered
     */
    protected EList<SIExecution> callstack;

    /**
     * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifeline()
     * @generated
     * @ordered
     */
    protected SILifeline lifeline;

    /**
     * The cached value of the '{@link #getExecutionCause() <em>Execution Cause</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionCause()
     * @generated
     * @ordered
     */
    protected SIMessage executionCause;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SIExecutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_EXECUTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SIExecution> getExecutions() {
        if (executions == null) {
            executions = new EObjectContainmentWithInverseEList<SIExecution>(SIExecution.class, this, SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS, SequenceIntermediatePackage.SI_EXECUTION__CONTAINER);
        }
        return executions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SIMessage> getMessages() {
        if (messages == null) {
            messages = new EObjectContainmentWithInverseEList<SIMessage>(SIMessage.class, this, SequenceIntermediatePackage.SI_EXECUTION__MESSAGES, SequenceIntermediatePackage.SI_MESSAGE__ORIGIN);
        }
        return messages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIMessage getSyncReply() {
        if (syncReply != null && syncReply.eIsProxy()) {
            InternalEObject oldSyncReply = (InternalEObject)syncReply;
            syncReply = (SIMessage)eResolveProxy(oldSyncReply);
            if (syncReply != oldSyncReply) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_EXECUTION__SYNC_REPLY, oldSyncReply, syncReply));
            }
        }
        return syncReply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIMessage basicGetSyncReply() {
        return syncReply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSyncReply(SIMessage newSyncReply) {
        SIMessage oldSyncReply = syncReply;
        syncReply = newSyncReply;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_EXECUTION__SYNC_REPLY, oldSyncReply, syncReply));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SIExecution> getCallstack() {
        if (callstack == null) {
            callstack = new EObjectResolvingEList<SIExecution>(SIExecution.class, this, SequenceIntermediatePackage.SI_EXECUTION__CALLSTACK);
        }
        return callstack;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIExecutionContainer getContainer() {
        if (eContainerFeatureID() != SequenceIntermediatePackage.SI_EXECUTION__CONTAINER) return null;
        return (SIExecutionContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(SIExecutionContainer newContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainer, SequenceIntermediatePackage.SI_EXECUTION__CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(SIExecutionContainer newContainer) {
        if (newContainer != eInternalContainer() || (eContainerFeatureID() != SequenceIntermediatePackage.SI_EXECUTION__CONTAINER && newContainer != null)) {
            if (EcoreUtil.isAncestor(this, newContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainer != null)
                msgs = ((InternalEObject)newContainer).eInverseAdd(this, SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS, SIExecutionContainer.class, msgs);
            msgs = basicSetContainer(newContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_EXECUTION__CONTAINER, newContainer, newContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SILifeline getLifeline() {
        if (lifeline != null && lifeline.eIsProxy()) {
            InternalEObject oldLifeline = (InternalEObject)lifeline;
            lifeline = (SILifeline)eResolveProxy(oldLifeline);
            if (lifeline != oldLifeline) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_EXECUTION__LIFELINE, oldLifeline, lifeline));
            }
        }
        return lifeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SILifeline basicGetLifeline() {
        return lifeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifeline(SILifeline newLifeline) {
        SILifeline oldLifeline = lifeline;
        lifeline = newLifeline;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_EXECUTION__LIFELINE, oldLifeline, lifeline));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIMessage getExecutionCause() {
        if (executionCause != null && executionCause.eIsProxy()) {
            InternalEObject oldExecutionCause = (InternalEObject)executionCause;
            executionCause = (SIMessage)eResolveProxy(oldExecutionCause);
            if (executionCause != oldExecutionCause) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE, oldExecutionCause, executionCause));
            }
        }
        return executionCause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIMessage basicGetExecutionCause() {
        return executionCause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExecutionCause(SIMessage newExecutionCause, NotificationChain msgs) {
        SIMessage oldExecutionCause = executionCause;
        executionCause = newExecutionCause;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE, oldExecutionCause, newExecutionCause);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionCause(SIMessage newExecutionCause) {
        if (newExecutionCause != executionCause) {
            NotificationChain msgs = null;
            if (executionCause != null)
                msgs = ((InternalEObject)executionCause).eInverseRemove(this, SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION, SIMessage.class, msgs);
            if (newExecutionCause != null)
                msgs = ((InternalEObject)newExecutionCause).eInverseAdd(this, SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION, SIMessage.class, msgs);
            msgs = basicSetExecutionCause(newExecutionCause, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE, newExecutionCause, newExecutionCause));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean containerMustReferenceTheSameLifelineAsContainedExecutions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        /**
         *
         * inv containerMustReferenceTheSameLifelineAsContainedExecutions:
         *   let
         *     severity : Integer[1] = 'SIExecution::containerMustReferenceTheSameLifelineAsContainedExecutions'.getSeverity()
         *   in
         *     if severity <= 0
         *     then true
         *     else
         *       let
         *         result : Types::Boolean[?] = self.executions->forAll(ex | ex.lifeline = self.lifeline)
         *       in
         *         'SIExecution::containerMustReferenceTheSameLifelineAsContainedExecutions'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
         *     endif
         */
        final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
        final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SequenceIntermediateTables.STR_SIExecution_c_c_containerMustReferenceTheSameLifelineAsContainedExe);
        final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SequenceIntermediateTables.INT_0).booleanValue();
        /*@NonInvalid*/ boolean symbol_0;
        if (le) {
            symbol_0 = ValueUtil.TRUE_VALUE;
        }
        else {
            final /*@NonInvalid*/ List<SIExecution> executions = this.getExecutions();
            final /*@NonInvalid*/ OrderedSetValue BOXED_executions = idResolver.createOrderedSetOfAll(SequenceIntermediateTables.ORD_CLSSid_SIExecution, executions);
            /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
            /*@NonNull*/ Iterator<Object> ITERATOR_ex = BOXED_executions.iterator();
            /*@NonInvalid*/ Boolean result;
            while (true) {
                if (!ITERATOR_ex.hasNext()) {
                    if (accumulator == ValueUtil.TRUE_VALUE) {
                        result = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        throw (InvalidValueException)accumulator;
                    }
                    break;
                }
                /*@NonInvalid*/ SIExecution ex = (SIExecution)ITERATOR_ex.next();
                /**
                 * ex.lifeline = self.lifeline
                 */
                final /*@NonInvalid*/ SILifeline lifeline = ex.getLifeline();
                final /*@NonInvalid*/ SILifeline lifeline_0 = this.getLifeline();
                final /*@NonInvalid*/ boolean eq = lifeline.equals(lifeline_0);
                //
                if (eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
                    result = ValueUtil.FALSE_VALUE;
                    break;														// Stop immediately
                }
                else if (eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
                    ;															// Carry on
                }
                else {															// Impossible badly typed result
                    accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
                }
            }
            final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SequenceIntermediateTables.STR_SIExecution_c_c_containerMustReferenceTheSameLifelineAsContainedExe, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SequenceIntermediateTables.INT_0).booleanValue();
            symbol_0 = logDiagnostic;
        }
        return Boolean.TRUE == symbol_0;
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
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutions()).basicAdd(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_EXECUTION__MESSAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessages()).basicAdd(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainer((SIExecutionContainer)otherEnd, msgs);
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE:
                if (executionCause != null)
                    msgs = ((InternalEObject)executionCause).eInverseRemove(this, SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION, SIMessage.class, msgs);
                return basicSetExecutionCause((SIMessage)otherEnd, msgs);
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
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS:
                return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_EXECUTION__MESSAGES:
                return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                return basicSetContainer(null, msgs);
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE:
                return basicSetExecutionCause(null, msgs);
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
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                return eInternalContainer().eInverseRemove(this, SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS, SIExecutionContainer.class, msgs);
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
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS:
                return getExecutions();
            case SequenceIntermediatePackage.SI_EXECUTION__MESSAGES:
                return getMessages();
            case SequenceIntermediatePackage.SI_EXECUTION__SYNC_REPLY:
                if (resolve) return getSyncReply();
                return basicGetSyncReply();
            case SequenceIntermediatePackage.SI_EXECUTION__CALLSTACK:
                return getCallstack();
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                return getContainer();
            case SequenceIntermediatePackage.SI_EXECUTION__LIFELINE:
                if (resolve) return getLifeline();
                return basicGetLifeline();
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE:
                if (resolve) return getExecutionCause();
                return basicGetExecutionCause();
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
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS:
                getExecutions().clear();
                getExecutions().addAll((Collection<? extends SIExecution>)newValue);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__MESSAGES:
                getMessages().clear();
                getMessages().addAll((Collection<? extends SIMessage>)newValue);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__SYNC_REPLY:
                setSyncReply((SIMessage)newValue);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__CALLSTACK:
                getCallstack().clear();
                getCallstack().addAll((Collection<? extends SIExecution>)newValue);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                setContainer((SIExecutionContainer)newValue);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__LIFELINE:
                setLifeline((SILifeline)newValue);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE:
                setExecutionCause((SIMessage)newValue);
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
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS:
                getExecutions().clear();
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__MESSAGES:
                getMessages().clear();
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__SYNC_REPLY:
                setSyncReply((SIMessage)null);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__CALLSTACK:
                getCallstack().clear();
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                setContainer((SIExecutionContainer)null);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__LIFELINE:
                setLifeline((SILifeline)null);
                return;
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE:
                setExecutionCause((SIMessage)null);
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
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS:
                return executions != null && !executions.isEmpty();
            case SequenceIntermediatePackage.SI_EXECUTION__MESSAGES:
                return messages != null && !messages.isEmpty();
            case SequenceIntermediatePackage.SI_EXECUTION__SYNC_REPLY:
                return syncReply != null;
            case SequenceIntermediatePackage.SI_EXECUTION__CALLSTACK:
                return callstack != null && !callstack.isEmpty();
            case SequenceIntermediatePackage.SI_EXECUTION__CONTAINER:
                return getContainer() != null;
            case SequenceIntermediatePackage.SI_EXECUTION__LIFELINE:
                return lifeline != null;
            case SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE:
                return executionCause != null;
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
        if (baseClass == SIExecutionContainer.class) {
            switch (derivedFeatureID) {
                case SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS: return SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS;
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
        if (baseClass == SIExecutionContainer.class) {
            switch (baseFeatureID) {
                case SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS: return SequenceIntermediatePackage.SI_EXECUTION__EXECUTIONS;
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
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SequenceIntermediatePackage.SI_EXECUTION___CONTAINER_MUST_REFERENCE_THE_SAME_LIFELINE_AS_CONTAINED_EXECUTIONS__DIAGNOSTICCHAIN_MAP_1:
                return containerMustReferenceTheSameLifelineAsContainedExecutions((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

} //SIExecutionImpl
