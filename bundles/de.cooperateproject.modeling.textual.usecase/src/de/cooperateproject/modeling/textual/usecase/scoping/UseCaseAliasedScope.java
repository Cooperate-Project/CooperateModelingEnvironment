package de.cooperateproject.modeling.textual.usecase.scoping;

import java.util.Set;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.usecase.usecase.AliasedElement;

public class UseCaseAliasedScope extends AbstractScope {

    private final Set<IEObjectDescription> cache = Sets.newHashSet();

    protected UseCaseAliasedScope(IScope parent, boolean ignoreCase) {
        super(parent, ignoreCase);
    }

    @Override
    protected Iterable<IEObjectDescription> getAllLocalElements() {
        if (cache.isEmpty()) {
            Iterables.addAll(cache,
                    Iterables.transform(getParent().getAllElements(), UseCaseAliasedScope::createAliasedDescription));
        }
        return cache;
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
