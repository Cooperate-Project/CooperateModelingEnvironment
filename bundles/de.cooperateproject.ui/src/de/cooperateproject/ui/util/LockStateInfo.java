package de.cooperateproject.ui.util;

import java.io.IOException;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class LockStateInfo {

    public static boolean isReadOnlyRequired(IFile launcherFile)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(launcherFile.getProject());
        try {
            CDOView temporaryView = session.openView();
            try {
                Diagram launcherModel = loadDiagram(temporaryView, launcherFile);
                URI umlURI = determineUMLURI(launcherModel);
                return getWriteLock(temporaryView, umlURI).isLockedByOthers();
            } finally {
                IOUtil.closeSilent(temporaryView);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }
    }

    public static Diagram loadDiagram(CDOView cdoView, IFile launcherFile) throws IOException {
        Validate.notNull(cdoView);
        return LauncherModelHelper.loadDiagram(cdoView.getResourceSet(), launcherFile);
    }

    public static URI determineUMLURI(Diagram launcherModel) throws ConcreteSyntaxTypeNotAvailableException {
        TextualConcreteSyntaxModel textualConcreteSyntaxModel = launcherModel
                .getConcreteSyntaxModel(TextualConcreteSyntaxModel.class);
        URI textualURI = textualConcreteSyntaxModel.getRootElement().eResource().getURI();
        return ModelNamingConventions.getUMLFromTextualURI(textualURI);
    }

    public static CDOLock getWriteLock(CDOView view, URI uri) {
        CDOResource resource = view.getResource(CDOURIUtil.extractResourcePath(uri), true);
        return resource.cdoWriteLock();
    }
}
