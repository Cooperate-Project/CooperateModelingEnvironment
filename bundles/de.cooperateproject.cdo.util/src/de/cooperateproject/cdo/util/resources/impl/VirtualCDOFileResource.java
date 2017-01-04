package de.cooperateproject.cdo.util.resources.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.google.common.collect.Maps;

import de.cooperateproject.util.filtering.Filters;
import de.cooperateproject.util.filtering.Filters.FilterException;

public abstract class VirtualCDOFileResource extends XMIResourceImpl {

	protected static class XMISerializer {

		private final XMIResource resource;
		private final Map<?, ?> options;

		public XMISerializer(XMIResource resource, Map<?, ?> options) {
			this.resource = resource;
			this.options = options;
		}

		public void parse(InputStream is) throws IOException {
			resource.load(is, options);
		}

		public void serialize(OutputStream os) throws IOException {
			resource.save(os, options);
		}
	}

	protected static final String DEFAULT_CHARSET_NAME = "UTF-8";
	protected static final Charset DEFAULT_CHARSET = Charset.forName(DEFAULT_CHARSET_NAME);

	protected VirtualCDOFileResource(URI uri) {
		super(uri);
	}

	public void save(Map<?, ?> options) throws IOException {
		CDOTransaction trans = null;
		try {
			CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
			trans = Filters.getElementOfType(cdoVS.getViews(), CDOTransaction.class);
		} catch (FilterException e) {
			throw new IOException("Could not gather a transaction to perform the save operation.", e);
		}
		String realCdoRepositoryPath = getRealCDORepositoryPath(trans);
		XMISerializer accessor = new XMISerializer(this, prepareOptions(options));
		doSave(accessor, trans, realCdoRepositoryPath);
		try {
			trans.commit();
		} catch (CommitException e) {
			throw new IOException(e);
		}
	}

	public void load(Map<?, ?> options) throws IOException {
		CDOView view = null;
		try {
			CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
			view = Filters.getAnyElementOfType(cdoVS.getViews(), CDOView.class);
		} catch (FilterException e) {
			throw new IOException("Could not gather a view to perform the load operation.", e);
		}
		String realCdoRepositoryPath = getRealCDORepositoryPath(view);
		XMISerializer accessor = new XMISerializer(this, prepareOptions(options));
		doLoad(accessor, view, realCdoRepositoryPath);
	}

	protected abstract String getAdditionalFileExtension();

	protected abstract void doSave(XMISerializer serializer, CDOTransaction trans, String realCdoRepositoryPath)
			throws IOException;

	protected abstract void doLoad(XMISerializer serializer, CDOView view, String realCdoRepositoryPath)
			throws IOException;

	protected Map<?, ?> getNewOptions() {
		return Collections.emptyMap();
	}

	private String getRealCDORepositoryPath(CDOView view) {
		String actualURI = getURI().deresolve(view.getRootResource().getURI()).toString();
		return String.format("%s.%s", actualURI, getAdditionalFileExtension());
	}

	private Map<?, ?> prepareOptions(Map<?, ?> options) {
		HashMap<Object, Object> tmpOptions = Maps.newHashMap(options);
		tmpOptions.put(XMIResource.OPTION_ENCODING, DEFAULT_CHARSET_NAME);
		tmpOptions.putAll(getNewOptions());
		return tmpOptions;
	}

}
