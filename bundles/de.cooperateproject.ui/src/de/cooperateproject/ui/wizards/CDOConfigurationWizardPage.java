package de.cooperateproject.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.ui.properties.ProjectPropertiesComposite;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public class CDOConfigurationWizardPage extends WizardPage {

	private ProjectPropertiesDTO projectProperties;

	protected CDOConfigurationWizardPage() {
		super("CDO Connection Properties");
		setTitle("CDO Connection");
		setDescription("Configure your CDO Connection");
		projectProperties = new ProjectPropertiesDTO();
	}

	@Override
	public void createControl(Composite parent) {
		setControl(new ProjectPropertiesComposite(parent, INFORMATION, projectProperties));
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	public ProjectPropertiesDTO getProjectProperties() {
		return projectProperties;
	}

}
