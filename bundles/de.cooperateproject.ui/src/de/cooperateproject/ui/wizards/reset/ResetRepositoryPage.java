package de.cooperateproject.ui.wizards.reset;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ResetRepositoryPage extends WizardPage {

    private IProject project;
    private IFile file;

    protected ResetRepositoryPage(IProject project) {
        super("Reset");
        this.project = project;
        this.setPageComplete(false);
    }

    protected ResetRepositoryPage(IFile file) {
        super("Reset");
        this.file = file;
        this.setPageComplete(false);
    }

    @Override
    public void createControl(Composite parent) {
        setTitle("Choose a revision");
        setDescription("Select the revision to which the repository will be reset.");
        ResetRepositoryComposite composite;
        if (file == null) {
            composite = new ResetRepositoryComposite(parent, SWT.FILL, project, this);
        } else {
            composite = new ResetRepositoryComposite(parent, SWT.FILL, file, this);
        }
        setControl(composite);
    }

}
