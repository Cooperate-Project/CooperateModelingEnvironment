package de.cooperateproject.ui.wizards;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import de.cooperateproject.ui.nature.CooperateProjectNature;
import de.cooperateproject.ui.nature.NatureUtils;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;

public class NewCooperateProjectWizard extends BasicNewProjectResourceWizard implements INewWizard {

	private static final Logger LOGGER = Logger.getLogger(NewCooperateProjectWizard.class);

	private CDOConfigurationWizardPage cdoPage;

	public NewCooperateProjectWizard() {
		super();
		setWindowTitle("New Cooperate Project");
	}

	@Override
	public void addPages() {
		super.addPages();
		cdoPage = new CDOConfigurationWizardPage();
		addPage(cdoPage);
	};

	@Override
	public boolean canFinish() {
		return super.canFinish();
	};

	@Override
	public boolean performFinish() {
		boolean superResult = super.performFinish();
		IProject project = getNewProject();

		IWorkspaceRunnable addCooperateProperties = new IWorkspaceRunnable() {
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				try {
					NatureUtils.addNatureToProject(project, CooperateProjectNature.NATURE_ID);
					ProjectPropertiesStore propertiesStore = new ProjectPropertiesStore(project);
					propertiesStore.setPreferences(cdoPage.getProjectProperties());
					propertiesStore.saveToStore();
				} catch (CoreException e) {
					LOGGER.error("Exception when initializing new Cooperate project", e);
				} catch (IOException e) {
					LOGGER.error("Exception when storing project properties", e);
				}
			}
		};
		
		try {
			ResourcesPlugin.getWorkspace().run(addCooperateProperties, null);
		} catch (CoreException e) {
			LOGGER.error("Exception when adding Cooperate porject properties", e);
		}
		return superResult;
	}

}
