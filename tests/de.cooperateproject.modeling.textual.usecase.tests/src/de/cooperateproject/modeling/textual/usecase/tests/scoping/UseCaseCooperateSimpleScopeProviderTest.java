package de.cooperateproject.modeling.textual.usecase.tests.scoping;

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
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.usecase.scoping.UseCaseImportedNamespaceAwareLocalScopeProvider;
import de.cooperateproject.modeling.textual.usecase.tests.AbstractUsecaseTest;
import de.cooperateproject.modeling.textual.usecase.tests.scoping.util.UsecaseCustomizedInjectorProvider;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;

@RunWith(XtextRunner.class)
@InjectWith(UsecaseCustomizedInjectorProvider.DefaultProvider.class)
public class UseCaseCooperateSimpleScopeProviderTest extends AbstractUsecaseTest {

    private static String TEST_FOLDER = "testmodels/scoping/";

    @Inject
    private UseCaseImportedNamespaceAwareLocalScopeProvider subject;

    @Test
    public void testNestedNormalizing() throws Exception {
        UseCaseDiagram ud = loadUseCaseDiagram(rs, "simple.uc");

        IScope scope = subject.getScope(ud.getRootPackage().getSystems().get(0).getUsecases().get(0),
                TextualCommonsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());

        List<ImportNormalizer> normalizers = getNormalizers(scope);

        Set<String> expectedPrefixes = Sets.newHashSet("RootElement.System1.UC1");
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

    private static UseCaseDiagram loadUseCaseDiagram(ResourceSet rs, String name) throws IOException {
        Resource r = loadResource(rs, name);
        return (UseCaseDiagram) r.getContents().get(0);
    }

    private static Resource loadResource(ResourceSet rs, String name) throws IOException {
        URI resourceURI = URI.createURI(TEST_FOLDER + name);
        Resource r = rs.createResource(resourceURI, "ud");
        r.load(Collections.emptyMap());
        return r;
    }

}
