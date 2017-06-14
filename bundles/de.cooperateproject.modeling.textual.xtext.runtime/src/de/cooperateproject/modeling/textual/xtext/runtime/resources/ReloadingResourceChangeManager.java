package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import java.io.IOException;
import java.util.Collections;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReloadingResourceChangeManager extends RecursiveResourceChangeManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReloadingResourceChangeManager.class);

    public ReloadingResourceChangeManager(PreparedResourceListener... listeners) {
        super(listeners);
    }

    @Override
    protected void handleChangedResource(Resource r) {
        Validate.notNull(r);

        try {
            addEventFilterFor(r);
            reloadResource(r);
        } catch (IOException e) {
            LOGGER.error("Could not reload resource {}.", r.getURI(), e);
        } finally {
            removeEventFilterFor(r);
        }
    }

    private static void reloadResource(Resource r) throws IOException {
        if (r instanceof CDOResource) {
            CDOResource realResource = (CDOResource) r;
            CDOSession session = realResource.cdoView().getSession();
            if (session == null) {
                throw new IOException("Could not refresh resource because session is not available.");
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
