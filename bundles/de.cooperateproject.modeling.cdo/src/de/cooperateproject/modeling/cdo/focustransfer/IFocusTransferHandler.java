package de.cooperateproject.modeling.cdo.focustransfer;

import org.eclipse.emf.cdo.common.id.CDOID;

public interface IFocusTransferHandler {

	void handleFocusRequest(String diagramIdentifier, CDOID elementID);

}
