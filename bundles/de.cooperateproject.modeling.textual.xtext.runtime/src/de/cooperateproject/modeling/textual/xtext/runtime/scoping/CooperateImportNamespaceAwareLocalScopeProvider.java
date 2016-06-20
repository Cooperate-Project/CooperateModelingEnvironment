package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public abstract class CooperateImportNamespaceAwareLocalScopeProvider<T extends EObject>
		extends ImportedNamespaceAwareLocalScopeProvider {

	private static final String QUALIFIED_NAME_SEPARATOR = ".";
	private static final String WILDCARD_POSTFIX = ".*";
	private final EStructuralFeature packageFeature;

	protected CooperateImportNamespaceAwareLocalScopeProvider(EStructuralFeature packageFeature) {
		this.packageFeature = packageFeature;
	}

	@Override
	protected String getImportedNamespace(EObject object) {
		if (object.eClass().getEStructuralFeatures().contains(packageFeature)) {
		//if (elementClazz.isAssignableFrom(object.getClass())) {
			Optional<String> importedNamespace = makeWildcard(determineFeatureText(object, packageFeature));
			if (importedNamespace.isPresent()) {
				return importedNamespace.get();
			}
		}

		return super.getImportedNamespace(object);
	}

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, boolean ignoreCase) {
		List<ImportNormalizer> normalizers = super.internalGetImportedNamespaceResolvers(context, ignoreCase);

		/**
		 * Always try to determine the explicitly imported namespaces and
		 * construct normalizers if not already done.
		 */
		if (normalizers.isEmpty()) {
			EObject rootElement = EcoreUtil.getRootContainer(context, false);
			if (rootElement == context) {
				return normalizers;
			}
			normalizers = internalGetImportedNamespaceResolvers(rootElement, ignoreCase);
		}

		/**
		 * Construct implicit namespace imports.
		 */
		List<ImportNormalizer> superNormalizers = Lists.newArrayList(normalizers);
		Iterable<QualifiedName> qualifiedContextNames = getInferredImportedNamespace(context);
		for (QualifiedName qualifiedContextName : qualifiedContextNames) {
			normalizers.addAll(
					createImplicitImportedNamespaceNormalizers(qualifiedContextName, superNormalizers, ignoreCase));
		}

		return normalizers;
	}

	private Collection<ImportNormalizer> createImplicitImportedNamespaceNormalizers(QualifiedName qualifiedName,
			Iterable<ImportNormalizer> normalizers, boolean ignoreCase) {
		return Lists.newArrayList(normalizers).stream().map(n -> n.resolve(qualifiedName)).filter(n -> n != null)
				.map(n -> createImportedNamespaceResolver(n, ignoreCase, true)).collect(Collectors.toList());
	}

	private ImportNormalizer createImportedNamespaceResolver(QualifiedName qualifiedName, boolean ignoreCase,
			boolean makeWildcard) {
		String name = qualifiedName.toString();
		if (makeWildcard) {
			Optional<String> wildcardedName = makeWildcard(name);
			if (wildcardedName.isPresent()) {
				name = wildcardedName.get();
			}
		}
		return createImportedNamespaceResolver(name, ignoreCase);
	}

	protected abstract Iterable<QualifiedName> getInferredImportedNamespace(EObject object);

	protected static Optional<QualifiedNameOrString> getNameOfContextFeature(EObject context,
			EStructuralFeature feature) {
		Optional<String> featureTextOptional = determineFeatureText(context, feature);
		if (!featureTextOptional.isPresent()) {
			return Optional.absent();
		}

		String featureText = featureTextOptional.get();
		String[] featureTextSegments = featureText.split(QUALIFIED_NAME_SEPARATOR);
		if (featureTextSegments.length > 1) {
			return Optional.of(new QualifiedNameOrString(QualifiedName.create(featureTextSegments)));
		} else {
			return Optional.of(new QualifiedNameOrString(featureText));
		}
	}

	private static Optional<String> determineFeatureText(EObject context, EStructuralFeature feature) {
		/**
		 * We must not access the referenced package directly to prevent cyclic
		 * resolution of lazy links. Instead, we only use the referenced package
		 * if it has already been resolved. Usually, this method is called again
		 * if the resolution is done.
		 */
		Object result = context.eGet(feature, false);
		if (!(result instanceof EObject)) {
			return Optional.absent();
		}
		if (!((EObject) result).eIsProxy()) {
			QualifiedName qualifiedName = new CooperateQualifiedNameProvider().apply((EObject) result);
			return Optional.fromNullable(qualifiedName == null ? null : qualifiedName.toString());
		}
		List<INode> nodes = NodeModelUtils.findNodesForFeature(context, feature);
		if (!nodes.isEmpty()) {
			return Optional.fromNullable(NodeModelUtils.getTokenText(nodes.get(0)));
		}
		return Optional.absent();
	}

	private static Optional<String> makeWildcard(String importName) {
		return makeWildcard(Optional.fromNullable(importName));
	}

	private static Optional<String> makeWildcard(Optional<String> importName) {
		if (importName.isPresent()) {
			return Optional.of(importName.get() + WILDCARD_POSTFIX);
		}
		return Optional.absent();
	}

}
