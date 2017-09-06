/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Execution Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer#getExecutions <em>Executions</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecutionContainer()
 * @model abstract="true"
 * @generated
 */
public interface SIExecutionContainer extends EObject {
    /**
     * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Executions</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecutionContainer_Executions()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getContainer
     * @model opposite="container" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecutionContainer!executions'"
     * @generated
     */
    EList<SIExecution> getExecutions();

} // SIExecutionContainer
