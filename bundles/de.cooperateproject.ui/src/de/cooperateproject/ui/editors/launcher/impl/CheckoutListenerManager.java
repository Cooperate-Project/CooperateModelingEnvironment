package de.cooperateproject.ui.editors.launcher.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;

public enum CheckoutListenerManager implements IListener {

    INSTANCE;

    private final Collection<IOneTimeAction> actions = new HashSet<>();

    public interface IOneTimeAction {
        boolean process(IEvent event);
    }

    public void registerOneTimeAction(IOneTimeAction action) {
        actions.add(action);
    }

    @Override
    public void notifyEvent(IEvent event) {
        actions.removeIf(action -> action.process(event));
    }

}
