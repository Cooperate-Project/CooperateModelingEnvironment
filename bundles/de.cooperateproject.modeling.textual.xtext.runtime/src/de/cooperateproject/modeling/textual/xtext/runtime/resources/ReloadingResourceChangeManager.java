package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import java.util.Collections;

import org.apache.commons.lang3.Validate;
import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ReloadingResourceChangeManager extends RecursiveResourceChangeManager {
	
	private static final Logger LOGGER = Logger.getLogger(ReloadingResourceChangeManager.class);
	
	public ReloadingResourceChangeManager(PreparedResourceListener...listeners) {
		super(listeners);
	}

	@Override
	protected void handleChangedResource(Resource r) {
		Validate.notNull(r);
		
		try {
			addEventFilterFor(r);
			reloadResource(r);
		} catch (Exception e) {
			LOGGER.error("Could not reload resource " + r.getURI() + ".", e);
		} finally {
			removeEventFilterFor(r);			
		}
	}
	
	private void reloadResource(Resource r) throws Exception {
		if (r instanceof CDOResource) {
			CDOResource realResource = (CDOResource)r;
			CDOSession session = realResource.cdoView().getSession();
			if (session == null) {
				throw new IllegalStateException("Could not refresh resource because session is not available.");
			}
			session.refresh();
		} else {
			r.unload();
			ResourceSet rs = r.getResourceSet();
			if (rs != null && rs.getURIConverter().exists(r.getURI(), Collections.emptyMap())) {
				r.load(Collections.emptyMap());				
			}
		}
	}

}
