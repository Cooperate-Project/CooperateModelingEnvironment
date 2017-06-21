package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Global scope provider with special handling of queries to UML elements.
 * 
 * The provider only processes queries about UML elements. All other queries are delegated to
 * {@link DefaultGlobalScopeProvider}. The UML queries are mapped to CDO (if available) or to calls to local resources.
 * A {@link IUMLUriFinder} provides us with the URI of the UML resource that matches the resource of the textual editor.
 * The scope handles queries to primitive types.
 */
public class CooperateGlobalScopeProvider extends DefaultGlobalScopeProvider implements IGlobalScopeTypeQueryProvider {

    private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IAlternativeNameProvider alternativeQualifiedNameProvider;

    @Inject
    private IUMLUriFinder umlUriFinder;

    @Inject
    private IUMLPrimitiveTypeSelector umlPrimitiveTypeSelector;

    @Override
    protected IScope getScope(Resource resource, boolean ignoreCase, EClass type,
            Predicate<IEObjectDescription> predicate) {
        if (UMLPackage.eINSTANCE != type.getEPackage()) {
            return super.getScope(resource, ignoreCase, type, predicate);
        }

        Optional<Resource> umlResource = findUMLResource(resource);
        if (!umlResource.isPresent()) {
            return IScope.NULLSCOPE;
        }
        return getScopeFromUMLResource(umlResource.get(), type, predicate);
    }

    private IScope getScopeFromUMLResource(Resource umlResource, EClass type,
            Predicate<IEObjectDescription> predicate) {
        Stream<EObject> umlResourceElements;
        if (umlResource instanceof CDOResource && ((CDOResource) umlResource).cdoView() instanceof CDOTransaction) {
            umlResourceElements = getScopeElementsFromUMLResource((CDOResource) umlResource, type);
        } else {
            umlResourceElements = getScopeElementsFromUMLResource(umlResource, type);
        }
        Stream<EObject> umlPrimitiveElements = getPrimitiveTypesIfRequested(umlResource, type);

        Stream<EObject> scopeElements = Stream.concat(umlPrimitiveElements, umlResourceElements);
        return createScopeForStream(scopeElements, predicate);
    }

    private Stream<EObject> getPrimitiveTypesIfRequested(Resource umlResource, EClass type) {
        Resource umlPrimitives = umlResource.getResourceSet().getResource(UML_PRIMITIVE_TYPES_URI, true);
        return getScopeElementsFromUMLResource(umlPrimitives, type).filter(PrimitiveType.class::isInstance)
                .map(PrimitiveType.class::cast).filter(umlPrimitiveTypeSelector::isSelected).map(EObject.class::cast);
    }

    private static Stream<EObject> getScopeElementsFromUMLResource(Resource umlResource, EClass type) {
        Iterable<EObject> allContents = Iterables.concat(umlResource.getContents(),
                () -> umlResource.getContents().get(0).eAllContents());
        Stream<EObject> allContentsStream = StreamSupport.stream(allContents.spliterator(), false);
        return allContentsStream.filter(type::isInstance);
    }

    private static Stream<EObject> getScopeElementsFromUMLResource(CDOResource umlResource, EClass type) {
        Optional<CDOTransaction> transation = Optional.fromNullable(umlResource.cdoView())
                .transform(v -> v.getAdapter(CDOTransaction.class));
        if (!transation.isPresent()) {
            return Stream.empty();
        }
        CDOQuery query = transation.get().createQuery("ocl",
                String.format("%s::%s.allInstances()", type.getEPackage().getNsPrefix(), type.getName()), true);
        Collection<EObject> results = query.getResult().stream().filter(EObject.class::isInstance)
                .map(EObject.class::cast).filter(o -> o.eResource() == umlResource).collect(Collectors.toList());
        return results.stream();
    }

    private IScope createScopeForStream(Stream<EObject> results, Predicate<IEObjectDescription> predicate) {
        Collection<IEObjectDescription> descriptions = results.map(this::getDescriptionFor).flatMap(Collection::stream)
                .filter(Objects::nonNull).filter(d -> predicate == null ? true : predicate.apply(d))
                .collect(Collectors.toList());
        return new SimpleScope(descriptions);
    }

    private Collection<IEObjectDescription> getDescriptionFor(EObject obj) {
        List<IEObjectDescription> descriptions = Lists.newArrayList();
        QualifiedName qualifiedName = qualifiedNameProvider.getFullyQualifiedName(obj);
        if (qualifiedName == null) {
            return Collections.emptyList();
        }
        IEObjectDescription description = new EObjectDescription(qualifiedName, obj, null);
        descriptions.add(description);
        Optional<QualifiedName> alternativeName = alternativeQualifiedNameProvider
                .getAlternativeFullyQualifiedName(obj);
        if (alternativeName.isPresent()) {
            IEObjectDescription alternativeDescription = new AliasedEObjectDescription(alternativeName.get(),
                    description);
            descriptions.add(alternativeDescription);
        }
        return descriptions;
    }

    private Optional<Resource> findUMLResource(Resource self) {
        java.util.Optional<URI> umlUri = umlUriFinder.findUMLURI(self.getURI());
        if (!umlUri.isPresent()) {
            return Optional.absent();
        }

        Resource r = self.getResourceSet().getResource(umlUri.get(), true);
        return Optional.fromNullable(r);
    }

    @Override
    public IScope queryScope(Resource resource, boolean ignoreCase, EClass type,
            Predicate<IEObjectDescription> predicate) {
        return getScope(resource, ignoreCase, type, predicate);
    }

}
