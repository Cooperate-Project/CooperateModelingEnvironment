package de.cooperateproject.ui.wizards.model.export;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ModelExportPage extends WizardPage {

    protected ModelExportPage() {
        super("Model Export");
    }

    @Override
    public void createControl(Composite parent) {
        new ModelExportPageComposite(parent, SWT.FILL, null, null, null);
    }

}
