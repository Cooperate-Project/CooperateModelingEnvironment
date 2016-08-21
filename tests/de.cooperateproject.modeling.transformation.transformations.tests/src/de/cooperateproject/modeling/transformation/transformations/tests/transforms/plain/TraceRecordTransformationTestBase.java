package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.internal.qvt.oml.trace.EValue;
import org.eclipse.m2m.internal.qvt.oml.trace.TracePackage;
import org.eclipse.m2m.internal.qvt.oml.trace.TraceRecord;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import de.cooperateproject.modeling.transformation.transformations.tests.util.ModelComparator;

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
			
			EObject self1 = o1.getContext().getContext().getValue().getModelElement();
			EObject self2 = o2.getContext().getContext().getValue().getModelElement();
			int self = self2.hashCode() - self1.hashCode();
			if (self != 0) {
				return self;
			}

			EObject result1 = o1.getResult().getResult().get(0).getValue().getModelElement();
			EObject result2 = o2.getResult().getResult().get(0).getValue().getModelElement();
			int result = result2.hashCode() - result1.hashCode();
			if (result != 0) {
				return result;
			}

			// most probably equal
			return 0;
		}

	}
	
	private static final File DEBUG_SERIALIZATION_DIR = new File("D:\\");

	protected static void repairTransformationTrace(ModelExtent expectedModel, ModelExtent actualModel, Trace trace) {
		Comparison comparisonResult = ModelComparator.compare(expectedModel.getContents().get(0),
				actualModel.getContents().get(0));
		ImmutableList.copyOf(trace.getTraceContent().get(0).eAllContents()).stream().filter(o -> o instanceof EValue)
				.map(o -> (EValue) o).forEach(o -> replaceModelElementWithMatchingOne(o, comparisonResult));
	}

	protected void assertTraceEquals(Trace t2gTraceModel, ModelExtent actualTraceModel) throws Exception {
		assertEquals(1, t2gTraceModel.getTraceContent().size());
		EObject expectedTrace = t2gTraceModel.getTraceContent().get(0);
		assertEquals(1, actualTraceModel.getContents().size());
		EObject actualTrace = actualTraceModel.getContents().get(0);

		sortTraceRecords(expectedTrace);
		sortTraceRecords(actualTrace);

		debugSerialization(expectedTrace, actualTraceModel.getContents());

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

	private void debugSerialization(EObject expectedTrace, Collection<EObject> actualTrace) throws IOException {
		debugSerialization(Arrays.asList(expectedTrace), actualTrace);
	}
	
	private void debugSerialization(Collection<EObject> expectedTrace, Collection<EObject> actualTrace) throws IOException {
		if (DEBUG_SERIALIZATION_DIR == null) {
			return;
		}
		
		URI expectedURI = URI.createFileURI(new File(DEBUG_SERIALIZATION_DIR, "expectedXMI.txt").getAbsolutePath());
		URI actualURI = URI.createFileURI(new File(DEBUG_SERIALIZATION_DIR, "actualXMI.txt").getAbsolutePath());

		Resource rExpected = createResource(getResourceSet(), expectedURI);
		rExpected.getContents().clear();
		rExpected.getContents().addAll(expectedTrace);
		rExpected.save(Collections.emptyMap());

		Resource rActual = createResource(getResourceSet(), actualURI);
		rActual.getContents().clear();
		rActual.getContents().addAll(actualTrace);
		rActual.save(Collections.emptyMap());
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
