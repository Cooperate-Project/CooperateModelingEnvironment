package de.cooperateproject.modeling.transformation.cls.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.transformation.cls.ClsActivator;

public class GraphicalToTextualClassTest extends ClsDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Class.qvto");

    static {
        ClsPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualClassTest() {
        super(TRANSFORMATION_URI, "notation", "xmi", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testWithoutPackages() throws Exception {
        testRegular("ClassDiagram");
    }

    @Test
    public void testWithoutPackagesIncremental() throws Exception {
        testIncremental("ClassDiagram");
    }

    @Test
    public void testPackages() throws Exception {
        testRegular("ClassDiagramPackages");
    }

    @Test
    public void testPackagesIncremental() throws Exception {
        testIncremental("ClassDiagramPackages");
    }

    @Test
    public void testSelfReference() throws Exception {
        testRegular("ClassDiagramSelfReference");
    }

    @Test
    public void testSelfReferenceIncremental() throws Exception {
        testIncremental("ClassDiagramSelfReference");
    }

    @Test
    public void testClassNote() throws Exception {
        testRegular("ClassDiagramClassNote");
    }

    @Test
    public void testClassNoteIncremental() throws Exception {
        testIncremental("ClassDiagramClassNote");
    }

    @Test
    public void testClassChangedRoot() throws Exception {
        testRegular("ClassDiagramChangedRoot");
    }

    @Test
    public void testClassChangedRootIncremental() throws Exception {
        testIncremental("ClassDiagramChangedRoot");
    }
    
    @Test
    public void testClassCommentedGeneralization() throws Exception {
       testRegular("ClassDiagramCommentedGeneralization");
    }
    
    @Test
    public void testClassCommentedImpl() throws Exception {
       testRegular("ClassDiagramCommentedImpl");
    }

    @Test
    public void testDeleteClass() throws Exception {
        URI sourceModelURI = createResourceModelURI(TestEnvironmentConstants.TEST_PLUGIN_ID, "ClassDiagramSingleClass.notation");
        URI umlModelURI = createResourceModelURI(TestEnvironmentConstants.TEST_PLUGIN_ID, "ClassDiagramSingleClass.uml");

        // first transformation
        Trace transformationTrace = new Trace(Collections.emptyList());
        ModelExtent transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI,
                transformationTrace);

        // delete class from graphical model
        Resource notationResource = getResourceSet().getResource(sourceModelURI, false);
        Shape umlClassShape = ((Shape) ((Diagram) notationResource.getContents().get(0)).getChildren().get(0));
        org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) umlClassShape.getElement();
        EcoreUtil.remove(umlClassShape);
        EcoreUtil.remove(umlClass);
        ClassDiagram textualDiagram = (ClassDiagram) transformationResult.getContents().get(0);
        textualDiagram.getRootPackage().getClassifiers().get(0)
                .eUnset(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);

        // second transformation (incremental)
        transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI, transformationResult,
                transformationTrace);

        assertEquals(0, textualDiagram.getRootPackage().getClassifiers().size());
    }

}
