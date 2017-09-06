/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.util;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage
 * @generated
 */
public class SequenceIntermediateSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SequenceIntermediatePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceIntermediateSwitch() {
        if (modelPackage == null) {
            modelPackage = SequenceIntermediatePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SequenceIntermediatePackage.SI_DIAGRAM: {
                SIDiagram siDiagram = (SIDiagram)theEObject;
                T result = caseSIDiagram(siDiagram);
                if (result == null) result = caseSIElementWithTextualReference(siDiagram);
                if (result == null) result = caseSIExecutionContainer(siDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_LIFELINE: {
                SILifeline siLifeline = (SILifeline)theEObject;
                T result = caseSILifeline(siLifeline);
                if (result == null) result = caseSIElementWithTextualReference(siLifeline);
                if (result == null) result = caseSITimedElement(siLifeline);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_EXECUTION: {
                SIExecution siExecution = (SIExecution)theEObject;
                T result = caseSIExecution(siExecution);
                if (result == null) result = caseSITimedElement(siExecution);
                if (result == null) result = caseSIExecutionContainer(siExecution);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_REGION: {
                SIRegion siRegion = (SIRegion)theEObject;
                T result = caseSIRegion(siRegion);
                if (result == null) result = caseSIElementWithTextualReference(siRegion);
                if (result == null) result = caseSITimedElement(siRegion);
                if (result == null) result = caseSIExecutionContainer(siRegion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_MESSAGE: {
                SIMessage siMessage = (SIMessage)theEObject;
                T result = caseSIMessage(siMessage);
                if (result == null) result = caseSITimedElement(siMessage);
                if (result == null) result = caseSIElementWithTextualReference(siMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE: {
                SIElementWithTextualReference<?> siElementWithTextualReference = (SIElementWithTextualReference<?>)theEObject;
                T result = caseSIElementWithTextualReference(siElementWithTextualReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_TIMED_ELEMENT: {
                SITimedElement siTimedElement = (SITimedElement)theEObject;
                T result = caseSITimedElement(siTimedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.START_DETERMINES_POINT_INT_TIME: {
                StartDeterminesPointIntTime startDeterminesPointIntTime = (StartDeterminesPointIntTime)theEObject;
                T result = caseStartDeterminesPointIntTime(startDeterminesPointIntTime);
                if (result == null) result = casePointInTime(startDeterminesPointIntTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.FINISH_DETERMINES_POINT_IN_TIME: {
                FinishDeterminesPointInTime finishDeterminesPointInTime = (FinishDeterminesPointInTime)theEObject;
                T result = caseFinishDeterminesPointInTime(finishDeterminesPointInTime);
                if (result == null) result = casePointInTime(finishDeterminesPointInTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME: {
                MinimumPointInTime minimumPointInTime = (MinimumPointInTime)theEObject;
                T result = caseMinimumPointInTime(minimumPointInTime);
                if (result == null) result = casePointInTime(minimumPointInTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.MAXIMUM_POINT_IN_TIME: {
                MaximumPointInTime maximumPointInTime = (MaximumPointInTime)theEObject;
                T result = caseMaximumPointInTime(maximumPointInTime);
                if (result == null) result = casePointInTime(maximumPointInTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.POINT_IN_TIME: {
                PointInTime pointInTime = (PointInTime)theEObject;
                T result = casePointInTime(pointInTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.FRAGMENT_INDEX_POINT_IN_TIME: {
                FragmentIndexPointInTime fragmentIndexPointInTime = (FragmentIndexPointInTime)theEObject;
                T result = caseFragmentIndexPointInTime(fragmentIndexPointInTime);
                if (result == null) result = casePointInTime(fragmentIndexPointInTime);
                if (result == null) result = caseSIElementWithTextualReference(fragmentIndexPointInTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequenceIntermediatePackage.SI_EXECUTION_CONTAINER: {
                SIExecutionContainer siExecutionContainer = (SIExecutionContainer)theEObject;
                T result = caseSIExecutionContainer(siExecutionContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSIDiagram(SIDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Lifeline</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Lifeline</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSILifeline(SILifeline object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Execution</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Execution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSIExecution(SIExecution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSIRegion(SIRegion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSIMessage(SIMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Element With Textual Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Element With Textual Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <ElementType> T caseSIElementWithTextualReference(SIElementWithTextualReference<ElementType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Timed Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Timed Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSITimedElement(SITimedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Start Determines Point Int Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Start Determines Point Int Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartDeterminesPointIntTime(StartDeterminesPointIntTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Finish Determines Point In Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Finish Determines Point In Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFinishDeterminesPointInTime(FinishDeterminesPointInTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Minimum Point In Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Minimum Point In Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinimumPointInTime(MinimumPointInTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Maximum Point In Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Maximum Point In Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaximumPointInTime(MaximumPointInTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Point In Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Point In Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePointInTime(PointInTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fragment Index Point In Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fragment Index Point In Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFragmentIndexPointInTime(FragmentIndexPointInTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SI Execution Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SI Execution Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSIExecutionContainer(SIExecutionContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SequenceIntermediateSwitch
