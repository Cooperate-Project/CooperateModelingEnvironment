package de.cooperateproject.ui.wizards.model.export;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.net4j.util.io.IOUtil;
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

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;

public class ModelExportPageComposite extends Composite {
    private DataBindingContext m_bindingContext;
    private final WritableValue<IProject> project;
    private final WritableValue<String> modelName;
    private final WritableValue<Long> version;
    private final WritableValue<File> destinationFile;
    private final WritableValue<IStatus> validationError;

    private Text textDestination;
    private Text textModel;
    private Text textProject;
    private ComboViewer comboViewer;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     * @param validationErrors
     */
    public ModelExportPageComposite(Composite parent, int style, WritableValue<IProject> project,
            WritableValue<String> modelName, WritableValue<Long> version, WritableValue<File> destinationFile,
            WritableValue<IStatus> validationError) {
        super(parent, style);
        this.project = project;
        this.modelName = modelName;
        this.version = version;
        this.destinationFile = destinationFile;
        this.validationError = validationError;
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

        comboViewer = new ComboViewer(this, SWT.DROP_DOWN | SWT.READ_ONLY);
        Combo comboVersions = comboViewer.getCombo();
        comboVersions.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        new Label(this, SWT.NONE);
        comboViewer.setContentProvider(ArrayContentProvider.getInstance());
        comboViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof CDOCommitInfo) {
                    String timeString = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                            .format(new Date(((CDOCommitInfo) element).getTimeStamp()));
                    String messageString = ((CDOCommitInfo) element).getComment();
                    return String.format("%s - %s", timeString, messageString);
                }
                return super.getText(element);
            }
        });

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
            Optional<IProject> firstResult = Arrays.asList(dialog.getResult()).stream().filter(IPath.class::isInstance)
                    .map(IPath.class::cast).map(path -> ResourcesPlugin.getWorkspace().getRoot().findMember(path))
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

        @SuppressWarnings("unchecked")
        IObservableValue<String> observedProjectName = WidgetProperties.text(SWT.Modify).observeDelayed(100,
                textProject);
        IObservableValue<IProject> atomicValidatedProject = new WritableValue<>(null, IProject.class);
        UpdateValueStrategy strategyAtomicProjectNameTargetToModel = new UpdateValueStrategy();
        strategyAtomicProjectNameTargetToModel.setConverter(new NameToIProjectConverter());
        bindingContext.bindValue(observedProjectName, atomicValidatedProject, strategyAtomicProjectNameTargetToModel,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
        bindingContext.bindValue(atomicValidatedProject, project);

        @SuppressWarnings("unchecked")
        IObservableValue<String> observedModelName = WidgetProperties.text(SWT.Modify).observeDelayed(100, textModel);
        IObservableValue<String> atomicValidatedModelName = new WritableValue<>(null, String.class);
        UpdateValueStrategy strategyAtomicDiagramNameTargetToModel = new UpdateValueStrategy();
        bindingContext.bindValue(observedModelName, atomicValidatedModelName, strategyAtomicDiagramNameTargetToModel,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
        bindingContext.bindValue(atomicValidatedModelName, modelName);

        atomicValidatedProject.addValueChangeListener(
                new VersionInfluencingValueChangeListener<IProject>(atomicValidatedProject, atomicValidatedModelName));
        atomicValidatedModelName.addValueChangeListener(
                new VersionInfluencingValueChangeListener<String>(atomicValidatedProject, atomicValidatedModelName));
        @SuppressWarnings("unchecked")
        IObservableValue<CDOCommitInfo> selectedVersion = ViewerProperties.singleSelection().observe(comboViewer);

        UpdateValueStrategy strategySelectedVersionTargetToModel = new UpdateValueStrategy();
        strategySelectedVersionTargetToModel.setConverter(new CDOCommitInfoToTimestampConverter());
        bindingContext.bindValue(selectedVersion, version, strategySelectedVersionTargetToModel,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));

        @SuppressWarnings("unchecked")
        IObservableValue<String> observedDestination = WidgetProperties.text(SWT.Modify).observeDelayed(100,
                textDestination);
        IObservableValue<File> atomicValidatedDestination = new WritableValue<>(null, File.class);
        UpdateValueStrategy strategyAtomicDestinationTargetToModel = new UpdateValueStrategy();
        strategyAtomicDestinationTargetToModel.setConverter(new PathToFileConverter());
        bindingContext.bindValue(observedDestination, atomicValidatedDestination,
                strategyAtomicDestinationTargetToModel, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
        bindingContext.bindValue(atomicValidatedDestination, destinationFile);

        ProjectExportValidator validator = new ProjectExportValidator(project, modelName, selectedVersion,
                destinationFile);
        @SuppressWarnings("unchecked")
        IObservableValue<IStatus> validationStatus = ((IObservableValue<IStatus>) validator.getValidationStatus());
        validationStatus.addValueChangeListener(e -> {
            validationError.setValue(e.diff.getNewValue());
        });

        return bindingContext;
    }

    private void updateVersions(IProject project, String modelName) {
        try {
            Collection<CDOCommitInfo> timestamps = getRelevantTimeStamps(project, modelName);
            comboViewer.setInput(timestamps);
        } catch (Exception ex) {
            comboViewer.setInput(null);
        }
    }

    private class VersionInfluencingValueChangeListener<T> implements IValueChangeListener<T> {

        private final IObservableValue<IProject> validatedProjectName;
        private final IObservableValue<String> validatedModelName;

        public VersionInfluencingValueChangeListener(IObservableValue<IProject> validatedProjectName,
                IObservableValue<String> validatedModelName) {
            super();
            this.validatedProjectName = validatedProjectName;
            this.validatedModelName = validatedModelName;
        }

        @Override
        public void handleValueChange(ValueChangeEvent<? extends T> event) {
            updateVersions(validatedProjectName.getValue(), validatedModelName.getValue());
        }

    }

    private static Collection<CDOCommitInfo> getRelevantTimeStamps(IProject project, String modelName)
            throws IOException {
        CDOSession cdoSession = CDOConnectionManager.getInstance().acquireSession(project);
        try {
            CDOView cdoView = cdoSession.openView();
            try {
                CDOResource resource = cdoView.getResource(String.format("%s/%s", project.getName(), modelName));
                Collection<CDOCommitInfo> commitInfos = Activator.getDefault().getCommitHistoryManager()
                        .getCommitsForUMLModel(resource.getURI());
                return commitInfos.stream().sorted((c1, c2) -> -1 * Long.compare(c1.getTimeStamp(), c2.getTimeStamp()))
                        .collect(Collectors.toList());
            } finally {
                IOUtil.closeSilent(cdoView);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(cdoSession);
        }
    }
}
