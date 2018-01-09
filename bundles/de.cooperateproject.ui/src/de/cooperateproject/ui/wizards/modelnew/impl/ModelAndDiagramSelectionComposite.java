package de.cooperateproject.ui.wizards.modelnew.impl;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.ACC;
import org.eclipse.swt.accessibility.Accessible;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.wizards.modelnew.impl.AtomicProjectNameProcessor.ProjectName;
import de.cooperateproject.ui.wizards.modelnew.impl.ModelContentProvider.ModelNode;
import de.cooperateproject.ui.wizards.modelnew.impl.ModelContentProvider.ProjectNode;

/**
 * Reusable composite that allows defining a model and diagram name based on a selection of available projects.
 */
public class ModelAndDiagramSelectionComposite extends Composite {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelAndDiagramSelectionComposite.class);

    private final Text textProject;
    private final Text textModelName;
    private final Text textDiagramName;

    private final SelectedNamesDTO dto;
    private final IChangeListener validatorStatusListener;
    private AggregateValidationStatus aggregatedStatus;

    /**
     * Create the composite.
     * 
     * @param parent
     *            The parent composite.
     * @param style
     *            A style to be used in the parent.
     * @param dto
     *            A transfer object that gives access to the names selected in the composite.
     * @param validatorStatusListener
     *            A listener that will be notified if the state of the overall validation has changed.
     */
    public ModelAndDiagramSelectionComposite(Composite parent, int style, SelectedNamesDTO dto,
            IChangeListener validatorStatusListener) {
        super(parent, style);
        this.dto = dto;
        this.validatorStatusListener = validatorStatusListener;
        setLayout(new GridLayout(3, false));

        Label lblProject = new Label(this, SWT.NONE);
        lblProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        lblProject.setText("Project:");

        textProject = new Text(this, SWT.BORDER);
        textProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblProject = lblProject.getAccessible();
        Accessible accTextProject = textProject.getAccessible();
        accLblProject.addRelation(ACC.RELATION_LABEL_FOR, accTextProject);
        accTextProject.addRelation(ACC.RELATION_LABELLED_BY, accLblProject);

        SelectionAdapter selectionAdapter = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new ModelLabelProvider(),
                        new ModelContentProvider());
                dialog.setInput(dto);
                dialog.setTitle("Project Selection");
                dialog.setMessage("Choose a project:");
                dialog.setHelpAvailable(false);
                if (dialog.open() == Window.OK) {
                    Object element = dialog.getFirstResult();
                    if (element instanceof ProjectNode) {
                        textProject.setText(((ProjectNode) element).getName());
                    } else if (element instanceof ModelNode) {
                        textProject.setText(((ModelNode) element).getParent().get().getName());
                        textModelName.setText(((ModelNode) element).getName());
                    }
                }
            }
        };

        Button btnBrowseProjects = new Button(this, SWT.PUSH);
        btnBrowseProjects.setText("Browse...");
        btnBrowseProjects.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        btnBrowseProjects.addSelectionListener(selectionAdapter);

        Label lblModelName = new Label(this, SWT.NONE);
        lblModelName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        lblModelName.setText("Model Name:");

        textModelName = new Text(this, SWT.BORDER);
        textModelName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblModelName = lblModelName.getAccessible();
        Accessible accTextModelName = textModelName.getAccessible();
        accLblModelName.addRelation(ACC.RELATION_LABEL_FOR, accTextModelName);
        accTextModelName.addRelation(ACC.RELATION_LABELLED_BY, accLblModelName);

        Button btnBrowseModels = new Button(this, SWT.PUSH);
        btnBrowseModels.setText("Browse...");
        btnBrowseModels.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        btnBrowseModels.addSelectionListener(selectionAdapter);

        Label lblDiagramName = new Label(this, SWT.NONE);
        lblDiagramName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblDiagramName.setText("Diagram Name:");

        textDiagramName = new Text(this, SWT.BORDER);
        textDiagramName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        Accessible accLblDiagramName = lblDiagramName.getAccessible();
        Accessible accTextDiagramName = textDiagramName.getAccessible();
        accLblDiagramName.addRelation(ACC.RELATION_LABEL_FOR, accTextDiagramName);
        accTextDiagramName.addRelation(ACC.RELATION_LABELLED_BY, accLblDiagramName);

        setProject(textProject, textModelName);
        initCustomDataBindings();
        initCustomListeners();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    private void initCustomDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();

        IObservableValue<?> observedDiagramName = WidgetProperties.text(SWT.Modify).observe(textDiagramName);
        IObservableValue<?> observedModelName = WidgetProperties.text(SWT.Modify).observe(textModelName);
        IObservableValue<?> observedProjectName = WidgetProperties.text(SWT.Modify).observe(textProject);

        IObservableValue<String> atomicValidatedDiagramName = new WritableValue<>(null, String.class);
        IObservableValue<String> atomicValidatedModelName = new WritableValue<>(null, String.class);
        IObservableValue<ProjectName> atomicValidatedProjectName = new WritableValue<>(null, ProjectName.class);

        UpdateValueStrategy strategyAtomicModelNameTargetToModel = new UpdateValueStrategy();
        strategyAtomicModelNameTargetToModel.setAfterGetValidator(new AtomicModelNameProcessor());
        bindingContext.bindValue(observedModelName, atomicValidatedModelName, strategyAtomicModelNameTargetToModel,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));

        UpdateValueStrategy strategyAtomicDiagramNameTargetToModel = new UpdateValueStrategy();
        strategyAtomicDiagramNameTargetToModel.setAfterGetValidator(new AtomicDiagramNameProcessor());
        bindingContext.bindValue(observedDiagramName, atomicValidatedDiagramName,
                strategyAtomicDiagramNameTargetToModel, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));

        UpdateValueStrategy strategyAtomicProjectNameTargetToModel = new UpdateValueStrategy();
        strategyAtomicProjectNameTargetToModel.setAfterGetValidator(new AtomicProjectNameProcessor());
        strategyAtomicProjectNameTargetToModel.setConverter(new AtomicProjectNameProcessor());
        bindingContext.bindValue(observedProjectName, atomicValidatedProjectName,
                strategyAtomicProjectNameTargetToModel, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));

        CompoundNameValidator diagramNameValidator = new CompoundNameValidator(atomicValidatedDiagramName,
                atomicValidatedModelName, atomicValidatedProjectName);
        bindingContext.addValidationStatusProvider(diagramNameValidator);
        IObservableValue<?> validatedDiagramName = diagramNameValidator
                .observeValidatedValue(atomicValidatedDiagramName);
        IObservableValue<?> validatedModelName = diagramNameValidator.observeValidatedValue(atomicValidatedModelName);
        IObservableValue<?> validatedProjectName = diagramNameValidator
                .observeValidatedValue(atomicValidatedProjectName);

        @SuppressWarnings("unchecked")
        IObservableValue<String> modelSelectedModelName = BeanProperties
                .value(SelectedNamesDTO.class, "selectedModelName").observe(dto);
        @SuppressWarnings("unchecked")
        IObservableValue<String> modelSelectedDiagramName = BeanProperties
                .value(SelectedNamesDTO.class, "selectedDiagramName").observe(dto);
        @SuppressWarnings("unchecked")
        IObservableValue<ProjectName> modelSelectedProjectName = BeanProperties
                .value(SelectedNamesDTO.class, "selectedProjectName").observe(dto);
        // Bind to the validated value, not the middle/target
        bindingContext.bindValue(validatedDiagramName, modelSelectedDiagramName);
        bindingContext.bindValue(validatedModelName, modelSelectedModelName);
        bindingContext.bindValue(validatedProjectName, modelSelectedProjectName);

        aggregatedStatus = new AggregateValidationStatus(bindingContext, AggregateValidationStatus.MAX_SEVERITY);
        aggregatedStatus.addChangeListener(validatorStatusListener);
    }

    @Override
    public void dispose() {
        if (aggregatedStatus != null) {
            aggregatedStatus.removeChangeListener(validatorStatusListener);
        }
        super.dispose();
    }

    private abstract static class TextFieldVerifier implements VerifyListener {

        @Override
        public void verifyText(VerifyEvent e) {
            if (e.text == null) {
                e.doit = true;
            }
            e.doit = allowModification(e.text);
        }

        protected abstract boolean allowModification(String text);

    }

    private static void setProject(Text projectText, Text modelText) {
        IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        String cooperateNature = "de.cooperateproject.ui.CooperateProjectNature";
        try {
            if (selection.size() == 1) {
                Object element = selection.getFirstElement();
                if (element instanceof IProject && ((IProject) element).hasNature(cooperateNature)) {
                    projectText.setText(((IProject) selection.getFirstElement()).getName());
                } else if (element instanceof IFolder && ((IFolder) element).getProject().hasNature(cooperateNature)) {
                    projectText.setText(((IFolder) element).getProject().getName());
                } else if (element instanceof IFile && ((IFile) element).getFileExtension().contains("cooperate")) {
                    modelText.setText(
                            ((IFile) element).getName().substring(0, ((IFile) element).getName().lastIndexOf("-") - 1));
                    projectText.setText(((IFile) element).getProject().getName());
                }
            }
        } catch (CoreException e) {
            LOGGER.warn("Error ocurred while checking preconditions.", e);
        }
    }

    private void initCustomListeners() {
        textDiagramName.addVerifyListener(new TextFieldVerifier() {
            protected boolean allowModification(String text) {
                return text.matches("[a-zA-Z0-9_ .]*");
            }
        });
        textProject.addVerifyListener(new TextFieldVerifier() {
            @Override
            protected boolean allowModification(String text) {
                return text.matches("[a-zA-Z0-9_ ./]*");
            }
        });
    }

    /**
     * Changes the repository name and changes it back to what it was before to trigger validation of the
     * project properties.
     */
    public void triggerValidation() {
        String oldText = textProject.getText();
        textProject.setText("");
        textProject.setText(oldText);
    }

}
