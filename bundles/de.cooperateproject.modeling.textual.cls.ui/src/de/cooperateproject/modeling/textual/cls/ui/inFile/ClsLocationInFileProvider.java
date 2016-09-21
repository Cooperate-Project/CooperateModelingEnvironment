package de.cooperateproject.modeling.textual.cls.ui.inFile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;

public class ClsLocationInFileProvider extends DefaultLocationInFileProvider {
	
	@Override
	protected EStructuralFeature getIdentifierFeature(EObject obj) {
		if (obj instanceof UMLReferencingElement<?>) {
			return ClsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement();
		} else if (obj instanceof PackageImport) {
			return ClsPackage.eINSTANCE.getPackageImport_ReferencedElement();
		}
		return super.getIdentifierFeature(obj);
	}
}
