package de.cooperateproject.cdo.util.resources.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
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
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        CDOTransaction trans = Arrays.stream(cdoVS.getViews()).filter(CDOTransaction.class::isInstance)
                .map(CDOTransaction.class::cast).findFirst().orElse(null);
        if (trans == null) {
            throw new IOException("Could not gather a transaction to perform the save operation.");
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
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        CDOView view = Arrays.stream(cdoVS.getViews()).filter(CDOView.class::isInstance).findFirst().orElse(null);
        if (view == null) {
            throw new IOException("Could not gather a view to perform the load operation.");
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
        URI pathUri = getURI().deresolve(view.getRootResource().getURI());
        String actualURI = pathUri.toString();
        if (!getAdditionalFileExtension().equals(pathUri.fileExtension())) {
            return String.format("%s.%s", actualURI, getAdditionalFileExtension());
        }
        return actualURI;
    }

    private Map<?, ?> prepareOptions(Map<?, ?> options) {
        HashMap<Object, Object> tmpOptions = Maps.newHashMap(options);
        tmpOptions.put(XMIResource.OPTION_ENCODING, DEFAULT_CHARSET_NAME);
        tmpOptions.putAll(getNewOptions());
        return tmpOptions;
    }

}
