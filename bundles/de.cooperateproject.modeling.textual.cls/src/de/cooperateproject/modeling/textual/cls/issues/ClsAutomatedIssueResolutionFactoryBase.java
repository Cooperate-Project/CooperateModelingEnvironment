package de.cooperateproject.modeling.textual.cls.issues;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryBase;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker;

public abstract class ClsAutomatedIssueResolutionFactoryBase<T extends EObject>
        extends AutomatedIssueResolutionFactoryBase<T> {

    public ClsAutomatedIssueResolutionFactoryBase(String issueId, IResolvableChecker<T> checker,
            Class<T> acceptedType) {
        super(issueId, checker, acceptedType);
    }

    @Override
    public EPackage getSupportedEPackage() {
        return ClsPackage.eINSTANCE;
    }
}
