package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.cls.cls.Package
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import org.eclipse.uml2.uml.UMLPackage
import com.google.common.base.Predicates
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsRootPackageMissingResolution extends AutomatedIssueResolutionBase<de.cooperateproject.modeling.textual.cls.cls.Package> {
	
	val IQualifiedNameProvider qualifiedNameProvider
	val IGlobalScopeTypeQueryProvider typeQueryProvider
	
	new(Package problematicElement, IResolvableChecker<Package> checker, IQualifiedNameProvider qualifiedNameProvider, IGlobalScopeTypeQueryProvider typeQueryProvider) {
		super(problematicElement, checker)
		this.qualifiedNameProvider = qualifiedNameProvider
		this.typeQueryProvider = typeQueryProvider
	}
	
	override resolve() {
		val fqn = qualifiedNameProvider.getFullyQualifiedName(problematicElement)
		val umlRootPackage = findUMLRootPackage(typeQueryProvider, problematicElement)
		val segments = fqn.segments.subList(1, fqn.segments.size)
		val newPackage = umlRootPackage.createPackage(segments)
		problematicElement.referencedElement = newPackage
	}
	
	static def findUMLRootPackage(IGlobalScopeTypeQueryProvider typeQueryProvider, Package element) {
		val umlPackages = typeQueryProvider.queryScope(element.eResource, true, UMLPackage.Literals.PACKAGE, Predicates.alwaysTrue)
		return umlPackages.allElements.map[EObjectOrProxy].filter(org.eclipse.uml2.uml.Package).findFirst[p | p.eContainer === null]
	}
	
	private def createPackage(org.eclipse.uml2.uml.Package rootPackage, Iterable<String> segments) {
		var currentPackage = rootPackage
		for (segment : segments) {
			val candidates = currentPackage.nestedPackages.filter[name == segment]
			if (candidates.size < 1) {
				currentPackage = currentPackage.createNestedPackage(segment)
			} else if (candidates.size > 1) {
				throw new PackageCreationException("The segment " + segment + " is ambiguous for package " + currentPackage)
			} else {
				currentPackage = candidates.findFirst[true]
			}
		}
		return currentPackage
	}
	
	private static class PackageCreationException extends Exception {
		new(String msg) {
			super(msg)
		}
	}
	
}