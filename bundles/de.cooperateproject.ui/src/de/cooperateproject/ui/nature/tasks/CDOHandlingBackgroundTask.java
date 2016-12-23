package de.cooperateproject.ui.nature.tasks;

import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public abstract class CDOHandlingBackgroundTask extends CooperateProjectBackgroundTask {

	private class ChangeListener implements IListener {

		@Override
		public void notifyEvent(IEvent arg0) {
			if (arg0 instanceof CDOViewInvalidationEvent) {
				CDOViewInvalidationEvent event = (CDOViewInvalidationEvent) arg0;
				if (isRelevantChange(event)) {
					handleChange(event);					
				}
			} else {
				handleChange(arg0);
			}
		}
	}

	private final ChangeListener cdoChangeListener = new ChangeListener();
	private CDOResourceFolder repositoryFolder;

	protected CDOHandlingBackgroundTask(IProject project, ProjectPropertiesDTO properties) {
		super(project, properties);
	}
	
	private boolean isRelevantChange(CDOViewInvalidationEvent event) {
		Stream<CDOObject> changedObjects = Stream.concat(event.getDetachedObjects().stream(), event.getDirtyObjects().stream());
		return changedObjects.anyMatch(this::isDirectlyContainedInRepositoryFolder);
	}
	
	private boolean isDirectlyContainedInRepositoryFolder(CDOObject o) {
		if (repositoryFolder.equals(o)) {
			return true;
		}
		
		if (o instanceof CDOResource) {
			CDOResource r = (CDOResource)o;
			URI resourceURI = r.getURI();
			return isChild(repositoryFolder.getURI(), resourceURI);
		}
		
		CDOResource resource = o.cdoResource();
		if (resource == null) {
			return false;
		}
		CDOResourceFolder folder = resource.getFolder();
		return repositoryFolder.equals(folder);
	}
	
	private static boolean isChild(URI baseURI, URI candidate) {
		if (baseURI == null || candidate == null) {
			return false;
		}
		String baseURIString = baseURI.toString();
		String commonPrefix = StringUtils.getCommonPrefix(baseURIString, candidate.toString());
		return baseURIString.equals(commonPrefix); 
	}
	
	@Override
	public void start() throws TaskException {
		try {
			repositoryFolder = createCDOProjectFolder();
		} catch (CommitException e) {
			throw new TaskException("Could not create folder in CDO.", e);
		}
		doStart();
	}

	@Override
	public void stop() {
		if (repositoryFolder == null) {
			return;
		}
		
		CDOView cdoView = repositoryFolder.cdoView();
		CDOSession cdoSession = cdoView.getSession();

		cdoView.removeListener(cdoChangeListener);

		IOUtil.closeSilent(cdoView);
		CDOConnectionManager.getInstance().releaseSession(cdoSession);
		repositoryFolder = null;
	}

	protected abstract void handleChange(CDOViewInvalidationEvent cdoChangeEvent);
	protected void handleChange(IEvent cdoEvent) {
		return;
	}
	protected abstract void doStart() throws TaskException;
	
	protected CDOResourceFolder getRepositoryFolder() {
		return repositoryFolder;
	}

	private CDOResourceFolder createCDOProjectFolder() throws CommitException {
		String cdoRepoPath = getProject().getName();
		return createCDOResource(getProject(), cdoRepoPath, cdoChangeListener);
	}

	protected void refreshFolder(IFolder folder) {
		Job j = new Job("Refresh") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					folder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not refresh folder.", e);
				}
				return Status.OK_STATUS;
			}
		};
		j.schedule(1000);
	}

	private static CDOResourceFolder createCDOResource(IProject project, String cdoRepoPath,
			IListener listener) throws CommitException {
		CDOSession cdoSession = CDOConnectionManager.getInstance().acquireSession(project);
		CDOResourceFolder result = null;
		try {
			CDOView cdoView = cdoSession.openView();
			cdoView.addListener(listener);
			cdoView.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
			if (!cdoView.hasResource(cdoRepoPath)) {
				CDOTransaction transaction = cdoSession.openTransaction();
				transaction.createResourceFolder(cdoRepoPath);
				transaction.commit();
				transaction.close();
			}
			result = cdoView.getResourceFolder(cdoRepoPath);
			return result;
		} finally {
			if (result == null) {
				CDOConnectionManager.getInstance().releaseSession(cdoSession);
			}
		}
	}

	protected static IFolder createWorkspaceFolder(IProject project, String folderName, boolean derived) throws CoreException {
		IFolder workspaceFolder = project.getFolder(folderName);
		if (!workspaceFolder.exists()) {
			workspaceFolder.create(true, true, new NullProgressMonitor());
		}
		if (derived) {
			workspaceFolder.setDerived(true, new NullProgressMonitor());			
		}
		return workspaceFolder;
	}

	protected static void cleanUpFolder(IFolder folder) throws CoreException {
		for (IResource resource : folder.members()) {
			resource.delete(true, new NullProgressMonitor());
		}
	}
}
