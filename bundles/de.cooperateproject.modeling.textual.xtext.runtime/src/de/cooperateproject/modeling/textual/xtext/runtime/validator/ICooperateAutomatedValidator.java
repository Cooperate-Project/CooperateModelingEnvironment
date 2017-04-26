package de.cooperateproject.modeling.textual.xtext.runtime.validator;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.xtext.validation.EValidatorRegistrar;

public interface ICooperateAutomatedValidator extends EValidator {

    public static final String ISSUE_DATA_MARKER = "realEObjectUriFollows";

    void register(EValidatorRegistrar registrar);

}
