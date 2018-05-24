package de.cooperateproject.modeling.textual.activity.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ActivityDiagramQualifiedNameProvider extends CooperateQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	protected QualifiedName qualifiedName(ActivityNode element) {
		return createQualifiedNameForActivityElement((NamedElement) element);
	}

	protected QualifiedName qualifiedName(ActivityPartition element) {
		return createQualifiedNameForActivityElement((NamedElement) element);
	}

	// Partition Naming Support for Activity UML Elements
	private QualifiedName createQualifiedNameForActivityElement(NamedElement element) {

		// Set own name
		String name = element.getName();

		// Add partition names
		if (element instanceof ActivityNode) {
			EList<ActivityPartition> list = ((ActivityNode) element).getInPartitions();
			for (ActivityPartition partition : list) {
				name = partition.getName() + "." + name;
			}
		}

		// Add parent names
		while (element.eContainer() instanceof NamedElement) {
			element = (NamedElement) element.eContainer();
			name = element.getName() + "." + name;
		}

		return converter.toQualifiedName(name);
	}

}
