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
	
	private final PartClosedHandler partClosedHandler;
	private final IEditorPart editorPart;

	public DisposedListener(IEditorPart editorPart, PartClosedHandler partClosedHandler) {
		this.editorPart = editorPart;
		this.partClosedHandler = partClosedHandler;
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
				while (partRef.getPart(false) != null) {
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
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			return;
		} finally {
			if (!executor.isShutdown()) {
				executor.shutdownNow();
			}
		}

	}

	protected void editorClosed(IWorkbenchPage page) {
		partClosedHandler.editorClosed(page);
	}

}
