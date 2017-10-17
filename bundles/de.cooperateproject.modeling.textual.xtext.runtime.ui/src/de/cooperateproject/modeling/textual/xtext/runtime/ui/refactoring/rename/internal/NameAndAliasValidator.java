package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.Activator;

public class NameAndAliasValidator extends MultiValidator {

    private final IObservableValue<String> nameObservable;
    private final IObservableValue<String> aliasObservable;
    private final boolean nameIsOptional;

    public NameAndAliasValidator(IObservableValue<String> name, IObservableValue<String> alias,
            boolean nameIsOptional) {
        super();
        this.nameObservable = name;
        this.aliasObservable = alias;
        this.nameIsOptional = nameIsOptional;
    }

    @Override
    protected IStatus validate() {
        String name = nameObservable.getValue();
        String alias = aliasObservable.getValue();

        Optional<String> validationResult = getErrorMessage(name, alias);
        return validationResult.map(errorMessage -> (IStatus) new Status(IStatus.ERROR,
                Activator.getInstance().getBundle().getSymbolicName(), errorMessage)).orElse(Status.OK_STATUS);
    }

    private Optional<String> getErrorMessage(String name, String alias) {
        if (StringUtils.isNotBlank(name)) {
            if (isID(name)) {
                return Optional.empty();
            } else {
                if (isID(alias)) {
                    return Optional.empty();
                } else {
                    return Optional.of("The alias has to be an ID if the name is no ID");
                }
            }
        } else {
            if (nameIsOptional) {
                if (StringUtils.isBlank(alias)) {
                    return Optional.empty();
                } else {
                    return Optional.of("The alias has to be omitted if the name is omitted.");
                }
            } else {
                return Optional.of("A name is mandatory.");
            }
        }
    }

    private static boolean isID(String value) {
        return StringUtils.isNotBlank(value) && value.matches("[a-zA-Z][a-zA-Z0-9]*");
    }

}
