package de.cooperateproject.modeling.textual.common.outline;

import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum UMLImage {

    ACTOR("obj16/Actor.gif"),
    ASSOCIATION("obj16/Association.gif"),
    ASSOCIATION_COMPOSITE("obj16/Association_composite.gif"),
    ASSOCIATION_SHARED("obj16/Association_shared.gif"),
    CLASS("obj16/Class.gif"),
    COMPONENT("obj16/Component.gif"),
    COMMENT("obj16/Comment.gif"),
    EXTEND("obj16/Extend.gif"),
    EXTENSIONPOINT("obj16/ExtensionPoint.gif"),
    GENERALIZATION("obj16/Generalization.gif"),
    INCLUDE("obj16/Include.gif"),
    INTERFACE("obj16/Interface.gif"),
    INTERFACE_REALIZATION("obj16/InterfaceRealization.gif"),
    MODEL("obj16/Model.gif"),
    OPERATION("obj16/Operation.gif"),
    PACKAGE("obj16/Package.gif"),
    PACKAGE_IMPORT("obj16/PackageImport.gif"),
    PARAMETER("obj16/Parameter.gif"),
    PROPERTY("obj16/Property.gif"),
    USECASE("obj16/UseCase.gif"),
    VISIBILITY_PACKAGE("ovr16/VisibilityKind_package.gif"),
    VISIBILITY_PRIVATE("ovr16/VisibilityKind_private.gif"),
    VISIBILITY_PROTECTED("ovr16/VisibilityKind_protected.gif"),
    VISIBILITY_PUBLIC("ovr16/VisibilityKind_public.gif");

    private static final Logger LOGGER = LoggerFactory.getLogger(UMLImage.class);
    private final String imgPath;

    private UMLImage(String imgPath) {
        this.imgPath = imgPath;
    }

    public Image getImage() {
        return getUMLImage(imgPath);
    }

    private static Image getUMLImage(String imageName) {
        Bundle bundle = Platform.getBundle("org.eclipse.uml2.uml.edit");
        URL fileURL = bundle.getEntry("icons/full/" + imageName);
        try {
            URL resolvedFileURL = FileLocator.toFileURL(fileURL);
            URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
            Image image = new Image(null, resolvedURI.getPath());
            return image;
        } catch (Exception e) {
            LOGGER.error("Could not load the requested UML icon \"{}\".", imageName, e);
        }
        return null;
    }
}
