package de.cooperateproject.modeling.textual.cls.utils

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind

class ClsConversionUtilities {
	
	public static def convert(AggregationKind aggregationKind) {
		switch (aggregationKind) {
			case NONE: org.eclipse.uml2.uml.AggregationKind.NONE_LITERAL
			case AGGREGATION: org.eclipse.uml2.uml.AggregationKind.SHARED_LITERAL
			case COMPOSITION: org.eclipse.uml2.uml.AggregationKind.COMPOSITE_LITERAL
		}
	}
	
	public static def convert(org.eclipse.uml2.uml.AggregationKind aggregationKind) {
		switch (aggregationKind) {
			case NONE_LITERAL: AggregationKind.NONE
			case SHARED_LITERAL: AggregationKind.AGGREGATION
			case COMPOSITE_LITERAL: AggregationKind.COMPOSITION
		}
	}
}
