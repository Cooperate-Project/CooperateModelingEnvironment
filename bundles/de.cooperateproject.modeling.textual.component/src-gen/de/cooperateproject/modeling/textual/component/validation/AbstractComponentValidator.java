/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.component.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractComponentValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.cooperateproject.de/modeling/textual/component/Component"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.cooperateproject.de/modeling/textual/commons"));
		return result;
	}
	
}
