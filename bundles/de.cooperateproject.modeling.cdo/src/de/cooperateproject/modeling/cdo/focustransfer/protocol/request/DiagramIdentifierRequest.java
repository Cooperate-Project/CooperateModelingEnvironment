package de.cooperateproject.modeling.cdo.focustransfer.protocol.request;

import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

public abstract class DiagramIdentifierRequest extends Request {

	private final String resourceIdentifier;

	public DiagramIdentifierRequest(SignalProtocol<?> protocol, short signalID, String resourceIdentifier) {
		super(protocol, signalID);
		this.resourceIdentifier = resourceIdentifier;
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception {
		out.writeString(resourceIdentifier);
		requestingAfterIdentifier(out);
		
	}
	
	protected void requestingAfterIdentifier(ExtendedDataOutputStream out) throws Exception {
		return;
	}

}
