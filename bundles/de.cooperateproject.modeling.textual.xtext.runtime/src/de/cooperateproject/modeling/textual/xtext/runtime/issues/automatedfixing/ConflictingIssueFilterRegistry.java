package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

@Singleton
public class ConflictingIssueFilterRegistry implements IConflictingIssueFilterRegistry {

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.modeling.textual.xtext.runtime.unresolvableissuefilters";
    private static final String EXTENSION_POINT_ATTRIBUTE = "class";

    private final Map<EPackage, Collection<IConflictingIssueFilter>> filters = new HashMap<>();

    @Inject
    private void initFilters(Injector injector) {
        List<IConflictingIssueFilter> unstructuredFilters = new ArrayList<>(ExtensionPointHelper
                .getExtensions(EXTENSION_POINT_ID, EXTENSION_POINT_ATTRIBUTE, IConflictingIssueFilter.class));
        unstructuredFilters.forEach(injector::injectMembers);

        Collections.sort(unstructuredFilters, (f1, f2) -> f1.getPriority() - f2.getPriority());

        for (IConflictingIssueFilter filter : unstructuredFilters) {
            filters.putIfAbsent(filter.getSupportedEPackage(), new ArrayList<>());
            Collection<IConflictingIssueFilter> issueFilters = filters.get(filter.getSupportedEPackage());
            issueFilters.add(filter);
        }
    }

    @Override
    public Collection<IConflictingIssueFilter> findFilters(Collection<EPackage> ePackages) {
        return ePackages.stream().filter(filters::containsKey).map(filters::get).filter(Objects::nonNull)
                .flatMap(Collection::stream).filter(IConflictingIssueFilter.class::isInstance)
                .map(IConflictingIssueFilter.class::cast).distinct().collect(Collectors.toList());
    }

}
