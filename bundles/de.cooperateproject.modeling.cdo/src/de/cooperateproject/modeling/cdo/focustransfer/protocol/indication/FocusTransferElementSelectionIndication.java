package de.cooperateproject.modeling.cdo.focustransfer.protocol.indication;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.net4j.signal.Indication;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;

import de.cooperateproject.modeling.cdo.focustransfer.protocol.FocusTransferProtocol;
import de.cooperateproject.modeling.cdo.protocolutils.CDOIDReader;

public class FocusTransferElementSelectionIndication extends Indication implements CDOIDReader {

	public static final short SIGNAL_ID = 0x11;

	public FocusTransferElementSelectionIndication(FocusTransferProtocol protocol) {
		super(protocol, SIGNAL_ID);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception {
		String diagramIdentifier = in.readString();
		CDOID elementID = readCDOID(in);
		((FocusTransferProtocol)getProtocol()).getInfraStructure().handleFocusRequest(diagramIdentifier, elementID);
	}

}
