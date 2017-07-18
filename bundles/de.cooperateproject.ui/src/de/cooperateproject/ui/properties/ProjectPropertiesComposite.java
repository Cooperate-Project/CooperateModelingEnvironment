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
import org.eclipse.swt.accessibility.ACC;
import org.eclipse.swt.accessibility.Accessible;
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

/**
 * Composite used to request and validate connection information from the user.
 * 
 * @author seifermann, persch
 *
 */
public class ProjectPropertiesComposite extends Composite {
    private DataBindingContext mBindingContext;
    private Text txtCDOHostname;
    private Text txtCDOPort;
    private Text txtCDORepository;
    private Text txtCDOUsername;
    private Text txtCDOPassword;
    private Text txtMsgPort;

    private final ProjectPropertiesDTO preferencesDTO;
    private final IChangeListener validatorStatusListener;
    private AggregateValidationStatus aggregatedStatus;
    private static final int UPDATE_DELAY = 1000;

    /**
     * Creates the composite.
     * 
     * @param parent
     *            The parent composite.
     * @param style
     *            Style which will be used.
     * @param preferencesDTO
     *            Stores connection information.
     * @param validatorStatusListener
     *            The IChangeListener used for the validator.
     */
    public ProjectPropertiesComposite(Composite parent, int style, ProjectPropertiesDTO preferencesDTO,
            IChangeListener validatorStatusListener) {
        super(parent, style);
        this.preferencesDTO = preferencesDTO;
        this.validatorStatusListener = validatorStatusListener;

        setLayout(new GridLayout(1, false));

        Group grpCdo = new Group(this, SWT.NONE);
        grpCdo.setLayout(new GridLayout(2, false));
        GridData gdGrpCdo = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gdGrpCdo.minimumHeight = 150;
        gdGrpCdo.heightHint = 156;
        grpCdo.setLayoutData(gdGrpCdo);
        grpCdo.setText("CDO");

        Label lblHostname = new Label(grpCdo, SWT.NONE);
        lblHostname.setText("Hostname:");
        txtCDOHostname = new Text(grpCdo, SWT.BORDER);
        txtCDOHostname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblHostname = lblHostname.getAccessible();
        Accessible accTxtHostname = txtCDOHostname.getAccessible();
        accLblHostname.addRelation(ACC.RELATION_LABEL_FOR, accTxtHostname);
        accTxtHostname.addRelation(ACC.RELATION_LABELLED_BY, accLblHostname);

        Label lblPort = new Label(grpCdo, SWT.NONE);
        lblPort.setText("Port:");
        txtCDOPort = new Text(grpCdo, SWT.BORDER);
        txtCDOPort.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        Accessible accLblPort = lblPort.getAccessible();
        Accessible accTxtPort = txtCDOPort.getAccessible();
        accLblPort.addRelation(ACC.RELATION_LABEL_FOR, accTxtPort);
        accTxtPort.addRelation(ACC.RELATION_LABELLED_BY, accLblPort);

        Label lblRepository = new Label(grpCdo, SWT.NONE);
        lblRepository.setText("Repository:");
        txtCDORepository = new Text(grpCdo, SWT.BORDER);
        txtCDORepository.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblRepository = lblRepository.getAccessible();
        Accessible accTxtRepository = txtCDORepository.getAccessible();
        accLblRepository.addRelation(ACC.RELATION_LABEL_FOR, accTxtRepository);
        accTxtRepository.addRelation(ACC.RELATION_LABELLED_BY, accLblRepository);

        Label lblUsername = new Label(grpCdo, SWT.NONE);
        lblUsername.setText("Username:");
        txtCDOUsername = new Text(grpCdo, SWT.BORDER);
        txtCDOUsername.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblUsername = lblUsername.getAccessible();
        Accessible accTxtUsername = txtCDOUsername.getAccessible();
        accLblUsername.addRelation(ACC.RELATION_LABEL_FOR, accTxtUsername);
        accTxtUsername.addRelation(ACC.RELATION_LABELLED_BY, accLblUsername);

        Label lblPassword = new Label(grpCdo, SWT.NONE);
        lblPassword.setText("Password:");
        txtCDOPassword = new Text(grpCdo, SWT.BORDER | SWT.PASSWORD);
        txtCDOPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblPassword = lblPassword.getAccessible();
        Accessible accTxtPassword = txtCDOPassword.getAccessible();
        accLblPassword.addRelation(ACC.RELATION_LABEL_FOR, accTxtPassword);
        accTxtPassword.addRelation(ACC.RELATION_LABELLED_BY, accLblPassword);

        Label lblMsgPort = new Label(grpCdo, SWT.NONE);
        lblMsgPort.setText("Message Server Port:");
        txtMsgPort = new Text(grpCdo, SWT.BORDER);
        txtMsgPort.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Accessible accLblMsgPort = lblMsgPort.getAccessible();
        Accessible accTxtMsgPort = txtMsgPort.getAccessible();
        accLblMsgPort.addRelation(ACC.RELATION_LABEL_FOR, accTxtMsgPort);
        accTxtMsgPort.addRelation(ACC.RELATION_LABELLED_BY, accLblMsgPort);

        mBindingContext = createDataBindings();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    protected DataBindingContext createDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        // atomic host
        IObservableValue<String> observeTextTxtCDOHostnameObserveWidget = WidgetProperties.text(SWT.Modify)
                .observeDelayed(UPDATE_DELAY, txtCDOHostname);
        IObservableValue<String> atomicValidatedHostname = new WritableValue<>(null, String.class);
        UpdateValueStrategy strategyAtomicStringToModel = new UpdateValueStrategy();
        strategyAtomicStringToModel.setAfterGetValidator(new NonEmptyStringValidator());
        UpdateValueStrategy strategyAtomicStringToTarget = new UpdateValueStrategy();
        bindingContext.bindValue(observeTextTxtCDOHostnameObserveWidget, atomicValidatedHostname,
                strategyAtomicStringToModel, strategyAtomicStringToTarget);
        // atomic port
        IObservableValue<String> observeTextTxtCDOPortObserveWidget = WidgetProperties.text(SWT.Modify)
                .observeDelayed(UPDATE_DELAY, txtCDOPort);
        IObservableValue<Integer> atomicValidatedPort = new WritableValue<>(null, Integer.class);
        UpdateValueStrategy strategy = new UpdateValueStrategy();
        strategy.setConverter(new StringToNumberConverter());
        strategy.setAfterGetValidator(new StringToNumberConverter());
        UpdateValueStrategy strategy1 = new UpdateValueStrategy();
        strategy1.setConverter(new NumberToStringConverter());
        strategy1.setAfterGetValidator(new NumberToStringConverter());
        bindingContext.bindValue(observeTextTxtCDOPortObserveWidget, atomicValidatedPort, strategy, strategy1);
        // atomic repo
        IObservableValue<String> observeTextTxtCDORepositoryObserveWidget = WidgetProperties.text(SWT.Modify)
                .observeDelayed(UPDATE_DELAY, txtCDORepository);
        IObservableValue<String> atomicValidatedRepository = new WritableValue<>(null, String.class);
        bindingContext.bindValue(observeTextTxtCDORepositoryObserveWidget, atomicValidatedRepository,
                strategyAtomicStringToModel, strategyAtomicStringToTarget);
        // atomic message port
        IObservableValue<String> observeTextTxtMsgPortObserveWidget = WidgetProperties.text(SWT.Modify)
                .observeDelayed(UPDATE_DELAY, txtMsgPort);
        IObservableValue<Integer> atomicValidatedMsgPort = new WritableValue<>(null, Integer.class);
        UpdateValueStrategy msgStrategy = new UpdateValueStrategy();
        msgStrategy.setConverter(new StringToNumberConverter());
        msgStrategy.setAfterGetValidator(new StringToNumberConverter());
        UpdateValueStrategy msgStrategy1 = new UpdateValueStrategy();
        msgStrategy1.setConverter(new NumberToStringConverter());
        msgStrategy1.setAfterGetValidator(new NumberToStringConverter());
        bindingContext.bindValue(observeTextTxtMsgPortObserveWidget, atomicValidatedMsgPort, msgStrategy, msgStrategy1);
        // connection validation
        MultiValidator connectionValidator = new CDOCredentialsValidator(atomicValidatedHostname, atomicValidatedPort,
                atomicValidatedRepository, atomicValidatedMsgPort);
        bindingContext.addValidationStatusProvider(connectionValidator);
        IObservableValue<String> validatedHostname = connectionValidator.observeValidatedValue(atomicValidatedHostname);
        IObservableValue<Integer> validatedPort = connectionValidator.observeValidatedValue(atomicValidatedPort);
        IObservableValue<String> validatedRepo = connectionValidator.observeValidatedValue(atomicValidatedRepository);
        IObservableValue<Integer> validatedMsgPort = connectionValidator.observeValidatedValue(atomicValidatedMsgPort);
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
        IObservableValue<Integer> msgPortPreferencesDTOObserveValue = BeanProperties.value("msgPort")
                .observe(preferencesDTO);
        bindingContext.bindValue(validatedMsgPort, msgPortPreferencesDTOObserveValue);
        // validation status notifier
        aggregatedStatus = new AggregateValidationStatus(bindingContext, AggregateValidationStatus.MAX_SEVERITY);
        aggregatedStatus.addChangeListener(validatorStatusListener);
        // return binding context
        return bindingContext;
    }

    /**
     * Updates all model observable objects to reflect the current state of the
     * target observable objects.
     *
     */
    public final void updateModels() {
        mBindingContext.updateModels();
    }

    /**
     * Updates all target observable objects to reflect the current state of the
     * model observable objects.
     *
     */
    public final void updateTargets() {
        mBindingContext.updateTargets();
    }

    @Override
    public void dispose() {
        if (aggregatedStatus != null) {
            aggregatedStatus.removeChangeListener(validatorStatusListener);
        }
        super.dispose();
    }
}
