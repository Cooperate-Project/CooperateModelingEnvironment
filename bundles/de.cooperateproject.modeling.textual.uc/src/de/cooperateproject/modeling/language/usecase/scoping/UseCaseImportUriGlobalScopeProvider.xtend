package de.cooperateproject.modeling.language.usecase.scoping

import com.google.common.base.Predicates
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.xtext.EcoreUtil2

class UseCaseImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {

	def findElements(Resource resource, EClass type) {
		return getScope(resource, true, type, Predicates.alwaysTrue).allElements.map[EObjectOrProxy].map[e | EcoreUtil2.resolve(e, resource)]
	}

}
