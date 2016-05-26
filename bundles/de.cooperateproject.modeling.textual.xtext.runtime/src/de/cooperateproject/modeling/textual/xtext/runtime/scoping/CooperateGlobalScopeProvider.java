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
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;

public class CooperateGlobalScopeProvider extends DefaultGlobalScopeProvider {

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

		EObject rootObject = umlResource.getContents().get(0);
		Iterable<EObject> allContents = () -> rootObject.eAllContents();
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

	private static IScope createScopeForStream(Stream<EObject> results, Predicate<IEObjectDescription> predicate) {
		Collection<EObject> obj = results.map(CooperateGlobalScopeProvider::getDescriptionFor)
				.filter(d -> predicate == null ? true : predicate.apply(d)).map(d -> d.getEObjectOrProxy())
				.collect(Collectors.toList());
		return Scopes.scopeFor(obj);
	}

	private static IEObjectDescription getDescriptionFor(EObject obj) {
		return Scopes.scopedElementsFor(Arrays.asList(obj)).iterator().next();
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
