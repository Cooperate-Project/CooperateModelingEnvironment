package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal.EditorHandlingUtils;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal.InjectingFactoryRegistry;

/**
 * Handler for rename refactorings on UML elements.
 */
public class RenameUMLElementRefactoringHandler extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RenameUMLElementRefactoringHandler.class);

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            final XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
            Optional<EPackage> ePackage = EditorHandlingUtils.determineEPackage(editor);
            Optional<EObjectAtOffsetHelper> eObjectAtOffsetHelper = ePackage
                    .flatMap(InjectingFactoryRegistry.INSTANCE::getFactory)
                    .map(f -> f.inject(EObjectAtOffsetHelper.class)).map(EObjectAtOffsetHelper.class::cast);
            if (!eObjectAtOffsetHelper.isPresent()) {
                throw new IllegalStateException("Unable to create required helper classes.");
            }

            if (editor != null) {
                final ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
                EObject selectedEObject = editor.getDocument()
                        .priorityReadOnly(new IUnitOfWork<EObject, XtextResource>() {
                            @Override
                            public EObject exec(XtextResource resource) throws Exception {
                                return eObjectAtOffsetHelper.get().resolveElementAt(resource, selection.getOffset());
                            }
                        });
                startRename(selectedEObject, editor, editor.getShell());
            }
        } catch (OperationCanceledException e) {
            LOGGER.debug("Refactoring operation has been canceled.", e);
        } catch (Exception exc) {
            LOGGER.error("Error initializing refactoring", exc);
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error initializing refactoring",
                    exc.getMessage() + "\nSee log for details");
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private static void startRename(EObject selectedEObject, IEditorPart editor, Shell parentShell) {
        if (selectedEObject instanceof UMLReferencingElement && selectedEObject instanceof NamedElement) {
            startRename((UMLReferencingElement<org.eclipse.uml2.uml.NamedElement>) selectedEObject, editor,
                    parentShell);
        }
    }

    private static void startRename(UMLReferencingElement<org.eclipse.uml2.uml.NamedElement> selectedEObject,
            IEditorPart editor, Shell parentShell) {
        try {
            RefactoringWizardOpenOperation openOperation = new RefactoringWizardOpenOperation(
                    new RenameUMLElementRefactoringWizard(selectedEObject, editor));
            openOperation.run(parentShell, "Rename UML element");
        } catch (InterruptedException e) {
            return;
        }
    }

}
