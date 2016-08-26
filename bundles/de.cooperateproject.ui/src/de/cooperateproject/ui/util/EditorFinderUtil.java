package de.cooperateproject.ui.util;

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

public class EditorFinderUtil {

	public static Collection<IEditorPart> findEditor(IEditorInput input) {
		return findAllPages().stream().map(p -> p.findEditor(input)).filter(Objects::nonNull).collect(Collectors.toSet());
	}
	
	public static Optional<IEditorPart> findEditor(String editorIdGraphical, Predicate<IEditorInput> matchingInput) {
		Collection<IEditorPart> editors = findAllOpenEditors();
		if (editorIdGraphical != null) {
			editors = editors.stream().filter(e -> editorIdGraphical.equals(e.getSite().getId())).collect(Collectors.toSet());
		}
		return findEditor(editors, matchingInput);
	}
	
	private static Optional<IEditorPart> findEditor(Collection<IEditorPart> editors, Predicate<IEditorInput> matchingInput) {
		for (IEditorPart editor : editors) {
			IEditorInput editorInput = editor.getEditorInput();
			if (matchingInput.test(editorInput)) {
				return Optional.of(editor);
			}
		}
		return Optional.empty();
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
