package de.cooperateproject.modeling.textual.xtext.runtime.validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractInjectableValidator;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.FeatureBasedDiagnostic;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
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
        Collection<IAutomatedIssueResolutionFactory> applicableFactories = registry
                .findFactories(Collections.singletonList(eClass.getEPackage()));
        for (IAutomatedIssueResolutionFactory factory : applicableFactories) {
            if (factory.hasIssue(eObject)) {
                int severity = factory.resolvePossible(eObject) ? Diagnostic.INFO : Diagnostic.ERROR;
                Diagnostic diagnostic = createDiagnostic(severity, factory.getIssueDescription(eObject), eObject,
                        factory.getIssueFeature(eObject), factory.getIssueID());
                diagnostics.add(diagnostic);
                newDiagnostics = true;
            }
        }
        return newDiagnostics;
    }

    protected Diagnostic createDiagnostic(int diagnosticSeverity, String message, EObject object,
            EStructuralFeature feature, String code) {
        Diagnostic result = new FeatureBasedDiagnostic(diagnosticSeverity, message, object, feature, -1, CheckType.FAST,
                code, new String[0]);
        return result;
    }

}
