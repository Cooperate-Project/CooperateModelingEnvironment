package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.collect.Lists;

public class CooperateQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	protected QualifiedName qualifiedName(org.eclipse.uml2.uml.Package umlPackage){
		List<org.eclipse.uml2.uml.Package> packages = Lists.newLinkedList();
		for (org.eclipse.uml2.uml.Package currentPackage = umlPackage; currentPackage != null; currentPackage = currentPackage.getNestingPackage()) {
			packages.add(0, currentPackage);			
		}
		if (packages.stream().anyMatch(p -> p.getName() == null)) {
			return null;
		}
		
		List<String> names = packages.stream().map(org.eclipse.uml2.uml.Package::getName).collect(Collectors.toList());
		return QualifiedName.create(names);
	}
	
}
