package de.cooperateproject.modeling.transformation.common.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;
import de.cooperateproject.modeling.transformation.common.impl.TransformationNameUtilsOld;

@RunWith(Parameterized.class)
public class TransformationNameUtilsTest {

    @Parameter(0)
    public String description;

    @Parameter(1)
    public de.cooperateproject.modeling.transformation.common.TransformationCharacteristic characteristics;

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
        String actualFileName = TransformationNameUtilsOld.createTransformationFileName(characteristics);

        String expectedFileName = String.format("%s_to_%s_for_%s.qvto", characteristics.getFrom(),
                characteristics.getTo(), characteristics.getDiagramType().getName());
        assertEquals(expectedFileName, actualFileName);
    }

    @Test
    public void testTraceTransformationName() {
        String actualFileName = TransformationNameUtilsOld.createTraceTransformationFileName(characteristics);

        String expectedFileName = String.format("%s_to_%s_for_%s_Trace.qvto", characteristics.getFrom(),
                characteristics.getTo(), characteristics.getDiagramType().getName());
        assertEquals(expectedFileName, actualFileName);
    }
}
