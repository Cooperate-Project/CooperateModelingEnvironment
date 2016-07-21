package de.cooperateproject.cdo.util.utils;

import java.util.Arrays;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.revision.CDORevisionCache;
import org.eclipse.emf.cdo.common.revision.CDORevisionUtil;
import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository.VersioningMode;
import org.eclipse.emf.cdo.explorer.repositories.CDORepositoryManager;
import org.eclipse.emf.cdo.internal.explorer.repositories.CDORepositoryImpl;
import org.eclipse.emf.cdo.internal.explorer.repositories.RemoteCDORepository;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

import de.cooperateproject.cdo.util.connection.CDOConnectionSettings;

public class CDOHelper {

	private CDOHelper() {
		// intentionally left blank
	}
	
	public static CDONet4jSession createSession(String host, int port, String repository) {
		String connectionString = String.format("tcp://%s:%d", host, port);
		IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, connectionString);

		CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
		sessionConfiguration.setConnector(connector);
		sessionConfiguration.setRepositoryName(repository);
		sessionConfiguration.setRevisionManager(CDORevisionUtil.createRevisionManager(CDORevisionCache.NOOP));

		return sessionConfiguration.openNet4jSession();
	}
	
	public static Optional<CDORepository> findRepository(IProject project) {
		final String repositoryLabel = createRepositoryLabel(project);
		CDORepositoryManager repositoryManager = CDOExplorerUtil.getRepositoryManager();
		return Iterables.tryFind(Arrays.asList(repositoryManager.getRepositories()),
				r -> repositoryLabel.equals(r.getLabel()));
	}
	
	private static String createRepositoryLabel(IProject project) {
		return String.format("%s - CooperateRepository", project.getName());
	}
	
	public static CDOCheckout createCheckout(CDORepository repo) {
		return createCheckout(repo, 0);
	}
	
	public static CDOCheckout createCheckout(CDORepository repo, int branchID) {
		Properties checkoutProperties = new Properties();
		
		checkoutProperties.put("repository", repo.getID());
		checkoutProperties.put("type", "online-transactional");
		checkoutProperties.put("readOnly", "false");
		checkoutProperties.put("branchID", Long.toString(branchID));
		checkoutProperties.put("label", createCheckoutLabel());
		checkoutProperties.put("timeStamp", Long.toString(CDORevision.UNSPECIFIED_VERSION));
		
		return CDOExplorerUtil.getCheckoutManager().addCheckout(checkoutProperties);
	}
	
	public static CDORepository createRepositoryFor(IProject project, CDOConnectionSettings settings) {
		String repositoryLabel = createRepositoryLabel(project);
		return createRepositoryFor(repositoryLabel, settings);
	}
	
	public static CDORepository createRepositoryFor(String repositoryLabel, CDOConnectionSettings settings) {
		CDORepositoryManager repositoryManager = CDOExplorerUtil.getRepositoryManager();
		Properties repositoryProperties = createProperties(repositoryLabel, settings);
		return repositoryManager.addRepository(repositoryProperties);
	}
	
	public static void deleteRepositoryFor(IProject project) {
		String repositoryLabel = createRepositoryLabel(project);
		CDORepositoryManager repositoryManager = CDOExplorerUtil.getRepositoryManager();
		Arrays.asList(repositoryManager.getRepositories()).stream().filter(r -> repositoryLabel.equals(r.getLabel())).forEach(CDOHelper::delete);
	}
	
	public static void delete(CDORepository repository) {
		Arrays.asList(repository.getCheckouts()).stream().forEach(CDOHelper::delete);
		repository.disconnect();
		repository.delete(true);
	}
	
	public static void delete(CDOCheckout checkout) {
		checkout.close();
		checkout.delete(true);
	}
	
	private static Properties createProperties(String repositoryLabel, CDOConnectionSettings settings) {
		Properties repositoryProperties = new Properties();
		repositoryProperties.put("type", CDORepository.TYPE_REMOTE);
		repositoryProperties.put(CDORepositoryImpl.PROP_NAME, settings.getRepo());
		repositoryProperties.put(CDORepositoryImpl.PROP_VERSIONING_MODE, VersioningMode.Branching.name());
		repositoryProperties.put(CDORepositoryImpl.PROP_LABEL, repositoryLabel);
		repositoryProperties.put(RemoteCDORepository.PROP_CONNECTOR_DESCRIPTION,
				settings.getHost() + ":" + settings.getPort());
		repositoryProperties.put(RemoteCDORepository.PROP_CONNECTOR_TYPE, "tcp");
		return repositoryProperties;
	}
	
	private static String createCheckoutLabel() {
		return String.format("tmp_cooperate_%d", System.currentTimeMillis());
	}
}
