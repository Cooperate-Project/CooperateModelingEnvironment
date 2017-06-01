package de.cooperateproject.ui.focus.internal.model;

import java.io.Closeable;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.ui.focus.internal.history.IHistoryProvider;

interface IFocusedDiagram extends IHistoryProvider, Closeable {

    IEditorPart getEditorPart();

    void init() throws IOException;

    void setFocusedElement(EObject element);

    void sendCurrentlyFocusedElement();

    void clearHistoryElements();

    boolean isMute();

    void setMute(boolean value);

    String getDiagramTitle();

}