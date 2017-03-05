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

	private SubscriberManager subscriberMgr;
	private IFile currentFile = null;
	private static final String address = "tcp://localhost:61616";
	private TopicConnection connection = null;

	private static Logger logger = Logger.getLogger(ConnectionManager.class);

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
				subscriberMgr.initialize(connection, file.getName());
				subscriberMgr.subscribe();
			} else if (currentFile != file) {
				currentFile = file;
				subscriberMgr.unsubscribe();
				subscriberMgr.initialize(connection, file.getName());
				subscriberMgr.subscribe();
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
				subscriberMgr.disconnect();
				connection.close();
			} catch (JMSException e) {
				logger.error("Couldn't close the connection to the message broker.", e);
			}
		}
	}

	public IFile getFile() {
		return currentFile;
	}

	public void setSubscriberManager(SubscriberManager subscriberMgr) {
		this.subscriberMgr = subscriberMgr;
	}
}
