package de.cooperateproject.modeling.textual.sequence.derivedstate.calculator

import de.cooperateproject.modeling.textual.sequence.intermediate.IntermediateModelTransformation
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase
import java.util.Collections

@Applicability(applicabilities=CALCULATION)
class SequenceIntermediateModelCalculator extends AtomicDerivedStateProcessorBase<SequenceDiagram> {
    
    new() {
        super(SequenceDiagram)
    }
    
    override protected applyTyped(SequenceDiagram object) {
        val sequenceResource = object.eResource
        val intURI = object.eResource?.URI.trimFileExtension.appendFileExtension("sequenceintermediate")
        if (intURI === null || !sequenceResource.resourceSet.URIConverter.exists(intURI, Collections.emptyMap)) return;
        
        val intermediateResource = sequenceResource.resourceSet?.getResource(object.eResource.URI.trimFileExtension.appendFileExtension("sequenceintermediate"), true);
        
        if (intermediateResource === null) return;
        
        val transformation = new IntermediateModelTransformation(object, intermediateResource)        
        val res = transformation.intermediateModel
    }
    
    
}