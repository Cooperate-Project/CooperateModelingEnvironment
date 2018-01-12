package de.cooperateproject.modeling.cdo.focustransfer.impl;

import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

public class ExceptionThrowingRequest extends Request {

	private static class NOPSignalProtocol extends SignalProtocol<Object> {

		public NOPSignalProtocol() {
			super("NOP");
		}
		
	}
	
	public ExceptionThrowingRequest() {
		super(new NOPSignalProtocol(), Short.MIN_VALUE);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public void sendAsync() throws Exception {
		throw new UnsupportedOperationException();
	}

}
