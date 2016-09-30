package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public abstract class CooperateSimpleLocalScopeProvider extends SimpleLocalScopeProvider {

	public interface ImportNormalizerProducer {
		public Collection<ImportNormalizer> createNormalizer(Collection<ImportNormalizer> parentNormalizers, EObject currentObject);
	}
	
	protected static final String QUALIFIED_NAME_SPLIT_REGEX = "\\.";

	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope baseScope = super.getScope(context, reference);
		List<ImportNormalizer> normalizers = getImportNormalizers(context);
		normalizers.addAll(getAdditionalImportNormalizers(context, reference));
		normalizers = filterDuplicatedNormalizers(normalizers);
		return createImportScope(normalizers, baseScope, reference);
	}

	private List<ImportNormalizer> filterDuplicatedNormalizers(List<ImportNormalizer> normalizers) {
		return normalizers
				.stream().collect(Collectors.groupingBy(ImportNormalizer::getImportedNamespacePrefix,
						LinkedHashMap::new, Collectors.toSet()))
				.values().stream().flatMap(v -> v.stream()).collect(Collectors.toList());
	}

	protected Collection<? extends ImportNormalizer> getAdditionalImportNormalizers(EObject context,
			EReference reference) {
		return Collections.emptyList();
	}

	protected List<ImportNormalizer> getImportNormalizers(EObject context) {
		EObject parentContext = context.eContainer();
		if (parentContext == null) {
			return getRootNormalizers(context);
		}

		List<ImportNormalizer> parentNormalizers = getImportNormalizers(parentContext);
		Collection<ImportNormalizer> newNormalizers = getImportNormalizers(parentNormalizers, context);
		return Lists.newArrayList(Iterables.concat(parentNormalizers, newNormalizers));
	}
	
	protected abstract Collection<ImportNormalizer> getImportNormalizers(List<ImportNormalizer> parentNormalizers,
			EObject context);

	protected abstract String getUnqualifiedName(EObject context);

	protected abstract List<ImportNormalizer> getRootNormalizers(EObject rootObject);

	protected static ImportNormalizer createNormalizer(String name) {
		QualifiedName qn = createQualifiedName(name);
		return new ImportNormalizer(qn, true, false);
	}
	
	protected static QualifiedName createQualifiedName(String name) {
		String[] segments = name.split(QUALIFIED_NAME_SPLIT_REGEX);
		return QualifiedName.create(segments);
	}

	protected IScope createImportScope(List<ImportNormalizer> normalizers, IScope baseScope, EReference reference) {
		return new DuplicateImportScope(normalizers, baseScope, null, reference.getEReferenceType(), false);
	}

}
