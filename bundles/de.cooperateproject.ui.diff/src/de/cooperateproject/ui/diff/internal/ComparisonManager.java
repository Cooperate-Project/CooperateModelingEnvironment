package de.cooperateproject.ui.diff.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.ObjectNotFoundException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.DelegatingTransientStatusProvider;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

/**
 * Provides functions for receiving information about commits from a resource.
 * 
 * @author Jasmin, czogalik
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
	private Map<CDOCommitInfo, Set<CDOID>> cdoIdsMappedToCommit = new HashMap<>();
	/**
	 * Contains information about all relevant commits of the file.
	 */
	private Set<CDOCommitInfo> commitInfos = new HashSet<>();
	/**
	 * The file path to the textual diagram.
	 */
	private String resourceDiagramPath;

	/**
	 * Timeout in milliseconds for the waiting time while loading the
	 * CDOCommitHistory.
	 */
	private static final long LOADING_TIMEOUT = 8000;
	private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonManager.class);

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
	public Comparison getComparison(CDOCommitInfo commit, CDOView previousView, CDOView currentView) {
		initStateOfObjects(commit, previousView, currentView);	
		return compareStrict(getResource(currentView), getResource(previousView));
	}

	private void initStateOfObjects(CDOCommitInfo commit, CDOView previousView, CDOView currentView) {
		Set<CDOID> ids = cdoIdsMappedToCommit.get(commit);
		for (CDOID cdoid : ids) {
			initStateOfObject(previousView, cdoid);
			initStateOfObject(currentView, cdoid);
		}
	}

	private static void initStateOfObject(CDOView view, CDOID cdoid) {
		CDOObject cdoObject = getCDOObjectById(view, cdoid);
		if (cdoObject == null) {
			return;
		}
		String nsURI = cdoObject.eClass().getEPackage().getNsURI();
		
		Optional<IDerivedStateProcessor> extension = DerivedStateCalculatorRegistry.INSTANCE.getExtension(nsURI);
		if (extension.isPresent()) {
		    IDerivedStateProcessor prevDerivedStateProcessor = extension.get();
		    prevDerivedStateProcessor.initState(cdoObject);		    
		}
	}

	private static CDOObject getCDOObjectById(CDOView view, CDOID cdoid) {
		try {
			return view.getObject(cdoid);
		} catch (Exception e) {
			LOGGER.warn(e.getMessage());
			return null;
		}
	}
	
	 private static Comparison compareStrict(Resource resource, Resource resource2) {
		 	IComparisonScope scope = new DefaultComparisonScope(resource, resource2, null);
	        return EMFCompare.builder().setDiffEngine(new DefaultDiffEngine() {

                @Override
                protected FeatureFilter createFeatureFilter() {
                    return new FeatureFilter() {
                        
                        @Override
                        protected boolean isIgnoredReference(Match match, EReference reference) {
                            DelegatingTransientStatusProvider delegatingTransientStatusProvider = new DelegatingTransientStatusProvider();
                            return delegatingTransientStatusProvider.isFeatureConsideredTransient(reference) || 
                                    (super.isIgnoredReference(match, reference) && !delegatingTransientStatusProvider.isFeatureConsideredNonTransient(reference));
                        }

                        @Override
                        protected boolean isIgnoredAttribute(EAttribute attribute) {
                            DelegatingTransientStatusProvider delegatingTransientStatusProvider = new DelegatingTransientStatusProvider();
                            return delegatingTransientStatusProvider.isFeatureConsideredTransient(attribute) || 
                                    (super.isIgnoredAttribute(attribute) && !delegatingTransientStatusProvider.isFeatureConsideredNonTransient(attribute));
                        }};
                }}).build().compare(scope);
	 }

	/**
	 * Gets the resource of the textual diagram in the commit's current version.
	 * 
	 * @param commit
	 *            the commit info of the commit
	 * @param currentView
	 *            the current view on the diagram
	 * @return the corresponding resource
	 */
	public CDOResource getResource(CDOView currentView) {
		return currentView.getResource(resourceDiagramPath);
	}

	/**
	 * Finds all commits on the selected .cooperate-file and stores all cdoIds
	 * of the changed objects in the Map cdoIds.
	 */
	private void findAllCommits() {
		IProject project = currentFile.getProject();
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
		CDOView view = session.openView();
		ConcreteSyntaxModel textModel = getConcreteSyntaxModel(view);
		if (textModel != null) {
		    resourceDiagramPath = CDOURIUtil.extractResourcePath(EcoreUtil.getURI(textModel.getRootElement()));
		    
		    CDOObject textRoot = CDOUtil.getCDOObject(textModel.getRootElement());
		    CDOID resourceCDOId = textRoot.cdoResource().cdoID();

		    getCommitsFromMainBranch(session, view, resourceCDOId);
		}

		IOUtil.closeSilent(view);
		CDOConnectionManager.getInstance().releaseSession(session);
	}

	private void getCommitsFromMainBranch(CDOSession session, CDOView view, CDOID resourceCDOId) {
		CDOCommitInfoManager commitManager = session.getCommitInfoManager();
		CDOBranch mainBranch = session.getBranchManager().getMainBranch();
		CDOCommitHistory mainHistory = commitManager.getHistory(mainBranch);

		mainHistory.waitWhileLoading(LOADING_TIMEOUT);

		getCommitsByTime(session, view, resourceCDOId, mainBranch, mainHistory);
	}

	private void getCommitsByTime(CDOSession session, CDOView view, CDOID resourceCDOId, CDOBranch mainBranch,
			CDOCommitHistory mainHistory) {
		long firstCommitTimeStamp = view.getRevision(resourceCDOId).getTimeStamp();
		for (int i = 0; i < mainHistory.size(); i++) {
			CDOCommitInfo commitInfo = mainHistory.getElement(i);
			
			if (isTimeStampValid(commitInfo, firstCommitTimeStamp)) {
				break;
			}

			CDOCommitInfo previousCommitInfo = mainHistory.getElement(i + 1);
			CDOView previousState = session.openView(mainBranch, previousCommitInfo.getTimeStamp());
			CDOView currentState = session.openView(mainBranch, commitInfo.getTimeStamp());
			
			Set<CDOID> value = getCDOIdFromChangedObjects(resourceCDOId, previousState, currentState, commitInfo);

			if (!value.isEmpty()) {
				cdoIdsMappedToCommit.put(commitInfo, value);
			}

			IOUtil.closeSilent(previousState);
			IOUtil.closeSilent(currentState);

		}
	}

	private ConcreteSyntaxModel getConcreteSyntaxModel(CDOView view) {
		ConcreteSyntaxModel textModel = null;
		try {
			Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), currentFile);
			textModel = launcherModel.getConcreteSyntaxModel(EditorType.TEXTUAL.getSupportedSyntaxModel());
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return textModel;
	}
	
	private boolean isTimeStampValid(CDOCommitInfo commitInfo, long firstCommitTimeStamp) {
		boolean isFirstCommitTimeStampGreater = commitInfo.getTimeStamp() < firstCommitTimeStamp;
		boolean isPreviousTimeStampInvalid = commitInfo.getPreviousTimeStamp() == CDOCommitInfo.INVALID_DATE;
		
		return isFirstCommitTimeStampGreater || isPreviousTimeStampInvalid;
	}

	private Set<CDOID> getCDOIdFromChangedObjects(CDOID resourceCDOId, CDOView previousState, CDOView currentState, CDOCommitInfo commitInfo) {
		List<CDOIDAndVersion> changedObjects = Lists.newArrayList(Iterables.concat(commitInfo.getNewObjects(),
				commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));

		//TODO xrefs check ob parent matched
		//List<CDOObjectReference> queryXRefs = view.queryXRefs(cdoObject, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
		
		return changedObjects.stream()
				.filter(object -> parentMatches(object.getID(), resourceCDOId, previousState, currentState)) 
				.map(CDOIDAndVersion::getID).collect(Collectors.toSet());
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
		if (!ret) {
			return checkParentMatching(objectID, parentID, currentView);
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
		} catch (ObjectNotFoundException e) {
			LOGGER.trace(e.getMessage(), e);
		}
		return false;
	}

}
