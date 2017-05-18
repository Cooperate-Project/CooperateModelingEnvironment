package de.cooperateproject.ui.focus.internal.messaging;

import org.eclipse.emf.cdo.common.id.CDOID;

public class FocusMessage implements IFocusMessage {

    private CDOID cdoId;
    private long timestamp;

    @Override
    public CDOID getCDOID() {
        return cdoId;
    }

    @Override
    public void setCDOID(CDOID cdoId) {
        this.cdoId = cdoId;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
