package de.cooperateproject.cdo.util.resources.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.cdo.eresource.CDOBinaryResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class BinarybasedCDOResource extends XMIResourceImpl {

    BinarybasedCDOResource(URI uri) {
        super(uri);
    }

    public void save(Map<?, ?> options) throws IOException {
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        CDOTransaction trans = (CDOTransaction) cdoVS.getViews()[0];
        String actualURI = getURI().deresolve(trans.getRootResource().getURI()).toString();
        CDOBinaryResource binRes = trans.getOrCreateBinaryResource(actualURI + ".bin");
        
        //TODO Put this Option in options instead of creating an extra map
        Map<Object, Object> opt = new HashMap<Object, Object>();
        opt.put(XMIResource.OPTION_BINARY, Boolean.TRUE);
        
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            save(baos, opt);
            CDOBlob blob = new CDOBlob(new ByteArrayInputStream(baos.toByteArray()));
            binRes.setContents(blob);
            try {
                trans.commit();
            } catch (ConcurrentAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (CommitException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void load(Map<?, ?> options) throws IOException {
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        CDOView view = cdoVS.getViews()[0];
        String actualURI = getURI().deresolve(view.getRootResource().getURI()).toString();
        
        //TODO Put this Option in options instead of creating an extra map
        Map<Object, Object> opt = new HashMap<Object, Object>();
        opt.put(XMIResource.OPTION_BINARY, Boolean.TRUE);
        
        if (view.hasResource(actualURI + ".bin")) {
            CDOBinaryResource binRes = view.getBinaryResource(actualURI + ".bin");
            load(binRes.getContents().getContents(), opt);
        }
    }
}
