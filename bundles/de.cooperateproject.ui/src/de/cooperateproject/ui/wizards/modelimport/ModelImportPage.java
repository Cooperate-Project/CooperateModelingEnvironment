package de.cooperateproject.ui.wizards.modelimport;

import java.util.Optional;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * Wizard page that contains all information necessary for importing a UML model to the Cooperate repository.
 */
public class ModelImportPage extends WizardPage {

    private final WritableValue<IStatus> validationError = new WritableValue<>(null, IStatus.class);
    private final WritableValue<IProject> selectedProjectName;
    private final WritableValue<String> selectedUMLModelName;

    public ModelImportPage(WritableValue<IProject> selectedProject, WritableValue<String> selectedUMLModelName) {
        super("Model Import");
        this.selectedProjectName = selectedProject;
        this.selectedUMLModelName = selectedUMLModelName;
    }

    @Override
    public void createControl(Composite parent) {
        setTitle("Cooperate Model Import");
        setDescription("Import a model and all associated diagrams to the repository.");
        setPageComplete(false);
        validationError.addChangeListener(e -> handleValidationErrorChange());
        ModelImportPageComposite composite = new ModelImportPageComposite(parent, SWT.FILL, selectedProjectName,
                selectedUMLModelName, validationError);
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
