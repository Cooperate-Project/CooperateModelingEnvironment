package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;
import net.winklerweb.cdoxtext.runtime.IFeatureFilter;

public class DefaultFeatureFilter extends FeatureFilter implements IFeatureFilter {

    @Inject
    private ITransientStatusProvider transientStatusProvider;

    @Override
    protected boolean isIgnoredReference(Match match, EReference reference) {
        return super.isIgnoredReference(match, reference) && !shallNotBeIgnored(reference);
    }

    @Override
    protected boolean isIgnoredAttribute(EAttribute attribute) {
        return super.isIgnoredAttribute(attribute) && !shallNotBeIgnored(attribute);
    }

    private boolean shallNotBeIgnored(EStructuralFeature feature) {
        return transientStatusProvider.isFeatureConsideredNonTransient(feature);
    }
}
