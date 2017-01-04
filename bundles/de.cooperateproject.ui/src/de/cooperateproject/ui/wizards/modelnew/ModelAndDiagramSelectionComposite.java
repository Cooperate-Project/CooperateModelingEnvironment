package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import de.cooperateproject.ui.wizards.modelnew.AtomicModelNameProcessor.ModelName;

public class ModelAndDiagramSelectionComposite extends Composite {
	private final DataBindingContext m_bindingContext;
	private final Text textModel;
	private final Text textDiagramName;
	private final TreeViewer treeViewer;

	private final SelectedNamesDTO dto;
	private final IChangeListener validatorStatusListener;
	private AggregateValidationStatus aggregatedStatus;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ModelAndDiagramSelectionComposite(Composite parent, int style, SelectedNamesDTO dto, IChangeListener validatorStatusListener) {
		super(parent, style);
		this.dto = dto;
		this.validatorStatusListener = validatorStatusListener;
		setLayout(new GridLayout(2, false));
		
		Label lblEnterOrSelect = new Label(this, SWT.NONE);
		lblEnterOrSelect.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		lblEnterOrSelect.setText("Enter or select the model:");
		
		textModel = new Text(this, SWT.BORDER);
		textModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		treeViewer = new TreeViewer(this, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		treeViewer.setLabelProvider(new ModelLabelProvider());
		treeViewer.setContentProvider(new ModelContentProvider());
		treeViewer.setInput(dto);
		
		Label lblDiagramName = new Label(this, SWT.NONE);
		lblDiagramName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDiagramName.setText("Diagram Name:");
		
		textDiagramName = new Text(this, SWT.BORDER);
		textDiagramName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		m_bindingContext = initDataBindings();
		initCustomDataBindings();
		initCustomListeners();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeSingleSelectionTreeViewer = ViewerProperties.singleSelection().observe(treeViewer);
		IObservableValue textTextModelObserveValue = PojoProperties.value("text").observe(textModel);
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new ModelNodeConverter());
		bindingContext.bindValue(observeSingleSelectionTreeViewer, textTextModelObserveValue, strategy_1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
		//
		return bindingContext;
	}
	

	private void initCustomDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		
		IObservableValue<String> observedDiagramName = WidgetProperties.text(SWT.Modify).observe(textDiagramName);
		IObservableValue<String> observedModelName = WidgetProperties.text(SWT.Modify).observe(textModel);
		
		IObservableValue<String> atomicValidatedDiagramName = new WritableValue<String>(null, String.class);
		IObservableValue<ModelName> atomicValidatedModelName = new WritableValue<ModelName>(null, ModelName.class);
		
		UpdateValueStrategy strategyAtomicModelNameTargetToModel = new UpdateValueStrategy();
		strategyAtomicModelNameTargetToModel.setAfterGetValidator(new AtomicModelNameProcessor());
		strategyAtomicModelNameTargetToModel.setConverter(new AtomicModelNameProcessor());
		bindingContext.bindValue(observedModelName, atomicValidatedModelName, strategyAtomicModelNameTargetToModel, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
		
		UpdateValueStrategy strategyAtomicDiagramNameTargetToModel = new UpdateValueStrategy();
		strategyAtomicDiagramNameTargetToModel.setAfterGetValidator(new AtomicDiagramNameProcessor());
		bindingContext.bindValue(observedDiagramName, atomicValidatedDiagramName, strategyAtomicDiagramNameTargetToModel, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
		
		CompoundNameValidator diagramNameValidator = new CompoundNameValidator(atomicValidatedDiagramName, atomicValidatedModelName);
		bindingContext.addValidationStatusProvider(diagramNameValidator);
		IObservableValue<String> validatedDiagramName = diagramNameValidator.observeValidatedValue(atomicValidatedDiagramName);
		IObservableValue<ModelName> validatedModelName = diagramNameValidator.observeValidatedValue(atomicValidatedModelName);
		
		IObservableValue<ModelName> modelSelectedModelName = BeanProperties.value(SelectedNamesDTO.class, "selectedModelName").observe(dto);
		IObservableValue<String> modelSelectedDiagramName = BeanProperties.value(SelectedNamesDTO.class, "selectedDiagramName").observe(dto);
		
		// Bind to the validated value, not the middle/target
		bindingContext.bindValue(validatedDiagramName, modelSelectedDiagramName);
		bindingContext.bindValue(validatedModelName, modelSelectedModelName);
		
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
	
	private static abstract class TextFieldVerifier implements VerifyListener {
		
		@Override
		public void verifyText(VerifyEvent e) {
			if (e.text == null) {
				e.doit = true;
			}
			e.doit = allowModification(e.text);
		}

		protected abstract boolean allowModification(String text);
		
	}
	
	private void initCustomListeners() {
		textDiagramName.addVerifyListener(new TextFieldVerifier() {
			protected boolean allowModification(String text) {
				return text.matches("[a-zA-Z0-9_ .]*");
			}
		});
		textModel.addVerifyListener(new TextFieldVerifier() {
			@Override
			protected boolean allowModification(String text) {
				return text.matches("[a-zA-Z0-9_ ./]*");
			}});
	}
	
}
