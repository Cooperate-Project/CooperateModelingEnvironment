package de.cooperateproject.modeling.textual.xtext.runtime.matching

import org.apache.commons.collections4.trie.PatriciaTrie
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class EMFEClassToClassMapper {
   val PatriciaTrie<EPackage> registeredPackages = new PatriciaTrie
   
   def initialize() {
       EPackage.Registry.INSTANCE.keySet.forEach[nsUri | 
           val package = EPackage.Registry.INSTANCE.getEPackage(nsUri)
           registeredPackages.put(package.class.name, package)
       ]
       
   }
   
   def EClass getEClass(Class<?> clazz) {
        registeredPackages.selectValue(clazz.package.name).getEClassifier(clazz.simpleName) as EClass
   } 
}