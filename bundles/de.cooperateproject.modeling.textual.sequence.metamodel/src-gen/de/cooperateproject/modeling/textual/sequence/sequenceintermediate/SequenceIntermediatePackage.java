/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateFactory
 * @model kind="package"
 * @generated
 */
public interface SequenceIntermediatePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sequenceintermediate";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "seqint";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SequenceIntermediatePackage eINSTANCE = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIElementWithTextualReferenceImpl <em>SI Element With Textual Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIElementWithTextualReferenceImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIElementWithTextualReference()
     * @generated
     */
    int SI_ELEMENT_WITH_TEXTUAL_REFERENCE = 5;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = 1;

    /**
     * The number of structural features of the '<em>SI Element With Textual Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>Calculate Unique Identifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER = 0;

    /**
     * The number of operations of the '<em>SI Element With Textual Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_ELEMENT_WITH_TEXTUAL_REFERENCE_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl <em>SI Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIDiagram()
     * @generated
     */
    int SI_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM__REFERENCED_ELEMENT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Executions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM__EXECUTIONS = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM__LIFELINES = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Regions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM__REGIONS = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>SI Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM_FEATURE_COUNT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Calculate Unique Identifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM___CALCULATE_UNIQUE_IDENTIFIER = SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER;

    /**
     * The number of operations of the '<em>SI Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_DIAGRAM_OPERATION_COUNT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl <em>SI Lifeline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSILifeline()
     * @generated
     */
    int SI_LIFELINE = 1;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE__REFERENCED_ELEMENT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE__START = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Finish</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE__FINISH = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE__DIAGRAM = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>SI Lifeline</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE_FEATURE_COUNT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Calculate Unique Identifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE___CALCULATE_UNIQUE_IDENTIFIER = SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER;

    /**
     * The number of operations of the '<em>SI Lifeline</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_LIFELINE_OPERATION_COUNT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SITimedElementImpl <em>SI Timed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SITimedElementImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSITimedElement()
     * @generated
     */
    int SI_TIMED_ELEMENT = 6;

    /**
     * The feature id for the '<em><b>Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_TIMED_ELEMENT__START = 0;

    /**
     * The feature id for the '<em><b>Finish</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_TIMED_ELEMENT__FINISH = 1;

    /**
     * The number of structural features of the '<em>SI Timed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_TIMED_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>SI Timed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_TIMED_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl <em>SI Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIExecution()
     * @generated
     */
    int SI_EXECUTION = 2;

    /**
     * The feature id for the '<em><b>Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__START = SI_TIMED_ELEMENT__START;

    /**
     * The feature id for the '<em><b>Finish</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__FINISH = SI_TIMED_ELEMENT__FINISH;

    /**
     * The feature id for the '<em><b>Executions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__EXECUTIONS = SI_TIMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Messages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__MESSAGES = SI_TIMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sync Reply</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__SYNC_REPLY = SI_TIMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Callstack</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__CALLSTACK = SI_TIMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__CONTAINER = SI_TIMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Lifeline</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__LIFELINE = SI_TIMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Execution Cause</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION__EXECUTION_CAUSE = SI_TIMED_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>SI Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION_FEATURE_COUNT = SI_TIMED_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Container Must Reference The Same Lifeline As Contained Executions</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION___CONTAINER_MUST_REFERENCE_THE_SAME_LIFELINE_AS_CONTAINED_EXECUTIONS__DIAGNOSTICCHAIN_MAP_1 = SI_TIMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>SI Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION_OPERATION_COUNT = SI_TIMED_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl <em>SI Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIRegion()
     * @generated
     */
    int SI_REGION = 3;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION__REFERENCED_ELEMENT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION__START = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Finish</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION__FINISH = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Executions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION__EXECUTIONS = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION__DIAGRAM = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>SI Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION_FEATURE_COUNT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Calculate Unique Identifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION___CALCULATE_UNIQUE_IDENTIFIER = SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER;

    /**
     * The number of operations of the '<em>SI Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_REGION_OPERATION_COUNT = SI_ELEMENT_WITH_TEXTUAL_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl <em>SI Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIMessage()
     * @generated
     */
    int SI_MESSAGE = 4;

    /**
     * The feature id for the '<em><b>Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE__START = SI_TIMED_ELEMENT__START;

    /**
     * The feature id for the '<em><b>Finish</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE__FINISH = SI_TIMED_ELEMENT__FINISH;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE__REFERENCED_ELEMENT = SI_TIMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = SI_TIMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Origin</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE__ORIGIN = SI_TIMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Causes Execution</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE__CAUSES_EXECUTION = SI_TIMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>SI Message</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE_FEATURE_COUNT = SI_TIMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Calculate Unique Identifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE___CALCULATE_UNIQUE_IDENTIFIER = SI_TIMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>SI Message</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_MESSAGE_OPERATION_COUNT = SI_TIMED_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.PointInTimeImpl <em>Point In Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.PointInTimeImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getPointInTime()
     * @generated
     */
    int POINT_IN_TIME = 11;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_IN_TIME__TIME = 0;

    /**
     * The number of structural features of the '<em>Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_IN_TIME_FEATURE_COUNT = 1;

    /**
     * The operation id for the '<em>Get Time Internal</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_IN_TIME___GET_TIME_INTERNAL = 0;

    /**
     * The number of operations of the '<em>Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_IN_TIME_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.StartDeterminesPointIntTimeImpl <em>Start Determines Point Int Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.StartDeterminesPointIntTimeImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getStartDeterminesPointIntTime()
     * @generated
     */
    int START_DETERMINES_POINT_INT_TIME = 7;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_DETERMINES_POINT_INT_TIME__TIME = POINT_IN_TIME__TIME;

    /**
     * The feature id for the '<em><b>Timed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT = POINT_IN_TIME_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Start Determines Point Int Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_DETERMINES_POINT_INT_TIME_FEATURE_COUNT = POINT_IN_TIME_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Time Internal</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_DETERMINES_POINT_INT_TIME___GET_TIME_INTERNAL = POINT_IN_TIME_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Start Determines Point Int Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_DETERMINES_POINT_INT_TIME_OPERATION_COUNT = POINT_IN_TIME_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FinishDeterminesPointInTimeImpl <em>Finish Determines Point In Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FinishDeterminesPointInTimeImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getFinishDeterminesPointInTime()
     * @generated
     */
    int FINISH_DETERMINES_POINT_IN_TIME = 8;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINISH_DETERMINES_POINT_IN_TIME__TIME = POINT_IN_TIME__TIME;

    /**
     * The feature id for the '<em><b>Timed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT = POINT_IN_TIME_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Finish Determines Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINISH_DETERMINES_POINT_IN_TIME_FEATURE_COUNT = POINT_IN_TIME_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Time Internal</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINISH_DETERMINES_POINT_IN_TIME___GET_TIME_INTERNAL = POINT_IN_TIME_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Finish Determines Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINISH_DETERMINES_POINT_IN_TIME_OPERATION_COUNT = POINT_IN_TIME_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MinimumPointInTimeImpl <em>Minimum Point In Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MinimumPointInTimeImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getMinimumPointInTime()
     * @generated
     */
    int MINIMUM_POINT_IN_TIME = 9;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_POINT_IN_TIME__TIME = POINT_IN_TIME__TIME;

    /**
     * The feature id for the '<em><b>Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_POINT_IN_TIME__ELEMENTS = POINT_IN_TIME_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Minimum Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_POINT_IN_TIME_FEATURE_COUNT = POINT_IN_TIME_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Time Internal</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_POINT_IN_TIME___GET_TIME_INTERNAL = POINT_IN_TIME_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Minimum Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_POINT_IN_TIME_OPERATION_COUNT = POINT_IN_TIME_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MaximumPointInTimeImpl <em>Maximum Point In Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MaximumPointInTimeImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getMaximumPointInTime()
     * @generated
     */
    int MAXIMUM_POINT_IN_TIME = 10;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_POINT_IN_TIME__TIME = POINT_IN_TIME__TIME;

    /**
     * The feature id for the '<em><b>Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_POINT_IN_TIME__ELEMENTS = POINT_IN_TIME_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Maximum Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_POINT_IN_TIME_FEATURE_COUNT = POINT_IN_TIME_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Time Internal</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_POINT_IN_TIME___GET_TIME_INTERNAL = POINT_IN_TIME_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Maximum Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_POINT_IN_TIME_OPERATION_COUNT = POINT_IN_TIME_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl <em>Fragment Index Point In Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getFragmentIndexPointInTime()
     * @generated
     */
    int FRAGMENT_INDEX_POINT_IN_TIME = 12;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME__TIME = POINT_IN_TIME__TIME;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME__REFERENCED_ELEMENT = POINT_IN_TIME_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = POINT_IN_TIME_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Fragment Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX = POINT_IN_TIME_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Fragment Index Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME_FEATURE_COUNT = POINT_IN_TIME_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Calculate Unique Identifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME___CALCULATE_UNIQUE_IDENTIFIER = POINT_IN_TIME_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Time Internal</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME___GET_TIME_INTERNAL = POINT_IN_TIME_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Fragment Index Point In Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRAGMENT_INDEX_POINT_IN_TIME_OPERATION_COUNT = POINT_IN_TIME_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionContainerImpl <em>SI Execution Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionContainerImpl
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIExecutionContainer()
     * @generated
     */
    int SI_EXECUTION_CONTAINER = 13;

    /**
     * The feature id for the '<em><b>Executions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION_CONTAINER__EXECUTIONS = 0;

    /**
     * The number of structural features of the '<em>SI Execution Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION_CONTAINER_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>SI Execution Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SI_EXECUTION_CONTAINER_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram <em>SI Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram
     * @generated
     */
    EClass getSIDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getLifelines <em>Lifelines</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lifelines</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getLifelines()
     * @see #getSIDiagram()
     * @generated
     */
    EReference getSIDiagram_Lifelines();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Regions</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getRegions()
     * @see #getSIDiagram()
     * @generated
     */
    EReference getSIDiagram_Regions();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline <em>SI Lifeline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Lifeline</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline
     * @generated
     */
    EClass getSILifeline();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline#getDiagram()
     * @see #getSILifeline()
     * @generated
     */
    EReference getSILifeline_Diagram();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution <em>SI Execution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Execution</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution
     * @generated
     */
    EClass getSIExecution();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getMessages <em>Messages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Messages</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getMessages()
     * @see #getSIExecution()
     * @generated
     */
    EReference getSIExecution_Messages();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getSyncReply <em>Sync Reply</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sync Reply</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getSyncReply()
     * @see #getSIExecution()
     * @generated
     */
    EReference getSIExecution_SyncReply();

    /**
     * Returns the meta object for the reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getCallstack <em>Callstack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Callstack</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getCallstack()
     * @see #getSIExecution()
     * @generated
     */
    EReference getSIExecution_Callstack();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getContainer()
     * @see #getSIExecution()
     * @generated
     */
    EReference getSIExecution_Container();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getLifeline <em>Lifeline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Lifeline</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getLifeline()
     * @see #getSIExecution()
     * @generated
     */
    EReference getSIExecution_Lifeline();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getExecutionCause <em>Execution Cause</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Execution Cause</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getExecutionCause()
     * @see #getSIExecution()
     * @generated
     */
    EReference getSIExecution_ExecutionCause();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#containerMustReferenceTheSameLifelineAsContainedExecutions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Container Must Reference The Same Lifeline As Contained Executions</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Container Must Reference The Same Lifeline As Contained Executions</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#containerMustReferenceTheSameLifelineAsContainedExecutions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getSIExecution__ContainerMustReferenceTheSameLifelineAsContainedExecutions__DiagnosticChain_Map_1();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion <em>SI Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Region</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion
     * @generated
     */
    EClass getSIRegion();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Diagram</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion#getDiagram()
     * @see #getSIRegion()
     * @generated
     */
    EReference getSIRegion_Diagram();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage <em>SI Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Message</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage
     * @generated
     */
    EClass getSIMessage();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getOrigin <em>Origin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Origin</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getOrigin()
     * @see #getSIMessage()
     * @generated
     */
    EReference getSIMessage_Origin();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getCausesExecution <em>Causes Execution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Causes Execution</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getCausesExecution()
     * @see #getSIMessage()
     * @generated
     */
    EReference getSIMessage_CausesExecution();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference <em>SI Element With Textual Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Element With Textual Reference</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference
     * @generated
     */
    EClass getSIElementWithTextualReference();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getReferencedElement <em>Referenced Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Element</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getReferencedElement()
     * @see #getSIElementWithTextualReference()
     * @generated
     */
    EReference getSIElementWithTextualReference_ReferencedElement();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getUniqueIdentifierOfReferencedElement <em>Unique Identifier Of Referenced Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique Identifier Of Referenced Element</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getUniqueIdentifierOfReferencedElement()
     * @see #getSIElementWithTextualReference()
     * @generated
     */
    EAttribute getSIElementWithTextualReference_UniqueIdentifierOfReferencedElement();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#calculateUniqueIdentifier() <em>Calculate Unique Identifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calculate Unique Identifier</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#calculateUniqueIdentifier()
     * @generated
     */
    EOperation getSIElementWithTextualReference__CalculateUniqueIdentifier();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement <em>SI Timed Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Timed Element</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement
     * @generated
     */
    EClass getSITimedElement();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Start</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement#getStart()
     * @see #getSITimedElement()
     * @generated
     */
    EReference getSITimedElement_Start();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement#getFinish <em>Finish</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Finish</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement#getFinish()
     * @see #getSITimedElement()
     * @generated
     */
    EReference getSITimedElement_Finish();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime <em>Start Determines Point Int Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Start Determines Point Int Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime
     * @generated
     */
    EClass getStartDeterminesPointIntTime();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime#getTimedElement <em>Timed Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Timed Element</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime#getTimedElement()
     * @see #getStartDeterminesPointIntTime()
     * @generated
     */
    EReference getStartDeterminesPointIntTime_TimedElement();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime#getTimeInternal() <em>Get Time Internal</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Time Internal</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime#getTimeInternal()
     * @generated
     */
    EOperation getStartDeterminesPointIntTime__GetTimeInternal();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime <em>Finish Determines Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Finish Determines Point In Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime
     * @generated
     */
    EClass getFinishDeterminesPointInTime();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime#getTimedElement <em>Timed Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Timed Element</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime#getTimedElement()
     * @see #getFinishDeterminesPointInTime()
     * @generated
     */
    EReference getFinishDeterminesPointInTime_TimedElement();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime#getTimeInternal() <em>Get Time Internal</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Time Internal</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime#getTimeInternal()
     * @generated
     */
    EOperation getFinishDeterminesPointInTime__GetTimeInternal();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime <em>Minimum Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Minimum Point In Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime
     * @generated
     */
    EClass getMinimumPointInTime();

    /**
     * Returns the meta object for the reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Elements</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime#getElements()
     * @see #getMinimumPointInTime()
     * @generated
     */
    EReference getMinimumPointInTime_Elements();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime#getTimeInternal() <em>Get Time Internal</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Time Internal</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime#getTimeInternal()
     * @generated
     */
    EOperation getMinimumPointInTime__GetTimeInternal();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime <em>Maximum Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maximum Point In Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime
     * @generated
     */
    EClass getMaximumPointInTime();

    /**
     * Returns the meta object for the reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Elements</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime#getElements()
     * @see #getMaximumPointInTime()
     * @generated
     */
    EReference getMaximumPointInTime_Elements();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime#getTimeInternal() <em>Get Time Internal</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Time Internal</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MaximumPointInTime#getTimeInternal()
     * @generated
     */
    EOperation getMaximumPointInTime__GetTimeInternal();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime <em>Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point In Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime
     * @generated
     */
    EClass getPointInTime();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime#getTime()
     * @see #getPointInTime()
     * @generated
     */
    EAttribute getPointInTime_Time();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime#getTimeInternal() <em>Get Time Internal</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Time Internal</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime#getTimeInternal()
     * @generated
     */
    EOperation getPointInTime__GetTimeInternal();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime <em>Fragment Index Point In Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fragment Index Point In Time</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime
     * @generated
     */
    EClass getFragmentIndexPointInTime();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime#getFragmentIndex <em>Fragment Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fragment Index</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime#getFragmentIndex()
     * @see #getFragmentIndexPointInTime()
     * @generated
     */
    EAttribute getFragmentIndexPointInTime_FragmentIndex();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime#getTimeInternal() <em>Get Time Internal</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Time Internal</em>' operation.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime#getTimeInternal()
     * @generated
     */
    EOperation getFragmentIndexPointInTime__GetTimeInternal();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer <em>SI Execution Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SI Execution Container</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer
     * @generated
     */
    EClass getSIExecutionContainer();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer#getExecutions <em>Executions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Executions</em>'.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer#getExecutions()
     * @see #getSIExecutionContainer()
     * @generated
     */
    EReference getSIExecutionContainer_Executions();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SequenceIntermediateFactory getSequenceIntermediateFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl <em>SI Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIDiagramImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIDiagram()
         * @generated
         */
        EClass SI_DIAGRAM = eINSTANCE.getSIDiagram();

        /**
         * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_DIAGRAM__LIFELINES = eINSTANCE.getSIDiagram_Lifelines();

        /**
         * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_DIAGRAM__REGIONS = eINSTANCE.getSIDiagram_Regions();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl <em>SI Lifeline</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SILifelineImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSILifeline()
         * @generated
         */
        EClass SI_LIFELINE = eINSTANCE.getSILifeline();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_LIFELINE__DIAGRAM = eINSTANCE.getSILifeline_Diagram();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl <em>SI Execution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIExecution()
         * @generated
         */
        EClass SI_EXECUTION = eINSTANCE.getSIExecution();

        /**
         * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION__MESSAGES = eINSTANCE.getSIExecution_Messages();

        /**
         * The meta object literal for the '<em><b>Sync Reply</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION__SYNC_REPLY = eINSTANCE.getSIExecution_SyncReply();

        /**
         * The meta object literal for the '<em><b>Callstack</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION__CALLSTACK = eINSTANCE.getSIExecution_Callstack();

        /**
         * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION__CONTAINER = eINSTANCE.getSIExecution_Container();

        /**
         * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION__LIFELINE = eINSTANCE.getSIExecution_Lifeline();

        /**
         * The meta object literal for the '<em><b>Execution Cause</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION__EXECUTION_CAUSE = eINSTANCE.getSIExecution_ExecutionCause();

        /**
         * The meta object literal for the '<em><b>Container Must Reference The Same Lifeline As Contained Executions</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SI_EXECUTION___CONTAINER_MUST_REFERENCE_THE_SAME_LIFELINE_AS_CONTAINED_EXECUTIONS__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getSIExecution__ContainerMustReferenceTheSameLifelineAsContainedExecutions__DiagnosticChain_Map_1();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl <em>SI Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIRegionImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIRegion()
         * @generated
         */
        EClass SI_REGION = eINSTANCE.getSIRegion();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_REGION__DIAGRAM = eINSTANCE.getSIRegion_Diagram();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl <em>SI Message</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIMessageImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIMessage()
         * @generated
         */
        EClass SI_MESSAGE = eINSTANCE.getSIMessage();

        /**
         * The meta object literal for the '<em><b>Origin</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_MESSAGE__ORIGIN = eINSTANCE.getSIMessage_Origin();

        /**
         * The meta object literal for the '<em><b>Causes Execution</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_MESSAGE__CAUSES_EXECUTION = eINSTANCE.getSIMessage_CausesExecution();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIElementWithTextualReferenceImpl <em>SI Element With Textual Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIElementWithTextualReferenceImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIElementWithTextualReference()
         * @generated
         */
        EClass SI_ELEMENT_WITH_TEXTUAL_REFERENCE = eINSTANCE.getSIElementWithTextualReference();

        /**
         * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT = eINSTANCE.getSIElementWithTextualReference_ReferencedElement();

        /**
         * The meta object literal for the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT = eINSTANCE.getSIElementWithTextualReference_UniqueIdentifierOfReferencedElement();

        /**
         * The meta object literal for the '<em><b>Calculate Unique Identifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER = eINSTANCE.getSIElementWithTextualReference__CalculateUniqueIdentifier();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SITimedElementImpl <em>SI Timed Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SITimedElementImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSITimedElement()
         * @generated
         */
        EClass SI_TIMED_ELEMENT = eINSTANCE.getSITimedElement();

        /**
         * The meta object literal for the '<em><b>Start</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_TIMED_ELEMENT__START = eINSTANCE.getSITimedElement_Start();

        /**
         * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_TIMED_ELEMENT__FINISH = eINSTANCE.getSITimedElement_Finish();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.StartDeterminesPointIntTimeImpl <em>Start Determines Point Int Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.StartDeterminesPointIntTimeImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getStartDeterminesPointIntTime()
         * @generated
         */
        EClass START_DETERMINES_POINT_INT_TIME = eINSTANCE.getStartDeterminesPointIntTime();

        /**
         * The meta object literal for the '<em><b>Timed Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT = eINSTANCE.getStartDeterminesPointIntTime_TimedElement();

        /**
         * The meta object literal for the '<em><b>Get Time Internal</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation START_DETERMINES_POINT_INT_TIME___GET_TIME_INTERNAL = eINSTANCE.getStartDeterminesPointIntTime__GetTimeInternal();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FinishDeterminesPointInTimeImpl <em>Finish Determines Point In Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FinishDeterminesPointInTimeImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getFinishDeterminesPointInTime()
         * @generated
         */
        EClass FINISH_DETERMINES_POINT_IN_TIME = eINSTANCE.getFinishDeterminesPointInTime();

        /**
         * The meta object literal for the '<em><b>Timed Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT = eINSTANCE.getFinishDeterminesPointInTime_TimedElement();

        /**
         * The meta object literal for the '<em><b>Get Time Internal</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation FINISH_DETERMINES_POINT_IN_TIME___GET_TIME_INTERNAL = eINSTANCE.getFinishDeterminesPointInTime__GetTimeInternal();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MinimumPointInTimeImpl <em>Minimum Point In Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MinimumPointInTimeImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getMinimumPointInTime()
         * @generated
         */
        EClass MINIMUM_POINT_IN_TIME = eINSTANCE.getMinimumPointInTime();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MINIMUM_POINT_IN_TIME__ELEMENTS = eINSTANCE.getMinimumPointInTime_Elements();

        /**
         * The meta object literal for the '<em><b>Get Time Internal</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MINIMUM_POINT_IN_TIME___GET_TIME_INTERNAL = eINSTANCE.getMinimumPointInTime__GetTimeInternal();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MaximumPointInTimeImpl <em>Maximum Point In Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MaximumPointInTimeImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getMaximumPointInTime()
         * @generated
         */
        EClass MAXIMUM_POINT_IN_TIME = eINSTANCE.getMaximumPointInTime();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAXIMUM_POINT_IN_TIME__ELEMENTS = eINSTANCE.getMaximumPointInTime_Elements();

        /**
         * The meta object literal for the '<em><b>Get Time Internal</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAXIMUM_POINT_IN_TIME___GET_TIME_INTERNAL = eINSTANCE.getMaximumPointInTime__GetTimeInternal();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.PointInTimeImpl <em>Point In Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.PointInTimeImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getPointInTime()
         * @generated
         */
        EClass POINT_IN_TIME = eINSTANCE.getPointInTime();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT_IN_TIME__TIME = eINSTANCE.getPointInTime_Time();

        /**
         * The meta object literal for the '<em><b>Get Time Internal</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation POINT_IN_TIME___GET_TIME_INTERNAL = eINSTANCE.getPointInTime__GetTimeInternal();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl <em>Fragment Index Point In Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.FragmentIndexPointInTimeImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getFragmentIndexPointInTime()
         * @generated
         */
        EClass FRAGMENT_INDEX_POINT_IN_TIME = eINSTANCE.getFragmentIndexPointInTime();

        /**
         * The meta object literal for the '<em><b>Fragment Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX = eINSTANCE.getFragmentIndexPointInTime_FragmentIndex();

        /**
         * The meta object literal for the '<em><b>Get Time Internal</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation FRAGMENT_INDEX_POINT_IN_TIME___GET_TIME_INTERNAL = eINSTANCE.getFragmentIndexPointInTime__GetTimeInternal();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionContainerImpl <em>SI Execution Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIExecutionContainerImpl
         * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediatePackageImpl#getSIExecutionContainer()
         * @generated
         */
        EClass SI_EXECUTION_CONTAINER = eINSTANCE.getSIExecutionContainer();

        /**
         * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SI_EXECUTION_CONTAINER__EXECUTIONS = eINSTANCE.getSIExecutionContainer_Executions();

    }

} //SequenceIntermediatePackage
