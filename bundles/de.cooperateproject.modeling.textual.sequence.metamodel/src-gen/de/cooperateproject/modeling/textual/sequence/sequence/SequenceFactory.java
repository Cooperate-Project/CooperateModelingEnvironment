/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
 * @generated
 */
public interface SequenceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SequenceFactory eINSTANCE = de.cooperateproject.modeling.textual.sequence.sequence.impl.SequenceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    SequenceDiagram createSequenceDiagram();

    /**
     * Returns a new object of class '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Root Package</em>'.
     * @generated
     */
    RootPackage createRootPackage();

    /**
     * Returns a new object of class '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor</em>'.
     * @generated
     */
    Actor createActor();

    /**
     * Returns a new object of class '<em>Actor Classifier Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor Classifier Mapping</em>'.
     * @generated
     */
    ActorClassifierMapping createActorClassifierMapping();

    /**
     * Returns a new object of class '<em>Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fragment</em>'.
     * @generated
     */
    Fragment createFragment();

    /**
     * Returns a new object of class '<em>Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message</em>'.
     * @generated
     */
    Message createMessage();

    /**
     * Returns a new object of class '<em>Standard Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Standard Message</em>'.
     * @generated
     */
    StandardMessage createStandardMessage();

    /**
     * Returns a new object of class '<em>Response Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Response Message</em>'.
     * @generated
     */
    ResponseMessage createResponseMessage();

    /**
     * Returns a new object of class '<em>Create Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Create Message</em>'.
     * @generated
     */
    CreateMessage createCreateMessage();

    /**
     * Returns a new object of class '<em>Destruction Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destruction Message</em>'.
     * @generated
     */
    DestructionMessage createDestructionMessage();

    /**
     * Returns a new object of class '<em>Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Occurence Specification</em>'.
     * @generated
     */
    <UMLOccurenceType extends OccurrenceSpecification> OccurenceSpecification<UMLOccurenceType> createOccurenceSpecification();

    /**
     * Returns a new object of class '<em>Destruction Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destruction Occurence Specification</em>'.
     * @generated
     */
    DestructionOccurenceSpecification createDestructionOccurenceSpecification();

    /**
     * Returns a new object of class '<em>Ordered Fragment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ordered Fragment Container</em>'.
     * @generated
     */
    OrderedFragmentContainer createOrderedFragmentContainer();

    /**
     * Returns a new object of class '<em>Alternative</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alternative</em>'.
     * @generated
     */
    Alternative createAlternative();

    /**
     * Returns a new object of class '<em>Option</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Option</em>'.
     * @generated
     */
    Option createOption();

    /**
     * Returns a new object of class '<em>Co Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Co Region</em>'.
     * @generated
     */
    CoRegion createCoRegion();

    /**
     * Returns a new object of class '<em>Parallel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parallel</em>'.
     * @generated
     */
    Parallel createParallel();

    /**
     * Returns a new object of class '<em>Critical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Critical</em>'.
     * @generated
     */
    Critical createCritical();

    /**
     * Returns a new object of class '<em>Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loop</em>'.
     * @generated
     */
    Loop createLoop();

    /**
     * Returns a new object of class '<em>Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Condition</em>'.
     * @generated
     */
    Condition createCondition();

    /**
     * Returns a new object of class '<em>Time Observation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Observation</em>'.
     * @generated
     */
    TimeObservation createTimeObservation();

    /**
     * Returns a new object of class '<em>Duration Observation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration Observation</em>'.
     * @generated
     */
    DurationObservation createDurationObservation();

    /**
     * Returns a new object of class '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constraint</em>'.
     * @generated
     */
    Constraint createConstraint();

    /**
     * Returns a new object of class '<em>Time Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Constraint</em>'.
     * @generated
     */
    TimeConstraint createTimeConstraint();

    /**
     * Returns a new object of class '<em>Duration Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration Constraint</em>'.
     * @generated
     */
    DurationConstraint createDurationConstraint();

    /**
     * Returns a new object of class '<em>Explicit Arrival Occurence Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Explicit Arrival Occurence Reference</em>'.
     * @generated
     */
    ExplicitArrivalOccurenceReference createExplicitArrivalOccurenceReference();

    /**
     * Returns a new object of class '<em>Implicit Message Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implicit Message Occurence Specification</em>'.
     * @generated
     */
    ImplicitMessageOccurenceSpecification createImplicitMessageOccurenceSpecification();

    /**
     * Returns a new object of class '<em>Explicit Arrival Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Explicit Arrival Occurence Specification</em>'.
     * @generated
     */
    ExplicitArrivalOccurenceSpecification createExplicitArrivalOccurenceSpecification();

    /**
     * Returns a new object of class '<em>Point In Time Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Point In Time Selector</em>'.
     * @generated
     */
    PointInTimeSelector createPointInTimeSelector();

    /**
     * Returns a new object of class '<em>Time Interval Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Interval Selector</em>'.
     * @generated
     */
    TimeIntervalSelector createTimeIntervalSelector();

    /**
     * Returns a new object of class '<em>Bi Point In Time Time Interval Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bi Point In Time Time Interval Selector</em>'.
     * @generated
     */
    BiPointInTimeTimeIntervalSelector createBiPointInTimeTimeIntervalSelector();

    /**
     * Returns a new object of class '<em>Fragment Time Interval Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fragment Time Interval Selector</em>'.
     * @generated
     */
    FragmentTimeIntervalSelector createFragmentTimeIntervalSelector();

    /**
     * Returns a new object of class '<em>Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference</em>'.
     * @generated
     */
    Reference createReference();

    /**
     * Returns a new object of class '<em>Non Instantaneous Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Instantaneous Fragment</em>'.
     * @generated
     */
    <UMLType extends InteractionFragment> NonInstantaneousFragment<UMLType> createNonInstantaneousFragment();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SequencePackage getSequencePackage();

} //SequenceFactory
