package de.cooperateproject.util.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.jms.Connection;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;
import org.eclipse.net4j.util.io.IOUtil;

/**
 * @author persch
 *
 */
public final class ConnectionUtils {

    private static final Logger LOGGER = Logger.getLogger(ConnectionUtils.class);

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

    /**
     * Checks whether a connection to the message broker can be established with the given connection information.
     * 
     * @param host
     *            IP address of the server
     * @param msgPort
     *            port number of the message broker
     * @return true if connection can be established, false otherwise.
     */
    public static boolean msgBrokerConnectionInfoIsValid(String host, int msgPort) {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://" + host + ":" + msgPort);
        Connection connection = null;
        try {
            connection = connectionFactory.createConnection();
            connection.start();
        } catch (JMSException e) {
            LOGGER.trace("Could not connect to message broker.", e);
            return false;
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (JMSException e) {
                LOGGER.trace("Could not close ActiveMQConnection.", e);
            }
        }
        return true;
    }

}
