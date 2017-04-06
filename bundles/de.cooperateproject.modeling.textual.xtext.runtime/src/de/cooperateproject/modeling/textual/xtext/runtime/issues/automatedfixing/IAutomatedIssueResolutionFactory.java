package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IAutomatedIssueResolutionFactory {

    public static class CreationException extends Exception {

        private static final long serialVersionUID = -2909268061927156829L;

        public CreationException(String msg) {
            super(msg);
        }

    }

    public IAutomatedIssueResolution create(EObject element) throws CreationException;

    public boolean hasIssue(EObject element);

    public boolean resolvePossible(EObject element);

    public EPackage getSupportedEPackage();

    public String getIssueID();

    public String getResolutionName(EObject element);

    public String getIssueDescription(EObject element);

    public EStructuralFeature getIssueFeature(EObject element);

}
