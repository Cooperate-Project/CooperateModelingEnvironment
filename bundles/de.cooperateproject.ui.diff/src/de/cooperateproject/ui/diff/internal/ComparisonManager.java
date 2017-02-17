package de.cooperateproject.ui.diff.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitHistory;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfoManager;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.revision.CDOIDAndVersion;
import org.eclipse.emf.cdo.compare.CDOCompareUtil;
import org.eclipse.emf.cdo.compare.CDOComparisonScope;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

/**
 * Provides functions for receiving information about commits from a resource.
 * 
 * @author Jasmin
 *
 */
public class ComparisonManager {

	/**
	 * The .cooperate diagram file, on which we are working.
	 */
	private IFile currentFile;

	/**
	 * Contains the IDs of all changed objects during all found commits of the
	 * file.
	 */
	private Map<CDOCommitInfo, Set<CDOID>> cdoIdsMappedToCommit = new HashMap<CDOCommitInfo, Set<CDOID>>();
	/**
	 * Contains information about all relevant commits of the file.
	 */
	private Set<CDOCommitInfo> commitInfos = new HashSet<CDOCommitInfo>();
	/**
	 * The file path to the textual diagram.
	 */
	private String resourceDiagramPath;

	private CommitCDOViewManager cvm;

	/**
	 * Constructor, sets the file on which the CommitManager should work.
	 * 
	 * @param file
	 *            the file to be set
	 */
	public ComparisonManager(IFile file) {
		currentFile = file;
	}

	/**
	 * Returns all commits found in CDO Repository from the current file.
	 * 
	 * @return a set containing all commits
	 */
	public Set<CDOCommitInfo> getAllCommitInfos() {
		if (currentFile != null && cdoIdsMappedToCommit.isEmpty()) {
			findAllCommits();
		}
		commitInfos.addAll(cdoIdsMappedToCommit.keySet());

		return commitInfos;
	}

	/**
	 * Returns all commits from today until the given date as found in CDO
	 * Repository from the current file.
	 * 
	 * @param dateMillis
	 *            the given date in milliseconds
	 * @return a set containing all commits in the time span
	 */
	public Set<CDOCommitInfo> getAllCommitInfos(long dateMillis) {
		Set<CDOCommitInfo> commitInfosTemp = getAllCommitInfos();
		// only keep those commitInfos which are in the given time range
		commitInfosTemp.removeIf(info -> info.getTimeStamp() < dateMillis);

		return commitInfosTemp;
	}

	/**
	 * Computes the comparison of the commit and returns it.
	 * 
	 * @param commit
	 *            The commit to be compared to its old version
	 * @return The computed comparison
	 */
	public Comparison getComparison(CDOCommitInfo commit) {
		cvm = new CommitCDOViewManager(commit, currentFile);
		// Creates the scope, on which differences should be detected. Only the
		// items with the given cdoIds (all elements from textual cooperate
		// diagram) are considered.
		IComparisonScope scope = CDOComparisonScope.Minimal.create(cvm.getCurrentView(), cvm.getPreviousView(), null,
				cdoIdsMappedToCommit.get(commit));

		Comparison comparison = CDOCompareUtil.compare(scope);
		return comparison;
	}

	public CDOResource getResource(CDOCommitInfo commit) {
		return cvm.getCurrentView().getResource(resourceDiagramPath);
	}

	/**
	 * Finds all commits on the selected .cooperate-file and stores all cdoIds
	 * of the changed objects in the Map cdoIds.
	 */
	private void findAllCommits() {
		IProject project = currentFile.getProject();
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
		CDOView view = session.openView();
		CDOBranch mainBranch = session.getBranchManager().getMainBranch();
		ConcreteSyntaxModel textModel = null;
		Diagram launcherModel = null;

		try {
			launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), currentFile);
			textModel = launcherModel.getConcreteSyntaxModel(EditorType.TEXTUAL.getSupportedSyntaxModel());
			resourceDiagramPath = CDOURIUtil.extractResourcePath(EcoreUtil.getURI(textModel.getRootElement()));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		CDOObject textRoot = CDOUtil.getCDOObject(textModel.getRootElement());
		CDOID resourceCDOId = textRoot.cdoResource().cdoID();
		long firstCommitTimeStamp = view.getRevision(resourceCDOId).getTimeStamp();

		// get all commits from main branch
		CDOCommitInfoManager commitManager = session.getCommitInfoManager();
		CDOCommitHistory mainHistory = commitManager.getHistory(mainBranch);

		for (int i = 0; i < mainHistory.size(); i++) {
			CDOCommitInfo commitInfo = mainHistory.getElement(i);
			if (commitInfo.getTimeStamp() < firstCommitTimeStamp) {
				break;
			}
			if (commitInfo.getPreviousTimeStamp() == CDOCommitInfo.INVALID_DATE) {
				break;
			}

			CDOCommitInfo previousCommitInfo = mainHistory.getElement(i + 1);
			CDOView previousState = session.openView(mainBranch, previousCommitInfo.getTimeStamp());
			CDOView currentState = session.openView(mainBranch, commitInfo.getTimeStamp());

			List<CDOIDAndVersion> changedObjects = Lists.newArrayList(Iterables.concat(commitInfo.getNewObjects(),
					commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));
			// Set of all IDs of the objects that have been changed
			// in the two states and hence are of interest
			Set<CDOID> value = changedObjects.stream()
					.filter(object -> parentMatches(object.getID(), resourceCDOId, previousState, currentState))
					.map(CDOIDAndVersion::getID).collect(Collectors.toSet());

			if (value.size() > 0) {
				cdoIdsMappedToCommit.put(commitInfo, value);
			}

			IOUtil.closeSilent(previousState);
			IOUtil.closeSilent(currentState);

		}

		IOUtil.closeSilent(view);
		CDOConnectionManager.getInstance().releaseSession(session);

	}

	/**
	 * Checks if the Object with objectId really belongs to the textual model.
	 * 
	 * @param objectId
	 *            the CDOID of the object to be examined
	 * @param parentId
	 *            the CDOID of the textual model/resource
	 * @param previousView
	 *            the previous view of the commit
	 * @param currentView
	 *            the current view of the commit
	 * @return true if it belongs to the textual model, false if not
	 */
	private boolean parentMatches(CDOID objectID, CDOID parentID, CDOView previousView, CDOView currentView) {
		boolean ret = checkParentMatching(objectID, parentID, previousView);
		if (ret == false) {
			ret = checkParentMatching(objectID, parentID, currentView);
		}
		return ret;
	}

	/**
	 * Checks if the Object with objectId really belongs to the textual model.
	 * 
	 * @param objectId
	 *            the CDOID of the object to be examined
	 * @param parentId
	 *            the CDOID of the textual model/resource
	 * @param view
	 *            the view in which the object is examined
	 * @return true if it belongs to the textual model, false if not
	 */
	private boolean checkParentMatching(CDOID objectID, CDOID parentID, CDOView view) {
		try {
			CDOObject object = view.getObject(objectID);
			return object.cdoResource().cdoID().equals(parentID);
		} catch (Exception e) {
		}
		return false;
	}

}
