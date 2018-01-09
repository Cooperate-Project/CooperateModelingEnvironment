package de.cooperateproject.cdo.util.connection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.explorer.repositories.CDORepositoryManager;
import org.eclipse.emf.cdo.session.CDOSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import de.cooperateproject.cdo.util.connection.impl.CDOCheckoutPropertyConstants;
import de.cooperateproject.cdo.util.connection.impl.CDORepositoryPropertyConstants;

public enum CDOConnectionManager {

    INSTANCE;
    private static final Logger LOGGER = LoggerFactory.getLogger(CDOConnectionManager.class);
    private final BiMap<CDORepository, IProject> repositories = HashBiMap.create();
    private final BiMap<CDORepository, CDOSession> sessions = HashBiMap.create();

    public CDOSession acquireSession(IProject project) {
        synchronized (sessions) {
            LOGGER.trace("Acquirering session for {}", project.getName());
            CDORepository repository = getRepository(project);
            CDOSession session = repository.acquireSession();
            sessions.put(repository, session);
            return session;
        }
    }

    public CDOCheckout createCDOCheckout(IProject project, boolean createBranch, boolean readOnly) {
        CDORepository repository = getRepository(project);
        CDOSession session = acquireSession(project);
        try {
            int branchId = 0;
            if (createBranch) {
                CDOBranch newBranch = createRandomBranchFromMain(session);
                branchId = newBranch.getID();
            }
            return createCheckout(repository, branchId, readOnly);
        } finally {
            releaseSession(session);
        }
    }

    public void deleteCDOCheckout(CDOCheckout checkout) {
        if (checkout.getRepository() != null) {
            delete(checkout);
        }
    }

    public static CDOConnectionManager getInstance() {
        return INSTANCE;
    }

    public Set<IProject> getProjects() {
        return new HashSet<>(repositories.values());
    }

    public void register(IProject project, CDOConnectionSettings settings) {
        synchronized (repositories) {
            if (!repositories.inverse().containsKey(project)) {
                deleteRepositoryFor(project);
                CDORepository repo = createRepositoryFor(project, settings);
                repo.connect();
                repositories.put(repo, project);
            }
        }
    }

    public void releaseSession(CDOSession session) {
        synchronized (sessions) {
            CDORepository repository = sessions.inverse().get(session);
            if (repository == null) {
                LOGGER.warn("Tried to release session for non existing repository.");
            } else {
                repository.releaseSession();
                LOGGER.trace("Released session for project {}.", repositories.get(repository).getName());
            }
        }
    }

    public void unregister(IProject project) {
        synchronized (repositories) {
            synchronized (sessions) {
                CDORepository repository = repositories.inverse().get(project);
                if (repository == null) {
                    return;
                }
                delete(repository);
                sessions.remove(repository);
                repositories.remove(repository);
            }
        }
    }

    private CDORepository getRepository(IProject project) throws IllegalStateException {
        synchronized (repositories) {
            CDORepository repository = repositories.inverse().get(project);
            if (repository == null) {
                throw new IllegalStateException("This project has not been registered yet.");
            }
            return repository;
        }
    }

    private static CDOCheckout createCheckout(CDORepository repo, int branchID, boolean readOnly) {
        Properties checkoutProperties = new Properties();

        checkoutProperties.put(CDOCheckoutPropertyConstants.REPOSITORY, repo.getID());
        checkoutProperties.put(CDOCheckoutPropertyConstants.TYPE,
                CDOCheckoutPropertyConstants.TYPE_ONLINE_TRANSACTIONAL);
        checkoutProperties.put(CDOCheckoutPropertyConstants.READ_ONLY,
                readOnly ? Boolean.TRUE.toString() : Boolean.FALSE.toString());
        checkoutProperties.put(CDOCheckoutPropertyConstants.BRANCH_ID, Long.toString(branchID));
        checkoutProperties.put(CDOCheckoutPropertyConstants.LABEL, createCheckoutLabel());
        checkoutProperties.put(CDOCheckoutPropertyConstants.TIMESTAMP, Long.toString(CDORevision.UNSPECIFIED_VERSION));

        return CDOExplorerUtil.getCheckoutManager().addCheckout(checkoutProperties);
    }

    private static String createCheckoutLabel() {
        return String.format("tmp_cooperate_%d", System.currentTimeMillis());
    }

    private static CDORepository createRepositoryFor(IProject project, CDOConnectionSettings settings) {
        String repositoryLabel = createRepositoryLabel(project);
        return createRepositoryFor(repositoryLabel, settings);
    }

    private static CDORepository createRepositoryFor(String repositoryLabel, CDOConnectionSettings settings) {
        CDORepositoryManager repositoryManager = CDOExplorerUtil.getRepositoryManager();
        Properties repositoryProperties = createProperties(repositoryLabel, settings);
        return repositoryManager.addRepository(repositoryProperties);
    }

    private static Properties createProperties(String repositoryLabel, CDOConnectionSettings settings) {
        Properties repositoryProperties = new Properties();
        repositoryProperties.put(CDORepositoryPropertyConstants.TYPE, CDORepositoryPropertyConstants.TYPE_REMOTE);
        repositoryProperties.put(CDORepositoryPropertyConstants.NAME, settings.getRepo());
        repositoryProperties.put(CDORepositoryPropertyConstants.VERSIONING_MODE,
                CDORepositoryPropertyConstants.VERSIONING_MODE_BRANCHING);
        repositoryProperties.put(CDORepositoryPropertyConstants.LABEL, repositoryLabel);
        repositoryProperties.put(CDORepositoryPropertyConstants.CONNECTOR_DESCRIPTION,
                settings.getHost() + ":" + settings.getPort());
        repositoryProperties.put(CDORepositoryPropertyConstants.CONNECTOR_TYPE,
                CDORepositoryPropertyConstants.CONNECTOR_TYPE_TCP);
        return repositoryProperties;
    }

    private static void deleteRepositoryFor(IProject project) {
        String repositoryLabel = createRepositoryLabel(project);
        CDORepositoryManager repositoryManager = CDOExplorerUtil.getRepositoryManager();
        Arrays.asList(repositoryManager.getRepositories()).stream().filter(r -> repositoryLabel.equals(r.getLabel()))
                .forEach(CDOConnectionManager::delete);
    }

    private static void delete(CDOCheckout checkout) {
        checkout.close();
        checkout.delete(true);
    }

    private static void delete(CDORepository repository) {
        Arrays.asList(repository.getCheckouts()).stream().forEach(CDOConnectionManager::delete);
        repository.disconnect();
        repository.delete(true);
    }

    private static String createRepositoryLabel(IProject project) {
        return String.format("%s - CooperateRepository", project.getName());
    }

    private static CDOBranch createRandomBranchFromMain(CDOSession session) {
        return session.getBranchManager().getMainBranch().createBranch(createRandomBranchName());
    }

    private static String createRandomBranchName() {
        return String.format("z_cooperate_%s_%s", System.currentTimeMillis(), RandomStringUtils.randomAlphanumeric(2));
    }
}
