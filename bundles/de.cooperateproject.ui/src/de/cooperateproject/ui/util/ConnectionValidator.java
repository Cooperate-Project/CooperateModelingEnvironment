package de.cooperateproject.ui.util;

import de.cooperateproject.cdo.util.utils.CDOHelper;
import de.cooperateproject.util.connection.ConnectionUtils;

/**
 * @author persch
 *
 */
public final class ConnectionValidator {

    private ConnectionValidator() {
        // intentionally left blank
    }

    /**
     * Checks whether a connection to the message broker and CDO server can be established with the given connection
     * information.
     * 
     * @param host
     *            IP address of the server
     * @param port
     *            port number of the server
     * @param repository
     *            name of the repository
     * @param msgPort
     *            port number of the message broker
     * @param timeout
     *            timeout value used in milliseconds.
     * @return
     */
    public static boolean connectionInfoIsValid(String host, int port, String repository, int msgPort, int timeout) {
        return ConnectionUtils.msgBrokerConnectionInfoIsValid(host, msgPort)
                && CDOHelper.cdoConnectionInfoIsValid(host, port, repository, timeout);
    }
}
