package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ModelAndDiagramSelectionPage extends WizardPage {
	
	private final SelectedNamesDTO dto = new SelectedNamesDTO();
	
	public ModelAndDiagramSelectionPage(IStructuredSelection selection) {
		super("New");
	}

	@Override
	public void createControl(Composite parent) {
		setTitle("Model and Diagram Selection");
		setPageComplete(false);
		setDescription("Select the target model and the new diagram name.");
		setControl(new ModelAndDiagramSelectionComposite(parent, SWT.FILL, dto, this::handleValidationStatusChange));
	}
	
	public SelectedNamesDTO getDTO() {
		return dto;
	}
	
	private void handleValidationStatusChange(ChangeEvent e) {
		AggregateValidationStatus status = (AggregateValidationStatus)e.getObservable();
		IStatus validationStatus = status.getValue();
		if (validationStatus.getSeverity() == IStatus.OK) {
			setOK();
		} else {
			setError(validationStatus);
		}
	}
	
	private void setError(IStatus validationStatus) {
		setErrorMessage(validationStatus.getMessage());
		setPageComplete(false);	
	}

	private void setOK() {
		setErrorMessage(null);
		if (dto.isValid()) {
			setPageComplete(true);
		}
	}

}
