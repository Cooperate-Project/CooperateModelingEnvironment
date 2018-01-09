package de.cooperateproject.modeling.cdo.focustransfer.protocol;

import org.eclipse.emf.cdo.common.id.CDOID;

import de.cooperateproject.modeling.cdo.focustransfer.IFocusTransferHandler;

public class FocusTransferProtocolInfrastructure implements IFocusTransferHandler {

	private final IFocusTransferHandler requestHandler;

	public FocusTransferProtocolInfrastructure(IFocusTransferHandler requestHandler) {
		super();
		this.requestHandler = requestHandler;
	}

	@Override
	public void handleFocusRequest(String diagramIdentifier, CDOID elementID) {
		this.requestHandler.handleFocusRequest(diagramIdentifier, elementID);
	}

}
