/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.util;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage
 * @generated
 */
public class SequenceIntermediateValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final SequenceIntermediateValidator INSTANCE = new SequenceIntermediateValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "de.cooperateproject.modeling.textual.sequence.sequenceintermediate";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Container Must Reference The Same Lifeline As Contained Executions' of 'SI Execution'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SI_EXECUTION__CONTAINER_MUST_REFERENCE_THE_SAME_LIFELINE_AS_CONTAINED_EXECUTIONS = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceIntermediateValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return SequenceIntermediatePackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case SequenceIntermediatePackage.SI_DIAGRAM:
                return validateSIDiagram((SIDiagram)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_LIFELINE:
                return validateSILifeline((SILifeline)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_EXECUTION:
                return validateSIExecution((SIExecution)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_REGION:
                return validateSIRegion((SIRegion)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_MESSAGE:
                return validateSIMessage((SIMessage)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE:
                return validateSIElementWithTextualReference((SIElementWithTextualReference<?>)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT:
                return validateSITimedElement((SITimedElement)value, diagnostics, context);
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME:
                return validateStartDeterminesPointIntTime((StartDeterminesPointIntTime)value, diagnostics, context);
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME:
                return validateFinishDeterminesPointInTime((FinishDeterminesPointInTime)value, diagnostics, context);
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME:
                return validateMinimumPointInTime((MinimumPointInTime)value, diagnostics, context);
            case SequenceIntermediatePackage.MAXIMUM_POINT_IN_TIME:
                return validateMaximumPointInTime((MaximumPointInTime)value, diagnostics, context);
            case SequenceIntermediatePackage.POINT_IN_TIME:
                return validatePointInTime((PointInTime)value, diagnostics, context);
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME:
                return validateFragmentIndexPointInTime((FragmentIndexPointInTime)value, diagnostics, context);
            case SequenceIntermediatePackage.SI_EXECUTION_CONTAINER:
                return validateSIExecutionContainer((SIExecutionContainer)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIDiagram(SIDiagram siDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siDiagram, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSILifeline(SILifeline siLifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siLifeline, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIExecution(SIExecution siExecution, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(siExecution, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siExecution, diagnostics, context);
        if (result || diagnostics != null) result &= validateSIExecution_containerMustReferenceTheSameLifelineAsContainedExecutions(siExecution, diagnostics, context);
        return result;
    }

    /**
     * Validates the containerMustReferenceTheSameLifelineAsContainedExecutions constraint of '<em>SI Execution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIExecution_containerMustReferenceTheSameLifelineAsContainedExecutions(SIExecution siExecution, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return siExecution.containerMustReferenceTheSameLifelineAsContainedExecutions(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIRegion(SIRegion siRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siRegion, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIMessage(SIMessage siMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siMessage, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIElementWithTextualReference(SIElementWithTextualReference<?> siElementWithTextualReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siElementWithTextualReference, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSITimedElement(SITimedElement siTimedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siTimedElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStartDeterminesPointIntTime(StartDeterminesPointIntTime startDeterminesPointIntTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(startDeterminesPointIntTime, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFinishDeterminesPointInTime(FinishDeterminesPointInTime finishDeterminesPointInTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(finishDeterminesPointInTime, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMinimumPointInTime(MinimumPointInTime minimumPointInTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(minimumPointInTime, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMaximumPointInTime(MaximumPointInTime maximumPointInTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(maximumPointInTime, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePointInTime(PointInTime pointInTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pointInTime, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFragmentIndexPointInTime(FragmentIndexPointInTime fragmentIndexPointInTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(fragmentIndexPointInTime, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSIExecutionContainer(SIExecutionContainer siExecutionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(siExecutionContainer, diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //SequenceIntermediateValidator
