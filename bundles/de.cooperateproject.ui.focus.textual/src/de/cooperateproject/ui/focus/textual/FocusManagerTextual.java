package de.cooperateproject.ui.focus.textual;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.common.conventions.FileExtensions;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.ui.focus.manager.FocusManagerBase;
import de.cooperateproject.util.editor.ILauncherFileEditorInput;

public class FocusManagerTextual extends FocusManagerBase<XtextEditor> {

    private static final Logger LOGGER = Logger.getLogger(FocusManagerTextual.class);

    public FocusManagerTextual(XtextEditor editorPart) {
        super(editorPart);
    }

    @Override
    public void setFocusedElement(EObject element) {

        UMLToConcreteSyntaxElementWork unit = new UMLToConcreteSyntaxElementWork();
        unit.setUmlElement(element);
        getEditorPart().getDocument().modify(unit);

        ICompositeNode node = NodeModelUtils.findActualNodeFor(unit.getConcreteSyntaxElement());
        if (node == null) {
            LOGGER.error("Couldn't set the focus on requested element. Element couldn't be found in Xtext resource.");
            return;
        }
        ITextSelection selection = new TextSelection(getEditorPart().getDocument(), node.getOffset(), 0);
        getEditorPart().getSelectionProvider().setSelection(selection);
        getEditorPart().setFocus();
    }

    /**
     * Extracts the current element focus of the editor.
     * 
     * @return the focused element
     */
    @Override
    public Optional<Element> getFocusedElement() {
        FocusIUnitOfWork unit = new FocusIUnitOfWork();
        unit.setOffset(((TextSelection) getEditorPart().getSelectionProvider().getSelection()).getOffset());
        getEditorPart().getDocument().modify(unit);

        EObject focusedElement = unit.getFocusedElement();
        return getFocusableElement(focusedElement);
    }

    private Optional<Element> getFocusableElement(EObject focusedElement) {

        if (focusedElement == null) {
            return Optional.empty();
        } else if (focusedElement instanceof ClassDiagram) {
            return Optional.ofNullable(((ClassDiagram) focusedElement).getRootPackage().getReferencedElement());
        } else if (focusedElement instanceof UMLReferencingElement) {
            return Optional.ofNullable(((UMLReferencingElement) focusedElement).getReferencedElement());
        } else {
            return getFocusableElement(focusedElement.eContainer());
        }
    }

    private class FocusIUnitOfWork extends IUnitOfWork.Void<XtextResource> {

        private int offset = -1;
        private EObject focusedElement = null;

        public void setOffset(int offset) {
            this.offset = offset;
        }

        @Override
        public void process(XtextResource state) throws Exception {
            EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();
            if (offset != -1) {
                focusedElement = helper.resolveContainedElementAt(state, offset);
            }
        }

        public EObject getFocusedElement() {
            return focusedElement;
        }

    }

    private class UMLToConcreteSyntaxElementWork extends IUnitOfWork.Void<XtextResource> {

        private EObject umlElement = null;
        private EObject concreteSyntaxElement = null;

        public void setUmlElement(EObject element) {
            umlElement = element;
        }

        @Override
        public void process(XtextResource state) throws Exception {
            if (umlElement == null) {
                return;
            }
            TreeIterator<EObject> it = state.getAllContents();
            while (it.hasNext()) {
                EObject clsTempElement = it.next();
                if (clsTempElement instanceof UMLReferencingElement) {
                    Element referencedElement = ((UMLReferencingElement) clsTempElement).getReferencedElement();
                    if (EcoreUtil.equals(referencedElement, umlElement)) {
                        concreteSyntaxElement = clsTempElement;
                        break;
                    }
                }
            }
        }

        public EObject getConcreteSyntaxElement() {
            return concreteSyntaxElement;
        }

    }

    @Override
    public IFile getCooperateLauncherFile() {
        IEditorInput editorInput = getEditorPart().getEditorInput();
        if (editorInput instanceof ILauncherFileEditorInput) {
            return ((ILauncherFileEditorInput) editorInput).getAssociatedLauncherFile();
        }
        throw new IllegalStateException("The editor input is not compatible.");
    }

    @SuppressWarnings("restriction")
    @Override
    public Optional<CDOView> getCDOView() {
        IEditorInput editorInput = getEditorPart().getEditorInput();
        if (editorInput instanceof CDOLobEditorInput) {
            return Optional.ofNullable(((CDOLobEditorInput) editorInput).getResource().cdoView());
        }
        return Optional.empty();
    }

    @SuppressWarnings("restriction")
    @Override
    public Optional<DiagramTypes> getDiagramType() {
        IEditorInput editorInput = getEditorPart().getEditorInput();
        if (editorInput instanceof CDOLobEditorInput) {
            CDOResourceLeaf resource = ((CDOLobEditorInput) editorInput).getResource();
            String actualExtension = resource.getURI().fileExtension();
            Optional<FileExtensions> fileExtension = FileExtensions.getByFileExtension(actualExtension);
            if (fileExtension.isPresent()) {
                return Optional.of(fileExtension.get().getDiagramType());
            }
        }
        return Optional.empty();
    }

}
