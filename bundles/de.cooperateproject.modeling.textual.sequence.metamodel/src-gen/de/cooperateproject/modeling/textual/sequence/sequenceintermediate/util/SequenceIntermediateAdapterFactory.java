/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.util;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage
 * @generated
 */
public class SequenceIntermediateAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SequenceIntermediatePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceIntermediateAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SequenceIntermediatePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SequenceIntermediateSwitch<Adapter> modelSwitch =
        new SequenceIntermediateSwitch<Adapter>() {
            @Override
            public Adapter caseSIDiagram(SIDiagram object) {
                return createSIDiagramAdapter();
            }
            @Override
            public Adapter caseSILifeline(SILifeline object) {
                return createSILifelineAdapter();
            }
            @Override
            public Adapter caseSIExecution(SIExecution object) {
                return createSIExecutionAdapter();
            }
            @Override
            public Adapter caseSIRegion(SIRegion object) {
                return createSIRegionAdapter();
            }
            @Override
            public Adapter caseSIMessage(SIMessage object) {
                return createSIMessageAdapter();
            }
            @Override
            public <ElementType> Adapter caseSIElementWithTextualReference(SIElementWithTextualReference<ElementType> object) {
                return createSIElementWithTextualReferenceAdapter();
            }
            @Override
            public Adapter caseSITimedElement(SITimedElement object) {
                return createSITimedElementAdapter();
            }
            @Override
            public Adapter caseStartDeterminesPointIntTime(StartDeterminesPointIntTime object) {
                return createStartDeterminesPointIntTimeAdapter();
            }
            @Override
            public Adapter caseFinishDeterminesPointInTime(FinishDeterminesPointInTime object) {
                return createFinishDeterminesPointInTimeAdapter();
            }
            @Override
            public Adapter caseMinimumPointInTime(MinimumPointInTime object) {
                return createMinimumPointInTimeAdapter();
            }
            @Override
            public Adapter caseMaximumPointInTime(MaximumPointInTime object) {
                return createMaximumPointInTimeAdapter();
            }
            @Override
            public Adapter casePointInTime(PointInTime object) {
                return createPointInTimeAdapter();
            }
            @Override
            public Adapter caseFragmentIndexPointInTime(FragmentIndexPointInTime object) {
                return createFragmentIndexPointInTimeAdapter();
            }
            @Override
            public Adapter caseSIExecutionContainer(SIExecutionContainer object) {
                return createSIExecutionContainerAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram <em>SI Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram
     * @generated
     */
    public Adapter createSIDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline <em>SI Lifeline</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline
     * @generated
     */
    public Adapter createSILifelineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution <em>SI Execution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution
     * @generated
     */
    public Adapter createSIExecutionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion <em>SI Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion
     * @generated
     */
    public Adapter createSIRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage <em>SI Message</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage
     * @generated
     */
    public Adapter createSIMessageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference <em>SI Element With Textual Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference
     * @generated
     */
    public Adapter createSIElementWithTextualReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement <em>SI Timed Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement
     * @generated
     */
    public Adapter createSITimedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime <em>Start Determines Point Int Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime
     * @generated
     */
    public Adapter createStartDeterminesPointIntTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime <em>Finish Determines Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime
     * @generated
     */
    public Adapter createFinishDeterminesPointInTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime <em>Minimum Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime
     * @generated
     */
    public Adapter createMinimumPointInTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime <em>Maximum Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime
     * @generated
     */
    public Adapter createMaximumPointInTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime <em>Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime
     * @generated
     */
    public Adapter createPointInTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime <em>Fragment Index Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime
     * @generated
     */
    public Adapter createFragmentIndexPointInTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer <em>SI Execution Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer
     * @generated
     */
    public Adapter createSIExecutionContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SequenceIntermediateAdapterFactory
