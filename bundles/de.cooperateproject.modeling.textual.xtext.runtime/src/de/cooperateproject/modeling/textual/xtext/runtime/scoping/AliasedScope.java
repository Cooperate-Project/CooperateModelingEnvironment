package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;

public class AliasedScope extends AbstractScope {

    private final Collection<IEObjectDescription> cache = new LinkedHashSet<>();

    public AliasedScope(IScope parent, boolean ignoreCase) {
        super(parent, ignoreCase);
    }

    @Override
    protected Iterable<IEObjectDescription> getAllLocalElements() {
        if (cache.isEmpty()) {
            Iterables.addAll(cache,
                    Iterables.transform(getParent().getAllElements(), AliasedScope::createAliasedDescription));
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