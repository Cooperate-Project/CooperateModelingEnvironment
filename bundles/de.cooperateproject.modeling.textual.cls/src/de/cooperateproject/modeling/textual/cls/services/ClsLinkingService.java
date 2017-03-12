package de.cooperateproject.modeling.textual.cls.services;

import java.util.Collection;

import org.eclipse.emf.ecore.EReference;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateLinkingService;

public class ClsLinkingService extends CooperateLinkingService {

    private static final Collection<EReference> UNQUALIFIED_REFERENCES = Sets
            .newHashSet(TextualCommonsPackage.eINSTANCE.getCommentable_Comments());

    @Override
    protected Collection<EReference> getUnqualifiedNameReferences() {
        return UNQUALIFIED_REFERENCES;
    }

}
