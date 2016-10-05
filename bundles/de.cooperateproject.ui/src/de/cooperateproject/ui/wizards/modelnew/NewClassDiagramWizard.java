package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public class NewClassDiagramWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private SelectedNamesDTO selectedNames;

	public NewClassDiagramWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public void addPages() {
		super.addPages();
		ModelAndDiagramSelectionPage page = new ModelAndDiagramSelectionPage(selection);
		selectedNames = page.getDTO();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		IProject project = selectedNames.getSelectedModelName().getProject();
		String modelName = selectedNames.getSelectedModelName().getModelName();
		String diagramName = selectedNames.getSelectedDiagramName();
		
		IStatus status = ModelCreator.createDiagram(project, modelName, diagramName, DiagramTypes.CLASS);
		return status.getSeverity() == IStatus.OK;
	}

}
