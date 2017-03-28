package de.cooperateproject.modeling.textual.cls.issues

import com.google.common.base.Predicates
import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ClsRootPackageMissing extends AutomatedIssueResolutionBase<Package> {
	
	public static val ISSUE_CODE = "missingUMLReferenceRootPackage"
	
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider
	
	@Inject
	private IGlobalScopeTypeQueryProvider typeQueryProvider
	
	new(Package problematicElement) {
		super(problematicElement)
	}
	
	public static def hasIssue(Package pkg) {
		pkg.owningPackage === null && preconditionHoldsFor(pkg);
	}
	
	private static def preconditionHoldsFor(Package problematicElement) {
		return 
			problematicElement.referencedElement === null &&
			problematicElement.classifiers.isEmpty &&
			problematicElement.connectors.isEmpty &&
			problematicElement.packageImports.isEmpty &&
			problematicElement.packages.isEmpty
	}
	
	override resolvePossible() {
		if (preconditionHoldsFor(problematicElement)) {
			val fqn = qualifiedNameProvider.getFullyQualifiedName(problematicElement)
			val umlRootPackage = findUMLRootPackage()
			if (umlRootPackage !== null && fqn.firstSegment == umlRootPackage.name) {
				var currentPackage = umlRootPackage
				for (segment : fqn.segments.subList(1, -1)) {
					val candidates = currentPackage.nestedPackages.filter[name == segment]
					if (candidates.size > 1) {
						return false
					} else if (candidates.empty) {
						return true
					} else {
						currentPackage = candidates.findFirst[true]
					}
				}
				return true
			}
		}
			
		return false
	}

	override resolve() {
		val fqn = qualifiedNameProvider.getFullyQualifiedName(problematicElement)
		val umlRootPackage = findUMLRootPackage()
		val segments = fqn.segments.subList(1, -1)
		val newPackage = umlRootPackage.createPackage(segments)
		problematicElement.referencedElement = newPackage
	}
	
	private static class PackageCreationException extends Exception {
		new(String msg) {
			super(msg)
		}
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
	
	private def findUMLRootPackage() {
		val umlPackages = typeQueryProvider.queryScope(problematicElement.eResource, true, UMLPackage.Literals.PACKAGE, Predicates.alwaysTrue)
		return umlPackages.allElements.map[EObjectOrProxy].filter(org.eclipse.uml2.uml.Package).findFirst[p | p.eContainer === null]
	}
	
}