package de.cooperateproject.ui.wizards.model.export;

import java.io.File;
import java.util.Optional;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * Wizard page that contains all information necessary for exporting a UML model to the file system.
 */
public class ModelExportPage extends WizardPage {

    private final WritableValue<IStatus> validationError = new WritableValue<>(null, IStatus.class);
    private final WritableValue<IProject> selectedProject;
    private final WritableValue<String> selectedUMLModelName;
    private final WritableValue<Long> selectedVersion;
    private final WritableValue<File> selectedDestination;

    protected ModelExportPage(WritableValue<IProject> selectedProject, WritableValue<String> selectedUMLModelName,
            WritableValue<Long> selectedVersion, WritableValue<File> selectedDestination) {
        super("Model Export");
        this.selectedProject = selectedProject;
        this.selectedUMLModelName = selectedUMLModelName;
        this.selectedVersion = selectedVersion;
        this.selectedDestination = selectedDestination;
    }

    @Override
    public void createControl(Composite parent) {
        setTitle("Cooperate Model Export");
        setDescription("Export a model and all associated diagrams to the file system.");
        setPageComplete(false);
        validationError.addChangeListener(e -> handleValidationErrorChange());
        ModelExportPageComposite composite = new ModelExportPageComposite(parent, SWT.FILL, selectedProject,
                selectedUMLModelName, selectedVersion, selectedDestination, validationError);
        composite.triggerValidation();
        setControl(composite);
    }

    private void handleValidationErrorChange() {
        Optional<IStatus> firstError = Optional.ofNullable(validationError.getValue())
                .filter(s -> s.getSeverity() != IStatus.OK);
        if (!firstError.isPresent()) {
            this.setErrorMessage(null);
            setPageComplete(true);
        } else {
            this.setErrorMessage(firstError.get().getMessage());
            setPageComplete(false);
        }
    }

}