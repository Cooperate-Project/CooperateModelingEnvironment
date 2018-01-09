package de.cooperateproject.modeling.cdo.focustransfer.protocol.request;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.cooperateproject.modeling.cdo.focustransfer.protocol.FocusTransferProtocol;
import de.cooperateproject.modeling.cdo.protocolutils.CDOIDWriter;

public class FocusTransferElementSelectionRequest extends DiagramIdentifierRequest implements CDOIDWriter {

	public static final short SIGNAL_ID = 0x03;
	private final CDOID elementID;
	
	public FocusTransferElementSelectionRequest(FocusTransferProtocol protocol, String diagramIdentifier, CDOID elementID) {
		super(protocol, SIGNAL_ID, diagramIdentifier);
		this.elementID = elementID;
	}

	@Override
	protected void requestingAfterIdentifier(ExtendedDataOutputStream out) throws Exception {
		writeCDOID(out, elementID);
	}

}
