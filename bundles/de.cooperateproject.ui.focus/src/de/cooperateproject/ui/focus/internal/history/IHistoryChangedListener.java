package de.cooperateproject.ui.focus.internal.history;

@FunctionalInterface
public interface IHistoryChangedListener {

    public void historyChanged(IHistoryProvider sender);

}
