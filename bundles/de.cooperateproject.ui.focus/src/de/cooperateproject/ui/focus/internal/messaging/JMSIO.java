package de.cooperateproject.ui.focus.internal.messaging;

import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnection;
import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;

class JMSIO implements Closeable {

    @FunctionalInterface
    interface FocusMessageHandler {
        void handleMessage(IFocusMessage message);
    }

    private static final Logger LOGGER = Logger.getLogger(JMSIO.class);
    private static final String JMS_CLOSE_METHOD_NAME = "close";
    private static final String JMS_MESSAGE_PROPERTY_NAME_CDOID = "CDOID";
    private final String messageBrokerHost;
    private final int messageBrokerPort;
    private final String topicName;
    private TopicConnection connection;
    private TopicSession topicSession;
    private TopicPublisher topicPublisher;
    private TopicSubscriber topicSubscriber;
    private FocusMessageHandler focusMessageHandler;

    JMSIO(String hostname, int port, String topicName) {
        this.messageBrokerHost = hostname;
        this.messageBrokerPort = port;
        this.topicName = topicName;
    }

    void init(FocusMessageHandler messageHandler) throws JMSException, URISyntaxException {
        String address = String.format("failover:tcp://%s:%d", messageBrokerHost, messageBrokerPort);
        connection = ActiveMQConnection.makeConnection(address);
        connection.start();
        topicSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
        Topic topic = topicSession.createTopic(topicName);
        topicPublisher = topicSession.createPublisher(topic);
        topicSubscriber = topicSession.createSubscriber(topic, null, true);
        topicSubscriber.setMessageListener(this::handleMessage);
        focusMessageHandler = messageHandler;
    }

    @Override
    public void close() {
        silentClose(topicSubscriber);
        silentClose(topicPublisher);
        silentClose(topicSession);
        silentClose(connection);
    }

    private void handleMessage(Message msg) {
        try {
            FocusMessage focusMessage = new FocusMessage();
            focusMessage.setTimestamp(msg.getJMSTimestamp());
            focusMessage.setCDOID(CDOIDUtil.read(msg.getStringProperty(JMS_MESSAGE_PROPERTY_NAME_CDOID)));
            focusMessageHandler.handleMessage(focusMessage);
        } catch (Exception e) {
            LOGGER.warn("Could not process received message.", e);
        }
    }

    void sendMessage(CDOID cdoId) throws JMSException {
        Message message = topicSession.createMessage();
        StringBuilder cdoIdStringBuilder = new StringBuilder();
        CDOIDUtil.write(cdoIdStringBuilder, cdoId);
        message.setStringProperty(JMS_MESSAGE_PROPERTY_NAME_CDOID, cdoIdStringBuilder.toString());
        topicPublisher.send(message);
    }

    private static void silentClose(Object topicSubscriber) {
        if (topicSubscriber == null) {
            return;
        }
        try {
            Method closeMethod = topicSubscriber.getClass().getMethod(JMS_CLOSE_METHOD_NAME);
            closeMethod.invoke(topicSubscriber);
        } catch (Exception e) {
            LOGGER.warn("Could not close.", e);
            return;
        }
    }

}
