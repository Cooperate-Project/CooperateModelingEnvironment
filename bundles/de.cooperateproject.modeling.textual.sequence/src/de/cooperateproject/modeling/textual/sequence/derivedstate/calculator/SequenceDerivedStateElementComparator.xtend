package de.cooperateproject.modeling.textual.sequence.derivedstate.calculator

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter
import java.util.Arrays
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

class SequenceDerivedStateElementComparator implements IDerivedStateComputerSorter {
    
    static val List<EClass> PRIORITY_ORDER = Arrays.asList(
        SequencePackage.eINSTANCE.sequenceDiagram,
        SequencePackage.eINSTANCE.actor,
        SequencePackage.eINSTANCE.actorClassifierMapping,
        SequencePackage.eINSTANCE.occurenceSpecification,
        SequencePackage.eINSTANCE.message
    )
    
    static def getPrioIndex(EObject arg) {
        PRIORITY_ORDER.fold((null as EClass)->Integer.MIN_VALUE->0, [msc, e |
            if (e.isInstance(arg) && (msc.key.key === null || msc.key.key.isSuperTypeOf(e))) {
                e->msc.value->(msc.value+1)
            } else msc.key->(msc.value+1)
        ]).key.value
    }
         
    override compare(EObject arg0, EObject arg1) {
        val res = getPrioIndex(arg1) - getPrioIndex(arg0)
        
        return if (res == 0) res else -1 * res / Math.abs(res)
    }
    
}