package de.cooperateproject.ui.properties;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

public class ProjectPropertiesPage extends PropertyPage implements IWorkbenchPropertyPage {

	private ProjectPropertiesStore preferenceStore;

	private IProject getProject() {
		return (IProject) getElement().getAdapter(IResource.class);
	}
	
	@Override
	protected Control createContents(Composite parent) {
		preferenceStore = new ProjectPropertiesStore(getProject());
		preferenceStore.initFromStore();
		return new ProjectPropertiesComposite(parent, SWT.FILL, preferenceStore.getPreferences());
	}

	@Override
	protected void performDefaults() {
		preferenceStore.initFromDefaults();
		super.performDefaults();
	}

	@Override
	public boolean performOk() {
		try {
			preferenceStore.saveToStore();
			return super.performOk();
		} catch (IOException e) {
			//TODO log error
			return false;
		}
	}	
	
}
