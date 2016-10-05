package de.cooperateproject.ui.wizards.modelnew;

import java.util.Arrays;
import java.util.Optional;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;

public class ModelContentProvider implements ITreeContentProvider {

	public static interface ContentNode {
		public String getName();
		public Optional<ContentNode> getParent();
		public ContentNode[] getChildren();
	}
	
	public static class ProjectNode implements ContentNode {
		private final IProject project;
		private final ContentNode[] children;

		public ProjectNode(IProject project, ContentNode[] children) {
			super();
			this.project = project;
			this.children = children;
		}

		@Override
		public String getName() {
			return project.getName();
		}
		
		public IProject getProject() {
			return project;
		}

		@Override
		public ContentNode[] getChildren() {
			return children;
		}

		@Override
		public Optional<ContentNode> getParent() {
			return Optional.empty();
		}
		
	}
	
	public static class ModelNode implements ContentNode {
		private final String name;
		private ContentNode parent;
		
		public ModelNode(String name) {
			super();
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public ContentNode[] getChildren() {
			return ArrayUtils.toArray();
		}

		public void setParent(ContentNode parent) {
			this.parent = parent;
		}
		
		@Override
		public Optional<ContentNode> getParent() {
			return Optional.ofNullable(parent);
		}
		
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof SelectedNamesDTO) {
			return createContentNodes((SelectedNamesDTO)inputElement);
		}
		return ArrayUtils.EMPTY_OBJECT_ARRAY;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ContentNode) {
			ContentNode node = (ContentNode)parentElement;
			return node.getChildren();
		}
		return ArrayUtils.EMPTY_OBJECT_ARRAY;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ContentNode) {
			return !ArrayUtils.isEmpty(((ContentNode)element).getChildren());
		}
		return false;
	}
	
	private static Object[] createContentNodes(SelectedNamesDTO dto) {
		return dto.getAvailableProjects().stream().map(ModelContentProvider::createProjectNode).toArray();
	}
	
	private static ProjectNode createProjectNode(IProject project) {
		ModelNode[] modelNodes = createModelNodes(project);
		ProjectNode node = new ProjectNode(project, modelNodes);
		Arrays.stream(modelNodes).forEach(n -> n.setParent(node));
		return node;
	}
	
	private static ModelNode[] createModelNodes(IProject project) {
		String resourceName = project.getName(); //TODO this should not be located here but at a central location
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
		try {
			CDOView view = session.openView();
			try {
				if (!view.hasResource(resourceName)) {
					return ArrayUtils.toArray();
				}
				CDOResourceFolder cdoFolder = view.getResourceFolder(resourceName);
				return cdoFolder.getNodes().stream().filter(n -> "notation".equals(n.getExtension())).filter(CDOResource.class::isInstance).map(r -> new ModelNode(getBaseName(r))).toArray(ModelNode[]::new);
			} finally {
				IOUtil.closeSilent(view);
			}
		} finally {
			CDOConnectionManager.getInstance().releaseSession(session);
		}
	}
	
	private static String getBaseName(CDOResourceNode r) {
		return r.getURI().trimFileExtension().lastSegment();
	}

}
