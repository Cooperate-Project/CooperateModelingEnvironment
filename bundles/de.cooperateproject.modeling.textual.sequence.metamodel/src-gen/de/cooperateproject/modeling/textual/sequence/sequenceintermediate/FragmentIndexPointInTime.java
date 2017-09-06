/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import de.cooperateproject.modeling.textual.sequence.sequence.Fragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Index Point In Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime#getFragmentIndex <em>Fragment Index</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getFragmentIndexPointInTime()
 * @model
 * @generated
 */
public interface FragmentIndexPointInTime extends PointInTime, SIElementWithTextualReference<Fragment> {
    /**
     * Returns the value of the '<em><b>Fragment Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fragment Index</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fragment Index</em>' attribute.
     * @see #setFragmentIndex(int)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getFragmentIndexPointInTime_FragmentIndex()
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!FragmentIndexPointInTime!fragmentIndex'"
     * @generated
     */
    int getFragmentIndex();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.FragmentIndexPointInTime#getFragmentIndex <em>Fragment Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fragment Index</em>' attribute.
     * @see #getFragmentIndex()
     * @generated
     */
    void setFragmentIndex(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * self.fragmentIndex\n \052/\nfinal /*@NonInvalid\052/ int fragmentIndex = this.getFragmentIndex();\nreturn fragmentIndex;'"
     * @generated
     */
    int getTimeInternal();

} // FragmentIndexPointInTime
