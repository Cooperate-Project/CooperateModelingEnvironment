/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import de.cooperateproject.modeling.textual.component.component.ConnectorEnd
import de.cooperateproject.modeling.textual.component.component.ComponentPackage
import de.cooperateproject.modeling.textual.component.component.Attribute
import de.cooperateproject.modeling.textual.component.component.Component
import de.cooperateproject.modeling.textual.component.component.Port
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.impl.SimpleScope
import com.google.common.collect.Iterables
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription
import org.eclipse.xtext.naming.QualifiedName

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentScopeProvider extends AbstractComponentScopeProvider {

	override IScope getScope(EObject context, EReference reference) {
		val defaultScope = super.getScope(context, reference)
		val newScope = doGetScope(context, reference, defaultScope)
		return newScope ?: defaultScope
	}

	def dispatch doGetScope(ConnectorEnd end, EReference reference, IScope parentScope) {
		if (reference == ComponentPackage.Literals.CONNECTOR_END__ROLE) {
			val partAttribute = end.eGet(ComponentPackage.Literals.CONNECTOR_END__PART, true) as Attribute
			if (partAttribute === null || 
				partAttribute.type === null || 
				!(partAttribute.type instanceof org.eclipse.uml2.uml.Component)
			) {
				return null
			}
			val descriptions = parentScope.allElements.filter[EObjectOrProxy instanceof Port]
				.filter [(EObjectOrProxy as Port).referencedElement !== null]
				.filter [(partAttribute.type as org.eclipse.uml2.uml.Component).ownedPorts
					.contains((EObjectOrProxy as Port).referencedElement)
			];
			val unqualifiedDescriptions = descriptions.unqualified
			return new SimpleScope(parentScope, unqualifiedDescriptions);
		}
	}

	def dispatch doGetScope(EObject obj, EReference reference, IScope parentScope) {
		return null
	}

	private static def unqualified(Iterable<IEObjectDescription> descriptions) {
		descriptions.map[unqualified]
	}

	private static def IEObjectDescription unqualified(IEObjectDescription description) {
		return new AliasedEObjectDescription(QualifiedName.create(description.name.lastSegment), description)
	}

}
