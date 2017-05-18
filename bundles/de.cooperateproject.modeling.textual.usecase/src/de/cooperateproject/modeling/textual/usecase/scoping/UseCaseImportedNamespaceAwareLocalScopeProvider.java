package de.cooperateproject.modeling.textual.usecase.scoping;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.common.scoping.CooperateImportedNamespaceAwareLocalScopeProvider;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;

public class UseCaseImportedNamespaceAwareLocalScopeProvider extends CooperateImportedNamespaceAwareLocalScopeProvider {

    @Override
    protected List<ImportNormalizer> getImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
        List<ImportNormalizer> originalResolvers = super.getImportedNamespaceResolvers(context, ignoreCase);
        if (context instanceof RootPackage) {
            RootPackage pkg = (RootPackage) context;
            String rootPackageName = pkg.getName();
            if (!Strings.isNullOrEmpty(rootPackageName)) {
                List<ImportNormalizer> implicitNamespaceResolvers = pkg.getSystems().stream().map(s -> s.getName())
                        .filter(n -> !Strings.isNullOrEmpty(n)).map(n -> String.format("%s.%s.*", rootPackageName, n))
                        .map(n -> createImportedNamespaceResolver(n, ignoreCase)).collect(Collectors.toList());
                return Lists.newArrayList(Iterables.concat(originalResolvers, implicitNamespaceResolvers));
            }
        }
        return originalResolvers;
    }

}
