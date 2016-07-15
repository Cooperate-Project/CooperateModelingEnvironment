package de.cooperateproject.modeling.textual.xtext.runtime.resources.observer;

import java.util.Collection;

import org.apache.commons.lang3.Validate;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.collect.Sets;

public class FileResourceChangeObserver extends ResourceChangeObserver<Resource, IResourceChangeListener> {

	private static final Logger LOGGER = Logger.getLogger(FileResourceChangeObserver.class);
	private static class ChangedResourcesDeltaVisitor implements IResourceDeltaVisitor {

		private final Collection<IFile> changedFiles = Sets.newHashSet();
		
		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource changedResource = delta.getResource();
			if (changedResource == null) {
				return true;
			}
			
			IFile changedFile = changedResource.getAdapter(IFile.class);
			if (changedFile != null) {
				changedFiles.add(changedFile);
				return false;
			}
			return true;
		}
		
		public Collection<IFile> getChangedFiles() {
			return changedFiles;
		}
		
	}
	
	public FileResourceChangeObserver(Resource resource, ResourceChangeHandler changeHandler) {
		super(resource, changeHandler);
	}

	@Override
	protected IResourceChangeListener createAndRegisterResourceListener(Resource r) {
		Validate.isTrue(r.getURI().isPlatformResource(), "The resource %s has to be a platform resource.",
				r.getURI().toString());
		Validate.notNull(ResourcesPlugin.getWorkspace(), "We need a workspace instance for observing the resource.");

		String platformString = r.getURI().toPlatformString(true);
		IResource iresource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);

		if (iresource == null) {
			return null;
		}

		IResourceChangeListener listener = new IResourceChangeListener() {
			@Override
			public void resourceChanged(IResourceChangeEvent event) {
				try {
					if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
						ChangedResourcesDeltaVisitor visitor = new ChangedResourcesDeltaVisitor();
						event.getDelta().accept(visitor);
						if (visitor.getChangedFiles().contains(iresource)) {
							handleResourceChange();						
						}
					}					
				} catch (CoreException e) {
					LOGGER.warn("Could not determine changed files based on resource delta.", e);
				}
			}
		};
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_CHANGE);
		return listener;
	}

	@Override
	public void close() {
		Validate.notNull(ResourcesPlugin.getWorkspace(), "We need a workspace instance for observing the resource.");

		if (getResourceListener() != null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(getResourceListener());
		}
	}
}
