package de.cooperateproject.ui.wizards.projectimport;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public class ImportWizardPage extends WizardPage {

    protected ImportWizardPage(IStructuredSelection selection) {
        super("Import");
    }

    @Override
    public void createControl(Composite parent) {
        setTitle("Choose Cooperate Project");
        setDescription("Select the Cooperate Project to import.");
        CooperateProjectImportComposite composite = new CooperateProjectImportComposite(parent, SWT.FILL);
        setControl(composite);
    }

    public void triggerFillTable(ProjectPropertiesDTO projectProperties) {
        CooperateProjectImportComposite.fillTable(projectProperties);
    }
}
