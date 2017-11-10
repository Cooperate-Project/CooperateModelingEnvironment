package de.cooperateproject.ui.wizards.model.export;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

public class ModelExportPageComposite extends Composite {
    private DataBindingContext m_bindingContext;
    private final WritableValue<IProject> project;
    private final WritableValue<URI> modelURI;
    private final WritableValue<File> destinationFile;

    private Text textDestination;
    private Text textModel;
    private Text textProject;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public ModelExportPageComposite(Composite parent, int style, WritableValue<IProject> project,
            WritableValue<URI> modelURI, WritableValue<File> destinationFile) {
        super(parent, style);
        this.project = project;
        this.modelURI = modelURI;
        this.destinationFile = destinationFile;
        setLayout(new GridLayout(3, false));

        Label lblNewLabel = new Label(this, SWT.NONE);
        lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblNewLabel.setText("Project");

        textProject = new Text(this, SWT.BORDER);
        textProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Button btnProjectBrowse = new Button(this, SWT.NONE);
        btnProjectBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleProjectBrowse();
            }
        });
        btnProjectBrowse.setText("Browse");

        Label lblModel = new Label(this, SWT.NONE);
        lblModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblModel.setText("Model");

        textModel = new Text(this, SWT.BORDER);
        textModel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

        Button btnModelBrowse = new Button(this, SWT.NONE);
        btnModelBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleModelBrowse();
            }
        });
        btnModelBrowse.setText("Browse");

        Label lblVersion = new Label(this, SWT.NONE);
        lblVersion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblVersion.setText("Version");

        Combo comboVersion = new Combo(this, SWT.NONE);
        comboVersion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        new Label(this, SWT.NONE);

        Label lblDestination = new Label(this, SWT.NONE);
        lblDestination.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblDestination.setText("Destination");

        textDestination = new Text(this, SWT.BORDER);
        textDestination.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Button btnDestinationBrowse = new Button(this, SWT.NONE);
        btnDestinationBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleDestinationBrowse();
            }
        });
        btnDestinationBrowse.setText("Browse");

        m_bindingContext = initDataBindings();
    }

    private void handleProjectBrowse() {
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(),
                ResourcesPlugin.getWorkspace().getRoot(), false, "Please select a project.");
        if (dialog.open() == Window.OK) {
            Optional<IProject> firstResult = Arrays.asList(dialog.getResult()).stream()
                    .filter(IProject.class::isInstance).map(IProject.class::cast).findFirst();
            firstResult.ifPresent(p -> textProject.setText(p.getName()));
        }
    }

    private void handleModelBrowse() {
        if (project.getValue() == null) {
            MessageDialog.openError(getShell(), "Failed to browse models",
                    "You have to specify a project before you can choose a model.");
            return;
        }
        try {
            SelectionStatusDialog dialog = new LocalModelSelectionDialog(getShell(), project.getValue());
            if (dialog.open() == Window.OK) {
                Object result = dialog.getFirstResult();
                Optional.ofNullable(result).filter(String.class::isInstance).map(String.class::cast)
                        .ifPresent(textModel::setText);
            }
        } catch (CoreException e) {
            ErrorDialog.openError(getShell(), "Initialization error",
                    "The browse dialog could not be opened because of an internal error.", e.getStatus());
        }
    }

    private void handleDestinationBrowse() {
        DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
        Optional<File> destinationDir = Optional.ofNullable(dialog.open()).map(File::new).filter(File::exists);
        if (!destinationDir.isPresent()) {
            return;
        }
        textDestination.setText(destinationDir.get().getAbsolutePath());
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();

        IObservableValue<?> observedDiagramName = WidgetProperties.text(SWT.Modify).observe(textModel);

        //
        return bindingContext;
    }
}
