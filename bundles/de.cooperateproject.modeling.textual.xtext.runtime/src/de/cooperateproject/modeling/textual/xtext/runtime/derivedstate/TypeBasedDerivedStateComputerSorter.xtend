package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate

import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

class TypeBasedDerivedStateComputerSorter implements de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter {

	val List<EClass> priorityOrder

	new(List<EClass> priorityOrder) {
		this.priorityOrder = priorityOrder;
	}

	protected def getPrioIndex(EObject arg) {
		priorityOrder.fold((null as EClass) -> Integer.MAX_VALUE -> 0, [ msc, e |
			if (e.isInstance(arg) && (msc.key.key === null || msc.key.key.isSuperTypeOf(e))) {
				e -> msc.value -> (msc.value + 1)
			} else
				msc.key -> (msc.value + 1)
		]).key.value
	}

	override compare(EObject arg0, EObject arg1) {
		val res = getPrioIndex(arg1) - getPrioIndex(arg0)

		return if(res == 0) res else -1 * res / Math.abs(res)
	}

}
