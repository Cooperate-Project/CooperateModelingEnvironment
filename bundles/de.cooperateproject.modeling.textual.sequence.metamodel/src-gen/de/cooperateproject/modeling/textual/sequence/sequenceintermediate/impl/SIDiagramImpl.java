/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIDiagramImpl extends SIElementWithTextualReferenceImpl<SequenceDiagram> implements SIDiagram {
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
     * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifelines()
     * @generated
     * @ordered
     */
    protected EList<SILifeline> lifelines;

    /**
     * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegions()
     * @generated
     * @ordered
     */
    protected EList<SIRegion> regions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SIDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(SequenceDiagram newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SIExecution> getExecutions() {
        if (executions == null) {
            executions = new EObjectContainmentWithInverseEList<SIExecution>(SIExecution.class, this, SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS, SequenceIntermediatePackage.SI_EXECUTION__CONTAINER);
        }
        return executions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SILifeline> getLifelines() {
        if (lifelines == null) {
            lifelines = new EObjectContainmentWithInverseEList<SILifeline>(SILifeline.class, this, SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES, SequenceIntermediatePackage.SI_LIFELINE__DIAGRAM);
        }
        return lifelines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SIRegion> getRegions() {
        if (regions == null) {
            regions = new EObjectContainmentWithInverseEList<SIRegion>(SIRegion.class, this, SequenceIntermediatePackage.SI_DIAGRAM__REGIONS, SequenceIntermediatePackage.SI_REGION__DIAGRAM);
        }
        return regions;
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
            case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutions()).basicAdd(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLifelines()).basicAdd(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_DIAGRAM__REGIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegions()).basicAdd(otherEnd, msgs);
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
            case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS:
                return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES:
                return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
            case SequenceIntermediatePackage.SI_DIAGRAM__REGIONS:
                return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS:
                return getExecutions();
            case SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES:
                return getLifelines();
            case SequenceIntermediatePackage.SI_DIAGRAM__REGIONS:
                return getRegions();
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
            case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS:
                getExecutions().clear();
                getExecutions().addAll((Collection<? extends SIExecution>)newValue);
                return;
            case SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES:
                getLifelines().clear();
                getLifelines().addAll((Collection<? extends SILifeline>)newValue);
                return;
            case SequenceIntermediatePackage.SI_DIAGRAM__REGIONS:
                getRegions().clear();
                getRegions().addAll((Collection<? extends SIRegion>)newValue);
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
            case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS:
                getExecutions().clear();
                return;
            case SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES:
                getLifelines().clear();
                return;
            case SequenceIntermediatePackage.SI_DIAGRAM__REGIONS:
                getRegions().clear();
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
            case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS:
                return executions != null && !executions.isEmpty();
            case SequenceIntermediatePackage.SI_DIAGRAM__LIFELINES:
                return lifelines != null && !lifelines.isEmpty();
            case SequenceIntermediatePackage.SI_DIAGRAM__REGIONS:
                return regions != null && !regions.isEmpty();
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
                case SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS: return SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS;
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
                case SequenceIntermediatePackage.SI_EXECUTION_CONTAINER__EXECUTIONS: return SequenceIntermediatePackage.SI_DIAGRAM__EXECUTIONS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //SIDiagramImpl
