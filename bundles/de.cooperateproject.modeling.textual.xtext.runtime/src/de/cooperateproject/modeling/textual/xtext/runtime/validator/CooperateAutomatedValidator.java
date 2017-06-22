package de.cooperateproject.modeling.textual.xtext.runtime.validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractInjectableValidator;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.FeatureBasedDiagnostic;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory.IssueLocator;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;

public class CooperateAutomatedValidator extends AbstractInjectableValidator implements ICooperateAutomatedValidator {

    @Inject
    private IAutomatedIssueResolutionFactoryRegistry registry;

    @Override
    public void register(EValidatorRegistrar registrar) {
        return;
    }

    @Inject
    public void registerAgain(EValidatorRegistrar registrar) {
        super.register(registrar);
    }

    @Override
    protected List<EPackage> getEPackages() {
        return new ArrayList<>(registry.coveredPackages());
    }

    @Override
    protected boolean internalValidate(EClass eClass, EObject eObject, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        boolean newDiagnostics = false;
        Set<EPackage> relevantPackages = eClass.getEAllSuperTypes().stream().map(EClassifier::getEPackage)
                .collect(Collectors.toSet());
        relevantPackages.add(eClass.getEPackage());
        Collection<IAutomatedIssueResolutionFactory> applicableFactories = registry
                .findFactories(Collections.unmodifiableCollection(relevantPackages));
        for (IAutomatedIssueResolutionFactory factory : applicableFactories) {
            if (factory.hasIssue(eObject)) {
                int severity = factory.resolvePossible(eObject) ? Diagnostic.INFO : Diagnostic.ERROR;
                IssueLocator locator = factory.getIssueFeature(eObject);
                Diagnostic diagnostic = createDiagnostic(severity, factory.getIssueDescription(eObject), locator,
                        factory.getIssueID());
                diagnostics.add(diagnostic);
                newDiagnostics = true;
            }
        }
        return newDiagnostics;
    }

    protected Diagnostic createDiagnostic(int diagnosticSeverity, String message, IssueLocator locator, String code) {
        String[] data = new String[0];
        if (locator.getRealObject().isPresent()) {
            EObject realEObject = locator.getRealObject().get();
            URI realEObjectUri = realEObject.eResource().getURI()
                    .appendFragment(realEObject.eResource().getURIFragment(realEObject));
            data = new String[] { ISSUE_DATA_MARKER, realEObjectUri.toString() };
        }
        FeatureBasedDiagnostic diagnostic = new FeatureBasedDiagnostic(diagnosticSeverity, message, locator.getObject(),
                locator.getFeature(), locator.getIndex(), CheckType.FAST, code, data);
        return diagnostic;
    }

}
