/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import de.cooperateproject.modeling.textual.sequence.sequence.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSILifeline()
 * @model
 * @generated
 */
public interface SILifeline extends SIElementWithTextualReference<Actor>, SITimedElement {
    /**
     * Returns the value of the '<em><b>Diagram</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getLifelines <em>Lifelines</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' container reference.
     * @see #setDiagram(SIDiagram)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSILifeline_Diagram()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getLifelines
     * @model opposite="lifelines" transient="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SILifeline!diagram'"
     * @generated
     */
    SIDiagram getDiagram();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline#getDiagram <em>Diagram</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' container reference.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(SIDiagram value);

} // SILifeline
