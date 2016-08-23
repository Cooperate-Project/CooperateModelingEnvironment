package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Strings;

public abstract class CooperateLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		if (getUnqualifiedNameReferences().contains(ref)) {
			final String crossRefString = getCrossRefNodeAsString(node);
			if (!Strings.isNullOrEmpty(crossRefString)) {
				final IScope scope = getScope(context, ref);
				QualifiedName qualifiedLinkName =  QualifiedName.create(crossRefString);
				IEObjectDescription eObjectDescription = scope.getSingleElement(qualifiedLinkName);
				if (eObjectDescription != null) {
					return Collections.singletonList(eObjectDescription.getEObjectOrProxy());					
				}
			}
		}
		return super.getLinkedObjects(context, ref, node);
	}
	
	protected abstract Collection<EReference> getUnqualifiedNameReferences();
	
}
