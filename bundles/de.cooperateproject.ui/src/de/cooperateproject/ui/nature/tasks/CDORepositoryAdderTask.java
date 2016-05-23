package de.cooperateproject.ui.nature.tasks;

import java.util.Arrays;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository.VersioningMode;
import org.eclipse.emf.cdo.explorer.repositories.CDORepositoryManager;
import org.eclipse.emf.cdo.internal.explorer.repositories.CDORepositoryImpl;
import org.eclipse.emf.cdo.internal.explorer.repositories.RemoteCDORepository;

import com.google.common.base.Optional;

import de.cooperateproject.ui.cdo.sessions.RepositoryManager;
import de.cooperateproject.ui.cdo.util.CDOHelper;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public class CDORepositoryAdderTask extends CooperateProjectBackgroundTask {

	protected CDORepositoryAdderTask(IProject project, ProjectPropertiesDTO properties) {
		super(project, properties);
	}

	@Override
	public void start() throws TaskException {
		addCDORepository();
	}

	@Override
	public void stop() {
		removeCDORepository();
	}

	private void addCDORepository() {
		Optional<CDORepository> repository = findRepository();
		if (repository.isPresent()) {
			CDORepository repo = repository.get();
			if (matchesRequirements(repo)) {
				return;
			}
			deleteRepository(repo);
		}
		CDORepository newRepository = createAndAddRepository(getProperties());
		RepositoryManager.getInstance().register(newRepository, getProject());
	}

	private Optional<CDORepository> findRepository() {
		return CDOHelper.findRepository(getProject());
	}

	private boolean matchesRequirements(CDORepository repo) {
		Properties actualProperties = createProperties(repo);
		Properties expectedProperties = createProperties(createRepositoryLabel(), getProperties());
		return expectedProperties.equals(actualProperties);
	}

	private String createRepositoryLabel() {
		return CDOHelper.createRepositoryLabel(getProject());
	}

	private CDORepository createAndAddRepository(ProjectPropertiesDTO projectProperties) {
		CDORepositoryManager repositoryManager = CDOExplorerUtil.getRepositoryManager();
		Properties repositoryProperties = createProperties(createRepositoryLabel(), projectProperties);
		return repositoryManager.addRepository(repositoryProperties);
	}

	private void removeCDORepository() {
		Optional<CDORepository> repository = findRepository();
		if (repository.isPresent()) {
			deleteRepository(repository.get());
		}
	}

	private static void deleteRepository(CDORepository repo) {
		RepositoryManager.getInstance().unregister(repo);
		repo.disconnect();
		Arrays.asList(repo.getCheckouts()).stream().forEach(c -> c.delete(true));
		repo.delete(true);
	}

	private static Properties createProperties(String repositoryLabel, ProjectPropertiesDTO projectProperties) {
		Properties repositoryProperties = new Properties();
		repositoryProperties.put("type", CDORepository.TYPE_REMOTE);
		repositoryProperties.put(CDORepositoryImpl.PROP_NAME, projectProperties.getCdoRepo());
		repositoryProperties.put(CDORepositoryImpl.PROP_VERSIONING_MODE, VersioningMode.Branching.name());
		repositoryProperties.put(CDORepositoryImpl.PROP_LABEL, repositoryLabel);
		repositoryProperties.put(RemoteCDORepository.PROP_CONNECTOR_DESCRIPTION,
				projectProperties.getCdoHost() + ":" + projectProperties.getCdoPort());
		repositoryProperties.put(RemoteCDORepository.PROP_CONNECTOR_TYPE, "tcp");
		return repositoryProperties;
	}

	private static Properties createProperties(CDORepository repository) {
		Properties repositoryProperties = new Properties();
		repositoryProperties.put("type", repository.getType());
		repositoryProperties.put(CDORepositoryImpl.PROP_NAME, repository.getName());
		repositoryProperties.put(CDORepositoryImpl.PROP_VERSIONING_MODE, repository.getVersioningMode());
		repositoryProperties.put(CDORepositoryImpl.PROP_LABEL, repository.getLabel());
		if (repository instanceof RemoteCDORepository) {
			RemoteCDORepository remoteRepository = (RemoteCDORepository) repository;
			repositoryProperties.put(RemoteCDORepository.PROP_CONNECTOR_DESCRIPTION,
					remoteRepository.getConnectorDescription());
			repositoryProperties.put(RemoteCDORepository.PROP_CONNECTOR_TYPE, remoteRepository.getConnectorType());
		}
		return repositoryProperties;
	}

}
