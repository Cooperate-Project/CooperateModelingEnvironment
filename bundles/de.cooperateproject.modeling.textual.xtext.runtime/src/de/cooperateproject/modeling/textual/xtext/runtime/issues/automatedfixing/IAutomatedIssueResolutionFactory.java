package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Optional;

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

    public static class IssueLocator {
        private final EStructuralFeature feature;
        private final int index;
        private final EObject object;
        private final Optional<EObject> realObject;

        public IssueLocator(EStructuralFeature feature, EObject object) {
            this(feature, -1, object);
        }

        public IssueLocator(EStructuralFeature feature, int index, EObject object) {
            this(feature, index, object, null);
        }

        public IssueLocator(EStructuralFeature feature, int index, EObject object, EObject realObject) {
            super();
            this.feature = feature;
            this.index = index;
            this.object = object;
            this.realObject = Optional.ofNullable(realObject);
        }

        public EStructuralFeature getFeature() {
            return feature;
        }

        public int getIndex() {
            return index;
        }

        public EObject getObject() {
            return object;
        }

        public Optional<EObject> getRealObject() {
            return realObject;
        }

    }

    public IAutomatedIssueResolution create(EObject element) throws CreationException;

    public boolean hasIssue(EObject element);

    public boolean resolvePossible(EObject element);

    public EPackage getSupportedEPackage();

    public String getIssueID();

    public String getResolutionName(EObject element);

    public String getIssueDescription(EObject element);

    public IssueLocator getIssueFeature(EObject element);

}
