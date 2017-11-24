package de.cooperateproject.ui.wizards.model.export;

import java.io.File;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * Wizard for exporting an UML model from the Cooperate repository to the file system.
 */
public class ModelExportWizard extends Wizard implements IExportWizard {

    private final WritableValue<IProject> selectedProject = new WritableValue<>();
    private final WritableValue<String> selectedUMLModelName = new WritableValue<>();
    private final WritableValue<Long> selectedVersion = new WritableValue<>();
    private final WritableValue<File> selectedDestination = new WritableValue<>();

    @Override
    public void addPages() {
        super.addPages();
        addPage(new ModelExportPage(selectedProject, selectedUMLModelName, selectedVersion, selectedDestination));
    }

    @Override
    public boolean performFinish() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("Export Cooperate Model");
        setNeedsProgressMonitor(true);
    }

}
