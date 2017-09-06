/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Determines Point Int Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime#getTimedElement <em>Timed Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getStartDeterminesPointIntTime()
 * @model
 * @generated
 */
public interface StartDeterminesPointIntTime extends PointInTime {
    /**
     * Returns the value of the '<em><b>Timed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timed Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timed Element</em>' reference.
     * @see #setTimedElement(SITimedElement)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getStartDeterminesPointIntTime_TimedElement()
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!StartDeterminesPointIntTime!timedElement'"
     * @generated
     */
    SITimedElement getTimedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.StartDeterminesPointIntTime#getTimedElement <em>Timed Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timed Element</em>' reference.
     * @see #getTimedElement()
     * @generated
     */
    void setTimedElement(SITimedElement value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * self.timedElement.start.time\n \052/\nfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement%&gt; timedElement = this.getTimedElement();\nfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt; start = timedElement.getStart();\nfinal /*@NonInvalid\052/ int time = start.getTime();\nreturn time;'"
     * @generated
     */
    int getTimeInternal();

} // StartDeterminesPointIntTime
