package de.cooperateproject.cdo.util.utils;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

public final class CDOHelper {

    private CDOHelper() {
        // intentionally left blank
    }

    /**
     * Opens a CDOSession with the given connection information.
     * 
     * @param cdoHost
     *            URL of the CDO repository.
     * @param cdoPort
     *            Port of the CDO repository.
     * @param cdoRepo
     *            Name of the CDO repository.
     * @return CdoSession for given connection info.
     */
    public static CDOSession createCDOSession(String cdoHost, Integer cdoPort, String cdoRepo) {
        String cdoServerURI = "tcp://" + cdoHost + ":" + cdoPort;
        IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, cdoServerURI);
        CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
        sessionConfiguration.setConnector(connector);
        sessionConfiguration.setRepositoryName(cdoRepo);
        return sessionConfiguration.openNet4jSession();
    }

}
