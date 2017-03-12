package de.cooperateproject.modeling.textual.cls.issues;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionProviderBase;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;

public class ClsAutomatedIssueResolutionProvider extends AutomatedIssueResolutionProviderBase {

    private static final Multimap<String, IAutomatedIssueResolutionFactory<EObject>> RESOLUTIONS = initResolutions();

    @Override
    protected Collection<IAutomatedIssueResolutionFactory<EObject>> findResolutionFactories(String issueCode) {
        return RESOLUTIONS.get(issueCode);
    }

    private static Multimap<String, IAutomatedIssueResolutionFactory<EObject>> initResolutions() {
        Multimap<String, IAutomatedIssueResolutionFactory<EObject>> map = HashMultimap.create();
        map.put(ClsUMLReferencingElementMissingElement.MISSING_UML_REFERENCE,
                e -> new ClsUMLReferencingElementMissingElement((UMLReferencingElement<Element>) e));
        map.put(ClsAssociationMemberEndRoleName.ISSUE_CODE,
                e -> new ClsAssociationMemberEndRoleName((AssociationMemberEnd) e));
        return map;
    }

}
