package de.cooperateproject.ui.nature.tasks;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.cdo.transfer.spi.workspace.WorkspaceTransferSystem;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.util.CDOTransferUMLFirst;

/**
 * Assumptions
 * - none
 */
public class ModelGenCheckoutTask extends CDOHandlingBackgroundTask {

	private static final Logger LOGGER = Logger.getLogger(ModelGenCheckoutTask.class);
	private static final String WORKSPACE_FOLDER_NAME = "model-gen";
	private IFolder workspaceFolder;

	public ModelGenCheckoutTask(IProject project, ProjectPropertiesDTO properties) {
		super(project, properties);
	}
	
	@Override
	protected void handleChange(CDOViewInvalidationEvent cdoChangeEvent) {
		try {
			doFullCheckout();
		} catch (CoreException e) {
			// TODO display an error in Eclipse problem view
			LOGGER.warn("Full checkout did not succeed after a change in CDO has been detected.", e);
		}
	}

	@Override
	protected void doStart() throws TaskException {
		try {
			workspaceFolder = createWorkspaceFolder(getProject(), WORKSPACE_FOLDER_NAME, true);
		} catch (CoreException e) {
			throw new TaskException("Error in initializing the required workspace resource.", e);
		}

		try {
			doFullCheckout();
		} catch (CoreException e) {
			throw new TaskException("Error in first task execution.", e);
		}
	}

	private void doFullCheckout() throws CoreException {
		CDOView view = getRepositoryFolder().cdoView();

		WorkspaceTransferSystem target = WorkspaceTransferSystem.INSTANCE;
		RepositoryTransferSystem source = new RepositoryTransferSystem(view);

		cleanUpFolder(workspaceFolder);

		CDOTransfer transfer = new CDOTransferUMLFirst(source, target);
		transfer.setTargetPath(workspaceFolder.getFullPath());
		transfer.map(getRepositoryFolder().getPath(), new NullProgressMonitor());
		
		// no default factory is registered in the CDO utilities
		transfer.getModelTransferContext().registerTargetExtension("*", new XMIResourceFactoryImpl());
		
		transfer.perform();
	}


}
