package de.cooperateproject.modeling.cdo.focustransfer.protocol.request;

import org.eclipse.net4j.signal.SignalProtocol;

public class FocusTransferUnregisterForDiagramRequest extends DiagramIdentifierRequest {

	public static final short SIGNAL_ID = 0x02;

	public FocusTransferUnregisterForDiagramRequest(SignalProtocol<?> protocol, String diagramIdentifier) {
		super(protocol, SIGNAL_ID, diagramIdentifier);
	}
	
}
