package de.cooperateproject.ui.wizards.modelimport;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import de.cooperateproject.ui.nature.CooperateProjectNature;
import de.cooperateproject.ui.wizards.model.export.NameToIProjectConverter;

public class ModelImportPageComposite extends Composite {

    private DataBindingContext m_bindingContext;
    private final WritableValue<IProject> project;
    private final WritableValue<String> directory;
    private final WritableValue<IStatus> validationError;

    private Text textDirectory;
    private Text textProject;

    public ModelImportPageComposite(Composite parent, int style, WritableValue<IProject> project,
            WritableValue<String> directoryName, WritableValue<IStatus> validationError) {
        super(parent, style);
        this.project = project;
        this.directory = directoryName;
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

        Label lblDirectory = new Label(this, SWT.NONE);
        lblDirectory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblDirectory.setText("Directory");

        textDirectory = new Text(this, SWT.BORDER);
        textDirectory.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

        Button btnDirectoryBrowse = new Button(this, SWT.NONE);
        btnDirectoryBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleDirectoryBrowse();
            }
        });
        btnDirectoryBrowse.setText("Browse");

        m_bindingContext = initDataBindings();
        setPreselectedProperties(textProject);
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

    private void handleDirectoryBrowse() {
        DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
        dialog.setMessage("Please select a directory to import from.");
        Optional<File> directory = Optional.ofNullable(dialog.open()).map(File::new).filter(File::exists)
                .filter(File::isDirectory);
        if (!directory.isPresent()) {
            return;
        }
        textDirectory.setText(directory.get().getAbsolutePath());
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
        IObservableValue<String> observedDirectoryName = WidgetProperties.text(SWT.Modify).observeDelayed(100,
                textDirectory);
        IObservableValue<String> atomicValidatedDirectoryName = new WritableValue<>(null, String.class);
        UpdateValueStrategy strategyAtomicDirectoryNameTargetToModel = new UpdateValueStrategy();
        bindingContext.bindValue(observedDirectoryName, atomicValidatedDirectoryName,
                strategyAtomicDirectoryNameTargetToModel, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
        bindingContext.bindValue(atomicValidatedDirectoryName, directory);

        ProjectImportValidator validator = new ProjectImportValidator(project, directory);
        @SuppressWarnings("unchecked")
        IObservableValue<IStatus> validationStatus = ((IObservableValue<IStatus>) validator.getValidationStatus());
        validationStatus.addValueChangeListener(e -> {
            validationError.setValue(e.diff.getNewValue());
        });

        return bindingContext;
    }

    private static void setPreselectedProperties(Text textProject) {
        IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        String cooperateNature = CooperateProjectNature.NATURE_ID;
        try {
            if (selection.size() == 1) {
                Object element = selection.getFirstElement();
                if (element instanceof IProject && ((IProject) element).hasNature(cooperateNature)) {
                    textProject.setText(((IProject) selection.getFirstElement()).getName());
                } else if (element instanceof IFolder && ((IFolder) element).getProject().hasNature(cooperateNature)) {
                    textProject.setText(((IFolder) element).getProject().getName());
                }
            }
        } catch (CoreException e) {
        }
    }

    public void triggerValidation() {
        String empty = "";
        String oldProject = textProject.getText();
        textProject.setText(empty);
        textProject.setText(oldProject);
    }
}
