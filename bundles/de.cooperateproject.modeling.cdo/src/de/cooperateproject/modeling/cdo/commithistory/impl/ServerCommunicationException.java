package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.IOException;

public class ServerCommunicationException extends IOException {

	private static final long serialVersionUID = -4890461520297856306L;

	public ServerCommunicationException(Exception e) {
		super(e);
	}
	
}
