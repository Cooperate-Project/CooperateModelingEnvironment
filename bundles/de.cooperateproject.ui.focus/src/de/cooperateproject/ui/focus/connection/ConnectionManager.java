package de.cooperateproject.ui.focus.connection;

import org.apache.activemq.ActiveMQConnection;
import org.eclipse.core.resources.IFile;

import java.net.URISyntaxException;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;

public class ConnectionManager{
	
	private static ConnectionManager instance = null;
	private IFile currentFile = null;
	private final String address = "tcp://localhost:61616";
	private TopicConnection connection = null;
	private TopicSession session = null;
	
	public static ConnectionManager getInstance(){
		if(instance == null){
			instance = new ConnectionManager();
		}
		return instance;
	}

	public void connect(IFile file){
		
		try {
			if(currentFile == null){
					connection = ActiveMQConnection.makeConnection(address);
					session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
					SubscriberManager.getInstance().initialize(session, file.getName());
					SubscriberManager.getInstance().subscribe();
					connection.start();
			}else if(currentFile != file){
				SubscriberManager.getInstance().unsubscribe();
				SubscriberManager.getInstance().initialize(session, file.getName());
				SubscriberManager.getInstance().subscribe();
			}
		}
		 catch (JMSException | URISyntaxException e) {
				e.printStackTrace();	
		 	}
		
		currentFile = file;
		
	}
	
	public void disconnect(){
		if(connection != null){
			try {
				if(session != null)
					session.close();
				connection.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
