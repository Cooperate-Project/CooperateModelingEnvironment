package de.cooperateproject.ui.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.wizard.WizardPage;

public class WizardPageValidationProcessor extends ValidationProcessor {

	private final WizardPage page;
	private final IValidateable validateable;
	
	public WizardPageValidationProcessor(WizardPage page, IValidateable validateable) {
		super();
		this.page = page;
		this.validateable = validateable;
	}

	@Override
	protected void setError(IStatus validationStatus) {
		page.setErrorMessage(validationStatus.getMessage());
		page.setPageComplete(false);	
	}

	@Override
	protected void setOK() {
		page.setErrorMessage(null);
		if (validateable.isValid()) {
			page.setPageComplete(true);
		}
	}
	
}
