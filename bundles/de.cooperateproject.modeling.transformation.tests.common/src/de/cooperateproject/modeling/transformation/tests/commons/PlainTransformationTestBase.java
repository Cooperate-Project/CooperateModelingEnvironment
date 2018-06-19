package de.cooperateproject.modeling.transformation.tests.commons;

import static de.cooperateproject.modeling.transformation.tests.commons.TestModelsHandling.prettyPrint;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.After;
import org.junit.Before;

import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparator;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactory;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactoryImpl;

public abstract class PlainTransformationTestBase extends TransformationTestBase implements QVTOTransformationRunning {
    protected File debugSerializationDir = null;
    protected ModelComparator modelComparator;

    @Before
    public void setupModelComparator() {
        this.modelComparator = new ModelComparator(getModelComparisonFactory());
    }

    protected ModelComparisonFactory getModelComparisonFactory() {
        return new ModelComparisonFactoryImpl();
    }
    
    @After
    public void tearDown() {
        setDebugSerializationDir(null);
    }

    protected void setDebugSerializationDir(File dir) {
        debugSerializationDir = dir;
    }

    protected void assertModelEquals(Notifier expected, Notifier actual) throws UnsupportedEncodingException {
        assertModelEquals(expected, actual, (c -> Collections.emptyList()));
    }

    protected void assertModelEqualsStrict(Notifier expected, Notifier actual)
            throws UnsupportedEncodingException {
        Comparison result = modelComparator.compareStrict(expected, actual);
        assertComparison(result);
    }

    protected void assertModelEquals(Notifier expected, Notifier actual,
            Function<Collection<Diff>, Collection<Diff>> diffProcessor) throws UnsupportedEncodingException {
        Comparison result = modelComparator.compare(expected, actual);
        Collection<Diff> ignoredDiffs = diffProcessor.apply(result.getDifferences());
        ignoredDiffs.stream().forEach(TestModelsHandling::removeDifference);
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

    protected void debugSerialize(EObject expected, EObject actual) throws IOException {
        debugSerialize(Arrays.asList(expected), Arrays.asList(actual));
    }

    @SuppressWarnings("squid:S2583")
    protected void debugSerialize(Collection<EObject> expected, Collection<EObject> actual) throws IOException {
        if (debugSerializationDir == null) {
            return;
        }

        URI expectedURI = findAnyURI(expected)
                .orElse(URI.createFileURI(new File(debugSerializationDir, "expected.xmi").getAbsolutePath()));
        serialize(expected, expectedURI, "expected");

        URI actualURI = findAnyURI(actual).orElse(
                expectedURI.trimSegments(1).appendSegment(expectedURI.trimFileExtension().lastSegment() + "-actual")
                        .appendFileExtension(expectedURI.fileExtension()));
        serialize(actual, actualURI, "actual");
    }
    
    private static Optional<URI> findAnyURI(Collection<EObject> elements) {
        return elements.stream().map(EObject::eResource).filter(Objects::nonNull).map(Resource::getURI).findAny();
    }

    protected void serialize(Collection<EObject> model, URI uri, String fileName) throws IOException {
        assertTrue(model.stream().map(EObject::eResource).distinct().count() == 1);
        Resource r = Optional.ofNullable(model.iterator().next().eResource())
                .orElseGet(() -> createAndAssignToResource(model, uri));
        FileUtils.write(new File(debugSerializationDir, String.format("%s.%s", fileName, uri.fileExtension())),
                serialize(r, true));
    }

    private Resource createAndAssignToResource(Collection<EObject> model, URI uri) {
        Resource r = getResourceSet().createResource(uri);
        r.getContents().addAll(EcoreUtil.copyAll(model));
        return r;
    }

    protected static String serialize(Resource r, boolean withoutXmiIds) {
        @SuppressWarnings("deprecation")
        Optional<Map<EObject, String>> idMap = Optional.of(r).filter(XMLResource.class::isInstance)
                .map(XMLResource.class::cast).map(XMLResource::getEObjectToIDMap);
        Map<EObject, String> oldIds = new HashMap<>(idMap.orElse(Collections.emptyMap()));
        try {
            if (withoutXmiIds) {
                idMap.ifPresent(Map::clear);
            }
            return serialize(r);
        } finally {
            idMap.ifPresent(m -> m.putAll(oldIds));
        }
    }

    private static String serialize(Resource r) {
        try (OutputStream os = new ByteArrayOutputStream()) {
            r.save(os, Collections.emptyMap());
            return os.toString();
        } catch (IOException e) {
            e.printStackTrace();
            fail(e.toString());
            return null;
        }
    }
}
