package de.cooperateproject.modeling.transformation.tests.commons;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.m2m.internal.qvt.oml.trace.EDirectionKind;
import org.eclipse.m2m.internal.qvt.oml.trace.EMappingResults;
import org.eclipse.m2m.internal.qvt.oml.trace.EValue;
import org.eclipse.m2m.internal.qvt.oml.trace.TracePackage;
import org.eclipse.m2m.internal.qvt.oml.trace.TraceRecord;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import de.cooperateproject.modeling.transformation.common.impl.DomainIndependentTransformationBase;

/**
 * 
 * Note on suppressed warning: We work with the QVT-O internal trace model. We
 * are aware of the fact that it is internal. By suppressing the warning, we
 * ensure that we do not oversee other important ones.
 */
@SuppressWarnings("restriction")
public class TraceRecordTransformationTestBase extends PlainTransformationTestBase {

    private static class TraceRecordComparator implements Comparator<TraceRecord> {

        @Override
        public int compare(TraceRecord o1, TraceRecord o2) {
            int mappingOperationName = o1.getMappingOperation().getName().compareTo(o2.getMappingOperation().getName());
            if (mappingOperationName != 0) {
                return mappingOperationName;
            }

            String selfType1 = o1.getContext().getContext().getType();
            String selfType2 = o2.getContext().getContext().getType();
            int selfType = selfType1.compareTo(selfType2);
            if (selfType != 0) {
                return selfType;
            }

            String resultType1 = o1.getResult().getResult().get(0).getType();
            String resultType2 = o2.getResult().getResult().get(0).getType();
            int resultType = resultType1.compareTo(resultType2);
            if (resultType != 0) {
                return resultType;
            }

            Object self1 = o1.getContext().getContext().getValue().getModelElement();
            Object self2 = o2.getContext().getContext().getValue().getModelElement();
            int self = (self2 == null ? 0 : self2.hashCode()) - (self1 == null ? 0 : self1.hashCode());
            if (self != 0) {
                return self;
            }

            EObject result1 = o1.getResult().getResult().get(0).getValue().getModelElement();
            EObject result2 = o2.getResult().getResult().get(0).getValue().getModelElement();
            int result = (result2 == null ? 0 : result2.hashCode()) - (result1 == null ? 0 : result1.hashCode());
            if (result != 0) {
                return result;
            }

            // most probably equal
            return 0;
        }

    }

    @Override
    protected void runTransformation(URI transformationURI, Iterable<ModelExtent> transformationParameters,
            Trace traceModel) {
        super.runTransformation(transformationURI, transformationParameters, traceModel);
        repairTransformationTrace(traceModel);
    }

    protected void repairTransformationTrace(ModelExtent expectedModel, ModelExtent actualModel, Trace trace) {
        Comparison comparisonResult = modelComparator.compare(expectedModel.getContents().get(0),
                actualModel.getContents().get(0));
        ImmutableList<EObject> allContents = ImmutableList.copyOf(trace.getTraceContent().get(0).eAllContents());
        allContents.stream().filter(o -> o instanceof EValue).map(o -> (EValue) o)
                .forEach(o -> replaceModelElementWithMatchingOne(o, comparisonResult));
    }

    private static void repairTransformationTrace(Trace trace) {
        ImmutableList<EObject> allContents = ImmutableList.copyOf(trace.getTraceContent().get(0).eAllContents());
        allContents.stream().filter(EMappingResults.class::isInstance).map(EMappingResults.class::cast)
                .forEach(TraceRecordTransformationTestBase::repairResultDirection);
    }

    /**
     * Fixes the direction of result parameters in traces.
     * 
     * @param results
     *            The object to be fixed.
     * @see DomainIndependentTransformationBase#repairTraceObject
     */
    private static void repairResultDirection(EMappingResults results) {
        results.getResult().forEach(p -> p.setKind(EDirectionKind.INOUT));
    }

    protected void assertTraceEquals(Trace t2gTraceModel, ModelExtent actualTraceModel) throws IOException {
        assertEquals(1, t2gTraceModel.getTraceContent().size());
        EObject expectedTrace = t2gTraceModel.getTraceContent().get(0);
        assertEquals(1, actualTraceModel.getContents().size());
        EObject actualTrace = actualTraceModel.getContents().get(0);

        sortTraceRecords(expectedTrace);
        sortTraceRecords(actualTrace);

        debugSerialize(Arrays.asList(expectedTrace), actualTraceModel.getContents());

        DefaultComparisonScope scope = new DefaultComparisonScope(expectedTrace, actualTrace, null);
        DefaultDiffEngine de = new DefaultDiffEngine() {

            @Override
            protected FeatureFilter createFeatureFilter() {
                return new FeatureFilter() {
                    private final Collection<EClass> ignoredEClasses = Sets.newHashSet(
                            TracePackage.eINSTANCE.getMappingOperationToTraceRecordMapEntry(),
                            TracePackage.eINSTANCE.getObjectToTraceRecordMapEntry());

                    @Override
                    protected boolean isIgnoredReference(Match match, EReference reference) {
                        if (ignoredEClasses.contains(reference.getEContainingClass())) {
                            return true;
                        }
                        return super.isIgnoredReference(match, reference);
                    }
                };
            }
        };

        Comparison comparison = EMFCompare.builder().setDiffEngine(de).build().compare(scope);
        assertEquals(prettyPrint(comparison), 0, comparison.getDifferences().size());
    }

    private static void replaceModelElementWithMatchingOne(EValue value, Comparison comparison) {
        EObject originalModelElement = value.getModelElement();
        Match valueMatch = comparison.getMatch(originalModelElement);
        if (valueMatch == null) {
            return;
        }
        EObject newModelElement = valueMatch.getLeft() == originalModelElement ? valueMatch.getRight()
                : valueMatch.getLeft();
        value.setModelElement(newModelElement);
    }

    private static void sortTraceRecords(EObject trace) {
        if (!(trace instanceof org.eclipse.m2m.internal.qvt.oml.trace.Trace)) {
            throw new IllegalArgumentException();
        }
        ECollections.sort(((org.eclipse.m2m.internal.qvt.oml.trace.Trace) trace).getTraceRecords(),
                new TraceRecordComparator());
    }

}
