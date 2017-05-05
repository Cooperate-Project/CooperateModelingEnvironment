package de.cooperateproject.modeling.textual.xtext.runtime.ui.issues;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.model.edit.IssueModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolution;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

public abstract class CooperateQuickfixProvider extends DefaultQuickfixProvider {

    private static final Logger LOGGER = Logger.getLogger(CooperateQuickfixProvider.class);

    @Inject
    private Provider<IssueModificationContext> provider;

    @Inject
    private IAutomatedIssueResolutionFactoryRegistry registry;

    private final Set<EPackage> ePackages = new HashSet<>();

    public CooperateQuickfixProvider(Collection<EPackage> ePackages) {
        this.ePackages.addAll(ePackages);
    }

    private Collection<IAutomatedIssueResolutionFactory> findFactories(String issueId) {
        return registry.findFactories(ePackages, issueId);
    }

    @Override
    public List<IssueResolution> getResolutions(Issue issue) {
        List<IssueResolution> resolutions = new ArrayList<>(super.getResolutions(issue));
        Optional<EObject> element = getEObjectToBeFixedFromIssue(issue);
        if (element.isPresent()) {
            Collection<IAutomatedIssueResolutionFactory> issueResolutionFactories = findFactories(issue.getCode());
            IssueResolutionAcceptor issueResolutionAcceptor = getIssueResolutionAcceptorProvider().get();
            issueResolutionFactories.stream().filter(f -> f.resolvePossible(element.get()))
                    .forEach(f -> createIssueResolution(f, issue, element.get(), issueResolutionAcceptor));
            resolutions.addAll(issueResolutionAcceptor.getIssueResolutions());
        }
        return resolutions;
    }

    @Override
    protected Predicate<Method> getFixMethodPredicate(String issueCode) {
        return Predicates.or(super.getFixMethodPredicate(issueCode), new Predicate<Method>() {
            @Override
            public boolean apply(Method input) {
                SemanticFix annotation = input.getAnnotation(SemanticFix.class);
                boolean result = annotation != null && issueCode.equals(annotation.value())
                        && input.getParameterTypes().length == 3 && Void.TYPE == input.getReturnType()
                        && input.getParameterTypes()[0].isAssignableFrom(Issue.class)
                        && input.getParameterTypes()[1].isAssignableFrom(EObject.class)
                        && input.getParameterTypes()[2].isAssignableFrom(IssueResolutionAcceptor.class);
                return result;
            }
        });
    }

    @Override
    protected List<IssueResolution> getResolutions(Issue issue, List<Method> fixMethods) {
        List<Method> originalMethods = fixMethods.stream().filter(m -> m.getAnnotation(Fix.class) != null)
                .collect(Collectors.toList());
        List<IssueResolution> resolutions = new ArrayList<>(super.getResolutions(issue, originalMethods));

        Optional<EObject> element = getEObjectToBeFixedFromIssue(issue);
        if (!element.isPresent()) {
            return resolutions;
        }

        List<Method> semanticMethods = fixMethods.stream().filter(m -> m.getAnnotation(SemanticFix.class) != null)
                .collect(Collectors.toList());
        IssueResolutionAcceptor issueResolutionAcceptor = getIssueResolutionAcceptorProvider().get();
        for (Method fixMethod : semanticMethods) {
            try {
                fixMethod.setAccessible(true);
                fixMethod.invoke(this, issue, element, issueResolutionAcceptor);
            } catch (Exception e) {
                LOGGER.error("Error executing fix method", e);
            }
        }
        List<IssueResolution> semanticResolutions = issueResolutionAcceptor.getIssueResolutions();

        resolutions.addAll(semanticResolutions);
        return resolutions;
    }

    private void createIssueResolution(IAutomatedIssueResolutionFactory factory, Issue issue, EObject element,
            IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, factory.getResolutionName(element), factory.getIssueDescription(element), null,
                new ISemanticModification() {
                    @Override
                    public void apply(EObject ignoredElement, IModificationContext context) throws Exception {
                        IAutomatedIssueResolution resolution = factory.create(element);
                        if (resolution.resolvePossible()) {
                            resolution.resolve();
                            ((XtextResource) element.eResource()).relink();
                        }
                    }
                });
    }

    @Override
    public boolean hasResolutionFor(String issueCode) {
        return super.hasResolutionFor(issueCode) || !findFactories(issueCode).isEmpty();
    }

    private Optional<EObject> getEObjectToBeFixedFromIssue(Issue issue) {
        Optional<EObject> element = getRealEObjectFromIssue(issue);
        if (!element.isPresent()) {
            element = getEObjectFromIssue(issue);
        }
        return element;
    }

    private Optional<EObject> getRealEObjectFromIssue(Issue issue) {
        if (issue.getData() != null && issue.getData().length > 1
                && ICooperateAutomatedValidator.ISSUE_DATA_MARKER.equals(issue.getData()[0])) {
            URI realEObjectUri = URI.createURI(issue.getData()[1]);
            return getEObjectFromUri(realEObjectUri);
        }
        return Optional.empty();
    }

    private Optional<EObject> getEObjectFromIssue(Issue issue) {
        return getEObjectFromUri(issue.getUriToProblem());
    }

    private Optional<EObject> getEObjectFromUri(URI uri) {
        try {
            final EObject[] resultContainer = new EObject[] { null };
            IXtextDocument xtextDocument = provider.get().getXtextDocument(uri);
            xtextDocument.modify(new IUnitOfWork.Void<XtextResource>() {
                @Override
                public void process(XtextResource state) throws Exception {
                    resultContainer[0] = state.getEObject(uri.fragment());
                }
            });
            return Optional.ofNullable(resultContainer[0]);
        } catch (Exception e) {
            LOGGER.warn(e);
            return Optional.empty();
        }
    }

}
