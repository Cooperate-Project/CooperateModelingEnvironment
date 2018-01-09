package de.cooperateproject.ui.util;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.io.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.util.connection.ConnectionUtils;

/**
 * @author persch
 *
 */
public final class ConnectionValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionValidator.class);

    private ConnectionValidator() {
        // intentionally left blank
    }

    /**
     * Checks whether a connection to the CDO server can be established with the given connection
     * information.
     * 
     * @param host
     *            IP address of the server
     * @param port
     *            port number of the server
     * @param repository
     *            name of the repository
     * @param timeout
     *            timeout value used in milliseconds.
     * @return
     */
    public static boolean connectionInfoIsValid(String host, int port, String repository, int timeout) {
        return cdoConnectionInfoIsValid(host, port, repository, timeout);
    }

    private static boolean cdoConnectionInfoIsValid(String host, int port, String repository, int timeout) {
        if (!ConnectionUtils.checkSocket(host, port, timeout)) {
            return false;
        }

        IManagedContainer container = ContainerUtil.createPluginContainer();
        try {
            container.activate();

            String connectionString = String.format("%s:%d", host, port);
            IConnector connector = Net4jUtil.getConnector(container, "tcp", connectionString);
            try {
                CDOSession session = null;
                try {
                    CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
                    sessionConfiguration.setConnector(connector);
                    sessionConfiguration.setRepositoryName(repository);
                    session = sessionConfiguration.openNet4jSession();
                } catch (Exception e) {
                    LOGGER.trace("Could not establish connection to CDO server.", e);
                    return false;
                } finally {
                    if (session != null) {
                        IOUtil.closeSilent(session);
                    }
                }
                return true;
            } finally {
                IOUtil.closeSilent(connector);
            }
        } finally {
            try {
                container.deactivate();
            } catch (Exception e) {
                LOGGER.trace("Error while trying to deactivate IManagedContainer.", e);
            }
        }

    }
}
