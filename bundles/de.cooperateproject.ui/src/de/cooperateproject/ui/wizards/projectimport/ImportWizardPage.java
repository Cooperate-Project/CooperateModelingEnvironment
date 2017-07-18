package de.cooperateproject.ui.wizards.projectimport;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

/**
 * ImportWizardPage used to import cooperate projects from a CDO server.
 * 
 * @author persch
 *
 */
public class ImportWizardPage extends WizardPage {

    protected ImportWizardPage() {
        super("Import");
    }

    @Override
    public void createControl(Composite parent) {
        setTitle("Choose Cooperate Project");
        setDescription("Select the Cooperate Project to import.");
        this.setPageComplete(false);
        CooperateProjectImportComposite composite = new CooperateProjectImportComposite(parent, SWT.FILL, this);
        setControl(composite);
    }

    /**
     * Calls fillTable in CooperateProjectImportComposite.
     * 
     * @param projectProperties
     *            Stores the connection information for the CDO server which stores the cooperate projects.
     */
    public void triggerFillTable(ProjectPropertiesDTO projectProperties) {
        CooperateProjectImportComposite.fillTable(projectProperties);
    }
}
