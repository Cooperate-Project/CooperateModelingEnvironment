package de.cooperateproject.ui.wizards.projectnew;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.cdo.util.utils.CDOHelper;
import de.cooperateproject.ui.Activator;

public class CDOCredentialsValidator extends MultiValidator {
	
	private final IObservableValue<String> observedHost;
	private final IObservableValue<Integer> observedPort;
	private final IObservableValue<String> observedRepo;

	public CDOCredentialsValidator(IObservableValue<String> observedHost, IObservableValue<Integer> observedPort,
			IObservableValue<String> observedRepo) {
		super();
		this.observedHost = observedHost;
		this.observedPort = observedPort;
		this.observedRepo = observedRepo;
	}

	@Override
	protected IStatus validate() {
		String host = observedHost.getValue();
		Integer port = observedPort.getValue();
		String repository = observedRepo.getValue();
		return validate(host, port, repository);
	}
	
	public static IStatus validate(String host, int port, String repository) {
		if (CDOHelper.connectionInfoIsValid(host, port, repository, 1000)) {
			return Status.OK_STATUS;							
		}
		return createFailedConnectionStatus();
	}
	
	private static IStatus createFailedConnectionStatus() {
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Connection to the repository was not successful.");
	}
	
}
