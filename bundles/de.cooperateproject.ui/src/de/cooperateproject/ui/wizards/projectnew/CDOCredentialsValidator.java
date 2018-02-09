package de.cooperateproject.ui.wizards.projectnew;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.util.ConnectionValidator;

/**
 * MultiValidator which validates given connection information for a CDO server.
 * 
 * @author seifermann, persch
 *
 */
public class CDOCredentialsValidator extends MultiValidator {

    private final IObservableValue<String> observedHost;
    private final IObservableValue<Integer> observedPort;
    private final IObservableValue<String> observedRepo;

    /**
     * Constructor for CDOCredentialsValidator.
     * 
     * @param observedHost
     *            URL of repository to be validated.
     * @param observedPort
     *            Port of repository to be validated.
     * @param observedRepo
     *            Name of repository to be validated.
     */
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

    /**
     * Checks whether a connection can be established with given connection information.
     * 
     * @param host
     *            URL of repository.
     * @param port
     *            Port of repository.
     * @param repository
     *            Name of repository.
     * @return Returns Status.OK_STATUS if successful, IStatus.ERROR otherwise.
     */
    public static IStatus validate(String host, int port, String repository) {
        if (ConnectionValidator.connectionInfoIsValid(host, port, repository, 1000)) {
            return Status.OK_STATUS;
        }
        return createFailedConnectionStatus();
    }

    private static IStatus createFailedConnectionStatus() {
        return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Connection to the repository was not successful.");
    }

}
