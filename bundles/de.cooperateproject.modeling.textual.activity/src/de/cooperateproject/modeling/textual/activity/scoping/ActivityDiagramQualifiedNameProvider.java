package de.cooperateproject.modeling.textual.activity.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ActivityDiagramQualifiedNameProvider extends CooperateQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject element) {
		if (element instanceof ActivityNode || element instanceof ActivityEdge) {
			// FIXME: Maybe the problem for this naming thing is elsewhere.
			// For some reason, these elements are not resolved correctly by the SimpleAttributeResolver from the super implementation.
			// This forces the correct hierarchy: "RootPackage.Activity.Node" (instead of "Node")
			return createQualifiedNameForNode((NamedElement) element);
		} else {
			return super.getFullyQualifiedName(element);
		}
	}

	private QualifiedName createQualifiedNameForNode(NamedElement element) {
		String name = element.getName();

		//TODO: Add support for swimlanes like this: while(element.eContainer() instanceof ...)
		
		// Add activity name
		name = ((Activity) element.eContainer()).getName() + "." + name;
		
		// Add model name
		name = ((Model) element.eContainer().eContainer()).getName() + "." + name;
		
		return converter.toQualifiedName(name);
	}

}
