package de.cooperateproject.modeling.cdo.util;

import java.util.Optional;

import org.eclipse.emf.cdo.internal.net4j.CDONet4jSessionImpl;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.connector.IConnector;

@SuppressWarnings("restriction")
public interface ConnectorExtractorMixin {

	default Optional<IConnector> extractConnector(CDOView view) {
		return Optional.of(view).map(CDOView::getSession).filter(CDONet4jSessionImpl.class::isInstance)
        .map(CDONet4jSessionImpl.class::cast).map(CDONet4jSessionImpl::getConnector);
	}
	
}
