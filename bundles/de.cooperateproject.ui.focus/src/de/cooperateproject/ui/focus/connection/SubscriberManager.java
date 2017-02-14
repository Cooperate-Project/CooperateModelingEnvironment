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

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.focus.views.FocusView;

public class SubscriberManager implements javax.jms.MessageListener{

	private static SubscriberManager instance = null;
	private FocusView view = null;
	private Topic topic = null;
	private TopicSubscriber subscriber = null;
	private TopicPublisher publisher = null;
	private TopicSession topicSession = null;
	private boolean isInitialized = false;
	CDOSession cdoSession;
	CDOView cdoView;
	
	public static SubscriberManager getInstance(){
		if(instance == null){
			instance = new SubscriberManager();
		}
		return instance;
	}
	
	public void initialize(TopicConnection connection, String fileName){
			try {
				topicSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
				topic = topicSession.createTopic(fileName);
				publisher = topicSession.createPublisher(topic);
				
				cdoSession = CDOConnectionManager.getInstance().acquireSession(ConnectionManager.getInstance().getFile().getProject());
				cdoView = cdoSession.openView();
				isInitialized = true;
				
			} catch (JMSException e) {
				e.printStackTrace();
			}
			
	}
	
	public void subscribe(){
		if(!isInitialized){
			return;
		}
		try {
			 //only one subscriber should exist
			unsubscribe();
			//noLocal attribute is true, so that the user won't be informed about his own focus request
			subscriber = topicSession.createSubscriber(topic, null, true);
			subscriber.setMessageListener(this);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	public void unsubscribe(){
		try {
			if(subscriber != null){
				subscriber.close();
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	public void disconnect(){
		if(!isInitialized){
			return;
		}
	
		try {
			cdoView.close();
			CDOConnectionManager.getInstance().releaseSession(cdoSession);
			unsubscribe();
			topicSession.close();
			instance = null;
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setView(FocusView pView){
		view = pView;
	}
	
	public void sendFocusRequest(EObject obj){
		if(!isInitialized){
			return;
		}
		CDOID id = CDOUtil.getCDOObject(obj).cdoID();
		try {
			StringBuilder builder = new StringBuilder();
			CDOIDUtil.write(builder, id);
			TextMessage msg = topicSession.createTextMessage(builder.toString());
			publisher.publish(msg);
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void onMessage(Message msg) {
		try{
			if(!(msg instanceof TextMessage)){
				return;
			}
			
			TextMessage message = (TextMessage) msg;
			
			String text = message.getText();
			
			CDOID id = CDOIDUtil.read(text);
			CDOObject focusedObject = cdoView.getObject(id);
			if(focusedObject != null){
				SubscriberManager.getInstance().view.handleFocusRequest(CDOUtil.getEObject(focusedObject), message.getJMSTimestamp());
			}
			
		}catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
}
