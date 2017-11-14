package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.net4j.util.io.IOUtil;

import com.google.common.base.Strings;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.wizards.modelnew.AtomicProjectNameProcessor.ProjectName;

public class CompoundNameValidator extends MultiValidator {

    private final IObservableValue<String> observedDiagramName;
    private final IObservableValue<String> observedModelName;
    private final IObservableValue<ProjectName> observedProject;

    public CompoundNameValidator(IObservableValue<String> observedDiagramName,
            IObservableValue<String> observedModelName, IObservableValue<ProjectName> observedProject) {
        super();
        this.observedDiagramName = observedDiagramName;
        this.observedModelName = observedModelName;
        this.observedProject = observedProject;
    }

    @Override
    protected IStatus validate() {
        // this should be handled by the validators / converters before
        String modelName = observedModelName.getValue();
        String diagramName = observedDiagramName.getValue();
        ProjectName project = observedProject.getValue();
        if (project == null || Strings.isNullOrEmpty(modelName) || Strings.isNullOrEmpty(diagramName)) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "The specifications of the project, model and the diagram name must not be empty.");
        }

        // check for duplicated diagram names

        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project.getProject());
        try {
            CDOView view = session.openView();
            try {
                if (!view.hasResource(String.format("%s/%s.%s", project.getProjectName(), modelName, "notation"))) {
                    return Status.OK_STATUS;
                }

                CDOResource model = view
                        .getResource(String.format("%s/%s.%s", project.getProjectName(), modelName, "notation"));
                if (model.getContents().stream().filter(NotationPackage.Literals.DIAGRAM::isInstance)
                        .map(Diagram.class::cast).map(Diagram::getName).anyMatch(diagramName::equals)) {
                    return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                            String.format("The diagram name \"%s\" already exists in the given model.", diagramName));
                }

                return Status.OK_STATUS;
            } finally {
                IOUtil.closeSilent(view);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }
    }

}
