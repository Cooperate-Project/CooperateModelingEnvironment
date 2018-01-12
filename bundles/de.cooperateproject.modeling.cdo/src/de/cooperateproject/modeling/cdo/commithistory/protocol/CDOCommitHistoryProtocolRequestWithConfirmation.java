package de.cooperateproject.modeling.cdo.commithistory.protocol;

import org.eclipse.net4j.signal.RequestWithConfirmation;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

public abstract class CDOCommitHistoryProtocolRequestWithConfirmation<T> extends RequestWithConfirmation<T> {

    private final String repositoryId;

    public CDOCommitHistoryProtocolRequestWithConfirmation(CDOCommitHistoryProtocol protocol, short signalID,
            String repositoryId) {
        super(protocol, signalID);
        this.repositoryId = repositoryId;
    }

    @Override
    protected void requesting(ExtendedDataOutputStream out) throws Exception {
        out.writeString(repositoryId);
        requestingWithoutContext(out);
    }

    protected abstract void requestingWithoutContext(ExtendedDataOutputStream out) throws Exception;

}
