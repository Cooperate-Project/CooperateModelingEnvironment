package de.cooperateproject.ui.focus.connection;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
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
			subscriber = topicSession.createSubscriber(topic);
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
			unsubscribe();
			topicSession.close();
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
			ObjectMessage msg = topicSession.createObjectMessage(id);
			publisher.publish(msg);
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void onMessage(Message msg) {
		try{
			if(!(msg instanceof ObjectMessage)){
				return;
			}
			
			ObjectMessage message = (ObjectMessage) msg;
			Object obj;
				
			obj = message.getObject();
			
			if(obj instanceof CDOID){
				CDOSession session = CDOConnectionManager.getInstance().acquireSession(ConnectionManager.getInstance().getFile().getProject());
				CDOView cdoView = session.openView();
				CDOObject focusedObject = cdoView.getObject((CDOID)obj);
				SubscriberManager.getInstance().view.handleFocusRequest(CDOUtil.getEObject(focusedObject));
				cdoView.close();
				CDOConnectionManager.getInstance().releaseSession(session);
			}
		
		}catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
}
