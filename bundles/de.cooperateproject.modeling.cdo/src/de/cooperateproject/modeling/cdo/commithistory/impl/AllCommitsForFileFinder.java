package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class AllCommitsForFileFinder extends AllCommitsFinderBase {

	private final IFile launcherFile;
	
	public AllCommitsForFileFinder(IFile launcherFile) {
		super(launcherFile.getProject());
		this.launcherFile = launcherFile;
	}
	
	@Override
	protected Iterable<CDOID> determineCrossReferencedResourceIds() throws IOException {
		URI txtResourceURI = getTextualResourceURI();
		CDOID umlID = getResourceID(ModelNamingConventions.getUMLFromTextualURI(txtResourceURI));
		return Arrays.asList(umlID);
	}

	@Override
	protected Iterable<CDOID> determineResourceIds() throws IOException {
		URI txtResourceURI = getTextualResourceURI();
		CDOID resourceID = getResourceID(txtResourceURI);
		return Arrays.asList(resourceID);
	}

	protected URI getTextualResourceURI() throws IOException {
		try {
			Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), launcherFile);
			TextualConcreteSyntaxModel txtModel = launcherModel.getConcreteSyntaxModel(TextualConcreteSyntaxModel.class);
			return txtModel.getRootElement().eResource().getURI();			
		} catch (ConcreteSyntaxTypeNotAvailableException e) {
			throw new IOException(e);
		}
	}
	
}
