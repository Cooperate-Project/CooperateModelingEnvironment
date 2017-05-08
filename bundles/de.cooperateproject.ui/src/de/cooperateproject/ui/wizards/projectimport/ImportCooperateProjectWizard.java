package de.cooperateproject.ui.wizards.projectimport;

import java.io.IOException;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.nature.CooperateProjectNature;
import de.cooperateproject.ui.nature.NatureUtils;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;
import de.cooperateproject.ui.wizards.projectnew.CDOConfigurationWizardPage;

public class ImportCooperateProjectWizard extends Wizard implements IImportWizard {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImportCooperateProjectWizard.class);
    private IStructuredSelection selection;
    private CDOConfigurationWizardPage cdoPage;
    private ImportWizardPage importPage;
    private boolean importPageShown = false;
    private boolean connectionInfoValidated = false;
    private ProjectPropertiesDTO projectProperties = ProjectPropertiesStore.getDefaults();

    public ImportCooperateProjectWizard() {
        super();
        setWindowTitle("Import Cooperate Project");
    }

    @Override
    public void addPages() {
        super.addPages();
        cdoPage = new CDOConfigurationWizardPage(projectProperties);
        addPage(cdoPage);
        importPage = new ImportWizardPage(selection);
        addPage(importPage);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
    }

    @Override
    public boolean canFinish() {
        if (!connectionInfoValidated && getContainer().getCurrentPage() == cdoPage) {
            connectionInfoValidated = true;
            cdoPage.triggerValidation();
        }
        if (getContainer().getCurrentPage() == importPage) {
            importPageShown = true;
            importPage.triggerFillTable(projectProperties);
        } else {
            importPageShown = false;
        }
        boolean baseCanFinish = super.canFinish();

        return importPageShown && baseCanFinish;
    }

    @Override
    public boolean performFinish() {
        Set<String> selectedProjects = CooperateProjectImportComposite.getSelectedProjects();
        if (!selectedProjects.isEmpty()) {
            for (String projectName : selectedProjects) {
                IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
                IProject project = root.getProject(projectName);
                try {
                    project.create(null);
                    project.open(null);
                    NatureUtils.addNatureToProject(project, CooperateProjectNature.NATURE_ID);
                    ProjectPropertiesStore propertiesStore = new ProjectPropertiesStore(project);
                    propertiesStore.setPreferences(cdoPage.getProjectProperties());
                    propertiesStore.saveToStore();
                    project.close(null);
                    project.open(null);
                } catch (CoreException e) {
                    LOGGER.error("Could not import the project " + projectName + ".", e);
                    return false;
                } catch (IOException e) {
                    LOGGER.error("Exception when storing project properties for project " + projectName + ".", e);
                    return false;
                }
            }
        }
        return true;
    }
}
