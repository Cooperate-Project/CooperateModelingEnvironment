package de.cooperateproject.ui.properties;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.cooperateproject.ui.util.NumberToStringConverter;
import de.cooperateproject.ui.util.StringToNumberConverter;
import de.cooperateproject.ui.wizards.projectnew.CDOCredentialsValidator;
import de.cooperateproject.ui.wizards.projectnew.NonEmptyStringValidator;

public class ProjectPropertiesComposite extends Composite {
    private DataBindingContext m_bindingContext;
    private Text txtCDOHostname;
    private Text txtCDOPort;
    private Text txtCDORepository;
    private Text txtCDOUsername;
    private Text txtCDOPassword;
    private Label lblPort;

    private final ProjectPropertiesDTO preferencesDTO;
    private final IChangeListener validatorStatusListener;
    private AggregateValidationStatus aggregatedStatus;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public ProjectPropertiesComposite(Composite parent, int style, ProjectPropertiesDTO preferencesDTO,
            IChangeListener validatorStatusListener) {
        super(parent, style);
        this.preferencesDTO = preferencesDTO;
        this.validatorStatusListener = validatorStatusListener;

        setLayout(new GridLayout(1, false));

        Group grpCdo = new Group(this, SWT.NONE);
        grpCdo.setLayout(new GridLayout(2, false));
        GridData gd_grpCdo = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_grpCdo.minimumHeight = 150;
        gd_grpCdo.heightHint = 156;
        grpCdo.setLayoutData(gd_grpCdo);
        grpCdo.setText("CDO");

        Label lblHostname = new Label(grpCdo, SWT.NONE);
        lblHostname.setText("Hostname");

        txtCDOHostname = new Text(grpCdo, SWT.BORDER);
        txtCDOHostname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblPort = new Label(grpCdo, SWT.NONE);
        lblPort.setText("Port");

        txtCDOPort = new Text(grpCdo, SWT.BORDER);
        txtCDOPort.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

        Label lblRepository = new Label(grpCdo, SWT.NONE);
        lblRepository.setText("Repository");

        txtCDORepository = new Text(grpCdo, SWT.BORDER);
        txtCDORepository.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblUsername = new Label(grpCdo, SWT.NONE);
        lblUsername.setText("Username");

        txtCDOUsername = new Text(grpCdo, SWT.BORDER);
        txtCDOUsername.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblPassword = new Label(grpCdo, SWT.NONE);
        lblPassword.setText("Password");

        txtCDOPassword = new Text(grpCdo, SWT.BORDER | SWT.PASSWORD);
        txtCDOPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        m_bindingContext = createDataBindings();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    protected DataBindingContext createDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        // atomic host
        IObservableValue<String> observeTextTxtCDOHostnameObserveWidget = WidgetProperties.text(SWT.Modify)
                .observe(txtCDOHostname);
        IObservableValue<String> atomicValidatedHostname = new WritableValue<String>(null, String.class);
        UpdateValueStrategy strategyAtomicStringToModel = new UpdateValueStrategy();
        strategyAtomicStringToModel.setAfterGetValidator(new NonEmptyStringValidator());
        UpdateValueStrategy strategyAtomicStringToTarget = new UpdateValueStrategy();
        bindingContext.bindValue(observeTextTxtCDOHostnameObserveWidget, atomicValidatedHostname,
                strategyAtomicStringToModel, strategyAtomicStringToTarget);
        // atomic port
        IObservableValue<String> observeTextTxtCDOPortObserveWidget = WidgetProperties.text(SWT.Modify)
                .observe(txtCDOPort);
        IObservableValue<Integer> atomicValidatedPort = new WritableValue<Integer>(null, Integer.class);
        UpdateValueStrategy strategy = new UpdateValueStrategy();
        strategy.setConverter(new StringToNumberConverter());
        strategy.setAfterGetValidator(new StringToNumberConverter());
        UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
        strategy_1.setConverter(new NumberToStringConverter());
        strategy_1.setAfterGetValidator(new NumberToStringConverter());
        bindingContext.bindValue(observeTextTxtCDOPortObserveWidget, atomicValidatedPort, strategy, strategy_1);
        // atomic repo
        IObservableValue<String> observeTextTxtCDORepositoryObserveWidget = WidgetProperties.text(SWT.Modify)
                .observe(txtCDORepository);
        IObservableValue<String> atomicValidatedRepository = new WritableValue<String>(null, String.class);
        bindingContext.bindValue(observeTextTxtCDORepositoryObserveWidget, atomicValidatedRepository,
                strategyAtomicStringToModel, strategyAtomicStringToTarget);
        // connection validation
        MultiValidator connectionValidator = new CDOCredentialsValidator(atomicValidatedHostname, atomicValidatedPort,
                atomicValidatedRepository);
        bindingContext.addValidationStatusProvider(connectionValidator);
        IObservableValue<String> validatedHostname = connectionValidator.observeValidatedValue(atomicValidatedHostname);
        IObservableValue<Integer> validatedPort = connectionValidator.observeValidatedValue(atomicValidatedPort);
        IObservableValue<String> validatedRepo = connectionValidator.observeValidatedValue(atomicValidatedRepository);
        // model bindings
        IObservableValue<String> cdoHostPreferencesDTOObserveValue = BeanProperties.value("cdoHost")
                .observe(preferencesDTO);
        bindingContext.bindValue(validatedHostname, cdoHostPreferencesDTOObserveValue);
        IObservableValue<Integer> cdoPortPreferencesDTOObserveValue = BeanProperties.value("cdoPort")
                .observe(preferencesDTO);
        bindingContext.bindValue(validatedPort, cdoPortPreferencesDTOObserveValue);
        IObservableValue<String> cdoRepoPreferencesDTOObserveValue = BeanProperties.value("cdoRepo")
                .observe(preferencesDTO);
        bindingContext.bindValue(validatedRepo, cdoRepoPreferencesDTOObserveValue);
        // validation status notifier
        aggregatedStatus = new AggregateValidationStatus(bindingContext, AggregateValidationStatus.MAX_SEVERITY);
        aggregatedStatus.addChangeListener(validatorStatusListener);
        // return binding context
        return bindingContext;
    }

    public final void updateModels() {
        m_bindingContext.updateModels();
    }

    public final void updateTargets() {
        m_bindingContext.updateTargets();
    }

    @Override
    public void dispose() {
        if (aggregatedStatus != null) {
            aggregatedStatus.removeChangeListener(validatorStatusListener);
        }
        super.dispose();
    }
}
