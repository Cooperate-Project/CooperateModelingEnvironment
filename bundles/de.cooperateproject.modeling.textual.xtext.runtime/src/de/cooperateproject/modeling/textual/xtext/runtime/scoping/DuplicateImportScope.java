package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class DuplicateImportScope extends ImportScope {

	private final EClass type;
	private final Collection<ImportNormalizer> normalizers;
	
	public DuplicateImportScope(List<ImportNormalizer> namespaceResolvers, IScope parent, ISelectable importFrom,
			EClass type, boolean ignoreCase) {
		super(namespaceResolvers, parent, importFrom, type, ignoreCase);
		this.normalizers = namespaceResolvers;
		this.type = type;
	}

	@Override
	protected Iterable<IEObjectDescription> getAliasedElements(Iterable<IEObjectDescription> candidates) {
		Multimap<QualifiedName, IEObjectDescription> keyToDescription = LinkedHashMultimap.create();
		Multimap<QualifiedName, ImportNormalizer> keyToNormalizer = HashMultimap.create();

		for (IEObjectDescription imported : candidates) {
			QualifiedName fullyQualifiedName = imported.getName();
			for (ImportNormalizer normalizer : normalizers) {
				QualifiedName alias = normalizer.deresolve(fullyQualifiedName);
				if (alias != null) {
					QualifiedName key = alias;
					if (isIgnoreCase()) {
						key = key.toLowerCase();
					}
					keyToDescription.put(key, new AliasedEObjectDescription(alias, imported));
					keyToNormalizer.put(key, normalizer);
				}
			}
		}

		return keyToDescription.values();
	}
	
	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByName(QualifiedName name) {
		List<IEObjectDescription> result = newArrayList();
		ISelectable importFrom = getImportFrom();
		for (ImportNormalizer normalizer : normalizers) {
			final QualifiedName resolvedName = normalizer.resolve(name);
			if (resolvedName != null) {
				Iterable<IEObjectDescription> resolvedElements = importFrom.getExportedObjects(type, resolvedName,
						isIgnoreCase());
				for (IEObjectDescription resolvedElement : resolvedElements) {
					QualifiedName alias = normalizer.deresolve(resolvedElement.getName());
					if (alias == null)
						throw new IllegalStateException("Couldn't deresolve " + resolvedElement.getName()
								+ " with import " + normalizer);
					final AliasedEObjectDescription aliasedEObjectDescription = new AliasedEObjectDescription(alias,
							resolvedElement);
					result.add(aliasedEObjectDescription);
				}
			}
		}
		return result;
	}
}
