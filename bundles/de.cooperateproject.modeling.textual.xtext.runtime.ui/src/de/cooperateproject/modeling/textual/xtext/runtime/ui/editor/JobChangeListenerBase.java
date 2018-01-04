package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;

/**
 * Dummy implementation of {@link IJobChangeListener}. The listener does not react on any notification.
 */
public class JobChangeListenerBase implements IJobChangeListener {

    @Override
    public void aboutToRun(IJobChangeEvent event) {
        return;
    }

    @Override
    public void awake(IJobChangeEvent event) {
        return;
    }

    @Override
    public void done(IJobChangeEvent event) {
        return;
    }

    @Override
    public void running(IJobChangeEvent event) {
        return;
    }

    @Override
    public void scheduled(IJobChangeEvent event) {
        return;
    }

    @Override
    public void sleeping(IJobChangeEvent event) {
        return;
    }

}
