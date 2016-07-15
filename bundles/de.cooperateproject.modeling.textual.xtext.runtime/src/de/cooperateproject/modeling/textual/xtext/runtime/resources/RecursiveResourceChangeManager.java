package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet;

import com.google.common.collect.Sets;

public abstract class RecursiveResourceChangeManager extends ResourceChangeManagerBase {

	private final Collection<IResourceChangeManager> resourceChangeManagers = Sets.newHashSet();

	public RecursiveResourceChangeManager(PreparedResourceListener...listeners) {
		super(listeners);
	}

	@Override
	protected void initForNewResourceSet(ResourceSet rs) {
		createAndRegisterResourceChangeManager(rs);
	}

	@Override
	protected void cleanupForOldResourceSet(ResourceSet rs) {
		closeResourceManagers(rs);
	}

	private void closeResourceManagers(ResourceSet rs) {
		resourceChangeManagers.forEach(r -> r.setResourceSet(null));
		resourceChangeManagers.clear();
	}

	private void createAndRegisterResourceChangeManager(ResourceSet rs) {
		createAndRegisterFlatResourceChangeManager(rs);
		if (rs instanceof ResourceSetReferencingResourceSet) {
			((ResourceSetReferencingResourceSet) rs).getReferencedResourceSets()
					.forEach(this::createAndRegisterRecursiveResourceChangeManager);
		}
	}

	private void createAndRegisterFlatResourceChangeManager(ResourceSet rs) {
		IResourceChangeManager manager = new FlatResourceChangeManager( (r,p) -> fireResourceProcessed(r, p)) {
			@Override
			protected void handleChangedResource(Resource r) {
				RecursiveResourceChangeManager.this.handleChangedResourceFiltered(r);
			}
		};
		resourceChangeManagers.add(manager);
		manager.setResourceSet(rs);
	}

	private void createAndRegisterRecursiveResourceChangeManager(ResourceSet rs) {
		RecursiveResourceChangeManager manager = new RecursiveResourceChangeManager((r,p) -> fireResourceProcessed(r, p)) {
			@Override
			protected void handleChangedResource(Resource r) {
				RecursiveResourceChangeManager.this.handleChangedResourceFiltered(r);
			}
		};
		resourceChangeManagers.add(manager);
		manager.setResourceSet(rs);
	}

	@Override
	public void close() {
		resourceChangeManagers.forEach(m -> m.close());
		super.close();
	}

}
