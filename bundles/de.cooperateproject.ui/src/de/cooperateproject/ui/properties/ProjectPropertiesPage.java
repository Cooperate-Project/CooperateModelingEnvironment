package de.cooperateproject.ui.properties;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

import de.cooperateproject.ui.util.PropertiesPageValidationProcessor;

public class ProjectPropertiesPage extends PropertyPage implements IWorkbenchPropertyPage {

    private PropertiesPageValidationProcessor validationProcessor;
    private ProjectPropertiesStore preferenceStore;
    private ProjectPropertiesComposite composite;

    private static final Logger LOGGER = Logger.getLogger(ProjectPropertiesPage.class);

    private IProject getProject() {
        return (IProject) getElement().getAdapter(IResource.class);
    }

    @Override
    protected Control createContents(Composite parent) {
        preferenceStore = new ProjectPropertiesStore(getProject());
        preferenceStore.initFromStore();
        validationProcessor = new PropertiesPageValidationProcessor(this, preferenceStore.getPreferences());
        composite = new ProjectPropertiesComposite(parent, SWT.FILL, preferenceStore.getPreferences(),
                validationProcessor);
        return composite;
    }

    @Override
    protected void performDefaults() {
        preferenceStore.initFromDefaults();
        composite.updateTargets();
        super.performDefaults();
    }

    @Override
    public boolean performOk() {
        try {
            preferenceStore.saveToStore();
            return super.performOk();
        } catch (IOException e) {
            LOGGER.error("Error during ok perform!", e);
            return false;
        }
    }

    @Override
    public void dispose() {
        validationProcessor.stop();
        super.dispose();
    }

}
