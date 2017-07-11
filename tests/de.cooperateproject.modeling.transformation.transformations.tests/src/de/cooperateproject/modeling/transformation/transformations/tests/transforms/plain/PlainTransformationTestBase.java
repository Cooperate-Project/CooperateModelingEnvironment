package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.util.CompareSwitch;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Before;

import de.cooperateproject.modeling.transformation.transformations.tests.util.ModelComparator;
import de.cooperateproject.modeling.transformation.transformations.tests.util.ModelComparisonFactory;
import de.cooperateproject.modeling.transformation.transformations.tests.util.ModelComparisonFactoryImpl;

public abstract class PlainTransformationTestBase extends TransformationTestBase {

    private static final URI UML_PRIMITIVE_TYPES = URI
            .createURI("pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");

    protected ModelComparator modelComparator;

    @Before
    public void setupModelComparator() {
        this.modelComparator = new ModelComparator(getModelComparisonFactory());
    }

    protected ModelComparisonFactory getModelComparisonFactory() {
        return new ModelComparisonFactoryImpl();
    }

    protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI)
            throws IOException {
        return runTransformation(transformationURI, sourceModelURI, umlModelURI, new BasicModelExtent(),
                new Trace(Collections.emptyList()));
    }

    protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI,
            Trace traceModel) throws IOException {
        return runTransformation(transformationURI, sourceModelURI, umlModelURI, new BasicModelExtent(), traceModel);
    }

    protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI,
            ModelExtent destination, Trace traceModel) throws IOException {
        ModelExtent source = createModelExtent(createResource(getResourceSet(), sourceModelURI));
        ModelExtent uml = createModelExtent(createResource(getResourceSet(), umlModelURI));
        return runTransformation(transformationURI, source, uml, destination, traceModel);
    }

    protected ModelExtent runTransformation(URI transformationURI, ModelExtent sourceModel, ModelExtent umlModel,
            ModelExtent destination, Trace traceModel) throws IOException {
        ModelExtent umlPrimitives = createModelExtent(createResource(getResourceSet(), UML_PRIMITIVE_TYPES));
        Collection<ModelExtent> transformationParameters = Arrays.asList(sourceModel, destination, umlModel,
                umlPrimitives);

        runTransformation(transformationURI, transformationParameters, traceModel);

        URI virtualResultModelURI = umlModel.getContents().get(0).eResource().getURI().trimFileExtension()
                .trimFragment().trimQuery().trimSegments(1).appendSegment("resultModel").appendFileExtension("xmi");
        Resource resultResource = createResource(getResourceSet(), virtualResultModelURI);
        resultResource.getContents().addAll(destination.getContents());

        return destination;
    }

    protected EObject getRootElement(URI modelUri) throws IOException {
        Resource r = createResource(getResourceSet(), modelUri);
        return r.getContents().get(0);
    }

    protected void assertModelEquals(EObject expected, EObject actual) throws UnsupportedEncodingException {
        assertModelEquals(expected, actual, (c -> Collections.emptyList()));
    }

    protected void assertModelEqualsStrict(EObject expected, EObject actual) throws UnsupportedEncodingException {
        Comparison result = modelComparator.compareStrict(expected, actual);
        assertComparison(result);
    }

    protected void assertModelEquals(EObject expected, EObject actual,
            Function<Collection<Diff>, Collection<Diff>> diffProcessor) throws UnsupportedEncodingException {
        Comparison result = modelComparator.compare(expected, actual);
        Collection<Diff> ignoredDiffs = diffProcessor.apply(result.getDifferences());
        ignoredDiffs.stream().forEach(PlainTransformationTestBase::removeDifference);
        assertComparison(result);
    }

    private static void assertComparison(Comparison comparisionResult) throws UnsupportedEncodingException {
        assertTrue(prettyPrint(comparisionResult), comparisionResult.getDifferences().isEmpty());
    }

    // Utility methods

    public static URI createTemporaryModelURI() throws IOException {
        File tmpFile = File.createTempFile(PlainTransformationTestBase.class.getSimpleName(), ".xmi");
        tmpFile.deleteOnExit();
        return URI.createFileURI(tmpFile.getAbsolutePath());
    }

    public static boolean isPluginEnvironment() {
        return ResourcesPlugin.getPlugin() != null;
    }

    protected static String prettyPrint(Comparison comparison) throws UnsupportedEncodingException {
        String customPrettyPrint = comparison.getDifferences().stream()
                .map(PlainTransformationTestBase::prettyPrintCustom).filter(Objects::nonNull)
                .collect(Collectors.joining(String.format("%n")));
        ByteArrayOutputStream baos = null;
        PrintStream ps = null;
        try {
            baos = new ByteArrayOutputStream();
            ps = new PrintStream(baos);
            EMFComparePrettyPrinter.printDifferences(comparison, ps);
            return customPrettyPrint + String.format("%n%n") + new String(baos.toByteArray(), "UTF-8");
        } finally {
            IOUtils.closeQuietly(ps);
            IOUtils.closeQuietly(baos);
        }
    }

    private static String prettyPrintCustom(Diff diff) {
        CompareSwitch<String> printer = new CompareSwitch<String>() {

            @Override
            public String caseReferenceChange(ReferenceChange object) {
                EObject actual = object.getMatch().getRight();
                EObject expected = object.getMatch().getLeft();
                EReference reference = object.getReference();

                if (actual != null && expected != null) {
                    EObject parent = actual;
                    String referenceName = String.format("%s::%s", reference.getEContainingClass().getName(),
                            object.getReference().getName());
                    Object actualValue = actual.eGet(reference);
                    Object expectedValue = expected.eGet(reference);

                    return String.format(
                            "ReferenceChange%n\tParent: %s%n\tReference: %s%n\tExpected Value: %s%n\tActual Value: %s",
                            parent, referenceName, expectedValue, actualValue);
                }
                return defaultCase(object);
            }

        };
        return printer.doSwitch(diff);
    }

    protected static Resource createResource(ResourceSet resourceSet, URI modelUri) throws IOException {
        Resource resource = resourceSet.getResource(modelUri, false);
        if (resource == null) {
            resource = resourceSet.createResource(modelUri);
        }
        if (resourceSet.getURIConverter().exists(modelUri, Collections.emptyMap())) {
            resource.load(Collections.emptyMap());
        }
        return resource;
    }

    private static ModelExtent createModelExtent(Resource r) {
        return new BasicModelExtent(r.getContents());
    }

    private static void removeDifference(Diff difference) {
        difference.getMatch().getDifferences().remove(difference);
    }

    protected ModelExtent createModelExtent(URI resourceURI) throws IOException {
        Resource r = createResource(getResourceSet(), resourceURI);
        return createModelExtent(r);
    }
}
