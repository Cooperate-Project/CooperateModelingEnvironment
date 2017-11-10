package de.cooperateproject.ui.wizards.model.export;

import org.eclipse.jface.wizard.Wizard;

public class ModelExportWizard extends Wizard {

    @Override
    public void addPages() {
        super.addPages();
        addPage(new ModelExportPage());
    }

    @Override
    public boolean performFinish() {
        // TODO Auto-generated method stub
        return false;
    }

}
