package de.cooperateproject.ui.focus.internal.model;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.ui.focus.internal.history.HistoryElement;
import de.cooperateproject.ui.focus.internal.history.IHistoryChangedListener;
import de.cooperateproject.ui.focus.internal.messaging.MessageHandler;
import de.cooperateproject.ui.focus.internal.utils.LabelUtils;
import de.cooperateproject.ui.focus.manager.IFocusManager;

class FocusedDiagram implements IFocusedDiagram {

    private static final Logger LOGGER = Logger.getLogger(FocusedDiagram.class);
    private final Collection<IHistoryChangedListener> historyChangedListeners = new HashSet<>();
    private final List<HistoryElement> history = new ArrayList<>();
    private final MessageHandler messageHandler = new MessageHandler();
    private final IFocusManager focusManager;
    private boolean mute;

    FocusedDiagram(IFocusManager focusManager) {
        this.focusManager = focusManager;
        this.mute = false;
    }

    @Override
    public IEditorPart getEditorPart() {
        return focusManager.getEditorPart();
    }

    @Override
    public void init() throws IOException {
        messageHandler.init(focusManager.getCooperateLauncherFile(), focusManager::getCDOView,
                this::handleFocusRequest);
    }

    @Override
    public void close() {
        historyChangedListeners.clear();
        messageHandler.close();
    }

    @Override
    public Collection<HistoryElement> getHistoryElements() {
        return Collections.unmodifiableCollection(history);
    }

    private void handleFocusRequest(CDOObject object, long timestamp) {
        history.add(new HistoryElement(object, timestamp));
        historyChangedListeners.forEach(l -> l.historyChanged(this));
        if (!mute) {
            Display.getDefault().syncExec(() -> showFocusDialog(object));
        }
    }

    private void showFocusDialog(CDOObject object) {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        String elementLabel = LabelUtils.getEObjectLabel(object);
        String message = elementLabel + " has been focused. Would you like to jump to it?";
        Toolkit.getDefaultToolkit().beep();
        if (MessageDialog.openConfirm(shell, "Incoming element focus", message)) {
            setFocusedElement(object);
        }
    }

    @Override
    public void setFocusedElement(EObject element) {
        focusManager.setFocusedElement(element);
    }

    @Override
    public void sendCurrentlyFocusedElement() {
        Optional<Element> element = focusManager.getFocusedElement();
        if (!element.isPresent()) {
            LOGGER.info("No element focused.");
            return;
        }

        Optional<DiagramTypes> currentDiagramType = focusManager.getDiagramType();
        if (!currentDiagramType.isPresent()) {
            LOGGER.info("Diagram type could not be detected.");
            return;
        }

        Element focusedElement = element.get();

        try {
            CDOObject cdoObject = CDOUtil.getCDOObject(focusedElement);
            messageHandler.sendFocus(cdoObject);
        } catch (Exception e) {
            LOGGER.error("Could not send focus request.", e);
        }

    }

    @Override
    public void registerChangeListener(IHistoryChangedListener listener) {
        historyChangedListeners.add(listener);
    }

    @Override
    public void deregisterChangeListener(IHistoryChangedListener listener) {
        historyChangedListeners.remove(listener);
    }

    @Override
    public void clearHistoryElements() {
        history.clear();
        historyChangedListeners.forEach(l -> l.historyChanged(this));
    }

    @Override
    public boolean isMute() {
        return mute;
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
    }

    @Override
    public String getDiagramTitle() {
        return focusManager.getCooperateLauncherFile().getName();
    }

}
