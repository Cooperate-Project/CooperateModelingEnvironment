package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.ecore.resource.Resource;

public interface IDerivedStateResourceHandlerFactory {

    IDerivedStateHandler create(Resource r);

}
