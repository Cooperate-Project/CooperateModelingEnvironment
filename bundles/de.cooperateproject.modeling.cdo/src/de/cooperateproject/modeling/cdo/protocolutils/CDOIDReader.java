package de.cooperateproject.modeling.cdo.protocolutils;

import java.io.IOException;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.spi.common.protocol.CDODataInputImpl;
import org.eclipse.emf.cdo.spi.common.protocol.CDODataInputImpl.Default;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;

public interface CDOIDReader {

	default CDOID readCDOID(ExtendedDataInputStream in) throws IOException {
		Default cdoIn = new CDODataInputImpl.Default(in);
		return CDOIDUtil.read(cdoIn);
	}
	
}
