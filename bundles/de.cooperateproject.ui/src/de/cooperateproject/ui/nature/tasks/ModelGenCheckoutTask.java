package de.cooperateproject.ui.nature.tasks;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.common.revision.CDORevisionCache;
import org.eclipse.emf.cdo.common.revision.CDORevisionUtil;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.cdo.transfer.spi.workspace.WorkspaceTransferSystem;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public class ModelGenCheckoutTask extends CooperateProjectBackgroundTask {

	private class ChangeListener implements IListener {

		@Override
		public void notifyEvent(IEvent arg0) {
			if (arg0 instanceof CDOViewInvalidationEvent) {
				try {
					doFullCheckout();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static final String WORKSPACE_FOLDER_NAME = "model-gen";
	private final ChangeListener cdoChangeListener2 = new ChangeListener();
	private CDOResourceFolder repositoryFolder;
	private IFolder workspaceFolder;

	public ModelGenCheckoutTask(IProject project, ProjectPropertiesDTO properties) {
		super(project, properties);
	}

	@Override
	public void start() throws TaskException {
		String cdoHost = getProperties().getCdoHost();
		int cdoPort = getProperties().getCdoPort();
		String cdoRepo = getProperties().getCdoRepo();
		String cdoRepoPath = getProject().getName();
		try {
			repositoryFolder = createCDOResource(cdoHost, cdoPort, cdoRepo, cdoRepoPath, cdoChangeListener2);
			workspaceFolder = createWorkspaceFolder(getProject(), WORKSPACE_FOLDER_NAME);
		} catch (CoreException | CommitException e) {
			throw new TaskException("Error in initializing the required workspace and cdo resources.", e);
		}

		try {
			doFullCheckout();
		} catch (CoreException e) {
			throw new TaskException("Error in first task execution.", e);
		}
	}

	@Override
	public void stop() {
		CDOView cdoView = repositoryFolder.cdoView();
		CDOSession cdoSession = cdoView.getSession();

		cdoView.removeListener(cdoChangeListener2);

		IOUtil.closeSilent(cdoSession);
		IOUtil.closeSilent(cdoView);
		repositoryFolder = null;
	}

	private void doFullCheckout() throws CoreException {
		CDOView view = repositoryFolder.cdoView();

		WorkspaceTransferSystem target = WorkspaceTransferSystem.INSTANCE;
		RepositoryTransferSystem source = new RepositoryTransferSystem(view);

		cleanUpFolder(workspaceFolder);

		CDOTransfer transfer = new CDOTransfer(source, target);
		transfer.setTargetPath(workspaceFolder.getFullPath());
		transfer.map(repositoryFolder.getPath(), new NullProgressMonitor());
		transfer.perform();
	}

	private static IFolder createWorkspaceFolder(IProject project, String folderName) throws CoreException {
		IFolder workspaceFolder = project.getFolder(folderName);
		if (!workspaceFolder.exists()) {
			workspaceFolder.create(true, true, new NullProgressMonitor());
		}
		workspaceFolder.setDerived(true, new NullProgressMonitor());
		return workspaceFolder;
	}

	private static CDOResourceFolder createCDOResource(String host, int port, String repository, String path,
			IListener listener) throws CommitException {
		CDOSession session = createSession(host, port, repository);
		CDOView view = session.openView();
		view.addListener(listener);
		view.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
		if (!view.hasResource(path)) {
			CDOTransaction transaction = session.openTransaction();
			transaction.createResourceFolder(path);
			transaction.commit();
			transaction.close();
		}
		CDOResourceFolder resourceFolder = view.getResourceFolder(path);
		return resourceFolder;
	}
	
	private static CDONet4jSession createSession(String host, int port, String repository) {
		String connectionString = String.format("tcp://%s:%d", host, port);
		IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, connectionString);
		
		CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
		sessionConfiguration.setConnector(connector);
		sessionConfiguration.setRepositoryName(repository);
		sessionConfiguration.setRevisionManager(CDORevisionUtil.createRevisionManager(CDORevisionCache.NOOP));
			    
		CDONet4jSession session = sessionConfiguration.openNet4jSession();
		return session;
	}

	private static void cleanUpFolder(IFolder folder) throws CoreException {
		for (IResource resource : folder.members()) {
			resource.delete(true, new NullProgressMonitor());
		}
	}

}
