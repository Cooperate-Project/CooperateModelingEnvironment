package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ClsQualifiedNameProvider extends CooperateQualifiedNameProvider {

	private static final NameSwitch NAME_SWITCH = new NameSwitch();

	protected QualifiedName qualifiedName(EObject element) {
		if (element.eClass().getEPackage() != ClsPackage.eINSTANCE) {
			return null;
		}
		
		List<String> segments = findNameSegments(element);
		if (segments.isEmpty()) {
			return null;
		}
		
		return QualifiedName.create(segments);
	}
	
	private static List<String> findNameSegments(EObject o) {
		List<String> nameParts = Lists.newLinkedList();
		for (EObject currentObject = o; currentObject != null; currentObject = currentObject.eContainer()) {
			nameParts.add(0, NAME_SWITCH.doSwitch(currentObject));			
		}
		return nameParts.stream().filter(s -> s != null).collect(Collectors.toList());
	}
	
}
