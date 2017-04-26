package de.cooperateproject.modeling.textual.common.scoping;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;

public class AliasedScope extends AbstractScope {

    private final Collection<IEObjectDescription> cache = new LinkedHashSet<>();

    public AliasedScope(IScope parent, boolean ignoreCase) {
        super(parent, ignoreCase);
    }

    @Override
    protected Iterable<IEObjectDescription> getAllLocalElements() {
        if (cache.isEmpty()) {
            List<IEObjectDescription> elements = Lists.newArrayList(
                    Iterables.transform(getParent().getAllElements(), AliasedScope::createAliasedDescription));
            elements.sort(AliasedScope::compareSegmentLength);
            cache.addAll(elements);
        }
        return cache;
    }

    private static int compareSegmentLength(IEObjectDescription d1, IEObjectDescription d2) {
        return d1.getName().getSegmentCount() - d2.getName().getSegmentCount();
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