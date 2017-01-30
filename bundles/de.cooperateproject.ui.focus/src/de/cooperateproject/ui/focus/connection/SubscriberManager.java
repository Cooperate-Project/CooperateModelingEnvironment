package de.cooperateproject.ui.focus.connection;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Topic;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import de.cooperateproject.ui.focus.views.FocusView;

public class SubscriberManager{

	private static SubscriberManager instance = null;
	private FocusView view = null;
	private Topic topic = null;
	private TopicSubscriber subscriber = null;
	private TopicPublisher publisher = null;
	private TopicSession topicSession = null;
	
	public static SubscriberManager getInstance(){
		if(instance == null){
			instance = new SubscriberManager();
		}
		return instance;
	}
	
	public void initialize(TopicSession session, String fileName){
			try {
				topic = session.createTopic(fileName);
				topicSession = session;
				publisher = topicSession.createPublisher(topic);
			} catch (JMSException e) {
				e.printStackTrace();
			}
			
	}
	
	public void subscribe(){
		try {
			subscriber = topicSession.createSubscriber(topic);
			subscriber.setMessageListener(SubscriberManager::handleMessage);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	public void unsubscribe(){
		try {
			subscriber.close();
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	public void setView(FocusView pView){
		view = pView;
	}

	private static void handleMessage(Message msg){
		//TODO
	}
	
}
