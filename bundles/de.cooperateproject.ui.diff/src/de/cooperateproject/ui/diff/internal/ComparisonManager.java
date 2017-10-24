package de.cooperateproject.ui.diff.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.InvalidURIException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.cdo.commithistory.ICommitHistoryManager;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateProcessor;
import de.cooperateproject.ui.diff.Activator;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

/**
 * Provides functions for receiving information about commits from a resource.
 * 
 * @author Jasmin, czogalik
 *
 */
public class ComparisonManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonManager.class);

    private ICommitHistoryManager commitHistoryManager = Activator.getDefault().getCommitHistoryManager();
    
    /**
     * Returns all commits found in CDO Repository from the current file.
     * 
     * @return a set containing all commits
     */
    public Set<CDOCommitInfo> getAllCommitInfos(IFile file) {
        return findAllCommits(file);
    }

    /**
     * Returns all commits from today until the given date as found in CDO Repository from the
     * current file.
     * 
     * @param dateMillis
     *            the given date in milliseconds
     * @return a set containing all commits in the time span
     */
    public Set<CDOCommitInfo> getAllCommitInfos(long dateMillis, IFile file) {
        Set<CDOCommitInfo> commitInfosTemp = getAllCommitInfos(file);
        commitInfosTemp.removeIf(info -> info.getTimeStamp() < dateMillis);

        return commitInfosTemp;
    }

    /**
     * Computes the comparison of the commit and returns it.
     *
     * @return The computed comparison
     */
    public Comparison getComparison(CDOView previousView, CDOView currentView, IFile file) {
        initStateOfObjects(previousView, currentView, file);
        return compareStrict(getResource(currentView, file), getResource(previousView, file));
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
    public CDOResource getResource(CDOView currentView, IFile file) {
        ConcreteSyntaxModel concreteSyntaxModel = getConcreteSyntaxModel(currentView, file);
        if (concreteSyntaxModel == null) {
            return null;
        }
        EObject rootElement = concreteSyntaxModel.getRootElement();
        URI rootURI = EcoreUtil.getURI(rootElement);
        String resourcePath = CDOURIUtil.extractResourcePath(rootURI);
        try {
            return currentView.getResource(resourcePath);
        } catch (InvalidURIException e) {
            LOGGER.trace(e.getMessage(), e);
            return null;
        }
    }

    private void initStateOfObjects(CDOView previousView, CDOView currentView, IFile file) {
        initStateOfObject(previousView, getResourceCDOId(previousView, file));
        initStateOfObject(currentView, getResourceCDOId(currentView, file));
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
            prevDerivedStateProcessor.initState(cdoObject, true);
        }
    }

    private static CDOObject getCDOObjectById(CDOView view, CDOID cdoid) {
        try {
            return view.getObject(cdoid);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return null;
        }
    }

    private static Comparison compareStrict(Resource resource, Resource resource2) {
        IComparisonScope scope = new DefaultComparisonScope(resource, resource2, null);
        return EMFCompare.builder().setDiffEngine(new DefaultDiffEngineExtension()).build().compare(scope);
    }

    private CDOID getResourceCDOId(CDOView view, IFile file) {
        ConcreteSyntaxModel textModel = getConcreteSyntaxModel(view, file);
        if (textModel == null) {
            return null;
        }
        return getResourceCDOId(textModel);
    }

    /**
     * Finds all commits on the selected .cooperate-file and stores all cdoIds of the changed
     * objects in the Map cdoIds.
     * 
     * @return all commits on the selected .cooperate-file.
     */
    private Set<CDOCommitInfo> findAllCommits(IFile file) {
    	try {
			return new HashSet<>(commitHistoryManager.getCommitsForLauncher(file));
		} catch (IOException | ConcreteSyntaxTypeNotAvailableException e) {
			// TODO show the user
			return Collections.emptySet();
		}
    }

    private static CDOID getResourceCDOId(ConcreteSyntaxModel textModel) {
        CDOObject textRoot = CDOUtil.getCDOObject(textModel.getRootElement());
        CDOResource cdoResource = textRoot.cdoResource();
        if (cdoResource == null) {
            return null;
        }
        return cdoResource.cdoID();
    }
    
    private static ConcreteSyntaxModel getConcreteSyntaxModel(CDOView view, IFile file) {
        try {
            Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), file);
            return launcherModel.getConcreteSyntaxModel(EditorType.TEXTUAL.getSupportedSyntaxModel());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

    
}
