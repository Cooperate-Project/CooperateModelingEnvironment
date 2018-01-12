package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.OpaqueExpression;

import com.google.common.collect.Streams;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint for ensuring that a constraint for a extend relationship has a natural language description.
 */
public class UseCaseDiagramConstraintsMustHaveNaturalLanguageDescription extends CooperateConstraintBase<Constraint> {

    /**
     * Constructs constraint.
     */
    public UseCaseDiagramConstraintsMustHaveNaturalLanguageDescription() {
        super(Constraint.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Constraint target) {
        if (!(target.eContainer() instanceof Extend)) {
            return true;
        }

        return Optional.ofNullable(target.getSpecification()).filter(OpaqueExpression.class::isInstance)
                .map(OpaqueExpression.class::cast).filter(e -> e.getBodies().size() == e.getLanguages().size())
                .map(e -> Streams.zip(e.getLanguages().stream(), e.getBodies().stream(), Pair::of)
                        .anyMatch(p -> "Natural language".equals(p.getKey()) && StringUtils.isNotBlank(p.getValue())))
                .orElse(false);
    }

}
