package de.cooperateproject.ui.diff.common.labeling;


import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;

public class CommonClassTextSwitch extends TextualCommonsSwitch<String> {
    
    @Override
    public String caseComment(Comment object) {
        return "note";
    }
    
    @Override
    public String caseCardinality(Cardinality object) {
        return "cardinality";
    }
    
}
