/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.Message;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl#getCausesExecution <em>Causes Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIMessageImpl extends SITimedElementImpl implements SIMessage {
    /**
     * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected Message referencedElement;

    /**
     * The cached value of the '{@link #getCausesExecution() <em>Causes Execution</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCausesExecution()
     * @generated
     * @ordered
     */
    protected SIExecution causesExecution;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SIMessageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_MESSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message getReferencedElement() {
        if (referencedElement != null && ((EObject)referencedElement).eIsProxy()) {
            InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
            referencedElement = (Message)eResolveProxy(oldReferencedElement);
            if (referencedElement != oldReferencedElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
            }
        }
        return referencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message basicGetReferencedElement() {
        return referencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(Message newReferencedElement) {
        Message oldReferencedElement = referencedElement;
        referencedElement = newReferencedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIExecution getOrigin() {
        if (eContainerFeatureID() != SequenceIntermediatePackage.SI_MESSAGE__ORIGIN) return null;
        return (SIExecution)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOrigin(SIExecution newOrigin, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOrigin, SequenceIntermediatePackage.SI_MESSAGE__ORIGIN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrigin(SIExecution newOrigin) {
        if (newOrigin != eInternalContainer() || (eContainerFeatureID() != SequenceIntermediatePackage.SI_MESSAGE__ORIGIN && newOrigin != null)) {
            if (EcoreUtil.isAncestor(this, newOrigin))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOrigin != null)
                msgs = ((InternalEObject)newOrigin).eInverseAdd(this, SequenceIntermediatePackage.SI_EXECUTION__MESSAGES, SIExecution.class, msgs);
            msgs = basicSetOrigin(newOrigin, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_MESSAGE__ORIGIN, newOrigin, newOrigin));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIExecution getCausesExecution() {
        if (causesExecution != null && causesExecution.eIsProxy()) {
            InternalEObject oldCausesExecution = (InternalEObject)causesExecution;
            causesExecution = (SIExecution)eResolveProxy(oldCausesExecution);
            if (causesExecution != oldCausesExecution) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION, oldCausesExecution, causesExecution));
            }
        }
        return causesExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIExecution basicGetCausesExecution() {
        return causesExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCausesExecution(SIExecution newCausesExecution, NotificationChain msgs) {
        SIExecution oldCausesExecution = causesExecution;
        causesExecution = newCausesExecution;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION, oldCausesExecution, newCausesExecution);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCausesExecution(SIExecution newCausesExecution) {
        if (newCausesExecution != causesExecution) {
            NotificationChain msgs = null;
            if (causesExecution != null)
                msgs = ((InternalEObject)causesExecution).eInverseRemove(this, SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE, SIExecution.class, msgs);
            if (newCausesExecution != null)
                msgs = ((InternalEObject)newCausesExecution).eInverseAdd(this, SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE, SIExecution.class, msgs);
            msgs = basicSetCausesExecution(newCausesExecution, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION, newCausesExecution, newCausesExecution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOrigin((SIExecution)otherEnd, msgs);
            case SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION:
                if (causesExecution != null)
                    msgs = ((InternalEObject)causesExecution).eInverseRemove(this, SequenceIntermediatePackage.SI_EXECUTION__EXECUTION_CAUSE, SIExecution.class, msgs);
                return basicSetCausesExecution((SIExecution)otherEnd, msgs);
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
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                return basicSetOrigin(null, msgs);
            case SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION:
                return basicSetCausesExecution(null, msgs);
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
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                return eInternalContainer().eInverseRemove(this, SequenceIntermediatePackage.SI_EXECUTION__MESSAGES, SIExecution.class, msgs);
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
            case SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                return getOrigin();
            case SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION:
                if (resolve) return getCausesExecution();
                return basicGetCausesExecution();
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
            case SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT:
                setReferencedElement((Message)newValue);
                return;
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                setOrigin((SIExecution)newValue);
                return;
            case SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION:
                setCausesExecution((SIExecution)newValue);
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
            case SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT:
                setReferencedElement((Message)null);
                return;
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                setOrigin((SIExecution)null);
                return;
            case SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION:
                setCausesExecution((SIExecution)null);
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
            case SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT:
                return referencedElement != null;
            case SequenceIntermediatePackage.SI_MESSAGE__ORIGIN:
                return getOrigin() != null;
            case SequenceIntermediatePackage.SI_MESSAGE__CAUSES_EXECUTION:
                return causesExecution != null;
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
                case SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT: return SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT;
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
                case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT: return SequenceIntermediatePackage.SI_MESSAGE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //SIMessageImpl
