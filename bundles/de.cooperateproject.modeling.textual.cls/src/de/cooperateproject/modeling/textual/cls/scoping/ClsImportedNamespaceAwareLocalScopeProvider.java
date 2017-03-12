package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;

public class ClsImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

    @Override
    protected List<ImportNormalizer> getImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
        List<ImportNormalizer> resolvers = new ArrayList<>(super.getImportedNamespaceResolvers(context, ignoreCase));
        if (context instanceof NamedElement) {
            QualifiedName qualifiedName = QualifiedNameGenerator.getQualifiedName((NamedElement) context);
            String importString = String.format("%s.*", qualifiedName.toString());
            resolvers.add(createImportedNamespaceResolver(importString, ignoreCase));
        }
        return resolvers;
    }

}
