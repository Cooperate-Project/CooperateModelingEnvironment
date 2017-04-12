package de.cooperateproject.ui.focus.internal.messaging;

import org.eclipse.emf.cdo.common.id.CDOID;

public interface IFocusMessage {

    void setCDOID(CDOID cdoId);

    CDOID getCDOID();

    long getTimestamp();
}
