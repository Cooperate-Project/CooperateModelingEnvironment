package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateSimpleLocalScopeProvider;

public class ClsCooperateSimpleScopeProvider extends CooperateSimpleLocalScopeProvider {

	@FunctionalInterface
	private interface EReferenceBasedNormalizerCreator {
		Collection<ImportNormalizer> createNormalizers(EObject context, EReference ref);
	}

	private static final NameSwitch NAME_SWITCH = new NameSwitch();
	private final Map<EReference, EReferenceBasedNormalizerCreator> normalizerCreators = createNormalizerCreators();

	@Override
	protected String getUnqualifiedName(EObject context) {
		return NAME_SWITCH.doSwitch(context);
	}

	@Override
	protected List<ImportNormalizer> getRootNormalizers(EObject rootObject) {
		Validate.isInstanceOf(ClassDiagram.class, rootObject);

		ClassDiagram root = (ClassDiagram) rootObject;
		return root.getPackageImports().stream().map(ClsCooperateSimpleScopeProvider::getPackageImportText)
				.filter(t -> t.isPresent()).map(t -> t.get()).map(ClsCooperateSimpleScopeProvider::createNormalizer)
				.collect(Collectors.toList());
	}

	private static Optional<String> getPackageImportText(PackageImport pgkImport) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(pgkImport,
				ClsPackage.eINSTANCE.getPackageImport_Package());
		if (!nodes.isEmpty()) {
			return Optional.fromNullable(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			Object result = pgkImport.eGet(ClsPackage.eINSTANCE.getPackageImport_Package(), false);
			if (result != null) {
				Package umlPackage = (Package) result;
				return Optional.of(umlPackage.getQualifiedName().replace(umlPackage.separator(), "."));
			}
		}
		return Optional.absent();
	}

	@Override
	protected Collection<? extends ImportNormalizer> getAdditionalImportNormalizers(EObject context,
			EReference reference) {
		EReferenceBasedNormalizerCreator creator = normalizerCreators.get(reference);
		if (creator == null) {
			return Collections.emptyList();
		}
		return creator.createNormalizers(context, reference);
	}

	private Map<EReference, EReferenceBasedNormalizerCreator> createNormalizerCreators() {
		Map<EReference, EReferenceBasedNormalizerCreator> result = Maps.newHashMap();

		result.put(ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_LEFT,
				this::handleAssociationPropertiesProperty);
		result.put(ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_RIGHT,
				this::handleAssociationPropertiesProperty);

		return result;
	}

	private Collection<ImportNormalizer> handleAssociationPropertiesProperty(EObject context, EReference ref) {
		Association association = ((AssociationProperties) context).getAssociation();
		EObject wantedUMLClassifier = null;
		if (ref == ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_LEFT) {
			wantedUMLClassifier = association.getRight().getType();
		} else if (ref == ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_RIGHT) {
			wantedUMLClassifier = association.getLeft().getType();
		}

		Collection<EObject> additionalContextObjects = Sets.newHashSet();
		EcoreUtil2.findCrossReferences(EcoreUtil.getRootContainer(context), Sets.newHashSet(wantedUMLClassifier),
				(referrer, referenced, reference,
						index) -> additionalContextObjects.add(ClsPackage.Literals.CLASSIFIER.isInstance(referrer)
								&& reference == ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT
										? referrer : null));
		additionalContextObjects.removeIf(o -> o == null);
		return additionalContextObjects.stream().map(this::getImportNormalizers).flatMap(o -> o.stream())
				.collect(Collectors.toSet());
	}

}
