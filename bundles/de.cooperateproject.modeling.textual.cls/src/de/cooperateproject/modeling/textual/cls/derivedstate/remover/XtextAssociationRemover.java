package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorExtension;

/**
 * State remover for Xtext associations.
 */
public class XtextAssociationRemover implements IAtomicStateProcessorExtension<XtextAssociation> {

    @Override
    public Boolean apply(XtextAssociation object) {
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
