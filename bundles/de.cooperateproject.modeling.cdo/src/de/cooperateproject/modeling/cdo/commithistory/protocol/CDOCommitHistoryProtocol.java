package de.cooperateproject.modeling.cdo.commithistory.protocol;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDOCommitHistoryProtocol extends SignalProtocol<Object> {

    public static final String PROTOCOL_ID = "CDO_COMMIT_HISTORY";
    private static final Logger LOGGER = LoggerFactory.getLogger(CDOCommitHistoryProtocol.class);
    private final Map<Short, Supplier<SignalReactor>> reactorMap;

    public CDOCommitHistoryProtocol() {
        super(PROTOCOL_ID);
        reactorMap = createReactorMap();
    }

    @Override
    protected SignalReactor createSignalReactor(short signalID) {
        return reactorMap.getOrDefault(signalID, () -> super.createSignalReactor(signalID)).get();
    }

    private static Map<Short, Supplier<SignalReactor>> createReactorMap() {
        Map<Short, Supplier<SignalReactor>> reactors = new HashMap<>();

        return reactors;
    }

}
