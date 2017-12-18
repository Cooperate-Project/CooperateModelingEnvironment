package de.cooperateproject.ui.focus.textual;

import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.ui.focus.manager.FocusManagerBase;

/**
 * Manages focus in textual view.
 * 
 * @author czogalik
 *
 */
class FocusManagerTextual extends FocusManagerBase<XtextEditor> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FocusManagerTextual.class);

    /**
     * Sets EditorPart.
     * 
     * @param editorPart
     *            to set.
     */
    FocusManagerTextual(XtextEditor editorPart) {
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
        getEditorPart().getSite().getPage().activate(getEditorPart());
    }

    @Override
    public Optional<Element> getFocusedElement() {
        FocusIUnitOfWork unit = new FocusIUnitOfWork();
        unit.setOffset(((TextSelection) getEditorPart().getSelectionProvider().getSelection()).getOffset());
        getEditorPart().getDocument().modify(unit);

        EObject focusedElement = unit.getFocusedElement();
        return getFocusableElement(focusedElement);
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
    public Optional<IDiagramType> getDiagramType() {
        IEditorInput editorInput = getEditorPart().getEditorInput();
        if (editorInput instanceof CDOLobEditorInput) {
            CDOResourceLeaf resource = ((CDOLobEditorInput) editorInput).getResource();
            String actualExtension = resource.getURI().fileExtension();
            return DiagramTypeRegistry.getInstance().getByFileExtension(actualExtension);
        }
        return Optional.empty();
    }

    private static Optional<Element> getFocusableElement(EObject focusedElement) {

        if (focusedElement == null) {
            return Optional.empty();
        } else if (focusedElement instanceof UMLReferencingElement) {
            return getElementFromUml((UMLReferencingElement) focusedElement);
        } else {
            return getFocusableElement(focusedElement.eContainer());
        }
    }

    private static Optional<Element> getElementFromUml(UMLReferencingElement referencingElement) {
        Element referencedElement = referencingElement.getReferencedElement();
        if (referencedElement == null) {
            return getFocusableElement(referencingElement.eContainer());
        }
        return Optional.ofNullable(referencedElement);
    }

}
