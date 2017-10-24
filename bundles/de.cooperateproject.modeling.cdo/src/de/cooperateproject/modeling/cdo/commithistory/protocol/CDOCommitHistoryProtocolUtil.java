package de.cooperateproject.modeling.cdo.commithistory.protocol;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.Range;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.internal.net4j.CDONet4jSessionImpl;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.channel.IChannel;
import org.eclipse.net4j.util.io.IOUtil;

public class CDOCommitHistoryProtocolUtil {

	@FunctionalInterface
	private interface ExceptionThrowingFunction<T, R> {
		 R apply(T value) throws Exception;
	}
	
	public static List<Long> getChangedTimestamps(CDOSession session, long from, long to,
            Iterable<CDOID> resourceIds, Iterable<CDOID> relevantCrossReferencedResourceIds) throws Exception {
		
		return executeProtocolAction(session, protocol -> {
			CDOCommitHistoryProtocolGetChangedTimestamps request = new CDOCommitHistoryProtocolGetChangedTimestamps(
                    protocol, session.getRepositoryInfo().getName());
            request.addRequestedResource(resourceIds);
            request.addCrossReferencedResourceToConsider(relevantCrossReferencedResourceIds);
            request.setRelevantTimeRange(Range.between(from, to));
            return  request.send();
		});
		
	}
	
	private static <T> T executeProtocolAction(CDOSession session, ExceptionThrowingFunction<CDOCommitHistoryProtocol, T> function) throws Exception {
		CDOCommitHistoryProtocol protocol = new CDOCommitHistoryProtocol();
		@SuppressWarnings("restriction")
		Optional<IChannel> channel = Optional.of(session).filter(CDONet4jSessionImpl.class::isInstance)
                .map(CDONet4jSessionImpl.class::cast).map(CDONet4jSessionImpl::getConnector).map(protocol::open);
		try {
			return function.apply(protocol);
		} finally {
			channel.ifPresent(IOUtil::closeSilent);
		}
	}
	
}
