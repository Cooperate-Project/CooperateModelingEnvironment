package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.StreamSupport;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.cdo.commithistory.protocol.CDOCommitHistoryProtocolUtil;

public abstract class AllCommitsFinderBase implements Closeable {

    protected final CDOView view;

    public AllCommitsFinderBase(IProject project) {
        super();
        view = openView(project);
    }

    protected static CDOView openView(IProject project) {
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
        try {
            return session.openView();
        } catch (Exception e) {
            CDOConnectionManager.getInstance().releaseSession(session);
            throw e;
        }
    }

    @Override
    public void close() {
        CDOSession session = view.getSession();
        IOUtil.closeSilent(view);
        CDOConnectionManager.getInstance().releaseSession(session);
    }

    protected Collection<CDOCommitInfo> getCommitInfo(List<Long> changedTimeStamps) {
        List<CDOCommitInfo> result = new LinkedList<>();

        if (changedTimeStamps.isEmpty()) {
            return result;
        }

        Long first = changedTimeStamps.get(0);
        Long last = changedTimeStamps.get(changedTimeStamps.size() - 1);
        view.getSession().getCommitInfoManager().getCommitInfos(view.getSession().getBranchManager().getMainBranch(),
                first, last, result::add);
        result.removeIf(info -> !changedTimeStamps.contains(info.getTimeStamp()));
        return result;
    }

    protected long getResourceCreationTime(CDOID resourceID) {
        // assumption: a resource is never changed (except of its contents)
        return view.getRevision(resourceID).getTimeStamp();
    }

    protected CDOID getResourceID(URI uri) {
        String path = CDOURIUtil.extractResourcePath(uri);
        CDOResource resource = view.getResource(path);
        return resource.cdoID();
    }

    public Collection<CDOCommitInfo> getCommits() throws IOException {
        List<Long> changedTimeStamps = getChangedTimestamps(CDOBranchPoint.INVALID_DATE, CDOBranchPoint.INVALID_DATE);
        return getCommitInfo(changedTimeStamps);
    }

    public Collection<CDOCommitInfo> getCommitsInTimeRange(long from, long to)
            throws IOException {
        List<Long> changedTimeStamps = getChangedTimestamps(from, to);
        return getCommitInfo(changedTimeStamps);
    }

    protected List<Long> getChangedTimestamps(long from, long to) throws IOException {
        long lower = from;
        long upper = to;

        Iterable<CDOID> resourceIds = determineResourceIds();
        Iterable<CDOID> crossReferencedResourceIds = determineCrossReferencedResourceIds();

        if (lower < 0 || upper < 0) {
            lower = StreamSupport.stream(resourceIds.spliterator(), false).map(this::getResourceCreationTime)
                    .min(Long::compare).orElse(0l);
            upper = Long.MAX_VALUE;
        }
        List<Long> changedTimeStamps;
        try {
            changedTimeStamps = CDOCommitHistoryProtocolUtil.getChangedTimestamps(view.getSession(), lower, upper,
                    resourceIds, crossReferencedResourceIds);
        } catch (Exception e) {
            throw new ServerCommunicationException(e);
        }
        return changedTimeStamps;
    }

    protected abstract Iterable<CDOID> determineCrossReferencedResourceIds() throws IOException;

    protected abstract Iterable<CDOID> determineResourceIds() throws IOException;

}