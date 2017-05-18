package de.cooperateproject.ui.wizards.projectnew;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.ui.properties.ProjectPropertiesComposite;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.util.WizardPageValidationProcessor;

public class CDOConfigurationWizardPage extends WizardPage {

    private final ProjectPropertiesDTO projectProperties;
    private WizardPageValidationProcessor validatorHandler;
    ProjectPropertiesComposite propertiesComposite;

    public CDOConfigurationWizardPage(ProjectPropertiesDTO projectProperties) {
        super("CDO Connection Properties");
        setTitle("CDO Connection");
        setDescription("Configure your CDO Connection");
        this.projectProperties = projectProperties;
    }

    @Override
    public void createControl(Composite parent) {
        validatorHandler = new WizardPageValidationProcessor(this, projectProperties);
        propertiesComposite = new ProjectPropertiesComposite(parent, SWT.FILL, projectProperties, validatorHandler);
        setControl(propertiesComposite);
    }

    @Override
    public void dispose() {
        validatorHandler.stop();
        super.dispose();
    }

    public ProjectPropertiesDTO getProjectProperties() {
        return projectProperties;
    }

    public void triggerValidation() {
        String cdoRepo = projectProperties.getCdoRepo();
        projectProperties.setCdoRepo(cdoRepo + "0");
        projectProperties.setCdoRepo(cdoRepo);
    }
}
