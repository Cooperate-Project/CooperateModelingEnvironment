package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

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

	protected static final String QUALIFIED_NAME_SPLIT_REGEX = "\\.";
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope baseScope = super.getScope(context, reference);
		List<ImportNormalizer> normalizers = getImportNormalizers(context);
		return new DuplicateImportScope(normalizers, baseScope, null, reference.getEReferenceType(), false);
	}

	protected List<ImportNormalizer> getImportNormalizers(EObject context) {
		EObject parentContext = context.eContainer();
		if (parentContext == null) {
			return getRootNormalizers(context);
		}

		List<ImportNormalizer> parentNormalizers = getImportNormalizers(parentContext);
		String unqualifiedName = getUnqualifiedName(context);
		if (unqualifiedName == null) {
			return parentNormalizers;
		}
		
		QualifiedName unqualifiedContextName = QualifiedName.create(getUnqualifiedName(context));
		List<ImportNormalizer> newNormalizers = parentNormalizers.stream().map(n -> n.resolve(unqualifiedContextName))
				.map(n -> new ImportNormalizer(n, true, false)).collect(Collectors.toList());
		
		return Lists.newArrayList(Iterables.concat(parentNormalizers, newNormalizers));
	}

	protected abstract String getUnqualifiedName(EObject context);
	
	protected abstract List<ImportNormalizer> getRootNormalizers(EObject rootObject);

	protected static ImportNormalizer createNormalizer(String name) {
		String[] segments = name.split(QUALIFIED_NAME_SPLIT_REGEX);
		QualifiedName qn = QualifiedName.create(segments);
		return new ImportNormalizer(qn, true, false);
	}
	
}
