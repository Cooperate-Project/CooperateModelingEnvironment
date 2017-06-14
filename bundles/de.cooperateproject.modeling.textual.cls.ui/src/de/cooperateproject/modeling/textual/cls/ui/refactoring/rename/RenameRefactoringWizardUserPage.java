package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.ltk.ui.refactoring.UserInputWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class RenameRefactoringWizardUserPage extends UserInputWizardPage {

    private final IObservableValue<String> newName;

    public RenameRefactoringWizardUserPage(IObservableValue<String> newName) {
        super("Refactoring input data");
        this.newName = newName;
    }

    @Override
    public void createControl(Composite parent) {
        setControl(new RenameRefactoringWizardUserPageComposite(parent, SWT.FILL, newName));

    }

}
