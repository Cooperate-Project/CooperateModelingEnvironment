package de.cooperateproject.modeling.cdo.protocolutils;

import java.io.IOException;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.spi.common.protocol.CDODataOutputImpl;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

public interface CDOIDWriter {

	default void writeCDOID(ExtendedDataOutputStream out, CDOID cdoid) throws IOException {
        CDODataOutputImpl cdoOut = new CDODataOutputImpl(out);
        CDOIDUtil.write(cdoOut, cdoid);
	}
	
}
