package de.cooperateproject.modeling.cdo.commithistory.protocol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang3.Range;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

public class CDOCommitHistoryProtocolGetChangedTimestamps
        extends CDOCommitHistoryProtocolRequestWithConfirmation<List<Long>> {

    public static final short SIGNAL_ID = 1;
    private final Collection<CDOID> requestedResources = new HashSet<>();
    private final Collection<CDOID> crossReferencedResources = new HashSet<>();
    private Range<Long> timeRange;

    public CDOCommitHistoryProtocolGetChangedTimestamps(CDOCommitHistoryProtocol protocol, String repositoryId) {
        super(protocol, SIGNAL_ID, repositoryId);
    }

    public void addRequestedResource(Iterable<CDOID> cdoids) {
        for (CDOID cdoid : cdoids) {
            addRequestedResource(cdoid);
        }
    }

    public void addRequestedResource(CDOID cdoid) {
        requestedResources.add(cdoid);
    }

    public void addCrossReferencedResourceToConsider(CDOID cdoid) {
        crossReferencedResources.add(cdoid);
    }

    public void addCrossReferencedResourceToConsider(Iterable<CDOID> relevantCrossReferencedResourceIds) {
        for (CDOID cdoid : relevantCrossReferencedResourceIds) {
            addCrossReferencedResourceToConsider(cdoid);
        }
    }

    public void setRelevantTimeRange(Range<Long> timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    protected void requestingWithoutContext(ExtendedDataOutputStream out) throws IOException {
        out.writeInt(requestedResources.size());
        for (CDOID requestedResource : requestedResources) {
            write(out, requestedResource);
        }
        out.writeInt(crossReferencedResources.size());
        for (CDOID crossReferencedResource : crossReferencedResources) {
            write(out, crossReferencedResource);
        }
        if (timeRange != null) {
            out.writeBoolean(true);
            out.writeLong(timeRange.getMinimum());
            out.writeLong(timeRange.getMaximum());
        } else {
            out.writeBoolean(false);
        }
    }

    @Override
    protected List<Long> confirming(ExtendedDataInputStream in) throws Exception {
        List<Long> result = new ArrayList<>();
        int resultCount = in.readInt();
        for (int i = 0; i < resultCount; ++i) {
            result.add(in.readLong());
        }
        return result;
    }

}
