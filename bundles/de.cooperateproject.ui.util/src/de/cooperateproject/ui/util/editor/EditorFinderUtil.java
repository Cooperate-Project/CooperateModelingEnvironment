package de.cooperateproject.ui.util.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EditorFinderUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(EditorFinderUtil.class);

    public static Collection<IEditorPart> findEditor(IEditorInput input) {
        return findAllPages().stream().map(p -> p.findEditor(input)).filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

    public static Collection<IEditorPart> findEditor(Predicate<IEditorInput> matchingInput) {
        return findEditor(findAllOpenEditors(), matchingInput);
    }

    public static Optional<IEditorPart> findEditor(String editorId, Predicate<IEditorInput> matchingInput) {
        Collection<IEditorPart> editors = findAllOpenEditors();
        if (editorId != null) {
            editors = editors.stream().filter(e -> editorId.equals(e.getSite().getId())).collect(Collectors.toSet());
        }
        Collection<IEditorPart> candidates = findEditor(editors, matchingInput);
        if (candidates.size() > 1) {
            LOGGER.warn("Found more than one matching editor. Result is ambiguous.");
        }
        return candidates.stream().findFirst();
    }

    private static Collection<IEditorPart> findEditor(Collection<IEditorPart> editors,
            Predicate<IEditorInput> matchingInput) {
        return editors.stream().filter(e -> matchingInput.test(e.getEditorInput())).collect(Collectors.toList());
    }

    private static Collection<IEditorPart> findAllOpenEditors() {
        return findAllOpenEditorReferences().stream().map(r -> r.getEditor(false)).filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

    private static Collection<IEditorReference> findAllOpenEditorReferences() {
        List<IEditorReference> editors = new ArrayList<IEditorReference>();
        for (IWorkbenchPage page : findAllPages()) {
            for (IEditorReference editor : page.getEditorReferences()) {
                editors.add(editor);
            }
        }
        return editors;
    }

    private static Collection<IWorkbenchPage> findAllPages() {
        List<IWorkbenchPage> pages = new ArrayList<IWorkbenchPage>();
        for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
            for (IWorkbenchPage page : window.getPages()) {
                pages.add(page);
            }
        }
        return pages;
    }
}
