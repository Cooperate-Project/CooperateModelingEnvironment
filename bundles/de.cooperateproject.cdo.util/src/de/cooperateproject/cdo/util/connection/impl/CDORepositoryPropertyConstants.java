package de.cooperateproject.cdo.util.connection.impl;

import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository.VersioningMode;
import org.eclipse.emf.cdo.internal.explorer.repositories.CDORepositoryImpl;
import org.eclipse.emf.cdo.internal.explorer.repositories.RemoteCDORepository;
import org.eclipse.net4j.tcp.TCPUtil;

/**
 * Constants describing the properties required for creating a {@link CDORepository}.
 */
@SuppressWarnings("restriction")
public final class CDORepositoryPropertyConstants {

    public static final String NAME = CDORepositoryImpl.PROP_NAME;
    public static final String LABEL = CDORepositoryImpl.PROP_LABEL;
    public static final String CONNECTOR_DESCRIPTION = RemoteCDORepository.PROP_CONNECTOR_DESCRIPTION;
    public static final String CONNECTOR_TYPE = RemoteCDORepository.PROP_CONNECTOR_TYPE;
    public static final String CONNECTOR_TYPE_TCP = TCPUtil.FACTORY_TYPE;

    public static final String VERSIONING_MODE = CDORepositoryImpl.PROP_VERSIONING_MODE;
    public static final String VERSIONING_MODE_BRANCHING = VersioningMode.Branching.name();

    public static final String TYPE = CDORepositoryImpl.PROP_TYPE;
    public static final String TYPE_REMOTE = CDORepositoryImpl.TYPE_REMOTE;

    private CDORepositoryPropertyConstants() {
        // intentionally left blank
    }

}
