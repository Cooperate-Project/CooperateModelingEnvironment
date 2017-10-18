package de.cooperateproject.modeling.textual.common.outline

import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
import org.eclipse.uml2.uml.VisibilityKind
import org.eclipse.swt.graphics.Image
import org.eclipse.jface.viewers.DecorationOverlayIcon
import org.eclipse.jface.viewers.IDecoration
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.uml2.uml.PrimitiveType
import org.eclipse.xtext.naming.IQualifiedNameProvider

class CooperateOutlineLabelProvider extends DefaultEObjectLabelProvider {

    static val visibilityMap = #{VisibilityKind.PUBLIC -> UMLImage.VISIBILITY_PUBLIC.image,
        VisibilityKind.PRIVATE -> UMLImage.VISIBILITY_PRIVATE.image,
        VisibilityKind.PROTECTED -> UMLImage.VISIBILITY_PROTECTED.image,
        VisibilityKind.PACKAGE -> UMLImage.VISIBILITY_PACKAGE.image}

    @Inject
    IQualifiedNameProvider qualifiedNameProvider;
    
    @Inject
    new(AdapterFactoryLabelProvider delegate) {
        super(delegate)
    }

    def text(NamedElement ele) {
        ele.name
    }

    def text(PackageImport ele) {
        ele.referencedElement.importedPackage.name;
    }

    def image(PackageImport ele) {
        UMLImage.PACKAGE_IMPORT.image
    }

    def text(Comment ele) {
        return "note" + " : " + ele.body
    }

    def image(Comment ele) {
        return UMLImage.COMMENT.image
    }

    def text(Cardinality cardinality) {
        var lowerString = cardinality.lowerBound.convert
        var upperString = cardinality.upperBound.convert

        if (cardinality.lowerBound >= 0 &&
            (cardinality.upperBound > cardinality.lowerBound || cardinality.upperBound < 0)) {
            return lowerString + ".." + upperString
        }
        return lowerString
    }

    def text(PrimitiveType type) {
        return qualifiedNameProvider.getFullyQualifiedName(type).toString;
    }

    def decorate(Image img, VisibilityKind visibility) {
        if (visibility === null) {
            return img
        }
        val visibilityImage = visibilityMap.get(visibility)
        val imgDescriptor = new DecorationOverlayIcon(img, convertToImageDescriptor(visibilityImage),
            IDecoration.BOTTOM_RIGHT)
        imgDescriptor.createImage
    }

    private static def convert(int value) {
        if (value < 0) {
            return "*"
        }
        return value.toString
    }
}
