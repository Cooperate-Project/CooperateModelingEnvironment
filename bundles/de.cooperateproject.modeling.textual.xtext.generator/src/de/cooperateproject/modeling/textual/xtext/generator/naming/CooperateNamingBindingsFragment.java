package de.cooperateproject.modeling.textual.xtext.generator.naming;

import java.util.Set;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Xtend2GeneratorFragment;

public class CooperateNamingBindingsFragment extends Xtend2GeneratorFragment {

	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		return new BindFactory().addTypeToType(
			  "org.eclipse.xtext.naming.IQualifiedNameProvider",
			  "de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider")
			.getBindings();
	}
	
}
