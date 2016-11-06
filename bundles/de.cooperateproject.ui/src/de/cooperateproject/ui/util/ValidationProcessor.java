package de.cooperateproject.ui.util;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.runtime.IStatus;

public abstract class ValidationProcessor implements IChangeListener {
	
	private boolean run = true;
	
	public void stop() {
		run = false;
	}
	
	@Override
	public void handleChange(ChangeEvent event) {
		if (run) {
			handleValidationStatusChange(event);			
		}
	}
	
	private void handleValidationStatusChange(ChangeEvent e) {
		AggregateValidationStatus status = (AggregateValidationStatus)e.getObservable();
		IStatus validationStatus = status.getValue();
		if (validationStatus.getSeverity() == IStatus.OK) {
			setOK();
		} else {
			setError(validationStatus);
		}
	}
	
	protected abstract void setError(IStatus validationStatus);

	protected abstract void setOK();

}
