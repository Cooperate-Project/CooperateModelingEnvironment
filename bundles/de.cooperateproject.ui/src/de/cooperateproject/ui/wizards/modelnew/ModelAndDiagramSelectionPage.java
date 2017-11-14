package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.ui.util.WizardPageValidationProcessor;

public class ModelAndDiagramSelectionPage extends WizardPage {

    private final SelectedNamesDTO dto = new SelectedNamesDTO();
    private WizardPageValidationProcessor validatorHandler;

    public ModelAndDiagramSelectionPage(IStructuredSelection selection) {
        super("New");
    }

    @Override
    public void createControl(Composite parent) {
        validatorHandler = new WizardPageValidationProcessor(this, dto);
        setTitle("Model and Diagram Selection");
        setPageComplete(false);
        setDescription("Select the target model and the new diagram name.");
        ModelAndDiagramSelectionComposite composite = new ModelAndDiagramSelectionComposite(parent, SWT.FILL, dto,
                validatorHandler);
        composite.triggerValidation();
        setControl(composite);

    }

    public SelectedNamesDTO getDTO() {
        return dto;
    }

}
