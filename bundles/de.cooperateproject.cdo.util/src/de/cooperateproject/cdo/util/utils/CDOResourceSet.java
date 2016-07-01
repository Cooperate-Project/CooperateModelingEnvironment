package de.cooperateproject.cdo.util.utils;

import java.util.Map;

import org.eclipse.emf.cdo.common.util.CDOException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;

public class CDOResourceSet implements ResourceSet {

	private final CDOView view;
	private final ResourceSet rs;
	
	public CDOResourceSet(CDOView view) {
		this.rs = view.getResourceSet();
		this.view = view;
	}

	public EList<Adapter> eAdapters() {
		return rs.eAdapters();
	}

	public boolean eDeliver() {
		return rs.eDeliver();
	}

	public void eSetDeliver(boolean deliver) {
		rs.eSetDeliver(deliver);
	}

	public void eNotify(Notification notification) {
		rs.eNotify(notification);
	}

	public EList<Resource> getResources() {
		return rs.getResources();
	}

	public TreeIterator<Notifier> getAllContents() {
		return rs.getAllContents();
	}

	public EList<AdapterFactory> getAdapterFactories() {
		return rs.getAdapterFactories();
	}

	public Map<Object, Object> getLoadOptions() {
		return rs.getLoadOptions();
	}

	public EObject getEObject(URI uri, boolean loadOnDemand) {
		initUri(uri);
		return rs.getEObject(uri, loadOnDemand);
	}

	public Resource getResource(URI uri, boolean loadOnDemand) {
		initUri(uri);
		return rs.getResource(uri, loadOnDemand);
	}

	public Resource createResource(URI uri) {
		initUri(uri);
		return rs.createResource(uri);
	}

	public Resource createResource(URI uri, String contentType) {
		initUri(uri);
		return rs.createResource(uri, contentType);
	}

	public Registry getResourceFactoryRegistry() {
		return rs.getResourceFactoryRegistry();
	}

	public void setResourceFactoryRegistry(Registry resourceFactoryRegistry) {
		rs.setResourceFactoryRegistry(resourceFactoryRegistry);
	}

	public URIConverter getURIConverter() {
		return rs.getURIConverter();
	}

	public void setURIConverter(URIConverter converter) {
		rs.setURIConverter(converter);
	}

	public org.eclipse.emf.ecore.EPackage.Registry getPackageRegistry() {
		return rs.getPackageRegistry();
	}

	public void setPackageRegistry(org.eclipse.emf.ecore.EPackage.Registry packageRegistry) {
		rs.setPackageRegistry(packageRegistry);
	}
	
	private void initUri(URI uri) {
		URI baseUri = view.getRootResource().getURI();
		String resourcePath = uri.trimFragment().trimQuery().toString().replace(baseUri.toString(), "");
		try {
			view.getResourceNode(resourcePath);			
		} catch (CDOException e) {
			// seems not to exist, that is perfectly fine for us
			return;
		}
	}
	
}
