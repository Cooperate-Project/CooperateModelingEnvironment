package de.cooperateproject.ui.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.preference.PreferencePage;

public class PropertiesPageValidationProcessor extends ValidationProcessor {

	private final PreferencePage page;
	private final IValidateable validateable;

	public PropertiesPageValidationProcessor(PreferencePage page, IValidateable validateable) {
		super();
		this.page = page;
		this.validateable = validateable;
	}

	@Override
	protected void setError(IStatus validationStatus) {
		page.setErrorMessage(validationStatus.getMessage());
		page.setValid(false);
	}

	@Override
	protected void setOK() {
		page.setErrorMessage(null);
		if (validateable.isValid()) {
			page.setValid(true);
		}
	}

}
