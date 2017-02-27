package de.cooperateproject.ui.focus.connection;

import org.apache.activemq.ActiveMQConnection;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;

import java.net.URISyntaxException;

import javax.jms.JMSException;
import javax.jms.TopicConnection;

/**
 * Establishes and manages the connection to the message broker.
 * 
 * @author Jasmin
 *
 */
public class ConnectionManager {

	private static ConnectionManager instance = null;
	private IFile currentFile = null;
	private static final String address = "tcp://localhost:61616";
	private TopicConnection connection = null;

	private static Logger logger = Logger.getLogger(ConnectionManager.class);

	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}

	/**
	 * Starts a connection to the Apache ActiveMQ message broker and initializes
	 * the SubscriberManager.
	 * 
	 * @param file
	 *            the file which was selected by the user
	 */
	public void connect(IFile file) {

		try {
			if (currentFile == null) {
				currentFile = file;
				connection = ActiveMQConnection.makeConnection(address);
				connection.start();
				SubscriberManager.getInstance().initialize(connection, file.getName());
				SubscriberManager.getInstance().subscribe();
			} else if (currentFile != file) {
				currentFile = file;
				SubscriberManager.getInstance().unsubscribe();
				SubscriberManager.getInstance().initialize(connection, file.getName());
				SubscriberManager.getInstance().subscribe();
			}
		} catch (JMSException | URISyntaxException e) {
			logger.error("Couldn't connect to the messagebroker.", e);
		}

	}

	/**
	 * Disconnects from the message broker.
	 */
	public void disconnect() {
		currentFile = null;
		if (connection != null) {
			try {
				SubscriberManager.getInstance().disconnect();
				connection.close();
				instance = null;
			} catch (JMSException e) {
				logger.error("Couldn't close the connection to the message broker.", e);
			}
		}
	}

	public IFile getFile() {
		return currentFile;
	}

}
