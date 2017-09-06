/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Point In Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getMinimumPointInTime()
 * @model
 * @generated
 */
public interface MinimumPointInTime extends PointInTime {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getMinimumPointInTime_Elements()
     * @model required="true" ordered="false"
     *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!MinimumPointInTime!elements'"
     * @generated
     */
    EList<PointInTime> getElements();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * self.elements-&gt;sortedBy(time)-&gt;first().time\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.StandardLibrary%&gt; standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt;&gt; elements = this.getElements();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_elements = idResolver.createSetOfAll(&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.SET_CLSSid_PointInTime, elements);\nfinal &lt;%org.eclipse.ocl.pivot.Class%&gt; TYPE_sortedBy_0 = executor.getStaticTypeOf(BOXED_elements);\nfinal &lt;%org.eclipse.ocl.pivot.library.LibraryIteration%&gt;.LibraryIterationExtension IMPL_sortedBy_0 = (&lt;%org.eclipse.ocl.pivot.library.LibraryIteration%&gt;.LibraryIterationExtension)TYPE_sortedBy_0.lookupImplementation(standardLibrary, &lt;%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%&gt;.Operations._Set__sortedBy);\nfinal /*@NonNull\052/ Object ACC_sortedBy_0 = IMPL_sortedBy_0.createAccumulatorValue(executor, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.ORD_CLSSid_PointInTime, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.DATAid_EInt);\n/**\n * Implementation of the iterator body.\n \052/\nfinal /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%&gt; BODY_sortedBy_0 = new &lt;%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%&gt;()\n{\n\t/**\n\t * time\n\t \052/\n\t@Override\n\tpublic /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor, final /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt; typeId, final /*@Nullable\052/ Object BOXED_elements, final /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; _1) {\n\t\tfinal /*@NonInvalid\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt; symbol_0 = (&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt;)_1;\n\t\tif (symbol_0 == null) {\n\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate\\\'::PointInTime::time\\\'\");\n\t\t}\n\t\tfinal /*@Thrown\052/ int time = symbol_0.getTime();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_time = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(time);\n\t\treturn BOXED_time;\n\t}\n};\nfinal /*@NonNull\052/  &lt;%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%&gt; MGR_sortedBy_0 = new &lt;%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%&gt;(executor, &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables%&gt;.ORD_CLSSid_PointInTime, BODY_sortedBy_0, BOXED_elements, ACC_sortedBy_0);\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; sortedBy = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt;)IMPL_sortedBy_0.evaluateIteration(MGR_sortedBy_0));\nfinal /*@Thrown\052/ &lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt; first = (&lt;%de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime%&gt;)&lt;%org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation%&gt;.INSTANCE.evaluate(sortedBy);\nif (first == null) {\n\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate\\\'::PointInTime::time\\\'\");\n}\nfinal /*@Thrown\052/ int time_0 = first.getTime();\nreturn time_0;'"
     * @generated
     */
    int getTimeInternal();

} // MinimumPointInTime
