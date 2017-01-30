package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicate;

public interface IGlobalScopeTypeQueryProvider {

    public IScope queryScope(Resource resource, boolean ignoreCase, EClass type,
            Predicate<IEObjectDescription> predicate);

}
