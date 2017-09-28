package de.cooperateproject.modeling.textual.sequence.ui.modelcreator.postprocessor;

import java.util.Optional;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.ui.modelcreator.ISupplementaryModelCreator;
import de.cooperateproject.ui.modelcreator.ModelCreator;

public class SequenceIntermediateModelCreator implements ISupplementaryModelCreator {

    @Override
    public Optional<CDOResource> createSupplementaryModels(CDOTransaction transaction, CDOResourceFolder folder,
            String modelName, String diagramName, DiagramTypes diagramType) {
        if (diagramType != DiagramTypes.SEQUENCE) return Optional.empty();
        
        Resource gfxRes = ModelCreator.getOrCreateCDOResource(transaction, folder, modelName + ".notation"); 
        URI textualURI = ModelNamingConventions.getTextualFromGraphicalURI(gfxRes.getURI(), diagramName, "sequenceintermediate");
        
        return Optional.of(ModelCreator.getOrCreateCDOResource(transaction, folder, textualURI.lastSegment()));
        
    }

}
