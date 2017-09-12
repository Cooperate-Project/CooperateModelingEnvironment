package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class CommonStereotypeApplicationMissingStereotypeResolvableChecker implements IResolvableChecker<StereotypeApplication> {
	
	override isResolvable(StereotypeApplication element) {
		val stereotypeName = element.stereotype
		val umlElement = CommonStereotypeApplicationMissingStereotypeResolution.getParentUML(element)
		val stereotype = CommonStereotypeApplicationMissingStereotypeResolution.getApplicableStereotype(umlElement, stereotypeName)
		
		return stereotype.present	   
}

	
}
