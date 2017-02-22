package de.cooperateproject.ui.wizards.projectnew;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.util.ConnectionValidator;

public class CDOCredentialsValidator extends MultiValidator {

    private final IObservableValue<String> observedHost;
    private final IObservableValue<Integer> observedPort;
    private final IObservableValue<String> observedRepo;
    private final IObservableValue<Integer> observedMsgPort;

    public CDOCredentialsValidator(IObservableValue<String> observedHost, IObservableValue<Integer> observedPort,
            IObservableValue<String> observedRepo, IObservableValue<Integer> observedMsgPort) {
        super();
        this.observedHost = observedHost;
        this.observedPort = observedPort;
        this.observedRepo = observedRepo;
        this.observedMsgPort = observedMsgPort;
    }

    @Override
    protected IStatus validate() {
        String host = observedHost.getValue();
        Integer port = observedPort.getValue();
        String repository = observedRepo.getValue();
        Integer msgPort = observedMsgPort.getValue();
        return validate(host, port, repository, msgPort);
    }

    public static IStatus validate(String host, int port, String repository, int msgPort) {
        if (ConnectionValidator.connectionInfoIsValid(host, port, repository, msgPort, 1000)) {
            return Status.OK_STATUS;
        }
        return createFailedConnectionStatus();
    }

    private static IStatus createFailedConnectionStatus() {
        return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Connection to the repository was not successful.");
    }

}
