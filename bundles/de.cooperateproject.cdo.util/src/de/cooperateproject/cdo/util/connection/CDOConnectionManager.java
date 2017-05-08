package de.cooperateproject.cdo.util.connection;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.session.CDOSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import de.cooperateproject.cdo.util.utils.CDOHelper;

public enum CDOConnectionManager {

    INSTANCE;
    private static final Logger LOGGER = LoggerFactory.getLogger(CDOConnectionManager.class);
    private final BiMap<CDORepository, IProject> repositories = HashBiMap.create();
    private final BiMap<CDORepository, CDOSession> sessions = HashBiMap.create();

    public static CDOConnectionManager getInstance() {
        return INSTANCE;
    }

    public void register(IProject project, CDOConnectionSettings settings) {
        synchronized (repositories) {
            if (!repositories.inverse().containsKey(project)) {
                CDOHelper.deleteRepositoryFor(project);
                CDORepository repo = CDOHelper.createRepositoryFor(project, settings);
                repo.connect();
                repositories.put(repo, project);
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
                CDOHelper.delete(repository);
                sessions.remove(repository);
                repositories.remove(repository);
            }
        }
    }

    public CDOSession acquireSession(IProject project) {
        synchronized (sessions) {
            LOGGER.trace("Acquirering session for {}", project.getName());
            CDORepository repository = getRepository(project);
            CDOSession session = repository.acquireSession();
            sessions.put(repository, session);
            return session;
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

    public CDOCheckout createCDOCheckout(IProject project, boolean createBranch) {
        CDORepository repository = getRepository(project);
        CDOSession session = acquireSession(project);
        try {
            int branchId = 0;
            if (createBranch) {
                CDOBranch newBranch = CDOHelper.createRandomBranchFromMain(session);
                branchId = newBranch.getID();
            }
            return CDOHelper.createCheckout(repository, branchId);
        } finally {
            releaseSession(session);
        }
    }

    public void deleteCDOCheckout(CDOCheckout checkout) {
        if (checkout.getRepository() != null) {
            CDOHelper.delete(checkout);
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

}
