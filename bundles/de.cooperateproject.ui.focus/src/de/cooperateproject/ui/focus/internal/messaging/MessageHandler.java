package de.cooperateproject.ui.focus.internal.messaging;

import java.io.Closeable;
import java.io.IOException;
import java.util.Optional;

import javax.inject.Provider;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.view.CDOView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.cdo.focustransfer.IFocusTransferHandlerConcrete;
import de.cooperateproject.ui.focus.Activator;

public class MessageHandler implements Closeable, IFocusTransferHandlerConcrete {

    @FunctionalInterface
    public interface FocusRequestHandler {
        void handleFocusRequest(CDOObject object, long timestamp);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageHandler.class);
    private FocusRequestHandler focusRequestHandler;
    private Provider<Optional<CDOView>> viewProvider;
    private String diagramIdentifier;

    public void init(IFile launcherFile, Provider<Optional<CDOView>> viewProvider, FocusRequestHandler requestHandler)
            throws IOException {
        this.viewProvider = viewProvider;
        this.diagramIdentifier = launcherFile.getName();
        this.focusRequestHandler = requestHandler;
        Activator.getDefault().getFocusTransferManager().registerHandler(this, diagramIdentifier);
    }

    @Override
    public void close() {
        try {
            Activator.getDefault().getFocusTransferManager().unregisterHandler(this, diagramIdentifier);
        } catch (IOException e) {
            LOGGER.warn("Could not unregister.", e);
        }
    }

    public void sendFocus(CDOObject object) throws IOException {
        Activator.getDefault().getFocusTransferManager().sendFocusRequest(this, diagramIdentifier, object.cdoID());
    }

    @Override
    public void handleFocusRequest(String diagramIdentifier, CDOID elementID) {
        Optional<CDOView> cdoView = viewProvider.get();
        if (!cdoView.isPresent()) {
            LOGGER.warn("Could not recover object by ID because of missing CDO view.");
            return;
        }
        CDOObject object = cdoView.get().getObject(elementID);
        focusRequestHandler.handleFocusRequest(object, System.currentTimeMillis());
    }

    @Override
    public CDOView getAssociatedCDOView() {
        return viewProvider.get().orElse(null);
    }

}
