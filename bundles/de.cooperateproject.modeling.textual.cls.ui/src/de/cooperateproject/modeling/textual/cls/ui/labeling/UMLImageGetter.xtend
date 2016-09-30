package de.cooperateproject.modeling.textual.cls.ui.labeling;

import java.io.File
import java.io.IOException
import java.net.URI
import java.net.URISyntaxException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.swt.graphics.Image

class UMLImageGetter {
	
	public static def getUMLImage(String imagePath) {
		val bundle = Platform.getBundle("org.eclipse.uml2.uml.edit");
		val fileURL = bundle.getEntry("icons/full/obj16/" + imagePath);
		var File file = null;
		try {
			val resolvedFileURL = FileLocator.toFileURL(fileURL);

			// We need to use the 3-arg constructor of URI in order to properly escape file system chars
			val resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
			val image = new Image(null, resolvedURI.path)
			return image
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}

