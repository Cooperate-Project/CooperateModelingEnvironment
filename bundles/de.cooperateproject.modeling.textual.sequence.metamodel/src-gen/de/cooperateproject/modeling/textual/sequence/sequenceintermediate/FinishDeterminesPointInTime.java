/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finish Determines Point In Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime#getTimedElement <em>Timed Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getFinishDeterminesPointInTime()
 * @model
 * @generated
 */
public interface FinishDeterminesPointInTime extends PointInTime {
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
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getFinishDeterminesPointInTime_TimedElement()
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!FinishDeterminesPointInTime!timedElement'"
     * @generated
     */
    SITimedElement getTimedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FinishDeterminesPointInTime#getTimedElement <em>Timed Element</em>}' reference.
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
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * self.timedElement.finish.time\n \052/\nfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SITimedElement%&gt; timedElement = this.getTimedElement();\nfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt; finish = timedElement.getFinish();\nfinal /*@NonInvalid\052/ int time = finish.getTime();\nreturn time;'"
     * @generated
     */
    int getTimeInternal();

} // FinishDeterminesPointInTime
