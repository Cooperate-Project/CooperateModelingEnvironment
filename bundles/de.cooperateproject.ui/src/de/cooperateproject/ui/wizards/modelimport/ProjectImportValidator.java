package de.cooperateproject.ui.wizards.modelimport;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;

public class ProjectImportValidator extends MultiValidator {
    private final IObservableValue<IProject> selectedProjectName;
    private final IObservableValue<String> selectedModelName;

    /**
     * Constructs the validator.
     * 
     * @param projectName
     *            The name of the project to be imported.
     */
    public ProjectImportValidator(IObservableValue<IProject> projectName, IObservableValue<String> modelName) {
        super();
        this.selectedProjectName = projectName;
        this.selectedModelName = modelName;
    }

    @Override
    protected IStatus validate() {
        IProject project = selectedProjectName.getValue();
        String umlModelName = selectedModelName.getValue();
        if (project == null) {
            return createFailStatus("The project must not be blank.");
        }

        if (StringUtils.isBlank(umlModelName)) {
            return createFailStatus("The model name must not be blank.");
        }

        IStatus cdoCheckStatus = checkConstraintsOnCDORepository(project, umlModelName);
        if (cdoCheckStatus.getSeverity() != IStatus.OK) {
            return cdoCheckStatus;
        }

        return Status.OK_STATUS;
    }

    private static IStatus checkConstraintsOnCDORepository(IProject project, String umlModelName) {
        CDOSession cdoSession = CDOConnectionManager.getInstance().acquireSession(project);
        try {
            CDOView cdoView = cdoSession.openView();
            try {
                if (!cdoView.hasResource(project.getName())) {
                    return createFailStatus("The project does not exist in the repository.");
                }
                CDOResourceFolder folder = cdoView.getResourceFolder(project.getName());

                String trimmedModelPath = umlModelName.substring(umlModelName.lastIndexOf("\\") + 1,
                        umlModelName.length());
                if (Optional.ofNullable(folder.getNode(trimmedModelPath)).map(CDOResource.class::isInstance)
                        .orElse(false)) {
                    return createFailStatus("The model already exists in the repository.");
                }
                return Status.OK_STATUS;
            } finally {
                IOUtil.closeSilent(cdoView);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(cdoSession);
        }
    }

    private static IStatus createFailStatus(String msg) {
        return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, msg);
    }
}
