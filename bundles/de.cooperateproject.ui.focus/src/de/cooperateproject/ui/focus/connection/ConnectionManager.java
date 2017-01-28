package de.cooperateproject.ui.focus.connection;

import org.eclipse.core.resources.IFile;
public class ConnectionManager {
	
	private static IFile currentFile = null;

	public static void connect(IFile file){
		
		currentFile = file;
		
		if(currentFile == null){
			//TODO connect and subscribe topic
		}else if(currentFile != file){
			//TODO unsubscribe old topic and subscribe new one
		}
		
	}
	
	public static void disconnect(){
		//TODO
	}
}
