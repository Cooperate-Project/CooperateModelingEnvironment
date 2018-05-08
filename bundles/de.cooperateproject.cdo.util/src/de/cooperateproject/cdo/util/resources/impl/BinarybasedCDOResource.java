package de.cooperateproject.cdo.util.resources.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.cdo.eresource.CDOBinaryResource;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.google.common.collect.Maps;

public class BinarybasedCDOResource extends VirtualCDOFileResource {

    private static final String ADDITIONAL_FILE_EXTENSION = "bin";

    BinarybasedCDOResource(URI uri) {
        super(uri);
    }

    @Override
    protected String getAdditionalFileExtension() {
        return ADDITIONAL_FILE_EXTENSION;
    }

    @Override
    protected void doSave(XMISerializer serializer, CDOTransaction trans, String realCdoRepositoryPath)
            throws IOException {
        CDOBinaryResource binRes = trans.getOrCreateBinaryResource(realCdoRepositoryPath);
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            serializer.serialize(baos);
            CDOBlob blob = new CDOBlob(new ByteArrayInputStream(baos.toByteArray()));
            binRes.setContents(blob);
        }
    }

    @Override
    protected void doLoad(XMISerializer serializer, CDOView view, String realCdoRepositoryPath) throws IOException {
        if (view.hasResource(realCdoRepositoryPath)) {
            CDOBinaryResource binRes = view.getBinaryResource(realCdoRepositoryPath);
            serializer.parse(binRes.getContents().getContents());
        }
    }

    @Override
    protected Map<?, ?> getNewOptions() {
        Map<Object, Object> opt = Maps.newHashMap();
        opt.put(XMIResource.OPTION_BINARY, Boolean.TRUE);
        return opt;
    }

    @Override
    protected CDOResourceNode getCDOResourceNode(URI uri) throws IOException {
        // TODO FIXME
        return null;
    }

    @Override
    protected CDOResourceNode getCDOResourceNode(URI uri, CDOTransaction trans) throws IOException {
        // TODO FIXME
        return null;
    }
}
