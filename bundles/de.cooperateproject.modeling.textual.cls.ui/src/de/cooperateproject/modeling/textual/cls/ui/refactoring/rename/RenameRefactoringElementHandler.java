package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

public class RenameRefactoringElementHandler extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RenameRefactoringElementHandler.class);

    @Inject
    private EObjectAtOffsetHelper eObjectAtOffsetHelper;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            final XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
            if (editor != null) {
                final ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
                EObject selectedEObject = editor.getDocument()
                        .priorityReadOnly(new IUnitOfWork<EObject, XtextResource>() {
                            @Override
                            public EObject exec(XtextResource resource) throws Exception {
                                return eObjectAtOffsetHelper.resolveElementAt(resource, selection.getOffset());
                            }
                        });
                startRename(selectedEObject, editor, editor.getShell());
            }
        } catch (OperationCanceledException e) {
            return null;
        } catch (Exception exc) {
            LOGGER.error("Error initializing refactoring", exc);
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error initializing refactoring",
                    exc.getMessage() + "\nSee log for details");
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private void startRename(EObject selectedEObject, IEditorPart editor, Shell parentShell) {
        if (selectedEObject instanceof UMLReferencingElement && selectedEObject instanceof NamedElement) {
            startRename((UMLReferencingElement<org.eclipse.uml2.uml.NamedElement>) selectedEObject, editor,
                    parentShell);
        }
    }

    private void startRename(UMLReferencingElement<org.eclipse.uml2.uml.NamedElement> selectedEObject,
            IEditorPart editor, Shell parentShell) {
        try {
            RefactoringWizardOpenOperation openOperation = new RefactoringWizardOpenOperation(
                    new RenameRefactoringWizard(selectedEObject, editor));
            openOperation.run(parentShell, "Rename UML element");
        } catch (InterruptedException e) {
            return;
        }
    }

}
