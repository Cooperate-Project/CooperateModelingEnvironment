package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;

public class ClassTextualPostProcessor extends ContentIteratingPostProcessor {

	public ClassTextualPostProcessor(int priority) {
		super(priority, mappedTargets -> new PostProcessor(mappedTargets));
	}
	
	private static class PostProcessor extends ClsSwitch<Boolean> {

		private final Set<Object> mappedTargets;
		
		public PostProcessor(Set<Object> mappedTargets) {
			this.mappedTargets = mappedTargets;
		}

		@Override
		public Boolean defaultCase(EObject object) {
			return true;
		}

		@Override
		public <T extends NamedElement> Boolean caseNamedElement(
				de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> object) {
			if (!mappedTargets.contains(object)) {
				EcoreUtil.delete(object);
			}
			return true;
		}
		
	}

}
