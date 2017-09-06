/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point In Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getPointInTime()
 * @model
 * @generated
 */
public interface PointInTime extends EObject {
    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getPointInTime_Time()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * self.getTimeInternal()\n \052/\nfinal /*@NonInvalid\052/ int getTimeInternal = this.getTimeInternal();\nreturn getTimeInternal;'"
     * @generated
     */
    int getTime();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!PointInTime!getTimeInternal()'"
     * @generated
     */
    int getTimeInternal();

} // PointInTime
