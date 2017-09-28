package de.cooperateproject.ui.modelcreator;

import java.util.Optional;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.transaction.CDOTransaction;

import de.cooperateproject.modeling.common.types.DiagramTypes;

/**
 * Model creator for supplementary models.
 * 
 * This processor is called after the default models have been created by the Model Creator triggered through UI actions
 * (e.g. using a wizard). It is NOT called when creating arbitrary models.
 */
public interface ISupplementaryModelCreator {

    /**
     * Called to create the supplementary model.
     *
     */
    Optional<CDOResource> createSupplementaryModels(CDOTransaction transaction, CDOResourceFolder folder,
            String modelName, String diagramName, DiagramTypes diagramType);

}
