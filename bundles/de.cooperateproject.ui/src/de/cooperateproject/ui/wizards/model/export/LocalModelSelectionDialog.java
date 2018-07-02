package de.cooperateproject.ui.wizards.model.export;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class LocalModelSelectionDialog extends ElementListSelectionDialog {

    public LocalModelSelectionDialog(Shell shell, IProject project) throws CoreException {
        super(shell, new LabelProvider());
        setElements(createElementSelection(project));
    }

    private static Object[] createElementSelection(IProject project) throws CoreException {
        return determineModelNames(project).toArray();
    }

    private static Collection<String> determineModelNames(IProject project) throws CoreException {

        Set<String> modelNames = new LinkedHashSet<>();
        IResourceVisitor launcherFilesFinder = new IResourceVisitor() {

            @Override
            public boolean visit(IResource resource) throws CoreException {
                IFile file = resource.getAdapter(IFile.class);
                if (file == null) {
                    return true;
                }

                if (!LauncherModelHelper.FILE_EXTENSION.equals(file.getFileExtension())) {
                    return true;
                }

                CDOSession session = CDOConnectionManager.getInstance().acquireSession(resource.getProject());
                try {
                    CDOView view = session.openView();
                    try {
                        Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), file);
                        URI textualURI = launcherModel.getConcreteSyntaxModel(TextualConcreteSyntaxModel.class)
                                .getRootElement().eResource().getURI();
                        URI umlURI = ModelNamingConventions.getUMLFromTextualURI(textualURI);
                        modelNames.add(umlURI.lastSegment());
                    } catch (Exception e) {
                        throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                                "Could not determine relevant models.", e));
                    } finally {
                        IOUtil.closeSilent(view);
                    }
                } finally {
                    CDOConnectionManager.getInstance().releaseSession(session);
                }

                return true;
            }
        };

        project.accept(launcherFilesFinder);
        return modelNames;
    }

}