package de.cooperateproject.ui.editors.launcher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;

import de.cooperateproject.ui.util.EmptyPartListener2;

public class DisposedListener extends EmptyPartListener2 {

    @FunctionalInterface
    public interface PartClosedHandler {
        public void editorClosed(IWorkbenchPage page);
    }

    @FunctionalInterface
    public interface PartDisposedChecker {
        public boolean partDisposed(IWorkbenchPartReference partRef);
    }

    private final PartClosedHandler partClosedHandler;
    private final PartDisposedChecker partDisposedChecker;
    private final IEditorPart editorPart;

    public DisposedListener(IEditorPart editorPart, PartClosedHandler partClosedHandler) {
        this(editorPart, partClosedHandler, p -> p.getPart(false) == null);
    }

    public DisposedListener(IEditorPart editorPart, PartClosedHandler partClosedHandler,
            PartDisposedChecker partDisposedChecker) {
        this.editorPart = editorPart;
        this.partClosedHandler = partClosedHandler;
        this.partDisposedChecker = partDisposedChecker;
    }

    @Override
    public void partClosed(IWorkbenchPartReference partRef) {
        IWorkbenchPart part = partRef.getPart(false);
        if (editorPart == part) {
            Runnable runnable = () -> handlePartClosed(partRef);
            new Thread(runnable).start();
        }
    }

    private void handlePartClosed(IWorkbenchPartReference partRef) {
        waitForDisposed(partRef);
        editorClosed(partRef.getPage());
    }

    private void waitForDisposed(final IWorkbenchPartReference partRef) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                while (!partDisposedChecker.partDisposed(partRef)) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        });
        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            return;
        } finally {
            executor.shutdownNow();
        }

    }

    protected void editorClosed(IWorkbenchPage page) {
        partClosedHandler.editorClosed(page);
    }

}
