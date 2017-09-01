package de.cooperateproject.modeling.textual.sequence.issues;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.ExistingIssuePreconditionFilterBase;

public class SequenceIssuesOrderDependenceFilter extends ExistingIssuePreconditionFilterBase {

    private static Map<String, Collection<String>> IDS_TO_REMOVE;
    
    static {
        IDS_TO_REMOVE = new HashMap<String, Collection<String>>();
        IDS_TO_REMOVE.put(SequenceUMLReferencingElementMissingElementFactory.ISSUE_CODE, Arrays.asList(
                SequenceFragmentSequenceHasWrongOrderFactory.ISSUE_CODE,
                SequenceFragmentWithoutOriginatingExecutionSpecificationFactory.ISSUE_CODE,
                SequenceMessageHasInconsistentExecutionSpecificationFactory.ISSUE_CODE));
        IDS_TO_REMOVE.put(SequenceFragmentSequenceHasWrongOrderFactory.ISSUE_CODE, Arrays.asList(
                SequenceFragmentWithoutOriginatingExecutionSpecificationFactory.ISSUE_CODE,
                SequenceMessageHasInconsistentExecutionSpecificationFactory.ISSUE_CODE));
        IDS_TO_REMOVE.put(SequenceMessageHasInconsistentExecutionSpecificationFactory.ISSUE_CODE, Arrays.asList(
                SequenceFragmentWithoutOriginatingExecutionSpecificationFactory.ISSUE_CODE));
    }
    
    
    public SequenceIssuesOrderDependenceFilter() {
        super(SequencePackage.eINSTANCE, 0);
    }

    @Override
    protected Collection<String> getIssueCodesToRemove(String presentIssueId) {
        return IDS_TO_REMOVE.getOrDefault(presentIssueId, Collections.emptyList());
    }

}
