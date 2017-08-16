package de.cooperateproject.ui.papyrus.editorlauncher;

import java.util.Objects;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;

/**
 * {@link URIEditorInput} that additionally can hold an {@link IFile} referring to a launcher file.
 */
public class CooperateURIEditorInput extends URIEditorInput implements ILauncherFileEditorInput {

    private final IFile launcherFile;

    /**
     * Instantiates the editor input.
     * 
     * @param uri
     *            The URI to be used for the {@link URIEditorInput}
     * @param launcherFile
     *            The launcher file that shall be available on request.
     */
    public CooperateURIEditorInput(URI uri, IFile launcherFile) {
        super(uri);
        this.launcherFile = launcherFile;
    }

    @Override
    public IFile getAssociatedLauncherFile() {
        return launcherFile;
    }

    @Override
    public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
        if (adapter == ILauncherFileEditorInput.class) {
            return this;
        }
        return super.getAdapter(adapter);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + launcherFile.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean localResult = true;
        if (o instanceof CooperateURIEditorInput) {
            localResult = Objects.equals(((CooperateURIEditorInput) o).getAssociatedLauncherFile(), launcherFile);
        }
        return super.equals(o) && localResult;
    }

    @Override
    public ConcreteSyntaxTypes getEditorType() {
        return ConcreteSyntaxTypes.GRAPHICAL;
    }

}
