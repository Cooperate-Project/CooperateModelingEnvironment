/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIRegion()
 * @model
 * @generated
 */
public interface SIRegion extends SIElementWithTextualReference<OrderedFragmentContainer>, SITimedElement, SIExecutionContainer {
    /**
     * Returns the value of the '<em><b>Diagram</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' container reference.
     * @see #setDiagram(SIDiagram)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIRegion_Diagram()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram#getRegions
     * @model opposite="regions" transient="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIRegion!diagram'"
     * @generated
     */
    SIDiagram getDiagram();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIRegion#getDiagram <em>Diagram</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' container reference.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(SIDiagram value);

} // SIRegion
