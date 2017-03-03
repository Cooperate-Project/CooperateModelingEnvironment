package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import org.eclipse.emf.ecore.EObject;

@FunctionalInterface
public interface IAutomatedIssueResolutionFactory<T extends EObject> {

    public static class CreationException extends Exception {

        private static final long serialVersionUID = -2909268061927156829L;

        public CreationException(String msg) {
            super(msg);
        }

    }

    public IAutomatedIssueResolution create(T element) throws CreationException;

}
