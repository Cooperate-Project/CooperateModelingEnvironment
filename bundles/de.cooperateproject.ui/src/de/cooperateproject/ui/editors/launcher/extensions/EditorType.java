package de.cooperateproject.ui.editors.launcher.extensions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.google.common.collect.Sets;

import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;

public enum EditorType {

	GRAPHICAL(Arrays.asList(GraphicalConcreteSyntaxModel.class)),
	TEXTUAL(Arrays.asList(TextualConcreteSyntaxModel.class));
	
	private final Set<Class<? extends ConcreteSyntaxModel>> supportedSyntaxModels;
	
	private EditorType(Iterable<Class<? extends ConcreteSyntaxModel>> supportedSyntaxModels) {
		this.supportedSyntaxModels = Sets.newHashSet(supportedSyntaxModels);
	}

	public Collection<Class<? extends ConcreteSyntaxModel>> getSupportedSyntaxModels() {
		return Collections.unmodifiableCollection(supportedSyntaxModels);
	}
	
	
}
