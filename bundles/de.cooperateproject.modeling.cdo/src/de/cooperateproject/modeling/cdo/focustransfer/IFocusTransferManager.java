package de.cooperateproject.modeling.cdo.focustransfer;

import java.io.IOException;

import org.eclipse.emf.cdo.common.id.CDOID;

public interface IFocusTransferManager {

	void registerHandler(IFocusTransferHandlerConcrete handler, String diagramIdentifier) throws IOException;
	void unregisterHandler(IFocusTransferHandlerConcrete handler, String diagramIdentifier) throws IOException;
	void sendFocusRequest(IFocusTransferHandlerConcrete handler, String diagramIdentifier, CDOID element) throws IOException;
	
}
