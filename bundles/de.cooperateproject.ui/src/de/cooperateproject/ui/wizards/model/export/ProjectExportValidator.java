package de.cooperateproject.ui.wizards.model.export;

import java.io.File;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;

/**
 * Validator for all inputs required for a model export.
 */
public class ProjectExportValidator extends MultiValidator {

    private final IObservableValue<IProject> selectedProject;
    private final IObservableValue<String> selectedUMLModelName;
    private final IObservableValue<CDOCommitInfo> selectedVersion;
    private final IObservableValue<File> selectedDestination;

    /**
     * Constructs the validator.
     * 
     * @param selectedProject
     *            The project that contains the model.
     * @param selectedUMLModelName
     *            The name of the model to be exported.
     * @param selectedVersion
     *            The version of the model to be exported.
     * @param selectedDestination
     *            The destination to write the model to.
     */
    public ProjectExportValidator(IObservableValue<IProject> selectedProject,
            IObservableValue<String> selectedUMLModelName, IObservableValue<CDOCommitInfo> selectedVersion,
            IObservableValue<File> selectedDestination) {
        super();
        this.selectedProject = selectedProject;
        this.selectedUMLModelName = selectedUMLModelName;
        this.selectedVersion = selectedVersion;
        this.selectedDestination = selectedDestination;
    }

    @Override
    protected IStatus validate() {
        IProject project = selectedProject.getValue();
        String umlModelName = selectedUMLModelName.getValue();
        CDOCommitInfo version = selectedVersion.getValue();
        File destination = selectedDestination.getValue();

        if (project == null) {
            return createFailStatus("The project must not be blank.");
        }

        if (!project.exists()) {
            return createFailStatus("The project does not exist locally.");
        }

        if (StringUtils.isBlank(umlModelName)) {
            return createFailStatus("The model name must not be blank.");
        }

        IStatus cdoCheckStatus = checkConstraintsOnCDORepository(project, umlModelName, version);
        if (cdoCheckStatus.getSeverity() != IStatus.OK) {
            return cdoCheckStatus;
        }

        if (destination == null) {
            return createFailStatus("The destination must not be blank.");
        }

        if (!destination.exists()) {
            return createFailStatus("The destination does not exist.");
        }

        if (!destination.isDirectory()) {
            return createFailStatus("The destination has to be a directory.");
        }

        IStatus destinationCheckStatus = checkIfDestinationIsEmpty(destination);
        if (destinationCheckStatus.getSeverity() != IStatus.OK) {
            return destinationCheckStatus;
        }

        return Status.OK_STATUS;
    }

    private static IStatus checkConstraintsOnCDORepository(IProject project, String umlModelName,
            CDOCommitInfo version) {
        CDOSession cdoSession = CDOConnectionManager.getInstance().acquireSession(project);
        try {
            CDOView cdoView = cdoSession.openView();
            try {
                if (!cdoView.hasResource(project.getName())) {
                    return createFailStatus("The project does not exist in the repository.");
                }
                CDOResourceFolder folder = cdoView.getResourceFolder(project.getName());

                if (!Optional.ofNullable(folder.getNode(umlModelName)).map(CDOResource.class::isInstance)
                        .orElse(false)) {
                    return createFailStatus("The model does not exist in the repository.");
                }

                if (version == null) {
                    return createFailStatus("The version has to be set.");
                }

                CDOCommitInfo newCommitInfo = cdoView.getHistory().getManager().getCommitInfo(version.getTimeStamp());
                if (newCommitInfo.getTimeStamp() != version.getTimeStamp()) {
                    return createFailStatus("The version is invalid.");
                }

                return Status.OK_STATUS;
            } finally {
                IOUtil.closeSilent(cdoView);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(cdoSession);
        }
    }

    private static IStatus checkIfDestinationIsEmpty(File destination) {
        if (destination.listFiles().length != 0) {
            return createFailStatus("The destination has to be empty. Please choose another one.");
        }
        return Status.OK_STATUS;
    }

    private static IStatus createFailStatus(String msg) {
        return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, msg);
    }

}