package de.cooperateproject.modeling.cdo.focustransfer.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.net4j.channel.IChannel;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.ISignalProtocol;
import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.util.io.IOUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import de.cooperateproject.modeling.cdo.focustransfer.IFocusTransferHandler;
import de.cooperateproject.modeling.cdo.focustransfer.IFocusTransferHandlerConcrete;
import de.cooperateproject.modeling.cdo.focustransfer.IFocusTransferManager;
import de.cooperateproject.modeling.cdo.focustransfer.protocol.FocusTransferProtocol;
import de.cooperateproject.modeling.cdo.focustransfer.protocol.FocusTransferProtocolInfrastructure;
import de.cooperateproject.modeling.cdo.focustransfer.protocol.request.FocusTransferElementSelectionRequest;
import de.cooperateproject.modeling.cdo.focustransfer.protocol.request.FocusTransferRegisterForDiagramRequest;
import de.cooperateproject.modeling.cdo.focustransfer.protocol.request.FocusTransferUnregisterForDiagramRequest;
import de.cooperateproject.modeling.cdo.util.ConnectorExtractorMixin;

@Component(scope=ServiceScope.SINGLETON)
public class FocusTransferManager implements IFocusTransferManager, ConnectorExtractorMixin {

	private static final Request ERROR_REQUEST = new ExceptionThrowingRequest();
	private static final long ASYNC_SEND_WAIT_MS = 500;
	private final Map<IFocusTransferHandler, Collection<String>> handlers = new HashMap<>();
	private final Map<IFocusTransferHandler, IChannel> openConnections = new HashMap<>();

	@Override
	public void registerHandler(IFocusTransferHandlerConcrete handler, String diagramIdentifier) throws IOException {
		handlers.putIfAbsent(handler, new HashSet<>());
		handlers.get(handler).add(diagramIdentifier);
		enableProtocol(handler);
		sendRequest(handler, p -> new FocusTransferRegisterForDiagramRequest(p, diagramIdentifier));
	}

	@Override
	public void unregisterHandler(IFocusTransferHandlerConcrete handler, String diagramIdentifier) throws IOException {
		Collection<String> registeredResources = handlers.getOrDefault(handler, Collections.emptySet());
		registeredResources.remove(diagramIdentifier);
		sendRequest(handler, p -> new FocusTransferUnregisterForDiagramRequest(p, diagramIdentifier));
		if (registeredResources.isEmpty()) {
			handlers.remove(handler);
			disableProtocol(handler);
		}
	}

	@Override
	public void sendFocusRequest(IFocusTransferHandlerConcrete handler, String diagramIdentifier, CDOID elementID)
			throws IOException {
		sendRequest(handler, p -> new FocusTransferElementSelectionRequest(p, diagramIdentifier, elementID));
	}

	protected void enableProtocol(IFocusTransferHandlerConcrete handler) {
		Optional<IConnector> connector = extractConnector(handler.getAssociatedCDOView());
		if (connector.map(IConnector::getChannels).map(channels -> !findFocusTransferChannels(channels).isEmpty())
				.orElse(false)) {
			// there is already a channel open for this one
			return;
		}

		FocusTransferProtocol protocol = new FocusTransferProtocol();
		protocol.setInfraStructure(new FocusTransferProtocolInfrastructure(handler::handleFocusRequest));
		Optional<IChannel> channel = connector.map(protocol::open);
		if (!channel.isPresent()) {
			// exception
			return;
		}

		openConnections.put(handler, channel.get());
	}

	protected void disableProtocol(IFocusTransferHandlerConcrete handler) {
		Optional<IChannel> channelToClose = Optional.ofNullable(openConnections.get(handler));
		channelToClose.map(IChannel::getReceiveHandler).filter(ISignalProtocol.class::isInstance)
				.map(ISignalProtocol.class::cast).ifPresent(ISignalProtocol::close);
		channelToClose.ifPresent(IOUtil::closeSilent);
		openConnections.remove(handler);
	}

	protected void sendRequest(IFocusTransferHandlerConcrete handler,
			Function<FocusTransferProtocol, Request> requestFactory) throws IOException {
		Request request = getProtocol(handler).map(requestFactory::apply).map(Request.class::cast)
				.orElse(ERROR_REQUEST);
		try {
			request.sendAsync();
			Thread.sleep(ASYNC_SEND_WAIT_MS);
		} catch (Exception e) {
			throw new IOException(e);
		}
	}

	protected Optional<FocusTransferProtocol> getProtocol(IFocusTransferHandlerConcrete handler) {
		return Optional.ofNullable(openConnections.get(handler)).map(IChannel::getReceiveHandler)
				.filter(FocusTransferProtocol.class::isInstance).map(FocusTransferProtocol.class::cast);
	}

	protected static Set<IChannel> findFocusTransferChannels(Collection<IChannel> channels) {
		return channels.stream().filter(c -> c.getReceiveHandler() instanceof FocusTransferProtocol)
				.collect(Collectors.toSet());
	}
	
}
