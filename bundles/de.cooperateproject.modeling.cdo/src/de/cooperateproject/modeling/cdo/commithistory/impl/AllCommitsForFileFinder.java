package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
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
import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class AllCommitsForFileFinder implements Closeable {

	private final IFile launcherFile;
	private final CDOView view;

	public AllCommitsForFileFinder(IFile launcherFile) {
		this.launcherFile = launcherFile;
		this.view = openView(launcherFile);
	}

	private static CDOView openView(IFile file) {
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(file.getProject());
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

	public Collection<CDOCommitInfo> getCommits()
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		List<Long> changedTimeStamps = getChangedTimestamps(CDOBranchPoint.INVALID_DATE, CDOBranchPoint.INVALID_DATE);
        return getCommitInfo(changedTimeStamps);
	}

	public Collection<CDOCommitInfo> getCommitsInTimeRange(long from, long to)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        List<Long> changedTimeStamps = getChangedTimestamps(from, to);
        return getCommitInfo(changedTimeStamps);
    }
	
	protected List<Long> getChangedTimestamps(long from, long to)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
	    long lower = from;
	    long upper = to;
		URI txtResourceURI = getTextualResourceURI();
		CDOID resourceID = getResourceID(txtResourceURI);
		CDOID umlID = getResourceID(ModelNamingConventions.getUMLFromTextualURI(txtResourceURI));
		if (lower < 0 || upper < 0) {
		    lower = getResourceCreationTime(resourceID);
		    upper = Long.MAX_VALUE;
		}
		List<Long> changedTimeStamps;
		try {
			changedTimeStamps = CDOCommitHistoryProtocolUtil.getChangedTimestamps(view.getSession(),
					lower, upper, Arrays.asList(resourceID), Arrays.asList(umlID));
		} catch (Exception e) {
			throw new ServerCommunicationException(e);
		}
		return changedTimeStamps;
	}

	protected Collection<CDOCommitInfo> getCommitInfo(List<Long> changedTimeStamps) {
		List<CDOCommitInfo> result = new LinkedList<>();

        if (changedTimeStamps.isEmpty()) {
            return result;
        }

        Long first = changedTimeStamps.get(0);
        Long last = changedTimeStamps.get(changedTimeStamps.size() - 1);
        view.getSession().getCommitInfoManager().getCommitInfos(view.getSession().getBranchManager().getMainBranch(), first, last,
                result::add);
        result.removeIf(info -> !changedTimeStamps.contains(info.getTimeStamp()));
        return result;
	}

	protected long getResourceCreationTime(CDOID resourceID) {
		// assumption: a resource is never changed (except of its contents)
		return view.getRevision(resourceID).getTimeStamp();
	}

	protected URI getTextualResourceURI() throws IOException, ConcreteSyntaxTypeNotAvailableException {
		Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), launcherFile);
		TextualConcreteSyntaxModel txtModel = launcherModel.getConcreteSyntaxModel(TextualConcreteSyntaxModel.class);
		return txtModel.getRootElement().eResource().getURI();
	}

	protected CDOID getResourceID(URI uri) {
		String path = CDOURIUtil.extractResourcePath(uri);
		CDOResource resource = view.getResource(path);
		return resource.cdoID();
	}
	
}
