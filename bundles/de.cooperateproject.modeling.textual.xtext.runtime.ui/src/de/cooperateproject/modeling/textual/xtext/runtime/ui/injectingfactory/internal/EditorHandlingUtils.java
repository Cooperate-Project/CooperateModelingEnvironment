package de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal;

import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public final class EditorHandlingUtils {

    private EditorHandlingUtils() {
    }

    public static Optional<EPackage> determineEPackage(IEditorPart editor) {
        XtextEditor xtextEditor = editor.getAdapter(XtextEditor.class);
        return xtextEditor.getDocument().priorityReadOnly(
                resource -> resource.getContents().stream().findFirst().map(EObject::eClass).map(EClass::getEPackage));
    }

    public static Optional<EObject> findEObjectAtPosition(XtextEditor editor, ITextSelection selection) {
        Optional<EObjectAtOffsetHelper> helper = determineEPackage(editor)
                .flatMap(InjectingFactoryRegistry.getInstance()::getFactory)
                .map(f -> f.inject(EObjectAtOffsetHelper.class)).map(EObjectAtOffsetHelper.class::cast);
        if (!helper.isPresent()) {
            return Optional.empty();
        }
        return Optional.ofNullable(editor.getDocument().priorityReadOnly(new IUnitOfWork<EObject, XtextResource>() {
            @Override
            public EObject exec(XtextResource resource) throws Exception {
                return helper.get().resolveElementAt(resource, selection.getOffset());
            }
        }));
    }

}
