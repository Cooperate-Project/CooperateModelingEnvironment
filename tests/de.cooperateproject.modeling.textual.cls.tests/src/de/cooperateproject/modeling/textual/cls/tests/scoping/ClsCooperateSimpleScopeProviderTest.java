package de.cooperateproject.modeling.textual.cls.tests.scoping;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.ClsStandaloneSetup;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.scoping.ClsImportedNamespaceAwareLocalScopeProvider;
import de.cooperateproject.modeling.textual.cls.tests.scoping.util.ClsCustomizedInjectorProvider;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

@RunWith(XtextRunner.class)
@InjectWith(ClsCustomizedInjectorProvider.DefaultProvider.class)
public class ClsCooperateSimpleScopeProviderTest {

    private static String TEST_FOLDER = "testmodels/scoping/";

    @Inject
    private ClsImportedNamespaceAwareLocalScopeProvider subject;

    private ResourceSet rs;

    @BeforeClass
    public static void init() {
        ClsStandaloneSetup.doSetup();
    }

    @Before
    public void setup() {
        rs = createResourceSet();
    }

    @After
    public void tearDown() {
        rs.getResources().forEach(Resource::unload);
        rs.getResources().clear();
    }

    @Test
    public void testNestedNormalizing() throws Exception {
        ClassDiagram cd = loadClassDiagram(rs, "simple.cls");

        IScope scope = subject.getScope(cd.getRootPackage().getClassifiers().get(0).getMembers().get(0),
                TextualCommonsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());

        List<ImportNormalizer> normalizers = getNormalizers(scope);

        Set<String> expectedPrefixes = Sets.newHashSet("RootElement.Class1.someOp");
        Set<String> actualPrefixes = normalizers.stream().map(n -> n.getImportedNamespacePrefix().toString())
                .collect(Collectors.toSet());

        assertThat(actualPrefixes, is(equalTo(expectedPrefixes)));
    }

    @SuppressWarnings("unchecked")
    private static List<ImportNormalizer> getNormalizers(IScope scope)
            throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        assertNotNull(scope);
        assertThat(scope, is(instanceOf(ImportScope.class)));

        ImportScope importScope = (ImportScope) scope;
        Field normalizersField = scope.getClass().getDeclaredField("normalizers");
        normalizersField.setAccessible(true);

        Object normalizers = normalizersField.get(importScope);
        assertThat(normalizers, is(instanceOf(List.class)));

        assertThat((List<?>) normalizers, everyItem(is(instanceOf(ImportNormalizer.class))));
        return (List<ImportNormalizer>) normalizers;
    }

    private static ResourceSet createResourceSet() {
        ResourceSet rs = new ResourceSetImpl();
        UMLResourcesUtil.init(rs);
        return rs;
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
