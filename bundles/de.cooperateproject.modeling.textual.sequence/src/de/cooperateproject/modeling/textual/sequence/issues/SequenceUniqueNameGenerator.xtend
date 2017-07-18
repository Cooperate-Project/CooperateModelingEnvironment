package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.CreateMessage
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import java.util.Optional
import java.util.concurrent.atomic.AtomicBoolean
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

class SequenceUniqueNameGenerator {
    
    private static def dispatch String getBaseName(EObject element) {
        switch (element) {
            case StandardMessage: "msg"
            case ResponseMessage: "rsp"
            case CreateMessage: "create"
            default: element.class.name  
        }
    }
    
    private static def dispatch String getBaseName(NamedElement element) {
        if (!element.name.nullOrEmpty) {
            element.name.aliasify
        } else _getBaseName(element as NamedElement)
    }
    
    private static def dispatch String getBaseName(AliasedElement element) {
        if (!element.alias.nullOrEmpty) {
            element.alias    
        } else _getBaseName(element as NamedElement)
    }
    
    private static def dispatch String getBaseName(CombinedFragment element) {
        if (!element.alias.nullOrEmpty) {
            element.alias
        } else element.interactionOperatorKind.getName
    }
    
    private static def dispatch String getBaseName(OrderedFragmentContainer element) {
        val container = element.eContainer
        if (container instanceof AliasedElement) {
            container.ensureUniqueIdentification
            return '''«container.alias»_op'''
        }
        return _getBaseName(element as EObject)
    }
    
    public static def void ensureUniqueIdentification(AliasedElement element) {
        if (!(element.hasLocallyUniqueName && element.name.nameIsValidId) &&
         !element.hasUniqueAlias) element.generateUniqueAlias
    }
    
    private static def boolean hasLocallyUniqueName(NamedElement element) {
        (!element.name.nullOrEmpty) && element.eContainer.eContents
            .filter(NamedElement).filter[name == element.name].forall[it == element]
    }
    
    private static def boolean hasUniqueAlias(AliasedElement element) {
        (!element.alias.nullOrEmpty) && EcoreUtil.getRootContainer(element)
           .eAllContents.filter(AliasedElement).filter[alias == element.alias].forall[it == element]
    }
    
    private static def generateUniqueAlias(AliasedElement element) {
        val name = element.baseName
        var counter = 0
        element.alias = name
        while (!element.hasUniqueAlias) {
            element.alias = '''«name»«counter++»'''
        }
    }
    
    private static def boolean nameIsValidId(String name) {
        val iter = name.toCharArray.iterator
        
        Optional.ofNullable(iter.head).map([c | ALLOWED_FIRST_CHARS.indexOf(c) > -1]).orElse(false)
        && iter.forall[c | ALLOWED_CHARS.indexOf(c) > -1]
    }
    
    private static val ALLOWED_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_"
    private static val ALLOWED_FIRST_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_"
    private static def String aliasify(String name) {
        val res = new StringBuilder
        val capitalize = new AtomicBoolean(false)
        val nameIter = name.toCharArray.iterator
        
        Optional.ofNullable(nameIter.dropWhile[c | ALLOWED_FIRST_CHARS.indexOf(c) == -1].head)
           .ifPresent([res.append(it)])
           
        nameIter.forEach[c |
            if (c == ' ') capitalize.set(true)
            else if (ALLOWED_CHARS.indexOf(c) > -1) {
                res.append(if (capitalize.get) Character.toUpperCase(c) else c)
                capitalize.set(false);
            }
        ]
        
        res.toString    
    }
}