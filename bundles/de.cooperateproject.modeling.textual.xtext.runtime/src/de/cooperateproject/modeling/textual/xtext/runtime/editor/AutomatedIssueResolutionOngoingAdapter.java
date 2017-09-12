package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

public class AutomatedIssueResolutionOngoingAdapter implements Adapter {

    private Notifier myTarget;

    public Notifier getTarget() {
        return myTarget;
    }

    public void notifyChanged(Notification notification) {
    }

    public void setTarget(Notifier newTarget) {
        myTarget = newTarget;
    }

    @Override
    public boolean isAdapterForType(Object type) {
        return false;
    }

}
