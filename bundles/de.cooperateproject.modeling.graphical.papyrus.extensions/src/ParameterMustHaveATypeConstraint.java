import org.eclipse.uml2.uml.Parameter;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.TypedElementMustHaveATypeConstraint;

public class ParameterMustHaveATypeConstraint extends TypedElementMustHaveATypeConstraint<Parameter> {

    public ParameterMustHaveATypeConstraint() {
        super(Parameter.class);
    }

}
