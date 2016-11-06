package de.cooperateproject.ui.wizards.modelnew;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.databinding.observable.list.ObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import de.cooperateproject.ui.nature.NatureUtils;
import de.cooperateproject.ui.util.IValidateable;
import de.cooperateproject.ui.wizards.modelnew.AtomicModelNameProcessor.ModelName;

public class SelectedNamesDTO implements IValidateable {
	
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	private final ObservableList<IProject> availableProjects = createProjectList();
	private ModelName selectedModelName;
	private String selectedDiagramName;
	
	private ObservableList<IProject> createProjectList() {
		List<IProject> tmp = Arrays.stream(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(IProject::isOpen).filter(SelectedNamesDTO::hasMatchingNature).collect(Collectors.toList());
		return new WritableList<IProject>(tmp, IProject.class);
	}
	
	public ModelName getSelectedModelName() {
		return selectedModelName;
	}
	
	public void setSelectedModelName(ModelName modelName) {
		ModelName oldValue = this.selectedModelName;
		this.selectedModelName = modelName;
		this.pcs.firePropertyChange("selectedModelName", oldValue, selectedModelName);
	}
	
	public String getSelectedDiagramName() {
		return selectedDiagramName;
	}
	
	public void setSelectedDiagramName(String diagramName) {
		String oldValue = this.selectedDiagramName;
		this.selectedDiagramName = diagramName;
		this.pcs.firePropertyChange("selectedDiagramName", oldValue, selectedDiagramName);
	}
	
	public Collection<IProject> getAvailableProjects() {
		return availableProjects;
	}
	
	@Override
	public boolean isValid() {
		return selectedModelName != null && selectedDiagramName != null;
	}
	
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
	
	private static boolean hasMatchingNature(IProject project) {
		try {
			return NatureUtils.hasCooperateNature(project);
		} catch (CoreException e) {
			return false;
		}
	}
	
}
