package de.cooperateproject.modeling.textual.common.scoping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;

import com.google.common.base.Strings;
import com.google.common.collect.Streams;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.naming.QualifiedNameGenerator;

public class CooperateImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

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

    @Override
    protected ISelectable internalGetAllDescriptions(Resource resource) {
        Iterable<EObject> allContents = new Iterable<EObject>() {
            @Override
            public Iterator<EObject> iterator() {
                return EcoreUtil.getAllContents(resource, false);
            }
        };
        Iterable<IEObjectDescription> allDescriptions = Scopes.scopedElementsFor(allContents,
                this.getQualifiedNameProvider());

        Iterable<IEObjectDescription> allAliasedDescriptions = new Iterable<IEObjectDescription>() {
            @Override
            public Iterator<IEObjectDescription> iterator() {
                return Streams.stream(allDescriptions)
                        .map(CooperateImportedNamespaceAwareLocalScopeProvider::createAliasedDescription).iterator();
            }
        };

        return new MultimapBasedSelectable(allAliasedDescriptions);
    }

    private static IEObjectDescription createAliasedDescription(IEObjectDescription description) {
        if (!(description instanceof AliasedEObjectDescription)
                && description.getEObjectOrProxy() instanceof AliasedElement) {
            AliasedElement element = (AliasedElement) description.getEObjectOrProxy();
            String alias = element.getAlias();
            if (!Strings.isNullOrEmpty(alias)) {
                QualifiedName aliasedName = description.getQualifiedName().skipLast(1).append(alias);
                return new AliasedEObjectDescription(aliasedName, description);
            }
        }
        return description;
    }

}
