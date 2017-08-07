package de.cooperateproject.modeling.transformation.transformations.tests.transforms.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.Activator;
import de.cooperateproject.modeling.transformation.transformations.impl.TransformationNameUtils;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

@RunWith(Parameterized.class)
public class TransformationNameUtilsTest {

    @Parameter(0)
    public String description;

    @Parameter(1)
    public TransformationCharacteristic characteristics;

    @Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        Collection<DiagramTypes> relevantTypes = Arrays.asList(DiagramTypes.CLASS, DiagramTypes.USECASE);
        return relevantTypes.stream().map(TransformationNameUtilsTest::createData).flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private static Collection<Object[]> createData(DiagramTypes diagramType) {
        TransformationCharacteristic g2t = new TransformationCharacteristic(diagramType, ConcreteSyntaxTypes.GRAPHICAL,
                ConcreteSyntaxTypes.TEXTUAL);
        TransformationCharacteristic t2g = new TransformationCharacteristic(diagramType, ConcreteSyntaxTypes.GRAPHICAL,
                ConcreteSyntaxTypes.TEXTUAL);
        return Arrays.asList(
                new Object[][] { { String.format("%s: %s -> %s", g2t.getDiagramType().getName(), "g", "t"), g2t },
                        { String.format("%s: %s -> %s", t2g.getDiagramType().getName(), "t", "g"), t2g } });
    }

    @Test
    public void testTransformationName() {
        String actualFileName = TransformationNameUtils.createTransformationFileName(characteristics);

        String expectedFileName = String.format("%s_to_%s_for_%s.qvto", characteristics.getFrom(),
                characteristics.getTo(), characteristics.getDiagramType().getName());
        assertEquals(expectedFileName, actualFileName);
    }

    @Test
    public void testTraceTransformationName() {
        String actualFileName = TransformationNameUtils.createTraceTransformationFileName(characteristics);

        String expectedFileName = String.format("%s_to_%s_for_%s_Trace.qvto", characteristics.getFrom(),
                characteristics.getTo(), characteristics.getDiagramType().getName());
        assertEquals(expectedFileName, actualFileName);
    }

    @Test
    public void testTransformationUriExists() throws URISyntaxException, IOException {
        URI uri = TransformationNameUtils.createTransformationURI(characteristics);
        assertExistingTransformationUri(uri);
    }

    @Test
    public void testTraceTransformationUriExists() throws URISyntaxException, IOException {
        URI uri = TransformationNameUtils.createTraceTransformationURI(characteristics);
        assertExistingTransformationUri(uri);
    }

    private static void assertExistingTransformationUri(URI uri) throws URISyntaxException, IOException {
        assertTrue(uri.isPlatformPlugin());
        assertEquals(Activator.PLUGIN_ID, uri.segment(1));

        String localPath = StringUtils.join(uri.segmentsList().subList(2, uri.segmentCount()), '/');
        File basePath = determinePluginBasePath(Activator.PLUGIN_ID, Activator.class);
        File linkedTransformationFile = new File(basePath, localPath);

        assertTrue(linkedTransformationFile.exists());
        assertEquals("The existance of the linked transformation file is platform dependent.",
                linkedTransformationFile.getCanonicalPath().toString(), linkedTransformationFile.getAbsolutePath());
    }

    private static File determinePluginBasePath(String pluginId, Class<?> classOfPlugin) throws URISyntaxException {
        Path p = Paths.get(classOfPlugin.getProtectionDomain().getCodeSource().getLocation().toURI());
        while (p.getParent() != null && !p.getFileName().toString().equals(pluginId)) {
            p = p.getParent();
        }
        return p.toAbsolutePath().toFile();
    }

}
