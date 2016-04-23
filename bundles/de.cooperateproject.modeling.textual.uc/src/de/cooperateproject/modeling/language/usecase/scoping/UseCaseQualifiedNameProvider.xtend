package de.cooperateproject.modeling.language.usecase.scoping

import de.cooperateproject.modeling.language.usecase.usecase.Actor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

class UseCaseQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	override getFullyQualifiedName(EObject eObject) {
//		if (eObject instanceof Actor) {
//			
//		}
		
		return super.getFullyQualifiedName(eObject);
	}
	
}
