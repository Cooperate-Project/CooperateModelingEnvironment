package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Composite that contains the controls to ask for a new name.
 */
public class RenameUMLElementRefactoringWizardUserPageComposite extends Composite {
    private final boolean elementNameMightBeEmpty;
    private final boolean aliasIsAvailable;
    private final IObservableValue<String> newName;
    private final IObservableValue<String> newAlias;
    private final IObservableValue<String> validationErrorMessage;
    private final IChangeListener aggregatedStatusListener = this::handleValidationStatusChange;
    private AggregateValidationStatus aggregatedStatus;
    private Text textNewName;
    private Text textNewAlias;

    /**
     * Creates the composite.
     * 
     * @param parent
     *            The parent composite.
     * @param style
     *            The SWT style.
     * @param newNameDTO
     *            The object that receives the chosen new name.
     * @param validationErrorMessage
     */
    public RenameUMLElementRefactoringWizardUserPageComposite(Composite parent, int style,
            IObservableValue<String> newNameDTO, IObservableValue<String> newAliasDTO,
            IObservableValue<String> validationErrorMessage, boolean elementNameMightBeEmpty,
            boolean aliasIsAvailable) {
        super(parent, style);
        this.elementNameMightBeEmpty = elementNameMightBeEmpty;
        this.aliasIsAvailable = aliasIsAvailable;
        this.validationErrorMessage = validationErrorMessage;
        this.newName = newNameDTO;
        this.newAlias = newAliasDTO;
        setLayout(new GridLayout(2, false));

        Label lblNewName = new Label(this, SWT.NONE);
        lblNewName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblNewName.setText("New Name");

        textNewName = new Text(this, SWT.BORDER);
        textNewName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        if (aliasIsAvailable) {
            Label lblNewAlias = new Label(this, SWT.NONE);
            lblNewAlias.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
            lblNewAlias.setText("New Alias");

            textNewAlias = new Text(this, SWT.BORDER);
            textNewAlias.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        }

        initCustomDataBindings();
        textNewName.setFocus();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    private void initCustomDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();

        UpdateValueStrategy defaultStrategy = new UpdateValueStrategy();

        IObservableValue<String> observedNewName = WidgetProperties.text(SWT.Modify).observe(textNewName);
        IObservableValue<String> observedNewAlias = new WritableValue<String>("", String.class);
        if (aliasIsAvailable) {
            observedNewAlias = WidgetProperties.text(SWT.Modify).observe(textNewAlias);
        }

        MultiValidator nameAndAliasValidator = new NameAndAliasValidator(observedNewName, observedNewAlias,
                elementNameMightBeEmpty);
        bindingContext.addValidationStatusProvider(nameAndAliasValidator);
        IObservableValue<String> validatedNewName = nameAndAliasValidator.observeValidatedValue(observedNewName);
        IObservableValue<String> validatedNewAlias = nameAndAliasValidator.observeValidatedValue(observedNewAlias);

        bindingContext.bindValue(validatedNewName, newName, defaultStrategy, defaultStrategy);
        bindingContext.bindValue(validatedNewAlias, newAlias, defaultStrategy, defaultStrategy);

        aggregatedStatus = new AggregateValidationStatus(bindingContext, AggregateValidationStatus.MAX_SEVERITY);
        aggregatedStatus.addChangeListener(aggregatedStatusListener);
    }

    private void handleValidationStatusChange(ChangeEvent event) {
        AggregateValidationStatus status = (AggregateValidationStatus) event.getObservable();
        IStatus validationStatus = status.getValue();
        if (validationStatus.getSeverity() == IStatus.OK) {
            validationErrorMessage.setValue(null);
        } else {
            validationErrorMessage.setValue(validationStatus.getMessage());
        }
    }
}
