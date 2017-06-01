package de.cooperateproject.modeling.textual.sequence.scoping

import com.google.common.collect.Iterables
import com.google.common.collect.Lists
import de.cooperateproject.modeling.textual.common.scoping.CooperateImportedNamespaceAwareLocalScopeProvider
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.impl.ImportNormalizer

class SequenceDiagramImportedNamespaceAwareLocalScopeProvider extends CooperateImportedNamespaceAwareLocalScopeProvider {
    
    override protected getImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
        val originalResolvers = super.getImportedNamespaceResolvers(context, ignoreCase)
        if (context instanceof SequenceDiagram) {    
            val List<ImportNormalizer> implicitNamespaceResolvers = context.eAllContents
                    .filter[it instanceof OrderedFragmentContainer].map[qualifiedNameProvider.getFullyQualifiedName(it)]
                    .map[doCreateImportNormalizer(it, true, ignoreCase)].toList;
            return Lists.newArrayList(Iterables.concat(originalResolvers, implicitNamespaceResolvers));
        }
        return originalResolvers
    }
}