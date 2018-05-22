/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.DecisionNode;
import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ActValidator extends AbstractActValidator {

	@Inject
	@SuppressWarnings("unused")
	private ICooperateAutomatedValidator automatedValidator;

	@Inject
	@SuppressWarnings("unused")
	private IIssueCodeRegistry issueCodeRegistry;

	@Check
	private void checkFlowConditionWithMultipleMembers(Flow flow) {
		// TODO: First, reenable multiflows!
//		if (flow.getRelatedElements().size() > 2 && flow.getCondition() != null) {
//			error("Conditions are only allowed for flow between two actions.", flow,
//					ActPackage.Literals.FLOW__RELATED_ELEMENTS);
//		}
	}
	
	@Check
	private void checkDecitionNodeEdges(DecisionNode node) {
		EList<ActivityEdge> incomings = node.getReferencedElement().getIncomings();
		EList<ActivityEdge> outgoings = node.getReferencedElement().getOutgoings();
		
		// A decision node has one or two incoming edges and at least one outgoing edge.
		if(!(incomings != null && incomings.size() >= 1 && incomings.size() <= 2 && outgoings.size() >= 1)) {
			// FIXME: null?
			error("A decision node has one or two incoming edges and at least one outgoing edge.", node,
					null);
		}
	}
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.cooperateproject.de/modeling/textual/activity/Activity"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.cooperateproject.de/modeling/textual/commons"));
		return result;
	}
}
