package de.cooperateproject.modeling.textual.cls.services;

import java.util.Collection;

import org.eclipse.emf.ecore.EReference;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateLinkingService;

public class ClsLinkingService extends CooperateLinkingService {

	private static final Collection<EReference> UNQUALIFIED_REFERENCES = Sets.newHashSet(ClsPackage.eINSTANCE.getCommentable_Comment());
	
	@Override
	protected Collection<EReference> getUnqualifiedNameReferences() {
		return UNQUALIFIED_REFERENCES;
	}
	
}
