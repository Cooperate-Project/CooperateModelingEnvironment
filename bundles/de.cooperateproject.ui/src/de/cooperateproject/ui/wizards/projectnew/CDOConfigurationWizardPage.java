package de.cooperateproject.ui.wizards.projectnew;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.ui.properties.ProjectPropertiesComposite;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;
import de.cooperateproject.ui.util.WizardPageValidationProcessor;

public class CDOConfigurationWizardPage extends WizardPage {

	private final ProjectPropertiesDTO projectProperties;
	private WizardPageValidationProcessor validatorHandler;

	protected CDOConfigurationWizardPage() {
		super("CDO Connection Properties");
		setTitle("CDO Connection");
		setDescription("Configure your CDO Connection");
		projectProperties = ProjectPropertiesStore.getDefaults();
	}

	@Override
	public void createControl(Composite parent) {
		validatorHandler = new WizardPageValidationProcessor(this, projectProperties);
		setControl(new ProjectPropertiesComposite(parent, SWT.FILL, projectProperties, validatorHandler));
	}
	
	@Override
	public void dispose() {
		validatorHandler = null;
		super.dispose();
	}

	public ProjectPropertiesDTO getProjectProperties() {
		return projectProperties;
	}
	
}
