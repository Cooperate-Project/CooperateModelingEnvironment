package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

import com.google.common.base.Optional;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateSimpleLocalScopeProvider;

public class ClsCooperateSimpleScopeProvider extends CooperateSimpleLocalScopeProvider {

	private static final NameSwitch NAME_SWITCH = new NameSwitch();
	
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
		}
		return Optional.absent();
	}

}
