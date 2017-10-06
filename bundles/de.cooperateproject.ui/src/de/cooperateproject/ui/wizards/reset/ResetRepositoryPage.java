package de.cooperateproject.ui.wizards.reset;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * Wizard page for selecting a revision from a list.
 */
public class ResetRepositoryPage extends WizardPage {

    private IResource resource;

    protected ResetRepositoryPage(IResource resource) {
        super("Reset");
        this.resource = resource;
        this.setPageComplete(false);
    }

    @Override
    public void createControl(Composite parent) {
        setTitle("Choose a revision");
        setDescription("Select the revision to which the repository will be reset.");
        ResetRepositoryComposite composite;
        composite = new ResetRepositoryComposite(parent, SWT.FILL, resource, this);
        setControl(composite);
    }

}
