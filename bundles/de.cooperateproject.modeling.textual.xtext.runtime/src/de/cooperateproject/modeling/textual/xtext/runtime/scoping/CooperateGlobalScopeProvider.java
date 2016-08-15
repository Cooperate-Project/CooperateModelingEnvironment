package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class CooperateGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

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
		return getScopeFromUMLResource(umlResource.get(), ignoreCase, type, predicate);
	}

	private IScope getScopeFromUMLResource(Resource umlResource, boolean ignoreCase, EClass type,
			Predicate<IEObjectDescription> predicate) {
		if (umlResource instanceof CDOResource) {
			return getScopeFromUMLResource((CDOResource) umlResource, ignoreCase, type, predicate);
		}

		Iterable<EObject> allContents = Iterables.concat(umlResource.getContents(),
				() -> umlResource.getContents().get(0).eAllContents());
		Stream<EObject> allContentsStream = StreamSupport.stream(allContents.spliterator(), false);
		try {
			Stream<EObject> results = allContentsStream.filter(type::isInstance);
			return createScopeForStream(results, predicate);
		} finally {
			allContentsStream.close();
		}
	}

	private IScope getScopeFromUMLResource(CDOResource umlResource, boolean ignoreCase, EClass type,
			Predicate<IEObjectDescription> predicate) {
		CDOView view = umlResource.cdoView();
		if (view == null) {
			return IScope.NULLSCOPE;
		}
		String queryString = String.format("%s.allInstances()", type.getName());
		CDOQuery query = view.createQuery("ocl", queryString, umlResource.getContents().get(0));
		List<EObject> results = query.getResult(EObject.class);
		return createScopeForStream(results.stream(), predicate);
	}

	private IScope createScopeForStream(Stream<EObject> results, Predicate<IEObjectDescription> predicate) {
		Collection<EObject> objs = results.map(this::getDescriptionFor)
				.filter(d -> d != null).filter(d -> predicate == null ? true : predicate.apply(d)).map(d -> d.getEObjectOrProxy())
				.collect(Collectors.toList());
		return createUMLScope(objs);
	}

	private IScope createUMLScope(Iterable<EObject> objects) {
		return Scopes.scopeFor(objects, e -> qualifiedNameProvider.apply(e), IScope.NULLSCOPE);
	}

	private IEObjectDescription getDescriptionFor(EObject obj) {
		List<EObject> elements = Arrays.asList(obj);
		Iterable<IEObjectDescription> descriptions = Scopes.scopedElementsFor(elements, qualifiedNameProvider::apply);
		return Iterables.getFirst(descriptions, null);
	}

	private static Optional<Resource> findUMLResource(Resource self) {
		Optional<URI> umlUri = findUMLURI(self.getURI());
		if (!umlUri.isPresent()) {
			return Optional.absent();
		}

		Resource r = self.getResourceSet().getResource(umlUri.get(), true);
		return Optional.fromNullable(r);
	}

	private static Optional<URI> findUMLURI(URI ownUri) {
		String[] uriSegments = ownUri.segments();
		String modelFileName = URI.decode(uriSegments[uriSegments.length - 1]);
		Pattern namePattern = Pattern.compile("^(.*?) - .*");
		Matcher nameMatcher = namePattern.matcher(modelFileName);
		if (!nameMatcher.matches()) {
			return Optional.absent();
		}
		String name = nameMatcher.group(1);
		uriSegments[uriSegments.length - 1] = name + ".uml";

		URI targetURI = URI.createHierarchicalURI(ownUri.scheme(), ownUri.authority(), ownUri.device(), uriSegments,
				null, null);
		return Optional.of(targetURI);
	}

}
