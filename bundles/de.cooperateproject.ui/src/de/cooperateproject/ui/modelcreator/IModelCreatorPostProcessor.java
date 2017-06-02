package de.cooperateproject.ui.modelcreator;

import org.eclipse.emf.ecore.EObject;

/**
 * Post processor for created models.
 * 
 * This processor is only called when creating models based on UI actions (e.g. using a wizard). It is NOT called when
 * creating arbitrary
 * models.
 */
public interface IModelCreatorPostProcessor {

    /**
     * Post processes the given model.
     * 
     * @param rootElement
     *            The root element of the model to be processed.
     */
    void postProcessModel(EObject rootElement);

}
