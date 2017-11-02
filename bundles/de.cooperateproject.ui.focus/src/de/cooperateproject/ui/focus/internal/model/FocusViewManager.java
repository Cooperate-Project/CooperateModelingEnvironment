package de.cooperateproject.ui.focus.internal.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.focus.internal.history.HistoryElement;
import de.cooperateproject.ui.focus.internal.utils.EditorMonitor;
import de.cooperateproject.ui.focus.internal.utils.IEditorListener;
import de.cooperateproject.ui.focus.manager.IFocusManager;

public enum FocusViewManager {

    INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(FocusViewManager.class);
    private final Map<IEditorPart, IFocusedDiagram> focusedDiagrams = new HashMap<>();
    private final FocusViewModel focusViewModel = createFocusViewModel();
    private EditorMonitor editorMonitor = createEditorMonitor();
    private IEditorPart activeEditor;

    public static FocusViewManager getInstance() {
        return INSTANCE;
    }

    private static FocusViewModel createFocusViewModel() {
        AtomicReference<FocusViewModel> model = new AtomicReference<>();
        Display.getDefault().syncExec(() -> model.set(new FocusViewModel()));
        return model.get();
    }

    public void start() {
        editorMonitor.start();
    }

    public void stop() {
        editorMonitor.stop();
        focusedDiagrams.values().forEach(IOUtils::closeQuietly);
    }

    public void sendCurrentFocus() {
        executeForFocusedDiagram(IFocusedDiagram::sendCurrentlyFocusedElement);
    }

    public void setFocus(HistoryElement historyElement) {
        executeForFocusedDiagram(fd -> fd.setFocusedElement(historyElement.getFocusedElement()));
    }

    public void clearHistoryElements() {
        executeForFocusedDiagram(IFocusedDiagram::clearHistoryElements);
    }

    public IObservableValue<String> getDiagramTitleObservable() {
        return focusViewModel.getDiagramTitleObservable();
    }

    public IObservableValue<Boolean> getMuteStatusObservable() {
        return focusViewModel.getMuteStatusObservable();
    }

    public IObservableList<HistoryElement> getHistoryElementObservable() {
        return focusViewModel.getHistoryElementObservable();
    }

    private void editorActivated(IEditorPart editor) {
        if (!focusedDiagrams.containsKey(editor) && InternalFocusManagerFactory.INSTANCE.canHandle(editor)) {
            IFocusManager focusManager = InternalFocusManagerFactory.INSTANCE.create(editor);
            IFocusedDiagram focusedDiagram = new FocusedDiagram(focusManager);
            focusedDiagrams.put(editor, focusedDiagram);
            try {
                focusedDiagram.init();
            } catch (IOException e) {
                LOGGER.warn(String.format("Could not initialize focus management for editor %s.", editor), e);
            }

        }
        setActiveEditor(editor);
    }

    private void editorClosed(IEditorPart editor) {
        if (focusedDiagrams.containsKey(editor)) {
            IOUtils.closeQuietly(focusedDiagrams.get(editor));
            focusedDiagrams.remove(editor);
        }
        if (activeEditor == editor) {
            setActiveEditor(null);
        }
    }

    private void setActiveEditor(IEditorPart editor) {
        if (activeEditor == editor) {
            return;
        }
        activeEditor = editor;
        updateModel(editor);
    }

    private void updateModel(IEditorPart editor) {
        if (!focusedDiagrams.containsKey(editor)) {
            focusViewModel.setFocusedDiagram(null);
            return;
        }

        IFocusedDiagram focusedDiagram = focusedDiagrams.get(editor);
        focusViewModel.setFocusedDiagram(focusedDiagram);
    }

    private void executeForFocusedDiagram(Consumer<IFocusedDiagram> runnable) {
        if (focusedDiagrams.containsKey(activeEditor)) {
            runnable.accept(focusedDiagrams.get(activeEditor));
        } else {
            LOGGER.warn("No active editor could be found.");
        }
    }

    private EditorMonitor createEditorMonitor() {
        return new EditorMonitor(new IEditorListener() {
            @Override
            public void editorActivated(IEditorPart editor) {
                FocusViewManager.this.editorActivated(editor);
            }

            @Override
            public void editorClosed(IEditorPart editor) {
                FocusViewManager.this.editorClosed(editor);
            }
        });
    }

}
