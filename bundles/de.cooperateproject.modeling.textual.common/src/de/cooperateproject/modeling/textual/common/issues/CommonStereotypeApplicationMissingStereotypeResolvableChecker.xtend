package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class CommonStereotypeApplicationMissingStereotypeResolvableChecker implements IResolvableChecker<StereotypeApplication> {
	
	override isResolvable(StereotypeApplication element) {
		val stereotype = element.stereotype
		if (stereotype === null)
			return false
	
		val umlElement = CommonStereotypeApplicationMissingStereotypeResolution.getParentUML(element)
		
		return umlElement.isStereotypeApplicable(stereotype)	   
}

	
}
