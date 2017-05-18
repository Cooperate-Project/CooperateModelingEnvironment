package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State remover for Xtext associations.
 */
public class XtextAssociationRemover extends AtomicStateProcessorExtensionBase<XtextAssociation> {

    /**
     * Constructs the state remover.
     * 
     * @param clazz
     *            The class that this state remover can process.
     */
    public XtextAssociationRemover(Class<XtextAssociation> clazz) {
        super(XtextAssociation.class);
    }

    @Override
    protected Boolean applyTyped(XtextAssociation object) {
        object.getMemberEndCardinalities().clear();
        object.getMemberEndNames().clear();
        object.getMemberEndNavigabilities().clear();
        object.getMemberEndTypes().clear();
        return true;
    }

    @Override
    public Class<XtextAssociation> getSupportedType() {
        return XtextAssociation.class;
    }

}
