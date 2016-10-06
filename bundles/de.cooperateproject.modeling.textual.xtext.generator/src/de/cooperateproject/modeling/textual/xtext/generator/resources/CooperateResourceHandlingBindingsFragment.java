package de.cooperateproject.modeling.textual.xtext.generator.resources;

import java.util.Set;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Xtend2GeneratorFragment;

public class CooperateResourceHandlingBindingsFragment extends Xtend2GeneratorFragment {

	@Override
	public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		return new BindFactory().addTypeToType(
			  "org.eclipse.xtext.ui.editor.model.XtextDocument",
			  "de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateXtextDocument")
			.addTypeToType(
			  "org.eclipse.xtext.ui.editor.model.XtextDocumentProvider",
			  "de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextDocumentProvider")
			.addTypeToType(
			  "org.eclipse.xtext.ui.resource.IResourceSetProvider",
			  "org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider")
			.getBindings();
	}

	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		return new BindFactory().addTypeToType(
			  "org.eclipse.xtext.resource.XtextResourceSet",
			  "de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet")
			.addTypeToType(
			  "org.eclipse.xtext.scoping.IGlobalScopeProvider",
			  "de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider")
			.addTypeToType(
			  "de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder",
			  "de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder")
			.getBindings();
	}
	
}
