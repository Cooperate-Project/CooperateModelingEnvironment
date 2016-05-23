package de.cooperateproject.ui.cdo.util;

import java.util.Arrays;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.revision.CDORevisionCache;
import org.eclipse.emf.cdo.common.revision.CDORevisionUtil;
import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.explorer.repositories.CDORepositoryManager;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.container.IPluginContainer;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

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
	
	public static String createRepositoryLabel(IProject project) {
		return String.format("%s - CooperateRepository", project.getName());
	}
	
	public static CDOCheckout createCheckout(CDORepository repo) {
		Properties checkoutProperties = new Properties();
		
		checkoutProperties.put("repository", repo.getID());
		checkoutProperties.put("type", "online-transactional");
		checkoutProperties.put("readOnly", "false");
		checkoutProperties.put("branchID", "0");
		checkoutProperties.put("label", "qqqq123");
		checkoutProperties.put("timeStamp", Long.toString(CDORevision.UNSPECIFIED_VERSION));
		
		return CDOExplorerUtil.getCheckoutManager().addCheckout(checkoutProperties);
	}
}
