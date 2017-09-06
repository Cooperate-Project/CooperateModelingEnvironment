/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage
 * @generated
 */
public interface SequenceIntermediateFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SequenceIntermediateFactory eINSTANCE = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SequenceIntermediateFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SI Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Diagram</em>'.
     * @generated
     */
    SIDiagram createSIDiagram();

    /**
     * Returns a new object of class '<em>SI Lifeline</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Lifeline</em>'.
     * @generated
     */
    SILifeline createSILifeline();

    /**
     * Returns a new object of class '<em>SI Execution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Execution</em>'.
     * @generated
     */
    SIExecution createSIExecution();

    /**
     * Returns a new object of class '<em>SI Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Region</em>'.
     * @generated
     */
    SIRegion createSIRegion();

    /**
     * Returns a new object of class '<em>SI Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Message</em>'.
     * @generated
     */
    SIMessage createSIMessage();

    /**
     * Returns a new object of class '<em>SI Element With Textual Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Element With Textual Reference</em>'.
     * @generated
     */
    <ElementType> SIElementWithTextualReference<ElementType> createSIElementWithTextualReference();

    /**
     * Returns a new object of class '<em>SI Timed Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SI Timed Element</em>'.
     * @generated
     */
    SITimedElement createSITimedElement();

    /**
     * Returns a new object of class '<em>Start Determines Point Int Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Determines Point Int Time</em>'.
     * @generated
     */
    StartDeterminesPointIntTime createStartDeterminesPointIntTime();

    /**
     * Returns a new object of class '<em>Finish Determines Point In Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Finish Determines Point In Time</em>'.
     * @generated
     */
    FinishDeterminesPointInTime createFinishDeterminesPointInTime();

    /**
     * Returns a new object of class '<em>Minimum Point In Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Minimum Point In Time</em>'.
     * @generated
     */
    MinimumPointInTime createMinimumPointInTime();

    /**
     * Returns a new object of class '<em>Maximum Point In Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maximum Point In Time</em>'.
     * @generated
     */
    MaximumPointInTime createMaximumPointInTime();

    /**
     * Returns a new object of class '<em>Point In Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Point In Time</em>'.
     * @generated
     */
    PointInTime createPointInTime();

    /**
     * Returns a new object of class '<em>Fragment Index Point In Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fragment Index Point In Time</em>'.
     * @generated
     */
    FragmentIndexPointInTime createFragmentIndexPointInTime();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SequenceIntermediatePackage getSequenceIntermediatePackage();

} //SequenceIntermediateFactory
