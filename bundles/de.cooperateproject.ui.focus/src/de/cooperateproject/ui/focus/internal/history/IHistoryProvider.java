package de.cooperateproject.ui.focus.internal.history;

import java.util.Collection;

public interface IHistoryProvider {

    Collection<HistoryElement> getHistoryElements();

    void registerChangeListener(IHistoryChangedListener listener);

    void deregisterChangeListener(IHistoryChangedListener listener);
}
