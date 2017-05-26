package de.cooperateproject.ui.focus.internal.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;

import de.cooperateproject.ui.focus.internal.history.HistoryElement;
import de.cooperateproject.ui.focus.internal.history.IHistoryChangedListener;
import de.cooperateproject.ui.focus.internal.history.IHistoryProvider;

class FocusViewModel {

    private final WritableValue<String> diagramTitle;
    private final WritableValue<Boolean> muteStatus;
    private final WritableList<HistoryElement> historyElement;
    private final IHistoryChangedListener historyChangedListener;
    private IFocusedDiagram fd;

    public FocusViewModel() {
        diagramTitle = new WritableValue<>();
        muteStatus = new WritableValue<>();
        historyElement = new WritableList<>(new ArrayList<>(), HistoryElement.class);
        historyChangedListener = this::historyChanged;
        diagramTitle.addChangeListener(this::handleChange);
        muteStatus.addChangeListener(this::handleChange);
    }

    public void setFocusedDiagram(IFocusedDiagram focusedDiagram) {
        if (fd != null) {
            fd.deregisterChangeListener(historyChangedListener);
        }
        this.fd = focusedDiagram;
        if (focusedDiagram != null) {
            muteStatus.setValue(focusedDiagram.isMute());
            diagramTitle.setValue(focusedDiagram.getDiagramTitle());
            updateHistoryElements(fd.getHistoryElements());
            focusedDiagram.registerChangeListener(historyChangedListener);
        } else {
            muteStatus.setValue(false);
            diagramTitle.setValue("");
            updateHistoryElements(Collections.emptyList());
        }
    }

    public IObservableValue<String> getDiagramTitleObservable() {
        return diagramTitle;
    }

    public IObservableValue<Boolean> getMuteStatusObservable() {
        return muteStatus;
    }

    private void handleChange(ChangeEvent ce) {
        if (fd == null) {
            return;
        }
        if (ce.getObservable() == muteStatus) {
            fd.setMute(muteStatus.getValue());
        }
    }

    public IObservableList<HistoryElement> getHistoryElementObservable() {
        return historyElement;
    }

    private void historyChanged(IHistoryProvider sender) {
        updateHistoryElements(sender.getHistoryElements());
    }

    private void updateHistoryElements(Collection<HistoryElement> historyElements) {
        historyElement.getRealm().exec(() -> updateHistoryElements(historyElement, historyElements));
    }

    private static void updateHistoryElements(WritableList<HistoryElement> list,
            Collection<HistoryElement> historyElements) {
        list.clear();
        list.addAll(historyElements);
    }
}
