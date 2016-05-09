package de.cooperateproject.ui.properties;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
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

public class ProjectPropertiesComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private final ProjectPropertiesDTO preferencesDTO;
	private Text txtCDOHostname;
	private Text txtCDOPort;
	private Text txtCDORepository;
	private Text txtCDOUsername;
	private Text txtCDOPassword;
	private Label lblPort;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ProjectPropertiesComposite(Composite parent, int style, ProjectPropertiesDTO preferencesDTO) {
		super(parent, style);
		this.preferencesDTO = preferencesDTO;
		
		setLayout(new GridLayout(1, false));
		
		Group grpCdo = new Group(this, SWT.NONE);
		grpCdo.setLayout(new GridLayout(2, false));
		grpCdo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
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
		
		txtCDOPassword = new Text(grpCdo, SWT.BORDER);
		txtCDOPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		m_bindingContext = initDataBindings();

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtCDOHostnameObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtCDOHostname);
		IObservableValue cdoHostPreferencesDTOObserveValue = BeanProperties.value("cdoHost").observe(preferencesDTO);
		bindingContext.bindValue(observeTextTxtCDOHostnameObserveWidget, cdoHostPreferencesDTOObserveValue, null, null);
		//
		IObservableValue observeTextTxtCDOPortObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtCDOPort);
		IObservableValue cdoPortPreferencesDTOObserveValue = BeanProperties.value("cdoPort").observe(preferencesDTO);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new StringToNumberConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new NumberToStringConverter());
		bindingContext.bindValue(observeTextTxtCDOPortObserveWidget, cdoPortPreferencesDTOObserveValue, strategy, strategy_1);
		//
		IObservableValue observeTextTxtCDORepositoryObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtCDORepository);
		IObservableValue cdoRepoPreferencesDTOObserveValue = BeanProperties.value("cdoRepo").observe(preferencesDTO);
		bindingContext.bindValue(observeTextTxtCDORepositoryObserveWidget, cdoRepoPreferencesDTOObserveValue, null, null);
		//
		return bindingContext;
	}
}
