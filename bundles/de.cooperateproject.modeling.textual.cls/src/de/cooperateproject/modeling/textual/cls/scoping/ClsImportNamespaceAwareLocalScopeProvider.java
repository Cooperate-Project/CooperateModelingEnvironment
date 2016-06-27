package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateImportNamespaceAwareLocalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.QualifiedNameOrString;

public class ClsImportNamespaceAwareLocalScopeProvider
		extends CooperateImportNamespaceAwareLocalScopeProvider<PackageImport> {

	public ClsImportNamespaceAwareLocalScopeProvider() {
		super(ClsPackage.Literals.PACKAGE_IMPORT__PACKAGE);
	}

	@Override
	protected Iterable<QualifiedNameOrString> getInferredImportedNamespace(EObject object) {
		if (!(object instanceof UMLReferencingElement<?>)) {
			return Lists.newArrayList();
		}

		@SuppressWarnings("unchecked")
		UMLReferencingElement<NamedElement> typedElement = (UMLReferencingElement<NamedElement>) object;
		List<UMLReferencingElement<NamedElement>> pathToRoot = getContainmentPath(typedElement);

		List<String> nameParts = Lists.newArrayList();

		for (UMLReferencingElement<NamedElement> parent : pathToRoot) {
			Optional<QualifiedNameOrString> namePartOptional = getNameOfContextFeature(parent,
					ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
			if (namePartOptional.isPresent()) {
				QualifiedNameOrString namePart = namePartOptional.get();
				if (namePart.isQualified()) {
					nameParts.addAll(namePart.getQualifiedName().getSegments());
					return Arrays.asList(new QualifiedNameOrString(QualifiedName.create(nameParts)));
				} else {
					nameParts.add(namePart.getName());
				}
			}

		}

		QualifiedName estimatedQualifiedName = QualifiedName.create(nameParts);
		return Arrays.asList(new QualifiedNameOrString(estimatedQualifiedName.toString()));
	}

	private List<UMLReferencingElement<NamedElement>> getContainmentPath(UMLReferencingElement<NamedElement> start) {
		List<UMLReferencingElement<NamedElement>> parents = Lists.newArrayList();
		Iterables.addAll(parents, Iterables.filter(EcoreUtil2.getAllContainers(start), UMLReferencingElement.class));
		parents.add(start);
		return Lists.newArrayList(parents);
	}

}
