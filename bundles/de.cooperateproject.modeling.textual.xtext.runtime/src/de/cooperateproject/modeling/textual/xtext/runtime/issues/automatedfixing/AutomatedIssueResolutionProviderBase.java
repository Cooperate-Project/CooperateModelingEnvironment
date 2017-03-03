package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory.CreationException;

public abstract class AutomatedIssueResolutionProviderBase implements IAutomatedIssueResolutionProvider {

    private static class IssueResolutionGroup implements IAutomatedIssueResolution {

        private Collection<IAutomatedIssueResolution> resolutions;

        public IssueResolutionGroup(Collection<IAutomatedIssueResolution> resolutions) {
            this.resolutions = resolutions;
        }

        @Override
        public boolean resolvePossible() {
            return resolutions.stream().anyMatch(IAutomatedIssueResolution::resolvePossible);
        }

        @Override
        public void resolve() {
            Optional<IAutomatedIssueResolution> resolution = resolutions.stream()
                    .filter(IAutomatedIssueResolution::resolvePossible).findFirst();
            if (resolution.isPresent()) {
                resolution.get().resolve();
            }
        }

        public static IssueResolutionGroup create(Collection<IAutomatedIssueResolution> resolutions) {
            return new IssueResolutionGroup(resolutions);
        }

    }

    @Override
    public Collection<IAutomatedIssueResolution> get(Resource resource, Collection<Issue> issues) {
        return issues.stream().map(i -> createResolutions(resource, i)).map(IssueResolutionGroup::create)
                .collect(Collectors.toSet());
    }

    private Collection<IAutomatedIssueResolution> createResolutions(Resource r, Issue issue) {
        Collection<IAutomatedIssueResolutionFactory<EObject>> resolutionFactories = findResolutionFactories(
                issue.getCode());
        EObject element = r.getEObject(issue.getUriToProblem().fragment());
        return resolutionFactories.stream().map(f -> createInstance(f, element)).filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toSet());
    }

    protected abstract Collection<IAutomatedIssueResolutionFactory<EObject>> findResolutionFactories(String issueCode);

    private static Optional<IAutomatedIssueResolution> createInstance(IAutomatedIssueResolutionFactory<EObject> factory,
            EObject element) {
        try {
            IAutomatedIssueResolution resolver = factory.create(element);
            return Optional.of(resolver);
        } catch (CreationException e) {
            return Optional.empty();
        }
    }

}
