/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getSyncReply <em>Sync Reply</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getCallstack <em>Callstack</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getExecutionCause <em>Execution Cause</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containerMustReferenceTheSameLifelineAsContainedExecutions'"
 * @generated
 */
public interface SIExecution extends SITimedElement, SIExecutionContainer {
    /**
     * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getOrigin <em>Origin</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Messages</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution_Messages()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getOrigin
     * @model opposite="origin" containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecution!messages'"
     * @generated
     */
    EList<SIMessage> getMessages();

    /**
     * Returns the value of the '<em><b>Sync Reply</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sync Reply</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sync Reply</em>' reference.
     * @see #setSyncReply(SIMessage)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution_SyncReply()
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecution!syncReply'"
     * @generated
     */
    SIMessage getSyncReply();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getSyncReply <em>Sync Reply</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sync Reply</em>' reference.
     * @see #getSyncReply()
     * @generated
     */
    void setSyncReply(SIMessage value);

    /**
     * Returns the value of the '<em><b>Callstack</b></em>' reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Callstack</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Callstack</em>' reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution_Callstack()
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecution!callstack'"
     * @generated
     */
    EList<SIExecution> getCallstack();

    /**
     * Returns the value of the '<em><b>Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer#getExecutions <em>Executions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' container reference.
     * @see #setContainer(SIExecutionContainer)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution_Container()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecutionContainer#getExecutions
     * @model opposite="executions" transient="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecution!container'"
     * @generated
     */
    SIExecutionContainer getContainer();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getContainer <em>Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' container reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(SIExecutionContainer value);

    /**
     * Returns the value of the '<em><b>Lifeline</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifeline</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifeline</em>' reference.
     * @see #setLifeline(SILifeline)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution_Lifeline()
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecution!lifeline'"
     * @generated
     */
    SILifeline getLifeline();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getLifeline <em>Lifeline</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifeline</em>' reference.
     * @see #getLifeline()
     * @generated
     */
    void setLifeline(SILifeline value);

    /**
     * Returns the value of the '<em><b>Execution Cause</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getCausesExecution <em>Causes Execution</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Cause</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Cause</em>' reference.
     * @see #setExecutionCause(SIMessage)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIExecution_ExecutionCause()
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIMessage#getCausesExecution
     * @model opposite="causesExecution"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIExecution!executionCause'"
     * @generated
     */
    SIMessage getExecutionCause();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution#getExecutionCause <em>Execution Cause</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Cause</em>' reference.
     * @see #getExecutionCause()
     * @generated
     */
    void setExecutionCause(SIMessage value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv containerMustReferenceTheSameLifelineAsContainedExecutions:\n *   let\n *     severity : Integer[1] = \'SIExecution::containerMustReferenceTheSameLifelineAsContainedExecutions\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Types::Boolean[?] = self.executions-&gt;forAll(ex | ex.lifeline = self.lifeline)\n *       in\n *         \'SIExecution::containerMustReferenceTheSameLifelineAsContainedExecutions\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.STR_SIExecution_c_c_containerMustReferenceTheSameLifelineAsContainedExe);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution%&gt;&gt; executions = this.getExecutions();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_executions = idResolver.createOrderedSetOfAll(&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.ORD_CLSSid_SIExecution, executions);\n\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_ex = BOXED_executions.iterator();\n\t/*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; result;\n\twhile (true) {\n\t\tif (!ITERATOR_ex.hasNext()) {\n\t\t\tif (accumulator == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)accumulator;\n\t\t\t}\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution%&gt; ex = (&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution%&gt;)ITERATOR_ex.next();\n\t\t/**\n\t\t * ex.lifeline = self.lifeline\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline%&gt; lifeline = ex.getLifeline();\n\t\tfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline%&gt; lifeline_0 = this.getLifeline();\n\t\tfinal /*@NonInvalid\052/ boolean eq = lifeline.equals(lifeline_0);\n\t\t//\n\t\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t}\n\t\telse if (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t}\n\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\taccumulator = new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(&lt;%org.eclipse.ocl.pivot.messages.PivotMessages%&gt;.NonBooleanBody, \"forAll\");\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.STR_SIExecution_c_c_containerMustReferenceTheSameLifelineAsContainedExe, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
     * @generated
     */
    boolean containerMustReferenceTheSameLifelineAsContainedExecutions(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SIExecution
