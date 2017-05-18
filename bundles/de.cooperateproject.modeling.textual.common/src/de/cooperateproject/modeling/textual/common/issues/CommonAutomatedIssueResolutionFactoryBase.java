package de.cooperateproject.modeling.textual.common.issues;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryBase;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker;

public abstract class CommonAutomatedIssueResolutionFactoryBase<T extends EObject>
        extends AutomatedIssueResolutionFactoryBase<T> {

    public CommonAutomatedIssueResolutionFactoryBase(String issueId, IResolvableChecker<T> checker,
            Class<T> acceptedType) {
        super(issueId, checker, acceptedType);
    }

    @Override
    public EPackage getSupportedEPackage() {
        return TextualCommonsPackage.eINSTANCE;
    }
}
