package de.cooperateproject.ui.textualeditors.editorlauncher;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.IPostSaveListenerSupport;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.IReloadingEditor;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.input.CooperateCDOLobEditorInput;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncherBase;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.util.editor.EditorFinderUtil;

/**
 * Editor launcher for textual editors that operate on CDO models.
 */
public class TextualCDOEditorLauncher extends EditorLauncherBase {

    /**
     * Instantiates the launcher.
     * 
     * @param launcherFile
     *            The launcher file that has been selected.
     * @throws IOException
     *             Thrown if an error occurs during processing of the launcher file.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown if there is no textual syntax defined in the launcher file.
     */
    public TextualCDOEditorLauncher(IFile launcherFile) throws IOException, ConcreteSyntaxTypeNotAvailableException {
        super(launcherFile, EditorType.TEXTUAL);
    }

    @Override
    protected IEditorPart doOpenEditor() throws PartInitException {
        CDOResourceLeaf cdoResource = (CDOResourceLeaf) getConcreteSyntaxModel().getRootElement().eResource();
        IEditorInput editorInput = new CooperateCDOLobEditorInput(cdoResource, getLauncherFile());
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IDiagramType editorId;
        try {
            editorId = getEditorId(getConcreteSyntaxModel());
        } catch (ConcreteSyntaxTypeNotAvailableException e) {
            throw new PartInitException("Error in loading the editor.", e);
        }
        IEditorPart editor = IDE.openEditor(page, editorInput, editorId.getTextualEditorId());

        IPostSaveListenerSupport postProcessingSupport = editor.getAdapter(IPostSaveListenerSupport.class);
        if (postProcessingSupport != null) {
            postProcessingSupport.register(() -> handleEditorSave(editor));
        }

        return editor;
    }

    private static IDiagramType getEditorId(ConcreteSyntaxModel concreteSyntaxModel)
            throws ConcreteSyntaxTypeNotAvailableException {
        Optional<IDiagramType> editorId = DiagramTypeRegistry.INSTANCE
                .getByFileExtension(concreteSyntaxModel.getExtension());
        if (!editorId.isPresent()) {
            throw new ConcreteSyntaxTypeNotAvailableException("Could not find appropriate editor.");
        }
        return editorId.get();
    }

    /**
     * Finds an existing editor instance for the given launcher file. The found editor has the same type as the one that
     * would be launched for this file by this launcher.
     * 
     * @param launcherFile
     *            The launcher file associated with the wanted editor.
     * @return The found editor or {@link Optional#empty()} otherwise.
     */
    public static Optional<IEditorPart> findExistingEditor(IFile launcherFile) {
        IEditorInput editorInput = new FileEditorInput(launcherFile);
        Collection<IEditorPart> editorCandidates = EditorFinderUtil.findEditor(editorInput);

        return editorCandidates.stream()
                .filter(ec -> DiagramTypeRegistry.INSTANCE.getByTextualEditorId(ec.getEditorSite().getId()).isPresent())
                .findFirst();
    }

    @Override
    protected void reloadEditorContentAfterViewChange(IWorkbenchPart source) {
        Optional.ofNullable(source).filter(IReloadingEditor.class::isInstance).map(IReloadingEditor.class::cast)
                .ifPresent(IReloadingEditor::reloadDocumentContent);
    }

}
