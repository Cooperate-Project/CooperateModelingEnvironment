package de.cooperateproject.modeling.cdo.focustransfer.protocol.request;

import de.cooperateproject.modeling.cdo.focustransfer.protocol.FocusTransferProtocol;

public class FocusTransferRegisterForDiagramRequest extends DiagramIdentifierRequest {

	public static final short SIGNAL_ID = 0x01;
	
	public FocusTransferRegisterForDiagramRequest(FocusTransferProtocol protocol, String diagramIdentifier) {
		super(protocol, SIGNAL_ID, diagramIdentifier);
	}

}
