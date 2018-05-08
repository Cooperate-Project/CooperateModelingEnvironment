package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;

public class AllCommitsForUMLModelFinder extends AllCommitsFinderBase {

    private final URI umlModelURI;
    
    public AllCommitsForUMLModelFinder(URI umlModelURI) {
        super(determineProject(umlModelURI));
        this.umlModelURI = umlModelURI;
    }

    private static IProject determineProject(URI umlModelURI) {
        String projectName = ModelNamingConventions.getProjectNameFromUMLURI(umlModelURI);
        return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    }

    @Override
    protected Iterable<CDOID> determineCrossReferencedResourceIds() throws IOException {
        CDOID umlId = getResourceID(umlModelURI);
        return Arrays.asList(umlId);
    }

    @Override
    protected Iterable<CDOID> determineResourceIds() throws IOException {
        // rough approximation: We assume that all relevant changes happen in the graphical diagram as well
        URI notationResourceURI = ModelNamingConventions.getGraphicalResourceFromUMLURI(umlModelURI);
        return Arrays.asList(getResourceID(notationResourceURI));
    }

}