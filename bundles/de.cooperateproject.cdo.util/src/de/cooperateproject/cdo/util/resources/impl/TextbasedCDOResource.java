package de.cooperateproject.cdo.util.resources.impl;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.io.output.WriterOutputStream;
import org.eclipse.emf.cdo.common.lob.CDOClob;
import org.eclipse.emf.cdo.eresource.CDOTextResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class TextbasedCDOResource extends XMIResourceImpl {

    TextbasedCDOResource(URI uri) {
        super(uri);
    }

    public void save(Map<?, ?> options) throws IOException {
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        //TODO Is there a better way to do this?
        CDOTransaction trans = (CDOTransaction) cdoVS.getViews()[0];
        String actualURI = getURI().deresolve(trans.getRootResource().getURI()).toString();
        CDOTextResource textRes = trans.getOrCreateTextResource(actualURI + ".txt");
        textRes.setEncoding("UTF8");
        StringWriter writer = new StringWriter();
        
        try (WriterOutputStream wos = new WriterOutputStream(writer, StandardCharsets.UTF_8)) {
            save(wos, options);
            try (StringReader reader = new StringReader(writer.getBuffer().toString())) {
                CDOClob clob = new CDOClob(reader);
                textRes.setContents(clob);
            }
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
        
        if (view.hasResource(actualURI + ".txt")) {
            CDOTextResource textRes = view.getTextResource(actualURI + ".txt");
            textRes.setEncoding("UTF8");
            try (ReaderInputStream ris = new ReaderInputStream(textRes.getContents().getContents(),
                    StandardCharsets.UTF_8)) {
                load(ris, options);
            }
        }
    }
}
