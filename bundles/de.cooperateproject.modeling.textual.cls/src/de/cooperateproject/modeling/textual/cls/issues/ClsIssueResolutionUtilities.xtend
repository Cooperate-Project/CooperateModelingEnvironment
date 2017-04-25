package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility

import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.VisibilityKind

class ClsIssueResolutionUtilities {
	
	public static def convert(AggregationKind aggregationKind) {
		switch (aggregationKind) {
			case NONE: org.eclipse.uml2.uml.AggregationKind.NONE_LITERAL
			case AGGREGATION: org.eclipse.uml2.uml.AggregationKind.SHARED_LITERAL
			case COMPOSITION: org.eclipse.uml2.uml.AggregationKind.COMPOSITE_LITERAL
		}
	}
}
