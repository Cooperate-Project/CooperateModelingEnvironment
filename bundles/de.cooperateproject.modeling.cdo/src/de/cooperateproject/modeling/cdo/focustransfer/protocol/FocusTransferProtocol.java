package de.cooperateproject.modeling.cdo.focustransfer.protocol;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;

import de.cooperateproject.modeling.cdo.focustransfer.protocol.indication.FocusTransferElementSelectionIndication;

public class FocusTransferProtocol extends SignalProtocol<FocusTransferProtocolInfrastructure> {

	public static final String PROTOCOL_ID = "COOPERATE_FOCUS_TRANSFER";
	private final Map<Short, Supplier<SignalReactor>> signalReactorFactories;
	
	public FocusTransferProtocol() {
		super(PROTOCOL_ID);
		signalReactorFactories = createFactories();
	}

	@Override
	protected SignalReactor createSignalReactor(short signalID) {
		return Optional.ofNullable(signalReactorFactories.get(signalID)).map(Supplier::get)
				.orElseGet(() -> super.createSignalReactor(signalID));
	}
	
	protected Map<Short, Supplier<SignalReactor>> createFactories() {
		Map<Short, Supplier<SignalReactor>> result = new HashMap<>();

		result.put(FocusTransferElementSelectionIndication.SIGNAL_ID,
				() -> new FocusTransferElementSelectionIndication(this));

		return result;
	}
	
}
