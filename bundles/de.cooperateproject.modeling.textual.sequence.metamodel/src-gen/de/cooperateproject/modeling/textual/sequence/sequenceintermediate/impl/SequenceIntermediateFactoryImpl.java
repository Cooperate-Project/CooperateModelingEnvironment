/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceIntermediateFactoryImpl extends EFactoryImpl implements SequenceIntermediateFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SequenceIntermediateFactory init() {
        try {
            SequenceIntermediateFactory theSequenceIntermediateFactory = (SequenceIntermediateFactory)EPackage.Registry.INSTANCE.getEFactory(SequenceIntermediatePackage.eNS_URI);
            if (theSequenceIntermediateFactory != null) {
                return theSequenceIntermediateFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SequenceIntermediateFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceIntermediateFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SequenceIntermediatePackage.SI_DIAGRAM: return createSIDiagram();
            case SequenceIntermediatePackage.SI_LIFELINE: return createSILifeline();
            case SequenceIntermediatePackage.SI_EXECUTION: return createSIExecution();
            case SequenceIntermediatePackage.SI_REGION: return createSIRegion();
            case SequenceIntermediatePackage.SI_MESSAGE: return createSIMessage();
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE: return createSIElementWithTextualReference();
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT: return createSITimedElement();
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME: return createStartDeterminesPointIntTime();
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME: return createFinishDeterminesPointInTime();
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME: return createMinimumPointInTime();
            case SequenceIntermediatePackage.MAXIMUM_POINT_IN_TIME: return createMaximumPointInTime();
            case SequenceIntermediatePackage.POINT_IN_TIME: return createPointInTime();
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME: return createFragmentIndexPointInTime();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIDiagram createSIDiagram() {
        SIDiagramImpl siDiagram = new SIDiagramImpl();
        return siDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SILifeline createSILifeline() {
        SILifelineImpl siLifeline = new SILifelineImpl();
        return siLifeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIExecution createSIExecution() {
        SIExecutionImpl siExecution = new SIExecutionImpl();
        return siExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIRegion createSIRegion() {
        SIRegionImpl siRegion = new SIRegionImpl();
        return siRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIMessage createSIMessage() {
        SIMessageImpl siMessage = new SIMessageImpl();
        return siMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public <ElementType> SIElementWithTextualReference<ElementType> createSIElementWithTextualReference() {
        SIElementWithTextualReferenceImpl<ElementType> siElementWithTextualReference = new SIElementWithTextualReferenceImpl<ElementType>();
        return siElementWithTextualReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SITimedElement createSITimedElement() {
        SITimedElementImpl siTimedElement = new SITimedElementImpl();
        return siTimedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartDeterminesPointIntTime createStartDeterminesPointIntTime() {
        StartDeterminesPointIntTimeImpl startDeterminesPointIntTime = new StartDeterminesPointIntTimeImpl();
        return startDeterminesPointIntTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FinishDeterminesPointInTime createFinishDeterminesPointInTime() {
        FinishDeterminesPointInTimeImpl finishDeterminesPointInTime = new FinishDeterminesPointInTimeImpl();
        return finishDeterminesPointInTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinimumPointInTime createMinimumPointInTime() {
        MinimumPointInTimeImpl minimumPointInTime = new MinimumPointInTimeImpl();
        return minimumPointInTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaximumPointInTime createMaximumPointInTime() {
        MaximumPointInTimeImpl maximumPointInTime = new MaximumPointInTimeImpl();
        return maximumPointInTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PointInTime createPointInTime() {
        PointInTimeImpl pointInTime = new PointInTimeImpl();
        return pointInTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FragmentIndexPointInTime createFragmentIndexPointInTime() {
        FragmentIndexPointInTimeImpl fragmentIndexPointInTime = new FragmentIndexPointInTimeImpl();
        return fragmentIndexPointInTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceIntermediatePackage getSequenceIntermediatePackage() {
        return (SequenceIntermediatePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SequenceIntermediatePackage getPackage() {
        return SequenceIntermediatePackage.eINSTANCE;
    }

} //SequenceIntermediateFactoryImpl
