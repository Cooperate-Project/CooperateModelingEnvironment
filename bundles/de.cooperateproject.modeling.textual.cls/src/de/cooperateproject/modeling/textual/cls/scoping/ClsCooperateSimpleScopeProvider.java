package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.naming.NameSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateSimpleLocalScopeProvider;

public class ClsCooperateSimpleScopeProvider extends CooperateSimpleLocalScopeProvider {

    @FunctionalInterface
    private interface EReferenceBasedNormalizerCreator {
        Collection<ImportNormalizer> createNormalizers(EObject context, EReference ref);
    }

    private static final NameSwitch NAME_SWITCH = new NameSwitch();
    private final Map<EReference, EReferenceBasedNormalizerCreator> normalizerCreators = Collections.emptyMap();

    @Override
    protected String getUnqualifiedName(EObject context) {
        return NAME_SWITCH.doSwitch(context);
    }

    @Override
    protected List<ImportNormalizer> getRootNormalizers(EObject rootObject) {
        Validate.isInstanceOf(ClassDiagram.class, rootObject);
        return Collections.emptyList();
    }

    @Override
    protected Collection<ImportNormalizer> getImportNormalizers(List<ImportNormalizer> parentNormalizers,
            EObject context) {

        String name = NAME_SWITCH.doSwitch(context);
        if (name == null) {
            return Collections.emptyList();
        }
        QualifiedName unqualifiedName = QualifiedName.create(name);

        Collection<ImportNormalizer> normalizers = Lists.newArrayList();
        if (parentNormalizers.isEmpty()) {
            normalizers.add(createNormalizer(name));
        }
        normalizers.addAll(createNormalizers(parentNormalizers, unqualifiedName));

        if (context instanceof de.cooperateproject.modeling.textual.cls.cls.Package) {
            de.cooperateproject.modeling.textual.cls.cls.Package pkg = (de.cooperateproject.modeling.textual.cls.cls.Package) context;
            List<QualifiedName> packageImports = pkg.getPackageImports().stream()
                    .map(ClsCooperateSimpleScopeProvider::getPackageImportText).filter(Optional::isPresent)
                    .map(Optional::get).map(CooperateSimpleLocalScopeProvider::createQualifiedName)
                    // .forEach(createNormalizer(name).resolve(r))
                    .collect(Collectors.toList());
            Collection<ImportNormalizer> packageImportNormalizers = packageImports.stream().map(QualifiedName::toString)
                    .map(CooperateSimpleLocalScopeProvider::createNormalizer).collect(Collectors.toList());
            normalizers.addAll(packageImportNormalizers);
            packageImportNormalizers = packageImports.stream()
                    .flatMap(n -> createNormalizers(parentNormalizers, n).stream()).collect(Collectors.toList());
            normalizers.addAll(packageImportNormalizers);
        }

        return normalizers;
    }

    private Collection<ImportNormalizer> createNormalizers(Collection<ImportNormalizer> parentNormalizers,
            QualifiedName name) {
        return parentNormalizers.stream().map(n -> n.resolve(name).toString())
                .map(CooperateSimpleLocalScopeProvider::createNormalizer).collect(Collectors.toList());
    }

    private static Optional<String> getPackageImportText(
            de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport pkgImport) {

        Object result = pkgImport.eGet(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT,
                false);

        List<INode> nodes = NodeModelUtils.findNodesForFeature(pkgImport,
                TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
        if (result != null) {
            Package umlPackage = ((PackageImport) result).getImportedPackage();
            if (umlPackage != null)
                // TODO use qualified name provider for this operation
                return Optional.of(umlPackage.getQualifiedName().replace(umlPackage.separator(), "."));

        }

        if (!nodes.isEmpty()) {// TODO: should alway return absolut import path, so we should resolve that text with the
                               // parent
            return Optional.fromNullable(NodeModelUtils.getTokenText(nodes.get(0)));
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

}
