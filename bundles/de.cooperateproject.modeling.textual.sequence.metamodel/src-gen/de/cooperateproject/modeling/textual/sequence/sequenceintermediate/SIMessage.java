/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import de.cooperateproject.modeling.textual.sequence.sequence.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getCausesExecution <em>Causes Execution</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIMessage()
 * @model
 * @generated
 */
public interface SIMessage extends SITimedElement, SIElementWithTextualReference<Message> {
    /**
     * Returns the value of the '<em><b>Origin</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getMessages <em>Messages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Origin</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin</em>' container reference.
     * @see #setOrigin(SIExecution)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIMessage_Origin()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getMessages
     * @model opposite="messages" transient="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIMessage!origin'"
     * @generated
     */
    SIExecution getOrigin();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getOrigin <em>Origin</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin</em>' container reference.
     * @see #getOrigin()
     * @generated
     */
    void setOrigin(SIExecution value);

    /**
     * Returns the value of the '<em><b>Causes Execution</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getExecutionCause <em>Execution Cause</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Causes Execution</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Causes Execution</em>' reference.
     * @see #setCausesExecution(SIExecution)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIMessage_CausesExecution()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getExecutionCause
     * @model opposite="executionCause"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIMessage!causesExecution'"
     * @generated
     */
    SIExecution getCausesExecution();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getCausesExecution <em>Causes Execution</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Causes Execution</em>' reference.
     * @see #getCausesExecution()
     * @generated
     */
    void setCausesExecution(SIExecution value);

} // SIMessage
