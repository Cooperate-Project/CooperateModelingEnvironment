package de.cooperateproject.modeling.textual.common.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;

public class CooperateImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

    protected IScope getLocalElementsScope(IScope parent, final EObject context, final EReference reference) {
        IScope newParentScope = new AliasedScope(parent, isIgnoreCase(reference));
        return super.getLocalElementsScope(newParentScope, context, reference);
    }

    @Override
    protected List<ImportNormalizer> getImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
        List<ImportNormalizer> resolvers = new ArrayList<>(super.getImportedNamespaceResolvers(context, ignoreCase));
        if (context instanceof NamedElement) {
            Optional.ofNullable(getQualifiedNameProvider().getFullyQualifiedName(context))
                    .map(qn -> String.format("%s.*", qn.toString()))
                    .ifPresent(fqn -> resolvers.add(createImportedNamespaceResolver(fqn, ignoreCase)));
        }
        return resolvers;
    }

}
