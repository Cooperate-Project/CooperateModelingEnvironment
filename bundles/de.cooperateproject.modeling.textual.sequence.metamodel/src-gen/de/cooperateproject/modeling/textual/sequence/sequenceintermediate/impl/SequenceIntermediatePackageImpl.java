/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateFactory;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.util.SequenceIntermediateValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceIntermediatePackageImpl extends EPackageImpl implements SequenceIntermediatePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siLifelineEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siExecutionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siRegionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siMessageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siElementWithTextualReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siTimedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass startDeterminesPointIntTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass finishDeterminesPointInTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minimumPointInTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass maximumPointInTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pointInTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fragmentIndexPointInTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass siExecutionContainerEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SequenceIntermediatePackageImpl() {
        super(eNS_URI, SequenceIntermediateFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SequenceIntermediatePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SequenceIntermediatePackage init() {
        if (isInited) return (SequenceIntermediatePackage)EPackage.Registry.INSTANCE.getEPackage(SequenceIntermediatePackage.eNS_URI);

        // Obtain or create and register package
        SequenceIntermediatePackageImpl theSequenceIntermediatePackage = (SequenceIntermediatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SequenceIntermediatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SequenceIntermediatePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        SequencePackage.eINSTANCE.eClass();
        TextualCommonsPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSequenceIntermediatePackage.createPackageContents();

        // Initialize created meta-data
        theSequenceIntermediatePackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSequenceIntermediatePackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return SequenceIntermediateValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theSequenceIntermediatePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SequenceIntermediatePackage.eNS_URI, theSequenceIntermediatePackage);
        return theSequenceIntermediatePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSIDiagram() {
        return siDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIDiagram_Lifelines() {
        return (EReference)siDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIDiagram_Regions() {
        return (EReference)siDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSILifeline() {
        return siLifelineEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSILifeline_Diagram() {
        return (EReference)siLifelineEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSIExecution() {
        return siExecutionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecution_Messages() {
        return (EReference)siExecutionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecution_SyncReply() {
        return (EReference)siExecutionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecution_Callstack() {
        return (EReference)siExecutionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecution_Container() {
        return (EReference)siExecutionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecution_Lifeline() {
        return (EReference)siExecutionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecution_ExecutionCause() {
        return (EReference)siExecutionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSIExecution__ContainerMustReferenceTheSameLifelineAsContainedExecutions__DiagnosticChain_Map_1() {
        return siExecutionEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSIRegion() {
        return siRegionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIRegion_Diagram() {
        return (EReference)siRegionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSIMessage() {
        return siMessageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIMessage_Origin() {
        return (EReference)siMessageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIMessage_CausesExecution() {
        return (EReference)siMessageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSIElementWithTextualReference() {
        return siElementWithTextualReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIElementWithTextualReference_ReferencedElement() {
        return (EReference)siElementWithTextualReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSITimedElement() {
        return siTimedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSITimedElement_Start() {
        return (EReference)siTimedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSITimedElement_Finish() {
        return (EReference)siTimedElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStartDeterminesPointIntTime() {
        return startDeterminesPointIntTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStartDeterminesPointIntTime_TimedElement() {
        return (EReference)startDeterminesPointIntTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getStartDeterminesPointIntTime__GetTimeInternal() {
        return startDeterminesPointIntTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFinishDeterminesPointInTime() {
        return finishDeterminesPointInTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFinishDeterminesPointInTime_TimedElement() {
        return (EReference)finishDeterminesPointInTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getFinishDeterminesPointInTime__GetTimeInternal() {
        return finishDeterminesPointInTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMinimumPointInTime() {
        return minimumPointInTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMinimumPointInTime_Elements() {
        return (EReference)minimumPointInTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMinimumPointInTime__GetTimeInternal() {
        return minimumPointInTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaximumPointInTime() {
        return maximumPointInTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaximumPointInTime_Elements() {
        return (EReference)maximumPointInTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMaximumPointInTime__GetTimeInternal() {
        return maximumPointInTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPointInTime() {
        return pointInTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPointInTime_Time() {
        return (EAttribute)pointInTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getPointInTime__GetTimeInternal() {
        return pointInTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFragmentIndexPointInTime() {
        return fragmentIndexPointInTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFragmentIndexPointInTime_FragmentIndex() {
        return (EAttribute)fragmentIndexPointInTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getFragmentIndexPointInTime__GetTimeInternal() {
        return fragmentIndexPointInTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSIExecutionContainer() {
        return siExecutionContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSIExecutionContainer_Executions() {
        return (EReference)siExecutionContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceIntermediateFactory getSequenceIntermediateFactory() {
        return (SequenceIntermediateFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        siDiagramEClass = createEClass(SI_DIAGRAM);
        createEReference(siDiagramEClass, SI_DIAGRAM__LIFELINES);
        createEReference(siDiagramEClass, SI_DIAGRAM__REGIONS);

        siLifelineEClass = createEClass(SI_LIFELINE);
        createEReference(siLifelineEClass, SI_LIFELINE__DIAGRAM);

        siExecutionEClass = createEClass(SI_EXECUTION);
        createEReference(siExecutionEClass, SI_EXECUTION__MESSAGES);
        createEReference(siExecutionEClass, SI_EXECUTION__SYNC_REPLY);
        createEReference(siExecutionEClass, SI_EXECUTION__CALLSTACK);
        createEReference(siExecutionEClass, SI_EXECUTION__CONTAINER);
        createEReference(siExecutionEClass, SI_EXECUTION__LIFELINE);
        createEReference(siExecutionEClass, SI_EXECUTION__EXECUTION_CAUSE);
        createEOperation(siExecutionEClass, SI_EXECUTION___CONTAINER_MUST_REFERENCE_THE_SAME_LIFELINE_AS_CONTAINED_EXECUTIONS__DIAGNOSTICCHAIN_MAP_1);

        siRegionEClass = createEClass(SI_REGION);
        createEReference(siRegionEClass, SI_REGION__DIAGRAM);

        siMessageEClass = createEClass(SI_MESSAGE);
        createEReference(siMessageEClass, SI_MESSAGE__ORIGIN);
        createEReference(siMessageEClass, SI_MESSAGE__CAUSES_EXECUTION);

        siElementWithTextualReferenceEClass = createEClass(SI_ELEMENT_WITH_TEXTUAL_REFERENCE);
        createEReference(siElementWithTextualReferenceEClass, SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT);

        siTimedElementEClass = createEClass(SI_TIMED_ELEMENT);
        createEReference(siTimedElementEClass, SI_TIMED_ELEMENT__START);
        createEReference(siTimedElementEClass, SI_TIMED_ELEMENT__FINISH);

        startDeterminesPointIntTimeEClass = createEClass(START_DETERMINES_POINT_INT_TIME);
        createEReference(startDeterminesPointIntTimeEClass, START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT);
        createEOperation(startDeterminesPointIntTimeEClass, START_DETERMINES_POINT_INT_TIME___GET_TIME_INTERNAL);

        finishDeterminesPointInTimeEClass = createEClass(FINISH_DETERMINES_POINT_IN_TIME);
        createEReference(finishDeterminesPointInTimeEClass, FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT);
        createEOperation(finishDeterminesPointInTimeEClass, FINISH_DETERMINES_POINT_IN_TIME___GET_TIME_INTERNAL);

        minimumPointInTimeEClass = createEClass(MINIMUM_POINT_IN_TIME);
        createEReference(minimumPointInTimeEClass, MINIMUM_POINT_IN_TIME__ELEMENTS);
        createEOperation(minimumPointInTimeEClass, MINIMUM_POINT_IN_TIME___GET_TIME_INTERNAL);

        maximumPointInTimeEClass = createEClass(MAXIMUM_POINT_IN_TIME);
        createEReference(maximumPointInTimeEClass, MAXIMUM_POINT_IN_TIME__ELEMENTS);
        createEOperation(maximumPointInTimeEClass, MAXIMUM_POINT_IN_TIME___GET_TIME_INTERNAL);

        pointInTimeEClass = createEClass(POINT_IN_TIME);
        createEAttribute(pointInTimeEClass, POINT_IN_TIME__TIME);
        createEOperation(pointInTimeEClass, POINT_IN_TIME___GET_TIME_INTERNAL);

        fragmentIndexPointInTimeEClass = createEClass(FRAGMENT_INDEX_POINT_IN_TIME);
        createEAttribute(fragmentIndexPointInTimeEClass, FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX);
        createEOperation(fragmentIndexPointInTimeEClass, FRAGMENT_INDEX_POINT_IN_TIME___GET_TIME_INTERNAL);

        siExecutionContainerEClass = createEClass(SI_EXECUTION_CONTAINER);
        createEReference(siExecutionContainerEClass, SI_EXECUTION_CONTAINER__EXECUTIONS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        SequencePackage theSequencePackage = (SequencePackage)EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI);

        // Create type parameters
        ETypeParameter siElementWithTextualReferenceEClass_ElementType = addETypeParameter(siElementWithTextualReferenceEClass, "ElementType");

        // Set bounds for type parameters

        // Add supertypes to classes
        EGenericType g1 = createEGenericType(this.getSIElementWithTextualReference());
        EGenericType g2 = createEGenericType(theSequencePackage.getSequenceDiagram());
        g1.getETypeArguments().add(g2);
        siDiagramEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSIExecutionContainer());
        siDiagramEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSIElementWithTextualReference());
        g2 = createEGenericType(theSequencePackage.getActor());
        g1.getETypeArguments().add(g2);
        siLifelineEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSITimedElement());
        siLifelineEClass.getEGenericSuperTypes().add(g1);
        siExecutionEClass.getESuperTypes().add(this.getSITimedElement());
        siExecutionEClass.getESuperTypes().add(this.getSIExecutionContainer());
        g1 = createEGenericType(this.getSIElementWithTextualReference());
        g2 = createEGenericType(theSequencePackage.getOrderedFragmentContainer());
        g1.getETypeArguments().add(g2);
        siRegionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSITimedElement());
        siRegionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSIExecutionContainer());
        siRegionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSITimedElement());
        siMessageEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSIElementWithTextualReference());
        g2 = createEGenericType(theSequencePackage.getMessage());
        g1.getETypeArguments().add(g2);
        siMessageEClass.getEGenericSuperTypes().add(g1);
        startDeterminesPointIntTimeEClass.getESuperTypes().add(this.getPointInTime());
        finishDeterminesPointInTimeEClass.getESuperTypes().add(this.getPointInTime());
        minimumPointInTimeEClass.getESuperTypes().add(this.getPointInTime());
        maximumPointInTimeEClass.getESuperTypes().add(this.getPointInTime());
        g1 = createEGenericType(this.getPointInTime());
        fragmentIndexPointInTimeEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getSIElementWithTextualReference());
        g2 = createEGenericType(theSequencePackage.getFragment());
        g1.getETypeArguments().add(g2);
        fragmentIndexPointInTimeEClass.getEGenericSuperTypes().add(g1);

        // Initialize classes, features, and operations; add parameters
        initEClass(siDiagramEClass, SIDiagram.class, "SIDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSIDiagram_Lifelines(), this.getSILifeline(), this.getSILifeline_Diagram(), "lifelines", null, 0, -1, SIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIDiagram_Regions(), this.getSIRegion(), this.getSIRegion_Diagram(), "regions", null, 0, -1, SIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(siLifelineEClass, SILifeline.class, "SILifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSILifeline_Diagram(), this.getSIDiagram(), this.getSIDiagram_Lifelines(), "diagram", null, 0, 1, SILifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(siExecutionEClass, SIExecution.class, "SIExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSIExecution_Messages(), this.getSIMessage(), this.getSIMessage_Origin(), "messages", null, 0, -1, SIExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIExecution_SyncReply(), this.getSIMessage(), null, "syncReply", null, 0, 1, SIExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIExecution_Callstack(), this.getSIExecution(), null, "callstack", null, 0, -1, SIExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIExecution_Container(), this.getSIExecutionContainer(), this.getSIExecutionContainer_Executions(), "container", null, 0, 1, SIExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIExecution_Lifeline(), this.getSILifeline(), null, "lifeline", null, 1, 1, SIExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIExecution_ExecutionCause(), this.getSIMessage(), this.getSIMessage_CausesExecution(), "executionCause", null, 0, 1, SIExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getSIExecution__ContainerMustReferenceTheSameLifelineAsContainedExecutions__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "containerMustReferenceTheSameLifelineAsContainedExecutions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(siRegionEClass, SIRegion.class, "SIRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSIRegion_Diagram(), this.getSIDiagram(), this.getSIDiagram_Regions(), "diagram", null, 0, 1, SIRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(siMessageEClass, SIMessage.class, "SIMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSIMessage_Origin(), this.getSIExecution(), this.getSIExecution_Messages(), "origin", null, 0, 1, SIMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSIMessage_CausesExecution(), this.getSIExecution(), this.getSIExecution_ExecutionCause(), "causesExecution", null, 0, 1, SIMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(siElementWithTextualReferenceEClass, SIElementWithTextualReference.class, "SIElementWithTextualReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(siElementWithTextualReferenceEClass_ElementType);
        initEReference(getSIElementWithTextualReference_ReferencedElement(), g1, null, "referencedElement", null, 0, 1, SIElementWithTextualReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(siTimedElementEClass, SITimedElement.class, "SITimedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSITimedElement_Start(), this.getPointInTime(), null, "start", null, 1, 1, SITimedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSITimedElement_Finish(), this.getPointInTime(), null, "finish", null, 1, 1, SITimedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(startDeterminesPointIntTimeEClass, StartDeterminesPointIntTime.class, "StartDeterminesPointIntTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStartDeterminesPointIntTime_TimedElement(), this.getSITimedElement(), null, "timedElement", null, 1, 1, StartDeterminesPointIntTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getStartDeterminesPointIntTime__GetTimeInternal(), ecorePackage.getEInt(), "getTimeInternal", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(finishDeterminesPointInTimeEClass, FinishDeterminesPointInTime.class, "FinishDeterminesPointInTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFinishDeterminesPointInTime_TimedElement(), this.getSITimedElement(), null, "timedElement", null, 1, 1, FinishDeterminesPointInTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getFinishDeterminesPointInTime__GetTimeInternal(), ecorePackage.getEInt(), "getTimeInternal", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(minimumPointInTimeEClass, MinimumPointInTime.class, "MinimumPointInTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMinimumPointInTime_Elements(), this.getPointInTime(), null, "elements", null, 1, -1, MinimumPointInTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEOperation(getMinimumPointInTime__GetTimeInternal(), ecorePackage.getEInt(), "getTimeInternal", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(maximumPointInTimeEClass, MaximumPointInTime.class, "MaximumPointInTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMaximumPointInTime_Elements(), this.getPointInTime(), null, "elements", null, 1, -1, MaximumPointInTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEOperation(getMaximumPointInTime__GetTimeInternal(), ecorePackage.getEInt(), "getTimeInternal", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pointInTimeEClass, PointInTime.class, "PointInTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPointInTime_Time(), ecorePackage.getEInt(), "time", null, 1, 1, PointInTime.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getPointInTime__GetTimeInternal(), ecorePackage.getEInt(), "getTimeInternal", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(fragmentIndexPointInTimeEClass, FragmentIndexPointInTime.class, "FragmentIndexPointInTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFragmentIndexPointInTime_FragmentIndex(), ecorePackage.getEInt(), "fragmentIndex", null, 1, 1, FragmentIndexPointInTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getFragmentIndexPointInTime__GetTimeInternal(), ecorePackage.getEInt(), "getTimeInternal", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(siExecutionContainerEClass, SIExecutionContainer.class, "SIExecutionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSIExecutionContainer_Executions(), this.getSIExecution(), this.getSIExecution_Container(), "executions", null, 0, -1, SIExecutionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/OCL/Collection
        createCollectionAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";	
        addAnnotation
          (this, 
           source, 
           new String[] {
           });	
        addAnnotation
          (siExecutionEClass, 
           source, 
           new String[] {
             "constraints", "containerMustReferenceTheSameLifelineAsContainedExecutions"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createCollectionAnnotations() {
        String source = "http://www.eclipse.org/OCL/Collection";	
        addAnnotation
          (getMinimumPointInTime_Elements(), 
           source, 
           new String[] {
             "nullFree", "false"
           });	
        addAnnotation
          (getMaximumPointInTime_Elements(), 
           source, 
           new String[] {
             "nullFree", "false"
           });
    }

} //SequenceIntermediatePackageImpl
