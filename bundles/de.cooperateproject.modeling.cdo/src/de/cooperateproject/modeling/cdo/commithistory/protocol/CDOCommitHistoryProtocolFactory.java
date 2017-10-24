package de.cooperateproject.modeling.cdo.commithistory.protocol;

import org.eclipse.net4j.util.factory.ProductCreationException;
import org.eclipse.spi.net4j.ClientProtocolFactory;

public class CDOCommitHistoryProtocolFactory extends ClientProtocolFactory {

    public CDOCommitHistoryProtocolFactory() {
        super("CDO_COMMIT_HISTORY");
    }

    @Override
    public Object create(String description) throws ProductCreationException {
        return new CDOCommitHistoryProtocol();
    }

}
