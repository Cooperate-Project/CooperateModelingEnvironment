package de.cooperateproject.ui.diff.internal;

import java.util.ArrayList;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
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
public class CommitManager {

	/**
	 * The .cooperate diagram file, on which we are working.
	 */
	private IFile currentFile;
	/**
	 * The root item of a selected version of the diagram (commit). Will be
	 * needed, when the diagram's tree is constructed and the root will be
	 * returned to the DiffViewer to be shown in the GUI.
	 */
	private DiffTreeItem root;
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

	/**
	 * Returns all commits found in CDO Repository from the current file.
	 * 
	 * @return a set containing all commits
	 */
	public Set<CDOCommitInfo> getAllCommitInfos() {

		if (currentFile != null && cdoIdsMappedToCommit.size() <= 0) {
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
	 * Computes the comparison of the commit and returns it. Also already
	 * constructs the diagram's tree of this commit.
	 * 
	 * @param commit
	 *            the commit to be compared to its old version
	 * @return a list with objects which respectively carry the two matched
	 *         objects from EMF Compare
	 */
	public List<SummaryItem> compare(CDOCommitInfo commit) {
		List<SummaryItem> sumList = new ArrayList<SummaryItem>();
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(currentFile.getProject());
		CDOBranch mainBranch = session.getBranchManager().getMainBranch();

		CDOView previousState = session.openView(mainBranch, commit.getPreviousTimeStamp());
		CDOView currentState = session.openView(mainBranch, commit.getTimeStamp());

		// Creates the scope, on which differences should be detected. Only the
		// items with the given cdoIds (all elements from textual cooperate
		// diagram) are considered.
		IComparisonScope scope = CDOComparisonScope.Minimal.create(currentState, previousState, null,
				cdoIdsMappedToCommit.get(commit));
		Comparison comparisonResult = CDOCompareUtil.compare(scope);
		// contains all found differences
		EList<Diff> resultList = comparisonResult.getDifferences();

		for (Diff diff : resultList) {
			Object value = getValue(diff);
			// Don't consider changes of objects that are from this package,
			// because we have internal cooperate instances for those, which are
			// being handled here.
			if (value == null || value.getClass().getPackage().getName()
					.contentEquals(UMLPackage.eINSTANCE.getClass().getPackage().getName())) {
				continue;
			}

			// left side is the object in the "new version" of the
			// commit
			Object left = null;
			// right side is the object in the "old version" of the
			// commit
			Object right = null;
			EObject parent = diff.getMatch().getLeft();

			if (value instanceof CommentLink) {
				parent = CommentLinkAdapt.findParent((CommentLink) value);
			}

			// don't add a summary item that has no parent class
			if (parent == null) {
				continue;
			}
			switch (diff.getKind()) {
			case DELETE:
				right = value;
				break;
			case ADD:
				left = value;
				break;
			default:
				left = value;
				if (diff.getMatch().getRight() != null) {
					right = getOldValue(diff, comparisonResult, value);
				}

			}
			sumList.add(new SummaryItem(left, right, parent, diff.getKind()));
		}

		CDOResource resourceOnCurrentView = currentState.getResource(resourceDiagramPath);

		root = new DiffTreeBuilder(resourceOnCurrentView, sumList).buildTree();
		CDOConnectionManager.getInstance().releaseSession(session);
		return sumList;

	}

	public DiffTreeItem getRoot() {
		return root;
	}

	/**
	 * Set the file on which the Commit Manager should work
	 * 
	 * @param file
	 *            the file to be set
	 */
	public void setFile(IFile file) {
		currentFile = file;
		cdoIdsMappedToCommit.clear();
		commitInfos.clear();
		root = null;
		resourceDiagramPath = null;
	}

	/**
	 * Finds all commits on the selected .cooperate-file and stores all cdoIds
	 * of the changed objects in the Map cdoIds.
	 */
	private void findAllCommits() {
		IProject project = currentFile.getProject();
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
		try {
			CDOView view = session.openView();
			try {

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
				CDOResource resource = textRoot.cdoResource();
				CDOID resourceCDOId = resource.cdoID();
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

					try {
						List<CDOIDAndVersion> changedObjects = Lists
								.newArrayList(Iterables.concat(commitInfo.getNewObjects(),
										commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));
						// Set of all IDs of the objects that have been changed
						// in the two states and hence are of interest
						Set<CDOID> value = changedObjects.stream().filter(
								object -> parentMatches(object.getID(), resourceCDOId, previousState, currentState))
								.map(CDOIDAndVersion::getID).collect(Collectors.toSet());

						if (value.size() > 0) {
							cdoIdsMappedToCommit.put(commitInfo, value);
						}

					} finally {
						IOUtil.closeSilent(previousState);
						IOUtil.closeSilent(currentState);
					}
				}

			} finally {
				IOUtil.closeSilent(view);
			}
		} finally {
			CDOConnectionManager.getInstance().releaseSession(session);
		}
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

	/**
	 * Makes out, of which type the Diff was and returns the item, on which the
	 * actual difference was detected.
	 * 
	 * @param diff
	 *            the Diff to be examined.
	 * @return the value on which the difference was detected
	 */
	private Object getValue(Diff diff) {
		Object value = null;

		if (diff instanceof ReferenceChange) {
			value = ((ReferenceChange) diff).getValue();
		} else if (diff instanceof AttributeChange) {
			value = ((AttributeChange) diff).getValue();
		}
		return value;
	}

	@SuppressWarnings("rawtypes")
	/**
	 * Finds and returns the old value, the "old version" of the given value, on
	 * which a difference has been detected.
	 * 
	 * @param diff
	 *            the Diff, in which the given EObject has experienced a
	 *            difference
	 * @param comparisonResult
	 *            the whole Comparison, in which the diff is contained.
	 * @param value
	 *            the value, for which we look for its old/before version
	 * @return the old value
	 */
	private Object getOldValue(Diff diff, Comparison comparisonResult, Object value) {
		Object oldValue = null;
		if (diff instanceof AttributeChange) {
			oldValue = diff.getMatch().getRight().eGet(((AttributeChange) diff).getAttribute());
		} else if (diff instanceof ReferenceChange) {
			if (diff.getKind() == DifferenceKind.MOVE) {
				oldValue = comparisonResult.getMatch((EObject) value).getRight().eContainer();
			} else {
				oldValue = diff.getMatch().getRight().eGet(((ReferenceChange) diff).getReference());
			}
		}
		if (oldValue instanceof org.eclipse.emf.ecore.util.DelegatingEcoreEList) {
			oldValue = ((org.eclipse.emf.ecore.util.DelegatingEcoreEList) oldValue).getEObject();
		}

		return oldValue;
	}

}
