package de.cooperateproject.ui.diff.common.labeling;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;

/**
 * Switch to invoke description method for common model class.
 * 
 * @author czogalik
 *
 */
public class CommonLabelSwitch extends TextualCommonsSwitch<String> {

    @Override
    public String caseComment(Comment object) {
        return "note " + object.getBody();
    }

    @Override
    public String caseCardinality(Cardinality object) {
        return object.getLowerBound() + " : " + object.getUpperBound();
    }

}
