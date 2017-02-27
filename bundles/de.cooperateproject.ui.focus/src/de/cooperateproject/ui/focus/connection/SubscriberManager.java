package de.cooperateproject.ui.focus.connection;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.focus.views.FocusView;

/**
 * Subscribes and unsubscribes the topic of the connection when needed. Handles
 * message recieving and sending upon the message broker.
 * 
 * @author Jasmin
 *
 */
public class SubscriberManager implements javax.jms.MessageListener {

	private static SubscriberManager instance = null;
	private FocusView view = null;
	private Topic topic = null;
	private TopicSubscriber subscriber = null;
	private TopicPublisher publisher = null;
	private TopicSession topicSession = null;
	private boolean isInitialized = false;
	private CDOSession cdoSession;
	private CDOView cdoView;
	private static Logger logger = Logger.getLogger(SubscriberManager.class);

	public static SubscriberManager getInstance() {
		if (instance == null) {
			instance = new SubscriberManager();
		}
		return instance;
	}

	/**
	 * Creates the topicSession with the title of the selected file's.
	 * 
	 * @param connection
	 *            the topicConnection on which the session should be created.
	 * @param fileName
	 *            the name of the file which the user selected
	 */
	public void initialize(TopicConnection connection, String fileName) {
		try {
			topicSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
			topic = topicSession.createTopic(fileName);
			publisher = topicSession.createPublisher(topic);

			cdoSession = CDOConnectionManager.getInstance()
					.acquireSession(ConnectionManager.getInstance().getFile().getProject());
			cdoView = cdoSession.openView();
			isInitialized = true;

		} catch (JMSException e) {
			logger.error("Something went wrong while initializing the topic or the publisher.", e);
		}

	}

	/**
	 * Subscribes to the topicSession.
	 */
	public void subscribe() {
		if (!isInitialized) {
			return;
		}
		try {
			// only one subscriber should exist
			unsubscribe();
			// noLocal attribute is true, so that the user won't be informed
			// about his own focus request
			subscriber = topicSession.createSubscriber(topic, null, true);
			subscriber.setMessageListener(this);
		} catch (JMSException e) {
			logger.error("Couldn't create a subscriber for the topicSession.", e);
		}
	}

	/**
	 * Unsubscribes from the topicSession.
	 */
	public void unsubscribe() {
		try {
			if (subscriber != null) {
				subscriber.close();
			}
		} catch (JMSException e) {
			logger.error("Couldn't close the subscriber.", e);
		}
	}

	/**
	 * Unsubscribes from the topicSession and closes it.
	 */
	public void disconnect() {
		if (!isInitialized) {
			return;
		}

		try {
			cdoView.close();
			CDOConnectionManager.getInstance().releaseSession(cdoSession);
			unsubscribe();
			topicSession.close();
			instance = null;
		} catch (JMSException e) {
			logger.error("Couldn't close the topicSession.", e);
		}

	}

	/**
	 * Sets the view of the plugin.
	 * 
	 * @param pView
	 */
	public void setView(FocusView pView) {
		view = pView;
	}

	/**
	 * Sends a text message with the CDOID of the given EObject as content. This
	 * represents a focus request.
	 * 
	 * @param obj
	 */
	public void sendFocusRequest(EObject obj) {
		if (!isInitialized) {
			return;
		}
		CDOID id = CDOUtil.getCDOObject(obj).cdoID();
		try {
			StringBuilder builder = new StringBuilder();
			CDOIDUtil.write(builder, id);
			TextMessage msg = topicSession.createTextMessage(builder.toString());
			publisher.publish(msg);
		} catch (JMSException e) {
			logger.error("Couldn't send the text message.", e);
		}

	}

	@Override
	/**
	 * Receives focus requests and gets the EObject from the received CDOID.
	 * Tells the view/the user that a focus request has been received.
	 */
	public void onMessage(Message msg) {
		try {
			if (!(msg instanceof TextMessage)) {
				return;
			}

			TextMessage message = (TextMessage) msg;

			String text = message.getText();

			CDOID id = CDOIDUtil.read(text);
			CDOObject focusedObject = cdoView.getObject(id);
			if (focusedObject != null) {
				SubscriberManager.getInstance().view.handleFocusRequest(CDOUtil.getEObject(focusedObject),
						message.getJMSTimestamp());
			}

		} catch (JMSException e) {
			logger.error("Couldn't get the text from the received message.", e);
		}
	}

}
