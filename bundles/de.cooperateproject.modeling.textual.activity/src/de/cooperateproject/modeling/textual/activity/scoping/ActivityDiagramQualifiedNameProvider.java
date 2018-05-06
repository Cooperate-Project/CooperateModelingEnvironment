package de.cooperateproject.modeling.textual.activity.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.activity.act.ActionNode;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ActivityDiagramQualifiedNameProvider extends CooperateQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject element) {
		// FIXME: This is not a real fix of the naming problem, but a workaround for now
		if (element instanceof ActionNode) {
			// Fix on instance of the naming problem
			// OpaqueAction -> Activity -> Model (Naming: "X")
			// ActionNode -> RootPackage -> ActivityDiagram (Naming: "RootPackage.X")
			ActionNode action = (ActionNode) element;
			String name = action.getName();
			EObject parent = action.eContainer();
			EObject parentsparent = parent.eContainer();
			System.out.println(super.getFullyQualifiedName(element));
			return converter.toQualifiedName(name);
		} else {
			return super.getFullyQualifiedName(element);
		}
	}

}
