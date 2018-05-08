package de.cooperateproject.ui.wizards.modelimport;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import de.cooperateproject.ui.wizards.model.export.NameToIProjectConverter;

public class ModelImportPageComposite extends Composite {

    private DataBindingContext m_bindingContext;
    private final WritableValue<IProject> project;
    private final WritableValue<String> modelName;
    private final WritableValue<IStatus> validationError;

    private Text textModel;
    private Text textProject;

    public ModelImportPageComposite(Composite parent, int style, WritableValue<IProject> project,
            WritableValue<String> modelName, WritableValue<IStatus> validationError) {
        super(parent, style);
        this.project = project;
        this.modelName = modelName;
        this.validationError = validationError;
        setLayout(new GridLayout(3, false));

        Label lblNewLabel = new Label(this, SWT.NONE);
        lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblNewLabel.setText("Project Name");

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
        FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
        String[] filterExtensions = { "*.uml" };
        dialog.setFilterExtensions(filterExtensions);
        Optional<File> modelFile = Optional.ofNullable(dialog.open()).map(File::new).filter(File::exists);
        if (!modelFile.isPresent()) {
            return;
        }
        textModel.setText(modelFile.get().getAbsolutePath());
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

        ProjectImportValidator validator = new ProjectImportValidator(project, modelName);
        @SuppressWarnings("unchecked")
        IObservableValue<IStatus> validationStatus = ((IObservableValue<IStatus>) validator.getValidationStatus());
        validationStatus.addValueChangeListener(e -> {
            validationError.setValue(e.diff.getNewValue());
        });

        return bindingContext;
    }
}
