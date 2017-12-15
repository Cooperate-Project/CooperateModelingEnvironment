package de.cooperateproject.modeling.textual.xtext.generator.derivedstate

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

import static org.eclipse.xtext.xtext.generator.model.TypeReference.*

class DerivedStateElementComparatorGenerator {
		
	def create(JavaFileAccess jva, String simpleName) {
		jva.content = '''		
			public class «simpleName» implements «typeRef(IDerivedStateComputerSorter)» {
			
			    @Override
			    public int compare(«typeRef(EObject)» o1, «typeRef(EObject)» o2) {
			        return 0;
			    }
			
			}
		'''	
	}
}
