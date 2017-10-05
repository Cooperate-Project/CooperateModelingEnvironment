package de.cooperateproject.cdo.util.resources.impl;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.io.output.WriterOutputStream;
import org.eclipse.emf.cdo.common.lob.CDOClob;
import org.eclipse.emf.cdo.eresource.CDOTextResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;

public class TextbasedCDOResource extends VirtualCDOFileResource {

    public static final String ADDITIONAL_FILE_EXTENSION = "txt";

    TextbasedCDOResource(URI uri) {
        super(uri);
    }

    @Override
    protected String getAdditionalFileExtension() {
        return ADDITIONAL_FILE_EXTENSION;
    }

    @Override
    protected void doSave(XMISerializer serializer, CDOTransaction trans, String realCdoRepositoryPath)
            throws IOException {
        CDOTextResource textRes = trans.getOrCreateTextResource(realCdoRepositoryPath);
        textRes.setEncoding(DEFAULT_CHARSET_NAME);
        StringWriter writer = new StringWriter();
        try (WriterOutputStream wos = new WriterOutputStream(writer, DEFAULT_CHARSET)) {
            serializer.serialize(wos);
            try (StringReader reader = new StringReader(writer.getBuffer().toString())) {
                CDOClob clob = new CDOClob(reader);
                textRes.setContents(clob);
            }
        }
    }

    @Override
    protected void doLoad(XMISerializer serializer, CDOView view, String realCdoRepositoryPath) throws IOException {
        if (view.hasResource(realCdoRepositoryPath)) {
            CDOTextResource textRes = view.getTextResource(realCdoRepositoryPath);
            String encoding = textRes.getEncoding();
            try (ReaderInputStream ris = new ReaderInputStream(textRes.getContents().getContents(),
                    Charset.forName(encoding))) {
                serializer.parse(ris);
            }
        }
    }

}
