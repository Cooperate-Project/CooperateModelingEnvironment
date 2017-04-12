package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

@Singleton
public class AutomatedIssueResolutionFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.modeling.textual.xtext.runtime.automatedissueresolutionfactories";
    private static final String EXTENSION_POINT_ATTRIBUTE = "class";

    private final Map<EPackage, Map<String, Collection<IAutomatedIssueResolutionFactory>>> factories = new HashMap<>();

    @Inject
    private void initFactories(Injector injector) {
        Collection<IAutomatedIssueResolutionFactory> unstructuredFactories = Collections
                .unmodifiableCollection(ExtensionPointHelper.getExtensions(EXTENSION_POINT_ID,
                        EXTENSION_POINT_ATTRIBUTE, IAutomatedIssueResolutionFactory.class));
        unstructuredFactories.forEach(injector::injectMembers);

        for (IAutomatedIssueResolutionFactory factory : unstructuredFactories) {
            factories.putIfAbsent(factory.getSupportedEPackage(), new HashMap<>());
            Map<String, Collection<IAutomatedIssueResolutionFactory>> packageFactories = factories
                    .get(factory.getSupportedEPackage());
            packageFactories.putIfAbsent(factory.getIssueID(), new ArrayList<>());
            Collection<IAutomatedIssueResolutionFactory> issueFactories = packageFactories.get(factory.getIssueID());
            issueFactories.add(factory);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.
     * IAutomatedIssueResolutionFactoryRegistry#findFactories(org.eclipse.emf.ecore.EPackage, java.lang.String)
     */
    @Override
    public Collection<IAutomatedIssueResolutionFactory> findFactories(EPackage ePackage, String issueId) {
        Map<String, Collection<IAutomatedIssueResolutionFactory>> packetFactories = findPacketFactories(ePackage);
        return packetFactories.getOrDefault(issueId, Collections.emptyList());
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.
     * IAutomatedIssueResolutionFactoryRegistry#findFactories(org.eclipse.emf.ecore.EPackage)
     */
    @Override
    public Collection<IAutomatedIssueResolutionFactory> findFactories(EPackage ePackage) {
        Map<String, Collection<IAutomatedIssueResolutionFactory>> packetFactories = findPacketFactories(ePackage);
        return packetFactories.values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }

    private Map<String, Collection<IAutomatedIssueResolutionFactory>> findPacketFactories(EPackage ePackage) {
        return factories.getOrDefault(ePackage, Collections.emptyMap());
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.
     * IAutomatedIssueResolutionFactoryRegistry#coveredPackages()
     */
    @Override
    public Collection<EPackage> coveredPackages() {
        return factories.keySet();
    }

    @Override
    public Collection<String> getAvailableIssueCodes() {
        return Collections.unmodifiableCollection(
                factories.values().stream().map(Map::keySet).flatMap(Collection::stream).collect(Collectors.toSet()));
    }

}
