package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.cdo.common.protocol.CDOProtocolConstants;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSetImpl;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

public class CooperateResourceSet extends ResourceSetReferencingResourceSetImpl {

	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) {
		Resource resource = findResourceInResourceSet(uri, this);
		Iterator<ResourceSet> iterator = getReferencedResourceSets().iterator();
		while (resource == null && iterator.hasNext()) {
			resource = findResourceInResourceSet(uri, iterator.next());
		}
		
		if (resource == null && loadOnDemand) {
			resource = tryCreateCDOResource(uri);
		}
		
		if (resource != null) {
			return load(resource, loadOnDemand);
		}

		return super.getResource(uri, loadOnDemand);
	}

	private Resource tryCreateCDOResource(URI uri) {
		if (!uri.scheme().startsWith(CDOProtocolConstants.PROTOCOL_NAME)) {
			return null;
		}

		Optional<ResourceSet> cdoResourceSet = Iterables.tryFind(getReferencedResourceSets(),
				CooperateResourceSet::isCDOResourceSet);

		if (!cdoResourceSet.isPresent()) {
			return null;
		}

		return cdoResourceSet.get().getResource(uri, true);
	}

	private static boolean isCDOResourceSet(ResourceSet rs) {
		return rs.getResources().stream().filter(r -> r instanceof CDOResource).map(r -> (CDOResource) r)
				.anyMatch(r -> r.cdoView() != null);
	}

	private Resource findResourceInResourceSet(URI uri, ResourceSet set) {
		Optional<Resource> foundResource = Iterables.tryFind(set.getResources(), r -> uri.equals(r.getURI()));
		if (!foundResource.isPresent()) {
			return null;
		}
		return foundResource.get();
	}

	private Resource load(Resource resource, boolean loadOnDemand) {
		if (!loadOnDemand)
			try {
				resource.load(resource.getResourceSet().getLoadOptions());
			} catch (IOException e) {
				throw new WrappedException(e);
			}
		return resource;
	}
}
