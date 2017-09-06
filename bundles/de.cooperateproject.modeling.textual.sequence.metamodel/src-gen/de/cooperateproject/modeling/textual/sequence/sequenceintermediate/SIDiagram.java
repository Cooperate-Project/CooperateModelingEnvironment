/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIDiagram()
 * @model
 * @generated
 */
public interface SIDiagram extends SIElementWithTextualReference<SequenceDiagram>, SIExecutionContainer {
    /**
     * Returns the value of the '<em><b>Lifelines</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifelines</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifelines</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIDiagram_Lifelines()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline#getDiagram
     * @model opposite="diagram" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIDiagram!lifelines'"
     * @generated
     */
    EList<SILifeline> getLifelines();

    /**
     * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regions</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIDiagram_Regions()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion#getDiagram
     * @model opposite="diagram" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIDiagram!regions'"
     * @generated
     */
    EList<SIRegion> getRegions();

} // SIDiagram
