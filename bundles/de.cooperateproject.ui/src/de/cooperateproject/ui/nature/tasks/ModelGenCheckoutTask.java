package de.cooperateproject.ui.nature.tasks;

import java.util.Arrays;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.cdo.transfer.spi.workspace.WorkspaceTransferSystem;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.net4j.util.io.IOUtil;

import com.google.common.collect.Sets;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.util.CDOTransferUMLFirst;

/**
 * Assumptions - none
 */
public class ModelGenCheckoutTask extends CDOHandlingBackgroundTask {

	/**
	 * Blocks resolving of various URI types to EObjects. Instead, null is
	 * returned that allows creating proxies.
	 *
	 * This is intended as a workaround for special resources that throw errors
	 * if they cannot resolve the given URI but still return null (which is
	 * correct).
	 */
	private static class FilteringResourceSet extends ResourceSetImpl {

		private final Set<String> blockedSchemes = Sets.newHashSet();

		public FilteringResourceSet(String... blockedSchemes) {
			this.blockedSchemes.addAll(Arrays.asList(blockedSchemes));
		}

		@Override
		public EObject getEObject(URI uri, boolean loadOnDemand) {
			if (blockedSchemes.stream().anyMatch(s -> s.equals(uri.scheme()))) {
				return null;
			}
			return super.getEObject(uri, loadOnDemand);
		}

	}

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
		} catch (Exception e) {
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
		CDOView view = getRepositoryFolder().cdoView().getSession().openView(new FilteringResourceSet("qvto"));
		try {
			WorkspaceTransferSystem target = WorkspaceTransferSystem.INSTANCE;
			RepositoryTransferSystem source = new RepositoryTransferSystem(view);

			cleanUpFolder(workspaceFolder);

			CDOTransfer transfer = new CDOTransferUMLFirst(source, target);
			transfer.setTargetPath(workspaceFolder.getFullPath());
			transfer.map(getRepositoryFolder().getPath(), new NullProgressMonitor());

			// no default factory is registered in the CDO utilities
			transfer.getModelTransferContext().registerTargetExtension("*", new XMIResourceFactoryImpl());

			transfer.perform();

			getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} finally {
			IOUtil.closeSilent(view);
		}

	}

}
