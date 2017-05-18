package de.cooperateproject.ui.focus.internal.messaging;

import java.io.Closeable;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

import javax.inject.Provider;
import javax.jms.JMSException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.view.CDOView;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;

public class MessageHandler implements Closeable {

    @FunctionalInterface
    public interface FocusRequestHandler {
        void handleFocusRequest(CDOObject object, long timestamp);
    }

    private static final Logger LOGGER = Logger.getLogger(MessageHandler.class);
    private JMSIO jmsIO;
    private FocusRequestHandler focusRequestHandler;

    public void init(IFile launcherFile, Provider<Optional<CDOView>> viewProvider, FocusRequestHandler requestHandler)
            throws IOException {
        ProjectPropertiesStore propertiesStore = new ProjectPropertiesStore(launcherFile.getProject());
        propertiesStore.initFromStore();
        ProjectPropertiesDTO properties = propertiesStore.getPreferences();

        focusRequestHandler = requestHandler;
        jmsIO = new JMSIO(properties.getCdoHost(), properties.getMsgPort(), launcherFile.getName());
        try {
            jmsIO.init(m -> handleMessage(m, viewProvider));
        } catch (JMSException | URISyntaxException e) {
            throw new IOException("Could not initialize connection to message broker.", e);
        }
    }

    @Override
    public void close() {
        if (jmsIO != null) {
            jmsIO.close();
        }
    }

    public void sendFocus(CDOObject object) throws JMSException {
        jmsIO.sendMessage(object.cdoID());
    }

    private void handleMessage(IFocusMessage message, Provider<Optional<CDOView>> viewProvider) {
        Optional<CDOView> cdoView = viewProvider.get();
        if (!cdoView.isPresent()) {
            LOGGER.warn("Could not recover object by ID because of missing CDO view.");
            return;
        }
        CDOObject object = cdoView.get().getObject(message.getCDOID());
        focusRequestHandler.handleFocusRequest(object, message.getTimestamp());
    }

}
