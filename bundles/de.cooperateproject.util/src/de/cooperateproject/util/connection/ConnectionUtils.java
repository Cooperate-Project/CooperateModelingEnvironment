package de.cooperateproject.util.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.eclipse.net4j.util.io.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author persch
 *
 */
public final class ConnectionUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionUtils.class);

    private ConnectionUtils() {
        // intentionally left blank
    }

    /**
     * Checks whether a socket can establish a connection with the given connection information.
     * 
     * @param host
     *            IP address of the server
     * @param port
     *            port number of the server
     * @param timeout
     *            timeout value used in milliseconds.
     * @return true if a connection can be established, otherwise false.
     */
    public static boolean checkSocket(String host, int port, int timeout) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(InetAddress.getByName(host), port), timeout);
        } catch (IOException e) {
            LOGGER.trace("Could not connect to server.", e);
            return false;
        } finally {
            IOUtil.closeSilent(socket);
        }
        return true;
    }

}
