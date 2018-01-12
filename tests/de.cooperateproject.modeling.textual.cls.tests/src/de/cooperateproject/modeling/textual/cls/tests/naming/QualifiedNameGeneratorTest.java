package de.cooperateproject.modeling.textual.cls.tests.naming;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.tests.AbstractClsTest;
import de.cooperateproject.modeling.textual.cls.tests.scoping.util.ClsCustomizedInjectorProvider;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.naming.QualifiedNameGenerator;

@RunWith(XtextRunner.class)
@InjectWith(ClsCustomizedInjectorProvider.DefaultProvider.class)
public class QualifiedNameGeneratorTest extends AbstractClsTest {

    private static String TEST_FOLDER = "testmodels/scoping/";

    @Test
    public void testRootElementWithName() throws IOException {
        ClassDiagram diagram = loadClassDiagram(rs, "simple.cls");
        assertEquals("RootElement", getActual(diagram.getRootPackage()));
    }

    @Test
    public void testRootElementWithoutName() throws IOException {
        ClassDiagram diagram = loadClassDiagram(rs, "complex.cls");
        assertEquals("RootElement", getActual(diagram.getRootPackage()));
    }

    @Test
    public void testAssociationWithoutName() throws IOException {
        ClassDiagram diagram = loadClassDiagram(rs, "complex.cls");
        assertNull(getActual((NamedElement) diagram.getRootPackage().getConnectors().get(0)));
    }

    private String getActual(NamedElement element) {
        return Optional.ofNullable(QualifiedNameGenerator.getQualifiedName(element)).map(QualifiedName::toString)
                .orElse(null);
    }

    private static ClassDiagram loadClassDiagram(ResourceSet rs, String name) throws IOException {
        Resource r = loadResource(rs, name);
        return (ClassDiagram) r.getContents().get(0);
    }

    private static Resource loadResource(ResourceSet rs, String name) throws IOException {
        URI resourceURI = URI.createURI(TEST_FOLDER + name);
        Resource r = rs.createResource(resourceURI, "cls");
        r.load(Collections.emptyMap());
        return r;
    }
}
