package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory.CreationException;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

public abstract class AutomatedIssueResolutionProviderBase implements IAutomatedIssueResolutionProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutomatedIssueResolutionProviderBase.class);

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

    @Override
    public boolean hasResolution(Issue issue) {
        return !findResolutionFactories(issue.getCode()).isEmpty();
    }

    private Collection<IAutomatedIssueResolution> createResolutions(Resource r, Issue issue) {
        Optional<EObject> element = findEObjectToFix(issue, r);
        if (!element.isPresent()) {
            return Collections.emptyList();
        }
        Collection<IAutomatedIssueResolutionFactory> resolutionFactories = findResolutionFactories(issue.getCode());
        return resolutionFactories.stream().map(f -> createInstance(f, element.get())).filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toSet());
    }

    protected abstract Collection<IAutomatedIssueResolutionFactory> findResolutionFactories(String issueCode);

    private static Optional<IAutomatedIssueResolution> createInstance(IAutomatedIssueResolutionFactory factory,
            EObject element) {
        try {
            IAutomatedIssueResolution resolver = factory.create(element);
            return Optional.ofNullable(resolver);
        } catch (CreationException e) {
            LOGGER.error("Error during creating issue instance", e);
            return Optional.empty();
        }
    }

    private static Optional<EObject> findEObjectToFix(Issue issue, Resource r) {
        if (issue.getData() != null && issue.getData().length > 1
                && ICooperateAutomatedValidator.ISSUE_DATA_MARKER.equals(issue.getData()[0])) {
            URI realEObjectUri = URI.createURI(issue.getData()[1]);
            return findEObject(realEObjectUri, r);
        }
        return findEObject(issue.getUriToProblem(), r);

    }

    private static Optional<EObject> findEObject(URI uri, Resource r) {
        return Optional.ofNullable(r.getEObject(uri.fragment()));
    }

}
