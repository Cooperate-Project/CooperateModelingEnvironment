package de.cooperateproject.modeling.textual.activity.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ActivityDiagramQualifiedNameProvider extends CooperateQualifiedNameProvider {

	// FIXME: Maybe the problem for this naming thing is elsewhere.
	// For some reason, these elements are not resolved correctly by the
	// SimpleAttributeResolver from the super implementation.
	// This forces the correct hierarchy: "RootPackage.Activity.Node" (instead of
	// "Node")
	
	// TODO: This hole class is a mess. Should be refactored.

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

	@Override
	public QualifiedName getFullyQualifiedName(EObject element) {
		if (element instanceof ActivityNode || element instanceof ActivityEdge || element instanceof ActivityPartition) {
			return createQualifiedNameForNamedElement((NamedElement) element);
		} else if (element instanceof Flow) {
			return createQualifiedNameForFlow((Flow) element);
		} else {
			return super.getFullyQualifiedName(element);
		}
	}

	private QualifiedName createQualifiedNameForNamedElement(NamedElement element) {
		String name = element.getName();

		// Activity partition support
		if (element instanceof ActivityNode) {
			EList<ActivityPartition> list = ((ActivityNode) element).getInPartitions();
			for (ActivityPartition partition : list) {
				name = partition.getName() + "." + name;
			}
		}

		// Add activity name
		name = ((Activity) element.eContainer()).getName() + "." + name;

		// Add model name
		name = ((Model) element.eContainer().eContainer()).getName() + "." + name;

		return converter.toQualifiedName(name);
	}

	// FIXME: This looks like even more buggier prototype code...
	private QualifiedName createQualifiedNameForFlow(Flow flow) {

		// TODO: The flow/ControlFlow Naming is based on the condition in Papyrus. Work
		// with this or try a source-target version instead?
		String name = flow.getName();

		// Add activity name
		name = ((de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement) flow.eContainer())
				.getName() + "." + name;

		// Add model name
		name = ((de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement) flow.eContainer()
				.eContainer()).getName() + "." + name;

		return converter.toQualifiedName(name);
	}

}
